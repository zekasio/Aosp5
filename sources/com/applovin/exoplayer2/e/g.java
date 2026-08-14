package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.e.x;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class g implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f293a = new byte[4096];

    @Override // com.applovin.exoplayer2.e.x
    public /* synthetic */ int a(com.applovin.exoplayer2.k.g gVar, int i, boolean z) {
        return a(gVar, i, z, 0);
    }

    @Override // com.applovin.exoplayer2.e.x
    public void a(long j, int i, int i2, int i3, x.a aVar) {
    }

    @Override // com.applovin.exoplayer2.e.x
    public /* synthetic */ void a(com.applovin.exoplayer2.l.y yVar, int i) {
        a(yVar, i, 0);
    }

    @Override // com.applovin.exoplayer2.e.x
    public void a(com.applovin.exoplayer2.v vVar) {
    }

    @Override // com.applovin.exoplayer2.e.x
    public int a(com.applovin.exoplayer2.k.g gVar, int i, boolean z, int i2) throws IOException {
        int iA = gVar.a(this.f293a, 0, Math.min(this.f293a.length, i));
        if (iA != -1) {
            return iA;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.applovin.exoplayer2.e.x
    public void a(com.applovin.exoplayer2.l.y yVar, int i, int i2) {
        yVar.e(i);
    }
}
