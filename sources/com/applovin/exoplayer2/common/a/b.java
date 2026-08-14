package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public abstract class b<T> extends ax<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f130a = a.NOT_READY;

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

    protected final T b() {
        this.f130a = a.DONE;
        return null;
    }

    /* JADX INFO: renamed from: com.applovin.exoplayer2.common.a.b$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f131a;

        static {
            int[] iArr = new int[a.values().length];
            f131a = iArr;
            try {
                iArr[a.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f131a[a.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Preconditions.checkState(this.f130a != a.FAILED);
        int i = AnonymousClass1.f131a[this.f130a.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return c();
        }
        return true;
    }

    private boolean c() {
        this.f130a = a.FAILED;
        this.b = a();
        if (this.f130a == a.DONE) {
            return false;
        }
        this.f130a = a.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f130a = a.NOT_READY;
        T t = this.b;
        this.b = null;
        return t;
    }
}
