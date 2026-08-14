package com.applovin.exoplayer2.j;

import com.applovin.exoplayer2.h.ac;
import com.applovin.exoplayer2.j.d;
import com.applovin.exoplayer2.v;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final ac f553a;
    protected final int b;
    protected final int[] c;
    private final int d;
    private final v[] e;
    private final long[] f;
    private int g;

    @Override // com.applovin.exoplayer2.j.d
    public void a() {
    }

    @Override // com.applovin.exoplayer2.j.d
    public void a(float f) {
    }

    @Override // com.applovin.exoplayer2.j.d
    public /* synthetic */ void a(boolean z) {
        d.CC.$default$a(this, z);
    }

    @Override // com.applovin.exoplayer2.j.d
    public void b() {
    }

    @Override // com.applovin.exoplayer2.j.d
    public /* synthetic */ void g() {
        d.CC.$default$g(this);
    }

    @Override // com.applovin.exoplayer2.j.d
    public /* synthetic */ void h() {
        d.CC.$default$h(this);
    }

    public b(ac acVar, int[] iArr, int i) {
        int i2 = 0;
        com.applovin.exoplayer2.l.a.b(iArr.length > 0);
        this.d = i;
        this.f553a = (ac) com.applovin.exoplayer2.l.a.b(acVar);
        int length = iArr.length;
        this.b = length;
        this.e = new v[length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            this.e[i3] = acVar.a(iArr[i3]);
        }
        Arrays.sort(this.e, new Comparator() { // from class: com.applovin.exoplayer2.j.b$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return b.a((v) obj, (v) obj2);
            }
        });
        this.c = new int[this.b];
        while (true) {
            int i4 = this.b;
            if (i2 < i4) {
                this.c[i2] = acVar.a(this.e[i2]);
                i2++;
            } else {
                this.f = new long[i4];
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(v vVar, v vVar2) {
        return vVar2.h - vVar.h;
    }

    @Override // com.applovin.exoplayer2.j.g
    public final ac d() {
        return this.f553a;
    }

    @Override // com.applovin.exoplayer2.j.g
    public final int e() {
        return this.c.length;
    }

    @Override // com.applovin.exoplayer2.j.g
    public final v a(int i) {
        return this.e[i];
    }

    @Override // com.applovin.exoplayer2.j.g
    public final int b(int i) {
        return this.c[i];
    }

    @Override // com.applovin.exoplayer2.j.d
    public final v f() {
        return this.e[c()];
    }

    public int hashCode() {
        if (this.g == 0) {
            this.g = (System.identityHashCode(this.f553a) * 31) + Arrays.hashCode(this.c);
        }
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f553a == bVar.f553a && Arrays.equals(this.c, bVar.c);
    }
}
