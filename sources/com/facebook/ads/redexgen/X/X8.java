package com.facebook.ads.redexgen.X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class X8 implements BL {
    public static String[] A06 = {"grqzXl31Ib3CwgbOGLAhXGiUSybb3G6k", "HqCRL2sDmMVhvd9OffyzWNuXpbgyFlqg", "IpTiYMxyYV6xHW6l8ixVEePHdVdY3VZ5", "ZRTEafxouxRK9cmvY3V1KAxZT1cXIFF2", "yUYM5z5ItqNmKdZaBdfrwPcFTl5oQFEz", "Jf72zunVfpVe04eAXULupQi0ZX1Zqvmv", "BX9HD2aywQJTDQtUbY1GrFeREy6of4gh", "vYXD58apfp8PH7rmktr19THixNAKPTAD"};
    public static final int A07 = Float.floatToIntBits(Float.NaN);
    public boolean A05;
    public int A01 = -1;
    public int A00 = -1;
    public int A02 = 0;
    public ByteBuffer A03 = BL.A00;
    public ByteBuffer A04 = BL.A00;

    public static void A00(int i, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i) * 4.656612875245797E-10d));
        if (iFloatToIntBits == A07) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final boolean A47(int i, int i2, int i3) throws BK {
        if (C0567Iz.A0b(i3)) {
            int i4 = this.A01;
            String[] strArr = A06;
            if (strArr[1].charAt(10) != strArr[5].charAt(10)) {
                throw new RuntimeException();
            }
            A06[0] = "leVPKBI8NIDC3IwFclJng7rkdIPGoQ7e";
            if (i4 == i && this.A00 == i2 && this.A02 == i3) {
                return false;
            }
            this.A01 = i;
            this.A00 = i2;
            this.A02 = i3;
            return true;
        }
        throw new BK(i, i2, i3);
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final ByteBuffer A73() {
        ByteBuffer byteBuffer = this.A04;
        this.A04 = BL.A00;
        return byteBuffer;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final int A74() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final int A75() {
        return 4;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final int A76() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final boolean A8N() {
        return C0567Iz.A0b(this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final boolean A8R() {
        return this.A05 && this.A04 == BL.A00;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final void ADU() {
        this.A05 = true;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final void ADV(ByteBuffer byteBuffer) {
        int resampledSize = this.A02 == 1073741824 ? 1 : 0;
        int i = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - i;
        if (resampledSize == 0) {
            int size = i2 / 3;
            i2 = size * 4;
        }
        int iCapacity = this.A03.capacity();
        String[] strArr = A06;
        String str = strArr[1];
        String str2 = strArr[5];
        int limit = str.charAt(10);
        int size2 = str2.charAt(10);
        if (limit != size2) {
            throw new RuntimeException();
        }
        A06[2] = "93WHocDEPVvmBm0SxxEdEuUxxAP6dl6i";
        if (iCapacity < i2) {
            this.A03 = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
        } else {
            this.A03.clear();
        }
        if (resampledSize != 0) {
            while (i < iLimit) {
                int size3 = byteBuffer.get(i);
                int limit2 = size3 & 255;
                int size4 = i + 1;
                int limit3 = limit2 | ((byteBuffer.get(size4) & 255) << 8);
                int size5 = i + 2;
                int limit4 = limit3 | ((byteBuffer.get(size5) & 255) << 16);
                int size6 = i + 3;
                A00(limit4 | ((byteBuffer.get(size6) & 255) << 24), this.A03);
                i += 4;
            }
        } else {
            while (i < iLimit) {
                int size7 = byteBuffer.get(i);
                int limit5 = (size7 & 255) << 8;
                int size8 = i + 1;
                int limit6 = limit5 | ((byteBuffer.get(size8) & 255) << 16);
                int size9 = i + 2;
                A00(limit6 | ((byteBuffer.get(size9) & 255) << 24), this.A03);
                i += 3;
            }
        }
        int size10 = byteBuffer.limit();
        byteBuffer.position(size10);
        this.A03.flip();
        this.A04 = this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final void flush() {
        this.A04 = BL.A00;
        this.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final void reset() {
        flush();
        this.A01 = -1;
        this.A00 = -1;
        this.A02 = 0;
        this.A03 = BL.A00;
    }
}
