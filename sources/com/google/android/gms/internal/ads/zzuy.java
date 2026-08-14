package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzuy extends zzva {
    private final zzws zzd;
    private final zzfqk zze;
    private final zzdm zzf;

    protected zzuy(zzcp zzcpVar, int[] iArr, int i, zzws zzwsVar, long j, long j2, long j3, int i2, int i3, float f, float f2, List list, zzdm zzdmVar) {
        super(zzcpVar, iArr, 0);
        this.zzd = zzwsVar;
        this.zze = zzfqk.zzm(list);
        this.zzf = zzdmVar;
    }

    static /* bridge */ /* synthetic */ zzfqk zzf(zzwd[] zzwdVarArr) {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        char c = 0;
        int i3 = 0;
        while (true) {
            i = 2;
            i2 = 1;
            if (i3 >= 2) {
                break;
            }
            zzwd zzwdVar = zzwdVarArr[i3];
            if (zzwdVar == null || zzwdVar.zzb.length <= 1) {
                arrayList.add(null);
            } else {
                zzfqh zzfqhVarZzi = zzfqk.zzi();
                zzfqhVarZzi.zzf(new zzuw(0L, 0L));
                arrayList.add(zzfqhVarZzi);
            }
            i3++;
        }
        long[][] jArr = new long[2][];
        for (int i4 = 0; i4 < 2; i4++) {
            zzwd zzwdVar2 = zzwdVarArr[i4];
            if (zzwdVar2 == null) {
                jArr[i4] = new long[0];
            } else {
                jArr[i4] = new long[zzwdVar2.zzb.length];
                int i5 = 0;
                while (true) {
                    int[] iArr = zzwdVar2.zzb;
                    if (i5 >= iArr.length) {
                        break;
                    }
                    long j = zzwdVar2.zza.zzb(iArr[i5]).zzi;
                    long[] jArr2 = jArr[i4];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr2[i5] = j;
                    i5++;
                }
                Arrays.sort(jArr[i4]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr3 = new long[2];
        for (int i6 = 0; i6 < 2; i6++) {
            long[] jArr4 = jArr[i6];
            jArr3[i6] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        zzg(arrayList, jArr3);
        zzfqv zzfqvVarZza = zzfrn.zzc(zzfrs.zzc()).zzb(2).zza();
        int i7 = 0;
        while (i7 < i) {
            int length = jArr[i7].length;
            if (length > i2) {
                double[] dArr = new double[length];
                int i8 = 0;
                while (true) {
                    long[] jArr5 = jArr[i7];
                    double dLog = 0.0d;
                    if (i8 >= jArr5.length) {
                        break;
                    }
                    long j2 = jArr5[i8];
                    if (j2 != -1) {
                        dLog = Math.log(j2);
                    }
                    dArr[i8] = dLog;
                    i8++;
                }
                int i9 = length - 1;
                double d = dArr[i9] - dArr[c];
                int i10 = 0;
                while (i10 < i9) {
                    double d2 = dArr[i10];
                    i10++;
                    zzfqvVarZza.zzs(Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i10]) * 0.5d) - dArr[c]) / d), Integer.valueOf(i7));
                    c = 0;
                }
            }
            i7++;
            c = 0;
            i = 2;
            i2 = 1;
        }
        zzfqk zzfqkVarZzm = zzfqk.zzm(zzfqvVarZza.zzt());
        for (int i11 = 0; i11 < zzfqkVarZzm.size(); i11++) {
            int iIntValue = ((Integer) zzfqkVarZzm.get(i11)).intValue();
            int i12 = iArr2[iIntValue] + 1;
            iArr2[iIntValue] = i12;
            jArr3[iIntValue] = jArr[iIntValue][i12];
            zzg(arrayList, jArr3);
        }
        for (int i13 = 0; i13 < 2; i13++) {
            if (arrayList.get(i13) != null) {
                long j3 = jArr3[i13];
                jArr3[i13] = j3 + j3;
            }
        }
        zzg(arrayList, jArr3);
        zzfqh zzfqhVarZzi2 = zzfqk.zzi();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            zzfqh zzfqhVar = (zzfqh) arrayList.get(i14);
            zzfqhVarZzi2.zzf(zzfqhVar == null ? zzfqk.zzo() : zzfqhVar.zzi());
        }
        return zzfqhVarZzi2.zzi();
    }

    private static void zzg(List list, long[] jArr) {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j += jArr[i];
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzfqh zzfqhVar = (zzfqh) list.get(i2);
            if (zzfqhVar != null) {
                zzfqhVar.zzf(new zzuw(j, jArr[i2]));
            }
        }
    }
}
