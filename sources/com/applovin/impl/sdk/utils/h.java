package com.applovin.impl.sdk.utils;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.StrictMode;
import android.view.Display;
import android.view.RoundedCorner;
import android.view.WindowManager;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Integer, Point> f1451a = CollectionUtils.map(2);

    public static boolean b() {
        return true;
    }

    public static boolean c() {
        return true;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f1452a;
        int b;
        int c;
        int d;

        /* JADX INFO: renamed from: com.applovin.impl.sdk.utils.h$a$a, reason: collision with other inner class name */
        public static class C0081a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f1453a;
            private int b;
            private int c;
            private int d;

            C0081a() {
            }

            public C0081a a(int i) {
                this.f1453a = i;
                return this;
            }

            public a a() {
                return new a(this.f1453a, this.b, this.c, this.d);
            }

            public C0081a b(int i) {
                this.b = i;
                return this;
            }

            public C0081a c(int i) {
                this.c = i;
                return this;
            }

            public C0081a d(int i) {
                this.d = i;
                return this;
            }

            public String toString() {
                return "CompatibilityUtils.ScreenCornerRadii.ScreenCornerRadiiBuilder(topLeft=" + this.f1453a + ", topRight=" + this.b + ", bottomLeft=" + this.c + ", bottomRight=" + this.d + ")";
            }
        }

        protected boolean a(Object obj) {
            return obj instanceof a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.a(this) && a() == aVar.a() && b() == aVar.b() && c() == aVar.c() && d() == aVar.d();
        }

        public int hashCode() {
            return ((((((a() + 59) * 59) + b()) * 59) + c()) * 59) + d();
        }

        public String toString() {
            return "CompatibilityUtils.ScreenCornerRadii(topLeft=" + a() + ", topRight=" + b() + ", bottomLeft=" + c() + ", bottomRight=" + d() + ")";
        }

        a(int i, int i2, int i3, int i4) {
            this.f1452a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        public int a() {
            return this.f1452a;
        }

        public int b() {
            return this.b;
        }

        public int c() {
            return this.c;
        }

        public int d() {
            return this.d;
        }
    }

    public static void a() {
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
        } catch (Throwable unused) {
        }
    }

    public static Point a(Context context) {
        int orientation = AppLovinSdkUtils.getOrientation(context);
        Map<Integer, Point> map = f1451a;
        if (map.containsKey(Integer.valueOf(orientation))) {
            return map.get(Integer.valueOf(orientation));
        }
        Point point = new Point();
        point.x = 480;
        point.y = 320;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            if (b()) {
                defaultDisplay.getRealSize(point);
            } else {
                defaultDisplay.getSize(point);
            }
        }
        StrictMode.setVmPolicy(vmPolicy);
        map.put(Integer.valueOf(orientation), point);
        return point;
    }

    public static a a(Context context, com.applovin.impl.sdk.p pVar) {
        a aVarA = null;
        if (((Boolean) pVar.a(com.applovin.impl.sdk.c.b.ef)).booleanValue() && k()) {
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                try {
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    aVarA = new a.C0081a().a(a(0, defaultDisplay)).b(a(1, defaultDisplay)).c(a(3, defaultDisplay)).d(a(2, defaultDisplay)).a();
                } catch (Throwable unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        }
        return aVarA;
    }

    private static int a(int i, Display display) {
        RoundedCorner roundedCorner = display.getRoundedCorner(i);
        if (roundedCorner != null) {
            return roundedCorner.getRadius();
        }
        return -1;
    }

    public static boolean d() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public static boolean e() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean i() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean j() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean k() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static boolean l() {
        return Build.VERSION.SDK_INT >= 33;
    }

    public static boolean a(String str, Context context) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }
}
