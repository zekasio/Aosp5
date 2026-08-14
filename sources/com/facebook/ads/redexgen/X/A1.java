package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.facebook.ads.internal.view.dynamiclayout.DynamicWebViewController$AdFormatType;
import com.google.android.gms.drive.DriveFile;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: assets/audience_network.dex */
@SuppressLint({"ViewConstructor"})
public final class A1 extends FrameLayout implements SW {
    public static byte[] A0A;
    public static String[] A0B = {"gR8VXB3ia", "OJTiurBFiCqcREvzh7o4PkhSqDGudpIq", "iaBHwIBC1utH6CwOSIC2yyAu4ZYXfJ61", "YdU4", "YcTfP9iPeB3iMp", "vsmHP1kkKyGC9kag", "2EZKw0n31g6TC4", "KAWIkc2sX"};
    public C0767Qw A00;

    @DynamicWebViewController$AdFormatType
    public final int A01;
    public final AnonymousClass18 A02;
    public final C0947Xy A03;
    public final InterfaceC0575Jh A04;
    public final MK A05;
    public final InterfaceC0718Oz A06;
    public final PA A07;
    public final String A08;
    public final boolean A09;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 113);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{118, 84, 91, Ascii.DC2, 65, Ascii.NAK, 70, 65, 84, 71, 65, Ascii.NAK, 116, 64, 81, 92, 80, 91, 86, 80, 123, 80, 65, 66, 90, 71, 94, 116, 86, 65, 92, 67, 92, 65, 76, Ascii.ESC, Ascii.NAK, 120, 84, 94, 80, Ascii.NAK, 70, 64, 71, 80, Ascii.NAK, 65, 93, 84, 65, Ascii.NAK, 92, 65, Ascii.DC2, 70, Ascii.NAK, 92, 91, Ascii.NAK, 76, 90, 64, 71, Ascii.NAK, 116, 91, 81, 71, 90, 92, 81, 120, 84, 91, 92, 83, 80, 70, 65, Ascii.ESC, 77, 88, 89, Ascii.NAK, 83, 92, 89, 80, Ascii.ESC, Ascii.RS, Ascii.SUB, Ascii.EM, 45, 60, 49, 61, 54, 59, 61, Ascii.SYN, 61, 44, 47, 55, 42, 51, 54, 57, 8, 54, 52, 35, 62, 33, 62, 35, 46, 64, 79, 90, 71, 88, 75, 111, 74, 106, 79, 90, 79, 108, 91, 64, 74, 66, 75, 47, 48, 60, 46, Ascii.CR, 32, 41, 60};
    }

    static {
        A02();
    }

    public A1(C0947Xy c0947Xy, InterfaceC0575Jh interfaceC0575Jh, AnonymousClass18 anonymousClass18, String str, @DynamicWebViewController$AdFormatType int i) {
        this(c0947Xy, interfaceC0575Jh, null, anonymousClass18, str, i, null);
    }

    public A1(C0947Xy c0947Xy, InterfaceC0575Jh interfaceC0575Jh, InterfaceC0718Oz interfaceC0718Oz, AnonymousClass18 anonymousClass18, String str, @DynamicWebViewController$AdFormatType int i, MK mk) {
        super(c0947Xy);
        this.A03 = c0947Xy;
        this.A04 = interfaceC0575Jh;
        this.A02 = anonymousClass18;
        this.A08 = str;
        this.A06 = interfaceC0718Oz;
        this.A01 = i;
        if (this.A01 == 3) {
            this.A07 = new PA(this.A03, anonymousClass18, interfaceC0575Jh, i);
            this.A09 = false;
        } else {
            PA paA02 = PB.A02(anonymousClass18.A0Z());
            if (paA02 != null) {
                this.A07 = paA02;
                this.A09 = true;
            } else {
                this.A07 = new PA(this.A03, anonymousClass18, interfaceC0575Jh, i);
                PB.A03(anonymousClass18, this.A07);
                this.A09 = false;
            }
        }
        if (mk != null) {
            this.A05 = mk;
            this.A07.A0Z(mk);
        } else {
            this.A05 = this.A07.A0L();
        }
        this.A07.A0c(new C0800Sd(this));
        this.A07.A0a(interfaceC0718Oz);
        EnumC0637Lw.A04(this, EnumC0637Lw.A0A);
        if (JR.A1I(c0947Xy)) {
            c0947Xy.A09().AFR(this.A07.A0O(), anonymousClass18.A0U(), false, false, true);
        }
        A04();
    }

    private final void A03() {
        this.A07.A0d(this);
        if (!this.A09) {
            this.A03.A0D().A4w();
            this.A07.A0X();
        } else {
            this.A03.A0D().A4x();
            String[] strArr = A0B;
            if (strArr[6].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[6] = "EW3rEVX7vA8fzU";
            strArr2[4] = "ztAtYR2DvpL08d";
            if (this.A07.A0k()) {
                if (this.A01 == 4) {
                    InterfaceC0718Oz interfaceC0718Oz = this.A06;
                    if (interfaceC0718Oz != null) {
                        interfaceC0718Oz.AAf(this);
                    }
                    if (JR.A1I(this.A03)) {
                        this.A03.A09().AAT();
                    }
                } else {
                    AF2();
                }
            }
        }
        A08();
    }

    private final void A04() {
        PA.A0B().incrementAndGet();
        A03();
        this.A07.A0W();
    }

    private void A05(Intent intent, AnonymousClass18 anonymousClass18) {
        intent.putExtra(A01(136, 8, 40), EnumC0608Kq.A04);
        intent.putExtra(A01(118, 18, 95), anonymousClass18);
        intent.addFlags(DriveFile.MODE_READ_ONLY);
    }

    @SuppressLint({"CatchGeneralException"})
    private final void A06(AnonymousClass18 anonymousClass18) {
        AdActivityIntent adActivityIntentA04 = LN.A04(this.A03);
        A05(adActivityIntentA04, anonymousClass18);
        try {
            LN.A09(this.A03, adActivityIntentA04);
        } catch (Exception e) {
            this.A03.A06().A8y(A01(107, 11, 38), C03298z.A0D, new AnonymousClass90(e));
            Log.e(A01(90, 17, 41), A01(0, 90, 68), e);
        }
    }

    private void A07(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        new ON(this.A03, this.A08, this.A00, this.A05, this.A04).A08(this.A02.A0U(), str, new HashMap());
    }

    public final void A08() {
        MS.A0J(this.A07.A0O());
        addView(this.A07.A0O(), new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.X.SW
    public final void A7w() {
        A07(this.A02.A0O().A0F().A05());
    }

    @Override // com.facebook.ads.redexgen.X.SW
    public final void A7x(String str) {
        A07(str);
    }

    @Override // com.facebook.ads.redexgen.X.SW
    public final void A81() {
    }

    @Override // com.facebook.ads.redexgen.X.SW
    public final void A8h() {
        new Handler(Looper.getMainLooper()).post(new C0799Sc(this));
    }

    @Override // com.facebook.ads.redexgen.X.SW
    public final void AAr() {
        A06(this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.SW
    public final void AAv() {
    }

    @Override // com.facebook.ads.redexgen.X.SW
    public final void ABZ(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.X.SW
    public final void ACK() {
    }

    @Override // com.facebook.ads.redexgen.X.SW
    public final void ACn(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.X.SW
    public final void ACp(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.X.SW
    public final void AD2(String str) {
    }

    @Override // com.facebook.ads.redexgen.X.SW
    public final void AF2() {
        InterfaceC0718Oz interfaceC0718Oz = this.A06;
        if (interfaceC0718Oz != null) {
            interfaceC0718Oz.AAf(this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.SW
    public final void close() {
    }

    public InterfaceC0575Jh getAdEventManager() {
        return this.A04;
    }

    public PA getDynamicWebViewController() {
        return this.A07;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public void setAdViewabilityChecker(C0767Qw c0767Qw) {
        this.A00 = c0767Qw;
        this.A07.A0e(c0767Qw);
    }
}
