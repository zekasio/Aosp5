package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcjo implements zzewh {
    private final zzchy zza;
    private Context zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzq zzd;

    /* synthetic */ zzcjo(zzchy zzchyVar, zzcjn zzcjnVar) {
        this.zza = zzchyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzewh
    public final /* synthetic */ zzewh zza(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        zzqVar.getClass();
        this.zzd = zzqVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzewh
    public final /* synthetic */ zzewh zzb(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzewh
    public final /* synthetic */ zzewh zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzewh
    public final zzewi zzd() {
        zzgxg.zzc(this.zzb, Context.class);
        zzgxg.zzc(this.zzc, String.class);
        zzgxg.zzc(this.zzd, com.google.android.gms.ads.internal.client.zzq.class);
        return new zzcjq(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
