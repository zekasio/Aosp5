package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzdse;
import com.google.android.gms.internal.ads.zzdsf;
import com.google.android.gms.internal.ads.zzfut;
import com.tapjoy.TapjoyAuctionFlags;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaw {
    private zzdsf zzg;
    private final Object zzb = new Object();
    private String zzc = "";
    private String zzd = "";
    private boolean zze = false;
    private boolean zzf = false;
    protected String zza = "";

    /* JADX WARN: Multi-variable type inference failed */
    protected static final String zzo(Context context, String str, String str2) {
        HashMap map = new HashMap();
        map.put("User-Agent", com.google.android.gms.ads.internal.zzt.zzp().zzc(context, str2));
        zzfut zzfutVarZzb = new zzbo(context).zzb(0, str, map, null);
        try {
            return (String) zzfutVarZzb.get(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzep)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            zzbza.zzh("Interrupted while retrieving a response from: ".concat(String.valueOf(str)), e);
            zzfutVarZzb.cancel(true);
            return null;
        } catch (TimeoutException e2) {
            zzbza.zzh("Timeout while retrieving a response from: ".concat(String.valueOf(str)), e2);
            zzfutVarZzb.cancel(true);
            return null;
        } catch (Exception e3) {
            zzbza.zzh("Error retrieving a response from: ".concat(String.valueOf(str)), e3);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0064 A[Catch: all -> 0x007b, TryCatch #2 {, blocks: (B:4:0x000b, B:6:0x0013, B:7:0x0018, B:10:0x0030, B:12:0x0038, B:14:0x004d, B:17:0x005f, B:9:0x0029, B:18:0x0064, B:19:0x0066), top: B:29:0x000b, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.net.Uri zzp(android.content.Context r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r4 = this;
            android.net.Uri r6 = android.net.Uri.parse(r6)
            android.net.Uri$Builder r6 = r6.buildUpon()
            java.lang.Object r0 = r4.zzb
            monitor-enter(r0)
            java.lang.String r1 = r4.zzc     // Catch: java.lang.Throwable -> L7b
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L7b
            if (r1 == 0) goto L64
            com.google.android.gms.ads.internal.zzt.zzp()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r1 = "debug_signals_id.txt"
            java.io.FileInputStream r1 = r5.openFileInput(r1)     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L7b
            java.lang.String r2 = new java.lang.String     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L7b
            r3 = 1
            byte[] r1 = com.google.android.gms.common.util.IOUtils.readInputStreamFully(r1, r3)     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L7b
            java.lang.String r3 = "UTF-8"
            r2.<init>(r1, r3)     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L7b
            goto L30
        L29:
            java.lang.String r1 = "Error reading from internal storage."
            com.google.android.gms.internal.ads.zzbza.zze(r1)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r2 = ""
        L30:
            r4.zzc = r2     // Catch: java.lang.Throwable -> L7b
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L7b
            if (r1 == 0) goto L64
            com.google.android.gms.ads.internal.zzt.zzp()     // Catch: java.lang.Throwable -> L7b
            java.util.UUID r1 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L7b
            r4.zzc = r1     // Catch: java.lang.Throwable -> L7b
            com.google.android.gms.ads.internal.zzt.zzp()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r1 = r4.zzc     // Catch: java.lang.Throwable -> L7b
            java.lang.String r2 = "debug_signals_id.txt"
            r3 = 0
            java.io.FileOutputStream r5 = r5.openFileOutput(r2, r3)     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L7b
            java.lang.String r2 = "UTF-8"
            byte[] r1 = r1.getBytes(r2)     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L7b
            r5.write(r1)     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L7b
            r5.close()     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L7b
            goto L64
        L5e:
            r5 = move-exception
            java.lang.String r1 = "Error writing to file in internal storage."
            com.google.android.gms.internal.ads.zzbza.zzh(r1, r5)     // Catch: java.lang.Throwable -> L7b
        L64:
            java.lang.String r5 = r4.zzc     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r0 = "linkedDeviceId"
            r6.appendQueryParameter(r0, r5)
            java.lang.String r5 = "adSlotPath"
            r6.appendQueryParameter(r5, r7)
            java.lang.String r5 = "afmaVersion"
            r6.appendQueryParameter(r5, r8)
            android.net.Uri r5 = r6.build()
            return r5
        L7b:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7b
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzaw.zzp(android.content.Context, java.lang.String, java.lang.String, java.lang.String):android.net.Uri");
    }

    public final zzdsf zza() {
        return this.zzg;
    }

    public final String zzb() {
        String str;
        synchronized (this.zzb) {
            str = this.zzd;
        }
        return str;
    }

    public final void zzc(Context context) {
        zzdsf zzdsfVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziu)).booleanValue() || (zzdsfVar = this.zzg) == null) {
            return;
        }
        zzdsfVar.zzh(new zzat(this, context), zzdse.DEBUG_MENU);
    }

    public final void zzd(Context context, String str, String str2) {
        com.google.android.gms.ads.internal.zzt.zzp();
        zzs.zzR(context, zzp(context, (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzel), str, str2));
    }

    public final void zze(Context context, String str, String str2, String str3) {
        Uri.Builder builderBuildUpon = zzp(context, (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeo), str3, str).buildUpon();
        builderBuildUpon.appendQueryParameter("debugData", str2);
        com.google.android.gms.ads.internal.zzt.zzp();
        zzs.zzH(context, str, builderBuildUpon.build().toString());
    }

    public final void zzf(boolean z) {
        synchronized (this.zzb) {
            this.zzf = z;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziu)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzo().zzh().zzB(z);
                zzdsf zzdsfVar = this.zzg;
                if (zzdsfVar != null) {
                    zzdsfVar.zzj(z);
                }
            }
        }
    }

    public final void zzg(zzdsf zzdsfVar) {
        this.zzg = zzdsfVar;
    }

    public final void zzh(boolean z) {
        synchronized (this.zzb) {
            this.zze = z;
        }
    }

    protected final void zzi(Context context, String str, boolean z, boolean z2) {
        if (context instanceof Activity) {
            zzs.zza.post(new zzav(this, context, str, z, z2));
        } else {
            zzbza.zzi("Can not create dialog without Activity Context");
        }
    }

    public final boolean zzj(Context context, String str, String str2) {
        String strZzo = zzo(context, zzp(context, (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzen), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strZzo)) {
            zzbza.zze("Not linked for debug signals.");
            return false;
        }
        try {
            boolean zEquals = TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE.equals(new JSONObject(strZzo.trim()).optString("debug_mode"));
            zzf(zEquals);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziu)).booleanValue()) {
                zzg zzgVarZzh = com.google.android.gms.ads.internal.zzt.zzo().zzh();
                if (true != zEquals) {
                    str = "";
                }
                zzgVarZzh.zzA(str);
            }
            return zEquals;
        } catch (JSONException e) {
            zzbza.zzk("Fail to get debug mode response json.", e);
            return false;
        }
    }

    final boolean zzk(Context context, String str, String str2) {
        String strZzo = zzo(context, zzp(context, (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzem), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strZzo)) {
            zzbza.zze("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(strZzo.trim());
            String strOptString = jSONObject.optString("gct");
            this.zza = jSONObject.optString("status");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziu)).booleanValue()) {
                boolean z = "0".equals(this.zza) || TapjoyAuctionFlags.AUCTION_TYPE_SECOND_PRICE.equals(this.zza);
                zzf(z);
                zzg zzgVarZzh = com.google.android.gms.ads.internal.zzt.zzo().zzh();
                if (!z) {
                    str = "";
                }
                zzgVarZzh.zzA(str);
            }
            synchronized (this.zzb) {
                this.zzd = strOptString;
            }
            return true;
        } catch (JSONException e) {
            zzbza.zzk("Fail to get in app preview response json.", e);
            return false;
        }
    }

    public final boolean zzl() {
        boolean z;
        synchronized (this.zzb) {
            z = this.zzf;
        }
        return z;
    }

    public final boolean zzm() {
        boolean z;
        synchronized (this.zzb) {
            z = this.zze;
        }
        return z;
    }

    public final boolean zzn(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !zzm()) {
            return false;
        }
        zzbza.zze("Sending troubleshooting signals to the server.");
        zze(context, str, str2, str3);
        return true;
    }
}
