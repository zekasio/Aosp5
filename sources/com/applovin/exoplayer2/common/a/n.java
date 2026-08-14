package com.applovin.exoplayer2.common.a;

import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final n f156a = new n() { // from class: com.applovin.exoplayer2.common.a.n.1
        @Override // com.applovin.exoplayer2.common.a.n
        public int b() {
            return 0;
        }

        @Override // com.applovin.exoplayer2.common.a.n
        public <T> n a(@NullableDecl T t, @NullableDecl T t2, Comparator<T> comparator) {
            return a(comparator.compare(t, t2));
        }

        @Override // com.applovin.exoplayer2.common.a.n
        public n a(int i, int i2) {
            return a(com.applovin.exoplayer2.common.b.c.a(i, i2));
        }

        @Override // com.applovin.exoplayer2.common.a.n
        public n a(long j, long j2) {
            return a(com.applovin.exoplayer2.common.b.d.a(j, j2));
        }

        @Override // com.applovin.exoplayer2.common.a.n
        public n a(boolean z, boolean z2) {
            return a(com.applovin.exoplayer2.common.b.a.a(z2, z));
        }

        @Override // com.applovin.exoplayer2.common.a.n
        public n b(boolean z, boolean z2) {
            return a(com.applovin.exoplayer2.common.b.a.a(z, z2));
        }

        n a(int i) {
            if (i < 0) {
                return n.b;
            }
            return i > 0 ? n.c : n.f156a;
        }
    };
    private static final n b = new a(-1);
    private static final n c = new a(1);

    public abstract n a(int i, int i2);

    public abstract n a(long j, long j2);

    public abstract <T> n a(@NullableDecl T t, @NullableDecl T t2, Comparator<T> comparator);

    public abstract n a(boolean z, boolean z2);

    public abstract int b();

    public abstract n b(boolean z, boolean z2);

    private n() {
    }

    public static n a() {
        return f156a;
    }

    private static final class a extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f157a;

        @Override // com.applovin.exoplayer2.common.a.n
        public n a(int i, int i2) {
            return this;
        }

        @Override // com.applovin.exoplayer2.common.a.n
        public n a(long j, long j2) {
            return this;
        }

        @Override // com.applovin.exoplayer2.common.a.n
        public <T> n a(@NullableDecl T t, @NullableDecl T t2, @NullableDecl Comparator<T> comparator) {
            return this;
        }

        @Override // com.applovin.exoplayer2.common.a.n
        public n a(boolean z, boolean z2) {
            return this;
        }

        @Override // com.applovin.exoplayer2.common.a.n
        public n b(boolean z, boolean z2) {
            return this;
        }

        a(int i) {
            super();
            this.f157a = i;
        }

        @Override // com.applovin.exoplayer2.common.a.n
        public int b() {
            return this.f157a;
        }
    }
}
