package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzwc extends zzwh {
    public static final /* synthetic */ int zzb = 0;
    private static final zzfrs zzc = zzfrs.zzb(new Comparator() { // from class: com.google.android.gms.internal.ads.zzvi
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            int i = zzwc.zzb;
            if (num.intValue() == -1) {
                return num2.intValue() == -1 ? 0 : -1;
            }
            if (num2.intValue() == -1) {
                return 1;
            }
            return num.intValue() - num2.intValue();
        }
    });
    private static final zzfrs zzd = zzfrs.zzb(new Comparator() { // from class: com.google.android.gms.internal.ads.zzvj
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int i = zzwc.zzb;
            return 0;
        }
    });
    public final Context zza;
    private final Object zze;
    private final boolean zzf;
    private zzvq zzg;
    private zzvv zzh;
    private zzk zzi;
    private final zzux zzj;

    @Deprecated
    public zzwc() {
        zzvq zzvqVar = zzvq.zzD;
        throw null;
    }

    protected static int zza(zzaf zzafVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(zzafVar.zzd)) {
            return 4;
        }
        String strZzf = zzf(str);
        String strZzf2 = zzf(zzafVar.zzd);
        if (strZzf2 == null || strZzf == null) {
            return (z && strZzf2 == null) ? 1 : 0;
        }
        if (strZzf2.startsWith(strZzf) || strZzf.startsWith(strZzf2)) {
            return 3;
        }
        return zzew.zzai(strZzf2, "-")[0].equals(zzew.zzai(strZzf, "-")[0]) ? 2 : 0;
    }

    protected static String zzf(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ boolean zzk(com.google.android.gms.internal.ads.zzwc r8, com.google.android.gms.internal.ads.zzaf r9) {
        /*
            java.lang.Object r0 = r8.zze
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzvq r1 = r8.zzg     // Catch: java.lang.Throwable -> L8f
            boolean r1 = r1.zzP     // Catch: java.lang.Throwable -> L8f
            r2 = 1
            if (r1 == 0) goto L8d
            boolean r1 = r8.zzf     // Catch: java.lang.Throwable -> L8f
            if (r1 != 0) goto L8d
            int r1 = r9.zzz     // Catch: java.lang.Throwable -> L8f
            r3 = 2
            if (r1 <= r3) goto L8d
            java.lang.String r1 = r9.zzm     // Catch: java.lang.Throwable -> L8f
            r4 = 32
            r5 = 0
            if (r1 != 0) goto L1b
            goto L65
        L1b:
            int r6 = r1.hashCode()     // Catch: java.lang.Throwable -> L8f
            r7 = 3
            switch(r6) {
                case -2123537834: goto L42;
                case 187078296: goto L38;
                case 187078297: goto L2e;
                case 1504578661: goto L24;
                default: goto L23;
            }
        L23:
            goto L4c
        L24:
            java.lang.String r6 = "audio/eac3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = 1
            goto L4d
        L2e:
            java.lang.String r6 = "audio/ac4"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = 3
            goto L4d
        L38:
            java.lang.String r6 = "audio/ac3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = 0
            goto L4d
        L42:
            java.lang.String r6 = "audio/eac3-joc"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = 2
            goto L4d
        L4c:
            r1 = -1
        L4d:
            if (r1 == 0) goto L56
            if (r1 == r2) goto L56
            if (r1 == r3) goto L56
            if (r1 == r7) goto L56
            goto L65
        L56:
            int r1 = com.google.android.gms.internal.ads.zzew.zza     // Catch: java.lang.Throwable -> L8f
            if (r1 < r4) goto L8d
            com.google.android.gms.internal.ads.zzvv r1 = r8.zzh     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L8d
            boolean r1 = r1.zzg()     // Catch: java.lang.Throwable -> L8f
            if (r1 != 0) goto L65
            goto L8d
        L65:
            int r1 = com.google.android.gms.internal.ads.zzew.zza     // Catch: java.lang.Throwable -> L8f
            if (r1 < r4) goto L8c
            com.google.android.gms.internal.ads.zzvv r1 = r8.zzh     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L8c
            boolean r3 = r1.zzg()     // Catch: java.lang.Throwable -> L8f
            if (r3 == 0) goto L8c
            boolean r1 = r1.zze()     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L8c
            com.google.android.gms.internal.ads.zzvv r1 = r8.zzh     // Catch: java.lang.Throwable -> L8f
            boolean r1 = r1.zzf()     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L8c
            com.google.android.gms.internal.ads.zzvv r1 = r8.zzh     // Catch: java.lang.Throwable -> L8f
            com.google.android.gms.internal.ads.zzk r8 = r8.zzi     // Catch: java.lang.Throwable -> L8f
            boolean r8 = r1.zzd(r8, r9)     // Catch: java.lang.Throwable -> L8f
            if (r8 == 0) goto L8c
            goto L8d
        L8c:
            r2 = 0
        L8d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8f
            return r2
        L8f:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8f
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwc.zzk(com.google.android.gms.internal.ads.zzwc, com.google.android.gms.internal.ads.zzaf):boolean");
    }

    protected static boolean zzm(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    private static void zzs(zzur zzurVar, zzcu zzcuVar, Map map) {
        for (int i = 0; i < zzurVar.zzc; i++) {
            if (((zzcr) zzcuVar.zzB.get(zzurVar.zzb(i))) != null) {
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzt() {
        boolean z;
        zzvv zzvvVar;
        synchronized (this.zze) {
            z = false;
            if (this.zzg.zzP && !this.zzf && zzew.zza >= 32 && (zzvvVar = this.zzh) != null && zzvvVar.zzg()) {
                z = true;
            }
        }
        if (z) {
            zzr();
        }
    }

    private static final Pair zzu(int i, zzwg zzwgVar, int[][][] iArr, zzvx zzvxVar, Comparator comparator) {
        RandomAccess randomAccessZzp;
        zzwg zzwgVar2 = zzwgVar;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < 2) {
            if (i == zzwgVar2.zzc(i2)) {
                zzur zzurVarZzd = zzwgVar2.zzd(i2);
                for (int i3 = 0; i3 < zzurVarZzd.zzc; i3++) {
                    zzcp zzcpVarZzb = zzurVarZzd.zzb(i3);
                    List listZza = zzvxVar.zza(i2, zzcpVarZzb, iArr[i2][i3]);
                    int i4 = zzcpVarZzb.zzb;
                    int i5 = 1;
                    boolean[] zArr = new boolean[1];
                    int i6 = 0;
                    while (true) {
                        int i7 = zzcpVarZzb.zzb;
                        if (i6 <= 0) {
                            zzvy zzvyVar = (zzvy) listZza.get(i6);
                            int iZzb = zzvyVar.zzb();
                            if (!zArr[i6] && iZzb != 0) {
                                if (iZzb == i5) {
                                    randomAccessZzp = zzfqk.zzp(zzvyVar);
                                } else {
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.add(zzvyVar);
                                    int i8 = i6 + 1;
                                    while (true) {
                                        int i9 = zzcpVarZzb.zzb;
                                        if (i8 > 0) {
                                            break;
                                        }
                                        zzvy zzvyVar2 = (zzvy) listZza.get(i8);
                                        if (zzvyVar2.zzb() == 2 && zzvyVar.zzc(zzvyVar2)) {
                                            arrayList2.add(zzvyVar2);
                                            zArr[i8] = true;
                                        }
                                        i8++;
                                    }
                                    randomAccessZzp = arrayList2;
                                }
                                arrayList.add(randomAccessZzp);
                            }
                            i6++;
                            i5 = 1;
                        }
                    }
                }
            }
            i2++;
            zzwgVar2 = zzwgVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            iArr2[i10] = ((zzvy) list.get(i10)).zzc;
        }
        zzvy zzvyVar3 = (zzvy) list.get(0);
        return Pair.create(new zzwd(zzvyVar3.zzb, iArr2, 0), Integer.valueOf(zzvyVar3.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    protected final Pair zzb(zzwg zzwgVar, int[][][] iArr, final int[] iArr2, zzss zzssVar, zzcn zzcnVar) throws zzhj {
        final zzvq zzvqVar;
        int i;
        final boolean z;
        int[] iArr3;
        int length;
        zzvv zzvvVar;
        int[][][] iArr4 = iArr;
        synchronized (this.zze) {
            zzvqVar = this.zzg;
            if (zzvqVar.zzP && zzew.zza >= 32 && (zzvvVar = this.zzh) != null) {
                Looper looperMyLooper = Looper.myLooper();
                zzdl.zzb(looperMyLooper);
                zzvvVar.zzb(this, looperMyLooper);
            }
        }
        int i2 = 2;
        zzwd[] zzwdVarArr = new zzwd[2];
        Pair pairZzu = zzu(2, zzwgVar, iArr4, new zzvx() { // from class: com.google.android.gms.internal.ads.zzve
            /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
            @Override // com.google.android.gms.internal.ads.zzvx
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.List zza(int r17, com.google.android.gms.internal.ads.zzcp r18, int[] r19) {
                /*
                    r16 = this;
                    r0 = r16
                    r9 = r18
                    com.google.android.gms.internal.ads.zzvq r10 = r1
                    int[] r1 = r2
                    int r2 = com.google.android.gms.internal.ads.zzwc.zzb
                    r11 = r1[r17]
                    int r1 = r10.zzl
                    int r2 = r10.zzm
                    boolean r3 = r10.zzn
                    r14 = 2147483647(0x7fffffff, float:NaN)
                    if (r1 == r14) goto L82
                    if (r2 != r14) goto L1b
                    goto L85
                L1b:
                    r4 = 0
                    r5 = 2147483647(0x7fffffff, float:NaN)
                L1f:
                    int r6 = r9.zzb
                    if (r4 > 0) goto L80
                    com.google.android.gms.internal.ads.zzaf r6 = r9.zzb(r4)
                    int r7 = r6.zzr
                    if (r7 <= 0) goto L7a
                    int r8 = r6.zzs
                    if (r8 <= 0) goto L7a
                    if (r3 == 0) goto L40
                    if (r7 > r8) goto L35
                    r15 = 0
                    goto L36
                L35:
                    r15 = 1
                L36:
                    if (r1 > r2) goto L3a
                    r12 = 0
                    goto L3b
                L3a:
                    r12 = 1
                L3b:
                    if (r15 == r12) goto L40
                    r12 = r1
                    r15 = r2
                    goto L42
                L40:
                    r15 = r1
                    r12 = r2
                L42:
                    int r13 = r7 * r12
                    int r14 = r8 * r15
                    if (r13 < r14) goto L52
                    android.graphics.Point r8 = new android.graphics.Point
                    int r7 = com.google.android.gms.internal.ads.zzew.zze(r14, r7)
                    r8.<init>(r15, r7)
                    goto L5c
                L52:
                    android.graphics.Point r7 = new android.graphics.Point
                    int r8 = com.google.android.gms.internal.ads.zzew.zze(r13, r8)
                    r7.<init>(r8, r12)
                    r8 = r7
                L5c:
                    int r7 = r6.zzr
                    int r12 = r6.zzs
                    int r12 = r12 * r7
                    int r13 = r8.x
                    float r13 = (float) r13
                    r14 = 1065017672(0x3f7ae148, float:0.98)
                    float r13 = r13 * r14
                    int r13 = (int) r13
                    if (r7 < r13) goto L7a
                    int r6 = r6.zzs
                    int r7 = r8.y
                    float r7 = (float) r7
                    float r7 = r7 * r14
                    int r7 = (int) r7
                    if (r6 < r7) goto L7a
                    if (r12 >= r5) goto L7a
                    r5 = r12
                L7a:
                    int r4 = r4 + 1
                    r14 = 2147483647(0x7fffffff, float:NaN)
                    goto L1f
                L80:
                    r14 = r5
                    goto L85
                L82:
                    r14 = 2147483647(0x7fffffff, float:NaN)
                L85:
                    com.google.android.gms.internal.ads.zzfqh r12 = com.google.android.gms.internal.ads.zzfqk.zzi()
                    r13 = 0
                L8a:
                    int r1 = r9.zzb
                    if (r13 > 0) goto Lba
                    com.google.android.gms.internal.ads.zzaf r1 = r9.zzb(r13)
                    int r1 = r1.zza()
                    r15 = 2147483647(0x7fffffff, float:NaN)
                    if (r14 == r15) goto La3
                    r2 = -1
                    if (r1 == r2) goto La1
                    if (r1 > r14) goto La1
                    goto La3
                La1:
                    r8 = 0
                    goto La4
                La3:
                    r8 = 1
                La4:
                    com.google.android.gms.internal.ads.zzwb r7 = new com.google.android.gms.internal.ads.zzwb
                    r6 = r19[r13]
                    r1 = r7
                    r2 = r17
                    r3 = r18
                    r4 = r13
                    r5 = r10
                    r15 = r7
                    r7 = r11
                    r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                    r12.zzf(r15)
                    int r13 = r13 + 1
                    goto L8a
                Lba:
                    com.google.android.gms.internal.ads.zzfqk r1 = r12.zzi()
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzve.zza(int, com.google.android.gms.internal.ads.zzcp, int[]):java.util.List");
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzvf
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list = (List) obj;
                List list2 = (List) obj2;
                return zzfpz.zzj().zzc((zzwb) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzvz
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzwb.zzd((zzwb) obj3, (zzwb) obj4);
                    }
                }), (zzwb) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzvz
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzwb.zzd((zzwb) obj3, (zzwb) obj4);
                    }
                }), new Comparator() { // from class: com.google.android.gms.internal.ads.zzvz
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzwb.zzd((zzwb) obj3, (zzwb) obj4);
                    }
                }).zzb(list.size(), list2.size()).zzc((zzwb) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzwa
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzwb.zza((zzwb) obj3, (zzwb) obj4);
                    }
                }), (zzwb) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzwa
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzwb.zza((zzwb) obj3, (zzwb) obj4);
                    }
                }), new Comparator() { // from class: com.google.android.gms.internal.ads.zzwa
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzwb.zza((zzwb) obj3, (zzwb) obj4);
                    }
                }).zza();
            }
        });
        if (pairZzu != null) {
            zzwdVarArr[((Integer) pairZzu.second).intValue()] = (zzwd) pairZzu.first;
        }
        int i3 = 0;
        while (true) {
            i = 1;
            if (i3 >= 2) {
                z = false;
                break;
            }
            if (zzwgVar.zzc(i3) == 2 && zzwgVar.zzd(i3).zzc > 0) {
                z = true;
                break;
            }
            i3++;
        }
        Pair pairZzu2 = zzu(1, zzwgVar, iArr4, new zzvx() { // from class: com.google.android.gms.internal.ads.zzvc
            @Override // com.google.android.gms.internal.ads.zzvx
            public final List zza(int i4, zzcp zzcpVar, int[] iArr5) {
                final zzwc zzwcVar = this.zza;
                zzvq zzvqVar2 = zzvqVar;
                boolean z2 = z;
                zzfnv zzfnvVar = new zzfnv() { // from class: com.google.android.gms.internal.ads.zzvb
                    @Override // com.google.android.gms.internal.ads.zzfnv
                    public final boolean zza(Object obj) {
                        return zzwc.zzk(zzwcVar, (zzaf) obj);
                    }
                };
                zzfqh zzfqhVarZzi = zzfqk.zzi();
                int i5 = 0;
                while (true) {
                    int i6 = zzcpVar.zzb;
                    if (i5 > 0) {
                        return zzfqhVarZzi.zzi();
                    }
                    zzfqhVarZzi.zzf(new zzvk(i4, zzcpVar, i5, zzvqVar2, iArr5[i5], z2, zzfnvVar));
                    i5++;
                }
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzvd
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzvk) Collections.max((List) obj)).zza((zzvk) Collections.max((List) obj2));
            }
        });
        if (pairZzu2 != null) {
            zzwdVarArr[((Integer) pairZzu2.second).intValue()] = (zzwd) pairZzu2.first;
        }
        final String str = pairZzu2 == null ? null : ((zzwd) pairZzu2.first).zza.zzb(((zzwd) pairZzu2.first).zzb[0]).zzd;
        int i4 = 3;
        Pair pairZzu3 = zzu(3, zzwgVar, iArr4, new zzvx() { // from class: com.google.android.gms.internal.ads.zzvg
            @Override // com.google.android.gms.internal.ads.zzvx
            public final List zza(int i5, zzcp zzcpVar, int[] iArr5) {
                zzvq zzvqVar2 = zzvqVar;
                String str2 = str;
                int i6 = zzwc.zzb;
                zzfqh zzfqhVarZzi = zzfqk.zzi();
                int i7 = 0;
                while (true) {
                    int i8 = zzcpVar.zzb;
                    if (i7 > 0) {
                        return zzfqhVarZzi.zzi();
                    }
                    zzfqhVarZzi.zzf(new zzvw(i5, zzcpVar, i7, zzvqVar2, iArr5[i7], str2));
                    i7++;
                }
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzvh
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzvw) ((List) obj).get(0)).zza((zzvw) ((List) obj2).get(0));
            }
        });
        if (pairZzu3 != null) {
            zzwdVarArr[((Integer) pairZzu3.second).intValue()] = (zzwd) pairZzu3.first;
        }
        int i5 = 0;
        while (i5 < i2) {
            int iZzc = zzwgVar.zzc(i5);
            if (iZzc != i2 && iZzc != i && iZzc != i4) {
                zzur zzurVarZzd = zzwgVar.zzd(i5);
                int[][] iArr5 = iArr4[i5];
                int i6 = 0;
                zzcp zzcpVar = null;
                int i7 = 0;
                zzvl zzvlVar = null;
                while (i6 < zzurVarZzd.zzc) {
                    zzcp zzcpVarZzb = zzurVarZzd.zzb(i6);
                    int[] iArr6 = iArr5[i6];
                    zzvl zzvlVar2 = zzvlVar;
                    int i8 = 0;
                    while (true) {
                        int i9 = zzcpVarZzb.zzb;
                        if (i8 <= 0) {
                            if (zzm(iArr6[i8], zzvqVar.zzQ)) {
                                zzvl zzvlVar3 = new zzvl(zzcpVarZzb.zzb(i8), iArr6[i8]);
                                if (zzvlVar2 == null || zzvlVar3.compareTo(zzvlVar2) > 0) {
                                    zzvlVar2 = zzvlVar3;
                                    i7 = i8;
                                    zzcpVar = zzcpVarZzb;
                                }
                            }
                            i8++;
                        }
                    }
                    i6++;
                    zzvlVar = zzvlVar2;
                }
                zzwdVarArr[i5] = zzcpVar == null ? null : new zzwd(zzcpVar, new int[]{i7}, 0);
            }
            i5++;
            iArr4 = iArr;
            i2 = 2;
            i = 1;
            i4 = 3;
        }
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < 2; i10++) {
            zzs(zzwgVar.zzd(i10), zzvqVar, map);
        }
        zzs(zzwgVar.zze(), zzvqVar, map);
        for (int i11 = 0; i11 < 2; i11++) {
            if (((zzcr) map.get(Integer.valueOf(zzwgVar.zzc(i11)))) != null) {
                throw null;
            }
        }
        int i12 = 0;
        for (int i13 = 2; i12 < i13; i13 = 2) {
            zzur zzurVarZzd2 = zzwgVar.zzd(i12);
            if (zzvqVar.zzg(i12, zzurVarZzd2)) {
                if (zzvqVar.zze(i12, zzurVarZzd2) != null) {
                    throw null;
                }
                zzwdVarArr[i12] = null;
            }
            i12++;
        }
        int i14 = 0;
        for (int i15 = 2; i14 < i15; i15 = 2) {
            int iZzc2 = zzwgVar.zzc(i14);
            if (zzvqVar.zzf(i14) || zzvqVar.zzC.contains(Integer.valueOf(iZzc2))) {
                zzwdVarArr[i14] = null;
            }
            i14++;
        }
        zzux zzuxVar = this.zzj;
        zzws zzwsVarZzp = zzp();
        zzfqk zzfqkVarZzf = zzuy.zzf(zzwdVarArr);
        int i16 = 2;
        zzwe[] zzweVarArr = new zzwe[2];
        int i17 = 0;
        while (i17 < i16) {
            zzwd zzwdVar = zzwdVarArr[i17];
            if (zzwdVar != null && (length = (iArr3 = zzwdVar.zzb).length) != 0) {
                zzweVarArr[i17] = length == 1 ? new zzwf(zzwdVar.zza, iArr3[0], 0, 0, null) : zzuxVar.zza(zzwdVar.zza, iArr3, 0, zzwsVarZzp, (zzfqk) zzfqkVarZzf.get(i17));
            }
            i17++;
            i16 = 2;
        }
        zzkp[] zzkpVarArr = new zzkp[i16];
        for (int i18 = 0; i18 < i16; i18++) {
            zzkpVarArr[i18] = (zzvqVar.zzf(i18) || zzvqVar.zzC.contains(Integer.valueOf(zzwgVar.zzc(i18))) || (zzwgVar.zzc(i18) != -2 && zzweVarArr[i18] == null)) ? null : zzkp.zza;
        }
        boolean z2 = zzvqVar.zzR;
        return Pair.create(zzkpVarArr, zzweVarArr);
    }

    public final zzvq zzc() {
        zzvq zzvqVar;
        synchronized (this.zze) {
            zzvqVar = this.zzg;
        }
        return zzvqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwk
    public final void zzh() {
        zzvv zzvvVar;
        synchronized (this.zze) {
            if (zzew.zza >= 32 && (zzvvVar = this.zzh) != null) {
                zzvvVar.zzc();
            }
        }
        super.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzwk
    public final void zzi(zzk zzkVar) {
        boolean zEquals;
        synchronized (this.zze) {
            zEquals = this.zzi.equals(zzkVar);
            this.zzi = zzkVar;
        }
        if (zEquals) {
            return;
        }
        zzt();
    }

    public final void zzj(zzvo zzvoVar) {
        boolean zEquals;
        zzvq zzvqVar = new zzvq(zzvoVar);
        synchronized (this.zze) {
            zEquals = this.zzg.equals(zzvqVar);
            this.zzg = zzvqVar;
        }
        if (zEquals) {
            return;
        }
        if (zzvqVar.zzP && this.zza == null) {
            zzee.zze("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzwk
    public final boolean zzl() {
        return true;
    }

    public zzwc(Context context) {
        zzux zzuxVar = new zzux();
        zzvq zzvqVarZzd = zzvq.zzd(context);
        this.zze = new Object();
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzj = zzuxVar;
        this.zzg = zzvqVarZzd;
        this.zzi = zzk.zza;
        boolean z = false;
        if (context != null && zzew.zzY(context)) {
            z = true;
        }
        this.zzf = z;
        if (!z && context != null && zzew.zza >= 32) {
            this.zzh = zzvv.zza(context);
        }
        if (this.zzg.zzP && context == null) {
            zzee.zze("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }
}
