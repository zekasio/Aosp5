package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzaue;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbcc;
import com.google.android.gms.internal.ads.zzbyd;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzbzn;
import com.google.android.gms.internal.ads.zzfut;
import com.google.android.gms.internal.ads.zzfuu;
import com.vungle.warren.model.ReportDBAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzj implements zzg {
    private boolean zzb;
    private zzfut zzd;
    private SharedPreferences zzf;
    private SharedPreferences.Editor zzg;
    private String zzi;
    private String zzj;
    private final Object zza = new Object();
    private final List zzc = new ArrayList();
    private zzaue zze = null;
    private boolean zzh = true;
    private boolean zzk = true;
    private String zzl = "-1";
    private String zzm = "-1";
    private String zzn = "-1";
    private int zzo = -1;
    private zzbyd zzp = new zzbyd("", 0);
    private long zzq = 0;
    private long zzr = 0;
    private int zzs = -1;
    private int zzt = 0;
    private Set zzu = Collections.emptySet();
    private JSONObject zzv = new JSONObject();
    private boolean zzw = true;
    private boolean zzx = true;
    private String zzy = null;
    private String zzz = "";
    private boolean zzA = false;
    private String zzB = "";
    private int zzC = -1;
    private int zzD = -1;
    private long zzE = 0;

    private final void zzR() {
        zzfut zzfutVar = this.zzd;
        if (zzfutVar == null || zzfutVar.isDone()) {
            return;
        }
        try {
            this.zzd.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            zzbza.zzk("Interrupted while waiting for preferences loaded.", e);
        } catch (CancellationException e2) {
            e = e2;
            zzbza.zzh("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e3) {
            e = e3;
            zzbza.zzh("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e4) {
            e = e4;
            zzbza.zzh("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    private final void zzS() {
        zzbzn.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzi
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzg();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzA(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziu)).booleanValue()) {
            zzR();
            synchronized (this.zza) {
                if (this.zzB.equals(str)) {
                    return;
                }
                this.zzB = str;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("linked_ad_unit", str);
                    this.zzg.apply();
                }
                zzS();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzB(boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziu)).booleanValue()) {
            zzR();
            synchronized (this.zza) {
                if (this.zzA == z) {
                    return;
                }
                this.zzA = z;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putBoolean("linked_device", z);
                    this.zzg.apply();
                }
                zzS();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzC(String str) {
        zzR();
        synchronized (this.zza) {
            if (TextUtils.equals(this.zzy, str)) {
                return;
            }
            this.zzy = str;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putString("display_cutout", str);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzD(long j) {
        zzR();
        synchronized (this.zza) {
            if (this.zzr == j) {
                return;
            }
            this.zzr = j;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putLong("first_ad_req_time_ms", j);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzE(int i) {
        zzR();
        synchronized (this.zza) {
            this.zzo = i;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                if (i == -1) {
                    editor.remove("gad_has_consent_for_cookies");
                } else {
                    editor.putInt("gad_has_consent_for_cookies", i);
                }
                this.zzg.apply();
            }
            zzS();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    @Override // com.google.android.gms.ads.internal.util.zzg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzF(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            r5.zzR()
            java.lang.Object r0 = r5.zza
            monitor-enter(r0)
            int r1 = r6.hashCode()     // Catch: java.lang.Throwable -> L6c
            r2 = -2004976699(0xffffffff887e7bc5, float:-7.6580835E-34)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L30
            r2 = 83641339(0x4fc43fb, float:5.9307345E-36)
            if (r1 == r2) goto L26
            r2 = 1218895378(0x48a6de12, float:341744.56)
            if (r1 == r2) goto L1c
            goto L3a
        L1c:
            java.lang.String r1 = "IABTCF_TCString"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L3a
            r1 = 1
            goto L3b
        L26:
            java.lang.String r1 = "IABTCF_gdprApplies"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L3a
            r1 = 0
            goto L3b
        L30:
            java.lang.String r1 = "IABTCF_PurposeConsents"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L3a
            r1 = 2
            goto L3b
        L3a:
            r1 = -1
        L3b:
            if (r1 == 0) goto L49
            if (r1 == r4) goto L46
            if (r1 == r3) goto L43
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6c
            return
        L43:
            r5.zzn = r7     // Catch: java.lang.Throwable -> L6c
            goto L4b
        L46:
            r5.zzm = r7     // Catch: java.lang.Throwable -> L6c
            goto L4b
        L49:
            r5.zzl = r7     // Catch: java.lang.Throwable -> L6c
        L4b:
            android.content.SharedPreferences$Editor r1 = r5.zzg     // Catch: java.lang.Throwable -> L6c
            if (r1 == 0) goto L67
            java.lang.String r1 = "-1"
            boolean r1 = r7.equals(r1)     // Catch: java.lang.Throwable -> L6c
            if (r1 == 0) goto L5d
            android.content.SharedPreferences$Editor r7 = r5.zzg     // Catch: java.lang.Throwable -> L6c
            r7.remove(r6)     // Catch: java.lang.Throwable -> L6c
            goto L62
        L5d:
            android.content.SharedPreferences$Editor r1 = r5.zzg     // Catch: java.lang.Throwable -> L6c
            r1.putString(r6, r7)     // Catch: java.lang.Throwable -> L6c
        L62:
            android.content.SharedPreferences$Editor r6 = r5.zzg     // Catch: java.lang.Throwable -> L6c
            r6.apply()     // Catch: java.lang.Throwable -> L6c
        L67:
            r5.zzS()     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6c
            return
        L6c:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6c
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzj.zzF(java.lang.String, java.lang.String):void");
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzG(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzif)).booleanValue()) {
            zzR();
            synchronized (this.zza) {
                if (this.zzz.equals(str)) {
                    return;
                }
                this.zzz = str;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("inspector_info", str);
                    this.zzg.apply();
                }
                zzS();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzH(boolean z) {
        zzR();
        synchronized (this.zza) {
            if (z == this.zzk) {
                return;
            }
            this.zzk = z;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putBoolean("gad_idless", z);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzI(String str, String str2, boolean z) {
        zzR();
        synchronized (this.zza) {
            JSONArray jSONArrayOptJSONArray = this.zzv.optJSONArray(str);
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
            }
            int length = jSONArrayOptJSONArray.length();
            int i = 0;
            while (true) {
                if (i < jSONArrayOptJSONArray.length()) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject == null) {
                        return;
                    }
                    if (str2.equals(jSONObjectOptJSONObject.optString(ReportDBAdapter.ReportColumns.COLUMN_TEMPATE_ID))) {
                        if (z && jSONObjectOptJSONObject.optBoolean("uses_media_view", false)) {
                            return;
                        }
                        length = i;
                    } else {
                        i++;
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ReportDBAdapter.ReportColumns.COLUMN_TEMPATE_ID, str2);
                jSONObject.put("uses_media_view", z);
                jSONObject.put("timestamp_ms", com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis());
                jSONArrayOptJSONArray.put(length, jSONObject);
                this.zzv.put(str, jSONArrayOptJSONArray);
            } catch (JSONException e) {
                zzbza.zzk("Could not update native advanced settings", e);
            }
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putString("native_advanced_settings", this.zzv.toString());
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzJ(int i) {
        zzR();
        synchronized (this.zza) {
            if (this.zzs == i) {
                return;
            }
            this.zzs = i;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putInt("request_in_session_count", i);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzK(int i) {
        zzR();
        synchronized (this.zza) {
            if (this.zzD == i) {
                return;
            }
            this.zzD = i;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putInt("sd_app_measure_npa", i);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzL(long j) {
        zzR();
        synchronized (this.zza) {
            if (this.zzE == j) {
                return;
            }
            this.zzE = j;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putLong("sd_app_measure_npa_ts", j);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzM() {
        boolean z;
        zzR();
        synchronized (this.zza) {
            z = this.zzw;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzN() {
        boolean z;
        zzR();
        synchronized (this.zza) {
            z = this.zzx;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzO() {
        boolean z;
        zzR();
        synchronized (this.zza) {
            z = this.zzA;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzP() {
        boolean z;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzar)).booleanValue()) {
            return false;
        }
        zzR();
        synchronized (this.zza) {
            z = this.zzk;
        }
        return z;
    }

    final /* synthetic */ void zzQ(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(AppLovinMediationProvider.ADMOB, 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        synchronized (this.zza) {
            this.zzf = sharedPreferences;
            this.zzg = editorEdit;
            if (PlatformVersion.isAtLeastM()) {
                NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
            }
            this.zzh = this.zzf.getBoolean("use_https", this.zzh);
            this.zzw = this.zzf.getBoolean("content_url_opted_out", this.zzw);
            this.zzi = this.zzf.getString("content_url_hashes", this.zzi);
            this.zzk = this.zzf.getBoolean("gad_idless", this.zzk);
            this.zzx = this.zzf.getBoolean("content_vertical_opted_out", this.zzx);
            this.zzj = this.zzf.getString("content_vertical_hashes", this.zzj);
            this.zzt = this.zzf.getInt("version_code", this.zzt);
            this.zzp = new zzbyd(this.zzf.getString("app_settings_json", this.zzp.zzc()), this.zzf.getLong("app_settings_last_update_ms", this.zzp.zza()));
            this.zzq = this.zzf.getLong("app_last_background_time_ms", this.zzq);
            this.zzs = this.zzf.getInt("request_in_session_count", this.zzs);
            this.zzr = this.zzf.getLong("first_ad_req_time_ms", this.zzr);
            this.zzu = this.zzf.getStringSet("never_pool_slots", this.zzu);
            this.zzy = this.zzf.getString("display_cutout", this.zzy);
            this.zzC = this.zzf.getInt("app_measurement_npa", this.zzC);
            this.zzD = this.zzf.getInt("sd_app_measure_npa", this.zzD);
            this.zzE = this.zzf.getLong("sd_app_measure_npa_ts", this.zzE);
            this.zzz = this.zzf.getString("inspector_info", this.zzz);
            this.zzA = this.zzf.getBoolean("linked_device", this.zzA);
            this.zzB = this.zzf.getString("linked_ad_unit", this.zzB);
            this.zzl = this.zzf.getString("IABTCF_gdprApplies", this.zzl);
            this.zzn = this.zzf.getString("IABTCF_PurposeConsents", this.zzn);
            this.zzm = this.zzf.getString("IABTCF_TCString", this.zzm);
            this.zzo = this.zzf.getInt("gad_has_consent_for_cookies", this.zzo);
            try {
                this.zzv = new JSONObject(this.zzf.getString("native_advanced_settings", JsonUtils.EMPTY_JSON));
            } catch (JSONException e) {
                zzbza.zzk("Could not convert native advanced settings to json object", e);
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zza() {
        int i;
        zzR();
        synchronized (this.zza) {
            i = this.zzt;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzb() {
        int i;
        zzR();
        synchronized (this.zza) {
            i = this.zzo;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzc() {
        int i;
        zzR();
        synchronized (this.zza) {
            i = this.zzs;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzd() {
        long j;
        zzR();
        synchronized (this.zza) {
            j = this.zzq;
        }
        return j;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zze() {
        long j;
        zzR();
        synchronized (this.zza) {
            j = this.zzr;
        }
        return j;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzf() {
        long j;
        zzR();
        synchronized (this.zza) {
            j = this.zzE;
        }
        return j;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final zzaue zzg() {
        if (!this.zzb) {
            return null;
        }
        if ((zzM() && zzN()) || !((Boolean) zzbcc.zzb.zze()).booleanValue()) {
            return null;
        }
        synchronized (this.zza) {
            if (Looper.getMainLooper() == null) {
                return null;
            }
            if (this.zze == null) {
                this.zze = new zzaue();
            }
            this.zze.zze();
            zzbza.zzi("start fetching content...");
            return this.zze;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final zzbyd zzh() {
        zzbyd zzbydVar;
        zzR();
        synchronized (this.zza) {
            zzbydVar = this.zzp;
        }
        return zzbydVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final zzbyd zzi() {
        zzbyd zzbydVar;
        synchronized (this.zza) {
            zzbydVar = this.zzp;
        }
        return zzbydVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzj() {
        String str;
        zzR();
        synchronized (this.zza) {
            str = this.zzi;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzk() {
        String str;
        zzR();
        synchronized (this.zza) {
            str = this.zzj;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzl() {
        String str;
        zzR();
        synchronized (this.zza) {
            str = this.zzB;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzm() {
        String str;
        zzR();
        synchronized (this.zza) {
            str = this.zzy;
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    @Override // com.google.android.gms.ads.internal.util.zzg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String zzn(java.lang.String r6) {
        /*
            r5 = this;
            r5.zzR()
            java.lang.Object r0 = r5.zza
            monitor-enter(r0)
            int r1 = r6.hashCode()     // Catch: java.lang.Throwable -> L50
            r2 = -2004976699(0xffffffff887e7bc5, float:-7.6580835E-34)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L30
            r2 = 83641339(0x4fc43fb, float:5.9307345E-36)
            if (r1 == r2) goto L26
            r2 = 1218895378(0x48a6de12, float:341744.56)
            if (r1 == r2) goto L1c
            goto L3a
        L1c:
            java.lang.String r1 = "IABTCF_TCString"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L3a
            r6 = 1
            goto L3b
        L26:
            java.lang.String r1 = "IABTCF_gdprApplies"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L3a
            r6 = 0
            goto L3b
        L30:
            java.lang.String r1 = "IABTCF_PurposeConsents"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L3a
            r6 = 2
            goto L3b
        L3a:
            r6 = -1
        L3b:
            if (r6 == 0) goto L4c
            if (r6 == r4) goto L48
            if (r6 == r3) goto L44
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            r6 = 0
            return r6
        L44:
            java.lang.String r6 = r5.zzn     // Catch: java.lang.Throwable -> L50
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            return r6
        L48:
            java.lang.String r6 = r5.zzm     // Catch: java.lang.Throwable -> L50
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            return r6
        L4c:
            java.lang.String r6 = r5.zzl     // Catch: java.lang.Throwable -> L50
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            return r6
        L50:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzj.zzn(java.lang.String):java.lang.String");
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzo() {
        String str;
        zzR();
        synchronized (this.zza) {
            str = this.zzz;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final JSONObject zzp() {
        JSONObject jSONObject;
        zzR();
        synchronized (this.zza) {
            jSONObject = this.zzv;
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzq(Runnable runnable) {
        this.zzc.add(runnable);
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzr(final Context context) {
        synchronized (this.zza) {
            if (this.zzf != null) {
                return;
            }
            zzfuu zzfuuVar = zzbzn.zza;
            final String str = AppLovinMediationProvider.ADMOB;
            this.zzd = zzfuuVar.zza(new Runnable(context, str) { // from class: com.google.android.gms.ads.internal.util.zzh
                public final /* synthetic */ Context zzb;
                public final /* synthetic */ String zzc = AppLovinMediationProvider.ADMOB;

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzQ(this.zzb, this.zzc);
                }
            });
            this.zzb = true;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzs() {
        zzR();
        synchronized (this.zza) {
            this.zzv = new JSONObject();
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.remove("native_advanced_settings");
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzt(long j) {
        zzR();
        synchronized (this.zza) {
            if (this.zzq == j) {
                return;
            }
            this.zzq = j;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putLong("app_last_background_time_ms", j);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzu(String str) {
        zzR();
        synchronized (this.zza) {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
            if (str != null && !str.equals(this.zzp.zzc())) {
                this.zzp = new zzbyd(str, jCurrentTimeMillis);
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("app_settings_json", str);
                    this.zzg.putLong("app_settings_last_update_ms", jCurrentTimeMillis);
                    this.zzg.apply();
                }
                zzS();
                Iterator it = this.zzc.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                return;
            }
            this.zzp.zzg(jCurrentTimeMillis);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzv(int i) {
        zzR();
        synchronized (this.zza) {
            if (this.zzt == i) {
                return;
            }
            this.zzt = i;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putInt("version_code", i);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzw(String str) {
        zzR();
        synchronized (this.zza) {
            if (str.equals(this.zzi)) {
                return;
            }
            this.zzi = str;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putString("content_url_hashes", str);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzx(boolean z) {
        zzR();
        synchronized (this.zza) {
            if (this.zzw == z) {
                return;
            }
            this.zzw = z;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putBoolean("content_url_opted_out", z);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzy(String str) {
        zzR();
        synchronized (this.zza) {
            if (str.equals(this.zzj)) {
                return;
            }
            this.zzj = str;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putString("content_vertical_hashes", str);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzz(boolean z) {
        zzR();
        synchronized (this.zza) {
            if (this.zzx == z) {
                return;
            }
            this.zzx = z;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putBoolean("content_vertical_opted_out", z);
                this.zzg.apply();
            }
            zzS();
        }
    }
}
