package com.robotmitya.comrade_plugin;

import android.app.Activity;
import android.content.Context;
import android.os.Vibrator;

/**
 *
 * Created by dmitrydzz on 14.02.19.
 */
@SuppressWarnings("unused")
public class AndroidHelper {

    private final Activity mActivity;

    public AndroidHelper(final Activity activity) {
        mActivity = activity;
    }

    public void vibrate(final long millis) {
        Vibrator v = (Vibrator) mActivity.getSystemService(Context.VIBRATOR_SERVICE);
        if (v != null && v.hasVibrator())
            v.vibrate(millis);
    }
}
