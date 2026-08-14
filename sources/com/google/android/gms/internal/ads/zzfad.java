package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfad implements zzcur {
    private final HashSet zza = new HashSet();
    private final Context zzb;
    private final zzbyn zzc;

    public zzfad(Context context, zzbyn zzbynVar) {
        this.zzb = context;
        this.zzc = zzbynVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcur
    public final synchronized void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (zzeVar.zza != 3) {
            this.zzc.zzi(this.zza);
        }
    }

    public final Bundle zzb() {
        return this.zzc.zzk(this.zzb, this);
    }

    public final synchronized void zzc(HashSet hashSet) {
        this.zza.clear();
        this.zza.addAll(hashSet);
    }
}
