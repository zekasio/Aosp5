package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzjh implements Runnable {
    final /* synthetic */ ComponentName zza;
    final /* synthetic */ zzjl zzb;

    zzjh(zzjl zzjlVar, ComponentName componentName) {
        this.zzb = zzjlVar;
        this.zza = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjm.zzo(this.zzb.zza, this.zza);
    }
}
