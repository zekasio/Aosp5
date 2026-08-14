package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.gms.drive.DriveFile;
import com.tapjoy.TapjoyAuctionFlags;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1231dp extends AbstractC01180f {
    public static String A03;
    public static String A04;
    public static String A05;
    public static byte[] A06;
    public static String[] A07 = {TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE, "OJ2IOsbUnCKybSqk53zM3JXcifahO", "e4RldewFXKwYCBzcZ5CwWZ5XjhlRHNiJ", "729G42gqUNiz5ZAUAxRhvFZ2YWMhTd0L", "J1Ql0tv9onNfDvsMKNTgjNyaDa6Pnzub", "9fBm", "mbPUpspz4Nj5AFGqwEe2w9x9WWs", "2uSYGuFAJgr"};
    public final boolean A00;

    @Nullable
    public final C01240m A01;
    public final boolean A02;

    public static String A0A(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 30);
            if (A07[3].charAt(0) != '7') {
                throw new RuntimeException();
            }
            A07[5] = "PWjD";
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        A06 = new byte[]{93, 114, 119, 125, 117, 62, 114, 113, 121, 121, 123, 122, 68, 75, 65, 87, 74, 76, 65, Ascii.VT, 76, 75, 81, 64, 75, 81, Ascii.VT, 68, 70, 81, 76, 74, 75, Ascii.VT, 115, 108, 96, 114, Ascii.CAN, Ascii.ESC, Ascii.EM, 17, 37, Ascii.SO, 19, Ascii.ETB, Ascii.US, 46, 39, 35, 52, 39, Ascii.GS, 54, 43, 47, 39, Ascii.VT, 17, Ascii.DLE, 7, Ascii.VT, 9, 1, 37, 35, 53, 53, 51, 37, 37, 76, 87, 80, 79, 92, 75, 74, 88, 85, 102, 85, 80, 87, 82, 89, 95, 73, 94, 115, 88, 94, 77, 79, 71, 73, 94, 115, 69, 95, 115, 66, 67, 88, 115, 66, 89, 64, 64, 75, 93, 72, 95, 84, 99, 93, 82, 88, 99, 94, 78, 83, 75, 79, 89};
    }

    public abstract void A0D();

    static {
        A0B();
        A03 = A0A(64, 7, 72);
        A04 = A0A(85, 24, 50);
        A05 = A0A(109, 16, 34);
    }

    public AbstractC1231dp(C0947Xy c0947Xy, InterfaceC0575Jh interfaceC0575Jh, String str, @Nullable C01240m c01240m, boolean z) {
        this(c0947Xy, interfaceC0575Jh, str, c01240m, z, false);
    }

    public AbstractC1231dp(C0947Xy c0947Xy, InterfaceC0575Jh interfaceC0575Jh, String str, @Nullable C01240m c01240m, boolean z, boolean z2) {
        super(c0947Xy, interfaceC0575Jh, str);
        this.A01 = c01240m;
        this.A02 = z;
        this.A00 = z2;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01180f
    public final void A0C() {
        C01240m c01240m = this.A01;
        if (c01240m != null) {
            c01240m.A07(super.A02);
        }
        A0D();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0E(java.util.Map<java.lang.String, java.lang.String> r8, @androidx.annotation.Nullable com.facebook.ads.redexgen.X.EnumC01170e r9) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AbstractC1231dp.A0E(java.util.Map, com.facebook.ads.redexgen.X.0e):void");
    }

    public final boolean A0F(Uri uri) {
        try {
            String queryParameter = uri.getQueryParameter(A0A(71, 14, 39));
            if (TextUtils.isEmpty(queryParameter)) {
                return false;
            }
            Intent intent = new Intent(A0A(12, 26, 59), C0617La.A00(queryParameter));
            intent.addFlags(DriveFile.MODE_READ_ONLY);
            if (Build.VERSION.SDK_INT >= 30) {
                intent.addFlags(1024);
            }
            return LN.A0B(super.A00, intent);
        } catch (LL unused) {
            return false;
        }
    }
}
