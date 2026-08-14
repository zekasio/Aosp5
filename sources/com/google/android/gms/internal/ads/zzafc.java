package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzafc implements zzzu {
    public static final zzaab zza = new zzaab() { // from class: com.google.android.gms.internal.ads.zzafa
        @Override // com.google.android.gms.internal.ads.zzaab
        public final zzzu[] zza() {
            zzaab zzaabVar = zzafc.zza;
            return new zzzu[]{new zzafc(0)};
        }

        @Override // com.google.android.gms.internal.ads.zzaab
        public final /* synthetic */ zzzu[] zzb(Uri uri, Map map) {
            return zzaaa.zza(this, uri, map);
        }
    };
    private static final zzadm zzb = new zzadm() { // from class: com.google.android.gms.internal.ads.zzafb
    };
    private final zzen zzc;
    private final zzaan zzd;
    private final zzaaj zze;
    private final zzaal zzf;
    private final zzabb zzg;
    private zzzx zzh;
    private zzabb zzi;
    private zzabb zzj;
    private int zzk;
    private zzbq zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private zzafe zzq;
    private boolean zzr;

    public zzafc() {
        this(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015f  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput", "realTrackOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzf(com.google.android.gms.internal.ads.zzzv r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 621
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafc.zzf(com.google.android.gms.internal.ads.zzzv):int");
    }

    private final long zzg(long j) {
        return this.zzm + ((j * 1000000) / ((long) this.zzd.zzd));
    }

    private final zzafe zzh(zzzv zzzvVar, boolean z) throws IOException {
        ((zzzk) zzzvVar).zzm(this.zzc.zzH(), 0, 4, false);
        this.zzc.zzF(0);
        this.zzd.zza(this.zzc.zze());
        return new zzaex(zzzvVar.zzd(), zzzvVar.zzf(), this.zzd, false);
    }

    private static boolean zzi(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    private final boolean zzj(zzzv zzzvVar) throws IOException {
        zzafe zzafeVar = this.zzq;
        if (zzafeVar != null) {
            long jZzb = zzafeVar.zzb();
            if (jZzb != -1 && zzzvVar.zze() > jZzb - 4) {
                return true;
            }
        }
        try {
            return !zzzvVar.zzm(this.zzc.zzH(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean zzk(zzzv zzzvVar, boolean z) throws Throwable {
        int i;
        int iZze;
        int iZzb;
        zzzvVar.zzj();
        if (zzzvVar.zzf() == 0) {
            zzbq zzbqVarZza = this.zzf.zza(zzzvVar, null);
            this.zzl = zzbqVarZza;
            if (zzbqVarZza != null) {
                this.zze.zzb(zzbqVarZza);
            }
            iZze = (int) zzzvVar.zze();
            if (!z) {
                ((zzzk) zzzvVar).zzo(iZze, false);
            }
            i = 0;
        } else {
            i = 0;
            iZze = 0;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (!zzj(zzzvVar)) {
                this.zzc.zzF(0);
                int iZze2 = this.zzc.zze();
                if ((i == 0 || zzi(iZze2, i)) && (iZzb = zzaao.zzb(iZze2)) != -1) {
                    i2++;
                    if (i2 != 1) {
                        if (i2 == 4) {
                            break;
                        }
                    } else {
                        this.zzd.zza(iZze2);
                        i = iZze2;
                    }
                    ((zzzk) zzzvVar).zzl(iZzb - 4, false);
                } else {
                    int i4 = i3 + 1;
                    if (i3 == (true != z ? 131072 : 32768)) {
                        if (z) {
                            return false;
                        }
                        throw zzbu.zza("Searched too many bytes.", null);
                    }
                    if (z) {
                        zzzvVar.zzj();
                        ((zzzk) zzzvVar).zzl(iZze + i4, false);
                    } else {
                        ((zzzk) zzzvVar).zzo(1, false);
                    }
                    i3 = i4;
                    i = 0;
                    i2 = 0;
                }
            } else if (i2 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            ((zzzk) zzzvVar).zzo(iZze + i3, false);
        } else {
            zzzvVar.zzj();
        }
        this.zzk = i;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final int zza(zzzv zzzvVar, zzaau zzaauVar) throws Throwable {
        zzdl.zzb(this.zzi);
        int i = zzew.zza;
        int iZzf = zzf(zzzvVar);
        if (iZzf == -1 && (this.zzq instanceof zzaey)) {
            if (this.zzq.zze() != zzg(this.zzn)) {
                throw null;
            }
        }
        return iZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final void zzb(zzzx zzzxVar) {
        this.zzh = zzzxVar;
        zzabb zzabbVarZzv = zzzxVar.zzv(0, 1);
        this.zzi = zzabbVarZzv;
        this.zzj = zzabbVarZzv;
        this.zzh.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final void zzc(long j, long j2) {
        this.zzk = 0;
        this.zzm = -9223372036854775807L;
        this.zzn = 0L;
        this.zzp = 0;
        zzafe zzafeVar = this.zzq;
        if (zzafeVar instanceof zzaey) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final boolean zzd(zzzv zzzvVar) throws IOException {
        return zzk(zzzvVar, true);
    }

    public final void zze() {
        this.zzr = true;
    }

    public zzafc(int i) {
        this.zzc = new zzen(10);
        this.zzd = new zzaan();
        this.zze = new zzaaj();
        this.zzm = -9223372036854775807L;
        this.zzf = new zzaal();
        zzzt zzztVar = new zzzt();
        this.zzg = zzztVar;
        this.zzj = zzztVar;
    }
}
