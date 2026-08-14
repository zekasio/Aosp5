package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgnn {
    public static final zzgnn zza = new zzgnn(new zzgno());
    public static final zzgnn zzb = new zzgnn(new zzgns());
    public static final zzgnn zzc = new zzgnn(new zzgnu());
    public static final zzgnn zzd = new zzgnn(new zzgnt());
    public static final zzgnn zze = new zzgnn(new zzgnp());
    public static final zzgnn zzf = new zzgnn(new zzgnr());
    public static final zzgnn zzg = new zzgnn(new zzgnq());
    private final zzgnm zzh;

    public zzgnn(zzgnv zzgnvVar) {
        if (zzgat.zzb()) {
            this.zzh = new zzgnl(zzgnvVar, null);
        } else if (zzgof.zza()) {
            this.zzh = new zzgnh(zzgnvVar, null);
        } else {
            this.zzh = new zzgnj(zzgnvVar, null);
        }
    }

    public static List zzb(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final Object zza(String str) throws GeneralSecurityException {
        return this.zzh.zza(str);
    }
}
