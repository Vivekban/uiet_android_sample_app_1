package com.test.samplechatapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by parkash on 5/8/2016.
 */
public class Database_Handler extends SQLiteOpenHelper {


    public static final String DATABASE_NAME = "CHATAPP_DBManager";
    public static final int DATABASE_VERSION = 1;


    private static Database_Handler ourInstance;

    private Database_Handler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, null, version);
        Log.d("Database Class Singel ", name);
    }

    public static Database_Handler getInstance(Object o1, String test, Object o, int i) {
        ourInstance = new Database_Handler(null, DATABASE_NAME, null, DATABASE_VERSION);
        return ourInstance;

    }

    public static Database_Handler getInstance(Context context, String test, Object o, int i) {

        ourInstance = new Database_Handler(context, DATABASE_NAME, null, DATABASE_VERSION);
        Log.d("Checking", "vsvsdv");
        return ourInstance;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {


        Log.d("ON CREATE DB HANDLER", "FF");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    void addMessage(String table, ArrayList data) {
        Log.d("add messaage function", "shit");
        SQLiteDatabase dbl = this.getWritableDatabase();
        dbl.close(); // Closing database connection
    }

}
