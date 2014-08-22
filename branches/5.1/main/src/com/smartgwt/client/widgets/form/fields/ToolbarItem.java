/*
 * Smart GWT (GWT for SmartClient)
 * Copyright 2008 and beyond, Isomorphic Software, Inc.
 *
 * Smart GWT is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version 3
 * as published by the Free Software Foundation.  Smart GWT is also
 * available under typical commercial license terms - see
 * http://smartclient.com/license
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */
/* sgwtgen */
 
package com.smartgwt.client.widgets.form.fields;


import com.smartgwt.client.event.*;
import com.smartgwt.client.core.*;
import com.smartgwt.client.types.*;
import com.smartgwt.client.data.*;
import com.smartgwt.client.data.events.*;
import com.smartgwt.client.rpc.*;
import com.smartgwt.client.callbacks.*;
import com.smartgwt.client.tools.*;
import com.smartgwt.client.bean.*;
import com.smartgwt.client.widgets.*;
import com.smartgwt.client.widgets.events.*;
import com.smartgwt.client.widgets.form.*;
import com.smartgwt.client.widgets.form.validator.*;
import com.smartgwt.client.widgets.form.fields.*;
import com.smartgwt.client.widgets.tile.*;
import com.smartgwt.client.widgets.tile.events.*;
import com.smartgwt.client.widgets.grid.*;
import com.smartgwt.client.widgets.grid.events.*;
import com.smartgwt.client.widgets.chart.*;
import com.smartgwt.client.widgets.layout.*;
import com.smartgwt.client.widgets.layout.events.*;
import com.smartgwt.client.widgets.menu.*;
import com.smartgwt.client.widgets.rte.*;
import com.smartgwt.client.widgets.rte.events.*;
import com.smartgwt.client.widgets.tab.*;
import com.smartgwt.client.widgets.toolbar.*;
import com.smartgwt.client.widgets.tree.*;
import com.smartgwt.client.widgets.tree.events.*;
import com.smartgwt.client.widgets.viewer.*;
import com.smartgwt.client.widgets.calendar.*;
import com.smartgwt.client.widgets.calendar.events.*;
import com.smartgwt.client.widgets.cube.*;
import com.smartgwt.client.widgets.drawing.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;
import com.smartgwt.client.util.*;
import com.smartgwt.client.util.workflow.*;
import com.google.gwt.event.shared.*;
import com.google.gwt.event.shared.HasHandlers;

/**
 * Set of horizontally arranged buttons.
 */
@BeanFactory.FrameworkClass
public class ToolbarItem extends CanvasItem {

    public static ToolbarItem getOrCreateRef(JavaScriptObject jsObj) {

        if(jsObj == null) return null;

        RefDataClass obj = RefDataClass.getRef(jsObj);

		if(obj != null && JSOHelper.getAttribute(jsObj,"__ref")==null) {
            return com.smartgwt.client.util.ObjectFactory.createFormItem("ToolbarItem",jsObj);

        } else
        if(obj != null) {
            obj.setJsObj(jsObj);
            return (ToolbarItem) obj;
        } else {
            return new ToolbarItem(jsObj);
        }
    }


    /**
     * Changes the defaults for Canvas AutoChildren named <code>autoChildName</code>.
     *
     * @param autoChildName name of an AutoChild to customize the defaults for.
     * @param defaults Canvas defaults to apply. These defaults override any existing properties
     * without destroying or wiping out non-overridden properties.
     * @see com.smartgwt.client.docs.AutoChildUsage
     */
    public static native void changeAutoChildDefaults(String autoChildName, Canvas defaults) /*-{
        $wnd.isc.ToolbarItem.changeDefaults(autoChildName + "Defaults", defaults.@com.smartgwt.client.widgets.Canvas::getConfig()());
    }-*/;

    /**
     * Changes the defaults for FormItem AutoChildren named <code>autoChildName</code>.
     *
     * @param autoChildName name of an AutoChild to customize the defaults for.
     * @param defaults FormItem defaults to apply. These defaults override any existing properties
     * without destroying or wiping out non-overridden properties.
     * @see com.smartgwt.client.docs.AutoChildUsage
     */
    public static native void changeAutoChildDefaults(String autoChildName, FormItem defaults) /*-{
        $wnd.isc.ToolbarItem.changeDefaults(autoChildName + "Defaults", defaults.@com.smartgwt.client.widgets.form.fields.FormItem::getJsObj()());
    }-*/;
    /**
     * Changes the defaults for DrawItem AutoChildren named <code>autoChildName</code>.
     *
     * @param autoChildName name of an AutoChild to customize the defaults for.
     * @param defaults DrawItem defaults to apply. These defaults override any existing properties
     * without destroying or wiping out non-overridden properties.
     * @see com.smartgwt.client.docs.AutoChildUsage
     */
    public static native void changeAutoChildDefaults(String autoChildName, DrawItem defaults) /*-{
        $wnd.isc.ToolbarItem.changeDefaults(autoChildName + "Defaults", defaults.@com.smartgwt.client.widgets.drawing.DrawItem::getJsObj()());
    }-*/;

    public static native void changePickerIconDefaults(FormItemIcon defaults) /*-{
        $wnd.isc.ToolbarItem.changeDefaults("pickerIconDefaults", defaults.@com.smartgwt.client.core.DataClass::getJsObj()());
    }-*/;

    public ToolbarItem(){
        setAttribute("editorType", "ToolbarItem");
    }

    public ToolbarItem(JavaScriptObject jsObj){
        
        setJavaScriptObject(jsObj);
    }


    public ToolbarItem(String name) {
        setName(name);
                setAttribute("editorType", "ToolbarItem");
    }


    public ToolbarItem(String name, String title) {
        setName(name);
		setTitle(title);
                setAttribute("editorType", "ToolbarItem");
    }


    // ********************* Properties / Attributes ***********************

    /**
     * If specified this baseStyle will be applied to the buttons in this toolbar.
     *
     * @param buttonBaseStyle  See {@link com.smartgwt.client.docs.CSSStyleName CSSStyleName} . Default value is null
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setButtonBaseStyle(String buttonBaseStyle) {
        setAttribute("buttonBaseStyle", buttonBaseStyle);
    }

    /**
     * If specified this baseStyle will be applied to the buttons in this toolbar.
     *
     * @return  See {@link com.smartgwt.client.docs.CSSStyleName CSSStyleName} 
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public String getButtonBaseStyle()  {
        return getAttributeAsString("buttonBaseStyle");
    }
    
    
    

    /**
     * List of buttons for the toolbar.  Each buttons should be specified as a simple JS object with properties to apply to the
     * button to be displayed. Note that any <code>click</code> stringMethod applied to the  button will be passed 2
     * parameters: <code>form</code> and <code>item</code>.
     *
     * @param buttons  Default value is null
     * @see com.smartgwt.client.docs.Items Items overview and related methods
     */
    public void setButtons(StatefulCanvas... buttons) {
        setAttribute("buttons", buttons);
    }
    

    /**
     * This item is an autoChild generated {@link com.smartgwt.client.widgets.Canvas} displayed by the ToolbarItem and is an
     * instance of {@link com.smartgwt.client.widgets.toolbar.Toolbar} by defaut, cuztomizeable  via the {@link
     * com.smartgwt.client.widgets.form.fields.ToolbarItem#getCanvasConstructor canvasConstructor} attribute.
     * <p>
     * For an overview of how to use and configure AutoChildren, see {@link com.smartgwt.client.docs.AutoChildUsage Using AutoChildren}.
     *
     * @return Canvas
     */
    public Canvas getCanvas()  {
        return (Canvas)Canvas.getByJSObject(getAttributeAsJavaScriptObject("canvas"));
    }
    
    

    /**
     * these items are in a row by themselves by default
     *
     * @param endRow  Default value is true
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setEndRow(Boolean endRow) {
        setAttribute("endRow", endRow);
    }

    /**
     * these items are in a row by themselves by default
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public Boolean getEndRow()  {
        return getAttributeAsBoolean("endRow");
    }
    

    /**
     * Don't show a title for toolbars
     *
     * @param showTitle  Default value is false
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setShowTitle(Boolean showTitle) {
        setAttribute("showTitle", showTitle);
    }

    /**
     * Don't show a title for toolbars
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public Boolean getShowTitle()  {
        return getAttributeAsBoolean("showTitle");
    }
    

    /**
     * these items are in a row by themselves by default
     *
     * @param startRow  Default value is true
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setStartRow(Boolean startRow) {
        setAttribute("startRow", startRow);
    }

    /**
     * these items are in a row by themselves by default
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public Boolean getStartRow()  {
        return getAttributeAsBoolean("startRow");
    }
    

    /**
     * Should the toolbar stack its buttons vertically or horizontally?
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param vertical  Default value is false
     */
    public void setVertical(Boolean vertical) {
        setAttribute("vertical", vertical);
    }

    /**
     * Should the toolbar stack its buttons vertically or horizontally?
     *
     * @return Boolean
     */
    public Boolean getVertical()  {
        return getAttributeAsBoolean("vertical");
    }
    

    // ********************* Methods ***********************

    // ********************* Static Methods ***********************

    /** 
     * Class level method to set the default properties of this class.  If set, then all
     * existing and subsequently created instances of this class will automatically have
     * default properties corresponding to
     * the properties of the class instance passed to this function.
     * This is a powerful feature that eliminates the need for users to create a separate
     * hierarchy of subclasses that only alter the default properties of this class. Can also
     * be used for skinning / styling purposes.  <P> <b>Note:</b> This method is intended for
     * setting default attributes only and will affect all instances of the underlying class
     * (including those automatically generated in JavaScript).  This method should not be used
     * to apply standard EventHandlers or override methods for a class - use a custom subclass
     * instead.  Calling this method after instances have been created can result in undefined
     * behavior, since it bypasses any setters and a class instance may have already examined 
     * a particular property and not be expecting any changes through this route.
     *
     * @param toolbarItemProperties properties that should be used as new defaults when instances of this class are created
     */
    public static native void setDefaultProperties(ToolbarItem toolbarItemProperties) /*-{
    	var properties = $wnd.isc.addProperties({},toolbarItemProperties.@com.smartgwt.client.core.RefDataClass::getJsObj()());
        @com.smartgwt.client.util.JSOHelper::cleanProperties(Lcom/google/gwt/core/client/JavaScriptObject;Z)(properties,false);
        $wnd.isc.ToolbarItem.addProperties(properties);
    }-*/;

    // ***********************************************************

}

