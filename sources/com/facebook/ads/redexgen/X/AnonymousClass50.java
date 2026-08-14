package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.50, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class AnonymousClass50<T> implements InvocationHandler {
    public static byte[] A02;
    public static String[] A03 = {"HJBbstbFgkhP2Es2YC6tj0WPrL", "4IOUVAMDExjQBHSpAfoXSYCtPyIaCI88", "z5PEOWpVsYBM96D6", "SPmK69spxohqfCa0SsQ", "2TZuMIK", "01EkjjI8QhZqdiHuXsMGI", "efeA7FnPjHODjVcAjRmk7", "pSZyNCg"};
    public ClassLoader A00;
    public T A01;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A03[2].length() != 16) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[6] = "7LVLxstLm7VGVuwpoPddR";
            strArr[5] = "O4Ajby3FQpCfAUdim7NmB";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 40);
            i4++;
        }
    }

    public static void A03() {
        A02 = new byte[]{-20, -5, -12};
    }

    static {
        A03();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.50 != com.facebook.ads.internal.apiimp.AdApiProxy$ProxyInvocationHandler<T> */
    public AnonymousClass50(T impl, ClassLoader classLoader) {
        this.A01 = impl;
        this.A00 = classLoader;
    }

    @Nullable
    public static Object A00(final ClassLoader classLoader, Method method) {
        Class<?> returnType = method.getReturnType();
        if (returnType.equals(Void.TYPE)) {
            return null;
        }
        if (returnType.isPrimitive()) {
            return Array.get(Array.newInstance(method.getReturnType(), 1), 0);
        }
        if (returnType.equals(String.class)) {
            return A02(0, 0, 23);
        }
        if (!returnType.isInterface()) {
            return null;
        }
        return Proxy.newProxyInstance(classLoader, new Class[]{returnType}, new InvocationHandler() { // from class: com.facebook.ads.redexgen.X.4z
            @Override // java.lang.reflect.InvocationHandler
            @Nullable
            public final Object invoke(Object obj, Method method2, Object[] objArr) {
                return AnonymousClass50.A00(classLoader, method2);
            }
        });
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.50 != com.facebook.ads.internal.apiimp.AdApiProxy$ProxyInvocationHandler<T> */
    public final T A04() {
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.50 != com.facebook.ads.internal.apiimp.AdApiProxy$ProxyInvocationHandler<T> */
    @Override // java.lang.reflect.InvocationHandler
    @SuppressLint({"CatchGeneralException"})
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        try {
            return method.invoke(this.A01, objArr);
        } catch (Throwable th) {
            if (th instanceof InvocationTargetException) {
                Throwable targetException = th.getTargetException();
                if (targetException instanceof C01601w) {
                    throw new IllegalStateException(targetException.getMessage());
                }
            }
            Object objA00 = A00(this.A00, method);
            C0946Xx c0946XxA00 = C8T.A00();
            if (c0946XxA00 != null) {
                c0946XxA00.A06().A8y(A02(0, 3, 99), C03298z.A0O, new AnonymousClass90(th));
                return objA00;
            }
            return objA00;
        }
    }
}
