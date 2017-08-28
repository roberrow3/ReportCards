package com.example.admin.reportcards;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    DatabaseHelper helper;
    ListView myList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        myList = (ListView) findViewById(R.id.list);

        helper = new DatabaseHelper(this);


        ArrayList<String> array;
        array = helper.getData();

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_activated_1, array);
        myList.setAdapter(arrayAdapter);

    }

//
//    public void update(){
//        Intent myudpate = new Intent(Main2Activity.this,Main3Activity.class);
//        startActivity(myudpate);
//    }
//
//    public void delete(){
//        Intent myudpate = new Intent(Main2Activity.this,Main4Activity.class);
//        startActivity(myudpate);
//    }
//
//    public void Save() {
//        Intent myudpate = new Intent(Main2Activity.this, Main5Activity.class);
//        startActivity(myudpate);
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//
//        getMenuInflater().inflate(R.menu.menu, menu);
//        return true;
//    }
//
//
//
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//
//        switch (item.getItemId()) {
//
//            case R.id.Save:
//                Save();
//                return true;
//
//            case R.id.upddate:
//
//                update();
//                return true;
//
//            case R.id.delete:
//
//                delete();
//                return true;
//
//        }
//        return super.onOptionsItemSelected(item);
//    }
}
