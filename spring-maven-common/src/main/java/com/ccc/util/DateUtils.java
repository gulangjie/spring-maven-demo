package com.ccc.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    public static String formateDate(Date data){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String result = format.format(data);
        return result;
    }
}
