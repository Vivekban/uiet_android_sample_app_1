package com.test.samplechatapp;

import android.content.ContentValues;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ChatDialog extends AppCompatActivity implements View.OnClickListener {

    Tables chats = new Tables("chats");
    Tables contact = new Tables("contact");
    Tables dialog = new Tables("dialogs");

    EditText message;
    Button send_Button;
    TextView show_message;
    Database db = new Database(this, null, null, 0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_dialog);
        db.addMessage(null, null); //to invoke oncreate method of database class Create all tables



        message = (EditText) findViewById(R.id.message1); // message written
        send_Button = (Button) findViewById(R.id.send_button);  // send button
        show_message = (TextView) findViewById(R.id.message_show);  // message duisplayed
        send_Button.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        ContentValues contentValues = new ContentValues();
        switch (id) {

            case R.id.send_button:
                ArrayList data = new ArrayList();
                int contact_id = 10;
                data.add(contact_id);
                String contact_name = "Pankaj";
                data.add(contact_name);
                Contact_Table tb = Contact_Table.getInstance();
                contentValues = tb.insert(data);

                //chats.insertData(data); //chats table property insert data() where data is to be insert in db

                db.insertData(contact, data);
                Toast.makeText(getApplicationContext(), contact.tablename, Toast.LENGTH_LONG).show();


                int dialouge_id = 1;
                String initmessage = "Newest Message";
                data.add(dialouge_id);
                data.add(initmessage);
                db.insertData(dialog, data);
                Toast.makeText(getApplicationContext(), dialog.tablename, Toast.LENGTH_LONG).show();

                int dialog_chat_id = 10;
                int dialog_contact_id = 1;
                data.add(dialog_chat_id);
                data.add(dialog_contact_id);
                db.insertData(chats, data);
                Toast.makeText(getApplicationContext(), chats.tablename, Toast.LENGTH_LONG).show();


                show_message.setText(message.getText()); //once message is in db show it in db
                message.setText("");
                break;
        }
    }
}
