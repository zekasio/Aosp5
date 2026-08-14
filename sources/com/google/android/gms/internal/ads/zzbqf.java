package com.google.android.gms.internal.ads;

import com.tapjoy.TJAdUnitConstants;
import com.vungle.warren.model.AdvertisementDBAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzbqf {
    private final zzcei zza;
    private final String zzb;

    public zzbqf(zzcei zzceiVar, String str) {
        this.zza = zzceiVar;
        this.zzb = str;
    }

    public final void zzf(int i, int i2, int i3, int i4) {
        try {
            this.zza.zze("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i2).put(TJAdUnitConstants.String.WIDTH, i3).put(TJAdUnitConstants.String.HEIGHT, i4));
        } catch (JSONException e) {
            zzbza.zzh("Error occurred while dispatching default position.", e);
        }
    }

    public final void zzg(String str) {
        try {
            JSONObject jSONObjectPut = new JSONObject().put(TJAdUnitConstants.String.MESSAGE, str).put("action", this.zzb);
            zzcei zzceiVar = this.zza;
            if (zzceiVar != null) {
                zzceiVar.zze("onError", jSONObjectPut);
            }
        } catch (JSONException e) {
            zzbza.zzh("Error occurred while dispatching error event.", e);
        }
    }

    public final void zzh(String str) {
        try {
            this.zza.zze("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e) {
            zzbza.zzh("Error occurred while dispatching ready Event.", e);
        }
    }

    public final void zzi(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.zza.zze("onScreenInfoChanged", new JSONObject().put(TJAdUnitConstants.String.WIDTH, i).put(TJAdUnitConstants.String.HEIGHT, i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", f).put(TJAdUnitConstants.String.ROTATION, i5));
        } catch (JSONException e) {
            zzbza.zzh("Error occurred while obtaining screen information.", e);
        }
    }

    public final void zzj(int i, int i2, int i3, int i4) {
        try {
            this.zza.zze("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put(TJAdUnitConstants.String.WIDTH, i3).put(TJAdUnitConstants.String.HEIGHT, i4));
        } catch (JSONException e) {
            zzbza.zzh("Error occurred while dispatching size change.", e);
        }
    }

    public final void zzk(String str) {
        try {
            this.zza.zze("onStateChanged", new JSONObject().put(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_STATE, str));
        } catch (JSONException e) {
            zzbza.zzh("Error occurred while dispatching state change.", e);
        }
    }
}
