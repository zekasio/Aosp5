package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcfi {
    private final zzcfj zza;
    private final zzcfh zzb;

    public zzcfi(zzcfj zzcfjVar, zzcfh zzcfhVar, byte[] bArr) {
        this.zzb = zzcfhVar;
        this.zza = zzcfjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.zzcfj, com.google.android.gms.internal.ads.zzcfq] */
    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zze.zza("Click string is empty, not proceeding.");
            return "";
        }
        ?? r0 = this.zza;
        zzapw zzapwVarZzI = r0.zzI();
        if (zzapwVarZzI == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzaps zzapsVarZzc = zzapwVarZzI.zzc();
        if (zzapsVarZzc == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signals object is empty, ignoring.");
            return "";
        }
        if (r0.getContext() == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
            return "";
        }
        Context context = this.zza.getContext();
        zzcfj zzcfjVar = this.zza;
        return zzapsVarZzc.zzf(context, str, (View) zzcfjVar, zzcfjVar.zzi());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.zzcfj, com.google.android.gms.internal.ads.zzcfq] */
    @JavascriptInterface
    public String getViewSignals() {
        ?? r0 = this.zza;
        zzapw zzapwVarZzI = r0.zzI();
        if (zzapwVarZzI == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzaps zzapsVarZzc = zzapwVarZzI.zzc();
        if (zzapsVarZzc == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signals object is empty, ignoring.");
            return "";
        }
        if (r0.getContext() == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
            return "";
        }
        Context context = this.zza.getContext();
        zzcfj zzcfjVar = this.zza;
        return zzapsVarZzc.zzh(context, (View) zzcfjVar, zzcfjVar.zzi());
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (TextUtils.isEmpty(str)) {
            zzbza.zzj("URL is empty, ignoring message");
        } else {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfg
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zza(str);
                }
            });
        }
    }

    final /* synthetic */ void zza(String str) {
        zzcfh zzcfhVar = this.zzb;
        Uri uri = Uri.parse(str);
        zzcep zzcepVarZzaJ = ((zzcfb) zzcfhVar.zza).zzaJ();
        if (zzcepVarZzaJ == null) {
            zzbza.zzg("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            zzcepVarZzaJ.zzj(uri);
        }
    }
}
