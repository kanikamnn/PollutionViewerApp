package com.codeGeekerz.project.pollutionTracker.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by kanikam on 12/7/16.
 */
public class NetworkChangeReceiver extends BroadcastReceiver {

    private static final String TAG = "Network_Connection";

    @Override
    public void onReceive(Context context, Intent intent) {
        boolean status = ApplicationUIUtils.isNetworkAvailable(context);
        Log.i(TAG, String.valueOf(status));
    }
}
