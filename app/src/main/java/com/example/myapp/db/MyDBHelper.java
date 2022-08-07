package com.example.myapp.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyDBHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME="ContactDB";
    private static final Integer DATABASE_VERSION=1;
    private static final String TABLE_NAME="Contacts";
    private static final String KEY_ID="id";
    private static final String KEY_NAME="name";
    private static final String KEY_PHONE="phone";
    public MyDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+TABLE_NAME+"("+ KEY_ID+ "Integer Primary Key AutoIncrement,"+ KEY_NAME+"TEXT"+KEY_PHONE+"TEXT"+")");
    SQLiteDatabase database = this.getWritableDatabase();
    database.close();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("Drop table if Exists " + TABLE_NAME);
        onCreate(db);
    }
    public void addContact(String name, String phone) {
        SQLiteDatabase db =this.getWritableDatabase();
        ContentValues values =new ContentValues();
        values.put(KEY_NAME,name);
        values.put(KEY_PHONE,phone);
        db.insert(TABLE_NAME, null,values);
    }
}
