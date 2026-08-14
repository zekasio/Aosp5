package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzftt extends zzfti {

    @CheckForNull
    private List zza;

    zzftt(zzfqf zzfqfVar, boolean z) {
        super(zzfqfVar, true, true);
        List listEmptyList = zzfqfVar.isEmpty() ? Collections.emptyList() : zzfqy.zza(zzfqfVar.size());
        for (int i = 0; i < zzfqfVar.size(); i++) {
            listEmptyList.add(null);
        }
        this.zza = listEmptyList;
    }

    abstract Object zzH(List list);

    @Override // com.google.android.gms.internal.ads.zzfti
    final void zzg(int i, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i, new zzfts(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfti
    final void zzv() {
        List list = this.zza;
        if (list != null) {
            zzd(zzH(list));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfti
    final void zzz(int i) {
        super.zzz(i);
        this.zza = null;
    }
}
