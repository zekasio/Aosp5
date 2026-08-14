package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbyt;
import com.tapjoy.TapjoyConstants;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzu extends zzt {
    static final boolean zzf(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final boolean zze(Activity activity, Configuration configuration) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzes)).booleanValue()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeu)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        com.google.android.gms.ads.internal.client.zzay.zzb();
        int iZzy = zzbyt.zzy(activity, configuration.screenHeightDp);
        int iZzy2 = zzbyt.zzy(activity, configuration.screenWidthDp);
        WindowManager windowManager = (WindowManager) activity.getApplicationContext().getSystemService("window");
        com.google.android.gms.ads.internal.zzt.zzp();
        DisplayMetrics displayMetricsZzq = zzs.zzq(windowManager);
        int i = displayMetricsZzq.heightPixels;
        int i2 = displayMetricsZzq.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", TapjoyConstants.TJC_DEVICE_PLATFORM_TYPE);
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        double d = activity.getResources().getDisplayMetrics().density;
        Double.isNaN(d);
        int iRound = ((int) Math.round(d + 0.5d)) * ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeq)).intValue();
        return (zzf(i, iZzy + dimensionPixelSize, iRound) && zzf(i2, iZzy2, iRound)) ? false : true;
    }
}
