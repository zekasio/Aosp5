package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.tapjoy.TJAdUnitConstants;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcez implements zzbhp {
    final /* synthetic */ zzcfb zza;

    zzcez(zzcfb zzcfbVar) {
        this.zza = zzcfbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        if (map != null) {
            String str = (String) map.get(TJAdUnitConstants.String.HEIGHT);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int i = Integer.parseInt(str);
                synchronized (this.zza) {
                    zzcfb zzcfbVar = this.zza;
                    if (zzcfbVar.zzG != i) {
                        zzcfbVar.zzG = i;
                        this.zza.requestLayout();
                    }
                }
            } catch (Exception e) {
                zzbza.zzk("Exception occurred while getting webview content height", e);
            }
        }
    }
}
