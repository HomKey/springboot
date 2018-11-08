package com.hk.base.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by LuHj on 2018/11/6.
 */
public class DateUtils {

    public final static SimpleDateFormat DEFAULT_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static String getDateString(Date date, SimpleDateFormat sdf){
        if (sdf == null){
            sdf = DEFAULT_FORMAT;
        }
        return sdf.format(date);
    }
    public static String getDateString(long millisecond, SimpleDateFormat sdf){
        if (sdf == null){
            sdf = DEFAULT_FORMAT;
        }
        return sdf.format(millisecond);
    }

}
