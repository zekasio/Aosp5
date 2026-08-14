package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.tapjoy.TJAdUnitConstants;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public interface zzgd extends zzfg {
    public static final zzfnv zza = new zzfnv() { // from class: com.google.android.gms.internal.ads.zzfx
        @Override // com.google.android.gms.internal.ads.zzfnv
        public final boolean zza(Object obj) {
            String str = (String) obj;
            if (str == null) {
                return false;
            }
            String strZza = zzfnb.zza(str);
            if (TextUtils.isEmpty(strZza)) {
                return false;
            }
            return ((strZza.contains("text") && !strZza.contains("text/vtt")) || strZza.contains(TJAdUnitConstants.String.HTML) || strZza.contains("xml")) ? false : true;
        }
    };

    @Override // com.google.android.gms.internal.ads.zzfg
    Map zze();
}
