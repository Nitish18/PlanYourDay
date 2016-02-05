package com.planyourday.nitish.planyourday;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


/**
 * Created by nitish on 1/27/2016.
 */
public class Mainactivity extends Activity {

    Button MAIN_BT1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        MAIN_BT1 = (Button) findViewById(R.id.main_bt1);

        MAIN_BT1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Intent main_i1 = new Intent(Mainactivity.this,Plantomorrow.class);
                startActivity(main_i1);


            }
        });
    }

    }






