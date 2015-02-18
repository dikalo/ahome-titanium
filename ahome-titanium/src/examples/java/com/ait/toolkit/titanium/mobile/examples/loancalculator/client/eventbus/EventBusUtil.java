package com.ait.toolkit.titanium.mobile.examples.loancalculator.client.eventbus;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.SimpleEventBus;

/**
 * Utility class to dispatch application wide events
 * 
 */
public class EventBusUtil {

	private final SimpleEventBus eventBus = new SimpleEventBus();
	private static final EventBusUtil INSTANCE = new EventBusUtil();

	private EventBusUtil() {

	}

	public static EventBusUtil get() {
		return INSTANCE;
	}

	public void fireEvent(GwtEvent<?> event) {
		eventBus.fireEvent(event);
	}

	public <H extends EventHandler> HandlerRegistration addHandler(Type<H> type, H handler) {
		return eventBus.addHandler(type, handler);
	}

}
