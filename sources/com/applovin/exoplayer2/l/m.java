package com.applovin.exoplayer2.l;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f619a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseBooleanArray f620a = new SparseBooleanArray();
        private boolean b;

        public a a(int i) {
            com.applovin.exoplayer2.l.a.b(!this.b);
            this.f620a.append(i, true);
            return this;
        }

        public a a(int i, boolean z) {
            return z ? a(i) : this;
        }

        public a a(int... iArr) {
            for (int i : iArr) {
                a(i);
            }
            return this;
        }

        public a a(m mVar) {
            for (int i = 0; i < mVar.a(); i++) {
                a(mVar.b(i));
            }
            return this;
        }

        public m a() {
            com.applovin.exoplayer2.l.a.b(!this.b);
            this.b = true;
            return new m(this.f620a);
        }
    }

    private m(SparseBooleanArray sparseBooleanArray) {
        this.f619a = sparseBooleanArray;
    }

    public boolean a(int i) {
        return this.f619a.get(i);
    }

    public boolean a(int... iArr) {
        for (int i : iArr) {
            if (a(i)) {
                return true;
            }
        }
        return false;
    }

    public int a() {
        return this.f619a.size();
    }

    public int b(int i) {
        com.applovin.exoplayer2.l.a.a(i, 0, a());
        return this.f619a.keyAt(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (ai.f611a < 24) {
            if (a() != mVar.a()) {
                return false;
            }
            for (int i = 0; i < a(); i++) {
                if (b(i) != mVar.b(i)) {
                    return false;
                }
            }
            return true;
        }
        return this.f619a.equals(mVar.f619a);
    }

    public int hashCode() {
        if (ai.f611a < 24) {
            int iA = a();
            for (int i = 0; i < a(); i++) {
                iA = (iA * 31) + b(i);
            }
            return iA;
        }
        return this.f619a.hashCode();
    }
}
