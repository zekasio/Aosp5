package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zznh {
    final /* synthetic */ zzni zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzss zze;
    private boolean zzf;
    private boolean zzg;

    public zznh(zzni zzniVar, String str, int i, zzss zzssVar) {
        this.zza = zzniVar;
        this.zzb = str;
        this.zzc = i;
        this.zzd = zzssVar == null ? -1L : zzssVar.zzd;
        if (zzssVar == null || !zzssVar.zzb()) {
            return;
        }
        this.zze = zzssVar;
    }

    public final void zzg(int i, zzss zzssVar) {
        if (this.zzd == -1 && i == this.zzc && zzssVar != null) {
            this.zzd = zzssVar.zzd;
        }
    }

    public final boolean zzj(int i, zzss zzssVar) {
        if (zzssVar == null) {
            return i == this.zzc;
        }
        zzss zzssVar2 = this.zze;
        return zzssVar2 == null ? !zzssVar.zzb() && zzssVar.zzd == this.zzd : zzssVar.zzd == zzssVar2.zzd && zzssVar.zzb == zzssVar2.zzb && zzssVar.zzc == zzssVar2.zzc;
    }

    public final boolean zzk(zzlc zzlcVar) {
        zzss zzssVar = zzlcVar.zzd;
        if (zzssVar == null) {
            return this.zzc != zzlcVar.zzc;
        }
        long j = this.zzd;
        if (j == -1) {
            return false;
        }
        if (zzssVar.zzd > j) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        int iZza = zzlcVar.zzb.zza(zzssVar.zza);
        int iZza2 = zzlcVar.zzb.zza(this.zze.zza);
        zzss zzssVar2 = zzlcVar.zzd;
        if (zzssVar2.zzd < this.zze.zzd || iZza < iZza2) {
            return false;
        }
        if (iZza > iZza2) {
            return true;
        }
        if (!zzssVar2.zzb()) {
            int i = zzlcVar.zzd.zze;
            return i == -1 || i > this.zze.zzb;
        }
        zzss zzssVar3 = zzlcVar.zzd;
        int i2 = zzssVar3.zzb;
        int i3 = zzssVar3.zzc;
        zzss zzssVar4 = this.zze;
        int i4 = zzssVar4.zzb;
        if (i2 <= i4) {
            return i2 == i4 && i3 > zzssVar4.zzc;
        }
        return true;
    }

    public final boolean zzl(zzcn zzcnVar, zzcn zzcnVar2) {
        int i = this.zzc;
        if (i < zzcnVar.zzc()) {
            zzcnVar.zze(i, this.zza.zzc, 0L);
            for (int i2 = this.zza.zzc.zzo; i2 <= this.zza.zzc.zzp; i2++) {
                int iZza = zzcnVar2.zza(zzcnVar.zzf(i2));
                if (iZza != -1) {
                    i = zzcnVar2.zzd(iZza, this.zza.zzd, false).zzd;
                    break;
                }
            }
            i = -1;
        } else if (i >= zzcnVar2.zzc()) {
            i = -1;
        }
        this.zzc = i;
        if (i == -1) {
            return false;
        }
        zzss zzssVar = this.zze;
        return zzssVar == null || zzcnVar2.zza(zzssVar.zza) != -1;
    }
}
