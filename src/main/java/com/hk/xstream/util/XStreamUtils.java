package com.hk.xstream.util;

import com.thoughtworks.xstream.XStream;

/**
 * Created by LuHj on 2018/10/23.
 */
public class XStreamUtils {
    public static Object toBean(Class<?> clazz, String xml) {
        Object xmlObject = null;
        XStream xstream = new XStream();
        xstream.processAnnotations(clazz);
        xstream.autodetectAnnotations(true);
        xmlObject= xstream.fromXML(xml);
        return xmlObject;
    }
}
