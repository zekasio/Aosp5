package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.net.Uri;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@TargetApi(14)
public final class C0751Qg {
    public static byte[] A02;
    public static String[] A03 = {"WzijvlAd9RP1HJzMxCKzeYHnMs2QP54v", "kfrqpsiELz0FvZTPYg", "hAwPDz", "OryCsPOoCbEZ1Kjw18", "JoqBI6chV", "rfkFyJ13DXugB3RLj6H", "rQvj", "kthZXjW83"};
    public final C0436Ds A00;
    public final V8 A01 = new V8();

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 10);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-114, -104, -116, -114, -49, -51, -31, -33, -47, -114, -116, -90, -116, -114, -96, -86, -98, -96, -16, -29, -20, -30, -29, -16, -29, -16, -57, -20, -30, -29, -10, -96, -98, -72, -98, -96, -114, -23, 111, 114, -127, -68, 99, -75, -70, -79, -90, 99, 97, 123, 97, 99};
    }

    static {
        A02();
    }

    public C0751Qg(C0947Xy c0947Xy) {
        this.A00 = AO.A00(new XI(c0947Xy), new C0390Bk(new VF(this.A01)), new XK());
    }

    @VisibleForTesting
    public static String A01(AM am) {
        return A00(41, 11, 55) + am.A01 + A00(14, 22, 116) + am.A00 + A00(0, 14, 98) + am.getCause() + A00(36, 2, 98);
    }

    public static boolean A03() {
        if (A03[0].charAt(3) == 'z') {
            throw new RuntimeException();
        }
        A03[6] = "p35x";
        return true;
    }

    public final int A04() {
        return this.A00.A0J();
    }

    public final int A05() {
        return this.A00.A5r();
    }

    public final long A06() {
        return this.A00.A6F();
    }

    public final long A07() {
        return this.A00.A6R();
    }

    @Nullable
    public final C0749Qe A08() {
        Format formatA0L = this.A00.A0L();
        if (formatA0L == null) {
            return null;
        }
        return new C0749Qe(formatA0L.A0F, formatA0L.A08);
    }

    public final void A09() {
        this.A00.ADm();
    }

    public final void A0A() {
        this.A00.AEO();
    }

    public final void A0B() {
        this.A00.A0M();
    }

    public final void A0C(float f) {
        this.A00.A0N(f);
    }

    public final void A0D(long j) {
        this.A00.AEN(j);
    }

    public final void A0E(@Nullable Surface surface) {
        this.A00.A0O(surface);
    }

    public final void A0F(C0946Xx c0946Xx, Uri uri) {
        if (JR.A26(c0946Xx, A03())) {
            VY vy = new VY(C0755Qk.A05(c0946Xx).A0F(c0946Xx));
            String customCacheKey = C0755Qk.A08(c0946Xx, uri);
            if (customCacheKey != null) {
                vy.A00(customCacheKey);
            }
            this.A00.A0P(vy.A01(uri));
            return;
        }
        this.A00.A0P(new VY(new V6(c0946Xx, C0567Iz.A0K(c0946Xx, A00(38, 3, 4)), this.A01)).A01(uri));
    }

    public final void A0G(InterfaceC0748Qd interfaceC0748Qd) {
        this.A00.A3E(new II(this, interfaceC0748Qd));
    }

    public final void A0H(InterfaceC0750Qf interfaceC0750Qf) {
        this.A00.A0Q(new IJ(this, interfaceC0750Qf));
    }

    public final void A0I(boolean z) {
        this.A00.AEe(z);
    }

    public final boolean A0J() {
        return this.A00.A7D();
    }

    public final boolean A0K() {
        return this.A00.A0K() != null;
    }
}
