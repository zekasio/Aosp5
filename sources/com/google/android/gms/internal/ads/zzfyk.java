package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfyk {
    public static final /* synthetic */ int zza = 0;
    private static final zzgoj zzb;
    private static final zzgdn zzc;
    private static final zzgdj zzd;
    private static final zzgcr zze;
    private static final zzgcn zzf;

    static {
        zzgoj zzgojVarZzb = zzgek.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = zzgojVarZzb;
        zzc = zzgdn.zza(new zzgdl() { // from class: com.google.android.gms.internal.ads.zzfyg
        }, zzfyf.class, zzgea.class);
        zzd = zzgdj.zza(new zzgdh() { // from class: com.google.android.gms.internal.ads.zzfyh
        }, zzgojVarZzb, zzgea.class);
        zze = zzgcr.zza(new zzgcp() { // from class: com.google.android.gms.internal.ads.zzfyi
        }, zzfxx.class, zzgdz.class);
        zzf = zzgcn.zzb(new zzgcl() { // from class: com.google.android.gms.internal.ads.zzfyj
            @Override // com.google.android.gms.internal.ads.zzgcl
            public final zzfvx zza(zzgeb zzgebVar, zzfxg zzfxgVar) throws GeneralSecurityException {
                zzfyd zzfydVar;
                int i = zzfyk.zza;
                if (!((zzgdz) zzgebVar).zzg().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
                }
                try {
                    zzghu zzghuVarZze = zzghu.zze(((zzgdz) zzgebVar).zze(), zzgpy.zza());
                    if (zzghuVarZze.zza() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zzfyc zzfycVar = new zzfyc(null);
                    zzfycVar.zzb(zzghuVarZze.zzg().zzd());
                    zzfycVar.zza(zzghuVarZze.zzf().zza());
                    zzfycVar.zzc(16);
                    zzgme zzgmeVarZzc = ((zzgdz) zzgebVar).zzc();
                    zzgme zzgmeVar = zzgme.UNKNOWN_PREFIX;
                    int iOrdinal = zzgmeVarZzc.ordinal();
                    if (iOrdinal == 1) {
                        zzfydVar = zzfyd.zza;
                    } else if (iOrdinal == 2) {
                        zzfydVar = zzfyd.zzb;
                    } else if (iOrdinal == 3) {
                        zzfydVar = zzfyd.zzc;
                    } else {
                        if (iOrdinal != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgmeVarZzc.zza());
                        }
                        zzfydVar = zzfyd.zzb;
                    }
                    zzfycVar.zzd(zzfydVar);
                    zzfyf zzfyfVarZze = zzfycVar.zze();
                    zzfxv zzfxvVar = new zzfxv(null);
                    zzfxvVar.zzc(zzfyfVarZze);
                    zzfxvVar.zzb(zzgok.zzb(zzghuVarZze.zzg().zzE(), zzfxgVar));
                    zzfxvVar.zza(((zzgdz) zzgebVar).zzf());
                    return zzfxvVar.zzd();
                } catch (zzgqy unused) {
                    throw new GeneralSecurityException("Parsing AesEaxcKey failed");
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
