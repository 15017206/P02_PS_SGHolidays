package com.example.a15017206.p02sgholidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 15017206 on 27/04/2017.
 */

public class HolidayAdapter extends ArrayAdapter<Holiday>{

    private ArrayList<Holiday> holiday1;
    private Context context;
    private TextView tvHolidayTitle;
    private TextView tvHolidayDate;
    private ImageView iv1;



    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //connect to row.xml
        View rowView = inflater.inflate(R.layout.row, parent, false);

        //Save Element UI to variable
        tvHolidayTitle = (TextView) rowView.findViewById(R.id.tvHolidayTitle1);
        tvHolidayDate = (TextView) rowView.findViewById(R.id.tvHolidayDate1);
        iv1 = (ImageView) rowView.findViewById(R.id.imageView);

        //Taking from list position
        Holiday currentHoliday = holiday1.get(position);

        //Set the TextView to show the Holiday Title, Holiday Date - returns Secular or Ethnic & Religion
        tvHolidayTitle.setText( currentHoliday.getHolidayTitle());
        tvHolidayDate.setText(currentHoliday.getDate());
        iv1.setImageResource(currentHoliday.getImageView());

        return  rowView;
    }
    public HolidayAdapter(Context context, int resource, ArrayList<Holiday> objects){
        super(context, resource, objects);
        holiday1 = objects;
        this.context = context;
    }



}
