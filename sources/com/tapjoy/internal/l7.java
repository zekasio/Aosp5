package com.tapjoy.internal;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public class l7 implements Flushable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f1844a;
    public final Object b = this;
    public l0<w4> c;

    public l7(File file) {
        this.f1844a = file;
        try {
            this.c = new j0(new d(file, new a(this)));
        } catch (Exception unused) {
            b();
        }
    }

    public boolean a() {
        boolean zIsEmpty;
        synchronized (this.b) {
            try {
                try {
                    zIsEmpty = this.c.isEmpty();
                } catch (Exception unused) {
                    b();
                    return true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zIsEmpty;
    }

    public final void b() {
        this.f1844a.delete();
        l0<w4> l0Var = this.c;
        if (l0Var instanceof Closeable) {
            try {
                ((Closeable) l0Var).close();
            } catch (Exception unused) {
            }
        }
        this.c = new k0(new LinkedList());
    }

    public int c() {
        int size;
        synchronized (this.b) {
            try {
                try {
                    size = this.c.size();
                } catch (Exception unused) {
                    b();
                    return 0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return size;
    }

    @Override // java.io.Flushable
    public void flush() {
        synchronized (this.b) {
            l0<w4> l0Var = this.c;
            if (l0Var instanceof Flushable) {
                try {
                    ((Flushable) l0Var).flush();
                } catch (Exception unused) {
                    b();
                }
            }
        }
    }

    public class a implements r0<w4> {
        public a(l7 l7Var) {
        }

        @Override // com.tapjoy.internal.r0
        public void a(OutputStream outputStream, w4 w4Var) {
            w4.B.a(outputStream, w4Var);
        }

        @Override // com.tapjoy.internal.r0
        public w4 a(InputStream inputStream) {
            return w4.B.a(inputStream);
        }
    }

    public void a(w4 w4Var) {
        synchronized (this.b) {
            try {
                this.c.add(w4Var);
            } catch (Exception unused) {
                b();
                try {
                    this.c.add(w4Var);
                } catch (Exception unused2) {
                }
            }
        }
    }

    public w4 c(int i) {
        w4 w4Var;
        synchronized (this.b) {
            try {
                try {
                    w4Var = this.c.get(i);
                } catch (Exception unused) {
                    b();
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return w4Var;
    }

    public void b(int i) {
        synchronized (this.b) {
            try {
                this.c.b(i);
            } catch (Exception unused) {
                b();
            }
        }
    }
}
