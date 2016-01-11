/*
 * Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ait.toolkit.titanium.mobile.client.core;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.titanium.mobile.client.api.API;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Helper class to debug inside ti4j 
 */
public class Debugger {

    private static final Debugger INSTANCE = new Debugger();
    private static boolean enableDebbing;

    public static Debugger get() {
        return INSTANCE;
    }

    private Debugger() {
        enableDebbing = true;
    }

    public void print( JsObject object ) {
        print( object.getJsObj() );
    }

    public native void print( JavaScriptObject obj )/*-{
                                                    Titanium.API.info("------- Object output start ---------");
                                                    Titanium.API.info("Object  : " + obj);
                                                    Titanium.API.info("Type  : " + typeof (obj));
                                                    for (property in obj) {
                                                    Titanium.API.info(property + " : " + obj[property]);
                                                    }
                                                    Titanium.API.info("------- Object output end ---------");
                                                    }-*/;

    public void info( String message ) {
        if( enableDebbing ) {
            API.get().info( message );
        }
    }

    public void error( String message ) {
        if( enableDebbing ) {
            API.get().error( message );
        }
    }

    public void enableDebugging( boolean value ) {
        enableDebbing = value;
    }

}
