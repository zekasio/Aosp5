package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zztb {
    public final int zza;
    public final zzss zzb;
    private final CopyOnWriteArrayList zzc;

    public zztb() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    private zztb(CopyOnWriteArrayList copyOnWriteArrayList, int i, zzss zzssVar, long j) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzssVar;
    }

    private static final long zzn(long j) {
        long jZzz = zzew.zzz(j);
        if (jZzz == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jZzz;
    }

    public final zztb zza(int i, zzss zzssVar, long j) {
        return new zztb(this.zzc, 0, zzssVar, 0L);
    }

    public final void zzb(Handler handler, zztc zztcVar) {
        this.zzc.add(new zzta(handler, zztcVar));
    }

    public final void zzc(final zzso zzsoVar) {
        for (zzta zztaVar : this.zzc) {
            final zztc zztcVar = zztaVar.zzb;
            zzew.zzZ(zztaVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzsv
                @Override // java.lang.Runnable
                public final void run() {
                    zztb zztbVar = this.zza;
                    zztcVar.zzaf(0, zztbVar.zzb, zzsoVar);
                }
            });
        }
    }

    public final void zzd(int i, zzaf zzafVar, int i2, Object obj, long j) {
        zzc(new zzso(1, i, zzafVar, 0, null, zzn(j), -9223372036854775807L));
    }

    public final void zze(final zzsj zzsjVar, final zzso zzsoVar) {
        for (zzta zztaVar : this.zzc) {
            final zztc zztcVar = zztaVar.zzb;
            zzew.zzZ(zztaVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzsw
                @Override // java.lang.Runnable
                public final void run() {
                    zztb zztbVar = this.zza;
                    zztcVar.zzag(0, zztbVar.zzb, zzsjVar, zzsoVar);
                }
            });
        }
    }

    public final void zzf(zzsj zzsjVar, int i, int i2, zzaf zzafVar, int i3, Object obj, long j, long j2) {
        zze(zzsjVar, new zzso(1, -1, null, 0, null, zzn(j), zzn(j2)));
    }

    public final void zzg(final zzsj zzsjVar, final zzso zzsoVar) {
        for (zzta zztaVar : this.zzc) {
            final zztc zztcVar = zztaVar.zzb;
            zzew.zzZ(zztaVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzsz
                @Override // java.lang.Runnable
                public final void run() {
                    zztb zztbVar = this.zza;
                    zztcVar.zzah(0, zztbVar.zzb, zzsjVar, zzsoVar);
                }
            });
        }
    }

    public final void zzh(zzsj zzsjVar, int i, int i2, zzaf zzafVar, int i3, Object obj, long j, long j2) {
        zzg(zzsjVar, new zzso(1, -1, null, 0, null, zzn(j), zzn(j2)));
    }

    public final void zzi(final zzsj zzsjVar, final zzso zzsoVar, final IOException iOException, final boolean z) {
        for (zzta zztaVar : this.zzc) {
            final zztc zztcVar = zztaVar.zzb;
            zzew.zzZ(zztaVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzsx
                @Override // java.lang.Runnable
                public final void run() {
                    zztb zztbVar = this.zza;
                    zztcVar.zzai(0, zztbVar.zzb, zzsjVar, zzsoVar, iOException, z);
                }
            });
        }
    }

    public final void zzj(zzsj zzsjVar, int i, int i2, zzaf zzafVar, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        zzi(zzsjVar, new zzso(1, -1, null, 0, null, zzn(j), zzn(j2)), iOException, z);
    }

    public final void zzk(final zzsj zzsjVar, final zzso zzsoVar) {
        for (zzta zztaVar : this.zzc) {
            final zztc zztcVar = zztaVar.zzb;
            zzew.zzZ(zztaVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzsy
                @Override // java.lang.Runnable
                public final void run() {
                    zztb zztbVar = this.zza;
                    zztcVar.zzaj(0, zztbVar.zzb, zzsjVar, zzsoVar);
                }
            });
        }
    }

    public final void zzl(zzsj zzsjVar, int i, int i2, zzaf zzafVar, int i3, Object obj, long j, long j2) {
        zzk(zzsjVar, new zzso(1, -1, null, 0, null, zzn(j), zzn(j2)));
    }

    public final void zzm(zztc zztcVar) {
        for (zzta zztaVar : this.zzc) {
            if (zztaVar.zzb == zztcVar) {
                this.zzc.remove(zztaVar);
            }
        }
    }
}
