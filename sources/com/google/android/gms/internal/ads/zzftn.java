package com.google.android.gms.internal.ads;

import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzftn extends zzftk {
    private zzftn() {
        super(null);
    }

    /* synthetic */ zzftn(zzftm zzftmVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzftk
    final int zza(zzfto zzftoVar) {
        int i;
        synchronized (zzftoVar) {
            i = zzftoVar.remaining - 1;
            zzftoVar.remaining = i;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzftk
    final void zzb(zzfto zzftoVar, @CheckForNull Set set, Set set2) {
        synchronized (zzftoVar) {
            if (zzftoVar.seenExceptions == null) {
                zzftoVar.seenExceptions = set2;
            }
        }
    }
}
