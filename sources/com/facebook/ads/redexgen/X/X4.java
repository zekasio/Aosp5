package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class X4 implements BL {
    public static String[] A0D = {"iVI49d2ZLsEdnN", "8nt9Mx90pYcLgm8jwIqfRxnuNB", "N5EnT7xPV04alRStuSSEb4qxGw0ypgBS", "CZFk7KMkAj1VPwfzqXgnV4RMFN6v0v1b", "0r4SPeKqFHrxpG", "Bbc1ECWkbstPDX5EGN6JJHjdPo9FJmAx", "C6RSY0Y2UTdbfyI9HBBCvYbiYc", "niyGYsc3TbIZXUeN92sM43TjCNQsZLKY"};
    public long A06;
    public long A07;

    @Nullable
    public C0396Bq A08;
    public boolean A0C;
    public float A01 = 1.0f;
    public float A00 = 1.0f;
    public int A02 = -1;
    public int A05 = -1;
    public int A03 = -1;
    public ByteBuffer A09 = BL.A00;
    public ShortBuffer A0B = this.A09.asShortBuffer();
    public ByteBuffer A0A = BL.A00;
    public int A04 = -1;

    public final float A00(float f) {
        float fA00 = C0567Iz.A00(f, 0.1f, 8.0f);
        if (this.A00 != fA00) {
            this.A00 = fA00;
            this.A08 = null;
        }
        flush();
        return fA00;
    }

    public final float A01(float f) {
        float fA00 = C0567Iz.A00(f, 0.1f, 8.0f);
        if (this.A01 != fA00) {
            this.A01 = fA00;
            this.A08 = null;
        }
        flush();
        return fA00;
    }

    public final long A02(long j) {
        long j2 = this.A07;
        if (j2 >= 1024) {
            int i = this.A03;
            int i2 = this.A05;
            if (i == i2) {
                return C0567Iz.A0F(j, this.A06, j2);
            }
            return C0567Iz.A0F(j, this.A06 * ((long) i), j2 * ((long) i2));
        }
        return (long) (((double) this.A01) * j);
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final boolean A47(int i, int i2, int i3) throws BK {
        if (i3 == 2) {
            int i4 = this.A04;
            if (i4 == -1) {
                i4 = i;
            }
            if (this.A05 == i && this.A02 == i2 && this.A03 == i4) {
                return false;
            }
            this.A05 = i;
            this.A02 = i2;
            this.A03 = i4;
            this.A08 = null;
            return true;
        }
        throw new BK(i, i2, i3);
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final ByteBuffer A73() {
        ByteBuffer byteBuffer = this.A0A;
        this.A0A = BL.A00;
        return byteBuffer;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final int A74() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final int A75() {
        return 2;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final int A76() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final boolean A8N() {
        if (this.A05 != -1) {
            if (Math.abs(this.A01 - 1.0f) < 0.01f) {
                float fAbs = Math.abs(this.A00 - 1.0f);
                String[] strArr = A0D;
                if (strArr[6].length() != strArr[1].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0D;
                strArr2[4] = "vE55EECrsMoThx";
                strArr2[0] = "BaJHYxULwHsid1";
                if (fAbs >= 0.01f || this.A03 != this.A05) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final boolean A8R() {
        C0396Bq c0396Bq;
        return this.A0C && ((c0396Bq = this.A08) == null || c0396Bq.A0H() == 0);
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final void ADU() {
        IK.A04(this.A08 != null);
        this.A08.A0J();
        this.A0C = true;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final void ADV(ByteBuffer byteBuffer) {
        IK.A04(this.A08 != null);
        if (byteBuffer.hasRemaining()) {
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.A06 += (long) iRemaining;
            this.A08.A0L(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
        int iA0H = this.A08.A0H() * this.A02 * 2;
        if (iA0H > 0) {
            if (this.A09.capacity() < iA0H) {
                this.A09 = ByteBuffer.allocateDirect(iA0H).order(ByteOrder.nativeOrder());
                this.A0B = this.A09.asShortBuffer();
            } else {
                this.A09.clear();
                this.A0B.clear();
            }
            this.A08.A0K(this.A0B);
            this.A07 += (long) iA0H;
            this.A09.limit(iA0H);
            this.A0A = this.A09;
        }
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final void flush() {
        if (A8N()) {
            C0396Bq c0396Bq = this.A08;
            if (c0396Bq == null) {
                this.A08 = new C0396Bq(this.A05, this.A02, this.A01, this.A00, this.A03);
            } else {
                c0396Bq.A0I();
            }
        }
        this.A0A = BL.A00;
        this.A06 = 0L;
        this.A07 = 0L;
        this.A0C = false;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final void reset() {
        this.A01 = 1.0f;
        this.A00 = 1.0f;
        this.A02 = -1;
        this.A05 = -1;
        this.A03 = -1;
        this.A09 = BL.A00;
        this.A0B = this.A09.asShortBuffer();
        this.A0A = BL.A00;
        this.A04 = -1;
        this.A08 = null;
        this.A06 = 0L;
        this.A07 = 0L;
        this.A0C = false;
    }
}
