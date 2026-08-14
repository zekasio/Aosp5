package com.tapjoy;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.tapjoy.internal.a;
import com.tapjoy.internal.e7;
import com.tapjoy.internal.n0;
import com.tapjoy.internal.t6;
import com.tapjoy.internal.u6;
import com.tapjoy.internal.w1;

/* JADX INFO: loaded from: classes2.dex */
public class TJPlacementManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n0<String, TJCorePlacement> f1695a = new n0<>();
    public static int b = 0;
    public static int c = 0;
    public static int d = 3;
    public static int e = 3;

    public static TJPlacement a(String str, String str2, String str3, TJPlacementListener tJPlacementListener) {
        TJPlacement tJPlacement;
        synchronized (f1695a) {
            tJPlacement = new TJPlacement(a(str, str2, str3, false, false), tJPlacementListener);
        }
        return tJPlacement;
    }

    public static boolean canCachePlacement() {
        return getCachedPlacementCount() < getCachedPlacementLimit();
    }

    public static boolean canPreRenderPlacement() {
        return getPreRenderedPlacementCount() < getPreRenderedPlacementLimit();
    }

    public static TJPlacement createPlacement(Context context, String str, boolean z, TJPlacementListener tJPlacementListener) {
        TJCorePlacement tJCorePlacementA = a(str, (String) null, (String) null, z, false);
        tJCorePlacementA.a(z);
        tJCorePlacementA.setContext(context);
        return new TJPlacement(tJCorePlacementA, tJPlacementListener);
    }

    public static void decrementPlacementCacheCount() {
        int i = b - 1;
        b = i;
        if (i < 0) {
            b = 0;
        }
        printPlacementCacheInformation();
    }

    public static void decrementPlacementPreRenderCount() {
        int i = c - 1;
        c = i;
        if (i < 0) {
            c = 0;
        }
    }

    public static void dismissContentShowing(boolean z) {
        TJAdUnitActivity tJAdUnitActivity;
        if (z && (tJAdUnitActivity = TJAdUnitActivity.l) != null) {
            tJAdUnitActivity.a(true);
        }
        e7 e7Var = e7.l;
        if (e7Var != null) {
            e7Var.c();
        }
        u6 u6Var = u6.p;
        if (u6Var != null) {
            t6 t6Var = new t6(u6Var);
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == null || mainLooper.getThread() != Thread.currentThread()) {
                a.b().post(t6Var);
            } else {
                t6Var.run();
            }
        }
    }

    public static int getCachedPlacementCount() {
        return b;
    }

    public static int getCachedPlacementLimit() {
        return d;
    }

    public static int getPreRenderedPlacementCount() {
        return c;
    }

    public static int getPreRenderedPlacementLimit() {
        return e;
    }

    public static void incrementPlacementCacheCount() {
        int i = b + 1;
        b = i;
        int i2 = d;
        if (i > i2) {
            b = i2;
        }
        printPlacementCacheInformation();
    }

    public static void incrementPlacementPreRenderCount() {
        int i = c + 1;
        c = i;
        int i2 = e;
        if (i > i2) {
            c = i2;
        }
    }

    public static void printPlacementCacheInformation() {
        StringBuilder sbA = w1.a("Space available in placement cache: ");
        sbA.append(b);
        sbA.append(" out of ");
        sbA.append(d);
        TapjoyLog.i("TJPlacementManager", sbA.toString());
    }

    public static void printPlacementPreRenderInformation() {
        StringBuilder sbA = w1.a("Space available for placement pre-render: ");
        sbA.append(c);
        sbA.append(" out of ");
        sbA.append(e);
        TapjoyLog.i("TJPlacementManager", sbA.toString());
    }

    public static void setCachedPlacementLimit(int i) {
        d = i;
    }

    public static void setPreRenderedPlacementLimit(int i) {
        e = i;
    }

    public static TJPlacement a(String str, String str2, String str3, TJPlacementListener tJPlacementListener, boolean z) {
        TJPlacement tJPlacement;
        synchronized (f1695a) {
            tJPlacement = new TJPlacement(a(str, str2, str3, false, z), tJPlacementListener);
        }
        return tJPlacement;
    }

    public static TJCorePlacement a(String str) {
        TJCorePlacement tJCorePlacement;
        n0<String, TJCorePlacement> n0Var = f1695a;
        synchronized (n0Var) {
            tJCorePlacement = n0Var.get(str);
        }
        return tJCorePlacement;
    }

    public static TJCorePlacement a(String str, String str2, String str3, boolean z, boolean z2) {
        TJCorePlacement tJCorePlacementA;
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "!SYSTEM!" : "");
        sb.append(!TextUtils.isEmpty(str) ? str : "");
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        sb.append(str2);
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        sb.append(str3);
        sb.append(Boolean.toString(z2));
        String string = sb.toString();
        TapjoyLog.d("TJPlacementManager", "TJCorePlacement key=" + string);
        n0<String, TJCorePlacement> n0Var = f1695a;
        synchronized (n0Var) {
            tJCorePlacementA = a(string);
            if (tJCorePlacementA == null) {
                tJCorePlacementA = new TJCorePlacement(str, string, z2);
                n0Var.put(string, tJCorePlacementA);
                TapjoyLog.d("TJPlacementManager", "Created TJCorePlacement with GUID: " + tJCorePlacementA.b());
            }
        }
        return tJCorePlacementA;
    }
}
