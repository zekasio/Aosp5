package com.google.android.gms.internal.ads;

import android.net.Uri;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbmt extends zzbzf {
    private final zzbms zza;

    public zzbmt(zzbms zzbmsVar, String str) {
        super(str);
        this.zza = zzbmsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzf, com.google.android.gms.internal.ads.zzbys
    public final boolean zza(String str) {
        zzbza.zze("LeibnizHttpUrlPinger pinging URL: ".concat(String.valueOf(str)));
        if ("oda".equals(Uri.parse(str).getScheme())) {
            return true;
        }
        zzbza.zze("URL does not match oda:// scheme, falling back on HttpUrlPinger");
        return super.zza(str);
    }
}
