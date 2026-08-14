package com.google.android.gms.ads.internal.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzav implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ boolean zzd;

    zzav(zzaw zzawVar, Context context, String str, boolean z, boolean z2) {
        this.zza = context;
        this.zzb = str;
        this.zzc = z;
        this.zzd = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzt.zzp();
        AlertDialog.Builder builderZzG = zzs.zzG(this.zza);
        builderZzG.setMessage(this.zzb);
        if (this.zzc) {
            builderZzG.setTitle("Error");
        } else {
            builderZzG.setTitle("Info");
        }
        if (this.zzd) {
            builderZzG.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builderZzG.setPositiveButton("Learn More", new zzau(this));
            builderZzG.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builderZzG.create().show();
    }
}
