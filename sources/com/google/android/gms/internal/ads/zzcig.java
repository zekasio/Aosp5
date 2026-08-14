package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcig implements zzetc {
    private final zzchy zza;
    private Context zzb;
    private String zzc;

    /* synthetic */ zzcig(zzchy zzchyVar, zzcif zzcifVar) {
        this.zza = zzchyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetc
    public final /* synthetic */ zzetc zza(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzetc
    public final /* synthetic */ zzetc zzb(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzetc
    public final zzetd zzc() {
        zzgxg.zzc(this.zzb, Context.class);
        zzgxg.zzc(this.zzc, String.class);
        return new zzcii(this.zza, this.zzb, this.zzc, null);
    }
}
