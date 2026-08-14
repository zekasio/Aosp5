package com.applovin.exoplayer2.i.b;

import com.applovin.exoplayer2.i.d;
import com.applovin.exoplayer2.i.f;
import com.applovin.exoplayer2.l.y;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f497a;

    public a(List<byte[]> list) {
        super("DvbDecoder");
        y yVar = new y(list.get(0));
        this.f497a = new b(yVar.i(), yVar.i());
    }

    @Override // com.applovin.exoplayer2.i.d
    protected f a(byte[] bArr, int i, boolean z) {
        if (z) {
            this.f497a.a();
        }
        return new c(this.f497a.a(bArr, i));
    }
}
