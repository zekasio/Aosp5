package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyAuctionFlags;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzccj implements zzbhp {
    @Override // com.google.android.gms.internal.ads.zzbhp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcbj zzcbjVar = (zzcbj) obj;
        zzcfe zzcfeVarZzq = zzcbjVar.zzq();
        if (zzcfeVarZzq == null) {
            try {
                zzcfe zzcfeVar = new zzcfe(zzcbjVar, Float.parseFloat((String) map.get("duration")), TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE.equals(map.get("customControlsAllowed")), TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE.equals(map.get("clickToExpandAllowed")));
                zzcbjVar.zzC(zzcfeVar);
                zzcfeVarZzq = zzcfeVar;
            } catch (NullPointerException e) {
                e = e;
                zzbza.zzh("Unable to parse videoMeta message.", e);
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e2) {
                e = e2;
                zzbza.zzh("Unable to parse videoMeta message.", e);
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float f = Float.parseFloat((String) map.get("duration"));
        boolean zEquals = TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE.equals(map.get("muted"));
        float f2 = Float.parseFloat((String) map.get(TJAdUnitConstants.String.VIDEO_CURRENT_TIME));
        int i = Integer.parseInt((String) map.get("playbackState"));
        if (i < 0 || i > 3) {
            i = 0;
        }
        String str = (String) map.get("aspectRatio");
        float f3 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (com.google.android.gms.ads.internal.util.zze.zzm(3)) {
            zzbza.zze("Video Meta GMSG: currentTime : " + f2 + " , duration : " + f + " , isMuted : " + zEquals + " , playbackState : " + i + " , aspectRatio : " + str);
        }
        zzcfeVarZzq.zzc(f2, f, i, zEquals, f3);
    }
}
