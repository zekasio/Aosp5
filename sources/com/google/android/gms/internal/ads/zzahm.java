package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzahm implements zzahn {
    private final List zza;
    private final zzabb[] zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private long zzf = -9223372036854775807L;

    public zzahm(List list) {
        this.zza = list;
        this.zzb = new zzabb[list.size()];
    }

    private final boolean zzf(zzen zzenVar, int i) {
        if (zzenVar.zza() == 0) {
            return false;
        }
        if (zzenVar.zzk() != i) {
            this.zzc = false;
        }
        this.zzd--;
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zza(zzen zzenVar) {
        if (this.zzc) {
            if (this.zzd != 2 || zzf(zzenVar, 32)) {
                if (this.zzd != 1 || zzf(zzenVar, 0)) {
                    int iZzc = zzenVar.zzc();
                    int iZza = zzenVar.zza();
                    for (zzabb zzabbVar : this.zzb) {
                        zzenVar.zzF(iZzc);
                        zzabbVar.zzq(zzenVar, iZza);
                    }
                    this.zze += iZza;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzb(zzzx zzzxVar, zzaiz zzaizVar) {
        for (int i = 0; i < this.zzb.length; i++) {
            zzaiw zzaiwVar = (zzaiw) this.zza.get(i);
            zzaizVar.zzc();
            zzabb zzabbVarZzv = zzzxVar.zzv(zzaizVar.zza(), 3);
            zzad zzadVar = new zzad();
            zzadVar.zzH(zzaizVar.zzb());
            zzadVar.zzS("application/dvbsubs");
            zzadVar.zzI(Collections.singletonList(zzaiwVar.zzb));
            zzadVar.zzK(zzaiwVar.zza);
            zzabbVarZzv.zzk(zzadVar.zzY());
            this.zzb[i] = zzabbVarZzv;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzc() {
        if (this.zzc) {
            if (this.zzf != -9223372036854775807L) {
                for (zzabb zzabbVar : this.zzb) {
                    zzabbVar.zzs(this.zzf, 1, this.zze, 0, null);
                }
            }
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzd(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.zzc = true;
        if (j != -9223372036854775807L) {
            this.zzf = j;
        }
        this.zze = 0;
        this.zzd = 2;
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zze() {
        this.zzc = false;
        this.zzf = -9223372036854775807L;
    }
}
