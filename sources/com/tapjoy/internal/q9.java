package com.tapjoy.internal;

import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.app.NotificationCompatExtras;
import androidx.core.app.NotificationCompatJellybean;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class q9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f1892a = new Object();
    public static Field b;
    public static boolean c;

    public static SparseArray<Bundle> a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    public static Bundle a(Notification notification) {
        synchronized (f1892a) {
            if (c) {
                return null;
            }
            try {
                if (b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e(NotificationCompatJellybean.TAG, "Notification.extras field is not of type Bundle");
                        c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    b = declaredField;
                }
                Bundle bundle = (Bundle) b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e) {
                Log.e(NotificationCompatJellybean.TAG, "Unable to access notification extras", e);
                c = true;
                return null;
            } catch (NoSuchFieldException e2) {
                Log.e(NotificationCompatJellybean.TAG, "Unable to access notification extras", e2);
                c = true;
                return null;
            }
        }
    }

    public static Bundle[] a(r9[] r9VarArr) {
        if (r9VarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[r9VarArr.length];
        if (r9VarArr.length <= 0) {
            return bundleArr;
        }
        r9 r9Var = r9VarArr[0];
        new Bundle();
        throw null;
    }

    public static Bundle a(Notification.Builder builder, l9 l9Var) {
        builder.addAction(l9Var.e, l9Var.f, l9Var.g);
        Bundle bundle = new Bundle(l9Var.f1845a);
        r9[] r9VarArr = l9Var.b;
        if (r9VarArr != null) {
            bundle.putParcelableArray(NotificationCompatExtras.EXTRA_REMOTE_INPUTS, a(r9VarArr));
        }
        r9[] r9VarArr2 = l9Var.c;
        if (r9VarArr2 != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", a(r9VarArr2));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", l9Var.d);
        return bundle;
    }
}
