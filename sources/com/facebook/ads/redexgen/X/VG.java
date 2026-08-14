package com.facebook.ads.redexgen.X;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class VG implements GY {
    public static byte[] A04;
    public final int A00;
    public final List<VH> A01;
    public final long[] A02;
    public final long[] A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 125);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{5};
    }

    public VG(List<VH> list) {
        this.A01 = list;
        this.A00 = list.size();
        this.A02 = new long[this.A00 * 2];
        for (int i = 0; i < this.A00; i++) {
            VH vh = list.get(i);
            int i2 = i * 2;
            this.A02[i2] = vh.A01;
            this.A02[i2 + 1] = vh.A00;
        }
        long[] jArr = this.A02;
        this.A03 = Arrays.copyOf(jArr, jArr.length);
        Arrays.sort(this.A03);
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final List<GX> A6B(long j) {
        ArrayList arrayList = null;
        VH cue = null;
        SpannableStringBuilder normalCueTextBuilder = null;
        for (int i = 0; i < this.A00; i++) {
            long[] jArr = this.A02;
            if (jArr[i * 2] <= j && j < jArr[(i * 2) + 1]) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                VH vh = this.A01.get(i);
                if (vh.A00()) {
                    if (cue == null) {
                        cue = vh;
                    } else {
                        String strA00 = A00(0, 1, 126);
                        if (normalCueTextBuilder == null) {
                            normalCueTextBuilder = new SpannableStringBuilder();
                            normalCueTextBuilder.append(cue.A0C).append((CharSequence) strA00).append(vh.A0C);
                        } else {
                            normalCueTextBuilder.append((CharSequence) strA00).append(vh.A0C);
                        }
                    }
                } else {
                    arrayList.add(vh);
                }
            }
        }
        if (normalCueTextBuilder != null) {
            arrayList.add(new VH(normalCueTextBuilder));
        } else if (cue != null) {
            arrayList.add(cue);
        }
        if (arrayList != null) {
            return arrayList;
        }
        return Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final long A6b(int i) {
        boolean z = true;
        IK.A03(i >= 0);
        if (i >= this.A03.length) {
            z = false;
        }
        IK.A03(z);
        return this.A03[i];
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final int A6c() {
        return this.A03.length;
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final int A70(long j) {
        int iA0A = C0567Iz.A0A(this.A03, j, false, false);
        if (iA0A < this.A03.length) {
            return iA0A;
        }
        return -1;
    }
}
