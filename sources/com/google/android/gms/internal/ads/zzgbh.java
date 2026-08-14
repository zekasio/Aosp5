package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgbh implements zzfxc {
    private static final Logger zza = Logger.getLogger(zzgbh.class.getName());
    private static final zzgbh zzb = new zzgbh();

    zzgbh() {
    }

    public static void zzd() throws GeneralSecurityException {
        zzfxf.zzp(zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzfxc
    public final Class zza() {
        return zzfvv.class;
    }

    @Override // com.google.android.gms.internal.ads.zzfxc
    public final Class zzb() {
        return zzfvv.class;
    }

    @Override // com.google.android.gms.internal.ads.zzfxc
    public final /* synthetic */ Object zzc(zzfxb zzfxbVar) throws GeneralSecurityException {
        return new zzgbg(zzfxbVar);
    }
}
