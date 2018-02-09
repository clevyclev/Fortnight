package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mWeatherDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        mWeatherDisplay = (TextView) findViewById(R.id.tv_weather_data);

        String [] weatherData = {"Hot", "Cold", "Warm", "Rainy", "Sunny"};

        for(String each : weatherData){
            mWeatherDisplay.append(each + "\n\n\n");
        }
    }
}