package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbgz implements zzbhp {
    zzbgz() {
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcei zzceiVar = (zzcei) obj;
        if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
            com.google.android.gms.ads.internal.util.zze.zza("Missing App Id, cannot show LMD Overlay without it");
            return;
        }
        zzfly zzflyVarZzj = zzflz.zzj();
        zzflyVarZzj.zzb((String) map.get("appId"));
        zzflyVarZzj.zzh(zzceiVar.getWidth());
        zzflyVarZzj.zzg(zzceiVar.zzF().getWindowToken());
        if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
            zzflyVarZzj.zzd(Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")));
        } else {
            zzflyVarZzj.zzd(81);
        }
        if (map.containsKey("verticalMargin")) {
            zzflyVarZzj.zze(Float.parseFloat((String) map.get("verticalMargin")));
        } else {
            zzflyVarZzj.zze(0.02f);
        }
        if (map.containsKey("enifd")) {
            zzflyVarZzj.zza((String) map.get("enifd"));
        }
        try {
            com.google.android.gms.ads.internal.zzt.zzj().zzj(zzceiVar, zzflyVarZzj.zzi());
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "DefaultGmsgHandlers.ShowLMDOverlay");
            com.google.android.gms.ads.internal.util.zze.zza("Missing parameters for LMD Overlay show request");
        }
    }
}
