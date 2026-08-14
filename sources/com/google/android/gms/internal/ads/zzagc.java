package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzagc implements zzzu, zzaax {
    public static final zzaab zza = new zzaab() { // from class: com.google.android.gms.internal.ads.zzafz
        @Override // com.google.android.gms.internal.ads.zzaab
        public final zzzu[] zza() {
            zzaab zzaabVar = zzagc.zza;
            return new zzzu[]{new zzagc(0)};
        }

        @Override // com.google.android.gms.internal.ads.zzaab
        public final /* synthetic */ zzzu[] zzb(Uri uri, Map map) {
            return zzaaa.zza(this, uri, map);
        }
    };
    private final zzen zzb;
    private final zzen zzc;
    private final zzen zzd;
    private final zzen zze;
    private final ArrayDeque zzf;
    private final zzage zzg;
    private final List zzh;
    private int zzi;
    private int zzj;
    private long zzk;
    private int zzl;
    private zzen zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private zzzx zzr;
    private zzagb[] zzs;
    private long[][] zzt;
    private int zzu;
    private long zzv;
    private int zzw;
    private zzaef zzx;

    public zzagc() {
        this(0);
    }

    private static int zzf(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int zzi(zzagj zzagjVar, long j) {
        int iZza = zzagjVar.zza(j);
        return iZza == -1 ? zzagjVar.zzb(j) : iZza;
    }

    private static long zzj(zzagj zzagjVar, long j, long j2) {
        int iZzi = zzi(zzagjVar, j);
        return iZzi == -1 ? j2 : Math.min(zzagjVar.zzc[iZzi], j2);
    }

    private final void zzk() {
        this.zzi = 0;
        this.zzl = 0;
    }

    private final void zzl(long j) throws zzbu {
        zzbq zzbqVar;
        zzbq zzbqVar2;
        long j2;
        List list;
        int i;
        zzbq zzbqVar3;
        long j3;
        int i2;
        while (!this.zzf.isEmpty() && ((zzafh) this.zzf.peek()).zza == j) {
            zzafh zzafhVar = (zzafh) this.zzf.pop();
            if (zzafhVar.zzd == 1836019574) {
                ArrayList arrayList = new ArrayList();
                int i3 = this.zzw;
                zzaaj zzaajVar = new zzaaj();
                zzafi zzafiVarZzb = zzafhVar.zzb(1969517665);
                if (zzafiVarZzb != null) {
                    Pair pairZza = zzafr.zza(zzafiVarZzb);
                    zzbq zzbqVar4 = (zzbq) pairZza.first;
                    zzbq zzbqVar5 = (zzbq) pairZza.second;
                    if (zzbqVar4 != null) {
                        zzaajVar.zzb(zzbqVar4);
                    }
                    zzbqVar = zzbqVar5;
                    zzbqVar2 = zzbqVar4;
                } else {
                    zzbqVar = null;
                    zzbqVar2 = null;
                }
                zzafh zzafhVarZza = zzafhVar.zza(1835365473);
                zzbq zzbqVarZzb = zzafhVarZza != null ? zzafr.zzb(zzafhVarZza) : null;
                List listZzc = zzafr.zzc(zzafhVar, zzaajVar, -9223372036854775807L, null, false, i3 == 1, new zzfnj() { // from class: com.google.android.gms.internal.ads.zzaga
                    @Override // com.google.android.gms.internal.ads.zzfnj
                    public final Object apply(Object obj) {
                        zzagg zzaggVar = (zzagg) obj;
                        zzaab zzaabVar = zzagc.zza;
                        return zzaggVar;
                    }
                });
                int size = listZzc.size();
                long j4 = -9223372036854775807L;
                zzbq zzbqVar6 = zzbqVar;
                int size2 = -1;
                int i4 = 0;
                long j5 = -9223372036854775807L;
                while (true) {
                    j2 = 0;
                    if (i4 >= size) {
                        break;
                    }
                    zzagj zzagjVar = (zzagj) listZzc.get(i4);
                    if (zzagjVar.zzb == 0) {
                        list = listZzc;
                        i = size;
                        j3 = j4;
                        zzbqVar3 = zzbqVar6;
                    } else {
                        zzagg zzaggVar = zzagjVar.zza;
                        list = listZzc;
                        i = size;
                        long j6 = zzaggVar.zze;
                        if (j6 == j4) {
                            j6 = zzagjVar.zzh;
                        }
                        long jMax = Math.max(j5, j6);
                        zzagb zzagbVar = new zzagb(zzaggVar, zzagjVar, this.zzr.zzv(i4, zzaggVar.zzb));
                        int i5 = "audio/true-hd".equals(zzaggVar.zzf.zzm) ? zzagjVar.zze * 16 : zzagjVar.zze + 30;
                        zzad zzadVarZzb = zzaggVar.zzf.zzb();
                        zzadVarZzb.zzL(i5);
                        if (zzaggVar.zzb == 2 && j6 > 0 && (i2 = zzagjVar.zzb) > 1) {
                            zzadVarZzb.zzE(i2 / (j6 / 1000000.0f));
                        }
                        int i6 = zzaggVar.zzb;
                        int i7 = zzafy.zzb;
                        if (i6 == 1 && zzaajVar.zza()) {
                            zzadVarZzb.zzC(zzaajVar.zza);
                            zzadVarZzb.zzD(zzaajVar.zzb);
                        }
                        int i8 = zzaggVar.zzb;
                        zzbq[] zzbqVarArr = new zzbq[2];
                        zzbqVarArr[0] = zzbqVar6;
                        zzbqVarArr[1] = this.zzh.isEmpty() ? null : new zzbq(this.zzh);
                        zzbqVar3 = zzbqVar6;
                        zzbq zzbqVar7 = new zzbq(-9223372036854775807L, new zzbp[0]);
                        if (i8 == 1) {
                            if (zzbqVar2 != null) {
                                zzbqVar7 = zzbqVar2;
                            }
                        } else if (i8 == 2 && zzbqVarZzb != null) {
                            for (int i9 = 0; i9 < zzbqVarZzb.zza(); i9++) {
                                zzbp zzbpVarZzb = zzbqVarZzb.zzb(i9);
                                if (zzbpVarZzb instanceof zzaec) {
                                    zzaec zzaecVar = (zzaec) zzbpVarZzb;
                                    if ("com.android.capture.fps".equals(zzaecVar.zza)) {
                                        zzbqVar7 = new zzbq(-9223372036854775807L, zzaecVar);
                                        j3 = -9223372036854775807L;
                                        break;
                                    }
                                }
                            }
                        }
                        j3 = -9223372036854775807L;
                        for (int i10 = 0; i10 < 2; i10++) {
                            zzbqVar7 = zzbqVar7.zzd(zzbqVarArr[i10]);
                        }
                        if (zzbqVar7.zza() > 0) {
                            zzadVarZzb.zzM(zzbqVar7);
                        }
                        zzagbVar.zzc.zzk(zzadVarZzb.zzY());
                        if (zzaggVar.zzb == 2 && size2 == -1) {
                            size2 = arrayList.size();
                        }
                        arrayList.add(zzagbVar);
                        j5 = jMax;
                    }
                    i4++;
                    j4 = j3;
                    zzbqVar6 = zzbqVar3;
                    listZzc = list;
                    size = i;
                }
                this.zzu = size2;
                this.zzv = j5;
                zzagb[] zzagbVarArr = (zzagb[]) arrayList.toArray(new zzagb[0]);
                this.zzs = zzagbVarArr;
                int length = zzagbVarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i11 = 0; i11 < zzagbVarArr.length; i11++) {
                    jArr[i11] = new long[zzagbVarArr[i11].zzb.zzb];
                    jArr2[i11] = zzagbVarArr[i11].zzb.zzf[0];
                }
                int i12 = 0;
                while (i12 < zzagbVarArr.length) {
                    long j7 = Long.MAX_VALUE;
                    int i13 = -1;
                    for (int i14 = 0; i14 < zzagbVarArr.length; i14++) {
                        if (!zArr[i14]) {
                            long j8 = jArr2[i14];
                            if (j8 <= j7) {
                                i13 = i14;
                                j7 = j8;
                            }
                        }
                    }
                    int i15 = iArr[i13];
                    long[] jArr3 = jArr[i13];
                    jArr3[i15] = j2;
                    zzagj zzagjVar2 = zzagbVarArr[i13].zzb;
                    j2 += (long) zzagjVar2.zzd[i15];
                    int i16 = i15 + 1;
                    iArr[i13] = i16;
                    if (i16 < jArr3.length) {
                        jArr2[i13] = zzagjVar2.zzf[i16];
                    } else {
                        zArr[i13] = true;
                        i12++;
                    }
                }
                this.zzt = jArr;
                this.zzr.zzC();
                this.zzr.zzN(this);
                this.zzf.clear();
                this.zzi = 2;
            } else if (!this.zzf.isEmpty()) {
                ((zzafh) this.zzf.peek()).zzc(zzafhVar);
            }
        }
        if (this.zzi != 2) {
            zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final void zzb(zzzx zzzxVar) {
        this.zzr = zzzxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final void zzc(long j, long j2) {
        this.zzf.clear();
        this.zzl = 0;
        this.zzn = -1;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        if (j == 0) {
            zzk();
            return;
        }
        for (zzagb zzagbVar : this.zzs) {
            zzagj zzagjVar = zzagbVar.zzb;
            int iZza = zzagjVar.zza(j2);
            if (iZza == -1) {
                iZza = zzagjVar.zzb(j2);
            }
            zzagbVar.zze = iZza;
            zzabc zzabcVar = zzagbVar.zzd;
            if (zzabcVar != null) {
                zzabcVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final boolean zzd(zzzv zzzvVar) throws IOException {
        return zzagf.zzb(zzzvVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final long zze() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final zzaav zzg(long j) {
        long j2;
        long j3;
        int iZzb;
        zzagb[] zzagbVarArr = this.zzs;
        if (zzagbVarArr.length == 0) {
            zzaay zzaayVar = zzaay.zza;
            return new zzaav(zzaayVar, zzaayVar);
        }
        int i = this.zzu;
        long jZzj = -1;
        if (i != -1) {
            zzagj zzagjVar = zzagbVarArr[i].zzb;
            int iZzi = zzi(zzagjVar, j);
            if (iZzi == -1) {
                zzaay zzaayVar2 = zzaay.zza;
                return new zzaav(zzaayVar2, zzaayVar2);
            }
            long j4 = zzagjVar.zzf[iZzi];
            j2 = zzagjVar.zzc[iZzi];
            if (j4 >= j || iZzi >= zzagjVar.zzb - 1 || (iZzb = zzagjVar.zzb(j)) == -1 || iZzb == iZzi) {
                j3 = -9223372036854775807L;
            } else {
                j3 = zzagjVar.zzf[iZzb];
                jZzj = zzagjVar.zzc[iZzb];
            }
            j = j4;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            zzagb[] zzagbVarArr2 = this.zzs;
            if (i2 >= zzagbVarArr2.length) {
                break;
            }
            if (i2 != this.zzu) {
                zzagj zzagjVar2 = zzagbVarArr2[i2].zzb;
                long jZzj2 = zzj(zzagjVar2, j, j2);
                if (j3 != -9223372036854775807L) {
                    jZzj = zzj(zzagjVar2, j3, jZzj);
                }
                j2 = jZzj2;
            }
            i2++;
        }
        zzaay zzaayVar3 = new zzaay(j, j2);
        return j3 == -9223372036854775807L ? new zzaav(zzaayVar3, zzaayVar3) : new zzaav(zzaayVar3, new zzaay(j3, jZzj));
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final boolean zzh() {
        return true;
    }

    public zzagc(int i) {
        this.zzi = 0;
        this.zzg = new zzage();
        this.zzh = new ArrayList();
        this.zze = new zzen(16);
        this.zzf = new ArrayDeque();
        this.zzb = new zzen(zzaar.zza);
        this.zzc = new zzen(4);
        this.zzd = new zzen();
        this.zzn = -1;
        this.zzr = zzzx.zza;
        this.zzs = new zzagb[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:260:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    @Override // com.google.android.gms.internal.ads.zzzu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(com.google.android.gms.internal.ads.zzzv r33, com.google.android.gms.internal.ads.zzaau r34) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagc.zza(com.google.android.gms.internal.ads.zzzv, com.google.android.gms.internal.ads.zzaau):int");
    }
}
