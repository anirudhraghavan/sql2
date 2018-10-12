package com.example.anirudh.sql;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    SQLiteDatabase mydatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        try {


            mydatabase = this.

                    openOrCreateDatabase("users", MODE_PRIVATE, null);

            Cursor cursor = mydatabase.rawQuery("SELECT * FROM users", null);
            int nameindex = cursor.getColumnIndex("name");
            int emailindex = cursor.getColumnIndex("email");   int noindex = cursor.getColumnIndex("phone");

            cursor.moveToFirst();
            while (cursor != null)

            {
                EditText ed1 = (EditText) findViewById(R.id.editText);
                ed1.setText(cursor.getString(nameindex));
                EditText ed2 = (EditText) findViewById(R.id.editText2);
                ed2.setText(cursor.getString(emailindex));
                EditText ed3 = (EditText) findViewById(R.id.editText3);
                ed3.setText(cursor.getString(noindex));
                cursor.moveToNext();

            }

        } catch (Exception e) {

        }


    }
}

