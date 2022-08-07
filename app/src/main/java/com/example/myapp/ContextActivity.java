package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ContextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context);
        TextView textView =findViewById(R.id.contextMenu);
        EditText editText=findViewById(R.id.copy_paste);
        registerForContextMenu(textView);
        registerForContextMenu(editText);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

       switch (v.getId()){
           case R.id.contextMenu:
               getMenuInflater().inflate(R.menu.context_menu,menu);

               break;
           case R.id.copy_paste:
               getMenuInflater().inflate(R.menu.option_menu,menu);

           default:

       }
    }

}