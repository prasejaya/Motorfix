package com.example.emotor.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Date {
    public static String getCurrentDate() {
        String ret = "";

        try {
            SimpleDateFormat postFormater = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            ret = postFormater.format(new java.util.Date());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ret;
    }

    public static java.util.Date getDateFromString(String string) {
        return Date.getDateFromString(string, "yyyy-MM-dd");
    }

    public static java.util.Date getDateFromString(String string, String pattern) {
        SimpleDateFormat format = new SimpleDateFormat(pattern, Locale.ENGLISH);
        java.util.Date date = null;
        try {
            date = format.parse(string);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return date;
    }

    public static String changeDateStringFormat(String string, String patternFrom, String patternTo) {
        String ret = "";

        try {
            SimpleDateFormat formatFrom = new SimpleDateFormat(patternFrom, Locale.ENGLISH);
            SimpleDateFormat formatTo = new SimpleDateFormat(patternTo, Locale.ENGLISH);
            ret = formatTo.format(formatFrom.parse(string));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return ret;
    }
}
