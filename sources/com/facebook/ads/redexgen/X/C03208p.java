package com.facebook.ads.redexgen.X;

import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.lang.Thread;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03208p implements Thread.UncaughtExceptionHandler {
    public static byte[] A04;
    public final C0946Xx A00;
    public final InterfaceC03268w A01;
    public final Thread.UncaughtExceptionHandler A02;
    public final Map<String, String> A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 65);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{42, Ascii.FS, 94, 122, 96, 96, 122, 125, 116, 51, 80, 124, 125, 103, 118, 107, 103, Ascii.VT, 7, 5, 70, Ascii.SO, 9, Ascii.VT, Ascii.CR, 10, 7, 7, 3, 70, 9, Ascii.FF, Ascii.ESC, 71, 86, 69, 87, 76, Ascii.DC4, Ascii.DC2, 5, 19, Ascii.RS, Ascii.ETB, 2, 80, 86, 65, 87, 90, 83, 70, 124, 64, 76, 71, 70};
    }

    public C03208p(@Nullable Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C0946Xx c0946Xx, InterfaceC03198o interfaceC03198o) {
        this(uncaughtExceptionHandler, c0946Xx, interfaceC03198o, C03278x.A00());
    }

    public C03208p(@Nullable Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C0946Xx c0946Xx, InterfaceC03198o interfaceC03198o, InterfaceC03268w interfaceC03268w) {
        this.A02 = uncaughtExceptionHandler;
        if (c0946Xx != null) {
            this.A00 = c0946Xx;
            this.A03 = interfaceC03198o.A7U(c0946Xx);
            this.A01 = interfaceC03268w;
            return;
        }
        throw new IllegalArgumentException(A00(2, 15, 82));
    }

    public static void A02() {
        try {
            Process.killProcess(Process.myPid());
        } catch (Throwable unused) {
        }
        try {
            System.exit(10);
        } catch (Throwable unused2) {
        }
    }

    private void A03(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.A02;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else {
            A02();
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            String strA03 = MA.A03(this.A00, th);
            if (!TextUtils.isEmpty(strA03) && strA03.contains(A00(17, 16, 41))) {
                Map<String, String> mapA02 = new C03188n(strA03, this.A03).A02();
                mapA02.put(A00(38, 7, 38), A00(33, 5, 101));
                Throwable thA00 = AbstractRunnableC0612Kv.A00();
                String strA00 = A00(45, 12, 98);
                if (thA00 != th) {
                    mapA02.put(strA00, A00(0, 1, 91));
                } else {
                    mapA02.put(strA00, A00(1, 1, 108));
                }
                this.A01.AFj(new AnonymousClass93(this.A00.A07().A01(), this.A00.A07().A02(), mapA02), this.A00);
                if (JR.A1R(this.A00)) {
                    JR.A0b(this.A00);
                }
            }
        } catch (Exception unused) {
        }
        A03(thread, th);
    }
}
