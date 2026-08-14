package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0602Kk {
    public static byte[] A07;
    public static final MV A08;
    public static final Executor A09;
    public long A00;

    @Nullable
    public Kj A01;

    @Nullable
    public Map<String, String> A02;
    public final C2D A03;
    public final C0947Xy A04;
    public final C0603Kl A05;
    public final String A06;

    public static String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 80);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{59, 107, 108, 51, 50, 57, 50, 59, 122, 105, 107, 119, 117, 78, 65, 68, 72, 67, 89, 82, 95, 72, 92, 88, 72, 94, 89, 82, 68, 73, 98, 88, Ascii.VT, 121, 101, 17, Ascii.VT, 100, 101, 10, 108, 99, 102, 102, 10, 88, 79, 73, 79, 67, 92, 79, 78, Ascii.DC4, 53, 122, Ascii.FS, 51, 54, 54, 122, 63, 40, 40, 53, 40, 122, 57, 53, 62, 63, 122, 1, 127, 41, 7, 122, 127, 41, Ascii.SI, Ascii.CR, 6, Ascii.CR, Ascii.SUB, 1, Ascii.VT, 81, 90, 75, 72, 80, 77, 84, 40, 41, 0, 47, 42, 42, Ascii.SO, 41, 41, 45};
    }

    static {
        A0A();
        A08 = new MV();
        A09 = Executors.newCachedThreadPool(A08);
    }

    public C0602Kk(C0947Xy c0947Xy) {
        this(c0947Xy, C2E.A00(c0947Xy.A00()));
    }

    public C0602Kk(C0947Xy c0947Xy, C2D c2d) {
        this.A00 = -1L;
        this.A04 = c0947Xy;
        this.A05 = C0603Kl.A00();
        this.A06 = C0606Ko.A01(c0947Xy);
        this.A03 = c2d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public R3 A03(long j, C0600Kh c0600Kh) {
        return new U1(this, c0600Kh, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09() {
        C0947Xy c0947Xy = this.A04;
        if (c0947Xy == null || !RK.A0A(c0947Xy)) {
            return;
        }
        AnonymousClass90 anonymousClass90 = new AnonymousClass90(A05(8, 5, 107));
        anonymousClass90.A03(1);
        this.A04.A06().A8y(A05(86, 7, FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION), C03298z.A1w, anonymousClass90);
    }

    private void A0B(int i, String str) {
        String strA05 = A05(93, 10, 22);
        KV.A05(strA05, A05(37, 16, 122), A05(0, 8, 90));
        KV.A04(strA05, String.format(Locale.US, A05(53, 26, 10), Integer.valueOf(i), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(KH kh) {
        Kj kj = this.A01;
        if (kj != null) {
            kj.AAi(kh);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(KH kh) {
        MM.A00(new C0847Tz(this, kh));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0K(C0846Ty c0846Ty) {
        Kj kj = this.A01;
        if (kj != null) {
            kj.ACS(c0846Ty);
        }
    }

    private void A0L(C0846Ty c0846Ty) {
        InterfaceC03098a interfaceC03098aA04;
        MM.A00(new U0(this, c0846Ty));
        if (JR.A1m(this.A04) && (interfaceC03098aA04 = this.A04.A04()) != null) {
            interfaceC03098aA04.A5U();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M(String str, long j, C0600Kh c0600Kh) {
        String str2;
        try {
            try {
                C0605Kn c0605KnA06 = this.A05.A06(this.A04, str, j);
                C9H c9hA00 = c0605KnA06.A00();
                C0946Xx c0946XxA00 = this.A04.A00();
                c0946XxA00.A01().A8s(c0946XxA00, str);
                if (c9hA00 != null) {
                    JR.A0O(this.A04).A2E(c9hA00.A08());
                    this.A04.A06().A9W();
                    this.A03.A0N(c9hA00.A06());
                    Kg.A05(c9hA00.A05().A0B(), c0600Kh);
                    C0647Mg.A01(this.A04, A09, c9hA00);
                    AnonymousClass90 anonymousClass90 = new AnonymousClass90(A05(30, 7, 123) + C0633Ls.A02());
                    anonymousClass90.A04(1);
                    anonymousClass90.A08(false);
                    this.A04.A06().A9Q(A05(79, 7, 56), C03298z.A1W, anonymousClass90);
                }
                int i = C0601Ki.A00[c0605KnA06.A01().ordinal()];
                if (i == 1) {
                    C0846Ty c0846Ty = (C0846Ty) c0605KnA06;
                    if (c9hA00 != null) {
                        if (c9hA00.A05().A0E()) {
                            Kg.A07(str, c0600Kh);
                        }
                        if (this.A02 != null) {
                            str2 = this.A02.get(A05(13, 17, 93));
                        } else {
                            str2 = null;
                        }
                        if (!TextUtils.isEmpty(c0605KnA06.A02()) && !TextUtils.isEmpty(str2)) {
                            this.A04.A01().AEA(this.A04, str2, c0605KnA06.A02());
                        }
                    }
                    this.A04.A0D().A2k(MJ.A01(this.A00));
                    A0L(c0846Ty);
                    return;
                }
                if (i != 2) {
                    AdErrorType adErrorType = AdErrorType.UNKNOWN_RESPONSE;
                    this.A04.A0D().A2j(MJ.A01(this.A00), adErrorType.getErrorCode(), str, adErrorType.isPublicError());
                    A0D(KH.A01(adErrorType, str));
                    return;
                }
                C0845Tx c0845Tx = (C0845Tx) c0605KnA06;
                String strA04 = c0845Tx.A04();
                AdErrorType adErrorTypeAdErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(c0845Tx.A03(), AdErrorType.ERROR_MESSAGE);
                A0B(c0845Tx.A03(), strA04);
                if (strA04 == null) {
                    strA04 = str;
                }
                this.A04.A0D().A2j(MJ.A01(this.A00), adErrorTypeAdErrorTypeFromCode.getErrorCode(), strA04, adErrorTypeAdErrorTypeFromCode.isPublicError());
                A0D(KH.A01(adErrorTypeAdErrorTypeFromCode, strA04));
            } catch (Exception e) {
                e = e;
                String message = e.getMessage();
                AdErrorType adErrorType2 = AdErrorType.PARSER_FAILURE;
                this.A04.A0D().A2j(MJ.A01(this.A00), adErrorType2.getErrorCode(), message, adErrorType2.isPublicError());
                A0D(KH.A01(adErrorType2, message));
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N(String str, long j, C0600Kh c0600Kh) {
        A09.execute(new U2(this, str, j, c0600Kh));
    }

    public final void A0O(C0600Kh c0600Kh) {
        this.A00 = System.currentTimeMillis();
        AnonymousClass98.A0B(this.A04);
        if (Kg.A08(c0600Kh)) {
            MX.A06.execute(new U4(this));
            String strA02 = Kg.A02(c0600Kh);
            if (strA02 != null) {
                this.A04.A0D().AFN();
                A0N(strA02, 0L, c0600Kh);
                return;
            } else {
                AdErrorType adErrorType = AdErrorType.LOAD_TOO_FREQUENTLY;
                this.A04.A0D().A2j(MJ.A01(this.A00), adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage(), adErrorType.isPublicError());
                A0D(KH.A01(adErrorType, null));
                return;
            }
        }
        A09.execute(new U3(this, c0600Kh));
    }

    public final void A0P(Kj kj) {
        this.A01 = kj;
    }
}
