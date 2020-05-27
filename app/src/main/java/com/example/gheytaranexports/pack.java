package com.example.gheytaranexports;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class pack extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pack);

        assert getSupportActionBar() != null;   //null check
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        RelativeLayout t1 =(RelativeLayout)findViewById(R.id.t_sg);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSf4ea7BpeDQy6A0tZfwsYRB9UWCFr8_0W125NaSHq3ecHeTEQ/viewform"));
                startActivity(browserIntent);
            }
        });

        RelativeLayout t2 =(RelativeLayout)findViewById(R.id.t_bf);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSesVWluvtRq_Uaf3vKIKn8JR7yVOJq3STTZLXIW87swpSWMzA/viewform"));
                startActivity(browserIntent);
            }
        });
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
