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
package com.ait.toolkit.titanium.mobile.client.contacts;

import java.util.ArrayList;
import java.util.List;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.titanium.mobile.client.core.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * An object which represents a group in the contacts database. Available only
 * on iOs.
 */
public class Group extends EventDispatcher {

    protected Group(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return The name of the group
     */
    public final native String getName() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.name;
    }-*/;

    public final native void setName(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.name = value;
    }-*/;

    /**
     * 
     * Record identifier of the group. Single value.
     */
    public final native int getRecordId() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.recordId;
    }-*/;

    public final native void setRecordId(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.recordId = value;
    }-*/;

    /**
     * Adds a person to the group
     * 
     * @param person
     *            {@link com.ait.toolkit.titanium.mobile.client.contacts.Person} object
     *            to add to the group
     */
    public final native void add(Person person) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.add(person.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * The complete list of members of the group
     */
    public final native List<Person> members() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.members();
		return @com.ait.toolkit.titanium.mobile.client.contacts.Person::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Removes a person from the group
     * 
     * @param person
     *            {@link com.ait.toolkit.titanium.mobile.client.contacts.Person} object
     *            to remove from the group
     */
    public final native void remove(Person person) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.remove(person.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * A list of sorted members
     * 
     * @param sortBy
     *            Method for sorting. Must be one of
     *            {@link com.ait.toolkit.titanium.mobile.client.contacts.Contacts.CONTACTS_SORT_FIRST_NAME}
     *            or
     *            {@link com.ait.toolkit.titanium.mobile.client.contacts.Contacts.CONTACTS_SORT_LAST_NAME}
     */
    public final native List<Person> sortedMembers(int sortBy) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.sortedMembers(sortBy);
		return @com.ait.toolkit.titanium.mobile.client.contacts.Person::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    static JavaScriptObject fromList(List<Group> values) {
        JsArray<JavaScriptObject> peers = JsArray.createArray().cast();
        for (Group rule : values) {
            peers.push(rule.getJsObj());
        }
        return peers;
    }

    static List<Group> fromJsArray(JavaScriptObject obj) {
        List<Group> toReturn = new ArrayList<Group>();
        int size = JsoHelper.arrayLength(obj);
        for (int i = 0; i < size; i++) {
            toReturn.add(new Group(JsoHelper.getValueFromJavaScriptObjectArray(obj, i)));
        }
        return toReturn;
    }

}
