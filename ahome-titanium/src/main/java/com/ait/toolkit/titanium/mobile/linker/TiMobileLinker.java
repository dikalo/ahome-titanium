/*
 Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.ait.toolkit.titanium.mobile.linker;

import com.google.gwt.core.ext.linker.LinkerOrder;

/**
 * Linker for Titanium4j Mobile. This linker removes unnecessary GWT stuff to
 * make the generated JS work inside Titanium. Use this linker when working on a
 * titanium only project.
 */
@LinkerOrder(LinkerOrder.Order.PRIMARY)
public class TiMobileLinker extends TiMobileBaseLinker {

	@Override
	public String getDescription() {
		return "Titanium4j Primary Linker";
	}

}
