package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzfeb {
    public static zzfec zza(Context context, int i) {
        boolean zBooleanValue;
        if (zzfep.zza()) {
            int i2 = i - 2;
            if (i2 != 20 && i2 != 21) {
                switch (i2) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        zBooleanValue = ((Boolean) zzbcd.zzc.zze()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        zBooleanValue = ((Boolean) zzbcd.zzd.zze()).booleanValue();
                        break;
                    case 5:
                        zBooleanValue = ((Boolean) zzbcd.zzb.zze()).booleanValue();
                        break;
                }
            } else {
                zBooleanValue = ((Boolean) zzbcd.zze.zze()).booleanValue();
            }
            if (zBooleanValue) {
                return new zzfee(context, i);
            }
        }
        return new zzfey();
    }

    public static zzfec zzb(Context context, int i, int i2, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        zzfec zzfecVarZza = zza(context, i);
        if (!(zzfecVarZza instanceof zzfee)) {
            return zzfecVarZza;
        }
        zzfecVarZza.zzh();
        zzfecVarZza.zzm(i2);
        if (zzfem.zze(zzlVar.zzp)) {
            zzfecVarZza.zze(zzlVar.zzp);
        }
        return zzfecVarZza;
    }
}
