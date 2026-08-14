package com.facebook.ads.redexgen.X;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0405Bz extends X0<C0403Bx, AbstractC0395Bp, GZ> implements VS {
    public static byte[] A01;
    public final String A00;

    static {
        A0J();
    }

    public static String A0I(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 125);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0J() {
        A01 = new byte[]{63, 88, 79, 98, 90, 79, 77, 94, 79, 78, 10, 78, 79, 77, 89, 78, 79, 10, 79, 92, 92, 89, 92};
    }

    public abstract GY A0b(byte[] bArr, int i, boolean z) throws GZ;

    public AbstractC0405Bz(String str) {
        super(new C0403Bx[2], new AbstractC0395Bp[2]);
        this.A00 = str;
        A0Y(1024);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.X0
    /* JADX INFO: renamed from: A0E, reason: merged with bridge method [inline-methods] */
    public final GZ A0W(C0403Bx c0403Bx, AbstractC0395Bp abstractC0395Bp, boolean z) {
        try {
            ByteBuffer byteBuffer = c0403Bx.A01;
            abstractC0395Bp.A09(((X2) c0403Bx).A00, A0b(byteBuffer.array(), byteBuffer.limit(), z), c0403Bx.A00);
            abstractC0395Bp.A01(Integer.MIN_VALUE);
            return null;
        } catch (GZ e) {
            return e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.X0
    /* JADX INFO: renamed from: A0F, reason: merged with bridge method [inline-methods] */
    public final GZ A0X(Throwable th) {
        return new GZ(A0I(0, 23, 109), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.X0
    /* JADX INFO: renamed from: A0G, reason: merged with bridge method [inline-methods] */
    public final C0403Bx A0T() {
        return new C0403Bx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.X0
    /* JADX INFO: renamed from: A0H, reason: merged with bridge method [inline-methods] */
    public final AbstractC0395Bp A0V() {
        return new AbstractC0395Bp(this) { // from class: com.facebook.ads.redexgen.X.34
            public final AbstractC0405Bz A00;

            {
                this.A00 = this;
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC0395Bp
            public final void A08() {
                this.A00.A0a(this);
            }
        };
    }

    @Override // com.facebook.ads.redexgen.X.X0
    /* JADX INFO: renamed from: A0c, reason: merged with bridge method [inline-methods] */
    public final void A0a(AbstractC0395Bp abstractC0395Bp) {
        super.A0a(abstractC0395Bp);
    }

    @Override // com.facebook.ads.redexgen.X.VS
    public final void AEg(long j) {
    }
}
