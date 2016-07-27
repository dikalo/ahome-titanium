package com.ait.toolkit.titanium.mobile.client;

import com.ait.toolkit.titanium.mobile.client.core.handlers.ui.ClickHandler;
import com.ait.toolkit.titanium.mobile.client.platform.Platform;
import com.ait.toolkit.titanium.mobile.client.ui.AlertDialog;

public final class Display {

    /**
     * Titanium has a built-in convenience function alert which can be used as a
     * shortcut to <code>Titanium.UI.createAlertDialog</code> for creating a
     * message box. Note that unlike a web browser-based version of alert, the
     * method is asynchronous. However, only one alert dialog will be visible
     * and modal at a time.
     * 
     * @param message
     *            , the message to display
     */
    public static void alert( String message ) {
        AlertDialog alert = new AlertDialog();
        if( Platform.get().isAndroid() ) {
            alert = AlertDialog.createDefault();
        }
        alert.setMessage( message );
        alert.show();
    };

    /**
     * Titanium has a built-in convenience function alert which can be used as a
     * shortcut to <code>Titanium.UI.createAlertDialog</code> for creating a
     * message box. Note that unlike a web browser-based version of alert, the
     * method is asynchronous. However, only one alert dialog will be visible
     * and modal at a time.
     * 
     * @param message
     *            , the message to display
     */
    public static void alert( String message, ClickHandler clickHandler ) {
        AlertDialog alert = new AlertDialog();
        if( Platform.get().isAndroid() ) {
            alert = AlertDialog.createDefault();
        }
        alert.setMessage( message );
        alert.addClickHandler( clickHandler );
        alert.show();
    };

    /**
     * Titanium has a built-in convenience function alert which can be used as a
     * shortcut to <code>Titanium.UI.createAlertDialog</code> for creating a
     * message box. Note that unlike a web browser-based version of alert, the
     * method is asynchronous. However, only one alert dialog will be visible
     * and modal at a time.
     * 
     * @param title
     *            , the title of the message
     * @param message
     *            , the message to display
     */
    public static void alert( String title, String message ) {
        AlertDialog alert = new AlertDialog();
        if( Platform.get().isAndroid() ) {
            alert = AlertDialog.createDefault();
        }
        alert.setTitle( title );
        alert.setMessage( message );
        alert.show();
    }

    /**
     * Titanium has a built-in convenience function alert which can be used as a
     * shortcut to <code>Titanium.UI.createAlertDialog</code> for creating a
     * message box. Note that unlike a web browser-based version of alert, the
     * method is asynchronous. However, only one alert dialog will be visible
     * and modal at a time.
     * 
     * @param title
     *            , the title of the message
     * @param message
     *            , the message to display
     */
    public static void alert( String title, String message, ClickHandler handler ) {
        AlertDialog alert = new AlertDialog();
        if( Platform.get().isAndroid() ) {
            alert = AlertDialog.createDefault();
        }
        alert.setTitle( title );
        alert.setMessage( message );
        alert.addClickHandler( handler );
        alert.show();
    }

}
