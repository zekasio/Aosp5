package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzab implements zzch<zzz> {
    private final zzcl<zzh> zza;
    private final zzcl<zzak> zzb;
    private final zzcl<zzam> zzc;

    public zzab(zzcl<zzh> zzclVar, zzcl<zzak> zzclVar2, zzcl<zzam> zzclVar3) {
        this.zza = zzclVar;
        this.zzb = zzclVar2;
        this.zzc = zzclVar3;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcl
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzz zzb() {
        return new zzz(this.zza.zzb(), ((zzal) this.zzb).zzb(), this.zzc.zzb());
    }
}
