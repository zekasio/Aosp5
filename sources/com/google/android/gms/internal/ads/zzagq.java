package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzagq implements zzzu {
    public static final zzaab zza = new zzaab() { // from class: com.google.android.gms.internal.ads.zzagp
        @Override // com.google.android.gms.internal.ads.zzaab
        public final zzzu[] zza() {
            zzaab zzaabVar = zzagq.zza;
            return new zzzu[]{new zzagq()};
        }

        @Override // com.google.android.gms.internal.ads.zzaab
        public final /* synthetic */ zzzu[] zzb(Uri uri, Map map) {
            return zzaaa.zza(this, uri, map);
        }
    };
    private zzzx zzb;
    private zzagy zzc;
    private boolean zzd;

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    private final boolean zze(zzzv zzzvVar) throws IOException {
        zzags zzagsVar = new zzags();
        if (zzagsVar.zzb(zzzvVar, true) && (zzagsVar.zza & 2) == 2) {
            int iMin = Math.min(zzagsVar.zze, 8);
            zzen zzenVar = new zzen(iMin);
            ((zzzk) zzzvVar).zzm(zzenVar.zzH(), 0, iMin, false);
            zzenVar.zzF(0);
            if (zzenVar.zza() >= 5 && zzenVar.zzk() == 127 && zzenVar.zzs() == 1179402563) {
                this.zzc = new zzago();
            } else {
                zzenVar.zzF(0);
                if (zzabh.zzd(1, zzenVar, true)) {
                    this.zzc = new zzaha();
                } else {
                    zzenVar.zzF(0);
                    if (zzagu.zzd(zzenVar)) {
                        this.zzc = new zzagu();
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final int zza(zzzv zzzvVar, zzaau zzaauVar) throws IOException {
        zzdl.zzb(this.zzb);
        if (this.zzc == null) {
            if (!zze(zzzvVar)) {
                throw zzbu.zza("Failed to determine bitstream type", null);
            }
            zzzvVar.zzj();
        }
        if (!this.zzd) {
            zzabb zzabbVarZzv = this.zzb.zzv(0, 1);
            this.zzb.zzC();
            this.zzc.zzh(this.zzb, zzabbVarZzv);
            this.zzd = true;
        }
        return this.zzc.zze(zzzvVar, zzaauVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final void zzb(zzzx zzzxVar) {
        this.zzb = zzzxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final void zzc(long j, long j2) {
        zzagy zzagyVar = this.zzc;
        if (zzagyVar != null) {
            zzagyVar.zzj(j, j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final boolean zzd(zzzv zzzvVar) throws IOException {
        try {
            return zze(zzzvVar);
        } catch (zzbu unused) {
            return false;
        }
    }
}
