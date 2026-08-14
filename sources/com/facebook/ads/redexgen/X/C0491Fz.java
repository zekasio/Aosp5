package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0491Fz extends AbstractC1231dp {
    public static byte[] A02;
    public static final String A03;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 79);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{122, 93, 85, 80, 89, 88, Ascii.FS, 72, 83, Ascii.FS, 83, 76, 89, 82, Ascii.FS, 80, 85, 82, 87, Ascii.FS, 73, 78, 80, 6, Ascii.FS, 43, 46, 41, 44};
    }

    static {
        A01();
        A03 = C0491Fz.class.getSimpleName();
    }

    public C0491Fz(C0947Xy c0947Xy, InterfaceC0575Jh interfaceC0575Jh, String str, Uri uri, Map<String, String> map, @Nullable C01240m c01240m, boolean z) {
        super(c0947Xy, interfaceC0575Jh, str, c01240m, z);
        this.A00 = uri;
        this.A01 = map;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01180f
    @Nullable
    public final EnumC01170e A0A() {
        try {
            LZ.A09(new LZ(), ((AbstractC01180f) this).A00, C0617La.A00(this.A00.getQueryParameter(A00(25, 4, 8))), ((AbstractC01180f) this).A02);
            return null;
        } catch (Exception unused) {
            String str = A00(0, 25, 115) + this.A00.toString();
            return EnumC01170e.A02;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1231dp
    public final void A0D() {
        EnumC01170e enumC01170eA0A = null;
        if (((AbstractC1231dp) this).A02) {
            enumC01170eA0A = A0A();
        }
        A0E(this.A01, enumC01170eA0A);
    }
}
