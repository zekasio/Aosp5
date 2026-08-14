package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Iu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0562Iu {
    public static String[] A07 = {"v8bLZp59B3s5kjImuBjcCmNW", "l5XLQfXbQh6R34DBcL2a2gRDiWiOWq7j", "cKC0Gfnr6KNVk9zoAEVguSpqajRxhGsy", "4MzGZFDG0CqgMdioIrH5vwyzFGAbThRu", "MvXRt7wPeDxEfDCDFesb3zWoJZhNCkxf", "mCnVL7G0HMRU3KziMebPW175T1XCPvkW", "oyPZ3wFE5cpoHVmJFEQQrP2WxUjSMaR1", "eOuchRPwSpgwlWmZThUBhEapR1FbTYXS"};
    public static final Comparator<C0561It> A08 = new C0559Ir();
    public static final Comparator<C0561It> A09 = new C0560Is();
    public int A01;
    public int A02;
    public int A03;
    public final int A04;
    public final C0561It[] A06 = new C0561It[5];
    public final ArrayList<C0561It> A05 = new ArrayList<>();
    public int A00 = -1;

    public C0562Iu(int i) {
        this.A04 = i;
    }

    private void A00() {
        if (this.A00 != 1) {
            Collections.sort(this.A05, A08);
            this.A00 = 1;
        }
    }

    private void A01() {
        if (this.A00 != 0) {
            Collections.sort(this.A05, A09);
            this.A00 = 0;
        }
    }

    public final float A02(float f) {
        A01();
        float f2 = this.A03 * f;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList<C0561It> arrayList = this.A05;
            if (A07[7].charAt(12) != 'l') {
                throw new RuntimeException();
            }
            A07[1] = "MYxxtSQw2w0IEM5GsYZTgS2IPhbXFMQD";
            int i3 = arrayList.size();
            if (i2 < i3) {
                C0561It c0561It = this.A05.get(i2);
                int i4 = c0561It.A02;
                i += i4;
                if (i >= f2) {
                    return c0561It.A00;
                }
                i2++;
            } else {
                if (this.A05.isEmpty()) {
                    return Float.NaN;
                }
                return this.A05.get(r1.size() - 1).A00;
            }
        }
    }

    public final void A03(int i, float f) {
        C0561It c0561It;
        A00();
        int i2 = this.A02;
        if (i2 > 0) {
            C0561It[] c0561ItArr = this.A06;
            int i3 = i2 - 1;
            this.A02 = i3;
            c0561It = c0561ItArr[i3];
        } else {
            c0561It = new C0561It(null);
        }
        int i4 = this.A01;
        this.A01 = i4 + 1;
        c0561It.A01 = i4;
        if (A07[6].charAt(29) != 'a') {
            throw new RuntimeException();
        }
        A07[0] = "5E26ZSMWQoSDuNI0YD8YDk9y";
        c0561It.A02 = i;
        c0561It.A00 = f;
        this.A05.add(c0561It);
        this.A03 += i;
        while (true) {
            int i5 = this.A03;
            int i6 = this.A04;
            if (i5 > i6) {
                int i7 = i5 - i6;
                C0561It c0561It2 = this.A05.get(0);
                if (c0561It2.A02 <= i7) {
                    this.A03 -= c0561It2.A02;
                    this.A05.remove(0);
                    int i8 = this.A02;
                    if (i8 < 5) {
                        C0561It[] c0561ItArr2 = this.A06;
                        if (A07[6].charAt(29) != 'a') {
                            this.A02 = i8 + 1;
                            c0561ItArr2[i8] = c0561It2;
                        } else {
                            A07[0] = "NjEm8Wq6Ir4EIF9DQvkt7JHV";
                            this.A02 = i8 + 1;
                            c0561ItArr2[i8] = c0561It2;
                        }
                    }
                } else {
                    c0561It2.A02 -= i7;
                    this.A03 -= i7;
                }
            } else {
                return;
            }
        }
    }
}
