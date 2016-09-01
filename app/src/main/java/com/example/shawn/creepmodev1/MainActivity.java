package com.example.shawn.creepmodev1;

import android.app.NotificationManager;
import android.app.Notification;
import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                onButtonTap();
                createNotification();
            }
        } );
    }

    public void onButtonTap() {
        Toast.makeText(getApplicationContext(), "Creepmode is running. Happy Creeping!", Toast.LENGTH_LONG).show();
        startActivity(new Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS));
    }
    public void onButtonTap2(View v) {
        Toast myToast = Toast.makeText(getApplicationContext(), "Creepmode has been disabled.", Toast.LENGTH_LONG);
        myToast.show();
    }
    public void createNotification () {
        NotificationCompat.Builder nBuilder = new NotificationCompat.Builder(this);
        nBuilder.setContentTitle("Creepmode");
        nBuilder.setContentText("Service is Running");
        nBuilder.setSmallIcon(R.drawable.ic_servicenotify);


        Notification notification  = nBuilder.build();
        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        nm.notify (1, notification);
    }
}
