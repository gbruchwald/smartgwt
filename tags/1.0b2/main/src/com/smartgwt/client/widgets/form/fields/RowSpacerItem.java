/*
 * SmartGWT (GWT for SmartClient)
 * Copyright 2008 and beyond, Isomorphic Software, Inc.
 *
 * SmartGWT is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version 3
 * as published by the Free Software Foundation.  SmartGWT is also
 * available under typical commercial license terms - see
 * http://smartclient.com/license
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */
 
package com.smartgwt.client.widgets.form.fields;



import com.smartgwt.client.event.*;
import com.smartgwt.client.core.*;
import com.smartgwt.client.types.*;
import com.smartgwt.client.data.*;
import com.smartgwt.client.data.events.*;
import com.smartgwt.client.rpc.*;
import com.smartgwt.client.widgets.*;
import com.smartgwt.client.widgets.events.*;
import com.smartgwt.client.widgets.form.*;
import com.smartgwt.client.widgets.form.validator.*;
import com.smartgwt.client.widgets.form.fields.*;
import com.smartgwt.client.widgets.tile.*;
import com.smartgwt.client.widgets.tile.events.*;
import com.smartgwt.client.widgets.grid.*;
import com.smartgwt.client.widgets.grid.events.*;
import com.smartgwt.client.widgets.layout.*;
import com.smartgwt.client.widgets.menu.*;
import com.smartgwt.client.widgets.tab.*;
import com.smartgwt.client.widgets.toolbar.*;
import com.smartgwt.client.widgets.tree.*;
import com.smartgwt.client.widgets.tree.events.*;
import com.smartgwt.client.widgets.viewer.*;
import com.smartgwt.client.widgets.calendar.*;
import com.smartgwt.client.widgets.calendar.events.*;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;
import com.smartgwt.client.util.JSOHelper;
import com.smartgwt.client.util.EnumUtil;
import com.google.gwt.event.shared.*;
import com.google.gwt.event.shared.HasHandlers;
   /**
    * Form item that renders as a blank row in the form layout.<br> Set {@link com.smartgwt.client.widgets.form.fields.RowSpacerItem#getStartRow startRow} to <code>false</code> to create a rowSpacer that simply takes up every remaining column in the current row rather than starting a new row.

    */
public class RowSpacerItem extends SpacerItem {

    public static RowSpacerItem getOrCreateRef(JavaScriptObject jsObj) {
        if(jsObj == null) return null;
        RefDataClass obj = RefDataClass.getRef(jsObj);
        if(obj != null) {
            obj.setJsObj(jsObj);
            return (RowSpacerItem) obj;
        } else {
            return new RowSpacerItem(jsObj);
        }
    }


    public RowSpacerItem(){
        setType("RowSpacerItem");
    }

    public RowSpacerItem(JavaScriptObject jsObj){
        super(jsObj);
    }

    public RowSpacerItem(String name) {
        setName(name);
        setType("RowSpacerItem");
    }

    // ********************* Properties / Attributes ***********************

    /**
    * we never show a separate title cell for separators
    *
    * @param showTitle showTitle Default value is false
    */
    public void setShowTitle(Boolean showTitle) {
        setAttribute("showTitle", showTitle);
    }
    /**
     * we never show a separate title cell for separators
     *
     *
     * @return Boolean
     *
     */
    public Boolean getShowTitle()  {
        return getAttributeAsBoolean("showTitle");
    }

    /**
    * by default, separators span all remaining columns
    *
    * @param colSpan colSpan Default value is "*"
    */
    public void setColSpan(int colSpan) {
        setAttribute("colSpan", colSpan);
    }
    /**
     * by default, separators span all remaining columns
     *
     *
     * @return int
     *
     */
    public int getColSpan()  {
        return getAttributeAsInt("colSpan");
    }

    /**
    * these items are in a row by themselves by default
    *
    * @param startRow startRow Default value is true
    */
    public void setStartRow(Boolean startRow) {
        setAttribute("startRow", startRow);
    }
    /**
     * these items are in a row by themselves by default
     *
     *
     * @return Boolean
     *
     */
    public Boolean getStartRow()  {
        return getAttributeAsBoolean("startRow");
    }

    /**
    * these items are in a row by themselves by default
    *
    * @param endRow endRow Default value is true
    */
    public void setEndRow(Boolean endRow) {
        setAttribute("endRow", endRow);
    }
    /**
     * these items are in a row by themselves by default
     *
     *
     * @return Boolean
     *
     */
    public Boolean getEndRow()  {
        return getAttributeAsBoolean("endRow");
    }

    // ********************* Methods ***********************

    // ********************* Static Methods ***********************

}




