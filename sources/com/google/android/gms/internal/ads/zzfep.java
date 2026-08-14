package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfep implements Runnable {
    public static Boolean zza;
    private final Context zzb;
    private final zzbzg zzc;
    private String zze;
    private int zzf;
    private final zzdna zzg;
    private final zzdye zzi;
    private final zzbtz zzj;
    private final zzfeu zzd = zzfex.zzc();
    private boolean zzh = false;

    public zzfep(Context context, zzbzg zzbzgVar, zzdna zzdnaVar, zzdye zzdyeVar, zzbtz zzbtzVar, byte[] bArr) {
        this.zzb = context;
        this.zzc = zzbzgVar;
        this.zzg = zzdnaVar;
        this.zzi = zzdyeVar;
        this.zzj = zzbtzVar;
    }

    public static synchronized boolean zza() {
        if (zza == null) {
            if (((Boolean) zzbcd.zzb.zze()).booleanValue()) {
                zza = Boolean.valueOf(Math.random() < ((Double) zzbcd.zza.zze()).doubleValue());
            } else {
                zza = false;
            }
        }
        return zza.booleanValue();
    }

    private final synchronized void zzc() {
        if (this.zzh) {
            return;
        }
        this.zzh = true;
        if (zza()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            this.zze = com.google.android.gms.ads.internal.util.zzs.zzn(this.zzb);
            this.zzf = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzb);
            long jIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhX)).intValue();
            zzbzn.zzd.scheduleAtFixedRate(this, jIntValue, jIntValue, TimeUnit.MILLISECONDS);
        }
    }

    private final synchronized void zzd() {
        try {
            new zzdyd(this.zzb, this.zzc.zza, this.zzj, Binder.getCallingUid(), null).zza(new zzdyb((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhW), 60000, new HashMap(), ((zzfex) this.zzd.zzal()).zzax(), "application/x-protobuf", false));
            this.zzd.zzc();
        } catch (Exception e) {
            if ((e instanceof zzdtf) && ((zzdtf) e).zza() == 3) {
                this.zzd.zzc();
            } else {
                com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "CuiMonitor.sendCuiPing");
            }
        }
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        if (zza()) {
            if (this.zzd.zza() == 0) {
                return;
            }
            zzd();
        }
    }

    public final synchronized void zzb(zzfeg zzfegVar) {
        if (!this.zzh) {
            zzc();
        }
        if (zza()) {
            if (zzfegVar == null) {
                return;
            }
            if (this.zzd.zza() >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhY)).intValue()) {
                return;
            }
            zzfeu zzfeuVar = this.zzd;
            zzfev zzfevVarZza = zzfew.zza();
            zzfer zzferVarZza = zzfes.zza();
            zzferVarZza.zzr(zzfegVar.zzk());
            zzferVarZza.zzn(zzfegVar.zzj());
            zzferVarZza.zzf(zzfegVar.zzb());
            zzferVarZza.zzt(3);
            zzferVarZza.zzl(this.zzc.zza);
            zzferVarZza.zza(this.zze);
            zzferVarZza.zzj(Build.VERSION.RELEASE);
            zzferVarZza.zzo(Build.VERSION.SDK_INT);
            zzferVarZza.zzs(zzfegVar.zzm());
            zzferVarZza.zzi(zzfegVar.zza());
            zzferVarZza.zzd(this.zzf);
            zzferVarZza.zzq(zzfegVar.zzl());
            zzferVarZza.zzb(zzfegVar.zzc());
            zzferVarZza.zze(zzfegVar.zze());
            zzferVarZza.zzg(zzfegVar.zzf());
            zzferVarZza.zzh(this.zzg.zzc(zzfegVar.zzf()));
            zzferVarZza.zzk(zzfegVar.zzg());
            zzferVarZza.zzc(zzfegVar.zzd());
            zzferVarZza.zzp(zzfegVar.zzi());
            zzferVarZza.zzm(zzfegVar.zzh());
            zzfevVarZza.zza(zzferVarZza);
            zzfeuVar.zzb(zzfevVarZza);
        }
    }
}
