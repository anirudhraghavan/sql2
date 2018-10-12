package com.example.anirudh.sql;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    SQLiteDatabase mydatabase;
    EditText ed1,ed2,ed3;
    String name,no,email;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void onregister(View view) {
        ed1 = (EditText) findViewById(R.id.editText);
        ed2 = (EditText) findViewById(R.id.editText2);
        ed3 = (EditText) findViewById(R.id.editText3);

        name = ed1.getText().toString();
        no = ed3.getText().toString();
        email = ed2.getText().toString();

        try {

            mydatabase = this.openOrCreateDatabase("users", MODE_PRIVATE, null);
            mydatabase.execSQL("CREATE TABLE IF NOT EXISTS users(name VARCHAR,email VARCHAR,phone VARCHAR)");
            mydatabase.execSQL("INSERT INTO users VALUES('" + name + "','" + email + "','" + no + "')");


        } catch (Exception e) {

        }
    }

        public void onview(View view)
        {

            Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
            startActivity(intent);
        }










    }







