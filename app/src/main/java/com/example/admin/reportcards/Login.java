package com.example.admin.reportcards;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.admin.reportcards.R.id.btnLogin;

public class Login extends AppCompatActivity {
    private static final int DATABASE_VERSION= 1;
    SQLiteDatabase db;
    SQLiteOpenHelper openHelper;
    Button btnLogin;
    EditText txtEmail,txtPass;

    Cursor cursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        openHelper = new DatabaseHelper(this);
        db = openHelper.getReadableDatabase();
        btnLogin = (Button)  findViewById(R.id.btnLogin);
        txtEmail = (EditText) findViewById(R.id.txtEmail);
        txtPass = (EditText) findViewById(R.id.txtPass);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = txtEmail.getText().toString();
                String pass = txtPass.getText().toString();
                Cursor cursor = db.rawQuery("SELECT * FROM "+DatabaseHelper.TABLE_NAME+ " WHERE " + DatabaseHelper.COL_5+ " =? AND " + DatabaseHelper.COL_4+ " =?", new String[]{email, pass});
                if (cursor!=null){
                    if (cursor.getCount() > 0){
                        cursor.moveToNext();

                        Toast.makeText(getApplicationContext(), "login successfully", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(Login.this, Main6Activity.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(getApplicationContext(), "error", Toast.LENGTH_LONG).show();
                    }

                }
            }
        });



    }
}
