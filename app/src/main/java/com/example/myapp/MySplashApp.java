package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;

public class MySplashApp extends AppCompatActivity {
    public static final String channel_id_1 = "channel1";
    public static final String channel_id_2 = "channel2";


    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        SystemClock.sleep(400);
        createNotificationChannels();
    }

    private void createNotificationChannels() {
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel Channel1 = new NotificationChannel(
                    channel_id_1, "channel_1", NotificationManager.IMPORTANCE_HIGH);
            Channel1.setDescription("channel 1");
            NotificationChannel channel2=new NotificationChannel(
                    channel_id_2, "channel_2", NotificationManager.IMPORTANCE_LOW
            );
            channel2.setDescription("channel 2");
            NotificationManager manager=getSystemService(NotificationManager.class);
            manager.createNotificationChannel(Channel1);
            manager.createNotificationChannel(channel2);
        }
    }
}