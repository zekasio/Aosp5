package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfr extends zzfqa {
    private final Map zza;

    public zzfr(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfqa, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfqa, java.util.Map
    public final boolean containsValue(Object obj) {
        return super.zzd(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfqa, java.util.Map
    public final Set entrySet() {
        return zzfsf.zzb(this.zza.entrySet(), new zzfnv() { // from class: com.google.android.gms.internal.ads.zzfp
            @Override // com.google.android.gms.internal.ads.zzfnv
            public final boolean zza(Object obj) {
                return ((Map.Entry) obj).getKey() != null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfqa, java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && super.zze(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfqa, java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.zza.get(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfqa, java.util.Map
    public final int hashCode() {
        return super.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzfqa, java.util.Map
    public final boolean isEmpty() {
        if (this.zza.isEmpty()) {
            return true;
        }
        return super.size() == 1 && super.containsKey(null);
    }

    @Override // com.google.android.gms.internal.ads.zzfqa, java.util.Map
    public final Set keySet() {
        return zzfsf.zzb(this.zza.keySet(), new zzfnv() { // from class: com.google.android.gms.internal.ads.zzfq
            @Override // com.google.android.gms.internal.ads.zzfnv
            public final boolean zza(Object obj) {
                return ((String) obj) != null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfqa, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzfqa, com.google.android.gms.internal.ads.zzfqb
    protected final /* synthetic */ Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfqa
    protected final Map zzb() {
        return this.zza;
    }
}
