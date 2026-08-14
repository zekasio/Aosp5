package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.IOException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzfku {
    private static zzfku zza;
    private final String zzb;
    private final SharedPreferences zzc;

    private zzfku(Context context) {
        this.zzb = context.getPackageName();
        this.zzc = context.getSharedPreferences("paid_storage_sp", 0);
    }

    static zzfku zzb(Context context) {
        if (zza == null) {
            zza = new zzfku(context);
        }
        return zza;
    }

    final long zza(String str, long j) {
        return this.zzc.getLong(str, -1L);
    }

    @Nullable
    final String zzc(String str, String str2) {
        return this.zzc.getString(str, null);
    }

    final void zzd(String str, Object obj) throws IOException {
        boolean zCommit;
        if (obj instanceof String) {
            zCommit = this.zzc.edit().putString(str, (String) obj).commit();
        } else if (obj instanceof Long) {
            zCommit = this.zzc.edit().putLong(str, ((Long) obj).longValue()).commit();
        } else {
            if (!(obj instanceof Boolean)) {
                String str2 = "Unexpected object class " + String.valueOf(obj.getClass()) + " for app " + this.zzb;
                Log.e("PaidLifecycleSPHandler", str2);
                throw new IllegalArgumentException(str2);
            }
            zCommit = this.zzc.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
        }
        if (zCommit) {
            return;
        }
        String str3 = "Failed to store " + str + " for app " + this.zzb;
        Log.e("PaidLifecycleSPHandler", str3);
        throw new IOException(str3);
    }

    final void zze(String str) throws IOException {
        if (this.zzc.edit().remove(str).commit()) {
            return;
        }
        String str2 = "Failed to remove " + str + " for app " + this.zzb;
        Log.e("PaidLifecycleSPHandler", str2);
        throw new IOException(str2);
    }

    final boolean zzf(String str, boolean z) {
        return this.zzc.getBoolean(str, true);
    }

    final boolean zzg(String str) {
        return this.zzc.contains(str);
    }
}
