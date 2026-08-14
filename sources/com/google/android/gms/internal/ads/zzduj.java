package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzduj implements zzdvh {
    private static final Pattern zza = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzdtj zzb;
    private final zzfuu zzc;
    private final zzeyx zzd;
    private final ScheduledExecutorService zze;
    private final zzdzf zzf;
    private final zzfen zzg;
    private final Context zzh;

    zzduj(Context context, zzeyx zzeyxVar, zzdtj zzdtjVar, zzfuu zzfuuVar, ScheduledExecutorService scheduledExecutorService, zzdzf zzdzfVar, zzfen zzfenVar) {
        this.zzh = context;
        this.zzd = zzeyxVar;
        this.zzb = zzdtjVar;
        this.zzc = zzfuuVar;
        this.zze = scheduledExecutorService;
        this.zzf = zzdzfVar;
        this.zzg = zzfenVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdvh
    public final zzfut zzb(zzbtn zzbtnVar) {
        zzfut zzfutVarZzb = this.zzb.zzb(zzbtnVar);
        zzfec zzfecVarZza = zzfeb.zza(this.zzh, 11);
        zzfem.zzd(zzfutVarZzb, zzfecVarZza);
        zzfut zzfutVarZzm = zzfuj.zzm(zzfutVarZzb, new zzftq() { // from class: com.google.android.gms.internal.ads.zzdug
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return this.zza.zzc((InputStream) obj);
            }
        }, this.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfb)).booleanValue()) {
            zzfutVarZzm = zzfuj.zzf(zzfuj.zzn(zzfutVarZzm, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfc)).intValue(), TimeUnit.SECONDS, this.zze), TimeoutException.class, new zzftq() { // from class: com.google.android.gms.internal.ads.zzduh
                @Override // com.google.android.gms.internal.ads.zzftq
                public final zzfut zza(Object obj) {
                    return zzfuj.zzg(new zzdtf(5));
                }
            }, zzbzn.zzf);
        }
        zzfem.zza(zzfutVarZzm, this.zzg, zzfecVarZza);
        zzfuj.zzq(zzfutVarZzm, new zzdui(this), zzbzn.zzf);
        return zzfutVarZzm;
    }

    final /* synthetic */ zzfut zzc(InputStream inputStream) throws Exception {
        return zzfuj.zzh(new zzeyo(new zzeyl(this.zzd), zzeyn.zza(new InputStreamReader(inputStream))));
    }
}
