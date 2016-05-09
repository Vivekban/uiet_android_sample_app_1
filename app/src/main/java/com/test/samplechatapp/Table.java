package com.test.samplechatapp;

import java.util.ArrayList;

/**
 * Created by Pankaj on 5/7/2016.
 */
public interface Table {

    public void insert(String[][] s);

    public void delete();

    public void update();

    public ArrayList select();

    public void create();

    public String createDatabase();

    public boolean checkExistenceTable();


}
