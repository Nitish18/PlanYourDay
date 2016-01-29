package com.planyourday.nitish.planyourday;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by nitish on 1/29/2016.
 */
public class Plantomorrow extends Activity {


    TextView TV1,TV2;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plantomorrow);

        TV1 = (TextView) findViewById(R.id.plantomorrow_tv1);
        TV2 = (TextView) findViewById(R.id.plantomorrow_tv2);

        String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());

        TV2.setText(date);


    }





}
