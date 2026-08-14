package com.applovin.exoplayer2.i;

import com.applovin.exoplayer2.c.i;

/* JADX INFO: loaded from: classes.dex */
final class e extends k {
    private final i.a<k> c;

    public e(i.a<k> aVar) {
        this.c = aVar;
    }

    @Override // com.applovin.exoplayer2.c.i
    public final void f() {
        this.c.releaseOutputBuffer(this);
    }
}
