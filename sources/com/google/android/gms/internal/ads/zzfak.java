package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfak implements zzfaj {
    private final ConcurrentHashMap zza;
    private final zzfaq zzb;
    private final zzfam zzc = new zzfam();

    public zzfak(zzfaq zzfaqVar) {
        this.zza = new ConcurrentHashMap(zzfaqVar.zzd);
        this.zzb = zzfaqVar;
    }

    private final void zzf() {
        Parcelable.Creator<zzfaq> creator = zzfaq.CREATOR;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfU)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.zzb.zzb);
            sb.append(" PoolCollection");
            sb.append(this.zzc.zzb());
            int i = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((zzfat) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < ((zzfai) entry.getValue()).zzb(); i2++) {
                    sb.append("[O]");
                }
                for (int iZzb = ((zzfai) entry.getValue()).zzb(); iZzb < this.zzb.zzd; iZzb++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((zzfai) entry.getValue()).zzg());
                sb.append("\n");
            }
            while (i < this.zzb.zzc) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            zzbza.zze(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfaj
    public final zzfaq zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfaj
    public final synchronized zzfas zzb(zzfat zzfatVar) {
        zzfas zzfasVarZze;
        zzfai zzfaiVar = (zzfai) this.zza.get(zzfatVar);
        if (zzfaiVar != null) {
            zzfasVarZze = zzfaiVar.zze();
            if (zzfasVarZze == null) {
                this.zzc.zze();
            }
            zzfbg zzfbgVarZzf = zzfaiVar.zzf();
            if (zzfasVarZze != null) {
                zzawt zzawtVarZza = zzawz.zza();
                zzawr zzawrVarZza = zzaws.zza();
                zzawrVarZza.zzd(2);
                zzawv zzawvVarZza = zzaww.zza();
                zzawvVarZza.zza(zzfbgVarZzf.zza);
                zzawvVarZza.zzb(zzfbgVarZzf.zzb);
                zzawrVarZza.zza(zzawvVarZza);
                zzawtVarZza.zza(zzawrVarZza);
                zzfasVarZze.zza.zzb().zzc().zze((zzawz) zzawtVarZza.zzal());
            }
            zzf();
        } else {
            this.zzc.zzf();
            zzf();
            zzfasVarZze = null;
        }
        return zzfasVarZze;
    }

    @Override // com.google.android.gms.internal.ads.zzfaj
    @Deprecated
    public final zzfat zzc(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, com.google.android.gms.ads.internal.client.zzw zzwVar) {
        return new zzfau(zzlVar, str, new zzbtr(this.zzb.zza).zza().zzk, this.zzb.zzf, zzwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfaj
    public final synchronized boolean zzd(zzfat zzfatVar, zzfas zzfasVar) {
        boolean zZzh;
        zzfai zzfaiVar = (zzfai) this.zza.get(zzfatVar);
        zzfasVar.zzd = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
        if (zzfaiVar == null) {
            zzfaq zzfaqVar = this.zzb;
            zzfaiVar = new zzfai(zzfaqVar.zzd, zzfaqVar.zze * 1000);
            int size = this.zza.size();
            zzfaq zzfaqVar2 = this.zzb;
            if (size == zzfaqVar2.zzc) {
                int i = zzfaqVar2.zzg;
                int i2 = i - 1;
                zzfat zzfatVar2 = null;
                if (i == 0) {
                    throw null;
                }
                long jZzc = Long.MAX_VALUE;
                if (i2 == 0) {
                    for (Map.Entry entry : this.zza.entrySet()) {
                        if (((zzfai) entry.getValue()).zzc() < jZzc) {
                            jZzc = ((zzfai) entry.getValue()).zzc();
                            zzfatVar2 = (zzfat) entry.getKey();
                        }
                    }
                    if (zzfatVar2 != null) {
                        this.zza.remove(zzfatVar2);
                    }
                } else if (i2 == 1) {
                    for (Map.Entry entry2 : this.zza.entrySet()) {
                        if (((zzfai) entry2.getValue()).zzd() < jZzc) {
                            jZzc = ((zzfai) entry2.getValue()).zzd();
                            zzfatVar2 = (zzfat) entry2.getKey();
                        }
                    }
                    if (zzfatVar2 != null) {
                        this.zza.remove(zzfatVar2);
                    }
                } else if (i2 == 2) {
                    int iZza = Integer.MAX_VALUE;
                    for (Map.Entry entry3 : this.zza.entrySet()) {
                        if (((zzfai) entry3.getValue()).zza() < iZza) {
                            iZza = ((zzfai) entry3.getValue()).zza();
                            zzfatVar2 = (zzfat) entry3.getKey();
                        }
                    }
                    if (zzfatVar2 != null) {
                        this.zza.remove(zzfatVar2);
                    }
                }
                this.zzc.zzg();
            }
            this.zza.put(zzfatVar, zzfaiVar);
            this.zzc.zzd();
        }
        zZzh = zzfaiVar.zzh(zzfasVar);
        this.zzc.zzc();
        zzfal zzfalVarZza = this.zzc.zza();
        zzfbg zzfbgVarZzf = zzfaiVar.zzf();
        if (zzfasVar != null) {
            zzawt zzawtVarZza = zzawz.zza();
            zzawr zzawrVarZza = zzaws.zza();
            zzawrVarZza.zzd(2);
            zzawx zzawxVarZza = zzawy.zza();
            zzawxVarZza.zza(zzfalVarZza.zza);
            zzawxVarZza.zzb(zzfalVarZza.zzb);
            zzawxVarZza.zzc(zzfbgVarZzf.zzb);
            zzawrVarZza.zzc(zzawxVarZza);
            zzawtVarZza.zza(zzawrVarZza);
            zzfasVar.zza.zzb().zzc().zzf((zzawz) zzawtVarZza.zzal());
        }
        zzf();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzfaj
    public final synchronized boolean zze(zzfat zzfatVar) {
        zzfai zzfaiVar = (zzfai) this.zza.get(zzfatVar);
        if (zzfaiVar != null) {
            return zzfaiVar.zzb() < this.zzb.zzd;
        }
        return true;
    }
}
