package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzauq implements Comparator {
    public zzauq(zzaur zzaurVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzauf zzaufVar = (zzauf) obj;
        zzauf zzaufVar2 = (zzauf) obj2;
        if (zzaufVar.zzd() < zzaufVar2.zzd()) {
            return -1;
        }
        if (zzaufVar.zzd() <= zzaufVar2.zzd()) {
            if (zzaufVar.zzb() < zzaufVar2.zzb()) {
                return -1;
            }
            if (zzaufVar.zzb() <= zzaufVar2.zzb()) {
                float fZza = (zzaufVar.zza() - zzaufVar.zzd()) * (zzaufVar.zzc() - zzaufVar.zzb());
                float fZza2 = (zzaufVar2.zza() - zzaufVar2.zzd()) * (zzaufVar2.zzc() - zzaufVar2.zzb());
                if (fZza > fZza2) {
                    return -1;
                }
                if (fZza >= fZza2) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
