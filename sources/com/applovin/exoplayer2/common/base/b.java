package com.applovin.exoplayer2.common.base;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
abstract class b<T> implements Iterator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f231a = a.NOT_READY;

    @NullableDecl
    private T b;

    private enum a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected abstract T a();

    protected b() {
    }

    @NullableDecl
    protected final T b() {
        this.f231a = a.DONE;
        return null;
    }

    /* JADX INFO: renamed from: com.applovin.exoplayer2.common.base.b$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f232a;

        static {
            int[] iArr = new int[a.values().length];
            f232a = iArr;
            try {
                iArr[a.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f232a[a.DONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Preconditions.checkState(this.f231a != a.FAILED);
        int i = AnonymousClass1.f232a[this.f231a.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            return c();
        }
        return false;
    }

    private boolean c() {
        this.f231a = a.FAILED;
        this.b = a();
        if (this.f231a == a.DONE) {
            return false;
        }
        this.f231a = a.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f231a = a.NOT_READY;
        T t = this.b;
        this.b = null;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
