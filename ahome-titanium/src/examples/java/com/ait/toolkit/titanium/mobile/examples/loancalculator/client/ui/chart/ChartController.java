package com.ait.toolkit.titanium.mobile.examples.loancalculator.client.ui.chart;

import com.ait.toolkit.sencha.shared.client.data.Store;
import com.ait.toolkit.sencha.touch.charts.client.Legend;
import com.ait.toolkit.sencha.touch.charts.client.laf.Label;
import com.ait.toolkit.sencha.touch.charts.client.series.PieSeries;
import com.ait.toolkit.sencha.touch.charts.client.theme.Theme;
import com.ait.toolkit.sencha.touch.client.laf.Position;
import com.ait.toolkit.sencha.touch.client.ui.CartesianChart;
import com.ait.toolkit.sencha.touch.client.ui.ViewPort;
import com.ait.toolkit.titanium.mobile.client.api.API;
import com.ait.toolkit.titanium.mobile.client.core.events.TiEvent;
import com.ait.toolkit.titanium.mobile.examples.loancalculator.client.common.ChartValueHolder;

/**
 * Creates and update the pie Chart in the ChartPanel
 */
public class ChartController {

	private static CartesianChart chart;
	private static Store store;

	private ChartController() {

	}

	public static void createChart(TiEvent event) {
		ChartValueHolder value = ChartValueHolder.from(event.getEventData());
		API.get().info("Interest : " + value.getInterest() + ", Payments : " + value.getLoan());
		if (chart == null) {
			store = new Store(DataUtil.getValues(value));
			chart = new CartesianChart(store);
			chart.setTheme(Theme.DEFAULT);
			chart.setThemeCls("pie1");
			chart.setAnimate(true);
			chart.setInsetPadding(20);
			chart.setLegend(new Legend(Position.TOP));

			PieSeries series = new PieSeries();
			series.setField("value");
			series.setDonut(20);
			series.setShowInLegend(true);

			Label label = new Label();
			label.setField("name");
			series.setLabel(label);
			// series.setHi

			chart.setSeries(series);

			ChartPanel.get().add(chart);
			ViewPort.get().add(ChartPanel.get());

		} else {
			API.get().info("Chart is not null updating data with " + value.getInterest() + " and " + value.getLoan());
			store.setData(DataUtil.getValues(value));
		}

	}
}
