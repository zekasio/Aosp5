package com.facebook.ads.redexgen.X;

import android.util.Pair;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;
import java.util.Collections;
import kotlin.UByte;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class W9 implements InterfaceC0426Di {
    public static byte[] A0D;
    public static String[] A0E = {"YsqY7Lk0NG7yMwVwuR3aCKQ1vCFnnoD7", "imTBT5eeu9SEESxnKVa9Th5", "O0aT", "zBRiiCG0AgE79WafkQACjpG1QDeKkcp1", "wwjqIDfPN4cSDtn9coCmQZMwbPpUFodD", "uPTa", "JD3sFkMXr2jLKKNxvTNpqQokakbynhd6", "fAZgloKcDeiXibtKpEsUxRbbQwdcutNH"};
    public static final double[] A0F;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public InterfaceC0417Co A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final boolean[] A0C = new boolean[4];
    public final C0427Dj A0B = new C0427Dj(128);

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A0E[1].length() != 23) {
                throw new RuntimeException();
            }
            A0E[4] = "Ri5OGo1CF8gLgqNPBzhcn52enWrdUOS9";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 59);
            i4++;
        }
    }

    public static void A02() {
        A0D = new byte[]{-2, -15, -20, -19, -9, -73, -11, -8, -19, -17, -70};
    }

    static {
        A02();
        A0F = new double[]{23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    }

    public static Pair<Format, Long> A00(C0427Dj c0427Dj, String str) {
        byte[] bArrCopyOf = Arrays.copyOf(c0427Dj.A02, c0427Dj.A00);
        int i = bArrCopyOf[4] & UByte.MAX_VALUE;
        int i2 = bArrCopyOf[5] & UByte.MAX_VALUE;
        int firstByte = bArrCopyOf[6] & UByte.MAX_VALUE;
        int aspectRatioCode = (i << 4) | (i2 >> 4);
        int width = i2 & 15;
        int i3 = (width << 8) | firstByte;
        float f = 1.0f;
        int i4 = (bArrCopyOf[7] & 240) >> 4;
        if (i4 != 2) {
            String[] strArr = A0E;
            String str2 = strArr[2];
            String str3 = strArr[5];
            int firstByte2 = str2.length();
            if (firstByte2 == str3.length()) {
                String[] strArr2 = A0E;
                strArr2[3] = "HgbrGKSiwbnHfsjka25a0ZgViwBErbAQ";
                strArr2[6] = "kgfZHtVXJwuxNbqkZAemlWCJOmm9Ylqd";
                if (i4 != 3) {
                    if (i4 == 4) {
                        int frameRateExtensionN = i3 * 121;
                        float f2 = frameRateExtensionN;
                        int frameRateExtensionN2 = aspectRatioCode * 100;
                        f = f2 / frameRateExtensionN2;
                    }
                } else {
                    int frameRateExtensionN3 = i3 * 16;
                    float f3 = frameRateExtensionN3;
                    int frameRateExtensionN4 = aspectRatioCode * 9;
                    f = f3 / frameRateExtensionN4;
                }
            }
            throw new RuntimeException();
        }
        float pixelWidthHeightRatio = aspectRatioCode * 3;
        f = (i3 * 4) / pixelWidthHeightRatio;
        Format formatA03 = Format.A03(str, A01(0, 11, 77), null, -1, -1, aspectRatioCode, i3, -1.0f, Collections.singletonList(bArrCopyOf), -1, f, null);
        long j = 0;
        int i5 = (bArrCopyOf[7] & Ascii.SI) - 1;
        if (i5 >= 0) {
            double[] dArr = A0F;
            int frameRateCodeMinusOne = dArr.length;
            if (i5 < frameRateCodeMinusOne) {
                double d = dArr[i5];
                int i6 = c0427Dj.A01;
                int sequenceExtensionPosition = i6 + 9;
                int i7 = (bArrCopyOf[sequenceExtensionPosition] & 96) >> 5;
                int i8 = i6 + 9;
                if (A0E[1].length() == 23) {
                    A0E[1] = "JkGh2MRG0HwgK9dbH7jOqv6";
                    int height = bArrCopyOf[i8] & Ascii.US;
                    if (i7 != height) {
                        double frameRate = i7;
                        int firstByte3 = height + 1;
                        d *= (frameRate + 1.0d) / ((double) firstByte3);
                    }
                    j = (long) (1000000.0d / d);
                }
                throw new RuntimeException();
            }
        }
        return Pair.create(formatA03, Long.valueOf(j));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0143 A[PHI: r4
      0x0143: PHI (r4v4 long) = (r4v3 long), (r4v7 long) binds: [B:51:0x0140, B:44:0x0122] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0426Di
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A48(com.facebook.ads.redexgen.X.C0551Ij r22) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.W9.A48(com.facebook.ads.redexgen.X.Ij):void");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0426Di
    public final void A4V(InterfaceC0409Ce interfaceC0409Ce, C0440Dw c0440Dw) {
        c0440Dw.A05();
        this.A06 = c0440Dw.A04();
        this.A05 = interfaceC0409Ce.AFD(c0440Dw.A03(), 2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0426Di
    public final void AD3() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0426Di
    public final void AD4(long j, boolean z) {
        this.A01 = j;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0426Di
    public final void AEK() {
        C0547If.A0B(this.A0C);
        this.A0B.A00();
        this.A04 = 0L;
        this.A0A = false;
    }
}
