package com.test.samplechatapp;

import android.content.ContentValues;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by Pankaj on 5/7/2016.
 */
public class Contact_Table implements Table {
    private static Contact_Table ourInstance = new Contact_Table();

    private Contact_Table() {
    }

    public static Contact_Table getInstance() {
        return ourInstance;
    }

    public String createTable() {
        String createQuery = " ";

        Log.d("Chats", "Caht Table");
        createQuery = " CREATE TABLE chats (contact_id INTEGER  , dialog_id INTEGER , " +
                "FOREIGN KEY(contact_id) REFERENCES contact(contact_id) , FOREIGN KEY(dialog_id) REFERENCES dialog(dialog_id)) ";
        return createQuery;
    }


    @Override
    public ContentValues insert(ArrayList s) {
        // put arraylist data in values and return it
        ContentValues values = new ContentValues();
        values.put("contact_id", 1);
        values.put("contact_name", "Pankaj");
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
        Log.d("Contact Table", "createTable:");
        createQuery = " CREATE TABLE contact (contact_id INTEGER PRIMARY KEY , contact_name TEXT) ";
        return createQuery;

    }
}
