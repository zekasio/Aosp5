package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfgv {
    private JSONObject zza;
    private final zzfhe zzb;

    public zzfgv(zzfhe zzfheVar) {
        this.zzb = zzfheVar;
    }

    public final JSONObject zza() {
        return this.zza;
    }

    public final void zzb() {
        this.zzb.zzb(new zzfhf(this, null));
    }

    public final void zzc(JSONObject jSONObject, HashSet hashSet, long j) {
        this.zzb.zzb(new zzfhg(this, hashSet, jSONObject, j, null));
    }

    public final void zzd(JSONObject jSONObject, HashSet hashSet, long j) {
        this.zzb.zzb(new zzfhh(this, hashSet, jSONObject, j, null));
    }

    public final void zze(JSONObject jSONObject) {
        this.zza = jSONObject;
    }
}
