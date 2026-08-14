package com.applovin.exoplayer2.k;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class z implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f603a;
    private long b;
    private Uri c = Uri.EMPTY;
    private Map<String, List<String>> d = Collections.emptyMap();

    public z(i iVar) {
        this.f603a = (i) com.applovin.exoplayer2.l.a.b(iVar);
    }

    public long d() {
        return this.b;
    }

    public Uri e() {
        return this.c;
    }

    public Map<String, List<String>> f() {
        return this.d;
    }

    @Override // com.applovin.exoplayer2.k.i
    public void a(aa aaVar) {
        com.applovin.exoplayer2.l.a.b(aaVar);
        this.f603a.a(aaVar);
    }

    @Override // com.applovin.exoplayer2.k.i
    public long a(l lVar) throws IOException {
        this.c = lVar.f581a;
        this.d = Collections.emptyMap();
        long jA = this.f603a.a(lVar);
        this.c = (Uri) com.applovin.exoplayer2.l.a.b(a());
        this.d = b();
        return jA;
    }

    @Override // com.applovin.exoplayer2.k.g
    public int a(byte[] bArr, int i, int i2) throws IOException {
        int iA = this.f603a.a(bArr, i, i2);
        if (iA != -1) {
            this.b += (long) iA;
        }
        return iA;
    }

    @Override // com.applovin.exoplayer2.k.i
    public Uri a() {
        return this.f603a.a();
    }

    @Override // com.applovin.exoplayer2.k.i
    public Map<String, List<String>> b() {
        return this.f603a.b();
    }

    @Override // com.applovin.exoplayer2.k.i
    public void c() throws IOException {
        this.f603a.c();
    }
}
