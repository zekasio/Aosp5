package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzalh {
    long zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final List zzh;

    /* JADX WARN: Illegal instructions before constructor call */
    zzalh(String str, zzajx zzajxVar) {
        String str2 = zzajxVar.zzb;
        long j = zzajxVar.zzc;
        long j2 = zzajxVar.zzd;
        long j3 = zzajxVar.zze;
        long j4 = zzajxVar.zzf;
        List arrayList = zzajxVar.zzh;
        if (arrayList == null) {
            Map map = zzajxVar.zzg;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new zzakg((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j, j2, j3, j4, arrayList);
    }

    static zzalh zza(zzali zzaliVar) throws IOException {
        if (zzalk.zze(zzaliVar) != 538247942) {
            throw new IOException();
        }
        String strZzh = zzalk.zzh(zzaliVar);
        String strZzh2 = zzalk.zzh(zzaliVar);
        long jZzf = zzalk.zzf(zzaliVar);
        long jZzf2 = zzalk.zzf(zzaliVar);
        long jZzf3 = zzalk.zzf(zzaliVar);
        long jZzf4 = zzalk.zzf(zzaliVar);
        int iZze = zzalk.zze(zzaliVar);
        if (iZze < 0) {
            throw new IOException("readHeaderList size=" + iZze);
        }
        List listEmptyList = iZze == 0 ? Collections.emptyList() : new ArrayList();
        for (int i = 0; i < iZze; i++) {
            listEmptyList.add(new zzakg(zzalk.zzh(zzaliVar).intern(), zzalk.zzh(zzaliVar).intern()));
        }
        return new zzalh(strZzh, strZzh2, jZzf, jZzf2, jZzf3, jZzf4, listEmptyList);
    }

    private zzalh(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.zzb = str;
        this.zzc = true == "".equals(str2) ? null : str2;
        this.zzd = j;
        this.zze = j2;
        this.zzf = j3;
        this.zzg = j4;
        this.zzh = list;
    }
}
