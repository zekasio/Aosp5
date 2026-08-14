package com.tapjoy.internal;

import com.tapjoy.internal.k8;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class h7 implements s1<k8.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z6 f1811a;
    public final Map<String, g7> b = Collections.synchronizedMap(new HashMap());
    public final Map<String, k8> c = new HashMap();

    public h7(z6 z6Var) {
        this.f1811a = z6Var;
    }

    public void a() {
        synchronized (this) {
        }
    }

    public final void a(List<String> list) {
        synchronized (this) {
            new HashSet(list);
        }
    }

    @Override // com.tapjoy.internal.s1
    public void a(n1<k8.a> n1Var, k8.a aVar) {
        if (n1Var instanceof k8) {
            List<String> list = aVar.b;
            if (list != null) {
                a(list);
            }
            k8 k8Var = (k8) n1Var;
            String str = k8Var.i;
            boolean z = k8Var.j;
            this.c.remove(str);
            if (!z) {
                this.b.put(str, aVar.f1840a);
            }
            g7 g7Var = aVar.f1840a;
            a7 a7VarB = this.f1811a.b();
            if (g7Var instanceof f7) {
                a.b("No content for \"%s\"", str);
                a7VarB.c(str);
                return;
            }
            a.b("New content for \"%s\" is ready", str);
            if (z) {
                g7Var.a(a7VarB);
                return;
            } else {
                a7VarB.b(str);
                return;
            }
        }
        throw new IllegalStateException(n1Var.getClass().getName());
    }

    @Override // com.tapjoy.internal.s1
    public void a(n1<k8.a> n1Var, Throwable th) {
        a(n1Var, new k8.a(new f7(), null));
    }
}
