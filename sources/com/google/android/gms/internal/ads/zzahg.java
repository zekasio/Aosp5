package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzahg implements zzahn {
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

    public zzahg() {
        this(null);
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zza(zzen zzenVar) {
        zzdl.zzb(this.zze);
        while (zzenVar.zza() > 0) {
            int i = this.zzf;
            if (i == 0) {
                while (zzenVar.zza() > 0) {
                    if (this.zzh) {
                        int iZzk = zzenVar.zzk();
                        this.zzh = iZzk == 172;
                        if (iZzk != 64) {
                            if (iZzk == 65) {
                                iZzk = 65;
                            }
                        }
                        this.zzf = 1;
                        zzen zzenVar2 = this.zzb;
                        zzenVar2.zzH()[0] = -84;
                        zzenVar2.zzH()[1] = iZzk == 65 ? (byte) 65 : (byte) 64;
                        this.zzg = 2;
                    } else {
                        this.zzh = zzenVar.zzk() == 172;
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
                int iMin2 = Math.min(zzenVar.zza(), 16 - this.zzg);
                zzenVar.zzB(bArrZzH, this.zzg, iMin2);
                int i4 = this.zzg + iMin2;
                this.zzg = i4;
                if (i4 == 16) {
                    this.zza.zzj(0);
                    zzyx zzyxVarZza = zzyy.zza(this.zza);
                    zzaf zzafVar = this.zzj;
                    if (zzafVar == null || zzafVar.zzz != 2 || zzyxVarZza.zza != zzafVar.zzA || !"audio/ac4".equals(zzafVar.zzm)) {
                        zzad zzadVar = new zzad();
                        zzadVar.zzH(this.zzd);
                        zzadVar.zzS("audio/ac4");
                        zzadVar.zzw(2);
                        zzadVar.zzT(zzyxVarZza.zza);
                        zzadVar.zzK(this.zzc);
                        zzaf zzafVarZzY = zzadVar.zzY();
                        this.zzj = zzafVarZzY;
                        this.zze.zzk(zzafVarZzY);
                    }
                    this.zzk = zzyxVarZza.zzb;
                    this.zzi = (((long) zzyxVarZza.zzc) * 1000000) / ((long) this.zzj.zzA);
                    this.zzb.zzF(0);
                    this.zze.zzq(this.zzb, 16);
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

    public zzahg(String str) {
        zzem zzemVar = new zzem(new byte[16], 16);
        this.zza = zzemVar;
        this.zzb = new zzen(zzemVar.zza);
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = false;
        this.zzl = -9223372036854775807L;
        this.zzc = str;
    }
}
