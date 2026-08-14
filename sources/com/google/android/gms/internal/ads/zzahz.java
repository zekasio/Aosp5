package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzahz implements zzahn {
    private zzabb zzb;
    private boolean zzc;
    private int zze;
    private int zzf;
    private final zzen zza = new zzen(10);
    private long zzd = -9223372036854775807L;

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zza(zzen zzenVar) {
        zzdl.zzb(this.zzb);
        if (this.zzc) {
            int iZza = zzenVar.zza();
            int i = this.zzf;
            if (i < 10) {
                int iMin = Math.min(iZza, 10 - i);
                System.arraycopy(zzenVar.zzH(), zzenVar.zzc(), this.zza.zzH(), this.zzf, iMin);
                if (this.zzf + iMin == 10) {
                    this.zza.zzF(0);
                    if (this.zza.zzk() != 73 || this.zza.zzk() != 68 || this.zza.zzk() != 51) {
                        zzee.zze("Id3Reader", "Discarding invalid ID3 tag");
                        this.zzc = false;
                        return;
                    } else {
                        this.zza.zzG(3);
                        this.zze = this.zza.zzj() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iZza, this.zze - this.zzf);
            this.zzb.zzq(zzenVar, iMin2);
            this.zzf += iMin2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzb(zzzx zzzxVar, zzaiz zzaizVar) {
        zzaizVar.zzc();
        zzabb zzabbVarZzv = zzzxVar.zzv(zzaizVar.zza(), 5);
        this.zzb = zzabbVarZzv;
        zzad zzadVar = new zzad();
        zzadVar.zzH(zzaizVar.zzb());
        zzadVar.zzS("application/id3");
        zzabbVarZzv.zzk(zzadVar.zzY());
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzc() {
        int i;
        zzdl.zzb(this.zzb);
        if (this.zzc && (i = this.zze) != 0 && this.zzf == i) {
            long j = this.zzd;
            if (j != -9223372036854775807L) {
                this.zzb.zzs(j, 1, i, 0, null);
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
            this.zzd = j;
        }
        this.zze = 0;
        this.zzf = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zze() {
        this.zzc = false;
        this.zzd = -9223372036854775807L;
    }
}
