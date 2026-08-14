package com.applovin.exoplayer2.b;

import com.applovin.exoplayer2.b.f;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
final class m extends l {
    private int[] d;
    private int[] e;

    m() {
    }

    public void a(int[] iArr) {
        this.d = iArr;
    }

    @Override // com.applovin.exoplayer2.b.l
    public f.a b(f.a aVar) throws f.b {
        int[] iArr = this.d;
        if (iArr == null) {
            return f.a.f65a;
        }
        if (aVar.d != 2) {
            throw new f.b(aVar);
        }
        boolean z = aVar.c != iArr.length;
        int i = 0;
        while (i < iArr.length) {
            int i2 = iArr[i];
            if (i2 >= aVar.c) {
                throw new f.b(aVar);
            }
            z |= i2 != i;
            i++;
        }
        if (z) {
            return new f.a(aVar.b, iArr.length, 2);
        }
        return f.a.f65a;
    }

    @Override // com.applovin.exoplayer2.b.f
    public void a(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) com.applovin.exoplayer2.l.a.b(this.e);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferA = a(((iLimit - iPosition) / this.b.e) * this.c.e);
        while (iPosition < iLimit) {
            for (int i : iArr) {
                byteBufferA.putShort(byteBuffer.getShort((i * 2) + iPosition));
            }
            iPosition += this.b.e;
        }
        byteBuffer.position(iLimit);
        byteBufferA.flip();
    }

    @Override // com.applovin.exoplayer2.b.l
    protected void i() {
        this.e = this.d;
    }

    @Override // com.applovin.exoplayer2.b.l
    protected void j() {
        this.e = null;
        this.d = null;
    }
}
