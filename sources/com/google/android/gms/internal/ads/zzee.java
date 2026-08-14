package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzee {
    private static final Object zza = new Object();
    private static final zzed zzb = zzed.zza;

    @Pure
    public static void zza(String str, String str2) {
        synchronized (zza) {
            Log.d(str, str2);
        }
    }

    @Pure
    public static void zzb(String str, String str2) {
        synchronized (zza) {
            Log.e(str, str2);
        }
    }

    @Pure
    public static void zzc(String str, String str2, Throwable th) {
        zzb(str, zzg(str2, th));
    }

    @Pure
    public static void zzd(String str, String str2) {
        synchronized (zza) {
            Log.i(str, str2);
        }
    }

    @Pure
    public static void zze(String str, String str2) {
        synchronized (zza) {
            Log.w(str, str2);
        }
    }

    @Pure
    public static void zzf(String str, String str2, Throwable th) {
        zze(str, zzg(str2, th));
    }

    @Pure
    private static String zzg(String str, Throwable th) {
        String strReplace;
        synchronized (zza) {
            try {
                if (th != null) {
                    Throwable cause = th;
                    while (true) {
                        if (cause == null) {
                            strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                            break;
                        }
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                        } else {
                            cause = cause.getCause();
                        }
                    }
                } else {
                    strReplace = null;
                }
            } finally {
            }
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        return str + "\n  " + strReplace.replace("\n", "\n  ") + "\n";
    }
}
