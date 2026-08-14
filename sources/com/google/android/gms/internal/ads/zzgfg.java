package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgfg implements zzfxc {
    private static final zzgfg zza = new zzgfg();

    private zzgfg() {
    }

    static void zzd() throws GeneralSecurityException {
        zzfxf.zzp(zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfxc
    public final Class zza() {
        return zzgfd.class;
    }

    @Override // com.google.android.gms.internal.ads.zzfxc
    public final Class zzb() {
        return zzgfd.class;
    }

    @Override // com.google.android.gms.internal.ads.zzfxc
    public final /* bridge */ /* synthetic */ Object zzc(zzfxb zzfxbVar) throws GeneralSecurityException {
        if (zzfxbVar.zza() == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        Iterator it = zzfxbVar.zzd().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
            }
        }
        return new zzgff(zzfxbVar, null);
    }
}
