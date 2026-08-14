package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.g.e.g;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.y f384a = new com.applovin.exoplayer2.l.y(10);

    public com.applovin.exoplayer2.g.a a(i iVar, g.a aVar) throws IOException {
        com.applovin.exoplayer2.g.a aVarA = null;
        int i = 0;
        while (true) {
            try {
                iVar.d(this.f384a.d(), 0, 10);
                this.f384a.d(0);
                if (this.f384a.m() != 4801587) {
                    break;
                }
                this.f384a.e(3);
                int iV = this.f384a.v();
                int i2 = iV + 10;
                if (aVarA == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.f384a.d(), 0, bArr, 0, 10);
                    iVar.d(bArr, 10, iV);
                    aVarA = new com.applovin.exoplayer2.g.e.g(aVar).a(bArr, i2);
                } else {
                    iVar.c(iV);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        iVar.a();
        iVar.c(i);
        return aVarA;
    }
}
