package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzezx;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzm extends WebViewClient {
    final /* synthetic */ zzs zza;

    zzm(zzs zzsVar) {
        this.zza = zzsVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        zzs zzsVar = this.zza;
        if (zzsVar.zzg != null) {
            try {
                zzsVar.zzg.zzf(zzezx.zzd(1, null, null));
            } catch (RemoteException e) {
                zzbza.zzl("#007 Could not call remote method.", e);
            }
        }
        zzs zzsVar2 = this.zza;
        if (zzsVar2.zzg != null) {
            try {
                zzsVar2.zzg.zze(0);
            } catch (RemoteException e2) {
                zzbza.zzl("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.zza.zzq())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            zzs zzsVar = this.zza;
            if (zzsVar.zzg != null) {
                try {
                    zzsVar.zzg.zzf(zzezx.zzd(3, null, null));
                } catch (RemoteException e) {
                    zzbza.zzl("#007 Could not call remote method.", e);
                }
            }
            zzs zzsVar2 = this.zza;
            if (zzsVar2.zzg != null) {
                try {
                    zzsVar2.zzg.zze(3);
                } catch (RemoteException e2) {
                    zzbza.zzl("#007 Could not call remote method.", e2);
                }
            }
            this.zza.zzV(0);
            return true;
        }
        if (str.startsWith("gmsg://scriptLoadFailed")) {
            zzs zzsVar3 = this.zza;
            if (zzsVar3.zzg != null) {
                try {
                    zzsVar3.zzg.zzf(zzezx.zzd(1, null, null));
                } catch (RemoteException e3) {
                    zzbza.zzl("#007 Could not call remote method.", e3);
                }
            }
            zzs zzsVar4 = this.zza;
            if (zzsVar4.zzg != null) {
                try {
                    zzsVar4.zzg.zze(0);
                } catch (RemoteException e4) {
                    zzbza.zzl("#007 Could not call remote method.", e4);
                }
            }
            this.zza.zzV(0);
            return true;
        }
        if (str.startsWith("gmsg://adResized")) {
            zzs zzsVar5 = this.zza;
            if (zzsVar5.zzg != null) {
                try {
                    zzsVar5.zzg.zzi();
                } catch (RemoteException e5) {
                    zzbza.zzl("#007 Could not call remote method.", e5);
                }
            }
            this.zza.zzV(this.zza.zzb(str));
            return true;
        }
        if (str.startsWith("gmsg://")) {
            return true;
        }
        zzs zzsVar6 = this.zza;
        if (zzsVar6.zzg != null) {
            try {
                zzsVar6.zzg.zzc();
                this.zza.zzg.zzh();
            } catch (RemoteException e6) {
                zzbza.zzl("#007 Could not call remote method.", e6);
            }
        }
        zzs.zzw(this.zza, zzs.zzo(this.zza, str));
        return true;
    }
}
