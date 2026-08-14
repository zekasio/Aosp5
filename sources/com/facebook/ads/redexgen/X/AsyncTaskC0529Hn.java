package com.facebook.ads.redexgen.X;

import android.os.AsyncTask;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AsyncTaskC0529Hn extends AsyncTask<RE, Void, R1> implements RB {
    public static byte[] A04;
    public R3 A00;
    public C0524Hg A01;
    public Exception A02;
    public Executor A03;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 101);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-18, Ascii.EM, -14, Ascii.RS, Ascii.RS, Ascii.SUB, -4, Ascii.SI, Ascii.ESC, Ascii.US, Ascii.SI, Ascii.GS, Ascii.RS, -2, Ascii.VT, Ascii.GS, Ascii.NAK, -54, Ascii.RS, Ascii.VT, Ascii.NAK, Ascii.SI, Ascii.GS, -54, Ascii.SI, 34, Ascii.VT, Ascii.CR, Ascii.RS, Ascii.SYN, 35, -54, Ascii.EM, Ascii.CAN, Ascii.SI, -54, Ascii.VT, Ascii.FS, 17, Ascii.US, Ascii.ETB, Ascii.SI, Ascii.CAN, Ascii.RS, -54, Ascii.EM, Ascii.DLE, -54, Ascii.RS, 35, Ascii.SUB, Ascii.SI, -54, -14, Ascii.RS, Ascii.RS, Ascii.SUB, -4, Ascii.SI, Ascii.ESC, Ascii.US, Ascii.SI, Ascii.GS, Ascii.RS, Ascii.SI, Ascii.ESC, Ascii.ESC, Ascii.ETB, -25, 57, 44, 56, 60, 44, 58, 59, -25, 45, 40, 48, 51, 44, 43, 1, -25, -20, 58, 36, 80, 80, 76, -4, 78, 65, 79, 76, 75, 74, 79, 65, -4, 69, 79, -4, 74, 81, 72, 72, -67, -48, -34, -37, -38, -39, -34, -48, -91, -117, -112, -49, -117, -109, -112, -34, -108, -91, 117, -112, -34};
    }

    public AsyncTaskC0529Hn(C0524Hg c0524Hg, R3 r3, Executor executor) {
        this.A01 = c0524Hg;
        this.A00 = r3;
        this.A03 = executor;
    }

    private final R1 A00(RE... reArr) throws Throwable {
        if (L0.A02(this)) {
            return null;
        }
        try {
            if (reArr != null) {
                try {
                    if (reArr.length > 0) {
                        R1 r1A0J = this.A01.A0J(reArr[0]);
                        if (this.A01.A0K().A04() && r1A0J != null) {
                            String.format(Locale.US, A01(108, 21, 6), Integer.valueOf(r1A0J.A7a()), r1A0J.getUrl(), r1A0J.A5p());
                        }
                        if (r1A0J != null) {
                            return r1A0J;
                        }
                        throw new IllegalStateException(A01(87, 21, 119));
                    }
                } catch (Exception e) {
                    this.A02 = e;
                    if (this.A01.A0K().A04()) {
                        String.format(Locale.US, A01(64, 23, 98), e.getMessage());
                    }
                    cancel(true);
                    return null;
                }
            }
            throw new IllegalArgumentException(A01(0, 64, 69));
        } catch (Throwable th) {
            L0.A00(th, this);
            return null;
        }
    }

    private final void A03(R1 r1) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A00.AAM(r1);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.RB
    public final void A5H(RE re) {
        super.executeOnExecutor(this.A03, re);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ R1 doInBackground(RE[] reArr) throws Throwable {
        if (L0.A02(this)) {
            return null;
        }
        try {
            return A00(reArr);
        } catch (Throwable th) {
            L0.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        this.A00.AAj(this.A02);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(R1 r1) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A03(r1);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
