package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzahi implements zzzu {
    public static final zzaab zza = new zzaab() { // from class: com.google.android.gms.internal.ads.zzahh
        @Override // com.google.android.gms.internal.ads.zzaab
        public final zzzu[] zza() {
            zzaab zzaabVar = zzahi.zza;
            return new zzzu[]{new zzahi(0)};
        }

        @Override // com.google.android.gms.internal.ads.zzaab
        public final /* synthetic */ zzzu[] zzb(Uri uri, Map map) {
            return zzaaa.zza(this, uri, map);
        }
    };
    private final zzahj zzb;
    private final zzen zzc;
    private final zzen zzd;
    private final zzem zze;
    private zzzx zzf;
    private long zzg;
    private long zzh;
    private boolean zzi;
    private boolean zzj;

    public zzahi() {
        this(0);
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final int zza(zzzv zzzvVar, zzaau zzaauVar) throws IOException {
        zzdl.zzb(this.zzf);
        int iZza = zzzvVar.zza(this.zzc.zzH(), 0, 2048);
        if (!this.zzj) {
            this.zzf.zzN(new zzaaw(-9223372036854775807L, 0L));
            this.zzj = true;
        }
        if (iZza == -1) {
            return -1;
        }
        this.zzc.zzF(0);
        this.zzc.zzE(iZza);
        if (!this.zzi) {
            this.zzb.zzd(this.zzg, 4);
            this.zzi = true;
        }
        this.zzb.zza(this.zzc);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final void zzb(zzzx zzzxVar) {
        this.zzf = zzzxVar;
        this.zzb.zzb(zzzxVar, new zzaiz(Integer.MIN_VALUE, 0, 1));
        zzzxVar.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final void zzc(long j, long j2) {
        this.zzi = false;
        this.zzb.zze();
        this.zzg = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final boolean zzd(zzzv zzzvVar) throws IOException {
        zzzk zzzkVar;
        int i = 0;
        while (true) {
            zzzkVar = (zzzk) zzzvVar;
            zzzkVar.zzm(this.zzd.zzH(), 0, 10, false);
            this.zzd.zzF(0);
            if (this.zzd.zzm() != 4801587) {
                break;
            }
            this.zzd.zzG(3);
            int iZzj = this.zzd.zzj();
            i += iZzj + 10;
            zzzkVar.zzl(iZzj, false);
        }
        zzzvVar.zzj();
        zzzkVar.zzl(i, false);
        if (this.zzh == -1) {
            this.zzh = i;
        }
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        do {
            zzzkVar.zzm(this.zzd.zzH(), 0, 2, false);
            this.zzd.zzF(0);
            if (zzahj.zzf(this.zzd.zzo())) {
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                zzzkVar.zzm(this.zzd.zzH(), 0, 4, false);
                this.zze.zzj(14);
                int iZzd = this.zze.zzd(13);
                if (iZzd <= 6) {
                    i2++;
                    zzzvVar.zzj();
                    zzzkVar.zzl(i2, false);
                } else {
                    zzzkVar.zzl(iZzd - 6, false);
                    i4 += iZzd;
                }
            } else {
                i2++;
                zzzvVar.zzj();
                zzzkVar.zzl(i2, false);
            }
            i3 = 0;
            i4 = 0;
        } while (i2 - i < 8192);
        return false;
    }

    public zzahi(int i) {
        this.zzb = new zzahj(true, null);
        this.zzc = new zzen(2048);
        this.zzh = -1L;
        zzen zzenVar = new zzen(10);
        this.zzd = zzenVar;
        byte[] bArrZzH = zzenVar.zzH();
        this.zze = new zzem(bArrZzH, bArrZzH.length);
    }
}
