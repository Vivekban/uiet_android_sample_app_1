package com.test.samplechatapp;

import android.content.ContentValues;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by Pankaj on 5/7/2016.
 */
public class Chat_Table implements Table {
    private static Chat_Table ourInstance = new Chat_Table();

    private Chat_Table() {
    }

    public static Chat_Table getInstance() {
        return ourInstance;
    }

    public String createTable() {
        String createQuery = " ";
        createQuery = " CREATE TABLE chats (contact_id INTEGER  , dialog_id INTEGER , " +
                "FOREIGN KEY(contact_id) REFERENCES contact(contact_id) , FOREIGN KEY(dialog_id) REFERENCES dialog(dialog_id)) ";
        return createQuery;
    }


    @Override
    public ContentValues insert(ArrayList a) {
        // put arraylist data in values and return it
        ContentValues values = new ContentValues();
        values.put("contact_id", 2);
        values.put("dialog_id", 2);
        return values;

    }

    @Override
    public void delete() {

    }

    @Override
    public void update() {

    }

    @Override
    public void select() {

    }

    @Override
    public String create() {
        String createQuery = " ";

        Log.d("Chats", "Caht Table");
        createQuery = " CREATE TABLE chats (contact_id INTEGER  , dialog_id INTEGER , " +
                "FOREIGN KEY(contact_id) REFERENCES contact(contact_id) , FOREIGN KEY(dialog_id) REFERENCES dialog(dialog_id)) ";
        return createQuery;

    }
}
