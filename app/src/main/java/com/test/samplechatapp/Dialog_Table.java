package com.test.samplechatapp;

import android.content.ContentValues;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by Pankaj on 5/7/2016.
 */
public class Dialog_Table implements Table {
    private static Dialog_Table ourInstance = new Dialog_Table();

    private Dialog_Table() {
    }

    public static Dialog_Table getInstance() {
        return ourInstance;
    }

    @Override
    public ContentValues insert(ArrayList a) {
        ContentValues values = new ContentValues();
        values.put("dialog_id", "2");
        values.put("content", "Aim to Bring down Data Shit");
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
        String createQuery;
        Log.d("Dialog :", "Inside Dialog");
        createQuery = " CREATE TABLE dialogs (content TEXT  , dialog_id INTEGER PRIMARY KEY) ";
        return createQuery;

    }
}
