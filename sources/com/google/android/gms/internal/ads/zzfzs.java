package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfzs {
    public static final /* synthetic */ int zza = 0;
    private static final zzgoj zzb;
    private static final zzgdn zzc;
    private static final zzgdj zzd;
    private static final zzgcr zze;
    private static final zzgcn zzf;

    static {
        zzgoj zzgojVarZzb = zzgek.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzb = zzgojVarZzb;
        zzc = zzgdn.zza(new zzgdl() { // from class: com.google.android.gms.internal.ads.zzfzo
        }, zzfzn.class, zzgea.class);
        zzd = zzgdj.zza(new zzgdh() { // from class: com.google.android.gms.internal.ads.zzfzp
        }, zzgojVarZzb, zzgea.class);
        zze = zzgcr.zza(new zzgcp() { // from class: com.google.android.gms.internal.ads.zzfzq
        }, zzfzf.class, zzgdz.class);
        zzf = zzgcn.zzb(new zzgcl() { // from class: com.google.android.gms.internal.ads.zzfzr
            @Override // com.google.android.gms.internal.ads.zzgcl
            public final zzfvx zza(zzgeb zzgebVar, zzfxg zzfxgVar) throws GeneralSecurityException {
                zzfzl zzfzlVar;
                int i = zzfzs.zza;
                if (!((zzgdz) zzgebVar).zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters");
                }
                try {
                    zzgij zzgijVarZze = zzgij.zze(((zzgdz) zzgebVar).zze(), zzgpy.zza());
                    if (zzgijVarZze.zza() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zzfzk zzfzkVar = new zzfzk(null);
                    zzfzkVar.zza(zzgijVarZze.zzf().zzd());
                    zzgme zzgmeVarZzc = ((zzgdz) zzgebVar).zzc();
                    zzgme zzgmeVar = zzgme.UNKNOWN_PREFIX;
                    int iOrdinal = zzgmeVarZzc.ordinal();
                    if (iOrdinal == 1) {
                        zzfzlVar = zzfzl.zza;
                    } else if (iOrdinal == 2) {
                        zzfzlVar = zzfzl.zzb;
                    } else if (iOrdinal == 3) {
                        zzfzlVar = zzfzl.zzc;
                    } else {
                        if (iOrdinal != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgmeVarZzc.zza());
                        }
                        zzfzlVar = zzfzl.zzb;
                    }
                    zzfzkVar.zzb(zzfzlVar);
                    zzfzn zzfznVarZzc = zzfzkVar.zzc();
                    zzfzd zzfzdVar = new zzfzd(null);
                    zzfzdVar.zzc(zzfznVarZzc);
                    zzfzdVar.zzb(zzgok.zzb(zzgijVarZze.zzf().zzE(), zzfxgVar));
                    zzfzdVar.zza(((zzgdz) zzgebVar).zzf());
                    return zzfzdVar.zzd();
                } catch (zzgqy unused) {
                    throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
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
