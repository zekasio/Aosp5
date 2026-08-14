package com.applovin.exoplayer2.b;

import com.applovin.exoplayer2.b.f;
import com.applovin.exoplayer2.l.ai;
import java.nio.ByteBuffer;
import kotlin.UByte;

/* JADX INFO: loaded from: classes.dex */
final class p extends l {
    private static final int d = Float.floatToIntBits(Float.NaN);

    p() {
    }

    @Override // com.applovin.exoplayer2.b.l
    public f.a b(f.a aVar) throws f.b {
        int i = aVar.d;
        if (!ai.e(i)) {
            throw new f.b(aVar);
        }
        if (i != 4) {
            return new f.a(aVar.b, aVar.c, 4);
        }
        return f.a.f65a;
    }

    @Override // com.applovin.exoplayer2.b.f
    public void a(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferA;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.b.d;
        if (i2 == 536870912) {
            byteBufferA = a((i / 3) * 4);
            while (iPosition < iLimit) {
                a(((byteBuffer.get(iPosition) & UByte.MAX_VALUE) << 8) | ((byteBuffer.get(iPosition + 1) & UByte.MAX_VALUE) << 16) | ((byteBuffer.get(iPosition + 2) & UByte.MAX_VALUE) << 24), byteBufferA);
                iPosition += 3;
            }
        } else if (i2 == 805306368) {
            byteBufferA = a(i);
            while (iPosition < iLimit) {
                a((byteBuffer.get(iPosition) & UByte.MAX_VALUE) | ((byteBuffer.get(iPosition + 1) & UByte.MAX_VALUE) << 8) | ((byteBuffer.get(iPosition + 2) & UByte.MAX_VALUE) << 16) | ((byteBuffer.get(iPosition + 3) & UByte.MAX_VALUE) << 24), byteBufferA);
                iPosition += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferA.flip();
    }

    private static void a(int i, ByteBuffer byteBuffer) {
        double d2 = i;
        Double.isNaN(d2);
        int iFloatToIntBits = Float.floatToIntBits((float) (d2 * 4.656612875245797E-10d));
        if (iFloatToIntBits == d) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }
}
