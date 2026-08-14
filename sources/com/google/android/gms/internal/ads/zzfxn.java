package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfxn implements zzfxc {
    private static final Logger zza = Logger.getLogger(zzfxn.class.getName());
    private static final zzfxn zzb = new zzfxn();

    zzfxn() {
    }

    public static void zze() throws GeneralSecurityException {
        zzfxf.zzp(zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzfxc
    public final Class zza() {
        return zzfvo.class;
    }

    @Override // com.google.android.gms.internal.ads.zzfxc
    public final Class zzb() {
        return zzfvo.class;
    }

    @Override // com.google.android.gms.internal.ads.zzfxc
    public final /* synthetic */ Object zzc(zzfxb zzfxbVar) throws GeneralSecurityException {
        return new zzfxm(zzfxbVar, null);
    }
}
