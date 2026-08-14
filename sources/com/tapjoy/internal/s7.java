package com.tapjoy.internal;

/* JADX INFO: loaded from: classes2.dex */
public class s7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u7 f1908a;

    public s7(u7 u7Var) {
        this.f1908a = u7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        u7 u7Var = this.f1908a;
        if (u7Var.f1924a == null) {
            return;
        }
        u7Var.a();
    }
}
