package com.tapjoy.internal;

import android.graphics.Bitmap;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/* JADX INFO: loaded from: classes2.dex */
public class y7 {
    public static final d0<URL, Bitmap> e;
    public static final u0<y7> f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public URL f1952a;
    public Bitmap b;
    public byte[] c;
    public f8 d;

    public static class a implements u0<y7> {
        @Override // com.tapjoy.internal.u0
        public y7 a(z0 z0Var) {
            return new y7(z0Var);
        }
    }

    static {
        g0 g0Var = new g0(10);
        boolean z = g0Var instanceof h0;
        d0<URL, Bitmap> e0Var = g0Var;
        if (!z) {
            e0Var = new e0(g0Var);
        }
        e = e0Var;
        f = new a();
    }

    public y7(URL url) {
        this.f1952a = url;
    }

    public f8 a() {
        return this.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x008b, code lost:
    
        r2 = java.lang.Long.parseLong(r5.substring(8));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.y7.b():void");
    }

    public final ByteArrayInputStream a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        com.tapjoy.internal.a.a(inputStream, (OutputStream) byteArrayOutputStream);
        byteArrayOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
        g8 g8Var = new g8();
        g8Var.a(byteArray);
        f8 f8VarB = g8Var.b();
        if (f8VarB.b == 0) {
            this.c = byteArray;
            this.d = f8VarB;
        } else {
            this.b = m.f1846a.a(byteArrayInputStream);
            byteArrayInputStream.reset();
        }
        return byteArrayInputStream;
    }

    public y7(z0 z0Var) throws IOException {
        if (z0Var.b()) {
            this.f1952a = z0Var.f();
            return;
        }
        a1 a1Var = (a1) z0Var;
        a1Var.k();
        String strT = a1Var.t();
        while (a1Var.o()) {
            if ("url".equals(strT)) {
                this.f1952a = z0Var.f();
            } else {
                a1Var.B();
            }
        }
        a1Var.n();
    }
}
