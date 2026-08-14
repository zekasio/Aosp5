package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzges extends zzgcu {
    private static final zzgdr zza = zzgdr.zzb(new zzgdp() { // from class: com.google.android.gms.internal.ads.zzgep
        @Override // com.google.android.gms.internal.ads.zzgdp
        public final Object zza(zzfvx zzfvxVar) {
            return new zzggh((zzgeo) zzfvxVar);
        }
    }, zzgeo.class, zzgfd.class);

    zzges() {
        super(zzggw.class, new zzgeq(zzfws.class));
    }

    public static void zzm(boolean z) throws GeneralSecurityException {
        zzfxf.zzo(new zzges(), true);
        zzgfc.zza();
        zzgde.zza().zze(zza);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzn(zzghc zzghcVar) throws GeneralSecurityException {
        if (zzghcVar.zza() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (zzghcVar.zza() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzo(int i) throws GeneralSecurityException {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final zzgct zza() {
        return new zzger(this, zzggz.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final zzgkx zzb() {
        return zzgkx.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* synthetic */ zzgrw zzc(zzgpe zzgpeVar) throws zzgqy {
        return zzggw.zze(zzgpeVar, zzgpy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* bridge */ /* synthetic */ void zze(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzggw zzggwVar = (zzggw) zzgrwVar;
        zzgog.zzb(zzggwVar.zza(), 0);
        zzo(zzggwVar.zzg().zzd());
        zzn(zzggwVar.zzf());
    }
}
