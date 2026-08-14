package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgda {
    public static final zzggm zza = new zzgcz(null);

    public static zzggs zza(zzfxb zzfxbVar) {
        zzfwg zzfwgVar;
        zzggo zzggoVar = new zzggo();
        zzggoVar.zzb(zzfxbVar.zzb());
        Iterator it = zzfxbVar.zzd().iterator();
        while (it.hasNext()) {
            for (zzfwx zzfwxVar : (List) it.next()) {
                int iZzh = zzfwxVar.zzh() - 2;
                if (iZzh == 1) {
                    zzfwgVar = zzfwg.zza;
                } else if (iZzh == 2) {
                    zzfwgVar = zzfwg.zzb;
                } else {
                    if (iZzh != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    zzfwgVar = zzfwg.zzc;
                }
                int iZza = zzfwxVar.zza();
                String strZzf = zzfwxVar.zzf();
                if (strZzf.startsWith("type.googleapis.com/google.crypto.")) {
                    strZzf = strZzf.substring(34);
                }
                zzggoVar.zza(zzfwgVar, iZza, strZzf, zzfwxVar.zzc().name());
            }
        }
        if (zzfxbVar.zza() != null) {
            zzggoVar.zzc(zzfxbVar.zza().zza());
        }
        try {
            return zzggoVar.zzd();
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
