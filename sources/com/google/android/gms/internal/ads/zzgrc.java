package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzgrc {
    private static final zzgpy zzb = zzgpy.zza;
    protected volatile zzgrw zza;
    private volatile zzgpe zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgrc)) {
            return false;
        }
        zzgrc zzgrcVar = (zzgrc) obj;
        zzgrw zzgrwVar = this.zza;
        zzgrw zzgrwVar2 = zzgrcVar.zza;
        if (zzgrwVar == null && zzgrwVar2 == null) {
            return zzb().equals(zzgrcVar.zzb());
        }
        if (zzgrwVar != null && zzgrwVar2 != null) {
            return zzgrwVar.equals(zzgrwVar2);
        }
        if (zzgrwVar != null) {
            zzgrcVar.zzc(zzgrwVar.zzbf());
            return zzgrwVar.equals(zzgrcVar.zza);
        }
        zzc(zzgrwVar2.zzbf());
        return this.zza.equals(zzgrwVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((zzgpa) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzaz();
        }
        return 0;
    }

    public final zzgpe zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            if (this.zzc != null) {
                return this.zzc;
            }
            if (this.zza == null) {
                this.zzc = zzgpe.zzb;
            } else {
                this.zzc = this.zza.zzau();
            }
            return this.zzc;
        }
    }

    protected final void zzc(zzgrw zzgrwVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza == null) {
                try {
                    this.zza = zzgrwVar;
                    this.zzc = zzgpe.zzb;
                } catch (zzgqy unused) {
                    this.zza = zzgrwVar;
                    this.zzc = zzgpe.zzb;
                }
            }
        }
    }
}
