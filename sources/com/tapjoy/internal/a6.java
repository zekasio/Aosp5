package com.tapjoy.internal;

import com.tapjoy.internal.c6;
import com.tapjoy.internal.c6.b;
import java.util.Observable;
import java.util.Observer;

/* JADX INFO: loaded from: classes2.dex */
public class a6 implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c6 f1747a;

    public a6(c6 c6Var) {
        this.f1747a = c6Var;
    }

    @Override // java.util.Observer
    public void update(Observable observable, Object obj) {
        c6 c6Var;
        c6.a aVar;
        s5.b.deleteObserver(this);
        boolean zEquals = Boolean.TRUE.equals(obj);
        Boolean.valueOf(zEquals).getClass();
        if (zEquals || (aVar = (c6Var = this.f1747a).g) == null || aVar.f1769a == null) {
            return;
        }
        c6Var.e = c6Var.new b(null);
        new Thread(this.f1747a.e).start();
    }
}
