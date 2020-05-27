package com.example.gheytaranexports;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class threehour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_threehour);

        assert getSupportActionBar() != null;   //null check
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        RelativeLayout t1 =(RelativeLayout)findViewById(R.id.t_sg);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSfs__U_COFRf5pZ0i_5BTOy4FkB_b_wZTh6HMhgGoR8AaGt0Q/viewform"));
                startActivity(browserIntent);
            }
        });

        RelativeLayout t2 =(RelativeLayout)findViewById(R.id.t_bf);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSeks7vCPPA8GvQAJ4xmSCDYXGH8uMyqFIG7lkQeIYwPeIzwxQ/viewform"));
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
