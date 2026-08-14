package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03389i implements Closeable {
    public static byte[] A03;
    public static String[] A04 = {"SDO1JVQRVztc05U6wH4HJTiF5V86WLZV", "JUkWBi3mNnUEcI1zFAO0icxdG8wRWdD7", "QP9Vd5zf9OYRCERvVtyUemXpYBL6EKiE", "xOOYiIXMxQksUvny4QEKcKXl4UDniIsU", "x87Ktc1IWjLpjjicmuhI7Z2IzrOHGBC3", "WGZ", "wfI1QUU7hCcnQ3hBelCxr5juQnjBiotI", "E2gfbhu1TU9ChELgnqQ3ne7CNBbav8TU"};
    public C03399j A00;
    public boolean A01;
    public final RandomAccessFile A02;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = bArrCopyOfRange[i4];
            if (A04[5].length() != 3) {
                throw new RuntimeException();
            }
            A04[6] = "pH7cradwiFTKLrbheOx3UovjSmwH9sX8";
            bArrCopyOfRange[i4] = (byte) ((b ^ i3) ^ 38);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{95, 105, 110, 111, 115, 110, 90, 117, 112, 121, 60, 117, 111, 60, 125, 112, 110, 121, 125, 120, 101, 60, 127, 112, 115, 111, 121, 120, Ascii.SI, 40, 48, 39, 42, 47, 34, 102, 54, 41, 53, 47, 50, 47, 41, 40, 124, 102, 110, 99, 34, 106, 99, 34, 111, 94, 91, 95};
    }

    static {
        A02();
    }

    public C03389i(File file) throws IOException {
        this.A02 = new RandomAccessFile(file, A00(53, 3, 10));
        if (this.A02.length() != 8) {
            this.A02.setLength(8L);
            this.A00 = new C03399j(0, 0);
            A01();
            return;
        }
        int i = this.A02.readInt();
        int i2 = this.A02.readInt();
        if (i < 0 || i2 < 0) {
            i = 0;
            i2 = 0;
        }
        this.A00 = new C03399j(i, i2);
    }

    private void A01() throws IOException {
        this.A02.seek(0L);
        this.A02.writeInt(this.A00.A02());
        this.A02.writeInt(this.A00.A03());
        this.A02.getFD().sync();
    }

    public final C03399j A03() throws IOException {
        if (!this.A01) {
            return this.A00;
        }
        throw new IOException(A00(0, 28, 58));
    }

    public final void A04(C03399j c03399j) throws IOException {
        if (!this.A01) {
            if (c03399j.A02() >= 0 && c03399j.A03() >= 0) {
                this.A00 = c03399j;
                A01();
                return;
            }
            throw new IOException(String.format(Locale.US, A00(28, 25, 96), Integer.valueOf(c03399j.A02()), Integer.valueOf(c03399j.A03())));
        }
        throw new IOException(A00(0, 28, 58));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.A01) {
            return;
        }
        this.A01 = true;
        this.A02.close();
    }
}
