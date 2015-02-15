/**
 * 
 */
package com.date.web.common.trans;

import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 * @author xuesong03
 * 
 */
public class TimeTrans {

    public static Date StringToDate(String dateString) {

        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        java.util.Date date = null;
        try {
            date = format.parse(dateString);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return null;
        }

        return new Date(date.getTime());
    }

    public static String DateToString(Date date) {

        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");

        String time = null;
        try {
            time = format.format(date);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return time;

    }

}
