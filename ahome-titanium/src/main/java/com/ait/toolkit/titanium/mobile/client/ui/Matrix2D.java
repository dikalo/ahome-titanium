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
package com.ait.toolkit.titanium.mobile.client.ui;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.titanium.mobile.client.core.events.EventDispatcher;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The Matrix2D is created by
 * {@link com.ait.toolkit.titanium.mobile.client.ui.UI.create2DMatrix} . The 2d
 * matrix is an object for holding values for an affine transformation matrix. A
 * 2d matrix is used to rotate, scale, translate, or skew the objects in a
 * two-dimensional space. a 2d matrix is represented by a 3 by 3 matrix. because
 * the third column is always (0,0,1), the data structure contains values for
 * only the first two columns.
 * <p>
 * You create an 'identity matrix' by creating a 2D Matrix with an empty
 * constructor.
 */
public class Matrix2D extends EventDispatcher {

    public Matrix2D() {
        createPeer();
    }

    Matrix2D(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * @return The entry at position [1,1] in the matrix. Available only on iOs
     */
    public native double getA() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.a;
    }-*/;

    public native void setA(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.a = value;
    }-*/;

    /**
     * @return The entry at position [1,2] in the matrix. Available only on iOs
     */
    public native double getB() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.b;
    }-*/;

    public native void setB(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.b = value;
    }-*/;

    /**
     * @return The entry at position [2,1] in the matrix. Available only on iOs
     */
    public native double getC() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.c;
    }-*/;

    public native void setC(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.c = value;
    }-*/;

    /**
     * @return The entry at position [2,2] in the matrix. Available only on iOs
     */
    public native double getD() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.d;
    }-*/;

    public native void setD(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.d = value;
    }-*/;

    /**
     * @return The entry at position [3,1] in the matrix. Available only on iOs
     */
    public native double getTx() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.tx;
    }-*/;

    public native void setTx(double value) /*-{
		jso.tx = value;
    }-*/;

    /**
     * @return The entry at position [3,2] in the matrix. Available only on iOs
     */
    public native double getTy() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.ty;
    }-*/;

    public native void setTy(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.ty = value;
    }-*/;

    /**
     * Returns a matrix constructed by inverting an existing matrix
     */
    public native Matrix2D invert() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.invert();
		var toReturn = @com.ait.toolkit.titanium.mobile.client.ui.Matrix2D::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Returns a matrix constructed by combining two existing matrix.
     * 
     * @param t2 The second matrix. jso matrix is concatenated to the matrix
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
    public native Matrix2D multiply(Matrix2D t2) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso
				.multiply(t2.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		var toReturn = @com.ait.toolkit.titanium.mobile.client.ui.Matrix2D::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Returns a matrix constructed by rotating an existing matrix
     * 
     * @param angle The angle, in degrees, by which to rotate the matrix. A
     *            positive value specifies counterclockwise rotation and a
     *            negative value specifies clockwise rotation.
     */
    public native Matrix2D rotate(double angle) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.rotate(angle);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.ui.Matrix2D::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Returns a matrix constructed by scaling an existing matrix
     * 
     * @param sx The value by which to scale x values of the matrix
     * @param sy The value by which to scale y values of the matrix
     */
    public native Matrix2D scale(double sx, double sy) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.scale(sx, sy);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.ui.Matrix2D::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    /**
     * Returns a matrix constructed by translating an existing matrix
     * 
     * @param tx The value by which to move x values with the matrix
     * @param ty The value by which to move y values with the matrix
     */
    public native Matrix2D translate(double tx, double ty) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = jso.translate(tx, ty);
		var toReturn = @com.ait.toolkit.titanium.mobile.client.ui.Matrix2D::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    private void createPeer() {
        jsObj = UI.create2DMatrix();
    }

    public static Matrix2D from(JsObject obj) {
        return new Matrix2D(obj.getJsObj());
    }

}
