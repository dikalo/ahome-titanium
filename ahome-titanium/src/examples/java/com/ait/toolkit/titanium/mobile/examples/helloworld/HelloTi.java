package com.ait.toolkit.titanium.mobile.examples.helloworld;

import com.ait.toolkit.titanium.mobile.client.Titanium;
import com.ait.toolkit.titanium.mobile.client.core.TiEntryPoint;
import com.ait.toolkit.titanium.mobile.client.core.events.ui.ClickEvent;
import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.ClickHandler;
import com.ait.toolkit.titanium.mobile.client.ui.Button;
import com.ait.toolkit.titanium.mobile.client.ui.Window;

public class HelloTi extends TiEntryPoint {

	@Override
	public void onStart() {

		Window window = new Window();
		window.setFullscreen(true);

		Button button = new Button("Tap Me");
		button.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				Titanium.alert("Ahomé IT", "Titanium and Java FTW !");
			}
		});
		window.add(button);
		window.open();

	}

}
