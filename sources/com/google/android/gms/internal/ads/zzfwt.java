package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class zzfwt {
    @Deprecated
    public static final zzfwp zza(byte[] bArr) throws GeneralSecurityException {
        try {
            zzgll zzgllVarZzh = zzgll.zzh(bArr, zzgpy.zza());
            for (zzglk zzglkVar : zzgllVarZzh.zzi()) {
                if (zzglkVar.zzc().zzc() == zzgkx.UNKNOWN_KEYMATERIAL || zzglkVar.zzc().zzc() == zzgkx.SYMMETRIC || zzglkVar.zzc().zzc() == zzgkx.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return zzfwp.zza(zzgllVarZzh);
        } catch (zzgqy unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
