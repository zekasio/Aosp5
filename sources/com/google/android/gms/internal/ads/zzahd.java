package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzahd implements zzahn {
    private final zzem zza;
    private final zzen zzb;
    private final String zzc;
    private String zzd;
    private zzabb zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private zzaf zzj;
    private int zzk;
    private long zzl;

    public zzahd() {
        this(null);
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zza(zzen zzenVar) {
        zzdl.zzb(this.zze);
        while (zzenVar.zza() > 0) {
            int i = this.zzf;
            if (i == 0) {
                while (true) {
                    if (zzenVar.zza() <= 0) {
                        break;
                    }
                    if (this.zzh) {
                        int iZzk = zzenVar.zzk();
                        if (iZzk == 119) {
                            this.zzh = false;
                            this.zzf = 1;
                            zzen zzenVar2 = this.zzb;
                            zzenVar2.zzH()[0] = Ascii.VT;
                            zzenVar2.zzH()[1] = 119;
                            this.zzg = 2;
                            break;
                        }
                        this.zzh = iZzk == 11;
                    } else {
                        this.zzh = zzenVar.zzk() == 11;
                    }
                }
            } else if (i != 1) {
                int iMin = Math.min(zzenVar.zza(), this.zzk - this.zzg);
                this.zze.zzq(zzenVar, iMin);
                int i2 = this.zzg + iMin;
                this.zzg = i2;
                int i3 = this.zzk;
                if (i2 == i3) {
                    long j = this.zzl;
                    if (j != -9223372036854775807L) {
                        this.zze.zzs(j, 1, i3, 0, null);
                        this.zzl += this.zzi;
                    }
                    this.zzf = 0;
                }
            } else {
                byte[] bArrZzH = this.zzb.zzH();
                int iMin2 = Math.min(zzenVar.zza(), 128 - this.zzg);
                zzenVar.zzB(bArrZzH, this.zzg, iMin2);
                int i4 = this.zzg + iMin2;
                this.zzg = i4;
                if (i4 == 128) {
                    this.zza.zzj(0);
                    zzyu zzyuVarZze = zzyv.zze(this.zza);
                    zzaf zzafVar = this.zzj;
                    if (zzafVar == null || zzyuVarZze.zzc != zzafVar.zzz || zzyuVarZze.zzb != zzafVar.zzA || !zzew.zzU(zzyuVarZze.zza, zzafVar.zzm)) {
                        zzad zzadVar = new zzad();
                        zzadVar.zzH(this.zzd);
                        zzadVar.zzS(zzyuVarZze.zza);
                        zzadVar.zzw(zzyuVarZze.zzc);
                        zzadVar.zzT(zzyuVarZze.zzb);
                        zzadVar.zzK(this.zzc);
                        zzadVar.zzO(zzyuVarZze.zzf);
                        if ("audio/ac3".equals(zzyuVarZze.zza)) {
                            zzadVar.zzv(zzyuVarZze.zzf);
                        }
                        zzaf zzafVarZzY = zzadVar.zzY();
                        this.zzj = zzafVarZzY;
                        this.zze.zzk(zzafVarZzY);
                    }
                    this.zzk = zzyuVarZze.zzd;
                    this.zzi = (((long) zzyuVarZze.zze) * 1000000) / ((long) this.zzj.zzA);
                    this.zzb.zzF(0);
                    this.zze.zzq(this.zzb, 128);
                    this.zzf = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzb(zzzx zzzxVar, zzaiz zzaizVar) {
        zzaizVar.zzc();
        this.zzd = zzaizVar.zzb();
        this.zze = zzzxVar.zzv(zzaizVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzl = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zze() {
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = false;
        this.zzl = -9223372036854775807L;
    }

    public zzahd(String str) {
        zzem zzemVar = new zzem(new byte[128], 128);
        this.zza = zzemVar;
        this.zzb = new zzen(zzemVar.zza);
        this.zzf = 0;
        this.zzl = -9223372036854775807L;
        this.zzc = str;
    }
}
