package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.video.DummySurface;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class J5 extends HandlerThread implements Handler.Callback {
    public static byte[] A05;
    public Handler A00;
    public IU A01;

    @Nullable
    public DummySurface A02;

    @Nullable
    public Error A03;

    @Nullable
    public RuntimeException A04;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 34);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{-37, Ascii.FF, 4, 4, Ascii.DLE, -22, Ascii.FF, 9, -3, -8, -6, -4, 105, -124, -116, -113, -120, -121, 67, -105, -110, 67, -116, -111, -116, -105, -116, -124, -113, -116, -99, -120, 67, -121, -104, -112, -112, -100, 67, -106, -104, -107, -119, -124, -122, -120, -67, -40, -32, -29, -36, -37, -105, -21, -26, -105, -23, -36, -29, -36, -40, -22, -36, -105, -37, -20, -28, -28, -16, -105, -22, -20, -23, -35, -40, -38, -36, -84, -67, -75, -75, -63, -101, -67, -70, -82, -87, -85, -83};
    }

    public J5() {
        super(A00(77, 12, 38));
    }

    private void A01() {
        IK.A01(this.A01);
        this.A01.A08();
    }

    private void A03(int i) {
        IK.A01(this.A01);
        this.A01.A09(i);
        this.A02 = new DummySurface(this, this.A01.A07(), i != 0);
    }

    public final DummySurface A04(int i) {
        start();
        this.A00 = new Handler(getLooper(), this);
        this.A01 = new IU(this.A00);
        boolean z = false;
        synchronized (this) {
            this.A00.obtainMessage(1, i, 0).sendToTarget();
            while (this.A02 == null && this.A04 == null && this.A03 == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.A04;
        if (runtimeException == null) {
            Error error = this.A03;
            if (error == null) {
                return (DummySurface) IK.A01(this.A02);
            }
            throw error;
        }
        throw runtimeException;
    }

    public final void A05() {
        IK.A01(this.A00);
        this.A00.sendEmptyMessage(2);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i != 1) {
                if (i != 2) {
                    return true;
                }
                try {
                    A01();
                } finally {
                    try {
                    } finally {
                    }
                }
                return true;
            }
            try {
                A03(message.arg1);
                synchronized (this) {
                    notify();
                }
            } catch (Error e) {
                Log.e(A00(0, 12, 117), A00(12, 34, 1), e);
                this.A03 = e;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e2) {
                Log.e(A00(0, 12, 117), A00(12, 34, 1), e2);
                this.A04 = e2;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }
}
