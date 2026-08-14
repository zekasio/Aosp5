package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzvl implements Comparable {
    private final boolean zza;
    private final boolean zzb;

    public zzvl(zzaf zzafVar, int i) {
        this.zza = 1 == (zzafVar.zze & 1);
        this.zzb = zzwc.zzm(i, false);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzvl zzvlVar) {
        return zzfpz.zzj().zzd(this.zzb, zzvlVar.zzb).zzd(this.zza, zzvlVar.zza).zza();
    }
}
