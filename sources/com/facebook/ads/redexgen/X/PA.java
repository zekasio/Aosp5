package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Build;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import cz.msebera.android.httpclient.HttpStatus;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class PA {
    public static byte[] A0K;
    public static final AtomicInteger A0L;
    public static final AtomicInteger A0M;

    @Nullable
    public InterfaceC0718Oz A02;

    @Nullable
    public P8 A03;

    @Nullable
    public P9 A04;

    @Nullable
    public C0767Qw A05;
    public final int A08;
    public final AnonymousClass18 A09;
    public final C7U A0A;
    public final C0947Xy A0B;
    public final InterfaceC0575Jh A0C;
    public final C0583Jp A0D;
    public final C0716Ox A0E;
    public final SX A0F;
    public final PL A0G;
    public final PM A0H;
    public final LinkedList<P7> A0J = new LinkedList<>();
    public MK A01 = new MK();
    public boolean A07 = true;
    public boolean A06 = false;
    public long A00 = -1;
    public final String A0I = UUID.randomUUID().toString();

    public static String A0A(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0K, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 2);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0D() {
        A0K = new byte[]{37, 63, 39, 56, 56, 39, 57, Ascii.CR, 34, 40, 62, 35, 37, 40, 5, 34, 56, 41, 62, 42, 45, 47, 41, 5, 0, 54, 1, Ascii.DC4, Ascii.VT, Ascii.SYN, Ascii.DLE, Ascii.CR, 10, 3, 34, Ascii.CR, 10, Ascii.CR, Ascii.ETB, Ascii.FF, 1, 0, 76, 67, 65, Ascii.ETB, 67, 77, 95, 96, 101, 83, 100, 113, 110, 115, 117, 104, 111, 102, 82, 117, 96, 115, 117, 100, 101, 41, 38, 36, 114, 38, 40, 58, 34, 55, 55, 34, 32, 43, 38, 39, Ascii.DC4, Ascii.NAK, Ascii.CR, 54, 46, 10, 9, Ascii.FS, Ascii.VT, 0, Ascii.CR, Ascii.FF, 46, Ascii.SUB, 9, 5, Ascii.CR, 44, 9, Ascii.FS, 9, 84, 66, 69, 69, 82, 89, 67, 96, 97, 121, 66, 90, 48, 36, 55, 59, 51, 37, 120, 121, 86, 116, 99, 126, 97, 126, 99, 110, 71, 118, 98, 100, 114, 115, 63, 48, 50, 100, 48, 62, 44, 36, 37, 10, 40, 63, 34, 61, 34, 63, 50, Ascii.EM, 46, 56, 62, 38, 46, 47, 99, 108, 110, 56, 108, 98, 112, 83, 82, 127, 80, 83, 79, 89, 122, 73, 80, 80, 79, 95, 78, 89, 89, 82, 106, 85, 89, 75, Ascii.DC4, Ascii.ESC, Ascii.EM, 79, Ascii.ESC, Ascii.NAK, 67, 66, 106, 89, 64, 64, 95, 79, 94, 73, 73, 66, 122, 69, 73, 91, 4, Ascii.VT, 9, 95, Ascii.VT, 5, 72, 73, 113, 70, 75, 82, 66, 117, 66, 70, 67, Ascii.SI, 0, 2, 84, 0, Ascii.VT, 7, 0, 2, 84, 0, Ascii.VT, 7, 0, 2, 84, 0, Ascii.SO, Ascii.FS, 120, 121, 65, 118, 123, 98, 114, 64, 101, 126, 99, 99, 114, 121, 63, 48, 50, 100, 48, 59, 55, 48, 50, 100, 48, 62, 44, 106, 124, 122, 118, 119, 125, 70, 122, 113, 120, 119, 119, 124, 117, Ascii.DC4, 2, 19, 38, Ascii.DC2, 19, Ascii.SI, 44, 2, Ascii.RS, 79, 64, 66, Ascii.DC4, 64, 75, 64, 66, Ascii.DC4, 64, 78, 92, 77, 91, 74, 124, 95, 77, 91, 8, 10, 127, 77, 77, 91, 74, 77, Ascii.SYN, Ascii.EM, Ascii.ESC, 77, Ascii.EM, Ascii.DC2, Ascii.EM, Ascii.ESC, 77, Ascii.EM, Ascii.ETB, 2, Ascii.DC4, 5, 51, Ascii.DLE, 2, Ascii.DC4, 71, 69, 50, Ascii.RS, Ascii.US, Ascii.ETB, Ascii.CAN, Ascii.SYN, 89, 86, 84, 2, 86, 93, 86, 84, 2, 86, 88, 57, 34, 57, 44, 33, Ascii.SUB, Ascii.ESC, 3, 56, 32, 38, 33, 63, Ascii.GS, 2, Ascii.SI, Ascii.SO, 4, 46, Ascii.GS, Ascii.SO, 5, Ascii.US, 67, 76, 78, Ascii.CAN, 76, 71, 75, 76, 78, Ascii.CAN, 76, 71, 75, 76, 78, Ascii.CAN, 76, 66, 80, Ascii.SO, 17, Ascii.GS, Ascii.SI, 42, Ascii.GS, Ascii.EM, Ascii.FS, 1, 44, Ascii.ETB, 43, Ascii.DLE, Ascii.ETB, Ascii.SI, 80, 95, 93, Ascii.VT, 95, 81, 67};
    }

    static {
        A0D();
        A0M = new AtomicInteger();
        A0L = new AtomicInteger();
    }

    public PA(C0947Xy c0947Xy, AnonymousClass18 anonymousClass18, InterfaceC0575Jh interfaceC0575Jh, int i) {
        this.A0B = c0947Xy;
        this.A0C = interfaceC0575Jh;
        this.A09 = anonymousClass18;
        this.A08 = i;
        this.A0F = new SX(this, c0947Xy);
        this.A0A = new C7U(this.A0B);
        this.A0D = new C0583Jp(anonymousClass18.A0U(), interfaceC0575Jh);
        this.A0E = new C0716Ox(anonymousClass18.A0Z(), anonymousClass18.A0O().A0D().A08(), i);
        this.A0H = PN.A00(this.A0B, anonymousClass18.A0d(), this.A0A, this.A0D, this.A0E, A0H());
        this.A0G = new PL(this.A0B, this, interfaceC0575Jh, this.A0E, this.A0I, anonymousClass18.A0U());
    }

    public static AtomicInteger A0B() {
        return A0L;
    }

    private void A0C() {
        A0F(new P7(A0A(288, 22, 101), new String[]{this.A0I, A0A(1, 6, 11)}));
        A0F(new P7(A0A(310, 26, 60), new String[]{Base64.encodeToString(this.A0H.A05.toString().getBytes(), 0).replace(A0A(0, 1, 45), A0A(0, 0, 109)), this.A0I}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(21)
    public synchronized void A0E() {
        if (this.A06) {
            while (!this.A0J.isEmpty()) {
                P7 p7Poll = this.A0J.poll();
                if (p7Poll != null) {
                    this.A0F.A05(String.format(Locale.US, p7Poll.A00, p7Poll.A02));
                    if (p7Poll.A01) {
                        this.A0D.A02(EnumC0582Jo.A0L, null);
                        this.A0B.A0D().A4v(p7Poll.A00);
                    }
                }
            }
        }
    }

    private synchronized void A0F(P7 p7) {
        this.A0J.offer(p7);
        A0E();
    }

    private boolean A0H() {
        return !A0I();
    }

    private boolean A0I() {
        return JR.A27(this.A0B, C0751Qg.A03());
    }

    public final C0583Jp A0K() {
        return this.A0D;
    }

    public final MK A0L() {
        return this.A01;
    }

    public final C0716Ox A0M() {
        return this.A0E;
    }

    @Nullable
    public final InterfaceC0718Oz A0N() {
        return this.A02;
    }

    public final SX A0O() {
        return this.A0F;
    }

    public final void A0P() {
        A0F(new P7(A0A(23, 26, 102), new String[]{this.A0I}));
    }

    public final void A0Q() {
        A0F(new P7(A0A(49, 25, 3), new String[]{this.A0I}));
    }

    public final void A0R() {
        this.A07 = true;
    }

    public final void A0S() {
        this.A07 = false;
    }

    public final void A0T() {
        A0F(new P7(A0A(121, 23, 21), new String[]{this.A0I}));
    }

    public final void A0U() {
        A0F(new P7(A0A(168, 27, 62), new String[]{this.A0I}));
    }

    public final void A0V() {
        A0F(new P7(A0A(195, 22, 46), new String[]{this.A0I}));
    }

    public final void A0W() {
        A0F(new P7(A0A(HttpStatus.SC_NOT_FOUND, 22, 122), new String[]{this.A0I}));
    }

    @SuppressLint({"AddJavascriptInterface"})
    public final void A0X() {
        String str;
        if (Build.VERSION.SDK_INT > 16) {
            this.A0F.addJavascriptInterface(this.A0G, A0A(7, 16, 78));
        }
        this.A0D.A02(EnumC0582Jo.A0O, null);
        if (this.A08 == 3) {
            str = this.A0H.A00;
        } else {
            str = this.A0H.A01;
        }
        this.A0F.loadUrl(str);
        this.A00 = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A0A(372, 3, 81), str);
            jSONObject.put(A0A(103, 12, 53), PB.A00());
            jSONObject.put(A0A(362, 10, 79), A0M.getAndIncrement());
            jSONObject.put(A0A(74, 13, 65), A0L);
        } catch (JSONException unused) {
        }
        this.A0B.A0D().A51(jSONObject.toString());
        A0C();
    }

    public final void A0Y() {
        A0F(new P7(A0A(144, 24, 73), new String[]{this.A0I}));
    }

    public final void A0Z(MK mk) {
        this.A01 = mk;
    }

    public final void A0a(@Nullable InterfaceC0718Oz interfaceC0718Oz) {
        this.A02 = interfaceC0718Oz;
    }

    public final void A0b(P8 p8) {
        this.A03 = p8;
    }

    public final void A0c(P9 p9) {
        this.A04 = p9;
    }

    public final void A0d(SW sw) {
        this.A0G.A0N(sw);
    }

    public final void A0e(@Nullable C0767Qw c0767Qw) {
        this.A05 = c0767Qw;
    }

    public final void A0f(String str) {
        A0F(new P7(A0A(247, 27, 21), new String[]{this.A0I, str}));
    }

    public final void A0g(String str, String str2) {
        A0F(new P7(A0A(217, 30, 37), new String[]{this.A0I, str, str2}));
    }

    public final void A0h(String str, JSONObject jSONObject) {
        A0F(new P7(A0A(375, 29, 105), new String[]{this.A0I, str, jSONObject.toString()}, false));
    }

    /* JADX WARN: Incorrect condition in loop: B:8:0x0032 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0i(java.util.Map<java.lang.String, java.lang.String> r21) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.PA.A0i(java.util.Map):void");
    }

    public final void A0j(JSONObject jSONObject) {
        A0F(new P7(A0A(336, 26, 115), new String[]{Base64.encodeToString(jSONObject.toString().getBytes(), 0).replace(A0A(0, 1, 45), A0A(0, 0, 109)), this.A0I}));
    }

    public final boolean A0k() {
        return this.A0G.A0O();
    }

    public final boolean A0l() {
        return this.A07;
    }
}
