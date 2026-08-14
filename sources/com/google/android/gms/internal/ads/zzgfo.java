package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgfo extends zzgcu {
    private static final zzgdr zza = zzgdr.zzb(new zzgdp() { // from class: com.google.android.gms.internal.ads.zzgfl
        @Override // com.google.android.gms.internal.ads.zzgdp
        public final Object zza(zzfvx zzfvxVar) {
            return new zzggi((zzgfk) zzfvxVar);
        }
    }, zzgfk.class, zzgfd.class);

    public zzgfo() {
        super(zzgjz.class, new zzgfm(zzfws.class));
    }

    public static void zzh(boolean z) throws GeneralSecurityException {
        zzfxf.zzo(new zzgfo(), true);
        zzgfz.zza();
        zzgde.zza().zze(zza);
    }

    public static final void zzm(zzgjz zzgjzVar) throws GeneralSecurityException {
        zzgog.zzb(zzgjzVar.zza(), 0);
        if (zzgjzVar.zzh().zzd() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        zzo(zzgjzVar.zzg());
    }

    static /* bridge */ /* synthetic */ zzgcs zzn(int i, int i2, int i3, int i4) {
        zzgkb zzgkbVarZzc = zzgkc.zzc();
        zzgke zzgkeVarZzc = zzgkf.zzc();
        zzgkeVarZzc.zzb(i3);
        zzgkeVarZzc.zza(i2);
        zzgkbVarZzc.zzb((zzgkf) zzgkeVarZzc.zzal());
        zzgkbVarZzc.zza(i);
        return new zzgcs((zzgkc) zzgkbVarZzc.zzal(), i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzo(zzgkf zzgkfVar) throws GeneralSecurityException {
        if (zzgkfVar.zza() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int iZzg = zzgkfVar.zzg() - 2;
        if (iZzg == 1) {
            if (zzgkfVar.zza() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (iZzg == 2) {
            if (zzgkfVar.zza() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (iZzg == 3) {
            if (zzgkfVar.zza() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (iZzg == 4) {
            if (zzgkfVar.zza() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (iZzg != 5) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (zzgkfVar.zza() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final zzgct zza() {
        return new zzgfn(this, zzgkc.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final zzgkx zzb() {
        return zzgkx.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* synthetic */ zzgrw zzc(zzgpe zzgpeVar) throws zzgqy {
        return zzgjz.zzf(zzgpeVar, zzgpy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* bridge */ /* synthetic */ void zze(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzm((zzgjz) zzgrwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final int zzf() {
        return 2;
    }
}
