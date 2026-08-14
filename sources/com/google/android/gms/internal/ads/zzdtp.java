package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdtp implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;

    public zzdtp(zzgxl zzgxlVar, zzgxl zzgxlVar2) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfda zzfdaVar = (zzfda) this.zza.zzb();
        final CookieManager cookieManagerZzb = com.google.android.gms.ads.internal.zzt.zzq().zzb((Context) this.zzb.zzb());
        zzfcr zzfcrVarZzi = zzfck.zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdtm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManager = cookieManagerZzb;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzaH));
            }
        }, zzfcu.WEBVIEW_COOKIE, zzfdaVar).zzi(1L, TimeUnit.SECONDS);
        final zzdtn zzdtnVar = new zzfcd() { // from class: com.google.android.gms.internal.ads.zzdtn
            @Override // com.google.android.gms.internal.ads.zzfcd
            public final Object zza(Object obj) {
                return "";
            }
        };
        return zzfcrVarZzi.zzc(Exception.class, new zzftq() { // from class: com.google.android.gms.internal.ads.zzfcn
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return zzfuj.zzh("");
            }
        }).zza();
    }
}
