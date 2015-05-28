package com.ait.toolkit.titanium.mobile.client.ui;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.data.client.BaseModel;
import com.google.gwt.core.client.JavaScriptObject;

public class ViewTemplateProperties extends BaseModel {

    public ViewTemplateProperties() {

    }

    public ViewTemplateProperties( JavaScriptObject obj ) {
        super( obj );
    }

    public static ViewTemplateProperties from( JsObject proxy ) {
        return new ViewTemplateProperties( proxy.getJsObj() );
    }
}
