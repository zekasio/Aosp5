package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfoc extends zzfof {
    final /* synthetic */ zzfod zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfoc(zzfod zzfodVar, zzfoh zzfohVar, CharSequence charSequence) {
        super(zzfohVar, charSequence);
        this.zza = zzfodVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfof
    public final int zzc(int i) {
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzfof
    public final int zzd(int i) {
        int i2 = i + 4000;
        if (i2 < this.zzb.length()) {
            return i2;
        }
        return -1;
    }
}
