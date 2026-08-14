package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzflu extends zzfml {
    final /* synthetic */ zzflo zza;
    final /* synthetic */ zzfmc zzb;
    final /* synthetic */ TaskCompletionSource zzc;
    final /* synthetic */ zzflx zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzflu(zzflx zzflxVar, TaskCompletionSource taskCompletionSource, zzflo zzfloVar, zzfmc zzfmcVar, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zzd = zzflxVar;
        this.zza = zzfloVar;
        this.zzb = zzfmcVar;
        this.zzc = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.zzfmh] */
    @Override // com.google.android.gms.internal.ads.zzfml
    protected final void zza() {
        try {
            ?? Zze = this.zzd.zza.zze();
            zzflo zzfloVar = this.zza;
            String str = this.zzd.zzd;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", zzfloVar.zzb());
            bundle.putString("callerPackage", str);
            bundle.putString("appId", zzfloVar.zza());
            Zze.zze(bundle, new zzflw(this.zzd, this.zzb));
        } catch (RemoteException e) {
            zzflx.zzb.zzb(e, "dismiss overlay display from: %s", this.zzd.zzd);
            this.zzc.trySetException(new RuntimeException(e));
        }
    }
}
