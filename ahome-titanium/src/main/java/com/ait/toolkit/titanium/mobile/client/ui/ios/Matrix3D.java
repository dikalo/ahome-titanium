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
package com.ait.toolkit.titanium.mobile.client.ui.ios;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.titanium.mobile.client.core.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The 3d matrix is an object for holding values for an affine transformation
 * matrix. A 3d matrix is used to rotate, scale, translate, or skew the objects
 * in a three-dimensional space. a 3d matrix is represented by a 4 by 4 matrix.
 * because the forth column is always (0,0,1), the data structure contains
 * values for only the first three columns.
 * <p>
 * You create an 'identity matrix' by creating a 3D Matrix with an empty
 * constructor.
 */
public class Matrix3D extends EventDispatcher {

    public Matrix3D() {
        createPeer();
    }

    Matrix3D(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return The entry at position [1,1] in the matrix.
     */
    public native double getM11() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.m11;
    }-*/;

    public native void setM11(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.m11 = value;
    }-*/;

    /**
     * @return The entry at position [1,2] in the matrix.
     */
    public native double getM12() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.m12;
    }-*/;

    public native void setM12(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.m12 = value;
    }-*/;

    /**
     * @return The entry at position [1,3] in the matrix.
     */
    public native double getM13() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.m13;
    }-*/;

    public native void setM13(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.m13 = value;
    }-*/;

    /**
     * @return The entry at position [1,4] in the matrix.
     */
    public native double getM14() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.m14;
    }-*/;

    public native void setM14(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.m14 = value;
    }-*/;

    /**
     * @return The entry at position [2,1] in the matrix.
     */
    public native double getM21() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.m21;
    }-*/;

    public native void setM21(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.m21 = value;
    }-*/;

    /**
     * @return The entry at position [2,2] in the matrix.
     */
    public native double getM22() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.m22;
    }-*/;

    public native void setM22(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.m22 = value;
    }-*/;

    /**
     * @return The entry at position [2,3] in the matrix.
     */
    public native double getM23() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.m23;
    }-*/;

    public native void setM23(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.m23 = value;
    }-*/;

    /**
     * @return The entry at position [2,4] in the matrix.
     */
    public native double getM24() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.m24;
    }-*/;

    public native void setM24(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.m24 = value;
    }-*/;

    /**
     * @return The entry at position [3,1] in the matrix.
     */
    public native double getM31() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.m31;
    }-*/;

    public native void setM31(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.m31 = value;
    }-*/;

    /**
     * @return The entry at position [3,2] in the matrix.
     */
    public native double getM32() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.m32;
    }-*/;

    public native void setM32(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.m32 = value;
    }-*/;

    /**
     * @return The entry at position [3,3] in the matrix.
     */
    public native double getM33() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.m33;
    }-*/;

    public native void setM33(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.m33 = value;
    }-*/;

    /**
     * @return The entry at position [3,4] in the matrix.
     */
    public native double getM34() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.m34;
    }-*/;

    public native void setM34(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.m34 = value;
    }-*/;

    /**
     * @return The entry at position [4,1] in the matrix.
     */
    public native double getM41() /*-{
		return jso.m41;
    }-*/;

    public native void setM41(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.m41 = value;
    }-*/;

    /**
     * @return The entry at position [4,2] in the matrix.
     */
    public native double getM42() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.m42;
    }-*/;

    public native void setM42(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.m42 = value;
    }-*/;

    /**
     * @return The entry at position [4,3] in the matrix.
     */
    public native double getM43() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.m43;
    }-*/;

    public native void setM43(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.m43 = value;
    }-*/;

    /**
     * @return The entry at position [4,4] in the matrix.
     */
    public native double getM44() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.m44;
    }-*/;

    public native void setM44(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.m44 = value;
    }-*/;

    /**
     * Returns a matrix constructed by inverting an existing matrix
     */
    public native Matrix3D invert() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.invert();
		var toReturn = @com.ait.toolkit.titanium.mobile.client.ui.ios.Matrix3D::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Returns a matrix constructed by combining two existing matrix.
     * 
     * @param t2
     *            The second matrix. jso matrix is concatenated to the matrix
     *            instance against which the function is invoked. The result of
     *            jso function is the first matrix multiplied by the second
     *            matrix. You might perform several multiplications in order to
     *            create a single matrix that contains the cumulative effects of
     *            several transformations. Note that matrix operations are not
     *            commutative - the order in which you concatenate matrices is
     *            important. That is, the result of multiplying matrix t1 by
     *            matrix t2 does not necessarily equal the result of multiplying
     *            matrix t2 by matrix t1.
     */
    public native Matrix3D multiply(Matrix3D t2) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso
				.multiply(t2.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		var toReturn = @com.ait.toolkit.titanium.mobile.client.ui.ios.Matrix3D::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Returns a matrix constructed by rotating an existing matrix
     * 
     * @param angle
     *            The angle, in degrees, by which to rotate the matrix. A
     *            positive value specifies counterclockwise rotation and a
     *            negative value specifies clockwise rotation.
     * @param x
     *            The x part of the vector about which to rotate
     * @param y
     *            The y part of the vector about which to rotate
     * @param z
     *            The z part of the vector about which to rotate
     */
    public native Matrix3D rotate(double angle, double x, double y, double z) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.rotate(angle, x, y, z);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.ui.ios.Matrix3D::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Returns a matrix constructed by scaling an existing matrix
     * 
     * @param sx
     *            The value by which to scale x values of the matrix
     * @param sy
     *            The value by which to scale y values of the matrix
     * @param sz
     *            The value by which to scale z values of the matrix
     */
    public native Matrix3D scale(double sx, double sy, double sz) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.scale(sx, sy, sz);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.ui.ios.Matrix3D::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Returns a matrix constructed by translating an existing matrix
     * 
     * @param tx
     *            The value by which to move x values with the matrix
     * @param ty
     *            The value by which to move y values with the matrix
     * @param tz
     *            The value by which to move z values with the matrix
     */
    public native Matrix3D translate(double tx, double ty, double tz) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.translate(tx, ty, tz);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.ui.ios.Matrix3D::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    private void createPeer() {
        jsObj = create3DMatrix();
    }

    public static Matrix3D from(JsObject obj) {
        return new Matrix3D(obj.getJsObj());
    }

    public native JavaScriptObject create3DMatrix() /*-{
		return Titanium.UI.iOS.create3DMatrix();
    }-*/;

}
