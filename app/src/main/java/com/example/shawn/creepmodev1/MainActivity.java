package com.example.shawn.creepmodev1;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonTap(View v) {
        Toast.makeText(getApplicationContext(), "Creepmode is running. Happy Creeping!", Toast.LENGTH_LONG).show();
        startActivity(new Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS));
    }
    public void onButtonTap2(View v) {
        Toast myToast = Toast.makeText(getApplicationContext(), "Creepmode has been disabled.", Toast.LENGTH_LONG);
        myToast.show();
    }

}
