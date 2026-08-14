package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzal implements zzch<zzak> {
    private final zzcl<Application> zza;
    private final zzcl<zzam> zzb;
    private final zzcl<Executor> zzc;

    public zzal(zzcl<Application> zzclVar, zzcl<zzam> zzclVar2, zzcl<Executor> zzclVar3) {
        this.zza = zzclVar;
        this.zzb = zzclVar2;
        this.zzc = zzclVar3;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcl
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzak zzb() {
        Application applicationZzb = this.zza.zzb();
        zzam zzamVarZzb = this.zzb.zzb();
        Executor executor = zzcd.zzb;
        zzck.zza(executor);
        return new zzak(applicationZzb, zzamVarZzb, executor);
    }
}
