package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.tapjoy.TapjoyConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeha extends zzbpe {
    private final String zza;
    private final zzbpc zzb;
    private final zzbzs zzc;
    private final JSONObject zzd;
    private final long zze;
    private boolean zzf;

    public zzeha(String str, zzbpc zzbpcVar, zzbzs zzbzsVar, long j) {
        JSONObject jSONObject = new JSONObject();
        this.zzd = jSONObject;
        this.zzf = false;
        this.zzc = zzbzsVar;
        this.zza = str;
        this.zzb = zzbpcVar;
        this.zze = j;
        try {
            jSONObject.put(TapjoyConstants.TJC_ADAPTER_VERSION, zzbpcVar.zzf().toString());
            jSONObject.put("sdk_version", zzbpcVar.zzg().toString());
            jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    public static synchronized void zzb(String str, zzbzs zzbzsVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
            jSONObject.put("signal_error", "Adapter failed to instantiate");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbt)).booleanValue()) {
                jSONObject.put("signal_error_code", 1);
            }
            zzbzsVar.zzd(jSONObject);
        } catch (JSONException unused) {
        }
    }

    private final synchronized void zzh(String str, int i) {
        if (this.zzf) {
            return;
        }
        try {
            this.zzd.put("signal_error", str);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbu)).booleanValue()) {
                this.zzd.put("latency", com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zze);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbt)).booleanValue()) {
                this.zzd.put("signal_error_code", i);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzd(this.zzd);
        this.zzf = true;
    }

    public final synchronized void zzc() {
        zzh("Signal collection timeout.", 3);
    }

    public final synchronized void zzd() {
        if (this.zzf) {
            return;
        }
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbt)).booleanValue()) {
                this.zzd.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzd(this.zzd);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbpf
    public final synchronized void zze(String str) throws RemoteException {
        if (this.zzf) {
            return;
        }
        if (str == null) {
            zzf("Adapter returned null signals");
            return;
        }
        try {
            this.zzd.put("signals", str);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbu)).booleanValue()) {
                this.zzd.put("latency", com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zze);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbt)).booleanValue()) {
                this.zzd.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzd(this.zzd);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbpf
    public final synchronized void zzf(String str) throws RemoteException {
        zzh(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbpf
    public final synchronized void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzh(zzeVar.zzb, 2);
    }
}
