package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import com.tapjoy.TJAdUnitConstants;
import com.vungle.warren.model.Advertisement;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
@ParametersAreNonnullByDefault
public final class zzdff implements zzdgq {
    private com.google.android.gms.ads.internal.client.zzcs zzA;
    private final Context zza;
    private final zzdgt zzb;
    private final JSONObject zzc;
    private final zzdlf zzd;
    private final zzdgi zze;
    private final zzapw zzf;
    private final zzcvg zzg;
    private final zzcum zzh;
    private final zzdca zzi;
    private final zzeyc zzj;
    private final zzbzg zzk;
    private final zzeyx zzl;
    private final zzcng zzm;
    private final zzdhm zzn;
    private final Clock zzo;
    private final zzdbw zzp;
    private final zzfff zzq;
    private final zzfen zzr;
    private boolean zzt;
    private boolean zzs = false;
    private boolean zzu = false;
    private boolean zzv = false;
    private Point zzw = new Point();
    private Point zzx = new Point();
    private long zzy = 0;
    private long zzz = 0;

    public zzdff(Context context, zzdgt zzdgtVar, JSONObject jSONObject, zzdlf zzdlfVar, zzdgi zzdgiVar, zzapw zzapwVar, zzcvg zzcvgVar, zzcum zzcumVar, zzdca zzdcaVar, zzeyc zzeycVar, zzbzg zzbzgVar, zzeyx zzeyxVar, zzcng zzcngVar, zzdhm zzdhmVar, Clock clock, zzdbw zzdbwVar, zzfff zzfffVar, zzfen zzfenVar) {
        this.zza = context;
        this.zzb = zzdgtVar;
        this.zzc = jSONObject;
        this.zzd = zzdlfVar;
        this.zze = zzdgiVar;
        this.zzf = zzapwVar;
        this.zzg = zzcvgVar;
        this.zzh = zzcumVar;
        this.zzi = zzdcaVar;
        this.zzj = zzeycVar;
        this.zzk = zzbzgVar;
        this.zzl = zzeyxVar;
        this.zzm = zzcngVar;
        this.zzn = zzdhmVar;
        this.zzo = clock;
        this.zzp = zzdbwVar;
        this.zzq = zzfffVar;
        this.zzr = zzfenVar;
    }

    private final String zzD(View view, Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int iZzc = this.zze.zzc();
        if (iZzc == 1) {
            return "1099";
        }
        if (iZzc == 2) {
            return "2099";
        }
        if (iZzc != 6) {
            return null;
        }
        return "3099";
    }

    private final boolean zzE(String str) {
        JSONObject jSONObjectOptJSONObject = this.zzc.optJSONObject("allow_pub_event_reporting");
        return jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean(str, false);
    }

    private final boolean zzF() {
        return this.zzc.optBoolean("allow_custom_click_gesture", false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean zzG(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z) {
        Preconditions.checkMainThread("recordImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.zzc);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzda)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z);
            Context context = this.zza;
            JSONObject jSONObject7 = new JSONObject();
            com.google.android.gms.ads.internal.zzt.zzp();
            DisplayMetrics displayMetricsZzq = com.google.android.gms.ads.internal.util.zzs.zzq((WindowManager) context.getSystemService("window"));
            zzdfb zzdfbVar = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            try {
                jSONObject7.put(TJAdUnitConstants.String.WIDTH, com.google.android.gms.ads.internal.client.zzay.zzb().zzb(context, displayMetricsZzq.widthPixels));
                jSONObject7.put(TJAdUnitConstants.String.HEIGHT, com.google.android.gms.ads.internal.client.zzay.zzb().zzb(context, displayMetricsZzq.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhM)).booleanValue()) {
                this.zzd.zzi("/clickRecorded", new zzdfc(this, zzdfbVar));
            } else {
                this.zzd.zzi("/logScionEvent", new zzdfa(this, objArr == true ? 1 : 0));
            }
            this.zzd.zzi("/nativeImpression", new zzdfe(this, objArr2 == true ? 1 : 0));
            zzbzq.zza(this.zzd.zzd("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.zzs) {
                return true;
            }
            this.zzs = com.google.android.gms.ads.internal.zzt.zzs().zzn(this.zza, this.zzk.zza, this.zzj.zzD.toString(), this.zzl.zzf);
            return true;
        } catch (JSONException e) {
            zzbza.zzh("Unable to create impression JSON.", e);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final boolean zzA() {
        if (zza() == 0) {
            return true;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzjF)).booleanValue()) {
            return this.zzl.zzi.zzj;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final boolean zzB() {
        return zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final boolean zzC(Bundle bundle) {
        if (zzE("impression_reporting")) {
            return zzG(null, null, null, null, null, com.google.android.gms.ads.internal.client.zzay.zzb().zzk(bundle, null), false);
        }
        zzbza.zzg("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final int zza() {
        if (this.zzl.zzi == null) {
            return 0;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzjF)).booleanValue()) {
            return this.zzl.zzi.zzi;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final JSONObject zze(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        JSONObject jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbx.zzd(this.zza, map, map2, view, scaleType);
        JSONObject jSONObjectZzg = com.google.android.gms.ads.internal.util.zzbx.zzg(this.zza, view);
        JSONObject jSONObjectZzf = com.google.android.gms.ads.internal.util.zzbx.zzf(view);
        JSONObject jSONObjectZze = com.google.android.gms.ads.internal.util.zzbx.zze(this.zza, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", jSONObjectZzd);
            jSONObject.put("ad_view_signal", jSONObjectZzg);
            jSONObject.put("scroll_view_signal", jSONObjectZzf);
            jSONObject.put("lock_screen_signal", jSONObjectZze);
            return jSONObject;
        } catch (JSONException e) {
            zzbza.zzh("Unable to create native ad view signals JSON.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final JSONObject zzf(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        JSONObject jSONObjectZze = zze(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.zzv && zzF()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (jSONObjectZze != null) {
                jSONObject.put("nas", jSONObjectZze);
            }
        } catch (JSONException e) {
            zzbza.zzh("Unable to create native click meta data JSON.", e);
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzg() {
        try {
            com.google.android.gms.ads.internal.client.zzcs zzcsVar = this.zzA;
            if (zzcsVar != null) {
                zzcsVar.zze();
            }
        } catch (RemoteException e) {
            zzbza.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzh() {
        if (this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzn.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzi() {
        this.zzd.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzk(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) {
        JSONObject jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbx.zzd(this.zza, map, map2, view2, scaleType);
        JSONObject jSONObjectZzg = com.google.android.gms.ads.internal.util.zzbx.zzg(this.zza, view2);
        JSONObject jSONObjectZzf = com.google.android.gms.ads.internal.util.zzbx.zzf(view2);
        JSONObject jSONObjectZze = com.google.android.gms.ads.internal.util.zzbx.zze(this.zza, view2);
        String strZzD = zzD(view, map);
        zzn(true == ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdf)).booleanValue() ? view2 : view, jSONObjectZzg, jSONObjectZzd, jSONObjectZzf, jSONObjectZze, strZzD, com.google.android.gms.ads.internal.util.zzbx.zzc(strZzD, this.zza, this.zzx, this.zzw), null, z, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzl(String str) {
        zzn(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzm(Bundle bundle) {
        if (bundle == null) {
            zzbza.zze("Click data is null. No click is reported.");
        } else if (!zzE("click_reporting")) {
            zzbza.zzg("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            zzn(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, com.google.android.gms.ads.internal.client.zzay.zzb().zzk(bundle, null), false, false);
        }
    }

    protected final void zzn(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z, boolean z2) {
        String strZze;
        Preconditions.checkMainThread("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.zzc);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            jSONObject7.put("has_custom_click_handler", this.zzb.zzc(this.zze.zzz()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put(Advertisement.KEY_TEMPLATE, this.zze.zzc());
            jSONObject8.put("view_aware_api_used", z);
            zzbdl zzbdlVar = this.zzl.zzi;
            jSONObject8.put("custom_mute_requested", zzbdlVar != null && zzbdlVar.zzg);
            jSONObject8.put("custom_mute_enabled", (this.zze.zzG().isEmpty() || this.zze.zzk() == null) ? false : true);
            if (this.zzn.zza() != null && this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.zzo.currentTimeMillis());
            if (this.zzv && zzF()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            jSONObject8.put("has_custom_click_handler", this.zzb.zzc(this.zze.zzz()) != null);
            try {
                JSONObject jSONObjectOptJSONObject = this.zzc.optJSONObject("tracking_urls_and_actions");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                strZze = this.zzf.zzc().zze(this.zza, jSONObjectOptJSONObject.optString("click_string"), view);
            } catch (Exception e) {
                zzbza.zzh("Exception obtaining click signals", e);
                strZze = null;
            }
            jSONObject8.put("click_signals", strZze);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeg)).booleanValue()) {
                jSONObject8.put("open_chrome_custom_tab", true);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhQ)).booleanValue() && PlatformVersion.isAtLeastR()) {
                jSONObject8.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhR)).booleanValue() && PlatformVersion.isAtLeastR()) {
                jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put(TJAdUnitConstants.String.CLICK, jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long jCurrentTimeMillis = this.zzo.currentTimeMillis();
            jSONObject9.put("time_from_last_touch_down", jCurrentTimeMillis - this.zzy);
            jSONObject9.put("time_from_last_touch", jCurrentTimeMillis - this.zzz);
            jSONObject7.put("touch_signal", jSONObject9);
            zzbzq.zza(this.zzd.zzd("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e2) {
            zzbza.zzh("Unable to create click JSON.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzo(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i) {
        JSONObject jSONObject;
        boolean z2 = false;
        if (this.zzc.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzjF)).booleanValue()) {
                z2 = true;
            }
        }
        if (!z2) {
            if (!this.zzv) {
                zzbza.zze("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!zzF()) {
                zzbza.zze("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        JSONObject jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbx.zzd(this.zza, map, map2, view2, scaleType);
        JSONObject jSONObjectZzg = com.google.android.gms.ads.internal.util.zzbx.zzg(this.zza, view2);
        JSONObject jSONObjectZzf = com.google.android.gms.ads.internal.util.zzbx.zzf(view2);
        JSONObject jSONObjectZze = com.google.android.gms.ads.internal.util.zzbx.zze(this.zza, view2);
        String strZzD = zzD(view, map);
        JSONObject jSONObjectZzc = com.google.android.gms.ads.internal.util.zzbx.zzc(strZzD, this.zza, this.zzx, this.zzw);
        if (z2) {
            try {
                JSONObject jSONObject2 = this.zzc;
                Point point = this.zzx;
                Point point2 = this.zzw;
                try {
                    jSONObject = new JSONObject();
                } catch (Exception e) {
                    e = e;
                    jSONObject = null;
                }
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    if (point != null) {
                        jSONObject3.put("x", point.x);
                        jSONObject3.put("y", point.y);
                    }
                    if (point2 != null) {
                        jSONObject4.put("x", point2.x);
                        jSONObject4.put("y", point2.y);
                    }
                    jSONObject.put("start_point", jSONObject3);
                    jSONObject.put("end_point", jSONObject4);
                    jSONObject.put("duration_ms", i);
                } catch (Exception e2) {
                    e = e2;
                    zzbza.zzh("Error occurred while grabbing custom click gesture signals.", e);
                }
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
            } catch (JSONException e3) {
                zzbza.zzh("Error occurred while adding CustomClickGestureSignals to adJson.", e3);
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e3, "FirstPartyNativeAdCore.performCustomClickGesture");
            }
        }
        zzn(view2, jSONObjectZzg, jSONObjectZzd, jSONObjectZzf, jSONObjectZze, strZzD, jSONObjectZzc, null, z, true);
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzp() {
        Preconditions.checkMainThread("recordDownloadedImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.zzc);
            zzbzq.zza(this.zzd.zzd("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e) {
            zzbza.zzh("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzq(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        String strZzh;
        JSONObject jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbx.zzd(this.zza, map, map2, view, scaleType);
        JSONObject jSONObjectZzg = com.google.android.gms.ads.internal.util.zzbx.zzg(this.zza, view);
        JSONObject jSONObjectZzf = com.google.android.gms.ads.internal.util.zzbx.zzf(view);
        JSONObject jSONObjectZze = com.google.android.gms.ads.internal.util.zzbx.zze(this.zza, view);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzda)).booleanValue()) {
            try {
                strZzh = this.zzf.zzc().zzh(this.zza, view, null);
            } catch (Exception unused) {
                zzbza.zzg("Exception getting data.");
                strZzh = null;
            }
        } else {
            strZzh = null;
        }
        zzG(jSONObjectZzg, jSONObjectZzd, jSONObjectZzf, jSONObjectZze, strZzh, null, com.google.android.gms.ads.internal.util.zzbx.zzh(this.zza, this.zzj));
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzr() {
        zzG(null, null, null, null, null, null, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzs(View view, MotionEvent motionEvent, View view2) {
        this.zzw = com.google.android.gms.ads.internal.util.zzbx.zza(motionEvent, view2);
        long jCurrentTimeMillis = this.zzo.currentTimeMillis();
        this.zzz = jCurrentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.zzy = jCurrentTimeMillis;
            this.zzx = this.zzw;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setLocation(this.zzw.x, this.zzw.y);
        this.zzf.zzd(motionEventObtain);
        motionEventObtain.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzt(Bundle bundle) {
        if (bundle == null) {
            zzbza.zze("Touch event data is null. No touch event is reported.");
            return;
        }
        if (!zzE("touch_reporting")) {
            zzbza.zzg("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
            return;
        }
        this.zzf.zzc().zzl((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzu(View view) {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzbza.zzj("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        zzdhm zzdhmVar = this.zzn;
        if (view == null) {
            return;
        }
        view.setOnClickListener(zzdhmVar);
        view.setClickable(true);
        zzdhmVar.zzc = new WeakReference(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzv() {
        this.zzv = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzw(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        this.zzA = zzcsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzx(zzbfr zzbfrVar) {
        if (this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzn.zzc(zzbfrVar);
        } else {
            zzbza.zzj("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzy(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.zzw = new Point();
        this.zzx = new Point();
        if (!this.zzt) {
            this.zzp.zza(view);
            this.zzt = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.zzm.zzi(this);
        boolean zZzi = com.google.android.gms.ads.internal.util.zzbx.zzi(this.zzk.zzc);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (zZzi) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view3 != null) {
                    if (zZzi) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzz(View view, Map map) {
        this.zzw = new Point();
        this.zzx = new Point();
        if (view != null) {
            this.zzp.zzb(view);
        }
        this.zzt = false;
    }

    @Override // com.google.android.gms.internal.ads.zzdgq
    public final void zzj(com.google.android.gms.ads.internal.client.zzcw zzcwVar) {
        try {
            if (this.zzu) {
                return;
            }
            if (zzcwVar == null) {
                zzdgi zzdgiVar = this.zze;
                if (zzdgiVar.zzk() != null) {
                    this.zzu = true;
                    this.zzq.zzc(zzdgiVar.zzk().zzf(), this.zzr);
                    zzg();
                    return;
                }
            }
            this.zzu = true;
            this.zzq.zzc(zzcwVar.zzf(), this.zzr);
            zzg();
        } catch (RemoteException e) {
            zzbza.zzl("#007 Could not call remote method.", e);
        }
    }
}
