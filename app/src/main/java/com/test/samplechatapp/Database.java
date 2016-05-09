package com.test.samplechatapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by parkash on 5/9/2016.
 */

public class Database extends SQLiteOpenHelper {
    // Database Version
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "CHATAPP_DBManager";
    //Contact_Table contact_table = Contact_Table.getInstance();
    //Chat_Table chat_table = Chat_Table.getInstance();
    //Dialog_Table dialog_table = Dialog_Table.getInstance();


    public Database(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        Log.d("in db Constructor", "Shit");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.d("in DB Create Method", "yowijfme");

        // Create Tables


        //contact_table.setTablename("contactsTable");
        //  Log.d("Query" ,contact_table.createDatabase());
        //  db.execSQL(contact_table.createDatabase());


        //  chat_table.setTablename("chatsTable");
        //  db.execSQL(chat_table.createDatabase());


        // dialog_table.setTablename("dialogTable");
        // db.execSQL(dialog_table.createDatabase());

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        // implemented Later

        // Create tables again
        onCreate(db);


    }

    void addMessage(String table, ArrayList data) {
        if (table != "test") {
            SQLiteDatabase db = this.getWritableDatabase();
            db.close(); // Closing database connection
        }

    }

     /*   void insertData(Tables t, ArrayList data) {
            Log.d("Insert Data Functions", "table Working");
            SQLiteDatabase db = this.getWritableDatabase();

            Contact_Table tb = Contact_Table.getInstance();
            // Hv to Work on that
            // db.insert(t.tablename, null, values);

            Chat_Table ct = Chat_Table.getInstance();
            db.execSQL(ct.create());

            Dialog_Table dt = Dialog_Table.getInstance();
            db.execSQL(dt.create());


            ContentValues values = new ContentValues();

            values = t.insertQuery(data);
            Log.d("Table NAme :", t.tablename);
            Log.d("Data :", String.valueOf(data));

            db.close();


        }*/

    }


