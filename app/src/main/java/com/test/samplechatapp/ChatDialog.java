package com.test.samplechatapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class ChatDialog extends AppCompatActivity implements View.OnClickListener {


//  Database database=new Database(this,"fsd",null,1);

    EditText message;
    Button send_Button;
    TextView show_message;
    TextView test_contact;
    TextView test_dialogs;
    TextView test_chats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_dialog);

        // creating singleton class objects
        Database_Handler db = Database_Handler.getInstance(getApplicationContext(), "test", null, 1);
        Contact_Table contact_table = Contact_Table.getInstance(getApplicationContext(), "test", null, 1);
        Chat_Table chat_table = Chat_Table.getInstance(getApplicationContext(), "test", null, 1);
        Dialog_Table dialog_table = Dialog_Table.getInstance(getApplicationContext(), "text", null, 1);


        //   database.addMessage(null,null);
        db.addMessage(null, null); //to invoke oncreate method of database class Create all tables


        contact_table.setTablename("contact_table");
        chat_table.setTablename("chatsTable");
        dialog_table.setTablename("dialogTable");


        if (contact_table.checkExistenceTable()) {
            contact_table.create();
        }
        if (dialog_table.checkExistenceTable()) {
            dialog_table.create();
        }
        if (chat_table.checkExistenceTable()) {
            chat_table.create();
        }

        ArrayList contact = new ArrayList();
        ArrayList dialog = new ArrayList();
        ArrayList chats = new ArrayList();

        String[][] contact_data = {{"1", "Pankaj"}, {"2", "Mohd. Saif"}};
        String[][] dialog_data = {{"1", "Hey whatsup Hows u Bro"}, {"2", "Amazing Bro..!!!"}};
        String[][] chat_data = {{"1", "1"}, {"2", "2"}};

        contact_table.insert(contact_data);
        dialog_table.insert(dialog_data);
        chat_table.insert(chat_data);



        message = (EditText) findViewById(R.id.message1); // message written
        send_Button = (Button) findViewById(R.id.send_button);  // send button
        show_message = (TextView) findViewById(R.id.message_show);  // message duisplayed
        send_Button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
       /* int id = v.getId();
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

   //             db.insertData(contact, data);
     //           Toast.makeText(getApplicationContext(), contact.tablename, Toast.LENGTH_LONG).show();


                int dialouge_id = 1;
                String initmessage = "Newest Message";
                data.add(dialouge_id);
                data.add(initmessage);
       //         db.insertData(dialog, data);
         //       Toast.makeText(getApplicationContext(), dialog.tablename, Toast.LENGTH_LONG).show();

                int dialog_chat_id = 10;
                int dialog_contact_id = 1;
                data.add(dialog_chat_id);
                data.add(dialog_contact_id);
         //       db.insertData(chats, data);
         //       Toast.makeText(getApplicationContext(), chats.tablename, Toast.LENGTH_LONG).show();


                show_message.setText(message.getText()); //once message is in db show it in db
                message.setText("");
                break;
        }*/
    }
}
