package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.tapjoy.TapjoyAuctionFlags;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzezj {
    public zzezj() {
        try {
            zzfxi.zza();
        } catch (GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to Configure Aead. ".concat(e.toString()));
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "CryptoUtils.registerAead");
        }
    }

    public static final String zza() {
        zzgpb zzgpbVarZzt = zzgpe.zzt();
        try {
            zzfvs.zzb(zzfwp.zzb(zzfwi.zza("AES128_GCM")), zzfvq.zzb(zzgpbVarZzt));
        } catch (IOException | GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to generate key".concat(e.toString()));
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "CryptoUtils.generateKey");
        }
        String strEncodeToString = Base64.encodeToString(zzgpbVarZzt.zzb().zzE(), 11);
        zzgpbVarZzt.zzc();
        return strEncodeToString;
    }

    @Nullable
    public static final String zzb(byte[] bArr, byte[] bArr2, String str, zzdpd zzdpdVar) {
        zzfwp zzfwpVarZzc = zzc(str);
        if (zzfwpVarZzc == null) {
            return null;
        }
        try {
            byte[] bArrZza = ((zzfvo) zzfwpVarZzc.zzd(zzfvo.class)).zza(bArr, bArr2);
            zzdpdVar.zza().put("ds", TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE);
            return new String(bArrZza, "UTF-8");
        } catch (UnsupportedEncodingException | GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to decrypt ".concat(e.toString()));
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "CryptoUtils.decrypt");
            zzdpdVar.zza().put("dsf", e.toString());
            return null;
        }
    }

    @Nullable
    private static final zzfwp zzc(String str) {
        try {
            return zzfvs.zza(zzfvp.zzb(Base64.decode(str, 11)));
        } catch (IOException | GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to get keysethandle".concat(e.toString()));
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "CryptoUtils.getHandle");
            return null;
        }
    }
}
