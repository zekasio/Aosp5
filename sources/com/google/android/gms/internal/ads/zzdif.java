package com.google.android.gms.internal.ads;

import androidx.collection.ArrayMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdif implements zzcvi {
    private final zzdgi zza;
    private final zzdgn zzb;

    public zzdif(zzdgi zzdgiVar, zzdgn zzdgnVar) {
        this.zza = zzdgiVar;
        this.zzb = zzdgnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzl() {
        zzdgi zzdgiVar = this.zza;
        if (zzdgiVar.zzu() == null) {
            return;
        }
        zzcei zzceiVarZzq = zzdgiVar.zzq();
        zzcei zzceiVarZzr = zzdgiVar.zzr();
        if (zzceiVarZzq == null) {
            zzceiVarZzq = zzceiVarZzr == null ? null : zzceiVarZzr;
        }
        if (!this.zzb.zzd() || zzceiVarZzq == null) {
            return;
        }
        zzceiVarZzq.zzd("onSdkImpression", new ArrayMap());
    }
}
