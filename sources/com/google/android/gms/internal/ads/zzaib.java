package com.google.android.gms.internal.ads;

import kotlin.UByte;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaib implements zzahn {
    private final zzen zza;
    private final zzaan zzb;
    private final String zzc;
    private zzabb zzd;
    private String zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private boolean zzi;
    private long zzj;
    private int zzk;
    private long zzl;

    public zzaib() {
        this(null);
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zza(zzen zzenVar) {
        zzdl.zzb(this.zzd);
        while (zzenVar.zza() > 0) {
            int i = this.zzf;
            if (i == 0) {
                byte[] bArrZzH = zzenVar.zzH();
                int iZzc = zzenVar.zzc();
                int iZzd = zzenVar.zzd();
                while (true) {
                    if (iZzc >= iZzd) {
                        zzenVar.zzF(iZzd);
                        break;
                    }
                    byte b = bArrZzH[iZzc];
                    boolean z = (b & UByte.MAX_VALUE) == 255;
                    boolean z2 = this.zzi && (b & 224) == 224;
                    this.zzi = z;
                    if (z2) {
                        zzenVar.zzF(iZzc + 1);
                        this.zzi = false;
                        this.zza.zzH()[1] = bArrZzH[iZzc];
                        this.zzg = 2;
                        this.zzf = 1;
                        break;
                    }
                    iZzc++;
                }
            } else if (i != 1) {
                int iMin = Math.min(zzenVar.zza(), this.zzk - this.zzg);
                this.zzd.zzq(zzenVar, iMin);
                int i2 = this.zzg + iMin;
                this.zzg = i2;
                int i3 = this.zzk;
                if (i2 >= i3) {
                    long j = this.zzl;
                    if (j != -9223372036854775807L) {
                        this.zzd.zzs(j, 1, i3, 0, null);
                        this.zzl += this.zzj;
                    }
                    this.zzg = 0;
                    this.zzf = 0;
                }
            } else {
                int iMin2 = Math.min(zzenVar.zza(), 4 - this.zzg);
                zzenVar.zzB(this.zza.zzH(), this.zzg, iMin2);
                int i4 = this.zzg + iMin2;
                this.zzg = i4;
                if (i4 >= 4) {
                    this.zza.zzF(0);
                    if (this.zzb.zza(this.zza.zze())) {
                        zzaan zzaanVar = this.zzb;
                        this.zzk = zzaanVar.zzc;
                        if (!this.zzh) {
                            this.zzj = (((long) zzaanVar.zzg) * 1000000) / ((long) zzaanVar.zzd);
                            zzad zzadVar = new zzad();
                            zzadVar.zzH(this.zze);
                            zzadVar.zzS(this.zzb.zzb);
                            zzadVar.zzL(4096);
                            zzadVar.zzw(this.zzb.zze);
                            zzadVar.zzT(this.zzb.zzd);
                            zzadVar.zzK(this.zzc);
                            this.zzd.zzk(zzadVar.zzY());
                            this.zzh = true;
                        }
                        this.zza.zzF(0);
                        this.zzd.zzq(this.zza, 4);
                        this.zzf = 2;
                    } else {
                        this.zzg = 0;
                        this.zzf = 1;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzb(zzzx zzzxVar, zzaiz zzaizVar) {
        zzaizVar.zzc();
        this.zze = zzaizVar.zzb();
        this.zzd = zzzxVar.zzv(zzaizVar.zza(), 1);
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
        this.zzi = false;
        this.zzl = -9223372036854775807L;
    }

    public zzaib(String str) {
        this.zzf = 0;
        zzen zzenVar = new zzen(4);
        this.zza = zzenVar;
        zzenVar.zzH()[0] = -1;
        this.zzb = new zzaan();
        this.zzl = -9223372036854775807L;
        this.zzc = str;
    }
}
