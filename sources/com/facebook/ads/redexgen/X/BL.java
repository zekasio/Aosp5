package com.facebook.ads.redexgen.X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: assets/audience_network.dex */
public interface BL {
    public static final ByteBuffer A00 = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    boolean A47(int i, int i2, int i3) throws BK;

    ByteBuffer A73();

    int A74();

    int A75();

    int A76();

    boolean A8N();

    boolean A8R();

    void ADU();

    void ADV(ByteBuffer byteBuffer);

    void flush();

    void reset();
}
