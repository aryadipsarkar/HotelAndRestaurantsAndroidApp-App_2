package com.example.arya.project3_a2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by arya's on 10/25/2016.
 */
public class broadcast_receiver extends BroadcastReceiver {
    //Receiving the Intent with the OnReceive() function
    public void onReceive(Context context, Intent intent) {
       //Getting the extra data sent with the intent which determines which button is clicked
        String message=intent.getStringExtra("message");
        //Generating a Toast Message
        Toast.makeText(context, "(A2-App)The Broadcast Sender clicked on "+ message,
                    Toast.LENGTH_LONG).show();
    }
}
