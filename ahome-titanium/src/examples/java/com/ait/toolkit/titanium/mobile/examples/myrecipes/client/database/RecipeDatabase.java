package com.ait.toolkit.titanium.mobile.examples.myrecipes.client.database;

import java.util.ArrayList;
import java.util.List;

import com.ait.toolkit.titanium.mobile.client.core.Debugger;
import com.ait.toolkit.titanium.mobile.client.database.DB;
import com.ait.toolkit.titanium.mobile.client.database.Database;
import com.ait.toolkit.titanium.mobile.client.database.ResultSet;
import com.ait.toolkit.titanium.mobile.examples.myrecipes.client.data.Recipe;

/**
 * Handle Database transaction for the recipe app
 * 
 */
public class RecipeDatabase {

    private static final RecipeDatabase INSTANCE = new RecipeDatabase();

    private static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS favorites (ID INTEGER PRIMARY KEY AUTOINCREMENT, TITLE TEXT, LINK TEXT, DESCRIPTION TEXT)";
    private static final String DB_NAME = "mybd";
    private DB db;

    private RecipeDatabase() {

    }

    public static RecipeDatabase get() {
        return INSTANCE;
    }

    public void createDataBase() {
        db = Database.get().open(DB_NAME);
        db.execute(CREATE_TABLE);
    }

    public DB getDataBase() {
        return db;
    }

    public int insertFavorite(String title, String description, String link) {
        String sql = "INSERT INTO favorites (TITLE, DESCRIPTION, LINK) VALUES (";
        sql += "'" + title.replace("'", "''") + "',";
        sql += "'" + description.replace("'", "''") + "',";
        sql += "'" + link.replace("'", "''") + "')";
        Debugger.get().info("SQL : " + sql);
        db.execute(sql);
        return db.getLastInsertRowId();
    }

    public void deleteFavorite(int favoriteId) {
        String sql = "DELETE FROM favorites WHERE id = " + favoriteId;
        Debugger.get().info("SQL : " + sql);
        db.execute(sql);
    }

    public List<Recipe> getFavorites() {
        List<Recipe> recipes = new ArrayList<Recipe>();
        String sql = "SELECT * from favorites ORDER by title ASC";
        Debugger.get().info("SQL : " + sql);
        ResultSet resulSet = db.execute(sql);
        while (resulSet.isValidRow()) {
            String title = resulSet.fieldByName("title");
            String description = resulSet.fieldByName("description");
            String link = resulSet.fieldByName("link");
            recipes.add(new Recipe(title, link, description));
            resulSet.next();
        }
        resulSet.close();

        return recipes;
    }

}
