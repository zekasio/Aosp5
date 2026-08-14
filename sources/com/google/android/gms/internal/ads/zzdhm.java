package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdhm implements View.OnClickListener {
    String zza;
    Long zzb;
    WeakReference zzc;
    private final zzdlf zzd;
    private final Clock zze;
    private zzbfr zzf;
    private zzbhp zzg;

    public zzdhm(zzdlf zzdlfVar, Clock clock) {
        this.zzd = zzdlfVar;
        this.zze = clock;
    }

    private final void zzd() {
        View view;
        this.zza = null;
        this.zzb = null;
        WeakReference weakReference = this.zzc;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.zzc = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference weakReference = this.zzc;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.zza != null && this.zzb != null) {
            HashMap map = new HashMap();
            map.put("id", this.zza);
            map.put("time_interval", String.valueOf(this.zze.currentTimeMillis() - this.zzb.longValue()));
            map.put("messageType", "onePointFiveClick");
            this.zzd.zzg("sendMessageToNativeJs", map);
        }
        zzd();
    }

    public final zzbfr zza() {
        return this.zzf;
    }

    public final void zzb() {
        if (this.zzf == null || this.zzb == null) {
            return;
        }
        zzd();
        try {
            this.zzf.zze();
        } catch (RemoteException e) {
            zzbza.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzc(final zzbfr zzbfrVar) {
        this.zzf = zzbfrVar;
        zzbhp zzbhpVar = this.zzg;
        if (zzbhpVar != null) {
            this.zzd.zzk("/unconfirmedClick", zzbhpVar);
        }
        zzbhp zzbhpVar2 = new zzbhp() { // from class: com.google.android.gms.internal.ads.zzdhl
            @Override // com.google.android.gms.internal.ads.zzbhp
            public final void zza(Object obj, Map map) {
                zzdhm zzdhmVar = this.zza;
                zzbfr zzbfrVar2 = zzbfrVar;
                try {
                    zzdhmVar.zzb = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    zzbza.zzg("Failed to call parse unconfirmedClickTimestamp.");
                }
                zzdhmVar.zza = (String) map.get("id");
                String str = (String) map.get("asset_id");
                if (zzbfrVar2 == null) {
                    zzbza.zze("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    zzbfrVar2.zzf(str);
                } catch (RemoteException e) {
                    zzbza.zzl("#007 Could not call remote method.", e);
                }
            }
        };
        this.zzg = zzbhpVar2;
        this.zzd.zzi("/unconfirmedClick", zzbhpVar2);
    }
}
