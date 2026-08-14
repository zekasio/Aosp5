package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzapr {
    protected volatile Boolean zzb;
    private final zzaqx zze;
    private static final ConditionVariable zzc = new ConditionVariable();
    protected static volatile zzfjr zza = null;
    private static volatile Random zzd = null;

    public zzapr(zzaqx zzaqxVar) {
        this.zze = zzaqxVar;
        zzaqxVar.zzk().execute(new zzapq(this));
    }

    public static final int zzd() {
        try {
            return Build.VERSION.SDK_INT >= 21 ? ThreadLocalRandom.current().nextInt() : zze().nextInt();
        } catch (RuntimeException unused) {
            return zze().nextInt();
        }
    }

    private static Random zze() {
        if (zzd == null) {
            synchronized (zzapr.class) {
                if (zzd == null) {
                    zzd = new Random();
                }
            }
        }
        return zzd;
    }

    public final void zzc(int i, int i2, long j, String str, Exception exc) {
        try {
            zzc.block();
            if (!this.zzb.booleanValue() || zza == null) {
                return;
            }
            zzamh zzamhVarZza = zzaml.zza();
            zzamhVarZza.zza(this.zze.zza.getPackageName());
            zzamhVarZza.zze(j);
            if (str != null) {
                zzamhVarZza.zzb(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                zzamhVarZza.zzf(stringWriter.toString());
                zzamhVarZza.zzd(exc.getClass().getName());
            }
            zzfjq zzfjqVarZza = zza.zza(((zzaml) zzamhVarZza.zzal()).zzax());
            zzfjqVarZza.zza(i);
            if (i2 != -1) {
                zzfjqVarZza.zzb(i2);
            }
            zzfjqVarZza.zzc();
        } catch (Exception unused) {
        }
    }
}
