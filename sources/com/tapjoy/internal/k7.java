package com.tapjoy.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static k7 f1838a;
    public static a b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1839a;
        public final String b;
        public final j5 c;
    }

    public static void a(k7 k7Var) {
        synchronized (k7.class) {
            f1838a = k7Var;
            a aVar = b;
            if (aVar != null) {
                b = null;
                ((u5) k7Var).c.c(aVar);
            }
        }
    }

    public abstract boolean a();
}
