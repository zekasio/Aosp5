package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.tapjoy.TJAdUnitConstants;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcnc implements zzbly {
    private final Context zza;
    private final zzatb zzb;
    private final PowerManager zzc;

    public zzcnc(Context context, zzatb zzatbVar) {
        this.zza = context;
        this.zzb = zzatbVar;
        this.zzc = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final JSONObject zzb(zzcnf zzcnfVar) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzate zzateVar = zzcnfVar.zzf;
        if (zzateVar == null) {
            jSONObject = new JSONObject();
        } else {
            if (this.zzb.zzd() == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z = zzateVar.zza;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObjectPut = jSONObject3.put("afmaVersion", this.zzb.zzb()).put("activeViewJSON", this.zzb.zzd()).put("timestamp", zzcnfVar.zzd).put("adFormat", this.zzb.zza()).put("hashCode", this.zzb.zzc()).put("isMraid", false);
            boolean z2 = zzcnfVar.zzc;
            jSONObjectPut.put("isStopped", false).put("isPaused", zzcnfVar.zzb).put("isNative", this.zzb.zze()).put("isScreenOn", Build.VERSION.SDK_INT >= 20 ? this.zzc.isInteractive() : this.zzc.isScreenOn()).put("appMuted", com.google.android.gms.ads.internal.zzt.zzr().zze()).put("appVolume", com.google.android.gms.ads.internal.zzt.zzr().zza()).put("deviceVolume", com.google.android.gms.ads.internal.util.zzab.zzb(this.zza.getApplicationContext()));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfl)).booleanValue()) {
                AudioManager audioManager = (AudioManager) this.zza.getApplicationContext().getSystemService("audio");
                Integer numValueOf = audioManager == null ? null : Integer.valueOf(audioManager.getMode());
                if (numValueOf != null) {
                    jSONObject3.put("audioMode", numValueOf);
                }
            }
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.zza.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", zzateVar.zzb).put("isAttachedToWindow", z).put("viewBox", new JSONObject().put(TJAdUnitConstants.String.TOP, zzateVar.zzc.top).put(TJAdUnitConstants.String.BOTTOM, zzateVar.zzc.bottom).put(TJAdUnitConstants.String.LEFT, zzateVar.zzc.left).put(TJAdUnitConstants.String.RIGHT, zzateVar.zzc.right)).put("adBox", new JSONObject().put(TJAdUnitConstants.String.TOP, zzateVar.zzd.top).put(TJAdUnitConstants.String.BOTTOM, zzateVar.zzd.bottom).put(TJAdUnitConstants.String.LEFT, zzateVar.zzd.left).put(TJAdUnitConstants.String.RIGHT, zzateVar.zzd.right)).put("globalVisibleBox", new JSONObject().put(TJAdUnitConstants.String.TOP, zzateVar.zze.top).put(TJAdUnitConstants.String.BOTTOM, zzateVar.zze.bottom).put(TJAdUnitConstants.String.LEFT, zzateVar.zze.left).put(TJAdUnitConstants.String.RIGHT, zzateVar.zze.right)).put("globalVisibleBoxVisible", zzateVar.zzf).put("localVisibleBox", new JSONObject().put(TJAdUnitConstants.String.TOP, zzateVar.zzg.top).put(TJAdUnitConstants.String.BOTTOM, zzateVar.zzg.bottom).put(TJAdUnitConstants.String.LEFT, zzateVar.zzg.left).put(TJAdUnitConstants.String.RIGHT, zzateVar.zzg.right)).put("localVisibleBoxVisible", zzateVar.zzh).put("hitBox", new JSONObject().put(TJAdUnitConstants.String.TOP, zzateVar.zzi.top).put(TJAdUnitConstants.String.BOTTOM, zzateVar.zzi.bottom).put(TJAdUnitConstants.String.LEFT, zzateVar.zzi.left).put(TJAdUnitConstants.String.RIGHT, zzateVar.zzi.right)).put("screenDensity", this.zza.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", zzcnfVar.zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbi)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = zzateVar.zzk;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put(TJAdUnitConstants.String.TOP, rect2.top).put(TJAdUnitConstants.String.BOTTOM, rect2.bottom).put(TJAdUnitConstants.String.LEFT, rect2.left).put(TJAdUnitConstants.String.RIGHT, rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzcnfVar.zze)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
