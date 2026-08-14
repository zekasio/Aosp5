package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbav {
    static List zza() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzbbw.zzc("gad:dynamite_module:experiment_id", ""));
        zzc(arrayList, zzbch.zza);
        zzc(arrayList, zzbch.zzb);
        zzc(arrayList, zzbch.zzc);
        zzc(arrayList, zzbch.zzd);
        zzc(arrayList, zzbch.zze);
        zzc(arrayList, zzbch.zzu);
        zzc(arrayList, zzbch.zzf);
        zzc(arrayList, zzbch.zzm);
        zzc(arrayList, zzbch.zzn);
        zzc(arrayList, zzbch.zzo);
        zzc(arrayList, zzbch.zzp);
        zzc(arrayList, zzbch.zzq);
        zzc(arrayList, zzbch.zzr);
        zzc(arrayList, zzbch.zzs);
        zzc(arrayList, zzbch.zzt);
        zzc(arrayList, zzbch.zzg);
        zzc(arrayList, zzbch.zzh);
        zzc(arrayList, zzbch.zzi);
        zzc(arrayList, zzbch.zzj);
        zzc(arrayList, zzbch.zzk);
        zzc(arrayList, zzbch.zzl);
        return arrayList;
    }

    static List zzb() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzbcv.zza);
        return arrayList;
    }

    private static void zzc(List list, zzbbw zzbbwVar) {
        String str = (String) zzbbwVar.zze();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        list.add(str);
    }
}
