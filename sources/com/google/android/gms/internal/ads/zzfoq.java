package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzfoq extends zzfrb {
    final /* synthetic */ zzfos zza;

    zzfoq(zzfos zzfosVar) {
        this.zza = zzfosVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrb, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return zzfpl.zza(this.zza.zza.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzfor(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfrb, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        zzfpf.zzq(this.zza.zzb, entry.getKey());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfrb
    final Map zza() {
        return this.zza;
    }
}
