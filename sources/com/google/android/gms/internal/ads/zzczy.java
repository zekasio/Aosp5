package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzczy {
    protected final Map zza = new HashMap();

    protected zzczy(Set set) {
        zzo(set);
    }

    public final synchronized void zzj(zzdbu zzdbuVar) {
        zzm(zzdbuVar.zza, zzdbuVar.zzb);
    }

    public final synchronized void zzm(Object obj, Executor executor) {
        this.zza.put(obj, executor);
    }

    public final synchronized void zzo(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzj((zzdbu) it.next());
        }
    }

    protected final synchronized void zzp(final zzczx zzczxVar) {
        for (Map.Entry entry : this.zza.entrySet()) {
            final Object key = entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzczw
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        zzczxVar.zza(key);
                    } catch (Throwable th) {
                        com.google.android.gms.ads.internal.zzt.zzo().zzt(th, "EventEmitter.notify");
                        com.google.android.gms.ads.internal.util.zze.zzb("Event emitter exception.", th);
                    }
                }
            });
        }
    }
}
