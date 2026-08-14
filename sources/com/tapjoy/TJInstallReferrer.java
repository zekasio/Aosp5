package com.tapjoy;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.tapjoy.internal.z6;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class TJInstallReferrer implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f1682a = "Tapjoy";
    public Object b;
    public Context c;
    public SharedPreferences d;

    public final void a(Class cls, Object obj) {
        if (this.b != null) {
            Log.e(this.f1682a, "startConnection");
            try {
                a(this.b, "startConnection", new Class[]{cls}, obj);
            } catch (Exception e) {
                Log.e(this.f1682a, e.getMessage());
            } catch (NoClassDefFoundError e2) {
                Log.e(this.f1682a, e2.getMessage());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void init(android.content.Context r9) {
        /*
            r8 = this;
            android.content.Context r0 = r9.getApplicationContext()
            r8.c = r0
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != 0) goto Lc
            goto L45
        Lc:
            java.lang.String r4 = "com.android.installreferrer.api.InstallReferrerClient"
            java.lang.String r5 = "newBuilder"
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L2e java.lang.NoClassDefFoundError -> L30
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r3] = r7     // Catch: java.lang.Exception -> L2e java.lang.NoClassDefFoundError -> L30
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L2e java.lang.NoClassDefFoundError -> L30
            r7[r3] = r0     // Catch: java.lang.Exception -> L2e java.lang.NoClassDefFoundError -> L30
            java.lang.Class r0 = java.lang.Class.forName(r4)     // Catch: java.lang.Exception -> L2e java.lang.NoClassDefFoundError -> L30
            java.lang.Object r0 = a(r0, r5, r2, r6, r7)     // Catch: java.lang.Exception -> L2e java.lang.NoClassDefFoundError -> L30
            if (r0 != 0) goto L25
            goto L45
        L25:
            java.lang.String r4 = "build"
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L2e java.lang.NoClassDefFoundError -> L30
            java.lang.Object r0 = a(r0, r4, r2, r5)     // Catch: java.lang.Exception -> L2e java.lang.NoClassDefFoundError -> L30
            goto L46
        L2e:
            r0 = move-exception
            goto L32
        L30:
            r0 = move-exception
            goto L3c
        L32:
            java.lang.String r4 = r8.f1682a
            java.lang.String r0 = r0.getMessage()
            android.util.Log.e(r4, r0)
            goto L45
        L3c:
            java.lang.String r4 = r8.f1682a
            java.lang.String r0 = r0.getMessage()
            android.util.Log.e(r4, r0)
        L45:
            r0 = r2
        L46:
            r8.b = r0
            if (r0 != 0) goto L52
            java.lang.String r9 = r8.f1682a
            java.lang.String r0 = "Failed to activate InstallReferrerClient. No available InstallReferrrerClient."
            android.util.Log.e(r9, r0)
            return
        L52:
            java.lang.String r0 = "com.android.installreferrer.api.InstallReferrerStateListener"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L59 java.lang.NoClassDefFoundError -> L64
            goto L6f
        L59:
            r0 = move-exception
            java.lang.String r4 = r8.f1682a
            java.lang.String r0 = r0.getMessage()
            android.util.Log.e(r4, r0)
            goto L6e
        L64:
            r0 = move-exception
            java.lang.String r4 = r8.f1682a
            java.lang.String r0 = r0.getMessage()
            android.util.Log.e(r4, r0)
        L6e:
            r0 = r2
        L6f:
            if (r0 != 0) goto L79
            java.lang.String r9 = r8.f1682a
            java.lang.String r0 = "InstallReferrerClient setup failed. No available InstallReferrrerStateListener."
            android.util.Log.e(r9, r0)
            return
        L79:
            java.lang.ClassLoader r4 = r0.getClassLoader()     // Catch: java.lang.Exception -> L86
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L86
            r1[r3] = r0     // Catch: java.lang.Exception -> L86
            java.lang.Object r2 = java.lang.reflect.Proxy.newProxyInstance(r4, r1, r8)     // Catch: java.lang.Exception -> L86
            goto L90
        L86:
            r1 = move-exception
            java.lang.String r4 = r8.f1682a
            java.lang.String r1 = r1.getMessage()
            android.util.Log.e(r4, r1)
        L90:
            if (r2 != 0) goto L9a
            java.lang.String r9 = r8.f1682a
            java.lang.String r0 = "InstallReferrerClient setup failed. No available InstallReferrrerStateListener object."
            android.util.Log.e(r9, r0)
            return
        L9a:
            java.lang.String r1 = "com.tapjoy.referrer"
            android.content.SharedPreferences r9 = r9.getSharedPreferences(r1, r3)
            r8.d = r9
            java.lang.String r1 = "TJInstallReferrerDidSetUp"
            boolean r9 = r9.getBoolean(r1, r3)
            if (r9 != 0) goto Lb8
            r8.a(r0, r2)     // Catch: java.lang.Exception -> Lae
            goto Lb8
        Lae:
            r9 = move-exception
            java.lang.String r0 = r8.f1682a
            java.lang.String r9 = r9.getMessage()
            android.util.Log.e(r0, r9)
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.TJInstallReferrer.init(android.content.Context):void");
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        Context context;
        if (method == null) {
            Log.e(this.f1682a, "Failed to invoke null method");
            return null;
        }
        String name = method.getName();
        if (name == null) {
            Log.e(this.f1682a, "Failed to invoke null method name");
            return null;
        }
        if (objArr == null) {
            Log.e(this.f1682a, "Invoking method with null args");
            objArr = new Object[0];
        }
        if (name.equals("onInstallReferrerSetupFinished")) {
            if (objArr.length != 1) {
                Log.e(this.f1682a, "Invalid args");
                return null;
            }
            Object obj2 = objArr[0];
            if (!(obj2 instanceof Integer)) {
                Log.e(this.f1682a, "Invalid args type.");
                return null;
            }
            Integer num = (Integer) obj2;
            if (num == null) {
                Log.e(this.f1682a, "onInstallReferrerSetupFinished response code can't be null");
                return null;
            }
            int iIntValue = num.intValue();
            if (iIntValue == 0) {
                try {
                    a();
                    Object obj3 = this.b;
                    if (obj3 != null) {
                        try {
                            a(obj3, "endConnection", null, new Object[0]);
                        } catch (Exception e) {
                            Log.e(this.f1682a, e.getMessage());
                        }
                    }
                } catch (Exception e2) {
                    Log.e(this.f1682a, e2.getMessage());
                }
            } else if (iIntValue == 1 || iIntValue != 2) {
                Log.e(this.f1682a, "Install referrer service isn't available");
            } else {
                Log.e(this.f1682a, "Install referrer isn't supported on the current Play Store app.");
            }
        } else if (name.equals("onInstallReferrerServiceDisconnected") && (context = this.c) != null) {
            init(context);
        }
        return null;
    }

    public final void a() {
        Object objA;
        SharedPreferences.Editor editorEdit = this.d.edit();
        editorEdit.putBoolean("TJInstallReferrerDidSetUp", true);
        editorEdit.apply();
        Object obj = this.b;
        String strValueOf = null;
        if (obj != null) {
            try {
                objA = a(obj, "getInstallReferrer", null, new Object[0]);
            } catch (Exception e) {
                Log.e(this.f1682a, e.getMessage());
                objA = null;
            }
        } else {
            objA = null;
        }
        if (objA == null) {
            editorEdit.putBoolean("TJInstallReferrerDidSetUp", false);
            Log.e(this.f1682a, "Failed to get ReferrerDetails instance.");
        } else {
            try {
                strValueOf = String.valueOf(a(objA, "getInstallReferrer", null, new Object[0]));
            } catch (Exception e2) {
                Log.e(this.f1682a, e2.getMessage());
            }
            z6.r.a(this.c, strValueOf);
        }
    }

    public static Object a(Object obj, String str, Class[] clsArr, Object... objArr) {
        try {
            return a(obj.getClass(), str, obj, clsArr, objArr);
        } catch (Exception e) {
            Log.e("Tapjoy", e.getMessage());
            return null;
        }
    }

    public static Object a(Class cls, String str, Object obj, Class[] clsArr, Object... objArr) {
        try {
            Method method = cls.getMethod(str, clsArr);
            if (method == null) {
                return null;
            }
            return method.invoke(obj, objArr);
        } catch (Exception e) {
            Log.e("Tapjoy", e.getMessage());
            return null;
        }
    }
}
