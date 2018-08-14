package com.example.a17045679.quiz;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.util.Log;
import android.widget.Toast;

public class MessageReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {


        // Display in Toast
        Toast.makeText(context, "You have changed the wallpaper", Toast.LENGTH_LONG).show();

    }
}
