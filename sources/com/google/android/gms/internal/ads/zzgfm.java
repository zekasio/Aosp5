package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgfm extends zzgds {
    zzgfm(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzgds
    public final /* bridge */ /* synthetic */ Object zza(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzgjz zzgjzVar = (zzgjz) zzgrwVar;
        int iZzg = zzgjzVar.zzg().zzg();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzgjzVar.zzh().zzE(), "HMAC");
        int iZza = zzgjzVar.zzg().zza();
        int i = iZzg - 2;
        if (i == 1) {
            return new zzgoc(new zzgob("HMACSHA1", secretKeySpec), iZza);
        }
        if (i == 2) {
            return new zzgoc(new zzgob("HMACSHA384", secretKeySpec), iZza);
        }
        if (i == 3) {
            return new zzgoc(new zzgob("HMACSHA256", secretKeySpec), iZza);
        }
        if (i == 4) {
            return new zzgoc(new zzgob("HMACSHA512", secretKeySpec), iZza);
        }
        if (i == 5) {
            return new zzgoc(new zzgob("HMACSHA224", secretKeySpec), iZza);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
