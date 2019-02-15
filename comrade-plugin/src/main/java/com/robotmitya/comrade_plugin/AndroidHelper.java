package com.robotmitya.comrade_plugin;

import android.app.Activity;
import android.content.Context;
import android.os.Vibrator;

/**
 *
 * Created by dmitrydzz on 14.02.19.
 */
public class AndroidHelper {

    public int getValue() {
        return 1974;
    }

    public void vibrate(final Activity activity, final long millis) {
        Vibrator v = (Vibrator) activity.getSystemService(Context.VIBRATOR_SERVICE);
        if (v != null && v.hasVibrator())
            v.vibrate(millis);
    }
}
