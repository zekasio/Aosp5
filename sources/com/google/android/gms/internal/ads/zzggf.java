package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzggf implements zzfxc {
    private static final Logger zza = Logger.getLogger(zzggf.class.getName());
    private static final byte[] zzb = {0};
    private static final zzggf zzc = new zzggf();

    zzggf() {
    }

    public static void zze() throws GeneralSecurityException {
        zzfxf.zzp(zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzfxc
    public final Class zza() {
        return zzfws.class;
    }

    @Override // com.google.android.gms.internal.ads.zzfxc
    public final Class zzb() {
        return zzfws.class;
    }

    @Override // com.google.android.gms.internal.ads.zzfxc
    public final /* bridge */ /* synthetic */ Object zzc(zzfxb zzfxbVar) throws GeneralSecurityException {
        Iterator it = zzfxbVar.zzd().iterator();
        while (it.hasNext()) {
            for (zzfwx zzfwxVar : (List) it.next()) {
                if (zzfwxVar.zzb() instanceof zzggb) {
                    zzggb zzggbVar = (zzggb) zzfwxVar.zzb();
                    zzgoj zzgojVarZzb = zzgoj.zzb(zzfwxVar.zzg());
                    if (!zzgojVarZzb.equals(zzggbVar.zzb())) {
                        throw new GeneralSecurityException("Mac Key with parameters " + String.valueOf(zzggbVar.zza()) + " has wrong output prefix (" + zzggbVar.zzb().toString() + ") instead of (" + zzgojVarZzb.toString() + ")");
                    }
                }
            }
        }
        return new zzgge(zzfxbVar, null);
    }
}
