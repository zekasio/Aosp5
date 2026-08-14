package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgfz {
    public static final /* synthetic */ int zza = 0;
    private static final zzgoj zzb;
    private static final zzgdn zzc;
    private static final zzgdj zzd;
    private static final zzgcr zze;
    private static final zzgcn zzf;

    static {
        zzgoj zzgojVarZzb = zzgek.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zzb = zzgojVarZzb;
        zzc = zzgdn.zza(new zzgdl() { // from class: com.google.android.gms.internal.ads.zzgfv
        }, zzgfu.class, zzgea.class);
        zzd = zzgdj.zza(new zzgdh() { // from class: com.google.android.gms.internal.ads.zzgfw
        }, zzgojVarZzb, zzgea.class);
        zze = zzgcr.zza(new zzgcp() { // from class: com.google.android.gms.internal.ads.zzgfx
        }, zzgfk.class, zzgdz.class);
        zzf = zzgcn.zzb(new zzgcl() { // from class: com.google.android.gms.internal.ads.zzgfy
            @Override // com.google.android.gms.internal.ads.zzgcl
            public final zzfvx zza(zzgeb zzgebVar, zzfxg zzfxgVar) throws GeneralSecurityException {
                zzgfr zzgfrVar;
                zzgfs zzgfsVar;
                int i = zzgfz.zza;
                if (!((zzgdz) zzgebVar).zzg().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
                }
                try {
                    zzgjz zzgjzVarZzf = zzgjz.zzf(((zzgdz) zzgebVar).zze(), zzgpy.zza());
                    if (zzgjzVarZzf.zza() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zzgfq zzgfqVar = new zzgfq(null);
                    zzgfqVar.zzb(zzgjzVarZzf.zzh().zzd());
                    zzgfqVar.zzc(zzgjzVarZzf.zzg().zza());
                    int iZzg = zzgjzVarZzf.zzg().zzg();
                    zzgme zzgmeVar = zzgme.UNKNOWN_PREFIX;
                    int i2 = iZzg - 2;
                    if (i2 == 1) {
                        zzgfrVar = zzgfr.zza;
                    } else if (i2 == 2) {
                        zzgfrVar = zzgfr.zzd;
                    } else if (i2 == 3) {
                        zzgfrVar = zzgfr.zzc;
                    } else if (i2 == 4) {
                        zzgfrVar = zzgfr.zze;
                    } else {
                        if (i2 != 5) {
                            throw new GeneralSecurityException("Unable to parse HashType: " + zzgjw.zza(iZzg));
                        }
                        zzgfrVar = zzgfr.zzb;
                    }
                    zzgfqVar.zza(zzgfrVar);
                    zzgme zzgmeVarZzc = ((zzgdz) zzgebVar).zzc();
                    int iOrdinal = zzgmeVarZzc.ordinal();
                    if (iOrdinal == 1) {
                        zzgfsVar = zzgfs.zza;
                    } else if (iOrdinal == 2) {
                        zzgfsVar = zzgfs.zzc;
                    } else if (iOrdinal == 3) {
                        zzgfsVar = zzgfs.zzd;
                    } else {
                        if (iOrdinal != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgmeVarZzc.zza());
                        }
                        zzgfsVar = zzgfs.zzb;
                    }
                    zzgfqVar.zzd(zzgfsVar);
                    zzgfu zzgfuVarZze = zzgfqVar.zze();
                    zzgfi zzgfiVar = new zzgfi(null);
                    zzgfiVar.zzc(zzgfuVarZze);
                    zzgfiVar.zzb(zzgok.zzb(zzgjzVarZzf.zzh().zzE(), zzfxgVar));
                    zzgfiVar.zza(((zzgdz) zzgebVar).zzf());
                    return zzgfiVar.zzd();
                } catch (zzgqy | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing HmacKey failed");
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
