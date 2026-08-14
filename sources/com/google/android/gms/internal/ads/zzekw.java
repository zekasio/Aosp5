package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.tapjoy.TapjoyConstants;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzekw implements zzepn {
    private static final Object zza = new Object();
    private final String zzb;
    private final String zzc;
    private final zzcsd zzd;
    private final zzfad zze;
    private final zzeyx zzf;
    private final com.google.android.gms.ads.internal.util.zzg zzg = com.google.android.gms.ads.internal.zzt.zzo().zzh();
    private final zzdpd zzh;

    public zzekw(String str, String str2, zzcsd zzcsdVar, zzfad zzfadVar, zzeyx zzeyxVar, zzdpd zzdpdVar) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzcsdVar;
        this.zze = zzfadVar;
        this.zzf = zzeyxVar;
        this.zzh = zzdpdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        final Bundle bundle = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzha)).booleanValue()) {
            this.zzh.zza().put("seq_num", this.zzb);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzff)).booleanValue()) {
            this.zzd.zzg(this.zzf.zzd);
            bundle.putAll(this.zze.zzb());
        }
        return zzfuj.zzh(new zzepm() { // from class: com.google.android.gms.internal.ads.zzekv
            @Override // com.google.android.gms.internal.ads.zzepm
            public final void zzh(Object obj) {
                this.zza.zzc(bundle, (Bundle) obj);
            }
        });
    }

    final /* synthetic */ void zzc(Bundle bundle, Bundle bundle2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzff)).booleanValue()) {
            bundle2.putBundle("quality_signals", bundle);
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfe)).booleanValue()) {
                synchronized (zza) {
                    this.zzd.zzg(this.zzf.zzd);
                    bundle2.putBundle("quality_signals", this.zze.zzb());
                }
            } else {
                this.zzd.zzg(this.zzf.zzd);
                bundle2.putBundle("quality_signals", this.zze.zzb());
            }
        }
        bundle2.putString("seq_num", this.zzb);
        if (this.zzg.zzP()) {
            return;
        }
        bundle2.putString(TapjoyConstants.TJC_SESSION_ID, this.zzc);
    }
}
