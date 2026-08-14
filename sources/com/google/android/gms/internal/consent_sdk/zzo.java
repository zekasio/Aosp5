package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentRequestParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzo {
    private final zzn zza;
    private final Activity zzb;
    private final ConsentDebugSettings zzc;
    private final ConsentRequestParameters zzd;

    /* synthetic */ zzo(zzn zznVar, Activity activity, ConsentDebugSettings consentDebugSettings, ConsentRequestParameters consentRequestParameters, zzm zzmVar) {
        this.zza = zznVar;
        this.zzb = activity;
        this.zzc = consentDebugSettings;
        this.zzd = consentRequestParameters;
    }

    static /* synthetic */ zzbu zza(zzo zzoVar) throws zzj {
        Bundle bundle;
        List<zzbp> arrayList;
        List<zzbr> listEmptyList;
        PackageInfo packageInfo;
        zzbu zzbuVar = new zzbu();
        String strZza = zzoVar.zzd.zza();
        if (TextUtils.isEmpty(strZza)) {
            try {
                bundle = zzoVar.zza.zza.getPackageManager().getApplicationInfo(zzoVar.zza.zza.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            if (bundle != null) {
                strZza = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
            }
            if (TextUtils.isEmpty(strZza)) {
                throw new zzj(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        }
        zzbuVar.zza = strZza;
        zza zzaVarZza = zzoVar.zza.zzb.zza();
        if (zzaVarZza != null) {
            zzbuVar.zzc = zzaVarZza.zza;
            zzbuVar.zzb = Boolean.valueOf(zzaVarZza.zzb);
        }
        if (zzoVar.zzc.isTestDevice()) {
            arrayList = new ArrayList<>();
            int debugGeography = zzoVar.zzc.getDebugGeography();
            if (debugGeography == 1) {
                arrayList.add(zzbp.GEO_OVERRIDE_EEA);
            } else if (debugGeography == 2) {
                arrayList.add(zzbp.GEO_OVERRIDE_NON_EEA);
            }
            arrayList.add(zzbp.PREVIEWING_DEBUG_MESSAGES);
        } else {
            arrayList = Collections.emptyList();
        }
        zzbuVar.zzk = arrayList;
        zzbuVar.zzg = zzoVar.zza.zzc.zzb();
        zzbuVar.zzf = Boolean.valueOf(zzoVar.zzd.isTagForUnderAgeOfConsent());
        zzbuVar.zze = Build.VERSION.SDK_INT >= 21 ? Locale.getDefault().toLanguageTag() : Locale.getDefault().toString();
        zzbq zzbqVar = new zzbq();
        zzbqVar.zzb = Integer.valueOf(Build.VERSION.SDK_INT);
        zzbqVar.zza = Build.MODEL;
        zzbqVar.zzc = 2;
        zzbuVar.zzd = zzbqVar;
        Configuration configuration = zzoVar.zza.zza.getResources().getConfiguration();
        zzoVar.zza.zza.getResources().getConfiguration();
        zzbs zzbsVar = new zzbs();
        zzbsVar.zza = Integer.valueOf(configuration.screenWidthDp);
        zzbsVar.zzb = Integer.valueOf(configuration.screenHeightDp);
        zzbsVar.zzc = Double.valueOf(zzoVar.zza.zza.getResources().getDisplayMetrics().density);
        if (Build.VERSION.SDK_INT < 28) {
            listEmptyList = Collections.emptyList();
        } else {
            Activity activity = zzoVar.zzb;
            Window window = activity == null ? null : activity.getWindow();
            View decorView = window == null ? null : window.getDecorView();
            WindowInsets rootWindowInsets = decorView == null ? null : decorView.getRootWindowInsets();
            DisplayCutout displayCutout = rootWindowInsets == null ? null : rootWindowInsets.getDisplayCutout();
            if (displayCutout == null) {
                listEmptyList = Collections.emptyList();
            } else {
                displayCutout.getSafeInsetBottom();
                ArrayList arrayList2 = new ArrayList();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    if (rect != null) {
                        zzbr zzbrVar = new zzbr();
                        zzbrVar.zzb = Integer.valueOf(rect.left);
                        zzbrVar.zzc = Integer.valueOf(rect.right);
                        zzbrVar.zza = Integer.valueOf(rect.top);
                        zzbrVar.zzd = Integer.valueOf(rect.bottom);
                        arrayList2.add(zzbrVar);
                    }
                }
                listEmptyList = arrayList2;
            }
        }
        zzbsVar.zzd = listEmptyList;
        zzbuVar.zzh = zzbsVar;
        Application application = zzoVar.zza.zza;
        try {
            packageInfo = zzoVar.zza.zza.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        zzbo zzboVar = new zzbo();
        zzboVar.zza = application.getPackageName();
        CharSequence applicationLabel = zzoVar.zza.zza.getPackageManager().getApplicationLabel(zzoVar.zza.zza.getApplicationInfo());
        zzboVar.zzb = applicationLabel != null ? applicationLabel.toString() : null;
        if (packageInfo != null) {
            zzboVar.zzc = Long.toString(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
        }
        zzbuVar.zzi = zzboVar;
        zzbt zzbtVar = new zzbt();
        zzbtVar.zza = "2.0.0";
        zzbuVar.zzj = zzbtVar;
        return zzbuVar;
    }
}
