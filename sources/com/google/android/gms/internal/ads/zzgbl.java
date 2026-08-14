package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgbl implements zzgmy {
    private final String zza;
    private final int zzb;
    private zzgid zzc;
    private zzghf zzd;
    private int zze;
    private zzgip zzf;

    zzgbl(zzgld zzgldVar) throws GeneralSecurityException {
        String strZzg = zzgldVar.zzg();
        this.zza = strZzg;
        if (strZzg.equals(zzfxi.zzb)) {
            try {
                zzgig zzgigVarZze = zzgig.zze(zzgldVar.zzf(), zzgpy.zza());
                this.zzc = (zzgid) zzfxf.zzd(zzgldVar);
                this.zzb = zzgigVarZze.zza();
                return;
            } catch (zzgqy e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        }
        if (strZzg.equals(zzfxi.zza)) {
            try {
                zzghi zzghiVarZzd = zzghi.zzd(zzgldVar.zzf(), zzgpy.zza());
                this.zzd = (zzghf) zzfxf.zzd(zzgldVar);
                this.zze = zzghiVarZzd.zze().zza();
                this.zzb = this.zze + zzghiVarZzd.zzf().zza();
                return;
            } catch (zzgqy e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
            }
        }
        if (!strZzg.equals(zzgax.zza)) {
            throw new GeneralSecurityException("unsupported AEAD DEM key type: ".concat(String.valueOf(strZzg)));
        }
        try {
            zzgis zzgisVarZze = zzgis.zze(zzgldVar.zzf(), zzgpy.zza());
            this.zzf = (zzgip) zzfxf.zzd(zzgldVar);
            this.zzb = zzgisVarZze.zza();
        } catch (zzgqy e3) {
            throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmy
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgmy
    public final zzgch zzb(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length != this.zzb) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        }
        if (this.zza.equals(zzfxi.zzb)) {
            zzgic zzgicVarZzc = zzgid.zzc();
            zzgicVarZzc.zzaj(this.zzc);
            zzgicVarZzc.zza(zzgpe.zzw(bArr, 0, this.zzb));
            return new zzgch((zzfvo) zzfxf.zzi(this.zza, (zzgid) zzgicVarZzc.zzal(), zzfvo.class));
        }
        if (!this.zza.equals(zzfxi.zza)) {
            if (!this.zza.equals(zzgax.zza)) {
                throw new GeneralSecurityException("unknown DEM key type");
            }
            zzgio zzgioVarZzc = zzgip.zzc();
            zzgioVarZzc.zzaj(this.zzf);
            zzgioVarZzc.zza(zzgpe.zzw(bArr, 0, this.zzb));
            return new zzgch((zzfvu) zzfxf.zzi(this.zza, (zzgip) zzgioVarZzc.zzal(), zzfvu.class));
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, this.zze);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, this.zze, this.zzb);
        zzghk zzghkVarZzc = zzghl.zzc();
        zzghkVarZzc.zzaj(this.zzd.zzf());
        zzghkVarZzc.zza(zzgpe.zzv(bArrCopyOfRange));
        zzghl zzghlVar = (zzghl) zzghkVarZzc.zzal();
        zzgjy zzgjyVarZzc = zzgjz.zzc();
        zzgjyVarZzc.zzaj(this.zzd.zzg());
        zzgjyVarZzc.zza(zzgpe.zzv(bArrCopyOfRange2));
        zzgjz zzgjzVar = (zzgjz) zzgjyVarZzc.zzal();
        zzghe zzgheVarZzc = zzghf.zzc();
        zzgheVarZzc.zzc(this.zzd.zza());
        zzgheVarZzc.zza(zzghlVar);
        zzgheVarZzc.zzb(zzgjzVar);
        return new zzgch((zzfvo) zzfxf.zzi(this.zza, (zzghf) zzgheVarZzc.zzal(), zzfvo.class));
    }
}
