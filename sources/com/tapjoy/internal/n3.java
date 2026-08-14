package com.tapjoy.internal;

/* JADX INFO: loaded from: classes2.dex */
public class n3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o3 f1861a;

    public n3(o3 o3Var) {
        this.f1861a = o3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        w3 w3Var = this.f1861a.e;
        w3Var.b.a(new t3(w3Var));
    }
}
