package com.applovin.exoplayer2.l;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Method f612a;

    public static IBinder a(Bundle bundle, String str) {
        if (ai.f611a >= 18) {
            return bundle.getBinder(str);
        }
        return b(bundle, str);
    }

    private static IBinder b(Bundle bundle, String str) {
        Method method = f612a;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", String.class);
                f612a = method2;
                method2.setAccessible(true);
                method = f612a;
            } catch (NoSuchMethodException e) {
                q.a("BundleUtil", "Failed to retrieve getIBinder method", e);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            q.a("BundleUtil", "Failed to invoke getIBinder via reflection", e2);
            return null;
        }
    }
}
