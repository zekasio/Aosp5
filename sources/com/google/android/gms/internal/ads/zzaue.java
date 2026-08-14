package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.common.util.PlatformVersion;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
@ParametersAreNonnullByDefault
public final class zzaue extends Thread {
    private boolean zza;
    private boolean zzb;
    private final Object zzc;
    private final zzatv zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final String zzm;
    private final boolean zzn;
    private final boolean zzo;
    private final boolean zzp;

    public zzaue() {
        zzatv zzatvVar = new zzatv();
        this.zza = false;
        this.zzb = false;
        this.zzd = zzatvVar;
        this.zzc = new Object();
        this.zzf = ((Long) zzbcc.zzd.zze()).intValue();
        this.zzg = ((Long) zzbcc.zza.zze()).intValue();
        this.zzh = ((Long) zzbcc.zze.zze()).intValue();
        this.zzi = ((Long) zzbcc.zzc.zze()).intValue();
        this.zzj = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzQ)).intValue();
        this.zzk = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzR)).intValue();
        this.zzl = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzS)).intValue();
        this.zze = ((Long) zzbcc.zzf.zze()).intValue();
        this.zzm = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzU);
        this.zzn = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzV)).booleanValue();
        this.zzo = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzW)).booleanValue();
        this.zzp = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzX)).booleanValue();
        setName("ContentFetchTask");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r3.importance != 100) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r2.inKeyguardRestrictedInputMode() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        r0 = (android.os.PowerManager) r0.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r0 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r0.isScreenOn() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        r0 = com.google.android.gms.ads.internal.zzt.zzb().zza();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if (r0 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        com.google.android.gms.internal.ads.zzbza.zze("ContentFetchThread: no activity. Sleeping.");
        zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        if (r0.getWindow() == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
    
        if (r0.getWindow().getDecorView() == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
    
        r1 = r0.getWindow().getDecorView().findViewById(android.R.id.content);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008f, code lost:
    
        com.google.android.gms.ads.internal.zzt.zzo().zzu(r0, "ContentFetchTask.extractContent");
        com.google.android.gms.internal.ads.zzbza.zze("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c4, code lost:
    
        com.google.android.gms.internal.ads.zzbza.zzh("Error in ContentFetchTask", r0);
        com.google.android.gms.ads.internal.zzt.zzo().zzu(r0, "ContentFetchTask.run");
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d4, code lost:
    
        com.google.android.gms.internal.ads.zzbza.zzh("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00dc A[EXC_TOP_SPLITTER, LOOP:1: B:67:0x00dc->B:72:0x00dc, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaue.run():void");
    }

    public final zzatu zza() {
        return this.zzd.zza(this.zzp);
    }

    final zzaud zzb(View view, zzatu zzatuVar) {
        if (view == null) {
            return new zzaud(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new zzaud(this, 0, 0);
            }
            zzatuVar.zzk(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new zzaud(this, 1, 0);
        }
        if ((view instanceof WebView) && !(view instanceof zzcei)) {
            WebView webView = (WebView) view;
            if (!PlatformVersion.isAtLeastKitKat()) {
                return new zzaud(this, 0, 0);
            }
            zzatuVar.zzh();
            webView.post(new zzauc(this, zzatuVar, webView, globalVisibleRect));
            return new zzaud(this, 0, 1);
        }
        if (!(view instanceof ViewGroup)) {
            return new zzaud(this, 0, 0);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
            zzaud zzaudVarZzb = zzb(viewGroup.getChildAt(i3), zzatuVar);
            i += zzaudVarZzb.zza;
            i2 += zzaudVarZzb.zzb;
        }
        return new zzaud(this, i, i2);
    }

    final void zzc(View view) {
        try {
            zzatu zzatuVar = new zzatu(this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzo);
            Context contextZzb = com.google.android.gms.ads.internal.zzt.zzb().zzb();
            if (contextZzb != null && !TextUtils.isEmpty(this.zzm)) {
                String str = (String) view.getTag(contextZzb.getResources().getIdentifier((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzT), "id", contextZzb.getPackageName()));
                if (str != null && str.equals(this.zzm)) {
                    return;
                }
            }
            zzaud zzaudVarZzb = zzb(view, zzatuVar);
            zzatuVar.zzm();
            if (zzaudVarZzb.zza == 0 && zzaudVarZzb.zzb == 0) {
                return;
            }
            int i = zzaudVarZzb.zzb;
            if (i != 0) {
                if (i == 0) {
                }
                this.zzd.zzb(zzatuVar);
            } else if (zzatuVar.zzc() == 0) {
                return;
            }
            if (this.zzd.zzd(zzatuVar)) {
                return;
            }
            this.zzd.zzb(zzatuVar);
        } catch (Exception e) {
            zzbza.zzh("Exception in fetchContentOnUIThread", e);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "ContentFetchTask.fetchContent");
        }
    }

    final void zzd(zzatu zzatuVar, WebView webView, String str, boolean z) {
        zzatuVar.zzg();
        try {
            if (!TextUtils.isEmpty(str)) {
                String strOptString = new JSONObject(str).optString("text");
                if (this.zzn || TextUtils.isEmpty(webView.getTitle())) {
                    zzatuVar.zzl(strOptString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    zzatuVar.zzl(webView.getTitle() + "\n" + strOptString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (zzatuVar.zzo()) {
                this.zzd.zzc(zzatuVar);
            }
        } catch (JSONException unused) {
            zzbza.zze("Json string may be malformed.");
        } catch (Throwable th) {
            zzbza.zzf("Failed to get webview content.", th);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void zze() {
        synchronized (this.zzc) {
            if (this.zza) {
                zzbza.zze("Content hash thread already started, quitting...");
            } else {
                this.zza = true;
                start();
            }
        }
    }

    public final void zzf() {
        synchronized (this.zzc) {
            this.zzb = true;
            zzbza.zze("ContentFetchThread: paused, pause = true");
        }
    }

    public final void zzg() {
        synchronized (this.zzc) {
            this.zzb = false;
            this.zzc.notifyAll();
            zzbza.zze("ContentFetchThread: wakeup");
        }
    }

    public final boolean zzh() {
        return this.zzb;
    }
}
