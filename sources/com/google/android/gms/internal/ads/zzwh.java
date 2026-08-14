package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzwh extends zzwk {
    private zzwg zza;

    protected abstract Pair zzb(zzwg zzwgVar, int[][][] iArr, int[] iArr2, zzss zzssVar, zzcn zzcnVar) throws zzhj;

    @Override // com.google.android.gms.internal.ads.zzwk
    public final zzwl zzn(zzko[] zzkoVarArr, zzur zzurVar, zzss zzssVar, zzcn zzcnVar) throws zzhj {
        boolean z;
        int[] iArr;
        int[] iArr2 = new int[3];
        zzcp[][] zzcpVarArr = new zzcp[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i = 0; i < 3; i++) {
            int i2 = zzurVar.zzc;
            zzcpVarArr[i] = new zzcp[i2];
            iArr3[i] = new int[i2][];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            iArr4[i4] = zzkoVarArr[i4].zze();
        }
        int i5 = 0;
        while (i5 < zzurVar.zzc) {
            zzcp zzcpVarZzb = zzurVar.zzb(i5);
            int i6 = zzcpVarZzb.zzd;
            int i7 = 0;
            int i8 = 2;
            int i9 = 0;
            boolean z2 = true;
            while (i7 < i3) {
                zzko zzkoVar = zzkoVarArr[i7];
                int i10 = 0;
                int iMax = 0;
                while (true) {
                    int i11 = zzcpVarZzb.zzb;
                    if (i10 > 0) {
                        break;
                    }
                    iMax = Math.max(iMax, zzkoVar.zzO(zzcpVarZzb.zzb(i10)) & 7);
                    i10++;
                }
                boolean z3 = iArr2[i7] == 0;
                if (iMax > i9) {
                    z2 = z3;
                    i8 = i7;
                    i9 = iMax;
                } else if (iMax == i9 && i6 == 5 && !z2 && z3) {
                    i8 = i7;
                    i9 = iMax;
                    z2 = true;
                }
                i7++;
                i3 = 2;
            }
            if (i8 == i3) {
                int i12 = zzcpVarZzb.zzb;
                iArr = new int[1];
            } else {
                zzko zzkoVar2 = zzkoVarArr[i8];
                int i13 = zzcpVarZzb.zzb;
                int[] iArr5 = new int[1];
                int i14 = 0;
                while (true) {
                    int i15 = zzcpVarZzb.zzb;
                    if (i14 > 0) {
                        break;
                    }
                    iArr5[i14] = zzkoVar2.zzO(zzcpVarZzb.zzb(i14));
                    i14++;
                }
                iArr = iArr5;
            }
            int i16 = iArr2[i8];
            zzcpVarArr[i8][i16] = zzcpVarZzb;
            iArr3[i8][i16] = iArr;
            iArr2[i8] = i16 + 1;
            i5++;
            i3 = 2;
        }
        zzur[] zzurVarArr = new zzur[i3];
        String[] strArr = new String[i3];
        int[] iArr6 = new int[i3];
        int i17 = 0;
        while (i17 < i3) {
            int i18 = iArr2[i17];
            zzurVarArr[i17] = new zzur((zzcp[]) zzew.zzaf(zzcpVarArr[i17], i18));
            iArr3[i17] = (int[][]) zzew.zzaf(iArr3[i17], i18);
            strArr[i17] = zzkoVarArr[i17].zzK();
            iArr6[i17] = zzkoVarArr[i17].zzb();
            i17++;
            i3 = 2;
        }
        zzwg zzwgVar = new zzwg(strArr, iArr6, zzurVarArr, iArr4, iArr3, new zzur((zzcp[]) zzew.zzaf(zzcpVarArr[2], iArr2[2])));
        Pair pairZzb = zzb(zzwgVar, iArr3, iArr4, zzssVar, zzcnVar);
        zzwi[] zzwiVarArr = (zzwi[]) pairZzb.second;
        List[] listArr = new List[zzwiVarArr.length];
        for (int i19 = 0; i19 < zzwiVarArr.length; i19++) {
            zzwi zzwiVar = zzwiVarArr[i19];
            listArr[i19] = zzwiVar != null ? zzfqk.zzp(zzwiVar) : zzfqk.zzo();
        }
        zzfqh zzfqhVar = new zzfqh();
        for (int i20 = 0; i20 < 2; i20++) {
            zzur zzurVarZzd = zzwgVar.zzd(i20);
            List list = listArr[i20];
            for (int i21 = 0; i21 < zzurVarZzd.zzc; i21++) {
                zzcp zzcpVarZzb2 = zzurVarZzd.zzb(i21);
                boolean z4 = zzwgVar.zza(i20, i21, false) != 0;
                int i22 = zzcpVarZzb2.zzb;
                int[] iArr7 = new int[1];
                boolean[] zArr = new boolean[1];
                int i23 = 0;
                while (true) {
                    int i24 = zzcpVarZzb2.zzb;
                    if (i23 <= 0) {
                        iArr7[i23] = zzwgVar.zzb(i20, i21, i23) & 7;
                        int i25 = 0;
                        while (true) {
                            if (i25 >= list.size()) {
                                z = false;
                                break;
                            }
                            zzwi zzwiVar2 = (zzwi) list.get(i25);
                            if (zzwiVar2.zze().equals(zzcpVarZzb2) && zzwiVar2.zzb(i23) != -1) {
                                z = true;
                                break;
                            }
                            i25++;
                        }
                        zArr[i23] = z;
                        i23++;
                    }
                }
                zzfqhVar.zzf(new zzcx(zzcpVarZzb2, z4, iArr7, zArr));
            }
        }
        zzur zzurVarZze = zzwgVar.zze();
        for (int i26 = 0; i26 < zzurVarZze.zzc; i26++) {
            zzcp zzcpVarZzb3 = zzurVarZze.zzb(i26);
            int i27 = zzcpVarZzb3.zzb;
            int[] iArr8 = new int[1];
            Arrays.fill(iArr8, 0);
            int i28 = zzcpVarZzb3.zzb;
            zzfqhVar.zzf(new zzcx(zzcpVarZzb3, false, iArr8, new boolean[1]));
        }
        return new zzwl((zzkp[]) pairZzb.first, (zzwe[]) pairZzb.second, new zzcy(zzfqhVar.zzi()), zzwgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwk
    public final void zzo(Object obj) {
        this.zza = (zzwg) obj;
    }
}
