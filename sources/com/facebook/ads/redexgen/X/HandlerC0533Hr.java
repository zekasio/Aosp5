package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.redexgen.X.InterfaceC0534Hs;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@SuppressLint({"HandlerLeak"})
public final class HandlerC0533Hr<T extends InterfaceC0534Hs> extends Handler implements Runnable {
    public static byte[] A0A;
    public int A00;

    @Nullable
    public InterfaceC0532Hq<T> A01;
    public IOException A02;
    public final int A03;
    public final long A04;
    public final T A05;
    public volatile Thread A06;
    public volatile boolean A07;
    public volatile boolean A08;
    public final /* synthetic */ C0870Uw A09;

    static {
        A04();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 16);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0A = new byte[]{-112, -125, -73, -64, -57, -110, -116, -81, -95, -92, -108, -95, -77, -85, -76, -38, -39, -76, -53, -78, -54, -46, -44, -41, -34, -123, -54, -41, -41, -44, -41, -123, -47, -44, -58, -55, -50, -45, -52, -123, -40, -39, -41, -54, -58, -46, -87, -62, -71, -52, -60, -71, -73, -56, -71, -72, 116, -71, -58, -58, -61, -58, 116, -64, -61, -75, -72, -67, -62, -69, 116, -57, -56, -58, -71, -75, -63, -38, -13, -22, -3, -11, -22, -24, -7, -22, -23, -91, -22, -3, -24, -22, -11, -7, -18, -12, -13, -91, -19, -26, -13, -23, -15, -18, -13, -20, -91, -15, -12, -26, -23, -91, -24, -12, -14, -11, -15, -22, -7, -22, -23, -117, -92, -101, -82, -90, -101, -103, -86, -101, -102, 86, -101, -82, -103, -101, -90, -86, -97, -91, -92, 86, -94, -91, -105, -102, -97, -92, -99, 86, -87, -86, -88, -101, -105, -93, -46, -43, -57, -54, -96, -94, -55, -46, -39, -92};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hq != com.facebook.ads.internal.exoplayer2.upstream.Loader$Callback<T extends com.facebook.ads.redexgen.X.Hs> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hr != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Hs> */
    public HandlerC0533Hr(C0870Uw c0870Uw, Looper looper, T loadable, InterfaceC0532Hq<T> interfaceC0532Hq, int i, long j) {
        super(looper);
        this.A09 = c0870Uw;
        this.A05 = loadable;
        this.A01 = interfaceC0532Hq;
        this.A03 = i;
        this.A04 = j;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hr != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Hs> */
    private long A00() {
        return Math.min((this.A00 - 1) * 1000, 5000);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hr != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Hs> */
    private void A02() {
        this.A02 = null;
        this.A09.A02.execute(this.A09.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hr != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Hs> */
    private void A03() {
        this.A09.A00 = null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hr != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Hs> */
    public final void A05(int i) throws IOException {
        IOException iOException = this.A02;
        if (iOException == null || this.A00 <= i) {
        } else {
            throw iOException;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hr != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Hs> */
    public final void A06(long j) {
        IK.A04(this.A09.A00 == null);
        this.A09.A00 = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            A02();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hr != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Hs> */
    public final void A07(boolean z) {
        this.A08 = z;
        this.A02 = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            this.A07 = true;
            this.A05.A3y();
            if (this.A06 != null) {
                this.A06.interrupt();
            }
        }
        if (z) {
            A03();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.A01.ABF(this.A05, jElapsedRealtime, jElapsedRealtime - this.A04, true);
            this.A01 = null;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hr != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Hs> */
    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            if (this.A08) {
                return;
            }
            if (message.what == 0) {
                A02();
                return;
            }
            if (message.what != 4) {
                A03();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j = jElapsedRealtime - this.A04;
                if (this.A07) {
                    this.A01.ABF(this.A05, jElapsedRealtime, j, false);
                    return;
                }
                int i = message.what;
                if (i == 1) {
                    this.A01.ABF(this.A05, jElapsedRealtime, j, false);
                    return;
                }
                if (i == 2) {
                    try {
                        this.A01.ABH(this.A05, jElapsedRealtime, j);
                        return;
                    } catch (RuntimeException e) {
                        Log.e(A01(6, 8, 48), A01(77, 44, 117), e);
                        this.A09.A01 = new C0538Hw(e);
                        return;
                    }
                }
                if (i != 3) {
                    return;
                }
                this.A02 = (IOException) message.obj;
                int iABI = this.A01.ABI(this.A05, jElapsedRealtime, j, this.A02);
                if (iABI != 3) {
                    if (iABI == 2) {
                        return;
                    }
                    this.A00 = iABI == 1 ? 1 : this.A00 + 1;
                    A06(A00());
                    return;
                }
                this.A09.A01 = this.A02;
                return;
            }
            throw ((Error) message.obj);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hr != com.facebook.ads.internal.exoplayer2.upstream.Loader$LoadTask<T extends com.facebook.ads.redexgen.X.Hs> */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        String strA01 = A01(6, 8, 48);
        if (L0.A02(this)) {
            return;
        }
        try {
            try {
                try {
                    try {
                        try {
                            this.A06 = Thread.currentThread();
                            if (!this.A07) {
                                C0564Iw.A02(A01(156, 10, 86) + this.A05.getClass().getSimpleName() + A01(0, 6, 68));
                                try {
                                    this.A05.A8m();
                                } finally {
                                    C0564Iw.A00();
                                }
                            }
                            if (!this.A08) {
                                sendEmptyMessage(2);
                            }
                        } catch (InterruptedException unused) {
                            IK.A04(this.A07);
                            if (!this.A08) {
                                sendEmptyMessage(2);
                            }
                        }
                    } catch (OutOfMemoryError e) {
                        Log.e(strA01, A01(14, 32, 85), e);
                        if (!this.A08) {
                            obtainMessage(3, new C0538Hw(e)).sendToTarget();
                        }
                    }
                } catch (Error e2) {
                    Log.e(strA01, A01(46, 31, 68), e2);
                    if (!this.A08) {
                        obtainMessage(4, e2).sendToTarget();
                    }
                    throw e2;
                }
            } catch (IOException e3) {
                if (!this.A08) {
                    obtainMessage(3, e3).sendToTarget();
                }
            } catch (Exception e4) {
                Log.e(strA01, A01(121, 35, 38), e4);
                if (!this.A08) {
                    obtainMessage(3, new C0538Hw(e4)).sendToTarget();
                }
            }
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
