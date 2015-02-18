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
import java.util.Arrays;
import java.util.List;

import com.ait.toolkit.titanium.mobile.client.core.TiFactory;
import com.ait.toolkit.titanium.mobile.client.core.TiModule;
import com.ait.toolkit.titanium.mobile.client.core.handlers.EventHandler;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * 
 * The top level contacts module. the contacts module is used accessing the
 * device address book. (read-only on android.)
 * <p>
 * Contacts on AndroidMedia are currently only read-only, so methods such as
 * 'createPerson', 'removePerson', etc..., are not supported. Person objects
 * which have been removed from the database are invalidated after a save
 * operation, whether from creating a new contact or explicitly calling
 * Contacts.save(). Using them may result in unpredictable behavior, including
 * crashes.
 */
public class Contacts extends TiModule {

    private static Contacts instance = null;

    public static Contacts get() {
        if (instance == null) {
            instance = new Contacts();
        }
        return instance;
    }

    private Contacts() {
        createPeer();
    }

    public static final int CONTACTS_AUTHORIZATION_AUTHORIZED = AUTHORIZATION_AUTHORIZED();
    public static final int CONTACTS_AUTHORIZATION_DENIED = AUTHORIZATION_DENIED();
    public static final int CONTACTS_AUTHORIZATION_RESTRICTED = AUTHORIZATION_RESTRICTED();
    public static final int CONTACTS_AUTHORIZATION_UNKNOWN = AUTHORIZATION_UNKNOWN();
    public static final int CONTACTS_KIND_ORGANIZATION = CONTACTS_KIND_ORGANIZATION();
    public static final int CONTACTS_KIND_PERSON = CONTACTS_KIND_PERSON();
    public static final int CONTACTS_SORT_FIRST_NAME = CONTACTS_SORT_FIRST_NAME();
    public static final int CONTACTS_SORT_LAST_NAME = CONTACTS_SORT_LAST_NAME();

    /**
     * Create and return an instance of
     * com.ait.toolkit.titanium.mobile.client.contacts.Group. Only on iOs available
     * 
     */
    public native Group createGroup() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.createGroup();
		var toReturn = @com.ait.toolkit.titanium.mobile.client.contacts.Group::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Create and return an instance of
     * com.ait.toolkit.titanium.mobile.client.contacts.Group. Only on iOs available
     * 
     * @param parameters
     *            (optional) a dictionary object properties defined in
     *            com.ait.toolkit.titanium.mobile.client.contacts.Group.Group
     */
    public native Group createGroup(JavaScriptObject parameters) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.createGroup(parameters);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.contacts.Group::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Create and return an instance of
     * com.ait.toolkit.titanium.mobile.client.contacts.Person. Only available on iOs.
     */
    public native Person createPerson() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.createPerson();
		var toReturn = @com.ait.toolkit.titanium.mobile.client.contacts.Person::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Create and return an instance of
     * com.ait.toolkit.titanium.mobile.client.contacts.Person. Only available on iOs.
     * 
     * @param parameters
     *            (optional) a dictionary object properties defined in
     *            com.ait.toolkit.titanium.mobile.client.contacts.Person
     */
    public native Person createPerson(JavaScriptObject parameters) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.createPerson(parameters);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.contacts.Person::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Returns an of all {@link com.ait.toolkit.titanium.mobile.client.contacts.Group}
     * objects in the contacts database.Only available on iOs.
     */
    public native List<Group> getAllGroups() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var oj = jso.getAllGroups();
		return @com.ait.toolkit.titanium.mobile.client.contacts.Group::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Returns an array of all
     * {@link com.ait.toolkit.titanium.mobile.client.contacts.Person} objects in the
     * contacts database
     */
    public native List<Person> getAllPeople(int limit) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.getAllPeople(limit);
		return @com.ait.toolkit.titanium.mobile.client.contacts.Person::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Gets the value of the contactsAuthorization property.
     * 
     * @return
     */
    public native int getContactsAuthorization() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getContactsAuthorization();
    }-*/;

    /**
     * Returns a {@link com.ait.toolkit.titanium.mobile.client.contacts.Group} object
     * with the given id.Available only on iOs.
     * 
     * @param id
     *            The database ID of the group to retrieve
     */
    public native Group getGroupByID(int id) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.getGroupByID(id);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.contacts.Group::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Returns an array of
     * {@link com.ait.toolkit.titanium.mobile.client.contacts.Person} objects who have a
     * name (first, last, middle, composite) which matches the given name
     * 
     * @param name
     *            The name to match in the database
     */

    private ArrayList<Person> getPeopleWithName(String name) {
        ArrayList<Person> result = new ArrayList<Person>();
        JsArray<JavaScriptObject> array = _getPeopleWithName(name);
        for (int i = 0; i < array.length(); i++) {
            result.add(new Person(array.get(i)));
        }
        return result;
    }

    private native JsArray<JavaScriptObject> _getPeopleWithName(String name) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.getPeopleWithName(name);
    }-*/;

    /**
     * Returns a {@com.ait.toolkit.titanium.mobile.client.contacts.Person} object with
     * the given id
     * 
     * @param id
     *            The database ID of the person to retrieve
     */
    public native Person getPersonByID(int id) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.getPersonByID(id);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.contacts.Person::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Removes a group from the contacts database.
     * 
     * @platforms iphone, ipad
     * @param group
     *            The {@link com.ait.toolkit.titanium.mobile.client.contacts.Group}
     *            object to remove from the database.
     */
    public native void removeGroup(Group group) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.removeGroup(group.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Removes a person from the contacts database. only on iOs
     * 
     * @param person
     *            The {@link com.ait.toolkit.titanium.mobile.client.contacts.Person}
     *            object to remove from the database.
     */
    public native void removePerson(Person person) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.removePerson(person.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * 
     * if authorization is unknown, will bring up a dialog requesting
     * permission.
     * <p>
     * Note that the callback may be synchronous or asynchronous. That is, it
     * may be called during requestAuthorization or much later. See the
     * "Request access to the address book" example on how to best use this
     * method.
     */
    public native void requestAuthorization(ContactAuthorizationHandler callback) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso
				.requestAuthorization(function(r) {
					var resp = @com.ait.toolkit.titanium.mobile.client.contacts.ContactsAuthorizationResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(r);
					callback.@com.ait.toolkit.titanium.mobile.client.contacts.ContactAuthorizationHandler::onEvent(Lcom/ait/toolkit/titanium/mobile/client/contacts/ContactsAuthorizationResponse;)(resp);
				});
    }-*/;

    /**
     * Reverts all changes made to the previous save of the database. only on
     * iOs
     */
    public static native void revert() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.revert();
    }-*/;

    /**
     * Saves all changes to contacts to the database.
     */
    public void save(Person... values) {
        save(Arrays.asList(values));
    }

    /**
     * Saves all changes to contacts to the database.
     */
    public static native void save(List<Person> values) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var toSave = @com.ait.toolkit.titanium.mobile.client.contacts.Person::fromList(Ljava/util/List;)(values);
		jso.save(toSave);
    }-*/;

    /**
     * Displays a picker that allows a person to be selected.
     */
    public native void showContacts(JavaScriptObject config) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.showContacts(config);
    }-*/;

    /**
     * Fired when the database backing the contacts module is modified
     * externally.
     * <p>
     * If you have an existing reference to a Person or Group object, you should
     * obtain a new reference from the Contacts module. Using the existing
     * object may result in unpredictable behavior, such as updating the wrong
     * contact.
     */
    public void addReloadHandler(EventHandler handler) {
        addEventHandler("reload", handler);
    }

    public static native final int AUTHORIZATION_AUTHORIZED() /*-{
		return Titanium.Contacts.AUTHORIZATION_AUTHORIZED;
    }-*/;

    public static native final int AUTHORIZATION_DENIED() /*-{
		return Titanium.Contacts.AUTHORIZATION_DENIED;
    }-*/;

    public static native final int AUTHORIZATION_UNKNOWN() /*-{
		return Titanium.Contacts.AUTHORIZATION_UNKNOWN;
    }-*/;

    public static native final int AUTHORIZATION_RESTRICTED() /*-{
		return Titanium.Contacts.AUTHORIZATION_RESTRICTED;
    }-*/;

    public static native final int CONTACTS_KIND_PERSON() /*-{
		return Titanium.Contacts.CONTACTS_KIND_PERSON;
    }-*/;

    public static native final int CONTACTS_SORT_FIRST_NAME() /*-{
		return Titanium.Contacts.CONTACTS_SORT_FIRST_NAME;
    }-*/;

    public static native final int CONTACTS_SORT_LAST_NAME() /*-{
		return Titanium.Contacts.CONTACTS_SORT_LAST_NAME;
    }-*/;

    public static native final int CONTACTS_KIND_ORGANIZATION() /*-{
		return Titanium.Contacts.CONTACTS_KIND_ORGANIZATION;
    }-*/;

    @Override
    public void createPeer() {
        jsObj = TiFactory.createNativeContactModule();
    }

}
