package com.example.servicedata;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BatteryManager;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver
{
    @Override
    public void onReceive(Context context, Intent intent)
    {
            int level=intent.getIntExtra(BatteryManager.EXTRA_LEVEL,0);
        Toast.makeText(context, ""+level, Toast.LENGTH_SHORT).show();
    }
}
