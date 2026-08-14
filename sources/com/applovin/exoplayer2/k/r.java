package com.applovin.exoplayer2.k;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.k.t;
import com.applovin.exoplayer2.k.v;
import com.applovin.exoplayer2.k.w;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class r implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f590a;

    @Override // com.applovin.exoplayer2.k.v
    public /* synthetic */ void a(long j) {
        v.CC.$default$a(this, j);
    }

    public r() {
        this(-1);
    }

    public r(int i) {
        this.f590a = i;
    }

    @Override // com.applovin.exoplayer2.k.v
    public long a(v.a aVar) {
        IOException iOException = aVar.c;
        if ((iOException instanceof ai) || (iOException instanceof FileNotFoundException) || (iOException instanceof t.a) || (iOException instanceof w.g) || j.a(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((aVar.d - 1) * 1000, 5000);
    }

    @Override // com.applovin.exoplayer2.k.v
    public int a(int i) {
        int i2 = this.f590a;
        return i2 == -1 ? i == 7 ? 6 : 3 : i2;
    }
}
