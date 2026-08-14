package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzcfl extends zzcep {
    public zzcfl(zzcei zzceiVar, zzawe zzaweVar, boolean z) {
        super(zzceiVar, zzaweVar, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final WebResourceResponse zzN(WebView webView, String str, Map map) {
        String str2;
        if (!(webView instanceof zzcei)) {
            zzbza.zzj("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzcei zzceiVar = (zzcei) webView;
        zzbwb zzbwbVar = this.zza;
        if (zzbwbVar != null) {
            zzbwbVar.zzd(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.zzc(str, map);
        }
        if (zzceiVar.zzN() != null) {
            zzceiVar.zzN().zzE();
        }
        if (zzceiVar.zzO().zzi()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzM);
        } else if (zzceiVar.zzaA()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzL);
        } else {
            str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzK);
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        return com.google.android.gms.ads.internal.util.zzs.zzt(zzceiVar.getContext(), zzceiVar.zzn().zza, str2);
    }
}
