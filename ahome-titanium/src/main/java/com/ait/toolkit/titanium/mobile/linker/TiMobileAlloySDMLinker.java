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
package com.ait.toolkit.titanium.mobile.linker;

import com.google.gwt.core.ext.LinkerContext;
import com.google.gwt.core.ext.linker.LinkerOrder;

@LinkerOrder( LinkerOrder.Order.POST )
public class TiMobileAlloySDMLinker extends TiMobileBaseLinker {

    @Override
    public String getDescription() {
        return "Titanium4j Linker for Alloy projects in Super Dev Mode ";
    }

    @Override
    protected String generateJavaScriptPath( LinkerContext context ) {
        return "../../../../../" + context.getModuleName() + DEFAULT_PROJECT_SUFFIX + "/app/controllers/index.js";
    }
}