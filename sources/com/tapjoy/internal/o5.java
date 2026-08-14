package com.tapjoy.internal;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class o5 implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1872a;
    public final Thread b;
    public final Looper c;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Method f1873a;
        public final /* synthetic */ Object[] b;

        public a(Method method, Object[] objArr) {
            this.f1873a = method;
            this.b = objArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f1873a.invoke(o5.this.f1872a, this.b);
            } catch (IllegalAccessException e) {
                com.tapjoy.internal.a.a(e);
                throw null;
            } catch (IllegalArgumentException e2) {
                com.tapjoy.internal.a.a(e2);
                throw null;
            } catch (InvocationTargetException e3) {
                com.tapjoy.internal.a.a(e3);
                throw null;
            }
        }
    }

    public o5(Object obj, Thread thread, Looper looper) {
        this.f1872a = obj;
        this.b = thread;
        this.c = looper;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        if (this.b == Thread.currentThread()) {
            return method.invoke(this.f1872a, objArr);
        }
        if (!method.getReturnType().equals(Void.TYPE)) {
            StringBuilder sbA = w1.a("method not return void: ");
            sbA.append(method.getName());
            throw new UnsupportedOperationException(sbA.toString());
        }
        a aVar = new a(method, objArr);
        Looper looper = this.c;
        if (looper != null && new Handler(looper).post(aVar)) {
            return null;
        }
        if (this.b == p6.c.a() && p6.d.a(aVar)) {
            return null;
        }
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null || !new Handler(mainLooper).post(aVar)) {
            return method.invoke(this.f1872a, objArr);
        }
        return null;
    }
}
