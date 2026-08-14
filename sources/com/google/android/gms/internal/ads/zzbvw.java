package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.vungle.warren.model.CookieDBAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
@ParametersAreNonnullByDefault
public final class zzbvw implements zzbwb {
    public static final /* synthetic */ int zzb = 0;
    private static final List zzc = Collections.synchronizedList(new ArrayList());
    boolean zza;
    private final zzgul zzd;
    private final LinkedHashMap zze;
    private final Context zzh;
    private final zzbvy zzi;
    private final zzbvx zzn;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzbvw(Context context, zzbzg zzbzgVar, zzbvy zzbvyVar, String str, zzbvx zzbvxVar, byte[] bArr) {
        Preconditions.checkNotNull(zzbvyVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzn = zzbvxVar;
        this.zzi = zzbvyVar;
        Iterator it = zzbvyVar.zze.iterator();
        while (it.hasNext()) {
            this.zzk.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove(CookieDBAdapter.CookieColumns.TABLE_NAME.toLowerCase(Locale.ENGLISH));
        zzgul zzgulVarZza = zzgvu.zza();
        zzgulVarZza.zzn(9);
        zzgulVarZza.zzj(str);
        zzgulVarZza.zzh(str);
        zzgum zzgumVarZza = zzgun.zza();
        String str2 = this.zzi.zza;
        if (str2 != null) {
            zzgumVarZza.zza(str2);
        }
        zzgulVarZza.zzg((zzgun) zzgumVarZza.zzal());
        zzgvp zzgvpVarZza = zzgvq.zza();
        zzgvpVarZza.zzc(Wrappers.packageManager(this.zzh).isCallerInstantApp());
        String str3 = zzbzgVar.zza;
        if (str3 != null) {
            zzgvpVarZza.zza(str3);
        }
        long apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzh);
        if (apkVersion > 0) {
            zzgvpVarZza.zzb(apkVersion);
        }
        zzgulVarZza.zzf((zzgvq) zzgvpVarZza.zzal());
        this.zzd = zzgulVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbwb
    public final zzbvy zza() {
        return this.zzi;
    }

    final /* synthetic */ zzfut zzb(Map map) throws Exception {
        zzgvn zzgvnVar;
        zzfut zzfutVarZzl;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray jSONArrayOptJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (jSONArrayOptJSONArray != null) {
                        synchronized (this.zzj) {
                            int length = jSONArrayOptJSONArray.length();
                            synchronized (this.zzj) {
                                zzgvnVar = (zzgvn) this.zze.get(str);
                            }
                            if (zzgvnVar == null) {
                                zzbwa.zza("Cannot find the corresponding resource object for " + str);
                            } else {
                                for (int i = 0; i < length; i++) {
                                    zzgvnVar.zza(jSONArrayOptJSONArray.getJSONObject(i).getString("threat_type"));
                                }
                                this.zza = (length > 0) | this.zza;
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (((Boolean) zzbcs.zzb.zze()).booleanValue()) {
                    zzbza.zzf("Failed to get SafeBrowsing metadata", e);
                }
                return zzfuj.zzg(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zzn(10);
            }
        }
        boolean z = this.zza;
        if (!(z && this.zzi.zzg) && (!(this.zzm && this.zzi.zzf) && (z || !this.zzi.zzd))) {
            return zzfuj.zzh(null);
        }
        synchronized (this.zzj) {
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                this.zzd.zzc((zzgvo) ((zzgvn) it.next()).zzal());
            }
            this.zzd.zza(this.zzf);
            this.zzd.zzb(this.zzg);
            if (zzbwa.zzb()) {
                StringBuilder sb = new StringBuilder("Sending SB report\n  url: " + this.zzd.zzl() + "\n  clickUrl: " + this.zzd.zzk() + "\n  resources: \n");
                for (zzgvo zzgvoVar : this.zzd.zzm()) {
                    sb.append("    [");
                    sb.append(zzgvoVar.zza());
                    sb.append("] ");
                    sb.append(zzgvoVar.zze());
                }
                zzbwa.zza(sb.toString());
            }
            zzfut zzfutVarZzb = new com.google.android.gms.ads.internal.util.zzbo(this.zzh).zzb(1, this.zzi.zzb, null, ((zzgvu) this.zzd.zzal()).zzax());
            if (zzbwa.zzb()) {
                zzfutVarZzb.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbvr
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbwa.zza("Pinged SB successfully.");
                    }
                }, zzbzn.zza);
            }
            zzfutVarZzl = zzfuj.zzl(zzfutVarZzb, new zzfnj() { // from class: com.google.android.gms.internal.ads.zzbvs
                @Override // com.google.android.gms.internal.ads.zzfnj
                public final Object apply(Object obj) {
                    int i2 = zzbvw.zzb;
                    return null;
                }
            }, zzbzn.zzf);
        }
        return zzfutVarZzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbwb
    public final void zzd(String str, Map map, int i) {
        int iZza;
        synchronized (this.zzj) {
            if (i == 3) {
                this.zzm = true;
            }
            if (this.zze.containsKey(str)) {
                if (i == 3 && (iZza = zzgvm.zza(3)) != 0) {
                    ((zzgvn) this.zze.get(str)).zze(iZza);
                }
                return;
            }
            zzgvn zzgvnVarZzc = zzgvo.zzc();
            int iZza2 = zzgvm.zza(i);
            if (iZza2 != 0) {
                zzgvnVarZzc.zze(iZza2);
            }
            zzgvnVarZzc.zzb(this.zze.size());
            zzgvnVarZzc.zzd(str);
            zzguy zzguyVarZza = zzgvb.zza();
            if (!this.zzk.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.zzk.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzguw zzguwVarZza = zzgux.zza();
                        zzguwVarZza.zza(zzgpe.zzx(str2));
                        zzguwVarZza.zzb(zzgpe.zzx(str3));
                        zzguyVarZza.zza((zzgux) zzguwVarZza.zzal());
                    }
                }
            }
            zzgvnVarZzc.zzc((zzgvb) zzguyVarZza.zzal());
            this.zze.put(str, zzgvnVarZzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwb
    public final void zze() {
        synchronized (this.zzj) {
            this.zze.keySet();
            zzfut zzfutVarZzm = zzfuj.zzm(zzfuj.zzh(Collections.emptyMap()), new zzftq() { // from class: com.google.android.gms.internal.ads.zzbvt
                @Override // com.google.android.gms.internal.ads.zzftq
                public final zzfut zza(Object obj) {
                    return this.zza.zzb((Map) obj);
                }
            }, zzbzn.zzf);
            zzfut zzfutVarZzn = zzfuj.zzn(zzfutVarZzm, 10L, TimeUnit.SECONDS, zzbzn.zzd);
            zzfuj.zzq(zzfutVarZzm, new zzbvv(this, zzfutVarZzn), zzbzn.zzf);
            zzc.add(zzfutVarZzn);
        }
    }

    final /* synthetic */ void zzf(Bitmap bitmap) {
        zzgpb zzgpbVarZzt = zzgpe.zzt();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzgpbVarZzt);
        synchronized (this.zzj) {
            zzgul zzgulVar = this.zzd;
            zzgvg zzgvgVarZza = zzgvi.zza();
            zzgvgVarZza.zza(zzgpbVarZzt.zzb());
            zzgvgVarZza.zzb("image/png");
            zzgvgVarZza.zzc(2);
            zzgulVar.zzi((zzgvi) zzgvgVarZza.zzal());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwb
    public final void zzg(View view) {
        Bitmap bitmapCreateBitmap;
        boolean zIsDrawingCacheEnabled;
        if (this.zzi.zzc && !this.zzl) {
            com.google.android.gms.ads.internal.zzt.zzp();
            final Bitmap bitmap = null;
            if (view != null) {
                try {
                    zIsDrawingCacheEnabled = view.isDrawingCacheEnabled();
                    view.setDrawingCacheEnabled(true);
                    Bitmap drawingCache = view.getDrawingCache();
                    bitmapCreateBitmap = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
                } catch (RuntimeException e) {
                    e = e;
                    bitmapCreateBitmap = null;
                }
                try {
                    view.setDrawingCacheEnabled(zIsDrawingCacheEnabled);
                } catch (RuntimeException e2) {
                    e = e2;
                    zzbza.zzh("Fail to capture the web view", e);
                }
                if (bitmapCreateBitmap == null) {
                    try {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        if (width == 0 || height == 0) {
                            zzbza.zzj("Width or height of view is zero");
                        } else {
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                            Canvas canvas = new Canvas(bitmapCreateBitmap2);
                            view.layout(0, 0, width, height);
                            view.draw(canvas);
                            bitmap = bitmapCreateBitmap2;
                        }
                    } catch (RuntimeException e3) {
                        zzbza.zzh("Fail to capture the webview", e3);
                    }
                } else {
                    bitmap = bitmapCreateBitmap;
                }
            }
            if (bitmap == null) {
                zzbwa.zza("Failed to capture the webview bitmap.");
            } else {
                this.zzl = true;
                com.google.android.gms.ads.internal.util.zzs.zzf(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbvu
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzf(bitmap);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwb
    public final void zzh(String str) {
        synchronized (this.zzj) {
            if (str == null) {
                this.zzd.zzd();
            } else {
                this.zzd.zze(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwb
    public final boolean zzi() {
        return PlatformVersion.isAtLeastKitKat() && this.zzi.zzc && !this.zzl;
    }
}
