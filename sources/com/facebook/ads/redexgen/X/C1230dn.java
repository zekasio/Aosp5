package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1230dn extends AbstractC01180f {
    public static byte[] A01;
    public static final String A02;
    public final Uri A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 1);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{88, 115, 123, 126, 119, 118, 50, -122, -127, 50, -127, -126, 119, ByteCompanionObject.MIN_VALUE, 50, 126, 123, ByteCompanionObject.MIN_VALUE, 125, 50, -121, -124, 126, 76, 50};
    }

    static {
        A01();
        A02 = C1230dn.class.getSimpleName();
    }

    public C1230dn(C0947Xy c0947Xy, InterfaceC0575Jh interfaceC0575Jh, String str, Uri uri) {
        super(c0947Xy, interfaceC0575Jh, str);
        this.A00 = uri;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01180f
    public final void A0C() {
        try {
            LZ.A0A(new LZ(), super.A00, this.A00, this.A02);
        } catch (Exception unused) {
            String str = A00(0, 25, 17) + this.A00.toString();
        }
    }
}
