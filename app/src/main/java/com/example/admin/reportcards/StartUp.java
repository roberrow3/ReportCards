package com.example.admin.reportcards;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartUp extends AppCompatActivity {
    Button butStudent;
    Button butTeacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_up);

        butStudent = (Button)findViewById(R.id.butstu);
        butTeacher = (Button)findViewById(R.id.butTea);

        butStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myudpate = new Intent(StartUp.this,StudentLogin.class);
                startActivity(myudpate);
            }
        });

        butTeacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myudpate = new Intent(StartUp.this,MainActivity.class);
                startActivity(myudpate);
            }
        });
    }
}
