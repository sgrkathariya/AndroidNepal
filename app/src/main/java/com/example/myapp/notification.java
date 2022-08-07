package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class notification extends AppCompatActivity {
    private NotificationManagerCompat notificationManager;
    private EditText etTitle;
    private EditText etDetail;
    private Button btnchannel1;
    private Button btnchannel2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        notificationManager = NotificationManagerCompat.from(this);
        etTitle = findViewById(R.id.etTitle);
        etDetail = findViewById(R.id.etDetail);
        btnchannel1=findViewById(R.id.channel1);
        btnchannel2=findViewById(R.id.channel2);


        btnchannel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                channelOne();
            }
        });

        btnchannel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                channelTwo();
            }
        });


    }
        public void channelOne() {
            Notification notification = new NotificationCompat.Builder(this,MySplashApp.channel_id_1)
                    .setContentTitle(etTitle.getText().toString())
                    .setTicker("one")
                    .setWhen(System.currentTimeMillis())
                    .setSmallIcon(R.drawable.ic_baseline_notification_important_24)
                    .setContentText(etDetail.getText().toString())
                    .setPriority(NotificationCompat.PRIORITY_HIGH)
                    .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                    .build();
            notificationManager.notify(1, notification);
        }
        public void channelTwo() {
            Notification notification2 = new NotificationCompat.Builder(this,MySplashApp.channel_id_2)
                    .setContentTitle(etTitle.getText().toString())
                    .setTicker("two")
                    .setSmallIcon(R.drawable.ic_baseline_notifications_24)
                    .setContentText(etDetail.getText().toString())
                    .setPriority(NotificationCompat.PRIORITY_LOW)
                    .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                    .build();
            notificationManager.notify(2, notification2);
        }
}