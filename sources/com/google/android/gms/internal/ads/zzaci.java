package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaci implements zzzu {
    private zzzx zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private zzaef zzg;
    private zzzv zzh;
    private zzacl zzi;
    private zzagc zzj;
    private final zzen zza = new zzen(6);
    private long zzf = -1;

    private final int zze(zzzv zzzvVar) throws IOException {
        this.zza.zzC(2);
        ((zzzk) zzzvVar).zzm(this.zza.zzH(), 0, 2, false);
        return this.zza.zzo();
    }

    private final void zzf() {
        zzg(new zzbp[0]);
        zzzx zzzxVar = this.zzb;
        zzzxVar.getClass();
        zzzxVar.zzC();
        this.zzb.zzN(new zzaaw(-9223372036854775807L, 0L));
        this.zzc = 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e4  */
    @Override // com.google.android.gms.internal.ads.zzzu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(com.google.android.gms.internal.ads.zzzv r24, com.google.android.gms.internal.ads.zzaau r25) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaci.zza(com.google.android.gms.internal.ads.zzzv, com.google.android.gms.internal.ads.zzaau):int");
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final void zzb(zzzx zzzxVar) {
        this.zzb = zzzxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final boolean zzd(zzzv zzzvVar) throws IOException {
        if (zze(zzzvVar) != 65496) {
            return false;
        }
        int iZze = zze(zzzvVar);
        this.zzd = iZze;
        if (iZze == 65504) {
            this.zza.zzC(2);
            zzzk zzzkVar = (zzzk) zzzvVar;
            zzzkVar.zzm(this.zza.zzH(), 0, 2, false);
            zzzkVar.zzl(this.zza.zzo() - 2, false);
            iZze = zze(zzzvVar);
            this.zzd = iZze;
        }
        if (iZze == 65505) {
            zzzk zzzkVar2 = (zzzk) zzzvVar;
            zzzkVar2.zzl(2, false);
            this.zza.zzC(6);
            zzzkVar2.zzm(this.zza.zzH(), 0, 6, false);
            if (this.zza.zzs() == 1165519206 && this.zza.zzo() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final void zzc(long j, long j2) {
        if (j == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzagc zzagcVar = this.zzj;
            zzagcVar.getClass();
            zzagcVar.zzc(j, j2);
        }
    }

    private final void zzg(zzbp... zzbpVarArr) {
        zzzx zzzxVar = this.zzb;
        zzzxVar.getClass();
        zzabb zzabbVarZzv = zzzxVar.zzv(1024, 4);
        zzad zzadVar = new zzad();
        zzadVar.zzz("image/jpeg");
        zzadVar.zzM(new zzbq(-9223372036854775807L, zzbpVarArr));
        zzabbVarZzv.zzk(zzadVar.zzY());
    }
}
