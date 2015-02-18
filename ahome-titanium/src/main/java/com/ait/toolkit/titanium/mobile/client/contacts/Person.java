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
import com.ait.toolkit.titanium.mobile.client.blob.Blob;
import com.ait.toolkit.titanium.mobile.client.core.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * An object that represents a contact record for a person or organization in
 * the system contacts address book.
 * <p>
 * A person object is created using Titanium.Contacts.createPerson.
 * <p>
 * The following two kinds of properties exist for this object:
 * <p>
 * <ul>
 * <li>single value - contains either a string or number type value, an array of
 * string type values, or null if unset.
 * <li>
 * <li>multi-value - contains a dictionary with typical keys of home, work
 * and/or other. Each key contains either a string type value, an array of
 * string type values, or a dictionary containing key/value pairs with string
 * type values.
 * <li>
 * </ul>
 * <p>
 * <b>Adding and Modifying Properties</b>
 * <p>
 * Support for adding and modifying properties is currently supported on iOS and
 * Android.
 * <p>
 * <b>Keys as Address Book UI Labels</b>
 * <p>
 * Keys act as labels in the address book user interface.
 * <p>
 * Although there is limited support for custom, arbitrarily-named, keys when
 * used with multi-value properties, there is no support them with single value
 * properties.
 * <p>
 * On iOS, creating custom keys is not recommended, and will lead to undefined
 * results.
 * <p>
 * If a label has been created by the user of the device and used with a
 * multi-value property, it will exist as a key with the same name.
 */
public class Person extends EventDispatcher {

    protected Person(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return The addresses for the person. multi-value, valid labels are:
     *         home, work, other. values are dictionaries.
     */
    public native Address getAddress() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.address;
		return @com.ait.toolkit.titanium.mobile.client.contacts.Address::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setAddress(Address value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.address = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		;
    }-*/;

    /**
     * @return The birthday of the person. single value, format is
     *         "yyyy-mm-dd't'hh:mm:ss'.'sss+0000"
     */
    public native String getBirthday() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.birthday;
    }-*/;

    public native void setBirthday(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.birthday = value;
    }-*/;

    /**
     * @return The date the person was created in the database. single value,
     *         format is "yyyy-mm-dd't'hh:mm:ss'.'sss+0000", read-only
     */
    public native String getCreated() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.created;
    }-*/;

    /**
     * @return Dates associated with the person. multi-value, valid labels are:
     *         `anniversary`. values are strings of format
     *         "yyyy-mm-dd't'hh:mm:ss'.'sss+0000"
     */
    public native PersonDate getDate() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.date;
		return @com.ait.toolkit.titanium.mobile.client.contacts.PersonDate::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setDate(PersonDate value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.date = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    /**
     * @return The department of the person. single value
     */
    public native String getDepartment() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.department;
    }-*/;

    public native void setDepartment(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.department = value;
    }-*/;

    /**
     * @return The email addresses for the person. multi-value, valid labels
     *         are: home, work, other. values are strings.
     */
    public native PersonEmail getEmail() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.email;
		return @com.ait.toolkit.titanium.mobile.client.contacts.PersonEmail::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setEmail(PersonEmail value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.email = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    /**
     * @return The first name of the person. single value
     */
    public native String getFirstName() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.firstName;
    }-*/;

    public native void setFirstName(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.firstName = value;
    }-*/;

    /**
     * @return The phonetic first name of the person. single value
     */
    public native String getFirstPhonetic() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.firstPhonetic;
    }-*/;

    public native void setFirstPhonetic(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.firstPhonetic = value;
    }-*/;

    /**
     * @return The localized full name of the person. single value, read-only
     */
    public native String getFullName() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.fullName;
    }-*/;

    public native void setFullName(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.fullName = value;
    }-*/;

    /**
     * @return A blob object representing the image for the person. set to
     *         `null` to remove the image. single value
     */
    public native Blob getImage() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.image;
		return @com.ait.toolkit.titanium.mobile.client.blob.Blob::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setImage(Blob value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.image = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    /**
     * @return The instant messenger names for the person. multi-value, valid
     *         labels are: `aim`, `icq`, `jabber`, `msn`, `yahoo`. values are
     *         dictionaries.
     */
    public native PersonInstantMessage getInstantMessage() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.instantMessage;
		return @com.ait.toolkit.titanium.mobile.client.contacts.PersonInstantMessage::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setInstantMessage(PersonInstantMessage value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.instantMessage = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    /**
     * @return The job title of the person. single value
     */
    public native String getJobTitle() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.jobTitle;
    }-*/;

    public native void setJobTitle(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.jobTitle = value;
    }-*/;

    /**
     * @return The kind of person. single value, one of
     *         {@link com.ait.toolkit.titanium.mobile.client.contacts.Contacts.KIND_PERSON}
     *         or
     *         {@link com.ait.toolkit.titanium.mobile.client.contacts.Contacts.KIND_ORGANIZATION}
     */
    public native int getKind() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.kind;
    }-*/;

    public native void setKind(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.kind = value;
    }-*/;

    /**
     * @return The last name of the person. single value
     */
    public native String getLastName() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.lastName;
    }-*/;

    public native void setLastName(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.lastName = value;
    }-*/;

    /**
     * @return The phonetic last name of the person. single value
     */
    public native String getLastPhonetic() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.lastPhonetic;
    }-*/;

    public native void setLastPhonetic(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.lastPhonetic = value;
    }-*/;

    /**
     * @return The middle name of the person. single value
     */
    public native String getMiddleName() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.middleName;
    }-*/;

    public native void setMiddleName(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.middleName = value;
    }-*/;

    /**
     * @return The phonetic middle name of the person. single value
     */
    public native String getMiddlePhonetic() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.middlePhonetic;
    }-*/;

    public native void setMiddlePhonetic(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.middlePhonetic = value;
    }-*/;

    /**
     * @return The most recent date the person was modified. single value,
     *         format is "yyyy-mm-dd't'hh:mm:ss'.'sss+0000", read-only
     */
    public native String getModified() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.modified;
    }-*/;

    /**
     * @return The nickname of the person. single value
     */
    public native String getNickname() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.nickname;
    }-*/;

    public native void setNickname(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.nickname = value;
    }-*/;

    /**
     * @return Notes for the person. single value
     */
    public native String getNote() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.note;
    }-*/;

    public native void setNote(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.note = value;
    }-*/;

    /**
     * @return The organization the person belongs to. single value
     */
    public native String getOrganization() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.organization;
    }-*/;

    public native void setOrganization(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.organization = value;
    }-*/;

    /**
     * @return The phone numbers for the person. multi-value, valid labels are:
     *         home, work, other, mobile, pager, workfax, homefax, main, iphone.
     *         values are strings.
     */
    public native Phone getPhone() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.phone;
		return @com.ait.toolkit.titanium.mobile.client.contacts.Phone::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setPhone(Phone value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.phone = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    /**
     * @return The prefix for the person. single value
     */
    public native String getPrefix() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.prefix;
    }-*/;

    /**
     * @return Record identifier of the person. Single value.
     */
    public native int getRecordId() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.recordId;
    }-*/;

    /**
     * Record identifier of the person. Single value.
     */
    public native void setRecordId(int value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.recordId = value
    }-*/;

    /**
     * @return The names of people the person is related to. multi-value, valid
     *         labels are: mother, father, parent, sister, brother, child,
     *         friend, spouse, partner, manager, assistant. values are strings.
     */
    public native RelatedPerson getRelatedNames() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.relatedNames;
		return @com.ait.toolkit.titanium.mobile.client.contacts.RelatedPerson::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native void setRelatedNames(RelatedPerson value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.relatedNames = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    /**
     * @return The suffix for the person. single value
     */
    public native String getSuffix() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.suffix;
    }-*/;

    /**
     * URLs of webpages associated with the person.
     * 
     */
    public native Url getUrl() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.url;
		return @com.ait.toolkit.titanium.mobile.client.contacts.Url::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * URLs of webpages associated with the person.
     * 
     */
    public native void setUrl(Url value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.url = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
    }-*/;

    static JavaScriptObject fromList(List<Person> values) {
        JsArray<JavaScriptObject> peers = JsArray.createArray().cast();
        for (Person rule : values) {
            peers.push(rule.getJsObj());
        }
        return peers;
    }

    static List<Person> fromJsArray(JavaScriptObject obj) {
        List<Person> toReturn = new ArrayList<Person>();
        int size = JsoHelper.arrayLength(obj);
        for (int i = 0; i < size; i++) {
            toReturn.add(new Person(JsoHelper.getValueFromJavaScriptObjectArray(obj, i)));
        }
        return toReturn;
    }

}
