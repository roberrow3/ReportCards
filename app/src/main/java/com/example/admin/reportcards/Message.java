package com.example.admin.reportcards;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Admin on 18-Aug-17.
 */

public class Message {

    public static void message(Context context, String message) {


        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }

}


