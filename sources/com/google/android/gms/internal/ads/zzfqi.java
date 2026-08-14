package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfqi extends zzfom {
    private final zzfqk zza;

    zzfqi(zzfqk zzfqkVar, int i) {
        super(zzfqkVar.size(), i);
        this.zza = zzfqkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfom
    protected final Object zza(int i) {
        return this.zza.get(i);
    }
}
