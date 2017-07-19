package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    private TextView weatherForDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        weatherForDay = (TextView) findViewById(R.id.tv_weather_for_day);

        Intent intent = getIntent();

        if (intent.hasExtra(MainActivity.WeatherExtra)) {
            String weatherValue = intent.getStringExtra(MainActivity.WeatherExtra);

            weatherForDay.setText(weatherValue);
        }
    }
}