package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgfc {
    public static final /* synthetic */ int zza = 0;
    private static final zzgoj zzb;
    private static final zzgdn zzc;
    private static final zzgdj zzd;
    private static final zzgcr zze;
    private static final zzgcn zzf;

    static {
        zzgoj zzgojVarZzb = zzgek.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzb = zzgojVarZzb;
        zzc = zzgdn.zza(new zzgdl() { // from class: com.google.android.gms.internal.ads.zzgey
        }, zzgex.class, zzgea.class);
        zzd = zzgdj.zza(new zzgdh() { // from class: com.google.android.gms.internal.ads.zzgez
        }, zzgojVarZzb, zzgea.class);
        zze = zzgcr.zza(new zzgcp() { // from class: com.google.android.gms.internal.ads.zzgfa
        }, zzgeo.class, zzgdz.class);
        zzf = zzgcn.zzb(new zzgcl() { // from class: com.google.android.gms.internal.ads.zzgfb
            @Override // com.google.android.gms.internal.ads.zzgcl
            public final zzfvx zza(zzgeb zzgebVar, zzfxg zzfxgVar) throws GeneralSecurityException {
                zzgev zzgevVar;
                int i = zzgfc.zza;
                if (!((zzgdz) zzgebVar).zzg().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
                }
                try {
                    zzggw zzggwVarZze = zzggw.zze(((zzgdz) zzgebVar).zze(), zzgpy.zza());
                    if (zzggwVarZze.zza() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zzgeu zzgeuVar = new zzgeu(null);
                    zzgeuVar.zza(zzggwVarZze.zzg().zzd());
                    zzgeuVar.zzb(zzggwVarZze.zzf().zza());
                    zzgme zzgmeVarZzc = ((zzgdz) zzgebVar).zzc();
                    zzgme zzgmeVar = zzgme.UNKNOWN_PREFIX;
                    int iOrdinal = zzgmeVarZzc.ordinal();
                    if (iOrdinal == 1) {
                        zzgevVar = zzgev.zza;
                    } else if (iOrdinal == 2) {
                        zzgevVar = zzgev.zzc;
                    } else if (iOrdinal == 3) {
                        zzgevVar = zzgev.zzd;
                    } else {
                        if (iOrdinal != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgmeVarZzc.zza());
                        }
                        zzgevVar = zzgev.zzb;
                    }
                    zzgeuVar.zzc(zzgevVar);
                    zzgex zzgexVarZzd = zzgeuVar.zzd();
                    zzgem zzgemVar = new zzgem(null);
                    zzgemVar.zzc(zzgexVarZzd);
                    zzgemVar.zza(zzgok.zzb(zzggwVarZze.zzg().zzE(), zzfxgVar));
                    zzgemVar.zzb(((zzgdz) zzgebVar).zzf());
                    return zzgemVar.zzd();
                } catch (zzgqy | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing AesCmacKey failed");
                }
            }
        }, zzgojVarZzb, zzgdz.class);
    }

    public static void zza() throws GeneralSecurityException {
        zzgdf zzgdfVarZzb = zzgdf.zzb();
        zzgdfVarZzb.zzf(zzc);
        zzgdfVarZzb.zze(zzd);
        zzgdfVarZzb.zzd(zze);
        zzgdfVarZzb.zzc(zzf);
    }
}
