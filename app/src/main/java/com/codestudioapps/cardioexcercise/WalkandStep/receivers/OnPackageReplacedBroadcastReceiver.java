
package com.codestudioapps.cardioexcercise.WalkandStep.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.preference.PreferenceManager;

import com.codestudioapps.cardioexcercise.R;
import com.codestudioapps.cardioexcercise.WalkandStep.utils.StepDetectionServiceHelper;



public class OnPackageReplacedBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        // init preferences
        PreferenceManager.setDefaultValues(context, R.xml.pref_general, false);
        PreferenceManager.setDefaultValues(context, R.xml.pref_notification, false);

        // start all services
        StepDetectionServiceHelper.startAllIfEnabled(context);
    }
}
