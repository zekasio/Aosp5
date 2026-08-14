package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
@ParametersAreNonnullByDefault
public final class zzbyj {
    private final Object zza = new Object();
    private final com.google.android.gms.ads.internal.util.zzj zzb;
    private final zzbyn zzc;
    private boolean zzd;
    private Context zze;
    private zzbzg zzf;
    private String zzg;
    private zzbaz zzh;
    private Boolean zzi;
    private final AtomicInteger zzj;
    private final zzbyi zzk;
    private final Object zzl;
    private zzfut zzm;
    private final AtomicBoolean zzn;

    public zzbyj() {
        com.google.android.gms.ads.internal.util.zzj zzjVar = new com.google.android.gms.ads.internal.util.zzj();
        this.zzb = zzjVar;
        this.zzc = new zzbyn(com.google.android.gms.ads.internal.client.zzay.zzd(), zzjVar);
        this.zzd = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = new AtomicInteger(0);
        this.zzk = new zzbyi(null);
        this.zzl = new Object();
        this.zzn = new AtomicBoolean();
    }

    public final int zza() {
        return this.zzj.get();
    }

    public final Context zzc() {
        return this.zze;
    }

    public final Resources zzd() {
        if (this.zzf.zzd) {
            return this.zze.getResources();
        }
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzjh)).booleanValue()) {
                return zzbze.zza(this.zze).getResources();
            }
            zzbze.zza(this.zze).getResources();
            return null;
        } catch (zzbzd e) {
            zzbza.zzk("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    public final zzbaz zzf() {
        zzbaz zzbazVar;
        synchronized (this.zza) {
            zzbazVar = this.zzh;
        }
        return zzbazVar;
    }

    public final zzbyn zzg() {
        return this.zzc;
    }

    public final com.google.android.gms.ads.internal.util.zzg zzh() {
        com.google.android.gms.ads.internal.util.zzj zzjVar;
        synchronized (this.zza) {
            zzjVar = this.zzb;
        }
        return zzjVar;
    }

    public final zzfut zzj() {
        if (this.zze != null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcp)).booleanValue()) {
                synchronized (this.zzl) {
                    zzfut zzfutVar = this.zzm;
                    if (zzfutVar != null) {
                        return zzfutVar;
                    }
                    zzfut zzfutVarZzb = zzbzn.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzbye
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.zza.zzn();
                        }
                    });
                    this.zzm = zzfutVarZzb;
                    return zzfutVarZzb;
                }
            }
        }
        return zzfuj.zzh(new ArrayList());
    }

    public final Boolean zzk() {
        Boolean bool;
        synchronized (this.zza) {
            bool = this.zzi;
        }
        return bool;
    }

    public final String zzm() {
        return this.zzg;
    }

    final /* synthetic */ ArrayList zzn() throws Exception {
        Context contextZza = zzbub.zza(this.zze);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo packageInfo = Wrappers.packageManager(contextZza).getPackageInfo(contextZza.getApplicationInfo().packageName, 4096);
            if (packageInfo.requestedPermissions != null && packageInfo.requestedPermissionsFlags != null) {
                for (int i = 0; i < packageInfo.requestedPermissions.length; i++) {
                    if ((packageInfo.requestedPermissionsFlags[i] & 2) != 0) {
                        arrayList.add(packageInfo.requestedPermissions[i]);
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final void zzp() {
        this.zzk.zza();
    }

    public final void zzq() {
        this.zzj.decrementAndGet();
    }

    public final void zzr() {
        this.zzj.incrementAndGet();
    }

    public final void zzs(Context context, zzbzg zzbzgVar) {
        zzbaz zzbazVar;
        synchronized (this.zza) {
            if (!this.zzd) {
                this.zze = context.getApplicationContext();
                this.zzf = zzbzgVar;
                com.google.android.gms.ads.internal.zzt.zzb().zzc(this.zzc);
                this.zzb.zzr(this.zze);
                zzbsf.zzb(this.zze, this.zzf);
                com.google.android.gms.ads.internal.zzt.zze();
                if (((Boolean) zzbce.zzc.zze()).booleanValue()) {
                    zzbazVar = new zzbaz();
                } else {
                    com.google.android.gms.ads.internal.util.zze.zza("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                    zzbazVar = null;
                }
                this.zzh = zzbazVar;
                if (zzbazVar != null) {
                    zzbzq.zza(new zzbyf(this).zzb(), "AppState.registerCsiReporter");
                }
                if (PlatformVersion.isAtLeastO()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhL)).booleanValue()) {
                        ((ConnectivityManager) context.getSystemService("connectivity")).registerDefaultNetworkCallback(new zzbyg(this));
                    }
                }
                this.zzd = true;
                zzj();
            }
        }
        com.google.android.gms.ads.internal.zzt.zzp().zzc(context, zzbzgVar.zza);
    }

    public final void zzt(Throwable th, String str) {
        zzbsf.zzb(this.zze, this.zzf).zzg(th, str, ((Double) zzbct.zzg.zze()).floatValue());
    }

    public final void zzu(Throwable th, String str) {
        zzbsf.zzb(this.zze, this.zzf).zzf(th, str);
    }

    public final void zzv(Boolean bool) {
        synchronized (this.zza) {
            this.zzi = bool;
        }
    }

    public final void zzw(String str) {
        this.zzg = str;
    }

    public final boolean zzx(Context context) {
        if (PlatformVersion.isAtLeastO()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhL)).booleanValue()) {
                return this.zzn.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
