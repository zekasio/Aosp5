package com.tapjoy.internal;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

/* JADX INFO: loaded from: classes2.dex */
public class t0 implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringWriter f1910a;
    public final f1 b;

    public t0() {
        StringWriter stringWriter = new StringWriter();
        this.f1910a = stringWriter;
        this.b = new f1(stringWriter);
    }

    public static String a(Object obj) {
        StringWriter stringWriter = new StringWriter();
        f1 f1Var = new f1(stringWriter);
        try {
            f1Var.a(obj);
            try {
                f1Var.flush();
                return stringWriter.toString();
            } catch (IOException e) {
                a.a(e);
                throw null;
            }
        } catch (IOException e2) {
            a.a(e2);
            throw null;
        }
    }

    public t0 b() {
        try {
            this.b.g();
            return this;
        } catch (IOException e) {
            a.a(e);
            throw null;
        }
    }

    public String toString() {
        try {
            this.b.f1796a.flush();
            return this.f1910a.toString();
        } catch (IOException e) {
            a.a(e);
            throw null;
        }
    }

    public t0 b(String str) {
        try {
            this.b.d(str);
            return this;
        } catch (IOException e) {
            a.a(e);
            throw null;
        }
    }

    @Override // com.tapjoy.internal.x0
    public void a(Writer writer) {
        try {
            this.b.f1796a.flush();
            writer.write(this.f1910a.toString());
        } catch (IOException e) {
            a.a(e);
            throw null;
        }
    }

    public t0 a() {
        try {
            this.b.e();
            return this;
        } catch (IOException e) {
            a.a(e);
            throw null;
        }
    }

    public t0 a(String str) {
        try {
            this.b.b(str);
            return this;
        } catch (IOException e) {
            a.a(e);
            throw null;
        }
    }

    public t0 a(x0 x0Var) {
        try {
            f1 f1Var = this.b;
            f1Var.a(false);
            x0Var.a(f1Var.f1796a);
            return this;
        } catch (IOException e) {
            a.a(e);
            throw null;
        }
    }

    public t0 a(long j) {
        try {
            f1 f1Var = this.b;
            f1Var.a(false);
            f1Var.f1796a.write(Long.toString(j));
            return this;
        } catch (IOException e) {
            a.a(e);
            throw null;
        }
    }

    public t0 a(Number number) {
        try {
            this.b.a(number);
            return this;
        } catch (IOException e) {
            a.a(e);
            throw null;
        }
    }
}
