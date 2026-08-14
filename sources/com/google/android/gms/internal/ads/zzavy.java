package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.io.IOException;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzavy implements BaseGmsClient.BaseConnectionCallbacks {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ zzavq zza;
    final /* synthetic */ zzbzs zzb;
    final /* synthetic */ zzawa zzc;

    zzavy(zzawa zzawaVar, zzavq zzavqVar, zzbzs zzbzsVar) {
        this.zzc = zzawaVar;
        this.zza = zzavqVar;
        this.zzb = zzbzsVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzc.zzd) {
            zzawa zzawaVar = this.zzc;
            if (zzawaVar.zzb) {
                return;
            }
            zzawaVar.zzb = true;
            final zzavp zzavpVar = this.zzc.zza;
            if (zzavpVar == null) {
                return;
            }
            zzfuu zzfuuVar = zzbzn.zza;
            final zzavq zzavqVar = this.zza;
            final zzbzs zzbzsVar = this.zzb;
            final zzfut zzfutVarZza = zzfuuVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzavv
                @Override // java.lang.Runnable
                public final void run() {
                    zzavy zzavyVar = this.zza;
                    zzavp zzavpVar2 = zzavpVar;
                    zzavq zzavqVar2 = zzavqVar;
                    zzbzs zzbzsVar2 = zzbzsVar;
                    try {
                        zzavs zzavsVarZzq = zzavpVar2.zzq();
                        zzavn zzavnVarZzg = zzavpVar2.zzp() ? zzavsVarZzq.zzg(zzavqVar2) : zzavsVarZzq.zzf(zzavqVar2);
                        if (!zzavnVarZzg.zze()) {
                            zzbzsVar2.zze(new RuntimeException("No entry contents."));
                            zzawa.zze(zzavyVar.zzc);
                            return;
                        }
                        zzavx zzavxVar = new zzavx(zzavyVar, zzavnVarZzg.zzc(), 1);
                        int i = zzavxVar.read();
                        if (i == -1) {
                            throw new IOException("Unable to read from cache.");
                        }
                        zzavxVar.unread(i);
                        zzbzsVar2.zzd(zzawc.zzb(zzavxVar, zzavnVarZzg.zzd(), zzavnVarZzg.zzg(), zzavnVarZzg.zza(), zzavnVarZzg.zzf()));
                    } catch (RemoteException | IOException e) {
                        zzbza.zzh("Unable to obtain a cache service instance.", e);
                        zzbzsVar2.zze(e);
                        zzawa.zze(zzavyVar.zzc);
                    }
                }
            });
            final zzbzs zzbzsVar2 = this.zzb;
            zzbzsVar2.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzavw
                @Override // java.lang.Runnable
                public final void run() {
                    zzbzs zzbzsVar3 = zzbzsVar2;
                    Future future = zzfutVarZza;
                    int i = zzavy.zzd;
                    if (zzbzsVar3.isCancelled()) {
                        future.cancel(true);
                    }
                }
            }, zzbzn.zzf);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }
}
