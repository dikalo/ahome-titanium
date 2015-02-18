package com.ait.toolkit.titanium.mobile.examples.myrecipes.client.ui.recipes;

import com.ait.toolkit.titanium.mobile.client.api.API;
import com.ait.toolkit.titanium.mobile.client.core.Debugger;
import com.ait.toolkit.titanium.mobile.client.core.events.ui.SearchBarEvent;
import com.ait.toolkit.titanium.mobile.client.core.events.ui.tableview.TableViewEvent;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.SearchBarHandler;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.TableViewHandler;
import com.ait.toolkit.titanium.mobile.client.ui.SearchBar;
import com.ait.toolkit.titanium.mobile.client.ui.TableView;
import com.ait.toolkit.titanium.mobile.examples.myrecipes.client.eventbus.EventBusUtil;
import com.ait.toolkit.titanium.mobile.examples.myrecipes.client.events.RecipesTableViewRowSelectEvent;

public class RecipesTable extends TableView {

    private static final RecipesTable INSTANCE = new RecipesTable();
    private boolean pulling = false;
    private boolean refreshing = false;

    public static RecipesTable get() {
        return INSTANCE;
    }

    private SearchBar searchBar;

    private RecipesTable() {

        searchBar = new SearchBar();
        searchBar.setShowCancel(true);
        searchBar.setHeight(43);
        searchBar.setTop(0);
        searchBar.addChangeHandler(new SearchBarHandler() {
            @Override
            public void onEvent(SearchBarEvent event) {
                API.get().info("User searching for : " + event.getValue());
            }
        });
        searchBar.addReturnHandler(new SearchBarHandler() {
            @Override
            public void onEvent(SearchBarEvent event) {
                searchBar.blur();
            }
        });
        searchBar.addCancelHandler(new SearchBarHandler() {
            @Override
            public void onEvent(SearchBarEvent event) {
                searchBar.blur();
            }
        });

        this.setWidth(320);
        this.setTop(0);
        this.setLeft(0);
        this.setBottom(0);
        this.setRight(0);
        this.setRowHeight(70);
        this.setSearch(searchBar);
        this.setFilterAttribute("filter");
        this.addRowSelectionHandler(new TableViewHandler() {
            @Override
            public void onEvent(TableViewEvent event) {
                EventBusUtil.get().fireEvent(new RecipesTableViewRowSelectEvent(event.getIndex()));
            }
        });
        this.setHeaderPullView(PullRefreshView.get());
        this.addScrollHandler(new TableViewHandler() {
            @Override
            public void onEvent(TableViewEvent event) {
                double offset = event.getContentOffset().getY();
                if (offset <= -80.0 && !pulling) {
                    pulling = true;
                    PullRefreshView.get().getArrowImage().setBackgroundImage("recipes/arrow-up.png");
                    PullRefreshView.get().getStatusLabel().setText("Release to refresh ...");
                } else if (pulling && offset > -80.0 && offset < 0) {
                    pulling = false;
                    PullRefreshView.get().getArrowImage().setBackgroundImage("recipes/arrow-down.png");
                    PullRefreshView.get().getStatusLabel().setText("Pull to Refresh ...");
                }
            }
        });
        this.addScrollEndHandler(new TableViewHandler() {
            @Override
            public void onEvent(TableViewEvent event) {
                Debugger.get().info("ScrollEnd event fired");
                // EventBusUtil.get().fireEvent(new JsonLoadStartEvent());
                // if (pulling && !refreshing && event.getContentOffset().getY()
                // <= -80.0) {
                // refreshing = true;
                // pulling = false;
                // PullRefreshView.get().getArrowImage().hide();
                // PullRefreshView.get().getActivityIndicator().show();
                // PullRefreshView.get().getStatusLabel().setText("Reloading Recipes ...");
                // TableViewEdgeInsets insets = new TableViewEdgeInsets();
                // insets.setTop(80);
                // RecipesTable.this.setContentInsets(insets, true);
                // // per default we use JSON loading
                //
                // }
            }
        });
    }
}
