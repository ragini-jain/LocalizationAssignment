package com.gl.localizationassignment;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Locale;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Locale primaryLocale = getApplicationContext().getResources().getConfiguration().getLocales().get(0);
        String locale = primaryLocale.getDisplayName();
        setContentView(R.layout.activity_main);
    }
}
