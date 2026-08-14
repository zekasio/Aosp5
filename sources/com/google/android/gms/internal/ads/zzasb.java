package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzasb extends zzasm {
    public zzasb(zzaqx zzaqxVar, String str, String str2, zzamv zzamvVar, int i, int i2) {
        super(zzaqxVar, "bXRNTWf8pTJMV81ptuODaUT8St7h/kbg9zRX7vuGaRSfPUSYi9ha6NvG/sFrxBFp", "+jZivRPpfg3QAF/dHEFIfvkp2rKh7j4ILi27Wnexdh0=", zzamvVar, i, 73);
    }

    @Override // com.google.android.gms.internal.ads.zzasm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        try {
            int i = 1;
            boolean zBooleanValue = ((Boolean) this.zzf.invoke(null, this.zzb.zzb())).booleanValue();
            zzamv zzamvVar = this.zze;
            if (true == zBooleanValue) {
                i = 2;
            }
            zzamvVar.zzaf(i);
        } catch (InvocationTargetException unused) {
            this.zze.zzaf(3);
        }
    }
}
