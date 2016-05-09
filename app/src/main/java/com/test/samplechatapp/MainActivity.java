package com.test.samplechatapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    Button b1;
    Button databse;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //hello kain
        //hello saif
        b1=(Button)findViewById(R.id.button);
        b1.setOnClickListener(this);
        databse = (Button) findViewById(R.id.database);
        databse.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                Intent i = new Intent(getApplicationContext(), PhoneAuthentication.class);
                startActivity(i);
                break;
            case R.id.database:
                Intent j = new Intent(getApplicationContext(), ChatDialog.class);
                startActivity(j);
                break;
        }

    }
}
