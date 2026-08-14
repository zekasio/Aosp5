package com.vungle.warren.utility;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.drive.DriveFile;
import com.vungle.warren.ui.PresenterAdOpenCallback;
import com.vungle.warren.utility.ActivityManager;
import java.net.URISyntaxException;

/* JADX INFO: loaded from: classes3.dex */
public class ExternalRouter {
    public static final String TAG = "ExternalRouter";

    public static boolean launch(String str, String str2, Context context, ActivityManager.LeftApplicationCallback leftApplicationCallback, boolean z, PresenterAdOpenCallback presenterAdOpenCallback) {
        if ((TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) || context == null) {
            return false;
        }
        try {
            ActivityManager.startWhenForeground(context, getIntentFromUrl(str, z), getIntentFromUrl(str2, z), leftApplicationCallback, presenterAdOpenCallback);
            return true;
        } catch (Exception e) {
            String str3 = TAG;
            Log.e(str3, "Error while opening url" + e.getLocalizedMessage());
            Log.d(str3, "Cannot open url " + str2);
            return false;
        }
    }

    private static Intent getIntentFromUrl(String str, boolean z) {
        Intent uri = null;
        try {
            if (!TextUtils.isEmpty(str)) {
                uri = Intent.parseUri(str, 0);
            }
            if (uri != null && z) {
                uri.setFlags(DriveFile.MODE_READ_ONLY);
            }
        } catch (URISyntaxException e) {
            Log.e(TAG, "url format is not correct " + e.getLocalizedMessage());
        }
        return uri;
    }
}
