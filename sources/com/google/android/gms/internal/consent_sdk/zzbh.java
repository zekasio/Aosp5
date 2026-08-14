package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbh implements zzch<zzbg> {
    private final zzcl<zzbi> zza;
    private final zzcl<Handler> zzb;
    private final zzcl<zzbm> zzc;

    public zzbh(zzcl<zzbi> zzclVar, zzcl<Handler> zzclVar2, zzcl<zzbm> zzclVar3) {
        this.zza = zzclVar;
        this.zzb = zzclVar2;
        this.zzc = zzclVar3;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcl
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbg zzb() {
        zzbi zzbiVarZzb = this.zza.zzb();
        Handler handler = zzcd.zza;
        zzck.zza(handler);
        return new zzbg(zzbiVarZzb, handler, ((zzbn) this.zzc).zzb());
    }
}
