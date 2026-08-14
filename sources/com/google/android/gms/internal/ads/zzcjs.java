package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcjs implements zzexv {
    private final zzchy zza;
    private Context zzb;
    private String zzc;

    /* synthetic */ zzcjs(zzchy zzchyVar, zzcjr zzcjrVar) {
        this.zza = zzchyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexv
    public final /* synthetic */ zzexv zza(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzexv
    public final /* synthetic */ zzexv zzb(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzexv
    public final zzexw zzc() {
        zzgxg.zzc(this.zzb, Context.class);
        return new zzcju(this.zza, this.zzb, this.zzc, null);
    }
}
