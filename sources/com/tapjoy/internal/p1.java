package com.tapjoy.internal;

/* JADX INFO: loaded from: classes2.dex */
public class p1<Result> implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1<Result> f1878a;
    public final s1<Result> b;

    public p1(n1<Result> n1Var, s1<Result> s1Var) {
        this.f1878a = n1Var;
        this.b = s1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public void run() {
        try {
            Object objA = this.f1878a.a();
            s1<Result> s1Var = this.b;
            if (s1Var != null) {
                if (s1Var instanceof t1) {
                    ((t1) s1Var).a(this.f1878a, objA);
                } else {
                    s1Var.a(this.f1878a, (Result) objA);
                }
            }
        } catch (Throwable th) {
            s1<Result> s1Var2 = this.b;
            if (s1Var2 != null) {
                if (s1Var2 instanceof t1) {
                    ((t1) s1Var2).a((n1) this.f1878a, th);
                } else {
                    s1Var2.a((n1) this.f1878a, th);
                }
            }
        }
    }
}
