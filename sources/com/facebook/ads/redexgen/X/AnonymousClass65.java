package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.65, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass65 {
    public static boolean A04;
    public static byte[] A05;
    public static final String A06;
    public final AnonymousClass66 A00;
    public final AnonymousClass67 A01;
    public final C0946Xx A02;
    public final RR A03;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 114);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{46, 56, 19, 41, 52, 56, 62, 45, 63};
    }

    static {
        A01();
        A06 = AnonymousClass65.class.getSimpleName();
    }

    public AnonymousClass65(C0946Xx c0946Xx, GU gu, AnonymousClass66 anonymousClass66, AnonymousClass67 anonymousClass67) {
        this.A02 = c0946Xx;
        this.A03 = gu.A4O(RS.A06);
        this.A00 = anonymousClass66;
        this.A01 = anonymousClass67;
        this.A03.A3F(new C1080bH(this));
        A02();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A02() {
        if (L0.A02(this)) {
            return;
        }
        try {
            if (!this.A03.A8c()) {
                this.A02.A03().A8P();
                return;
            }
            String strOptString = this.A03.A6J().optString(A00(0, 9, 62));
            if (!TextUtils.isEmpty(strOptString)) {
                this.A00.A04(this.A02, strOptString);
                if (!A04 || JR.A0g(this.A02)) {
                    A04 = true;
                    this.A01.A07();
                }
            }
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
