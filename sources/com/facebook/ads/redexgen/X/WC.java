package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WC implements InterfaceC0439Dv {
    public static byte[] A02;
    public static String[] A03 = {"ggGLmhyInJSffjkfPU8VRn", "WisLA7DCjwWBxH7MqLlw8w9Z4gicIVYK", "baeaQjGS5RYnakDSUMD4HiL2ABi7hiKM", "QvfNkpkg0VH", "dkSLNeeU5ck3Twa6KyaCdOuwvlu7l8iW", "e6Ade", "C9ShSy7zMtGRXyHgR8PAzFWulvZi4KLP", "w2lskP6GH6NJyN70rzATNYjf2L9mjjHA"};
    public final int A00;
    public final List<Format> A01;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 6);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-120, -105, -105, -109, -112, -118, -120, -101, -112, -106, -107, 86, -118, -116, -120, 84, 93, 87, 95, -114, -99, -99, -103, -106, -112, -114, -95, -106, -100, -101, 92, -112, -110, -114, 90, 100, 93, 101};
    }

    static {
        A02();
    }

    public WC() {
        this(0);
    }

    public WC(int i) {
        this(i, Collections.emptyList());
    }

    public WC(int i, List<Format> list) {
        this.A00 = i;
        if (!A03(32) && list.isEmpty()) {
            list = Collections.singletonList(Format.A00(null, A01(0, 19, 33), 0, null));
        }
        this.A01 = list;
    }

    private C0435Dr A00(C0438Du c0438Du) {
        String strA01;
        int i;
        if (A03(32)) {
            return new C0435Dr(this.A01);
        }
        C0551Ij c0551Ij = new C0551Ij(c0438Du.A03);
        List<Format> arrayList = this.A01;
        while (true) {
            int iA04 = c0551Ij.A04();
            String[] strArr = A03;
            if (strArr[3].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[6] = "9wGqNU4xey1NmHgGithGb88lbeAMl0Qa";
            strArr2[5] = "Me3yU";
            if (iA04 > 0) {
                int descriptorLength = c0551Ij.A0E();
                int descriptorTag = c0551Ij.A0E();
                int iA06 = c0551Ij.A06() + descriptorTag;
                if (descriptorLength == 134) {
                    arrayList = new ArrayList<>();
                    int nextDescriptorPosition = c0551Ij.A0E();
                    int i2 = nextDescriptorPosition & 31;
                    for (int accessibilityChannel = 0; accessibilityChannel < i2; accessibilityChannel++) {
                        String strA0S = c0551Ij.A0S(3);
                        int iA0E = c0551Ij.A0E();
                        int captionTypeByte = iA0E & 128;
                        int captionTypeByte2 = captionTypeByte != 0 ? 1 : 0;
                        if (captionTypeByte2 != 0) {
                            strA01 = A01(19, 19, 39);
                            i = iA0E & 63;
                        } else {
                            strA01 = A01(0, 19, 33);
                            i = 1;
                        }
                        arrayList.add(Format.A08(null, strA01, null, -1, 0, strA0S, i, null));
                        c0551Ij.A0Z(2);
                    }
                }
                c0551Ij.A0Y(iA06);
            } else {
                return new C0435Dr(arrayList);
            }
        }
    }

    private boolean A03(int i) {
        return (this.A00 & i) != 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0439Dv
    public final SparseArray<InterfaceC0441Dx> A4K() {
        return new SparseArray<>();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0439Dv
    public final InterfaceC0441Dx A4P(int i, C0438Du c0438Du) {
        if (i == 2) {
            return new W3(new W9());
        }
        if (i == 3 || i == 4) {
            return new W3(new W4(c0438Du.A01));
        }
        if (i == 15) {
            if (A03(2)) {
                return null;
            }
            return new W3(new WD(false, c0438Du.A01));
        }
        if (i == 17) {
            if (A03(2)) {
                return null;
            }
            return new W3(new W5(c0438Du.A01));
        }
        if (i == 21) {
            return new W3(new W6());
        }
        if (i == 27) {
            if (A03(4)) {
                return null;
            }
            return new W3(new W8(A00(c0438Du), A03(1), A03(8)));
        }
        if (i == 36) {
            return new W3(new W7(A00(c0438Du)));
        }
        if (i != 89) {
            if (i != 138) {
                if (i != 129) {
                    if (i != 130) {
                        if (A03[7].charAt(7) != 'G') {
                            throw new RuntimeException();
                        }
                        A03[2] = "XLjLYE0qXOuIs9WeBuWhNfn9nKSLWrdd";
                        if (i == 134) {
                            if (A03(16)) {
                                return null;
                            }
                            return new W0(new C0896Vz());
                        }
                        if (i != 135) {
                            return null;
                        }
                    }
                }
                return new W3(new WG(c0438Du.A01));
            }
            return new W3(new WB(c0438Du.A01));
        }
        return new W3(new WA(c0438Du.A02));
    }
}
