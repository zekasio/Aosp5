package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzfh extends IOException {
    public final int zza;

    public zzfh(int i) {
        this.zza = i;
    }

    public zzfh(String str, int i) {
        super(str);
        this.zza = i;
    }

    public zzfh(String str, Throwable th, int i) {
        super(str, th);
        this.zza = i;
    }

    public zzfh(Throwable th, int i) {
        super(th);
        this.zza = i;
    }
}
