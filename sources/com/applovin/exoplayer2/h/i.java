package com.applovin.exoplayer2.h;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class i implements com.applovin.exoplayer2.k.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.k.i f466a;
    private final int b;
    private final a c;
    private final byte[] d;
    private int e;

    public interface a {
        void a(com.applovin.exoplayer2.l.y yVar);
    }

    public i(com.applovin.exoplayer2.k.i iVar, int i, a aVar) {
        com.applovin.exoplayer2.l.a.a(i > 0);
        this.f466a = iVar;
        this.b = i;
        this.c = aVar;
        this.d = new byte[1];
        this.e = i;
    }

    @Override // com.applovin.exoplayer2.k.i
    public void a(com.applovin.exoplayer2.k.aa aaVar) {
        com.applovin.exoplayer2.l.a.b(aaVar);
        this.f466a.a(aaVar);
    }

    @Override // com.applovin.exoplayer2.k.i
    public long a(com.applovin.exoplayer2.k.l lVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.applovin.exoplayer2.k.g
    public int a(byte[] bArr, int i, int i2) throws IOException {
        if (this.e == 0) {
            if (!d()) {
                return -1;
            }
            this.e = this.b;
        }
        int iA = this.f466a.a(bArr, i, Math.min(this.e, i2));
        if (iA != -1) {
            this.e -= iA;
        }
        return iA;
    }

    @Override // com.applovin.exoplayer2.k.i
    public Uri a() {
        return this.f466a.a();
    }

    @Override // com.applovin.exoplayer2.k.i
    public Map<String, List<String>> b() {
        return this.f466a.b();
    }

    @Override // com.applovin.exoplayer2.k.i
    public void c() {
        throw new UnsupportedOperationException();
    }

    private boolean d() throws IOException {
        if (this.f466a.a(this.d, 0, 1) == -1) {
            return false;
        }
        int i = (this.d[0] & 255) << 4;
        if (i == 0) {
            return true;
        }
        byte[] bArr = new byte[i];
        int i2 = i;
        int i3 = 0;
        while (i2 > 0) {
            int iA = this.f466a.a(bArr, i3, i2);
            if (iA == -1) {
                return false;
            }
            i3 += iA;
            i2 -= iA;
        }
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        if (i > 0) {
            this.c.a(new com.applovin.exoplayer2.l.y(bArr, i));
        }
        return true;
    }
}
