package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfax {
    private final HashMap zza = new HashMap();

    public final zzfaw zza(zzfan zzfanVar, Context context, zzfaf zzfafVar, zzfbd zzfbdVar) {
        zzfaw zzfawVar = (zzfaw) this.zza.get(zzfanVar);
        if (zzfawVar != null) {
            return zzfawVar;
        }
        zzfak zzfakVar = new zzfak(zzfaq.zza(zzfanVar, context));
        zzfaw zzfawVar2 = new zzfaw(zzfakVar, new zzfbf(zzfakVar, zzfafVar, zzfbdVar));
        this.zza.put(zzfanVar, zzfawVar2);
        return zzfawVar2;
    }
}
