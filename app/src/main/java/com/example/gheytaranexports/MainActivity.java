package com.example.gheytaranexports;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout truck =(RelativeLayout)findViewById(R.id.truck);
        truck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Truck.class));
            }
        });

        RelativeLayout proc =(RelativeLayout)findViewById(R.id.process);
        proc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), proc.class));
            }
        });

        RelativeLayout one =(RelativeLayout)findViewById(R.id.hour1);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), onehour.class));
            }
        });

        RelativeLayout three =(RelativeLayout)findViewById(R.id.hour3);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), threehour.class));
            }
        });

        RelativeLayout pack =(RelativeLayout)findViewById(R.id.pack);
        pack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), pack.class));
            }
        });
    }
}
