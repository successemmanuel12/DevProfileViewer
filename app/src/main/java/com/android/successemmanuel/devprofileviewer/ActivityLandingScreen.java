package com.android.successemmanuel.devprofileviewer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityLandingScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_screen);
    }
    public void openMainView(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}
