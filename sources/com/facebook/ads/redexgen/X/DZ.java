package com.facebook.ads.redexgen.X;

import kotlin.UByte;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class DZ {
    public int A00;
    public int A01;
    public final int A02;
    public final byte[] A03;

    public DZ(byte[] bArr) {
        this.A03 = bArr;
        this.A02 = bArr.length;
    }

    private void A00() {
        int i;
        int i2 = this.A01;
        IK.A04(i2 >= 0 && (i2 < (i = this.A02) || (i2 == i && this.A00 == 0)));
    }

    public final int A01() {
        return (this.A01 * 8) + this.A00;
    }

    public final int A02(int bitsRead) {
        int i = this.A01;
        int tempByteOffset = Math.min(bitsRead, 8 - this.A00);
        int i2 = i + 1;
        int i3 = ((this.A03[i] & UByte.MAX_VALUE) >> this.A00) & (255 >> (8 - tempByteOffset));
        while (tempByteOffset < bitsRead) {
            i3 |= (this.A03[i2] & 255) << tempByteOffset;
            tempByteOffset += 8;
            i2++;
        }
        int i4 = i3 & ((-1) >>> (32 - bitsRead));
        A03(bitsRead);
        return i4;
    }

    public final void A03(int i) {
        int i2 = i / 8;
        this.A01 += i2;
        this.A00 += i - (i2 * 8);
        int i3 = this.A00;
        if (i3 > 7) {
            this.A01++;
            this.A00 = i3 - 8;
        }
        A00();
    }

    public final boolean A04() {
        boolean z = (((this.A03[this.A01] & UByte.MAX_VALUE) >> this.A00) & 1) == 1;
        A03(1);
        return z;
    }
}
