package com.example.a15017206.p02sgholidays;

import android.widget.ImageView;

/**
 * Created by 15017206 on 27/04/2017.
 */

public class Holiday {
    private String holidayTitle;
    private String date;
    private int iv;

    public Holiday(String holidayTitle, String date, int iv) {
        this.holidayTitle = holidayTitle;
        this.date = date;
        this.iv = iv;
    }

    public String getHolidayTitle(){
        return holidayTitle;
    }
    public String getDate(){
        return date;
    }

    public int getImageView(){
        return  iv;
    }
}
