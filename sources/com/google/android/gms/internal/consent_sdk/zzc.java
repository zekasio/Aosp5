package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzc implements zzch<zzb> {
    private final zzcl<Application> zza;

    public zzc(zzcl<Application> zzclVar) {
        this.zza = zzclVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcl
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzb zzb() {
        return new zzb(this.zza.zzb());
    }
}
