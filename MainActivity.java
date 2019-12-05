package com.example.servicedata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2;
    MyReceiver myReceiver;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.start);
        btn2=findViewById(R.id.stop);

        myReceiver=new MyReceiver();

        registerReceiver(myReceiver,new IntentFilter(Intent.ACTION_BATTERY_CHANGED));


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startService(new Intent(MainActivity.this,MyService.class));

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                stopService(new Intent(MainActivity.this,MyService.class));
            }
        });



    }
}
