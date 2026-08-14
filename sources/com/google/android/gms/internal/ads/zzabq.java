package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzabq implements zzabk {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    private zzabq(int i, int i2, int i3, int i4, int i5, int i6) {
        this.zza = i;
        this.zzb = i3;
        this.zzc = i4;
        this.zzd = i5;
        this.zze = i6;
    }

    public static zzabq zzb(zzen zzenVar) {
        int iZzg = zzenVar.zzg();
        zzenVar.zzG(12);
        int iZzg2 = zzenVar.zzg();
        int iZzg3 = zzenVar.zzg();
        int iZzg4 = zzenVar.zzg();
        zzenVar.zzG(4);
        int iZzg5 = zzenVar.zzg();
        int iZzg6 = zzenVar.zzg();
        zzenVar.zzG(8);
        return new zzabq(iZzg, iZzg2, iZzg3, iZzg4, iZzg5, iZzg6);
    }

    @Override // com.google.android.gms.internal.ads.zzabk
    public final int zza() {
        return 1752331379;
    }
}
