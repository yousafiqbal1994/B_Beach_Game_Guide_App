package bom.combeach.guidedtips;

import android.content.Context;

import com.flurry.android.FlurryAgent;

/**
 * Created by YouCaf Iqbal on 1/7/2017.
 */

public class FlurryAnalytics {
    public static void startSession(Context context) {
        FlurryAgent.onStartSession(context,"892QWGT58MS3C4F93VZG");
    }
    public static void stopSession(Context context) {
        FlurryAgent.onEndSession(context);
    }
}
