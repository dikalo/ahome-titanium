package com.ait.toolkit.titanium.mobile.examples.loancalculator.client.ui.chart;

import java.util.ArrayList;

import com.ait.toolkit.titanium.mobile.examples.loancalculator.client.common.ChartValueHolder;


/**
 * Creates Chartvalues to display in the pie chart
 */
public class DataUtil {

	private DataUtil(){
		
	}
	
	public static ArrayList<ChartValue> getValues(ChartValueHolder valueHolder){
		ArrayList<ChartValue> values = new ArrayList<ChartValue>();
		
		ChartValue value = new ChartValue();
		value.setName("Interest");
		value.setValue(valueHolder.getInterest());
		values.add(value);
		
		
		value = new ChartValue();
		value.setName("Repayments");
		value.setValue(valueHolder.getLoan());
		values.add(value);
		
		return values;
	}
}
