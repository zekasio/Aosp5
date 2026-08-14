package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbyk {
    final String zzf;
    private final com.google.android.gms.ads.internal.util.zzg zzj;
    long zza = -1;
    long zzb = -1;
    int zzc = -1;
    int zzd = -1;
    long zze = 0;
    private final Object zzi = new Object();
    int zzg = 0;
    int zzh = 0;

    public zzbyk(String str, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzf = str;
        this.zzj = zzgVar;
    }

    private final void zzg() {
        if (((Boolean) zzbcr.zza.zze()).booleanValue()) {
            synchronized (this.zzi) {
                this.zzc--;
                this.zzd--;
            }
        }
    }

    public final Bundle zza(Context context, String str) {
        Bundle bundle;
        synchronized (this.zzi) {
            bundle = new Bundle();
            if (!this.zzj.zzP()) {
                bundle.putString(TapjoyConstants.TJC_SESSION_ID, this.zzf);
            }
            bundle.putLong("basets", this.zzb);
            bundle.putLong("currts", this.zza);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.zzc);
            bundle.putInt("preqs_in_session", this.zzd);
            bundle.putLong("time_in_session", this.zze);
            bundle.putInt("pclick", this.zzg);
            bundle.putInt("pimp", this.zzh);
            Context contextZza = zzbub.zza(context);
            int identifier = contextZza.getResources().getIdentifier("Theme.Translucent", TJAdUnitConstants.String.STYLE, TapjoyConstants.TJC_DEVICE_PLATFORM_TYPE);
            boolean z = false;
            if (identifier == 0) {
                zzbza.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            } else {
                try {
                    if (identifier == contextZza.getPackageManager().getActivityInfo(new ComponentName(contextZza.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                        z = true;
                    } else {
                        zzbza.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    zzbza.zzj("Fail to fetch AdActivity theme");
                    zzbza.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                }
            }
            bundle.putBoolean("support_transparent_background", z);
        }
        return bundle;
    }

    public final void zzb() {
        synchronized (this.zzi) {
            this.zzg++;
        }
    }

    public final void zzc() {
        synchronized (this.zzi) {
            this.zzh++;
        }
    }

    public final void zzd() {
        zzg();
    }

    public final void zze() {
        zzg();
    }

    public final void zzf(com.google.android.gms.ads.internal.client.zzl zzlVar, long j) {
        Bundle bundle;
        synchronized (this.zzi) {
            long jZzd = this.zzj.zzd();
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
            if (this.zzb == -1) {
                if (jCurrentTimeMillis - jZzd > ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzaN)).longValue()) {
                    this.zzd = -1;
                } else {
                    this.zzd = this.zzj.zzc();
                }
                this.zzb = j;
                this.zza = j;
            } else {
                this.zza = j;
            }
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdd)).booleanValue() && (bundle = zzlVar.zzc) != null && bundle.getInt("gw", 2) == 1) {
                return;
            }
            this.zzc++;
            int i = this.zzd + 1;
            this.zzd = i;
            if (i == 0) {
                this.zze = 0L;
                this.zzj.zzD(jCurrentTimeMillis);
            } else {
                this.zze = jCurrentTimeMillis - this.zzj.zze();
            }
        }
    }
}
