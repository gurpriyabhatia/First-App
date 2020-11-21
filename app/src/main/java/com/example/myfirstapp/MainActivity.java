package com.example.myfirstapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextClock;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickIndia(View view) {
        TextClock clock = findViewById(R.id.my_clock);
        clock.setTimeZone("Asia/Kolkata");
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    public void onClickGermany(View view) {
        TextClock clock = findViewById(R.id.my_clock);
        clock.setTimeZone("Europe/Berlin");
    }
}