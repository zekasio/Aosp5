package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfzb {
    public static final /* synthetic */ int zza = 0;
    private static final zzgoj zzb;
    private static final zzgdn zzc;
    private static final zzgdj zzd;
    private static final zzgcr zze;
    private static final zzgcn zzf;

    static {
        zzgoj zzgojVarZzb = zzgek.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzb = zzgojVarZzb;
        zzc = zzgdn.zza(new zzgdl() { // from class: com.google.android.gms.internal.ads.zzfyx
        }, zzfyw.class, zzgea.class);
        zzd = zzgdj.zza(new zzgdh() { // from class: com.google.android.gms.internal.ads.zzfyy
        }, zzgojVarZzb, zzgea.class);
        zze = zzgcr.zza(new zzgcp() { // from class: com.google.android.gms.internal.ads.zzfyz
        }, zzfyo.class, zzgdz.class);
        zzf = zzgcn.zzb(new zzgcl() { // from class: com.google.android.gms.internal.ads.zzfza
            @Override // com.google.android.gms.internal.ads.zzgcl
            public final zzfvx zza(zzgeb zzgebVar, zzfxg zzfxgVar) throws GeneralSecurityException {
                zzfyu zzfyuVar;
                int i = zzfzb.zza;
                if (!((zzgdz) zzgebVar).zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
                }
                try {
                    zzgid zzgidVarZze = zzgid.zze(((zzgdz) zzgebVar).zze(), zzgpy.zza());
                    if (zzgidVarZze.zza() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zzfyt zzfytVar = new zzfyt(null);
                    zzfytVar.zzb(zzgidVarZze.zzf().zzd());
                    zzfytVar.zza(12);
                    zzfytVar.zzc(16);
                    zzgme zzgmeVarZzc = ((zzgdz) zzgebVar).zzc();
                    zzgme zzgmeVar = zzgme.UNKNOWN_PREFIX;
                    int iOrdinal = zzgmeVarZzc.ordinal();
                    if (iOrdinal == 1) {
                        zzfyuVar = zzfyu.zza;
                    } else if (iOrdinal == 2) {
                        zzfyuVar = zzfyu.zzb;
                    } else if (iOrdinal == 3) {
                        zzfyuVar = zzfyu.zzc;
                    } else {
                        if (iOrdinal != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgmeVarZzc.zza());
                        }
                        zzfyuVar = zzfyu.zzb;
                    }
                    zzfytVar.zzd(zzfyuVar);
                    zzfyw zzfywVarZze = zzfytVar.zze();
                    zzfym zzfymVar = new zzfym(null);
                    zzfymVar.zzc(zzfywVarZze);
                    zzfymVar.zzb(zzgok.zzb(zzgidVarZze.zzf().zzE(), zzfxgVar));
                    zzfymVar.zza(((zzgdz) zzgebVar).zzf());
                    return zzfymVar.zzd();
                } catch (zzgqy unused) {
                    throw new GeneralSecurityException("Parsing AesGcmKey failed");
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
