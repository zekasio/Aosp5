package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.CollectionUtils;
import com.tapjoy.TJAdUnitConstants;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbhv implements zzbhp {
    static final Map zza = CollectionUtils.mapOfKeyValueArrays(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});
    private final com.google.android.gms.ads.internal.zzb zzb;
    private final zzbpz zzc;
    private final zzbqg zzd;

    public zzbhv(com.google.android.gms.ads.internal.zzb zzbVar, zzbpz zzbpzVar, zzbqg zzbqgVar) {
        this.zzb = zzbVar;
        this.zzc = zzbpzVar;
        this.zzd = zzbqgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcei zzceiVar = (zzcei) obj;
        int iIntValue = ((Integer) zza.get((String) map.get("a"))).intValue();
        int i = 6;
        if (iIntValue != 5) {
            if (iIntValue != 7) {
                if (!this.zzb.zzc()) {
                    this.zzb.zzb(null);
                    return;
                }
                if (iIntValue == 1) {
                    this.zzc.zzb(map);
                    return;
                }
                if (iIntValue == 3) {
                    new zzbqc(zzceiVar, map).zzb();
                    return;
                }
                if (iIntValue == 4) {
                    new zzbpx(zzceiVar, map).zzc();
                    return;
                } else if (iIntValue != 5) {
                    if (iIntValue == 6) {
                        this.zzc.zza(true);
                        return;
                    } else if (iIntValue != 7) {
                        zzbza.zzi("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.zzd.zzc();
            return;
        }
        String str = (String) map.get("forceOrientation");
        boolean z = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (zzceiVar == null) {
            zzbza.zzj("AdWebView is null");
            return;
        }
        if (TJAdUnitConstants.String.PORTRAIT.equalsIgnoreCase(str)) {
            i = 7;
        } else if (!TJAdUnitConstants.String.LANDSCAPE.equalsIgnoreCase(str)) {
            i = z ? -1 : 14;
        }
        zzceiVar.zzaq(i);
    }
}
