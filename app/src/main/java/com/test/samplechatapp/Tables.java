package com.test.samplechatapp;

import android.content.ContentValues;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by Pankaj on 5/3/2016.
 */
public class Tables {
    String tablename;

    public Tables(String name) {

    }

    public String createTable() {
        String createQuery = " ";

        switch (this.tablename) {
            case "contact":
                Log.d("Contact Table", "createTable:");
                createQuery = " CREATE TABLE contact (contact_id INTEGER PRIMARY KEY , contact_name TEXT) ";
                break;
            case "chats":
                Log.d("Chats", "Caht Table");
                createQuery = " CREATE TABLE chats (contact_id INTEGER  , dialog_id INTEGER , " +
                        "FOREIGN KEY(contact_id) REFERENCES contact(contact_id) , FOREIGN KEY(dialog_id) REFERENCES dialog(dialog_id)) ";
                break;
            case "dialogs":
                Log.d("Dialog :", "Inside Dialog");
                createQuery = " CREATE TABLE dialogs (content TEXT  , dialog_id INTEGER PRIMARY KEY) ";
                break;
        }

        return createQuery;
    }


    // Adding new entry into table

    ContentValues insertQuery(ArrayList data) {
        // Context context = null;
        // Database db=new Database(context,null,null,0);
        Log.d("Insert Data Functions", "table Working");
        ContentValues values = new ContentValues();
        switch (this.tablename) {
            case "contacts":
                values.put("contact_id", 2);
                values.put("contact_name", "Pankaj");
                break;
            case "dialog":
                values.put("dialog_id", "2");
                values.put("content", "Aim to Bring down Data Shit");
                break;
            case "chats":
                values.put("contact_id", 2);
                values.put("dialog_id", 2);
                break;
        }

        // Inserting Row
        //db.insert(this.tablename, null, values);

        //db.close(); // Closing database connection
        return values;
    }

/*

    IMPLEMENTED LATER


    public List<Messages> getAllmessages() {
        List<Messages> msgList = new ArrayList<Messages>();
        // Select All Query

        /*String selectQuery = "SELECT  * FROM " + TABLE_NAME;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Messages msg = new Messages();
                msg.setId(Integer.parseInt(cursor.getString(0)));
                msg.setMsg(cursor.getString(1));
                msg.setDate(cursor.getString(2));
                // Adding contact to list
                msgList.add(msg);
            } while (cursor.moveToNext());
        }

        // return contact list
        return msgList;

    }
*/

}
