package com.test.samplechatapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by Pankaj on 5/7/2016.
 */
public class Dialog_Table extends SQLiteOpenHelper implements Table {

    public static final String DATABASE_NAME = "CHATAPP_DBManager";
    public static final int DATABASE_VERSION = 1;
    private static Dialog_Table ourInstance;
    String tablename;

    private Dialog_Table(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, null, version);
        Log.d("Database Class Singel ", name);
    }

    public static Dialog_Table getInstance(Object o1, String test, Object o, int i) {
        ourInstance = new Dialog_Table(null, DATABASE_NAME, null, DATABASE_VERSION);
        return ourInstance;

    }

    public static Dialog_Table getInstance(Context context, String test, Object o, int i) {

        ourInstance = new Dialog_Table(context, DATABASE_NAME, null, DATABASE_VERSION);
        Log.d("Checking", "vsvsdv");
        return ourInstance;
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    @Override
    public void insert(String[][] s) {
        SQLiteDatabase db = this.getWritableDatabase();
        for (int i = 0; i < s.length; i++) {
            Log.d("Inside insert function", s[i][1].toString());
            ContentValues values = new ContentValues();

            values.put("dialog_id", Integer.valueOf(s[i][0].toString()));
            values.put("content", s[i][1].toString());

            try {
                db.insert(this.getTablename(), null, values);
            } catch (Exception e) {
                Log.d("Insert Exception", e.toString());
            }

        }

    }

    @Override
    public void delete() {

    }

    @Override
    public void update() {

    }

    @Override
    public ArrayList select() {
        ArrayList a = new ArrayList();
        return a;
    }

    @Override
    public void create() {
        String createQuery;
        Log.d("Dialog :", "Creating table");
        createQuery = " CREATE TABLE " + this.getTablename() + "( dialog_id INTEGER PRIMARY KEY, content TEXT) ";
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL(createQuery);

    }

    @Override
    public String createDatabase() {
        String createQuery;
        Log.d("Dialog :", "Inside Dialog");
        createQuery = " CREATE TABLE " + this.getTablename() + "( dialog_id INTEGER PRIMARY KEY, content TEXT) ";
        return createQuery;
    }

    @Override
    public boolean checkExistenceTable() {
        SQLiteDatabase db = this.getWritableDatabase();
        try {
            String countQuery = "SELECT  * FROM " + this.getTablename();
            Cursor cursor = db.rawQuery(countQuery, null);
            cursor.close();
            Log.d("Dialog Table", "try block checking");
            return false;
        } catch (SQLException e) {
            Log.d("EXCEPTION Block", e.toString());
            return true;
        }

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
