package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzerj implements zzepn {
    private final Context zza;
    private final zzbyj zzb;
    private final ScheduledExecutorService zzc;
    private final Executor zzd;
    private final String zze;
    private final zzbya zzf;

    public zzerj(zzbya zzbyaVar, int i, Context context, zzbyj zzbyjVar, ScheduledExecutorService scheduledExecutorService, Executor executor, String str, byte[] bArr) {
        this.zzf = zzbyaVar;
        this.zza = context;
        this.zzb = zzbyjVar;
        this.zzc = scheduledExecutorService;
        this.zzd = executor;
        this.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 44;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        return zzfuj.zze((zzfua) zzfuj.zzn(zzfuj.zzl(zzfua.zzv(zzfuj.zzk(new zzftp() { // from class: com.google.android.gms.internal.ads.zzerg
            @Override // com.google.android.gms.internal.ads.zzftp
            public final zzfut zza() {
                return zzfuj.zzh(null);
            }
        }, this.zzd)), new zzfnj() { // from class: com.google.android.gms.internal.ads.zzerh
            @Override // com.google.android.gms.internal.ads.zzfnj
            public final Object apply(Object obj) {
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                return new zzerk(str);
            }
        }, this.zzd), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzaP)).longValue(), TimeUnit.MILLISECONDS, this.zzc), Exception.class, new zzfnj() { // from class: com.google.android.gms.internal.ads.zzeri
            @Override // com.google.android.gms.internal.ads.zzfnj
            public final Object apply(Object obj) {
                this.zza.zzc((Exception) obj);
                return null;
            }
        }, zzfva.zzb());
    }

    final /* synthetic */ zzerk zzc(Exception exc) {
        this.zzb.zzu(exc, "AttestationTokenSignal");
        return null;
    }
}
