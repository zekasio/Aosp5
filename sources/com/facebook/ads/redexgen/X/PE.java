package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class PE extends InputStream {
    public int A00;
    public long A01;
    public InterfaceC0522He A02;
    public final Uri A03;
    public final C0946Xx A04;
    public final InterfaceC0521Hd A05;

    @Nullable
    public final String A06;

    public PE(C0946Xx c0946Xx, Uri uri, InterfaceC0521Hd interfaceC0521Hd) throws IOException {
        this.A04 = c0946Xx;
        this.A05 = interfaceC0521Hd;
        this.A03 = uri;
        this.A06 = C0755Qk.A08(this.A04, this.A03);
        A00(0);
    }

    private void A00(int i) throws IOException {
        InterfaceC0522He interfaceC0522He = this.A02;
        if (interfaceC0522He != null) {
            interfaceC0522He.close();
        }
        this.A02 = this.A05.A4E();
        this.A01 = (int) this.A02.ACw(new C0526Hi(this.A03, i, -1L, this.A06));
    }

    @Override // java.io.InputStream
    public final int available() {
        return ((int) this.A01) - this.A00;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.A02.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        return read(new byte[1]);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.A02.read(bArr, i, i2);
        this.A00 += i3;
        return i3;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        long j2 = this.A01 - ((long) this.A00);
        if (j2 <= 0) {
            return 0L;
        }
        if (j > j2) {
            j = j2;
        }
        this.A00 = (int) (((long) this.A00) + j);
        A00(this.A00);
        return j;
    }
}
