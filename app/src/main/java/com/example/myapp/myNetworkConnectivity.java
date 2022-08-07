//package com.example.myapp;
//
//import android.content.Context;
//import android.net.ConnectivityManager;
//import android.net.NetworkInfo;
//import androidx.core.content.ContextCompat;
//
//public class myNetworkConnectivity() {
//     boolean isOnline;
//        ConnectivityManager cm=(ConnectivityManager) ContextCompat.getSystemService(ContextCompat.CONNECTIVITY_SERVICE);
//        NetworkInfo networkInfo = cm.getActiveNetworkInfo();
//
//        isOnline=(networkInfo!=null && networkinfo.isConnectedOrConnecting());
//return isOnline;
//}
//
////    boolean isConnected;
////
////    ConnectivityManager connectivityManager =
////            (ConnectivityManager) this.context.getSystemService(Context.CONNECTIVITY_SERVICE);
////    NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
////  isConnected = (networkInfo != null && networkInfo.isConnectedOrConnecting());
////
////          return isConnected;
////          }