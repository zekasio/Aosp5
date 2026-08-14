package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfzi extends zzgcu {
    zzfzi() {
        super(zzgij.class, new zzfzg(zzfvo.class));
    }

    public static void zzg(boolean z) throws GeneralSecurityException {
        if (zzm()) {
            zzfxf.zzo(new zzfzi(), true);
            zzfzs.zza();
        }
    }

    static /* bridge */ /* synthetic */ zzgcs zzh(int i, int i2) {
        zzgil zzgilVarZzc = zzgim.zzc();
        zzgilVarZzc.zza(i);
        return new zzgcs((zzgim) zzgilVarZzc.zzal(), i2);
    }

    private static boolean zzm() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final zzgct zza() {
        return new zzfzh(this, zzgim.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final zzgkx zzb() {
        return zzgkx.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* synthetic */ zzgrw zzc(zzgpe zzgpeVar) throws zzgqy {
        return zzgij.zze(zzgpeVar, zzgpy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* bridge */ /* synthetic */ void zze(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzgij zzgijVar = (zzgij) zzgrwVar;
        zzgog.zzb(zzgijVar.zza(), 0);
        zzgog.zza(zzgijVar.zzf().zzd());
    }
}
