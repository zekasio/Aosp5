package com.facebook.ads.redexgen.X;

import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.Looper;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ua, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0848Ua implements InterfaceC0574Jg {
    public static byte[] A0D;
    public static String[] A0E = {"uc0mqsrp7zbVSSUmEXyUZJQCGufws", "8g6ahr3vPydrTtk22", "YNqtB8iJmO2uVaHpbt6P5K9KH1grqDjF", "oDfi3coiS1yTvP0yt", "tbJDZpprNJoNbXk4MBqAl5O83qYFAo", "QKETic0g2MOurTT1w7cfpFQ", "PRNEoz9kKM8OadepDD5IPPYNQZFvnMHX", "tq93tXY5KQrS9ibGckbvCktGGZhVZKfr"};
    public static final String A0F;
    public int A00;
    public long A01;
    public final long A02;
    public final long A03;
    public final ConnectivityManager A04;
    public final C0946Xx A06;
    public final InterfaceC0573Jf A07;
    public final R2 A08;
    public volatile boolean A0C;
    public final Runnable A0A = new C0850Uc(this);
    public final Runnable A09 = new C0849Ub(this);
    public final ThreadPoolExecutor A0B = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    public final Handler A05 = new Handler(Looper.getMainLooper());

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 88);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A0D = new byte[]{-39, -22, -48, -44, -73, -36, -26, -29, -44, -25, -42, -37, -36, -31, -38, -109, -40, -23, -40, -31, -25, -109, -101, -45, 6, -15, -13, -2, 2, -9, -3, -4, -82, 5, -10, -9, -6, -13, -82, -14, -9, 1, -2, -17, 2, -15, -10, -9, -4, -11, -82, -13, 4, -13, -4, 2, 1, -68, -28, -10, 3, 7, -10, 3, -79, 1, 3, 0, -12, -10, 4, 4, -10, -11, -79, 1, -14, 3, 5, -6, -14, -3, -79, -13, -14, 5, -12, -7, -67, -79, -12, 0, -1, 5, -6, -1, 6, -6, -1, -8, -79, 5, 0, -79, -1, -10, 9, 5, -79, 0, -1, -10, -65, Ascii.ESC, 45, 58, 62, 45, 58, -24, 58, 45, 59, 56, 55, 54, 59, 45, -24, 49, 59, -24, 45, 53, 56, 60, 65, -10, -17, 1, Ascii.SO, Ascii.DC2, 1, Ascii.SO, -68, Ascii.SO, 1, Ascii.DLE, 17, Ascii.SO, 10, 1, 0, -68, -3, -68, 10, Ascii.VT, 10, -55, Ascii.SI, 17, -1, -1, 1, Ascii.SI, Ascii.SI, 2, 17, 8, -68, Ascii.SI, Ascii.DLE, -3, Ascii.DLE, 17, Ascii.SI, -68, -1, Ascii.VT, 0, 1, -68, Ascii.VT, 2, -68, -61, -43, -30, -26, -43, -30, -112, -25, -47, -29, -112, -27, -34, -47, -46, -36, -43, -112, -28, -33, -112, -32, -30, -33, -45, -43, -29, -29, -112, -47, -36, -36, -112, -43, -26, -43, -34, -28, -29, -100, -112, -28, -30, -23, -39, -34, -41, -112, -47, -41, -47, -39, -34, -98, -17, 7, 5, Ascii.FF, Ascii.FF, 5, 10, 3, -68, 0, 5, Ascii.SI, Ascii.FF, -3, Ascii.DLE, -1, 4, -68, 0, 17, 1, -68, Ascii.DLE, Ascii.VT, -68, 8, -3, -1, 7, -68, Ascii.VT, 2, -68, -1, Ascii.VT, 10, 10, 1, -1, Ascii.DLE, 5, Ascii.DC2, 5, Ascii.DLE, Ascii.NAK, -54, -31, -12, -12, -27, -19, -16, -12, -59, -47, -48, -48, -57, -59, -42, -53, -40, -53, -42, -37, 47, 44, 63, 44, -22, -5, -22, -13, -7, -8, 36, Ascii.NAK, 45, 32, 35, Ascii.NAK, Ascii.CAN};
    }

    static {
        A07();
        A0F = InterfaceC0574Jg.class.getSimpleName();
    }

    public C0848Ua(C0946Xx c0946Xx, InterfaceC0573Jf interfaceC0573Jf) {
        this.A07 = interfaceC0573Jf;
        this.A06 = c0946Xx;
        this.A04 = (ConnectivityManager) c0946Xx.getSystemService(A03(293, 12, 10));
        this.A08 = RK.A01(c0946Xx);
        this.A03 = JT.A0K(c0946Xx);
        this.A02 = JT.A0J(c0946Xx);
    }

    public static /* synthetic */ int A00(C0848Ua c0848Ua) {
        int i = c0848Ua.A00 + 1;
        c0848Ua.A00 = i;
        return i;
    }

    private void A05() {
        this.A06.A03().A8P();
        this.A00 = 0;
        this.A01 = 0L;
        if (this.A0B.getQueue().size() == 0) {
            this.A07.A9y();
        }
    }

    private void A06() {
        if (this.A00 >= JT.A09(this.A06)) {
            A05();
            A4q();
        } else {
            if (this.A00 == 1) {
                this.A01 = JT.A0I(this.A06);
            } else {
                this.A01 *= 2;
            }
            A4r();
        }
    }

    private void A08(long j) {
        this.A05.postDelayed(this.A09, j);
    }

    private void A09(JSONObject jSONObject) throws JSONException {
        for (Map.Entry<String, String> entry : this.A06.A02().A4T().entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:22:0x0073 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0B() {
        /*
            Method dump skipped, instruction units count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0848Ua.A0B():void");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0574Jg
    public final void A4q() {
        if (this.A0C) {
            return;
        }
        this.A0C = true;
        this.A05.removeCallbacks(this.A09);
        A08(this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0574Jg
    public final void A4r() {
        this.A0C = true;
        this.A05.removeCallbacks(this.A09);
        A08(this.A03);
    }
}
