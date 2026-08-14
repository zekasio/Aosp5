package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class X2 extends AbstractC0397Br {
    public static byte[] A04;
    public static String[] A05 = {"lad6HsSclbl4dZDgQUFPExkrVOZGbBbt", "SIXs2t4gpO1y8YpGDjIkTcYgpW4txOh9", "J4xv1tZlROXtlQfBvf", "Vit3QJU8KhVxHeAvFw7AC39hHkOGUjqR", "SdJnKD", "maUTKVCtTGu9SCIdpkB20zc8NImZ3", "MkM5N8IIfSuQKXHZSl", "IZ8I6ziCCzlMiM6m18QQFiHeFHTPFC3Q"};
    public long A00;
    public ByteBuffer A01;
    public final C0400Bu A02 = new C0400Bu();
    public final int A03;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 47);
            if (A05[4].length() != 6) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[3] = "YTCVgJhGT8sTtw3iZqMIkhaJ84PG0kbZ";
            strArr[0] = "KTsoztq2QL6ABezf53EfN52Eki9G1bvj";
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        byte[] bArr = {-61, -33, -61, 101, -39, Ascii.FF, -3, -3, -4, 9, -73, Ascii.VT, 6, 6, -73, 10, 4, -8, 3, 3, -73, -65};
        if (A05[5].length() == 17) {
            throw new RuntimeException();
        }
        A05[1] = "yHVImQtB2njQIa6Uhu5u0J3QDrhoWJXT";
        A04 = bArr;
    }

    static {
        A05();
    }

    public X2(int i) {
        this.A03 = i;
    }

    public static X2 A02() {
        return new X2(0);
    }

    private ByteBuffer A04(int i) {
        int i2 = this.A03;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.A01;
        throw new IllegalStateException(A03(4, 18, 104) + (byteBuffer == null ? 0 : byteBuffer.capacity()) + A03(0, 3, 116) + i + A03(3, 1, 13));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0397Br
    public final void A07() {
        super.A07();
        ByteBuffer byteBuffer = this.A01;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final void A08() {
        this.A01.flip();
    }

    public final void A09(int position) throws IllegalStateException {
        ByteBuffer byteBuffer = this.A01;
        if (byteBuffer == null) {
            this.A01 = A04(position);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = this.A01.position();
        int requiredCapacity = iPosition + position;
        if (iCapacity >= requiredCapacity) {
            return;
        }
        ByteBuffer byteBufferA04 = A04(requiredCapacity);
        if (iPosition > 0) {
            this.A01.position(0);
            ByteBuffer newData = this.A01;
            newData.limit(iPosition);
            ByteBuffer newData2 = this.A01;
            byteBufferA04.put(newData2);
        }
        this.A01 = byteBufferA04;
        if (A05[4].length() != 6) {
            throw new RuntimeException();
        }
        A05[7] = "NYHeQMJyLqWO5Sg7jyx0ubrJlTId8uis";
    }

    public final boolean A0A() {
        return A06(1073741824);
    }

    public final boolean A0B() {
        return this.A01 == null && this.A03 == 0;
    }
}
