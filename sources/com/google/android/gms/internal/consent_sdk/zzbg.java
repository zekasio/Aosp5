package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.webkit.WebView;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbg extends WebView {
    private final Handler zza;
    private final zzbm zzb;
    private boolean zzc;

    public zzbg(zzbi zzbiVar, Handler handler, zzbm zzbmVar) {
        super(zzbiVar);
        this.zzc = false;
        this.zza = handler;
        this.zzb = zzbmVar;
    }

    static /* synthetic */ boolean zzc(zzbg zzbgVar, String str) {
        return str != null && str.startsWith("consent://");
    }

    static /* synthetic */ boolean zze(zzbg zzbgVar, boolean z) {
        zzbgVar.zzc = true;
        return true;
    }

    public final void zzb(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        final String string = sb.toString();
        this.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbd
            @Override // java.lang.Runnable
            public final void run() {
                zzce.zza(this.zza, string);
            }
        });
    }
}
