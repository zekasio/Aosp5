package com.facebook.ads.redexgen.X;

import android.graphics.Point;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.source.TrackGroup;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$Parameters;
import com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0390Bk extends VD {
    public static byte[] A02;
    public static String[] A03 = {"1W0E1A", "gmqFy6ZQaP5ka1WITOse6lKCqSKhRNov", "yPEYbIXQTZij2dUvfHyn6qa5Z66I89l5", "Xhoxo0MeXbgag07m9diWTgmUhgioDUlF", "BIkkp", "x2Y7ova5yP2MY4Z3NAONKiEwX", "ON8", "BctZyAj3hw00k98sEs0CoZ2k5"};
    public static final int[] A04;

    @Nullable
    public final HP A00;
    public final AtomicReference<DefaultTrackSelector$Parameters> A01;

    public static String A0C(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 92);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0E() {
        if (A03[6].length() != 3) {
            throw new RuntimeException();
        }
        A03[6] = "oTI";
        A02 = new byte[]{-26, -33, -43};
    }

    static {
        A0E();
        A04 = new int[0];
    }

    public C0390Bk() {
        this((HP) null);
    }

    public C0390Bk(@Nullable HP hp) {
        this.A00 = hp;
        this.A01 = new AtomicReference<>(DefaultTrackSelector$Parameters.A0J);
    }

    public static int A00(int i, int i2) {
        if (i == -1) {
            return i2 == -1 ? 0 : -1;
        }
        if (i2 == -1) {
            return 1;
        }
        return i - i2;
    }

    public static int A01(int i, int i2) {
        if (i > i2) {
            return 1;
        }
        return i2 > i ? -1 : 0;
    }

    public static int A03(TrackGroup trackGroup, int[] iArr, int i, @Nullable String str, int i2, int i3, int i4, List<Integer> list) {
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            Integer num = list.get(i6);
            if (A03[2].charAt(31) == 'o') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[7] = "3Iv8b3o73oRbqkF65Z5c5dFgz";
            strArr[5] = "e7BsWd0zc9qEfvrmMSkcTfHGf";
            int iIntValue = num.intValue();
            if (A0L(trackGroup.A01(iIntValue), str, iArr[iIntValue], i, i2, i3, i4)) {
                i5++;
            }
        }
        return i5;
    }

    public static int A04(TrackGroup trackGroup, int[] iArr, HG hg) {
        int i = 0;
        for (int i2 = 0; i2 < trackGroup.A01; i2++) {
            if (A0J(trackGroup.A01(i2), iArr[i2], hg)) {
                i++;
            }
        }
        return i;
    }

    public static Point A05(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            if ((i3 > i4) != (i > i2)) {
                i = i2;
                i2 = i;
            }
        }
        int tempViewportWidth = i3 * i2;
        int i5 = i4 * i;
        if (A03[2].charAt(31) == 'o') {
            throw new RuntimeException();
        }
        A03[6] = "nfw";
        if (tempViewportWidth >= i5) {
            return new Point(i, C0567Iz.A04(i * i4, i3));
        }
        return new Point(C0567Iz.A04(i2 * i3, i4), i2);
    }

    @Nullable
    private final HQ A06(int i, TrackGroupArray trackGroupArray, int[][] iArr, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) throws AM {
        TrackGroup trackGroup = null;
        int trackIndex = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = trackGroupArray.A01;
            if (A03[3].charAt(2) == 'E') {
                throw new RuntimeException();
            }
            A03[3] = "VerUiBJDpf251zcJKkmQW7r5SVlKN9oM";
            if (i3 < i4) {
                TrackGroup trackGroupA01 = trackGroupArray.A01(i3);
                int[] iArr2 = iArr[i3];
                for (int i5 = 0; i5 < trackGroupA01.A01; i5++) {
                    if (A0H(iArr2[i5], defaultTrackSelector$Parameters.A0B)) {
                        int i6 = (trackGroupA01.A01(i5).A0D & 1) != 0 ? 2 : 1;
                        if (A0H(iArr2[i5], false)) {
                            i6 += 1000;
                        }
                        if (i6 > i2) {
                            trackGroup = trackGroupA01;
                            trackIndex = i5;
                            i2 = i6;
                        }
                    }
                }
                i3++;
            } else {
                if (trackGroup == null) {
                    return null;
                }
                return new C0383Bd(trackGroup, trackIndex);
            }
        }
    }

    @Nullable
    public static HQ A07(TrackGroupArray trackGroupArray, int[][] iArr, int requiredAdaptiveSupport, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, HP hp) throws AM {
        int i;
        if (defaultTrackSelector$Parameters.A0A) {
            i = 24;
        } else {
            i = 16;
        }
        boolean z = defaultTrackSelector$Parameters.A09 && (requiredAdaptiveSupport & i) != 0;
        for (int i2 = 0; i2 < trackGroupArray.A01; i2++) {
            TrackGroup trackGroupA01 = trackGroupArray.A01(i2);
            int[] iArrA0O = A0O(trackGroupA01, iArr[i2], z, i, defaultTrackSelector$Parameters.A03, defaultTrackSelector$Parameters.A02, defaultTrackSelector$Parameters.A01, defaultTrackSelector$Parameters.A06, defaultTrackSelector$Parameters.A05, defaultTrackSelector$Parameters.A0F);
            if (iArrA0O.length > 0) {
                return ((HP) IK.A01(hp)).A4U(trackGroupA01, iArrA0O);
            }
        }
        return null;
    }

    @Nullable
    private final HQ A08(TrackGroupArray trackGroupArray, int[][] iArr, int i, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, @Nullable HP hp) throws AM {
        int trackIndex = -1;
        int i2 = -1;
        HH trackScore = null;
        for (int i3 = 0; i3 < trackGroupArray.A01; i3++) {
            TrackGroup trackGroupA01 = trackGroupArray.A01(i3);
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < trackGroupA01.A01; i4++) {
                if (A0H(iArr2[i4], defaultTrackSelector$Parameters.A0B)) {
                    HH hh = new HH(trackGroupA01.A01(i4), defaultTrackSelector$Parameters, iArr2[i4]);
                    if (trackScore == null || hh.A00(trackScore) > 0) {
                        i2 = i3;
                        trackIndex = i4;
                        trackScore = hh;
                    }
                }
            }
        }
        if (i2 == -1) {
            return null;
        }
        TrackGroup trackGroupA012 = trackGroupArray.A01(i2);
        if (!defaultTrackSelector$Parameters.A0D && hp != null) {
            int[] iArrA0N = A0N(trackGroupA012, iArr[i2], defaultTrackSelector$Parameters.A09);
            if (iArrA0N.length > 0) {
                return hp.A4U(trackGroupA012, iArrA0N);
            }
        }
        return new C0383Bd(trackGroupA012, trackIndex);
    }

    @Nullable
    private final HQ A09(TrackGroupArray trackGroupArray, int[][] iArr, int i, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, @Nullable HP hp) throws AM {
        HQ hqA07 = null;
        if (!defaultTrackSelector$Parameters.A0D && hp != null) {
            hqA07 = A07(trackGroupArray, iArr, i, defaultTrackSelector$Parameters, hp);
        }
        if (hqA07 == null) {
            return A0A(trackGroupArray, iArr, defaultTrackSelector$Parameters);
        }
        return hqA07;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        if (r1 <= r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
    
        if (r3 <= r2) goto L26;
     */
    /* JADX WARN: Incorrect condition in loop: B:7:0x0021 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00cf A[SYNTHETIC] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.HQ A0A(com.facebook.ads.internal.exoplayer2.source.TrackGroupArray r19, int[][] r20, com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$Parameters r21) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0390Bk.A0A(com.facebook.ads.internal.exoplayer2.source.TrackGroupArray, int[][], com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$Parameters):com.facebook.ads.redexgen.X.HQ");
    }

    @Nullable
    private final HQ A0B(TrackGroupArray trackGroupArray, int[][] iArr, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) throws AM {
        int i;
        int i2;
        TrackGroup trackGroup = null;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < trackGroupArray.A01; i5++) {
            TrackGroup trackGroupA01 = trackGroupArray.A01(i5);
            int[] iArr2 = iArr[i5];
            for (int i6 = 0; i6 < trackGroupA01.A01; i6++) {
                if (A0H(iArr2[i6], defaultTrackSelector$Parameters.A0B)) {
                    Format formatA01 = trackGroupA01.A01(i6);
                    int i7 = formatA01.A0D & (defaultTrackSelector$Parameters.A00 ^ (-1));
                    boolean z = (i7 & 1) != 0;
                    boolean z2 = (i7 & 2) != 0;
                    boolean zA0K = A0K(formatA01, defaultTrackSelector$Parameters.A08);
                    if (zA0K || (defaultTrackSelector$Parameters.A0E && A0I(formatA01))) {
                        if (z) {
                            i = 8;
                        } else if (!z2) {
                            i = 6;
                        } else {
                            i = 4;
                        }
                        i2 = i + (zA0K ? 1 : 0);
                    } else if (z) {
                        i2 = 3;
                    } else if (!z2) {
                        continue;
                    } else if (A0K(formatA01, defaultTrackSelector$Parameters.A07)) {
                        i2 = 2;
                    } else {
                        i2 = 1;
                    }
                    if (A0H(iArr2[i6], false)) {
                        i2 += 1000;
                    }
                    if (i2 > i4) {
                        trackGroup = trackGroupA01;
                        i3 = i6;
                        if (A03[6].length() != 3) {
                            throw new RuntimeException();
                        }
                        A03[2] = "ytO6VNlSXI4nyu5127ZVkMBSWij4cMOM";
                        i4 = i2;
                    } else {
                        continue;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new C0383Bd(trackGroup, i3);
    }

    public static List<Integer> A0D(TrackGroup trackGroup, int i, int maxVideoPixelsToRetain, boolean z) {
        ArrayList arrayList = new ArrayList(trackGroup.A01);
        for (int i2 = 0; i2 < trackGroup.A01; i2++) {
            arrayList.add(Integer.valueOf(i2));
        }
        if (i == Integer.MAX_VALUE || maxVideoPixelsToRetain == Integer.MAX_VALUE) {
            return arrayList;
        }
        int i3 = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < trackGroup.A01; i4++) {
            Format formatA01 = trackGroup.A01(i4);
            if (formatA01.A0F > 0) {
                int i5 = formatA01.A08;
                if (A03[3].charAt(2) == 'E') {
                    throw new RuntimeException();
                }
                A03[2] = "kSz4FX5ZHsEkHeXGD1Cn3cbmsF2hLdtD";
                if (i5 > 0) {
                    Point pointA05 = A05(z, i, maxVideoPixelsToRetain, formatA01.A0F, formatA01.A08);
                    int i6 = formatA01.A0F * formatA01.A08;
                    int videoPixels = formatA01.A0F;
                    if (videoPixels >= ((int) (pointA05.x * 0.98f))) {
                        int videoPixels2 = formatA01.A08;
                        if (videoPixels2 >= ((int) (pointA05.y * 0.98f)) && i6 < i3) {
                            i3 = i6;
                        }
                    }
                }
            }
        }
        if (i3 != Integer.MAX_VALUE) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                int iA0E = trackGroup.A01(((Integer) arrayList.get(size)).intValue()).A0E();
                if (iA0E == -1 || iA0E > i3) {
                    arrayList.remove(size);
                }
            }
        }
        return arrayList;
    }

    public static void A0F(TrackGroup trackGroup, int[] iArr, int trackIndex, @Nullable String str, int i, int i2, int i3, List<Integer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int iIntValue = list.get(size).intValue();
            if (!A0L(trackGroup.A01(iIntValue), str, iArr[iIntValue], trackIndex, i, i2, i3)) {
                list.remove(size);
            }
        }
    }

    public static void A0G(HO ho, int[][][] iArr, C0376Av[] c0376AvArr, HQ[] hqArr, int rendererType) {
        if (rendererType == 0) {
            return;
        }
        int i = -1;
        int i2 = -1;
        if (A03[1].charAt(3) != 'F') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[4] = "rTjwD";
        strArr[0] = "uX38vm";
        boolean z = true;
        int i3 = 0;
        while (true) {
            if (i3 >= ho.A00()) {
                break;
            }
            int iA01 = ho.A01(i3);
            HQ hq = hqArr[i3];
            if ((iA01 == 1 || iA01 == 2) && hq != null && A0M(iArr[i3], ho.A02(i3), hq)) {
                if (iA01 == 1) {
                    if (i != -1) {
                        z = false;
                        break;
                    }
                    i = i3;
                } else {
                    if (i2 != -1) {
                        z = false;
                        break;
                    }
                    i2 = i3;
                }
            }
            i3++;
        }
        boolean z2 = z & ((i == -1 || i2 == -1) ? false : true);
        if (A03[3].charAt(2) != 'E') {
            String[] strArr2 = A03;
            strArr2[4] = "aY4hR";
            strArr2[0] = "2v7HMH";
            if (!z2) {
                return;
            }
        } else if (!z2) {
            return;
        }
        C0376Av c0376Av = new C0376Av(rendererType);
        c0376AvArr[i] = c0376Av;
        c0376AvArr[i2] = c0376Av;
    }

    public static boolean A0H(int i, boolean z) {
        int maskedSupport = i & 7;
        return maskedSupport == 4 || (z && maskedSupport == 3);
    }

    public static boolean A0I(Format format) {
        return TextUtils.isEmpty(format.A0N) || A0K(format, A0C(0, 3, 21));
    }

    public static boolean A0J(Format format, int i, HG hg) {
        if (A0H(i, false) && format.A05 == hg.A00 && format.A0C == hg.A01) {
            return hg.A02 == null || TextUtils.equals(hg.A02, format.A0O);
        }
        return false;
    }

    public static boolean A0K(Format format, @Nullable String str) {
        return str != null && TextUtils.equals(str, C0567Iz.A0L(format.A0N));
    }

    public static boolean A0L(Format format, @Nullable String str, int i, int i2, int i3, int i4, int i5) {
        if (!A0H(i, false) || (i & i2) == 0) {
            return false;
        }
        if (str != null && !C0567Iz.A0g(format.A0O, str)) {
            return false;
        }
        if (format.A0F != -1 && format.A0F > i3) {
            return false;
        }
        if (format.A08 != -1 && format.A08 > i4) {
            return false;
        }
        if (format.A04 != -1) {
            int i6 = format.A04;
            if (A03[2].charAt(31) == 'o') {
                throw new RuntimeException();
            }
            A03[2] = "FNCbzyr7QyRP3SA06TqNXuxS80zpa9Bi";
            if (i6 > i5) {
                return false;
            }
        }
        return true;
    }

    public static boolean A0M(int[][] iArr, TrackGroupArray trackGroupArray, HQ hq) {
        if (hq == null) {
            return false;
        }
        int iA00 = trackGroupArray.A00(hq.A7g());
        if (A03[2].charAt(31) == 'o') {
            throw new RuntimeException();
        }
        A03[1] = "tyUFTMgWRFIbU9oMa0yVOFtav5LFL8C4";
        for (int i = 0; i < hq.length(); i++) {
            if ((iArr[iA00][hq.A6n(i)] & 32) != 32) {
                return false;
            }
        }
        if (A03[2].charAt(31) != 'o') {
            String[] strArr = A03;
            strArr[4] = "AvWfp";
            strArr[0] = "jnm8oH";
            return true;
        }
        A03[3] = "hBflC2WcQfSqXI4XtpzFNLmvHBtesKLi";
        return true;
    }

    public static int[] A0N(TrackGroup trackGroup, int[] iArr, boolean z) {
        int iA04;
        int i = 0;
        HG hg = null;
        HashSet hashSet = new HashSet();
        int configurationCount = 0;
        while (true) {
            if (configurationCount < trackGroup.A01) {
                Format formatA01 = trackGroup.A01(configurationCount);
                HG hg2 = new HG(formatA01.A05, formatA01.A0C, z ? null : formatA01.A0O);
                String[] strArr = A03;
                if (strArr[4].length() == strArr[0].length()) {
                    break;
                }
                A03[6] = "SWl";
                if (hashSet.add(hg2) && (iA04 = A04(trackGroup, iArr, hg2)) > i) {
                    hg = hg2;
                    i = iA04;
                }
                configurationCount++;
            } else if (i > 1) {
                int[] adaptiveIndices = new int[i];
                if (A03[1].charAt(3) == 'F') {
                    A03[2] = "ndqJYBN4kzCrcISGfJ6gLQAVvTseYRAq";
                    int index = 0;
                    for (int i2 = 0; i2 < trackGroup.A01; i2++) {
                        if (A0J(trackGroup.A01(i2), iArr[i2], (HG) IK.A01(hg))) {
                            adaptiveIndices[index] = i2;
                            index++;
                        }
                    }
                    return adaptiveIndices;
                }
            } else {
                return A04;
            }
        }
        throw new RuntimeException();
    }

    public static int[] A0O(TrackGroup trackGroup, int[] iArr, boolean z, int i, int i2, int i3, int trackIndex, int i4, int i5, boolean z2) {
        int iA03;
        if (trackGroup.A01 >= 2) {
            List<Integer> listA0D = A0D(trackGroup, i4, i5, z2);
            if (listA0D.size() < 2) {
                return A04;
            }
            String str = null;
            if (!z) {
                HashSet hashSet = new HashSet();
                int i6 = 0;
                for (int selectedMimeTypeTrackCount = 0; selectedMimeTypeTrackCount < listA0D.size(); selectedMimeTypeTrackCount++) {
                    String str2 = trackGroup.A01(listA0D.get(selectedMimeTypeTrackCount).intValue()).A0O;
                    if (hashSet.add(str2) && (iA03 = A03(trackGroup, iArr, i, str2, i2, i3, trackIndex, listA0D)) > i6) {
                        if (A03[3].charAt(2) == 'E') {
                            throw new RuntimeException();
                        }
                        String[] strArr = A03;
                        strArr[7] = "YYn4Z0UW1tJYYEwj5MQ7L1Rhi";
                        strArr[5] = "BvRHCOG0R11gnbm1vcetrlVSM";
                        str = str2;
                        i6 = iA03;
                    }
                }
            }
            A0F(trackGroup, iArr, i, str, i2, i3, trackIndex, listA0D);
            return listA0D.size() < 2 ? A04 : C0567Iz.A0j(listA0D);
        }
        return A04;
    }

    private final HQ[] A0P(HO ho, int[][][] iArr, int[] iArr2, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) throws AM {
        boolean z;
        int iA00 = ho.A00();
        HQ[] hqArr = new HQ[iA00];
        boolean seenVideoRendererWithMappedTracks = false;
        int i = 0;
        for (int i2 = 0; i2 < iA00; i2++) {
            int iA01 = ho.A01(i2);
            if (A03[2].charAt(31) == 'o') {
                throw new RuntimeException();
            }
            A03[2] = "HeTTodjeOHNf6YJV3Oi2xZW4zDR7myJi";
            if (2 == iA01) {
                if (i == 0) {
                    z = true;
                    hqArr[i2] = A09(ho.A02(i2), iArr[i2], iArr2[i2], defaultTrackSelector$Parameters, this.A00);
                    i = hqArr[i2] != null ? 1 : 0;
                } else {
                    z = true;
                }
                if (ho.A02(i2).A01 <= 0) {
                    z = false;
                }
                seenVideoRendererWithMappedTracks |= z;
            }
        }
        boolean z2 = false;
        int i3 = 0;
        if (A03[3].charAt(2) == 'E') {
            throw new RuntimeException();
        }
        A03[2] = "aVwUyHxCeGesw16VUIJPDtFnHPxsnnXC";
        for (int i4 = 0; i4 < iA00; i4++) {
            int iA012 = ho.A01(i4);
            if (iA012 != 1) {
                if (iA012 != 2) {
                    if (iA012 != 3) {
                        hqArr[i4] = A06(iA012, ho.A02(i4), iArr[i4], defaultTrackSelector$Parameters);
                    } else if (i3 == 0) {
                        hqArr[i4] = A0B(ho.A02(i4), iArr[i4], defaultTrackSelector$Parameters);
                        i3 = hqArr[i4] != null ? 1 : 0;
                    }
                }
            } else if (!z2) {
                hqArr[i4] = A08(ho.A02(i4), iArr[i4], iArr2[i4], defaultTrackSelector$Parameters, seenVideoRendererWithMappedTracks ? null : this.A00);
                z2 = hqArr[i4] != null;
            }
        }
        return hqArr;
    }

    @Override // com.facebook.ads.redexgen.X.VD
    public final Pair<C0376Av[], HQ[]> A0V(HO ho, int[][][] iArr, int[] iArr2) throws AM {
        DefaultTrackSelector$Parameters defaultTrackSelector$Parameters = this.A01.get();
        int i = ho.A00();
        HQ[] hqArrA0P = A0P(ho, iArr, iArr2, defaultTrackSelector$Parameters);
        for (int i2 = 0; i2 < i; i2++) {
            if (defaultTrackSelector$Parameters.A06(i2)) {
                hqArrA0P[i2] = null;
            } else {
                TrackGroupArray trackGroupArrayA02 = ho.A02(i2);
                if (defaultTrackSelector$Parameters.A07(i2, trackGroupArrayA02)) {
                    DefaultTrackSelector$SelectionOverride defaultTrackSelector$SelectionOverrideA05 = defaultTrackSelector$Parameters.A05(i2, trackGroupArrayA02);
                    if (defaultTrackSelector$SelectionOverrideA05 == null) {
                        hqArrA0P[i2] = null;
                    } else if (defaultTrackSelector$SelectionOverrideA05.A01 == 1) {
                        hqArrA0P[i2] = new C0383Bd(trackGroupArrayA02.A01(defaultTrackSelector$SelectionOverrideA05.A00), defaultTrackSelector$SelectionOverrideA05.A02[0]);
                    } else {
                        hqArrA0P[i2] = ((HP) IK.A01(this.A00)).A4U(trackGroupArrayA02.A01(defaultTrackSelector$SelectionOverrideA05.A00), defaultTrackSelector$SelectionOverrideA05.A02);
                    }
                }
            }
        }
        C0376Av[] c0376AvArr = new C0376Av[i];
        for (int i3 = 0; i3 < i; i3++) {
            c0376AvArr[i3] = !defaultTrackSelector$Parameters.A06(i3) && (ho.A01(i3) == 5 || hqArrA0P[i3] != null) ? C0376Av.A01 : null;
        }
        A0G(ho, iArr, c0376AvArr, hqArrA0P, defaultTrackSelector$Parameters.A04);
        return Pair.create(c0376AvArr, hqArrA0P);
    }
}
