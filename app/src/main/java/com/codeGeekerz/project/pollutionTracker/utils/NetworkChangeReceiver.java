package com.codeGeekerz.project.pollutionTracker.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by kanikam on 12/7/16.
 */
public class NetworkChangeReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        boolean status = ApplicationUIUtils.isNetworkAvailable(context);

        Toast.makeText(context, String.valueOf(status), Toast.LENGTH_LONG).show();
    }
}
