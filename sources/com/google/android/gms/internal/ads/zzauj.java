package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzauj {
    private final int zza;
    private final zzaug zzb = new zzaul();

    public zzauj(int i) {
        this.zza = i;
    }

    public final String zza(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append(((String) arrayList.get(i)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] strArrSplit = sb.toString().split("\n");
        if (strArrSplit.length == 0) {
            return "";
        }
        zzaui zzauiVar = new zzaui();
        PriorityQueue priorityQueue = new PriorityQueue(this.zza, new zzauh(this));
        for (String str : strArrSplit) {
            String[] strArrZzb = zzauk.zzb(str, false);
            if (strArrZzb.length != 0) {
                zzauo.zzc(strArrZzb, this.zza, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzauiVar.zzb.write(this.zzb.zzb(((zzaun) it.next()).zzb));
            } catch (IOException e) {
                zzbza.zzh("Error while writing hash to byteStream", e);
            }
        }
        return zzauiVar.toString();
    }
}
