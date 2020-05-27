package com.example.gheytaranexports;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class Truck extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_truck);

        assert getSupportActionBar() != null;   //null check
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



//        getActionBar().setTitle("Truck Details");
//        getSupportActionBar().setTitle("Truck Details");

        RelativeLayout t1 =(RelativeLayout)findViewById(R.id.t_sg);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSf25rFWSMRepuCRPc21We4AiGSiRzGQ_5sGliYLSTPXrqzVZg/viewform"));
                startActivity(browserIntent);
            }
        });

        RelativeLayout t2 =(RelativeLayout)findViewById(R.id.t_bf);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSdWyyHNz1FPWrsUJpYv1BRCU8HEPYwyyRm9AVAyyRR0LzL5Ig/viewform"));
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
