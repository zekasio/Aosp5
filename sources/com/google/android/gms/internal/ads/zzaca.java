package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaca implements zzzu {
    public static final zzaab zza = new zzaab() { // from class: com.google.android.gms.internal.ads.zzabz
        @Override // com.google.android.gms.internal.ads.zzaab
        public final zzzu[] zza() {
            zzaab zzaabVar = zzaca.zza;
            return new zzzu[]{new zzaca(0)};
        }

        @Override // com.google.android.gms.internal.ads.zzaab
        public final /* synthetic */ zzzu[] zzb(Uri uri, Map map) {
            return zzaaa.zza(this, uri, map);
        }
    };
    private final byte[] zzb;
    private final zzen zzc;
    private final zzaac zzd;
    private zzzx zze;
    private zzabb zzf;
    private int zzg;
    private zzbq zzh;
    private zzaah zzi;
    private int zzj;
    private int zzk;
    private zzaby zzl;
    private int zzm;
    private long zzn;

    public zzaca() {
        this(0);
    }

    private final long zze(zzen zzenVar, boolean z) {
        boolean zZzc;
        this.zzi.getClass();
        int iZzc = zzenVar.zzc();
        while (iZzc <= zzenVar.zzd() - 16) {
            zzenVar.zzF(iZzc);
            if (zzaad.zzc(zzenVar, this.zzi, this.zzk, this.zzd)) {
                zzenVar.zzF(iZzc);
                return this.zzd.zza;
            }
            iZzc++;
        }
        if (!z) {
            zzenVar.zzF(iZzc);
            return -1L;
        }
        while (iZzc <= zzenVar.zzd() - this.zzj) {
            zzenVar.zzF(iZzc);
            try {
                zZzc = zzaad.zzc(zzenVar, this.zzi, this.zzk, this.zzd);
            } catch (IndexOutOfBoundsException unused) {
                zZzc = false;
            }
            if (zzenVar.zzc() <= zzenVar.zzd() && zZzc) {
                zzenVar.zzF(iZzc);
                return this.zzd.zza;
            }
            iZzc++;
        }
        zzenVar.zzF(zzenVar.zzd());
        return -1L;
    }

    private final void zzf() {
        long j = this.zzn * 1000000;
        zzaah zzaahVar = this.zzi;
        int i = zzew.zza;
        this.zzf.zzs(j / ((long) zzaahVar.zze), 1, this.zzm, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final void zzb(zzzx zzzxVar) {
        this.zze = zzzxVar;
        this.zzf = zzzxVar.zzv(0, 1);
        zzzxVar.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final boolean zzd(zzzv zzzvVar) throws Throwable {
        zzaae.zza(zzzvVar, false);
        zzen zzenVar = new zzen(4);
        ((zzzk) zzzvVar).zzm(zzenVar.zzH(), 0, 4, false);
        return zzenVar.zzs() == 1716281667;
    }

    public zzaca(int i) {
        this.zzb = new byte[42];
        this.zzc = new zzen(new byte[32768], 0);
        this.zzd = new zzaac();
        this.zzg = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final void zzc(long j, long j2) {
        if (j == 0) {
            this.zzg = 0;
        } else {
            zzaby zzabyVar = this.zzl;
            if (zzabyVar != null) {
                zzabyVar.zzd(j2);
            }
        }
        this.zzn = j2 != 0 ? -1L : 0L;
        this.zzm = 0;
        this.zzc.zzC(0);
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final int zza(zzzv zzzvVar, zzaau zzaauVar) throws Throwable {
        boolean zZzn;
        zzaax zzaawVar;
        boolean z;
        int i = this.zzg;
        if (i == 0) {
            zzzvVar.zzj();
            long jZze = zzzvVar.zze();
            zzbq zzbqVarZza = zzaae.zza(zzzvVar, true);
            ((zzzk) zzzvVar).zzo((int) (zzzvVar.zze() - jZze), false);
            this.zzh = zzbqVarZza;
            this.zzg = 1;
            return 0;
        }
        if (i == 1) {
            ((zzzk) zzzvVar).zzm(this.zzb, 0, 42, false);
            zzzvVar.zzj();
            this.zzg = 2;
            return 0;
        }
        if (i == 2) {
            zzen zzenVar = new zzen(4);
            ((zzzk) zzzvVar).zzn(zzenVar.zzH(), 0, 4, false);
            if (zzenVar.zzs() != 1716281667) {
                throw zzbu.zza("Failed to read FLAC stream marker.", null);
            }
            this.zzg = 3;
            return 0;
        }
        if (i == 3) {
            zzaah zzaahVarZze = this.zzi;
            do {
                zzzvVar.zzj();
                zzem zzemVar = new zzem(new byte[4], 4);
                zzzk zzzkVar = (zzzk) zzzvVar;
                zzzkVar.zzm(zzemVar.zza, 0, 4, false);
                zZzn = zzemVar.zzn();
                int iZzd = zzemVar.zzd(7);
                int iZzd2 = zzemVar.zzd(24) + 4;
                if (iZzd == 0) {
                    byte[] bArr = new byte[38];
                    zzzkVar.zzn(bArr, 0, 38, false);
                    zzaahVarZze = new zzaah(bArr, 4);
                } else {
                    if (zzaahVarZze == null) {
                        throw new IllegalArgumentException();
                    }
                    if (iZzd == 3) {
                        zzen zzenVar2 = new zzen(iZzd2);
                        zzzkVar.zzn(zzenVar2.zzH(), 0, iZzd2, false);
                        zzaahVarZze = zzaahVarZze.zzf(zzaae.zzb(zzenVar2));
                    } else if (iZzd == 4) {
                        zzen zzenVar3 = new zzen(iZzd2);
                        zzzkVar.zzn(zzenVar3.zzH(), 0, iZzd2, false);
                        zzenVar3.zzG(4);
                        zzaahVarZze = zzaahVarZze.zzg(Arrays.asList(zzabh.zzc(zzenVar3, false, false).zzb));
                    } else if (iZzd == 6) {
                        zzen zzenVar4 = new zzen(iZzd2);
                        zzzkVar.zzn(zzenVar4.zzH(), 0, iZzd2, false);
                        zzenVar4.zzG(4);
                        zzaahVarZze = zzaahVarZze.zze(zzfqk.zzp(zzacu.zzb(zzenVar4)));
                    } else {
                        zzzkVar.zzo(iZzd2, false);
                    }
                }
                int i2 = zzew.zza;
                this.zzi = zzaahVarZze;
            } while (!zZzn);
            zzaahVarZze.getClass();
            this.zzj = Math.max(zzaahVarZze.zzc, 6);
            this.zzf.zzk(this.zzi.zzc(this.zzb, this.zzh));
            this.zzg = 4;
            return 0;
        }
        if (i == 4) {
            zzzvVar.zzj();
            zzen zzenVar5 = new zzen(2);
            ((zzzk) zzzvVar).zzm(zzenVar5.zzH(), 0, 2, false);
            int iZzo = zzenVar5.zzo();
            if ((iZzo >> 2) != 16382) {
                zzzvVar.zzj();
                throw zzbu.zza("First frame does not start with sync code.", null);
            }
            zzzvVar.zzj();
            this.zzk = iZzo;
            zzzx zzzxVar = this.zze;
            int i3 = zzew.zza;
            long jZzf = zzzvVar.zzf();
            long jZzd = zzzvVar.zzd();
            zzaah zzaahVar = this.zzi;
            zzaahVar.getClass();
            if (zzaahVar.zzk != null) {
                zzaawVar = new zzaaf(zzaahVar, jZzf);
            } else if (jZzd == -1 || zzaahVar.zzj <= 0) {
                zzaawVar = new zzaaw(zzaahVar.zza(), 0L);
            } else {
                zzaby zzabyVar = new zzaby(zzaahVar, this.zzk, jZzf, jZzd);
                this.zzl = zzabyVar;
                zzaawVar = zzabyVar.zzb();
            }
            zzzxVar.zzN(zzaawVar);
            this.zzg = 5;
            return 0;
        }
        this.zzf.getClass();
        zzaah zzaahVar2 = this.zzi;
        zzaahVar2.getClass();
        zzaby zzabyVar2 = this.zzl;
        if (zzabyVar2 != null && zzabyVar2.zze()) {
            return zzabyVar2.zza(zzzvVar, zzaauVar);
        }
        if (this.zzn == -1) {
            this.zzn = zzaad.zzb(zzzvVar, zzaahVar2);
            return 0;
        }
        zzen zzenVar6 = this.zzc;
        int iZzd3 = zzenVar6.zzd();
        if (iZzd3 < 32768) {
            int iZza = zzzvVar.zza(zzenVar6.zzH(), iZzd3, 32768 - iZzd3);
            z = iZza == -1;
            if (!z) {
                this.zzc.zzE(iZzd3 + iZza);
            } else if (this.zzc.zza() == 0) {
                zzf();
                return -1;
            }
        } else {
            z = false;
        }
        zzen zzenVar7 = this.zzc;
        int iZzc = zzenVar7.zzc();
        int i4 = this.zzm;
        int i5 = this.zzj;
        if (i4 < i5) {
            zzenVar7.zzG(Math.min(i5 - i4, zzenVar7.zza()));
        }
        long jZze2 = zze(this.zzc, z);
        zzen zzenVar8 = this.zzc;
        int iZzc2 = zzenVar8.zzc() - iZzc;
        zzenVar8.zzF(iZzc);
        zzaaz.zzb(this.zzf, this.zzc, iZzc2);
        this.zzm += iZzc2;
        if (jZze2 != -1) {
            zzf();
            this.zzm = 0;
            this.zzn = jZze2;
        }
        zzen zzenVar9 = this.zzc;
        if (zzenVar9.zza() >= 16) {
            return 0;
        }
        int iZza2 = zzenVar9.zza();
        System.arraycopy(zzenVar9.zzH(), zzenVar9.zzc(), zzenVar9.zzH(), 0, iZza2);
        this.zzc.zzF(0);
        this.zzc.zzE(iZza2);
        return 0;
    }
}
