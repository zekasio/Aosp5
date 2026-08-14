package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class Y1 implements C0L {
    public static byte[] A01;
    public static String[] A02 = {"aROWSCJTZ7USEA9NykDAgKPqU9Hz2yMC", "Zqbs868sBagHNlYScp55lXssWh10RIQa", "mbYc5GC1jhCg", "AuzesFDqytnerPl8cSxQvwaSTNgSXgGN", "J34OJh55Zf7CVcps1JZJSO0d6JwePACZ", "sgVYwbqUus7", "7dh0o4NaZc6u8WRc1KGfxvMUmypAWeMQ", "ZE0swazaf"};
    public final /* synthetic */ C0946Xx A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = bArrCopyOfRange[i4];
            if (A02[3].charAt(2) == 'x') {
                throw new RuntimeException();
            }
            A02[0] = "5v5qZEzKm5dZGLy7lyhruzHwv9U4ulwR";
            bArrCopyOfRange[i4] = (byte) ((b ^ i3) ^ 108);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{5, 1, Ascii.CR, Ascii.VT, 9};
    }

    static {
        A01();
    }

    public Y1(C0946Xx c0946Xx) {
        this.A00 = c0946Xx;
    }

    @Override // com.facebook.ads.redexgen.X.C0L
    public final void A8r(Throwable th) {
        this.A00.A06().A8y(A00(0, 5, 0), C03298z.A1d, new AnonymousClass90(th));
    }

    @Override // com.facebook.ads.redexgen.X.C0L
    public final void A92(Throwable th) {
        this.A00.A06().A8y(A00(0, 5, 0), C03298z.A1f, new AnonymousClass90(th));
    }

    @Override // com.facebook.ads.redexgen.X.C0L
    public final void ADf(String str, int i, @Nullable String str2, @Nullable Long l, @Nullable Long l2, AnonymousClass06 anonymousClass06) {
        C7X.A05(this.A00, anonymousClass06.A06, anonymousClass06.A08, anonymousClass06.A09, anonymousClass06.A07, anonymousClass06.A03, i, str2, l, l2, null);
    }

    @Override // com.facebook.ads.redexgen.X.C0L
    public final void ADg(String str, boolean z, AnonymousClass06 anonymousClass06) {
        C7X.A04(this.A00, new C7W(anonymousClass06.A06, anonymousClass06.A08, anonymousClass06.A07, anonymousClass06.A03, str), z);
    }
}
