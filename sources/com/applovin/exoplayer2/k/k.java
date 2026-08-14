package com.applovin.exoplayer2.k;

import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;

/* JADX INFO: loaded from: classes.dex */
public final class k extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f580a;
    private final l b;
    private long f;
    private boolean d = false;
    private boolean e = false;
    private final byte[] c = new byte[1];

    public k(i iVar, l lVar) {
        this.f580a = iVar;
        this.b = lVar;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.c) == -1) {
            return -1;
        }
        return this.c[0] & UByte.MAX_VALUE;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        com.applovin.exoplayer2.l.a.b(!this.e);
        a();
        int iA = this.f580a.a(bArr, i, i2);
        if (iA == -1) {
            return -1;
        }
        this.f += (long) iA;
        return iA;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.e) {
            return;
        }
        this.f580a.c();
        this.e = true;
    }

    private void a() throws IOException {
        if (this.d) {
            return;
        }
        this.f580a.a(this.b);
        this.d = true;
    }
}
