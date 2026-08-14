package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgwx implements zzgxl, zzgws {
    private static final Object zza = new Object();
    private volatile zzgxl zzb;
    private volatile Object zzc = zza;

    private zzgwx(zzgxl zzgxlVar) {
        this.zzb = zzgxlVar;
    }

    public static zzgws zza(zzgxl zzgxlVar) {
        if (zzgxlVar instanceof zzgws) {
            return (zzgws) zzgxlVar;
        }
        zzgxlVar.getClass();
        return new zzgwx(zzgxlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final Object zzb() {
        Object objZzb = this.zzc;
        Object obj = zza;
        if (objZzb == obj) {
            synchronized (this) {
                objZzb = this.zzc;
                if (objZzb == obj) {
                    objZzb = this.zzb.zzb();
                    Object obj2 = this.zzc;
                    if (obj2 != obj && obj2 != objZzb) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objZzb + ". This is likely due to a circular dependency.");
                    }
                    this.zzc = objZzb;
                    this.zzb = null;
                }
            }
        }
        return objZzb;
    }

    public static zzgxl zzc(zzgxl zzgxlVar) {
        zzgxlVar.getClass();
        return zzgxlVar instanceof zzgwx ? zzgxlVar : new zzgwx(zzgxlVar);
    }
}
