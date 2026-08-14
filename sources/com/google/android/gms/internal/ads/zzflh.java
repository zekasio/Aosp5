package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzflh extends zzfma {
    private int zza;
    private String zzb;
    private byte zzc;

    zzflh() {
    }

    @Override // com.google.android.gms.internal.ads.zzfma
    public final zzfma zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfma
    public final zzfma zzb(int i) {
        this.zza = i;
        this.zzc = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfma
    public final zzfmb zzc() {
        if (this.zzc == 1) {
            return new zzflj(this.zza, this.zzb, null);
        }
        throw new IllegalStateException("Missing required properties: statusCode");
    }
}
