package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: assets/audience_network.dex */
@SuppressLint({"CatchGeneralException"})
public abstract class L8 implements Runnable {
    public static byte[] A01;
    public static final AtomicBoolean A02;
    public static final AtomicBoolean A03;
    public static final AtomicReference<InterfaceC0615Ky> A04;

    @Nullable
    public final C0613Kw A00;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 116);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{124, 91, 64, 64, 79, 76, 66, 75, Ascii.SO, 77, 92, 75, 79, 90, 75, 74, 0, Ascii.SO, 122, 70, 92, 75, 79, 74, Ascii.DC4, Ascii.SO};
    }

    public abstract void A06();

    static {
        A02();
        A02 = new AtomicBoolean();
        A03 = new AtomicBoolean(false);
        A04 = new AtomicReference<>();
    }

    public L8() {
        if (A03.get()) {
            this.A00 = LD.A01(new LC(A01(0, 26, 90) + Thread.currentThread().getName()));
            return;
        }
        this.A00 = null;
    }

    public static void A03(boolean z) {
        A03.set(z);
    }

    public static void A04(boolean z, InterfaceC0615Ky interfaceC0615Ky) {
        A02.set(z);
        A04.set(interfaceC0615Ky);
    }

    @Nullable
    public final C0613Kw A05() {
        return this.A00;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            if (A03.get()) {
                LD.A03(this);
            }
            try {
                A06();
            } catch (Throwable th) {
                if (A02.get()) {
                    LF.A00().A8p(3301, th);
                    InterfaceC0615Ky interfaceC0615Ky = A04.get();
                    if (interfaceC0615Ky != null) {
                        interfaceC0615Ky.AE0(th, this);
                    }
                } else {
                    throw th;
                }
            }
            if (A03.get()) {
                LD.A04(this);
            }
        } catch (Throwable t) {
            L0.A00(t, this);
        }
    }
}
