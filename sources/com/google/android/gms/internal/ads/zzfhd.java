package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfhd extends AsyncTask {
    private zzfhe zza;
    protected final zzfgv zzd;

    public zzfhd(zzfgv zzfgvVar, byte[] bArr) {
        this.zzd = zzfgvVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        zzfhe zzfheVar = this.zza;
        if (zzfheVar != null) {
            zzfheVar.zza(this);
        }
    }

    public final void zzb(zzfhe zzfheVar) {
        this.zza = zzfheVar;
    }
}
