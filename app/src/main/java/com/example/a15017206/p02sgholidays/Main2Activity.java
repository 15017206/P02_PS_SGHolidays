package com.example.a15017206.p02sgholidays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static android.R.attr.x;
import static android.R.id.list;

public class Main2Activity extends AppCompatActivity {
    TextView tvTitle;
    ListView lv;
    ArrayList<Holiday> holiday;
    ArrayAdapter aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvTitle = (TextView) findViewById(R.id.textView3);
        lv = (ListView) findViewById(R.id.lvCustom);

        holiday = new ArrayList<Holiday>();

        Intent i = getIntent();
        String year = i.getStringExtra("type");

        if (year.equalsIgnoreCase("secular")){
            showSecularHolidays();
        } else {
            showEthnicHolidays();
        }

        tvTitle.setText(year);
        aa = new HolidayAdapter(this, R.layout.row, holiday);

        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                System.out.println(holiday.get(position).getHolidayTitle());
                String sel = holiday.get(position).getHolidayTitle();
                String sel2 = holiday.get(position).getDate();
                Toast.makeText(getApplicationContext(), sel + " Date: " + sel2 , Toast.LENGTH_SHORT).show();
            }
        });


    }

    void showEthnicHolidays(){
        holiday.add(new Holiday("Chinese new year","28, 29 Feb 2017",R.drawable.cny));
        holiday.add(new Holiday("Good Friday","14 Apr 2017",R.drawable.good_friday));
        holiday.add(new Holiday("Vesak Day","10 May 2017",R.drawable.vesak_day));
        holiday.add(new Holiday("Hari Raya Puasa","25 Jun 2017",R.drawable.hari_raya_puasa));
        holiday.add(new Holiday("Hari Raya Haji","1 Sep 2017",R.drawable.hari_raya_haji));
        holiday.add(new Holiday("Deepavali","18 Oct 2017",R.drawable.deepavali));
        holiday.add(new Holiday("Christmas Day","25 Dec 2017",R.drawable.christmas));
    }

    void showSecularHolidays(){
        holiday.add(new Holiday("New Year's Day","1 Jan 2017",R.drawable.new_year));
        holiday.add(new Holiday("Labour Day","1 May 2017",R.drawable.labour_day));
        holiday.add(new Holiday("National Day","9 Aug 2017",R.drawable.national_day));
    }
}
