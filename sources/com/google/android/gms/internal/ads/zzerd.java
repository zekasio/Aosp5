package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzerd implements zzepn {
    private final zzbyj zza;
    private final String zzb;
    private final ScheduledExecutorService zzc;
    private final zzfuu zzd;
    private final zzavh zze;

    zzerd(String str, zzavh zzavhVar, zzbyj zzbyjVar, ScheduledExecutorService scheduledExecutorService, zzfuu zzfuuVar, byte[] bArr) {
        this.zzb = str;
        this.zze = zzavhVar;
        this.zza = zzbyjVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfuuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 43;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcq)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcv)).booleanValue()) {
                zzfut zzfutVarZzm = zzfuj.zzm(zzfkz.zza(Tasks.forResult(null)), new zzftq() { // from class: com.google.android.gms.internal.ads.zzerb
                    @Override // com.google.android.gms.internal.ads.zzftq
                    public final zzfut zza(Object obj) {
                        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                        return appSetIdInfo == null ? zzfuj.zzh(new zzere(null, -1)) : zzfuj.zzh(new zzere(appSetIdInfo.getId(), appSetIdInfo.getScope()));
                    }
                }, this.zzd);
                if (((Boolean) zzbbz.zza.zze()).booleanValue()) {
                    zzfutVarZzm = zzfuj.zzn(zzfutVarZzm, ((Long) zzbbz.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzfuj.zze(zzfutVarZzm, Exception.class, new zzfnj() { // from class: com.google.android.gms.internal.ads.zzerc
                    @Override // com.google.android.gms.internal.ads.zzfnj
                    public final Object apply(Object obj) {
                        return this.zza.zzc((Exception) obj);
                    }
                }, this.zzd);
            }
        }
        return zzfuj.zzh(new zzere(null, -1));
    }

    final /* synthetic */ zzere zzc(Exception exc) {
        this.zza.zzu(exc, "AppSetIdInfoGmscoreSignal");
        return new zzere(null, -1);
    }
}
