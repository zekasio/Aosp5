package com.tapjoy.internal;

import com.tapjoy.internal.b7;

/* JADX INFO: loaded from: classes2.dex */
public class y6 implements s1<Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1951a;
    public final /* synthetic */ z6 b;

    public y6(z6 z6Var, String str) {
        this.b = z6Var;
        this.f1951a = str;
    }

    @Override // com.tapjoy.internal.s1
    public void a(n1<Void> n1Var, Void r4) {
        b7 b7VarA = b7.a(this.b.e);
        String str = this.f1951a;
        ((b7.a) b7VarA.b).a(b7VarA.f1830a);
        if (str.equals(((b7.a) b7VarA.b).b(b7VarA.f1830a))) {
            ((b7.a) b7VarA.b).a(b7VarA.f1830a, true);
            ((b7.a) b7VarA.b).a(b7VarA.f1830a, 0L);
        }
    }

    @Override // com.tapjoy.internal.s1
    public void a(n1<Void> n1Var, Throwable th) {
    }
}
