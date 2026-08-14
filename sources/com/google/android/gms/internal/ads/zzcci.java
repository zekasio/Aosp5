package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcci implements zzbhp {
    private boolean zza;

    private static int zzb(Context context, Map map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                com.google.android.gms.ads.internal.client.zzay.zzb();
                i = zzbyt.zzy(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                zzbza.zzj("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Parse pixels for " + str + ", got string " + str2 + ", int " + i + ".");
        }
        return i;
    }

    private static void zzc(zzcax zzcaxVar, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzcaxVar.zzB(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                zzbza.zzj(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            zzcaxVar.zzA(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzcaxVar.zzy(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzcaxVar.zzz(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzcaxVar.zzD(Integer.parseInt(str5));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        int iMin;
        int iMin2;
        int i;
        zzcbj zzcbjVar = (zzcbj) obj;
        Integer numValueOf = null;
        Integer numValueOf2 = map.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map.get("playerId"))) : null;
        Integer numZzl = (zzcbjVar.zzo() == null || zzcbjVar.zzo().zza() == null) ? null : zzcbjVar.zzo().zza().zzl();
        if (numValueOf2 != null && numZzl != null && !numValueOf2.equals(numZzl)) {
            zzbza.zzi(String.format(Locale.US, "Event intended for player %s, but sent to player %d - event ignored", numValueOf2, numZzl));
            return;
        }
        String str = (String) map.get("action");
        if (str == null) {
            zzbza.zzj("Action missing from video GMSG.");
            return;
        }
        if (com.google.android.gms.ads.internal.util.zze.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            zzbza.zze("Video GMSG: " + str + " " + jSONObject.toString());
        }
        if ("background".equals(str)) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                zzbza.zzj("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                zzcbjVar.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                zzbza.zzj("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if ("playerBackground".equals(str)) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                zzbza.zzj("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                zzcbjVar.zzB(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused2) {
                zzbza.zzj("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        if ("decoderProps".equals(str)) {
            String str4 = (String) map.get("mimeTypes");
            if (str4 == null) {
                zzbza.zzj("No MIME types specified for decoder properties inspection.");
                HashMap map2 = new HashMap();
                map2.put("event", "decoderProps");
                map2.put("error", "missingMimeTypes");
                zzcbjVar.zzd("onVideoEvent", map2);
                return;
            }
            HashMap map3 = new HashMap();
            for (String str5 : str4.split(",")) {
                map3.put(str5, com.google.android.gms.ads.internal.util.zzch.zza(str5.trim()));
            }
            HashMap map4 = new HashMap();
            map4.put("event", "decoderProps");
            map4.put("mimeTypes", map3);
            zzcbjVar.zzd("onVideoEvent", map4);
            return;
        }
        zzcay zzcayVarZzo = zzcbjVar.zzo();
        if (zzcayVarZzo == null) {
            zzbza.zzj("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean zEquals = "new".equals(str);
        boolean zEquals2 = "position".equals(str);
        if (zEquals || zEquals2) {
            Context context = zzcbjVar.getContext();
            int iZzb = zzb(context, map, "x", 0);
            int iZzb2 = zzb(context, map, "y", 0);
            int iZzb3 = zzb(context, map, "w", -1);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdt)).booleanValue()) {
                iMin = iZzb3 == -1 ? zzcbjVar.zzh() : Math.min(iZzb3, zzcbjVar.zzh());
            } else {
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    com.google.android.gms.ads.internal.util.zze.zza("Calculate width with original width " + iZzb3 + ", videoHost.getVideoBoundingWidth() " + zzcbjVar.zzh() + ", x " + iZzb + ".");
                }
                iMin = Math.min(iZzb3, zzcbjVar.zzh() - iZzb);
            }
            int iZzb4 = zzb(context, map, "h", -1);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdt)).booleanValue()) {
                iMin2 = iZzb4 == -1 ? zzcbjVar.zzg() : Math.min(iZzb4, zzcbjVar.zzg());
            } else {
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    com.google.android.gms.ads.internal.util.zze.zza("Calculate height with original height " + iZzb4 + ", videoHost.getVideoBoundingHeight() " + zzcbjVar.zzg() + ", y " + iZzb2 + ".");
                }
                iMin2 = Math.min(iZzb4, zzcbjVar.zzg() - iZzb2);
            }
            int i2 = iMin2;
            try {
                i = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused3) {
                i = 0;
            }
            boolean z = Boolean.parseBoolean((String) map.get("spherical"));
            if (!zEquals || zzcayVarZzo.zza() != null) {
                zzcayVarZzo.zzb(iZzb, iZzb2, iMin, i2);
                return;
            }
            zzcayVarZzo.zzc(iZzb, iZzb2, iMin, i2, i, z, new zzcbi((String) map.get("flags")), numValueOf2);
            zzcax zzcaxVarZza = zzcayVarZzo.zza();
            if (zzcaxVarZza != null) {
                zzc(zzcaxVarZza, map);
                return;
            }
            return;
        }
        zzcfe zzcfeVarZzq = zzcbjVar.zzq();
        if (zzcfeVarZzq != null) {
            if ("timeupdate".equals(str)) {
                String str6 = (String) map.get(TJAdUnitConstants.String.VIDEO_CURRENT_TIME);
                if (str6 == null) {
                    zzbza.zzj("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    zzcfeVarZzq.zzt(Float.parseFloat(str6));
                    return;
                } catch (NumberFormatException unused4) {
                    zzbza.zzj("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                    return;
                }
            }
            if ("skip".equals(str)) {
                zzcfeVarZzq.zzu();
                return;
            }
        }
        zzcax zzcaxVarZza2 = zzcayVarZzo.zza();
        if (zzcaxVarZza2 == null) {
            HashMap map5 = new HashMap();
            map5.put("event", "no_video_view");
            zzcbjVar.zzd("onVideoEvent", map5);
            return;
        }
        if (TJAdUnitConstants.String.CLICK.equals(str)) {
            Context context2 = zzcbjVar.getContext();
            int iZzb5 = zzb(context2, map, "x", 0);
            float fZzb = zzb(context2, map, "y", 0);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, iZzb5, fZzb, 0);
            zzcaxVarZza2.zzx(motionEventObtain);
            motionEventObtain.recycle();
            return;
        }
        if (TJAdUnitConstants.String.VIDEO_CURRENT_TIME.equals(str)) {
            String str7 = (String) map.get("time");
            if (str7 == null) {
                zzbza.zzj("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                zzcaxVarZza2.zzw((int) (Float.parseFloat(str7) * 1000.0f));
                return;
            } catch (NumberFormatException unused5) {
                zzbza.zzj("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                return;
            }
        }
        if ("hide".equals(str)) {
            zzcaxVarZza2.setVisibility(4);
            return;
        }
        if ("load".equals(str)) {
            zzcaxVarZza2.zzr();
            return;
        }
        if ("loadControl".equals(str)) {
            zzc(zzcaxVarZza2, map);
            return;
        }
        if ("muted".equals(str)) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                zzcaxVarZza2.zzs();
                return;
            } else {
                zzcaxVarZza2.zzI();
                return;
            }
        }
        if ("pause".equals(str)) {
            zzcaxVarZza2.zzu();
            return;
        }
        if ("play".equals(str)) {
            zzcaxVarZza2.zzv();
            return;
        }
        if (TJAdUnitConstants.String.BEACON_SHOW_PATH.equals(str)) {
            zzcaxVarZza2.setVisibility(0);
            return;
        }
        if ("src".equals(str)) {
            String str8 = (String) map.get("src");
            if (map.containsKey("periodicReportIntervalMs")) {
                try {
                    numValueOf = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                } catch (NumberFormatException unused6) {
                    zzbza.zzj("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
                }
            }
            String[] strArr = {str8};
            String str9 = (String) map.get("demuxed");
            if (str9 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str9);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                        strArr2[i3] = jSONArray.getString(i3);
                    }
                    strArr = strArr2;
                } catch (JSONException unused7) {
                    zzbza.zzj("Malformed demuxed URL list for playback: ".concat(str9));
                    strArr = new String[]{str8};
                }
            }
            if (numValueOf != null) {
                zzcbjVar.zzA(numValueOf.intValue());
            }
            zzcaxVarZza2.zzE(str8, strArr);
            return;
        }
        if ("touchMove".equals(str)) {
            Context context3 = zzcbjVar.getContext();
            zzcaxVarZza2.zzH(zzb(context3, map, "dx", 0), zzb(context3, map, "dy", 0));
            if (this.zza) {
                return;
            }
            zzcbjVar.zzu();
            this.zza = true;
            return;
        }
        if (!TapjoyConstants.TJC_VOLUME.equals(str)) {
            if ("watermark".equals(str)) {
                zzcaxVarZza2.zzn();
                return;
            } else {
                zzbza.zzj("Unknown video action: ".concat(str));
                return;
            }
        }
        String str10 = (String) map.get(TapjoyConstants.TJC_VOLUME);
        if (str10 == null) {
            zzbza.zzj("Level parameter missing from volume video GMSG.");
            return;
        }
        try {
            zzcaxVarZza2.zzG(Float.parseFloat(str10));
        } catch (NumberFormatException unused8) {
            zzbza.zzj("Could not parse volume parameter from volume video GMSG: ".concat(str10));
        }
    }
}
