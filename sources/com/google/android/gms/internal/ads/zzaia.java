package com.google.android.gms.internal.ads;

import java.util.Collections;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaia implements zzahn {
    private final String zza;
    private final zzen zzb;
    private final zzem zzc;
    private zzabb zzd;
    private String zze;
    private zzaf zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private long zzk;
    private boolean zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private long zzq;
    private int zzr;
    private long zzs;
    private int zzt;
    private String zzu;

    public zzaia(String str) {
        this.zza = str;
        zzen zzenVar = new zzen(1024);
        this.zzb = zzenVar;
        byte[] bArrZzH = zzenVar.zzH();
        this.zzc = new zzem(bArrZzH, bArrZzH.length);
        this.zzk = -9223372036854775807L;
    }

    private final int zzf(zzem zzemVar) throws zzbu {
        int iZza = zzemVar.zza();
        zzyr zzyrVarZzb = zzys.zzb(zzemVar, true);
        this.zzu = zzyrVarZzb.zzc;
        this.zzr = zzyrVarZzb.zza;
        this.zzt = zzyrVarZzb.zzb;
        return iZza - zzemVar.zza();
    }

    private static long zzg(zzem zzemVar) {
        return zzemVar.zzd((zzemVar.zzd(2) + 1) * 8);
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zza(zzen zzenVar) throws zzbu {
        int i;
        int i2;
        int iZzd;
        boolean zZzn;
        zzdl.zzb(this.zzd);
        while (zzenVar.zza() > 0) {
            int i3 = this.zzg;
            if (i3 != 0) {
                if (i3 == 1) {
                    int iZzk = zzenVar.zzk();
                    if ((iZzk & 224) == 224) {
                        this.zzj = iZzk;
                        this.zzg = 2;
                    } else if (iZzk != 86) {
                        this.zzg = 0;
                    }
                } else if (i3 != 2) {
                    int iMin = Math.min(zzenVar.zza(), this.zzi - this.zzh);
                    zzenVar.zzB(this.zzc.zza, this.zzh, iMin);
                    int i4 = this.zzh + iMin;
                    this.zzh = i4;
                    if (i4 == this.zzi) {
                        this.zzc.zzj(0);
                        zzem zzemVar = this.zzc;
                        if (zzemVar.zzn()) {
                            if (this.zzl) {
                            }
                            this.zzg = 0;
                        } else {
                            this.zzl = true;
                            int iZzd2 = zzemVar.zzd(1);
                            if (iZzd2 == 1) {
                                iZzd = zzemVar.zzd(1);
                                i2 = 1;
                            } else {
                                i2 = iZzd2;
                                iZzd = 0;
                            }
                            this.zzm = iZzd;
                            if (iZzd != 0) {
                                throw zzbu.zza(null, null);
                            }
                            if (i2 == 1) {
                                zzg(zzemVar);
                                i2 = 1;
                            }
                            if (!zzemVar.zzn()) {
                                throw zzbu.zza(null, null);
                            }
                            this.zzn = zzemVar.zzd(6);
                            int iZzd3 = zzemVar.zzd(4);
                            int iZzd4 = zzemVar.zzd(3);
                            if (iZzd3 != 0 || iZzd4 != 0) {
                                throw zzbu.zza(null, null);
                            }
                            if (i2 == 0) {
                                int iZzc = zzemVar.zzc();
                                int iZzf = zzf(zzemVar);
                                zzemVar.zzj(iZzc);
                                byte[] bArr = new byte[(iZzf + 7) / 8];
                                zzemVar.zzg(bArr, 0, iZzf);
                                zzad zzadVar = new zzad();
                                zzadVar.zzH(this.zze);
                                zzadVar.zzS("audio/mp4a-latm");
                                zzadVar.zzx(this.zzu);
                                zzadVar.zzw(this.zzt);
                                zzadVar.zzT(this.zzr);
                                zzadVar.zzI(Collections.singletonList(bArr));
                                zzadVar.zzK(this.zza);
                                zzaf zzafVarZzY = zzadVar.zzY();
                                if (!zzafVarZzY.equals(this.zzf)) {
                                    this.zzf = zzafVarZzY;
                                    this.zzs = 1024000000 / ((long) zzafVarZzY.zzA);
                                    this.zzd.zzk(zzafVarZzY);
                                }
                            } else {
                                zzemVar.zzl(((int) zzg(zzemVar)) - zzf(zzemVar));
                            }
                            int iZzd5 = zzemVar.zzd(3);
                            this.zzo = iZzd5;
                            if (iZzd5 == 0) {
                                zzemVar.zzl(8);
                            } else if (iZzd5 == 1) {
                                zzemVar.zzl(9);
                            } else if (iZzd5 == 3 || iZzd5 == 4 || iZzd5 == 5) {
                                zzemVar.zzl(6);
                            } else {
                                if (iZzd5 != 6 && iZzd5 != 7) {
                                    throw new IllegalStateException();
                                }
                                zzemVar.zzl(1);
                            }
                            boolean zZzn2 = zzemVar.zzn();
                            this.zzp = zZzn2;
                            this.zzq = 0L;
                            if (zZzn2) {
                                if (i2 != 1) {
                                    do {
                                        zZzn = zzemVar.zzn();
                                        this.zzq = (this.zzq << 8) + ((long) zzemVar.zzd(8));
                                    } while (zZzn);
                                } else {
                                    this.zzq = zzg(zzemVar);
                                }
                            }
                            if (zzemVar.zzn()) {
                                zzemVar.zzl(8);
                            }
                        }
                        if (this.zzm != 0) {
                            throw zzbu.zza(null, null);
                        }
                        if (this.zzn != 0) {
                            throw zzbu.zza(null, null);
                        }
                        if (this.zzo != 0) {
                            throw zzbu.zza(null, null);
                        }
                        int i5 = 0;
                        while (true) {
                            int iZzd6 = zzemVar.zzd(8);
                            i = i5 + iZzd6;
                            if (iZzd6 != 255) {
                                break;
                            } else {
                                i5 = i;
                            }
                        }
                        int iZzc2 = zzemVar.zzc();
                        if ((iZzc2 & 7) == 0) {
                            this.zzb.zzF(iZzc2 >> 3);
                        } else {
                            zzemVar.zzg(this.zzb.zzH(), 0, i * 8);
                            this.zzb.zzF(0);
                        }
                        this.zzd.zzq(this.zzb, i);
                        long j = this.zzk;
                        if (j != -9223372036854775807L) {
                            this.zzd.zzs(j, 1, i, 0, null);
                            this.zzk += this.zzs;
                        }
                        if (this.zzp) {
                            zzemVar.zzl((int) this.zzq);
                        }
                        this.zzg = 0;
                    } else {
                        continue;
                    }
                } else {
                    int iZzk2 = ((this.zzj & (-225)) << 8) | zzenVar.zzk();
                    this.zzi = iZzk2;
                    zzen zzenVar2 = this.zzb;
                    if (iZzk2 > zzenVar2.zzH().length) {
                        zzenVar2.zzC(iZzk2);
                        zzem zzemVar2 = this.zzc;
                        byte[] bArrZzH = this.zzb.zzH();
                        zzemVar2.zzi(bArrZzH, bArrZzH.length);
                    }
                    this.zzh = 0;
                    this.zzg = 3;
                }
            } else if (zzenVar.zzk() == 86) {
                this.zzg = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzb(zzzx zzzxVar, zzaiz zzaizVar) {
        zzaizVar.zzc();
        this.zzd = zzzxVar.zzv(zzaizVar.zza(), 1);
        this.zze = zzaizVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzk = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zze() {
        this.zzg = 0;
        this.zzk = -9223372036854775807L;
        this.zzl = false;
    }
}
