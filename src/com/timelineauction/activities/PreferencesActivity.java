package com.timelineauction.activities;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class PreferencesActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_preferences, menu);
        return true;
    }
}
