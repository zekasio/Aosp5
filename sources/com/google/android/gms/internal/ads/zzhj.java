package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhj extends zzbw {
    public static final zzn zzd = new zzn() { // from class: com.google.android.gms.internal.ads.zzhi
    };
    private static final String zzl = zzew.zzP(1001);
    private static final String zzm = zzew.zzP(1002);
    private static final String zzn = zzew.zzP(1003);
    private static final String zzo = zzew.zzP(1004);
    private static final String zzp = zzew.zzP(1005);
    private static final String zzq = zzew.zzP(1006);
    public final int zze;
    public final String zzf;
    public final int zzg;
    public final zzaf zzh;
    public final int zzi;
    public final zzbn zzj;
    final boolean zzk;

    private zzhj(int i, Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, false);
    }

    public static zzhj zzb(Throwable th, String str, int i, zzaf zzafVar, int i2, boolean z, int i3) {
        return new zzhj(1, th, null, i3, str, i, zzafVar, zzafVar == null ? 4 : i2, z);
    }

    public static zzhj zzc(IOException iOException, int i) {
        return new zzhj(0, iOException, i);
    }

    public static zzhj zzd(RuntimeException runtimeException, int i) {
        return new zzhj(2, runtimeException, i);
    }

    final zzhj zza(zzbn zzbnVar) {
        String message = getMessage();
        int i = zzew.zza;
        return new zzhj(message, getCause(), this.zzb, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, zzbnVar, this.zzc, this.zzk);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private zzhj(int i, Throwable th, String str, int i2, String str2, int i3, zzaf zzafVar, int i4, boolean z) {
        String str3;
        if (i == 0) {
            str3 = "Source error";
        } else if (i != 1) {
            str3 = "Unexpected runtime error";
        } else {
            str3 = str2 + " error, index=" + i3 + ", format=" + String.valueOf(zzafVar) + ", format_supported=" + zzew.zzM(i4);
        }
        this(TextUtils.isEmpty(null) ? str3 : str3.concat(": null"), th, i2, i, str2, i3, zzafVar, i4, null, SystemClock.elapsedRealtime(), z);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private zzhj(java.lang.String r9, java.lang.Throwable r10, int r11, int r12, java.lang.String r13, int r14, com.google.android.gms.internal.ads.zzaf r15, int r16, com.google.android.gms.internal.ads.zzbn r17, long r18, boolean r20) {
        /*
            r8 = this;
            r6 = r8
            r7 = r20
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r18
            r0.<init>(r1, r2, r3, r4)
            r0 = 0
            r1 = 1
            if (r7 == 0) goto L17
            r2 = r12
            if (r2 != r1) goto L15
            r2 = 1
            goto L18
        L15:
            r3 = 0
            goto L19
        L17:
            r2 = r12
        L18:
            r3 = 1
        L19:
            com.google.android.gms.internal.ads.zzdl.zzd(r3)
            if (r10 != 0) goto L1f
            goto L20
        L1f:
            r0 = 1
        L20:
            com.google.android.gms.internal.ads.zzdl.zzd(r0)
            r6.zze = r2
            r0 = r13
            r6.zzf = r0
            r0 = r14
            r6.zzg = r0
            r0 = r15
            r6.zzh = r0
            r0 = r16
            r6.zzi = r0
            r0 = r17
            r6.zzj = r0
            r6.zzk = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhj.<init>(java.lang.String, java.lang.Throwable, int, int, java.lang.String, int, com.google.android.gms.internal.ads.zzaf, int, com.google.android.gms.internal.ads.zzbn, long, boolean):void");
    }
}
