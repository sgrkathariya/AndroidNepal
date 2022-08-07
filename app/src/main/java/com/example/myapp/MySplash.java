package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MySplash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
//        if (getSupportActionBar() != null) {
//            getSupportActionBar().hide();
//        }

//        Thread t=new Thread(new Runnable() {
//            @Override
//            public void run() {
         //       try {
//        Thread.sleep(400);
//                    Intent intent =new Intent(getApplicationContext(),login.class);
//                    startActivity(intent);
//                    finish();
//                }catch (InterruptedException e){
//                    Toast.makeText(getApplicationContext(),"Sorry", Toast.LENGTH_LONG).show();
//                }
//            }
//        })

        NotificationManager notificationManager = (NotificationManager)
                getSystemService(Context.NOTIFICATION_SERVICE);
        int notificationId = 1;
        String channelId = "mychannel-1";
        String channelName = "My Channel Name";
        int importance = NotificationManager.IMPORTANCE_HIGH;
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel mChannel = new NotificationChannel(
                    channelId, channelName, importance);
            notificationManager.createNotificationChannel(mChannel);
        }
        NotificationCompat.Builder mBuilder = new
                NotificationCompat.Builder(getApplicationContext(), channelId)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle("Title of Notification")
                .setContentText("Detail notification Message");
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(getApplicationContext(),0,intent,0);
        mBuilder.setContentIntent(resultPendingIntent);
        notificationManager.notify(notificationId, mBuilder.build());


//Intent intent =new Intent(getApplicationContext(), login.class);
//startActivity(intent);
//finish();
    }

}