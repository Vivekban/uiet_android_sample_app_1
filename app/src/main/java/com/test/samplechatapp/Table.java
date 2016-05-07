package com.test.samplechatapp;

import android.content.ContentValues;

import java.util.ArrayList;

/**
 * Created by Pankaj on 5/7/2016.
 */
public interface Table {

    public ContentValues insert(ArrayList a);

    public void delete();

    public void update();

    public void select();

    public String create();

}
