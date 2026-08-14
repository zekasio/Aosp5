package com.tapjoy.internal;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public class a7 implements m6 {
    public static final a7 c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m6 f1748a;
    public final o0 b;

    public static class a extends a7 {
        public a() {
            super((a) null);
        }

        @Override // com.tapjoy.internal.a7, com.tapjoy.internal.m6
        public void a(String str) {
        }

        @Override // com.tapjoy.internal.a7, com.tapjoy.internal.m6
        public void a(String str, k6 k6Var) {
        }

        @Override // com.tapjoy.internal.a7, com.tapjoy.internal.m6
        public void a(String str, String str2, k6 k6Var) {
        }

        @Override // com.tapjoy.internal.a7, com.tapjoy.internal.m6
        public void b(String str) {
        }

        @Override // com.tapjoy.internal.a7, com.tapjoy.internal.m6
        public void c(String str) {
        }

        @Override // com.tapjoy.internal.a7, com.tapjoy.internal.m6
        public void d(String str) {
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f1749a;

        public b(String str) {
            this.f1749a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            a7.this.f1748a.c(this.f1749a);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f1750a;

        public c(String str) {
            this.f1750a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            a7.this.f1748a.b(this.f1750a);
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f1751a;

        public d(String str) {
            this.f1751a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            a7.this.f1748a.d(this.f1751a);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f1752a;

        public e(String str) {
            this.f1752a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            a7.this.f1748a.a(this.f1752a);
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f1753a;
        public final /* synthetic */ k6 b;

        public f(String str, k6 k6Var) {
            this.f1753a = str;
            this.b = k6Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            a7.this.f1748a.a(this.f1753a, this.b);
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f1754a;
        public final /* synthetic */ String b;
        public final /* synthetic */ k6 c;

        public g(String str, String str2, k6 k6Var) {
            this.f1754a = str;
            this.b = str2;
            this.c = k6Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            a7.this.f1748a.a(this.f1754a, this.b, this.c);
        }
    }

    public /* synthetic */ a7(a aVar) {
        this.f1748a = null;
        this.b = null;
    }

    public static a7 a(m6 m6Var) {
        if (m6Var instanceof a7) {
            throw new IllegalArgumentException();
        }
        return m6Var != null ? new a7(m6Var) : c;
    }

    @Override // com.tapjoy.internal.m6
    public void b(String str) {
        this.b.a(new c(str));
    }

    @Override // com.tapjoy.internal.m6
    public void c(String str) {
        this.b.a(new b(str));
    }

    @Override // com.tapjoy.internal.m6
    public void d(String str) {
        this.b.a(new d(str));
    }

    public a7(m6 m6Var) {
        Handler handlerB;
        this.f1748a = m6Var;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            handlerB = looperMyLooper == Looper.getMainLooper() ? com.tapjoy.internal.a.b() : new Handler(looperMyLooper);
        } else {
            handlerB = null;
        }
        if (handlerB != null) {
            this.b = new o(handlerB);
            handlerB.getLooper();
        } else if (Thread.currentThread() == p6.c.a()) {
            this.b = p6.d;
        } else {
            this.b = new o(com.tapjoy.internal.a.b());
        }
    }

    @Override // com.tapjoy.internal.m6
    public void a(String str) {
        this.b.a(new e(str));
    }

    @Override // com.tapjoy.internal.m6
    public void a(String str, k6 k6Var) {
        this.b.a(new f(str, k6Var));
    }

    @Override // com.tapjoy.internal.m6
    public void a(String str, String str2, k6 k6Var) {
        this.b.a(new g(str, str2, k6Var));
    }
}
