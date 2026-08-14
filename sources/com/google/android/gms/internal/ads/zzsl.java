package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzsl extends zzsg {
    public static final Object zzd = new Object();
    private final Object zze;
    private final Object zzf;

    private zzsl(zzcn zzcnVar, Object obj, Object obj2) {
        super(zzcnVar);
        this.zze = obj;
        this.zzf = obj2;
    }

    public static zzsl zzq(zzbg zzbgVar) {
        return new zzsl(new zzsm(zzbgVar), zzcm.zza, zzd);
    }

    public static zzsl zzr(zzcn zzcnVar, Object obj, Object obj2) {
        return new zzsl(zzcnVar, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzcn
    public final int zza(Object obj) {
        Object obj2;
        zzcn zzcnVar = this.zzc;
        if (zzd.equals(obj) && (obj2 = this.zzf) != null) {
            obj = obj2;
        }
        return zzcnVar.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzcn
    public final zzck zzd(int i, zzck zzckVar, boolean z) {
        this.zzc.zzd(i, zzckVar, z);
        if (zzew.zzU(zzckVar.zzc, this.zzf) && z) {
            zzckVar.zzc = zzd;
        }
        return zzckVar;
    }

    @Override // com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzcn
    public final zzcm zze(int i, zzcm zzcmVar, long j) {
        this.zzc.zze(i, zzcmVar, j);
        if (zzew.zzU(zzcmVar.zzc, this.zze)) {
            zzcmVar.zzc = zzcm.zza;
        }
        return zzcmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzcn
    public final Object zzf(int i) {
        Object objZzf = this.zzc.zzf(i);
        return zzew.zzU(objZzf, this.zzf) ? zzd : objZzf;
    }

    public final zzsl zzp(zzcn zzcnVar) {
        return new zzsl(zzcnVar, this.zze, this.zzf);
    }
}
