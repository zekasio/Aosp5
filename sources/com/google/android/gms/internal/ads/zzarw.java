package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzarw extends zzasm {
    private final zzaqp zzi;

    public zzarw(zzaqx zzaqxVar, String str, String str2, zzamv zzamvVar, int i, int i2, zzaqp zzaqpVar) {
        super(zzaqxVar, "E/THkPkgF+0BLHsbSftuamH1/Y9ilZlsoBNC4vnGArx/OuP8nuKuPE26WAshquqV", "JjKXzosN///CnCEigOfT12TbYoIG/MWslFVGA2m/k1w=", zzamvVar, i, 94);
        this.zzi = zzaqpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzasm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        int iIntValue = ((Integer) this.zzf.invoke(null, this.zzi.zza())).intValue();
        synchronized (this.zze) {
            this.zze.zzae(zzanj.zza(iIntValue));
        }
    }
}
