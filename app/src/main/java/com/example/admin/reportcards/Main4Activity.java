package com.example.admin.reportcards;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main4Activity extends AppCompatActivity {
    DatabaseHelper helper;
    EditText delete, studentName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        helper = new DatabaseHelper(this);

        delete = (EditText) findViewById(R.id.studentID);
        studentName = (EditText) findViewById(R.id.StudentName);


    }


    public void delete( View view) {


        String StudentID = delete.getText().toString();
        String unumber = studentName.getText().toString();

        if (StudentID.isEmpty()  || unumber.isEmpty()) {

            Message.message(getApplicationContext(), "Enter Data");
        } else {

            int a = helper.delete(StudentID, unumber);

            if (a <= 0) {
                Message.message(getApplicationContext(), "Unsuccessful");
                delete.setText("");
            } else {
                Message.message(this, "DELETED");
                delete.setText("");
            }
        }

        viewdata();
    }
    public void viewdata()
    {

        Intent y = new Intent(this,Main2Activity.class);
        startActivity(y);



    }

}
