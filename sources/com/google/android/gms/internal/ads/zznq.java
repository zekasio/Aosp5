package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zznq {
    public static final zznq zza = new zznq(new int[]{2}, 8);
    private static final zznq zzb = new zznq(new int[]{2, 5, 6}, 8);
    private static final zzfqn zzc;
    private final int[] zzd;
    private final int zze;

    static {
        zzfqm zzfqmVar = new zzfqm();
        zzfqmVar.zza(5, 6);
        zzfqmVar.zza(17, 6);
        zzfqmVar.zza(7, 6);
        zzfqmVar.zza(18, 6);
        zzfqmVar.zza(6, 8);
        zzfqmVar.zza(8, 8);
        zzfqmVar.zza(14, 8);
        zzc = zzfqmVar.zzc();
    }

    public zznq(int[] iArr, int i) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        this.zzd = iArrCopyOf;
        Arrays.sort(iArrCopyOf);
        this.zze = 8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zznq)) {
            return false;
        }
        zznq zznqVar = (zznq) obj;
        if (!Arrays.equals(this.zzd, zznqVar.zzd)) {
            return false;
        }
        int i = zznqVar.zze;
        return true;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.zzd) * 31) + 8;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=8, supportedEncodings=" + Arrays.toString(this.zzd) + "]";
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair zza(com.google.android.gms.internal.ads.zzaf r10) {
        /*
            r9 = this;
            java.lang.String r0 = r10.zzm
            r0.getClass()
            java.lang.String r1 = r10.zzj
            int r0 = com.google.android.gms.internal.ads.zzbt.zza(r0, r1)
            com.google.android.gms.internal.ads.zzfqn r1 = com.google.android.gms.internal.ads.zznq.zzc
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r2 = r1.containsKey(r2)
            r3 = 0
            if (r2 != 0) goto L19
            return r3
        L19:
            r2 = 7
            r4 = 6
            r5 = 8
            r6 = 18
            if (r0 != r6) goto L2b
            boolean r0 = r9.zzc(r6)
            if (r0 != 0) goto L29
            r0 = 6
            goto L34
        L29:
            r0 = 18
        L2b:
            if (r0 != r5) goto L34
            boolean r7 = r9.zzc(r5)
            if (r7 != 0) goto L34
            r0 = 7
        L34:
            boolean r7 = r9.zzc(r0)
            if (r7 != 0) goto L3b
            return r3
        L3b:
            int r7 = r10.zzz
            r8 = -1
            if (r7 == r8) goto L46
            if (r0 != r6) goto L43
            goto L46
        L43:
            if (r7 <= r5) goto L6e
            return r3
        L46:
            int r10 = r10.zzA
            if (r10 != r8) goto L4d
            r10 = 48000(0xbb80, float:6.7262E-41)
        L4d:
            int r6 = com.google.android.gms.internal.ads.zzew.zza
            r7 = 29
            if (r6 < r7) goto L58
            int r7 = com.google.android.gms.internal.ads.zznp.zza(r0, r10)
            goto L6e
        L58:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r6 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r10 = r1.getOrDefault(r10, r6)
            java.lang.Integer r10 = (java.lang.Integer) r10
            r10.getClass()
            int r7 = r10.intValue()
        L6e:
            int r10 = com.google.android.gms.internal.ads.zzew.zza
            r1 = 28
            if (r10 > r1) goto L83
            if (r7 != r2) goto L79
            r4 = 8
            goto L84
        L79:
            r10 = 3
            if (r7 == r10) goto L84
            r10 = 4
            if (r7 == r10) goto L84
            r10 = 5
            if (r7 != r10) goto L83
            goto L84
        L83:
            r4 = r7
        L84:
            int r10 = com.google.android.gms.internal.ads.zzew.zza
            r1 = 26
            if (r10 > r1) goto L98
            java.lang.String r10 = "fugu"
            java.lang.String r1 = com.google.android.gms.internal.ads.zzew.zzb
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L98
            r10 = 1
            if (r4 != r10) goto L98
            r4 = 2
        L98:
            int r10 = com.google.android.gms.internal.ads.zzew.zzj(r4)
            if (r10 != 0) goto L9f
            return r3
        L9f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            android.util.Pair r10 = android.util.Pair.create(r0, r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zznq.zza(com.google.android.gms.internal.ads.zzaf):android.util.Pair");
    }

    public final boolean zzc(int i) {
        return Arrays.binarySearch(this.zzd, i) >= 0;
    }
}
