package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzftr extends zzftt {
    zzftr(zzfqf zzfqfVar, boolean z) {
        super(zzfqfVar, true);
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzftt
    public final /* bridge */ /* synthetic */ Object zzH(List list) {
        ArrayList arrayListZza = zzfqy.zza(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfts zzftsVar = (zzfts) it.next();
            arrayListZza.add(zzftsVar != null ? zzftsVar.zza : null);
        }
        return Collections.unmodifiableList(arrayListZza);
    }
}
