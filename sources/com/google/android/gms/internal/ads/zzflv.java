package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzflv extends zzfml {
    final /* synthetic */ zzfme zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzfmc zzc;
    final /* synthetic */ TaskCompletionSource zzd;
    final /* synthetic */ zzflx zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzflv(zzflx zzflxVar, TaskCompletionSource taskCompletionSource, zzfme zzfmeVar, int i, zzfmc zzfmcVar, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zze = zzflxVar;
        this.zza = zzfmeVar;
        this.zzb = i;
        this.zzc = zzfmcVar;
        this.zzd = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.zzfmh] */
    @Override // com.google.android.gms.internal.ads.zzfml
    protected final void zza() {
        try {
            ?? Zze = this.zze.zza.zze();
            zzfme zzfmeVar = this.zza;
            String str = this.zze.zzd;
            int i = this.zzb;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", zzfmeVar.zzb());
            bundle.putInt("displayMode", i);
            bundle.putString("callerPackage", str);
            bundle.putString("appId", zzfmeVar.zza());
            Zze.zzg(bundle, new zzflw(this.zze, this.zzc));
        } catch (RemoteException e) {
            zzflx.zzb.zzb(e, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(this.zzb), this.zze.zzd);
            this.zzd.trySetException(new RuntimeException(e));
        }
    }
}
