package com.applovin.exoplayer2.h;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
final class ab<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f456a;
    private final SparseArray<V> b;
    private final com.applovin.exoplayer2.l.h<V> c;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Object obj) {
    }

    public ab() {
        this(new com.applovin.exoplayer2.l.h() { // from class: com.applovin.exoplayer2.h.ab$$ExternalSyntheticLambda0
            @Override // com.applovin.exoplayer2.l.h
            public final void accept(Object obj) {
                ab.a(obj);
            }
        });
    }

    public ab(com.applovin.exoplayer2.l.h<V> hVar) {
        this.b = new SparseArray<>();
        this.c = hVar;
        this.f456a = -1;
    }

    public V a(int i) {
        if (this.f456a == -1) {
            this.f456a = 0;
        }
        while (true) {
            int i2 = this.f456a;
            if (i2 <= 0 || i >= this.b.keyAt(i2)) {
                break;
            }
            this.f456a--;
        }
        while (this.f456a < this.b.size() - 1 && i >= this.b.keyAt(this.f456a + 1)) {
            this.f456a++;
        }
        return this.b.valueAt(this.f456a);
    }

    public void a(int i, V v) {
        if (this.f456a == -1) {
            com.applovin.exoplayer2.l.a.b(this.b.size() == 0);
            this.f456a = 0;
        }
        if (this.b.size() > 0) {
            SparseArray<V> sparseArray = this.b;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            com.applovin.exoplayer2.l.a.a(i >= iKeyAt);
            if (iKeyAt == i) {
                com.applovin.exoplayer2.l.h<V> hVar = this.c;
                SparseArray<V> sparseArray2 = this.b;
                hVar.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.b.append(i, v);
    }

    public V a() {
        return this.b.valueAt(r0.size() - 1);
    }

    public void b(int i) {
        int i2 = 0;
        while (i2 < this.b.size() - 1) {
            int i3 = i2 + 1;
            if (i < this.b.keyAt(i3)) {
                return;
            }
            this.c.accept(this.b.valueAt(i2));
            this.b.removeAt(i2);
            int i4 = this.f456a;
            if (i4 > 0) {
                this.f456a = i4 - 1;
            }
            i2 = i3;
        }
    }

    public void c(int i) {
        for (int size = this.b.size() - 1; size >= 0 && i < this.b.keyAt(size); size--) {
            this.c.accept(this.b.valueAt(size));
            this.b.removeAt(size);
        }
        this.f456a = this.b.size() > 0 ? Math.min(this.f456a, this.b.size() - 1) : -1;
    }

    public void b() {
        for (int i = 0; i < this.b.size(); i++) {
            this.c.accept(this.b.valueAt(i));
        }
        this.f456a = -1;
        this.b.clear();
    }

    public boolean c() {
        return this.b.size() == 0;
    }
}
