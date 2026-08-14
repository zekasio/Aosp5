package com.applovin.exoplayer2.m.a;

import android.media.MediaFormat;
import com.applovin.exoplayer2.l.af;
import com.applovin.exoplayer2.m.l;
import com.applovin.exoplayer2.v;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
final class h implements a, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f648a;
    private final c b;
    private final af<Long> c;
    private final af<e> d;
    private volatile int e;
    private int f;
    private byte[] g;

    public void a(int i) {
        this.e = i;
    }

    @Override // com.applovin.exoplayer2.m.l
    public void a(long j, long j2, v vVar, MediaFormat mediaFormat) {
        this.c.a(j2, Long.valueOf(j));
        a(vVar.v, vVar.w, j2);
    }

    @Override // com.applovin.exoplayer2.m.a.a
    public void a(long j, float[] fArr) {
        this.b.a(j, fArr);
    }

    @Override // com.applovin.exoplayer2.m.a.a
    public void a() {
        this.c.a();
        this.b.a();
        this.f648a.set(true);
    }

    private void a(byte[] bArr, int i, long j) {
        byte[] bArr2 = this.g;
        int i2 = this.f;
        this.g = bArr;
        if (i == -1) {
            i = this.e;
        }
        this.f = i;
        if (i2 == i && Arrays.equals(bArr2, this.g)) {
            return;
        }
        byte[] bArr3 = this.g;
        e eVarA = bArr3 != null ? f.a(bArr3, this.f) : null;
        if (eVarA == null || !g.a(eVarA)) {
            eVarA = e.a(this.f);
        }
        this.d.a(j, eVarA);
    }
}
