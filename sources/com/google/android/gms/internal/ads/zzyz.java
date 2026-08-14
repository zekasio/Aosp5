package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzyz {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final float zze;
    public final String zzf;

    private zzyz(List list, int i, int i2, int i3, float f, String str) {
        this.zza = list;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = f;
        this.zzf = str;
    }

    public static zzyz zza(zzen zzenVar) throws zzbu {
        String strZza;
        int i;
        int i2;
        float f;
        try {
            zzenVar.zzG(4);
            int iZzk = zzenVar.zzk() & 3;
            int i3 = iZzk + 1;
            if (i3 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iZzk2 = zzenVar.zzk() & 31;
            for (int i4 = 0; i4 < iZzk2; i4++) {
                arrayList.add(zzb(zzenVar));
            }
            int iZzk3 = zzenVar.zzk();
            for (int i5 = 0; i5 < iZzk3; i5++) {
                arrayList.add(zzb(zzenVar));
            }
            if (iZzk2 > 0) {
                zzaaq zzaaqVarZzd = zzaar.zzd((byte[]) arrayList.get(0), iZzk + 2, ((byte[]) arrayList.get(0)).length);
                int i6 = zzaaqVarZzd.zze;
                int i7 = zzaaqVarZzd.zzf;
                float f2 = zzaaqVarZzd.zzg;
                strZza = zzdn.zza(zzaaqVarZzd.zza, zzaaqVarZzd.zzb, zzaaqVarZzd.zzc);
                i = i6;
                i2 = i7;
                f = f2;
            } else {
                strZza = null;
                i = -1;
                i2 = -1;
                f = 1.0f;
            }
            return new zzyz(arrayList, i3, i, i2, f, strZza);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzbu.zza("Error parsing AVC config", e);
        }
    }

    private static byte[] zzb(zzen zzenVar) {
        int iZzo = zzenVar.zzo();
        int iZzc = zzenVar.zzc();
        zzenVar.zzG(iZzo);
        return zzdn.zzc(zzenVar.zzH(), iZzc, iZzo);
    }
}
