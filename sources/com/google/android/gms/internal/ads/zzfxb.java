package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfxb {
    private final ConcurrentMap zza;
    private final zzfwx zzb;
    private final Class zzc;
    private final zzggl zzd;

    /* synthetic */ zzfxb(ConcurrentMap concurrentMap, zzfwx zzfwxVar, zzggl zzgglVar, Class cls, zzfxa zzfxaVar) {
        this.zza = concurrentMap;
        this.zzb = zzfwxVar;
        this.zzc = cls;
        this.zzd = zzgglVar;
    }

    @Nullable
    public final zzfwx zza() {
        return this.zzb;
    }

    public final zzggl zzb() {
        return this.zzd;
    }

    public final Class zzc() {
        return this.zzc;
    }

    public final Collection zzd() {
        return this.zza.values();
    }

    public final List zze(byte[] bArr) {
        List list = (List) this.zza.get(new zzfwz(bArr, null));
        return list != null ? list : Collections.emptyList();
    }

    public final boolean zzf() {
        return !this.zzd.zza().isEmpty();
    }
}
