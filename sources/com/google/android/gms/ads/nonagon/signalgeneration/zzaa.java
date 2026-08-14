package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzfuf;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaa implements zzfuf {
    final /* synthetic */ zzac zza;

    zzaa(zzac zzacVar) {
        this.zza = zzacVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        zzac zzacVar = this.zza;
        zzf.zzc(zzacVar.zzr, zzacVar.zzj, "sgf", new Pair("sgf_reason", th.getMessage()));
        zzbza.zzh("Failed to initialize webview for loading SDKCore. ", th);
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final /* synthetic */ void zzb(Object obj) {
        zzbza.zze("Initialized webview successfully for SDKCore.");
    }
}
