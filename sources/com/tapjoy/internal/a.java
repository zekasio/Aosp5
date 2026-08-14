package com.tapjoy.internal;

import android.app.Activity;
import android.app.Notification;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyAuctionFlags;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.model.ReportDBAdapter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Proxy;
import java.net.HttpURLConnection;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Handler f1743a;
    public static boolean b;

    public static float a(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    public static void a(q2 q2Var) {
        if (q2Var.g) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void a(String str, Exception exc) {
        if ((!d2.f1778a.booleanValue() || TextUtils.isEmpty(str)) && exc == null) {
            return;
        }
        Log.e("OMIDLIB", str, exc);
    }

    public static void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static String b(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility != 0) {
            return visibility != 4 ? visibility != 8 ? "viewNotVisible" : "viewGone" : "viewInvisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }

    public static void b(q2 q2Var) {
        if (!q2Var.e()) {
            throw new IllegalStateException("AdSession is not started");
        }
        a(q2Var);
    }

    public static <T> List<T> c() {
        return new h4(Collections.emptyList());
    }

    public static void d(String str) {
        if (b) {
            a(6, "Tapjoy", str, (Throwable) null);
        }
    }

    public static void e(String str) {
        if (b) {
            a(4, "Tapjoy", str, (Throwable) null);
        }
    }

    public static String f(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.length() == 0) {
            return null;
        }
        return strTrim;
    }

    public static String g(String str) {
        String strTrim;
        if (str == null || str.length() == 0 || (strTrim = str.trim()) == null || strTrim.length() == 0) {
            return null;
        }
        return strTrim;
    }

    public static boolean c(String str) {
        return b(Looper.myLooper() == Looper.getMainLooper(), str + ": Must be called on the main/ui thread");
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void d() {
        z6 z6Var = z6.r;
        if (z6Var.b("startSession") && z6Var.a()) {
            s6.b(null);
        }
    }

    public static String a(String str) {
        if (b(str)) {
            return null;
        }
        return str;
    }

    public static void b(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int a(Calendar calendar, Calendar calendar2) {
        Calendar calendar3;
        long timeInMillis;
        int iSignum = Integer.signum(calendar.get(1) - calendar2.get(1));
        if (iSignum == -1) {
            calendar3 = (Calendar) calendar2.clone();
            calendar3.set(calendar.get(1), calendar.get(2), calendar.get(5));
            timeInMillis = calendar2.getTimeInMillis();
        } else {
            if (iSignum != 1) {
                return calendar.get(6) - calendar2.get(6);
            }
            calendar3 = (Calendar) calendar.clone();
            calendar3.set(calendar2.get(1), calendar2.get(2), calendar2.get(5));
            timeInMillis = calendar.getTimeInMillis();
        }
        int i = 0;
        while (calendar3.getTimeInMillis() < timeInMillis) {
            calendar3.add(5, 1);
            i++;
        }
        return iSignum > 0 ? i : -i;
    }

    public static boolean b(String str) {
        return str == null || str.length() == 0;
    }

    public static synchronized Handler b() {
        if (f1743a == null) {
            f1743a = new Handler(Looper.getMainLooper());
        }
        return f1743a;
    }

    public static void b(String str, Object... objArr) {
        if (b) {
            b("Tapjoy", str, objArr);
        }
    }

    public static String b(String str, String str2, String str3) {
        if (str == null) {
            a(str2, str3, "must not be null");
            return null;
        }
        if (str.length() == 0) {
            a(str2, str3, "must not be empty");
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.length() != 0) {
            return strTrim;
        }
        a(str2, str3, "must not be blank");
        return null;
    }

    public static void b(Activity activity) {
        z6.r.b(activity);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static boolean m327b(Object obj, String str) {
        if (obj != null) {
            return true;
        }
        if (!b) {
            return false;
        }
        d(str);
        return false;
    }

    public static boolean b(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static boolean b(boolean z, String str) {
        if (!b || z) {
            return z;
        }
        d(str);
        throw new IllegalStateException(str);
    }

    public static void b(String str, String str2, Object... objArr) {
        a(4, str, String.format(str2, objArr), (Throwable) null);
    }

    public static <X extends Throwable> void a(Throwable th, Class<X> cls) {
        if (th == null || !cls.isInstance(th)) {
            return;
        }
        try {
            throw cls.cast(th);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static void a(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static <T> T a(T t, Class<T> cls) {
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new o5(t, Thread.currentThread(), Looper.myLooper()));
    }

    public static RuntimeException a(Throwable th) {
        th.getClass();
        a(th, Error.class);
        a(th, RuntimeException.class);
        throw new RuntimeException(th);
    }

    public static Activity a(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static String a(b5 b5Var) {
        t0 t0VarB = new t0().a().a(TapjoyConstants.TJC_SDK_PLACEMENT).b(b5Var.p).a("os_name").b(b5Var.g).a("os_ver").b(b5Var.h).a("device_id").b(b5Var.d).a("device_maker").b(b5Var.e).a("device_model").b(b5Var.f).a(TapjoyConstants.TJC_PACKAGE_ID).b(b5Var.n).a(TapjoyConstants.TJC_PACKAGE_SIGN).b(b5Var.o).a("locale").b(b5Var.l).a(TapjoyConstants.TJC_DEVICE_TIMEZONE).b(b5Var.m);
        if (b5Var.i != null) {
            t0VarB.a(TapjoyConstants.TJC_DEVICE_DISPLAY_DENSITY).a((Number) b5Var.i);
        }
        if (b5Var.j != null) {
            t0VarB.a(TapjoyConstants.TJC_DEVICE_DISPLAY_WIDTH).a((Number) b5Var.j);
        }
        if (b5Var.k != null) {
            t0VarB.a(TapjoyConstants.TJC_DEVICE_DISPLAY_HEIGHT).a((Number) b5Var.k);
        }
        if (b5Var.c != null) {
            t0VarB.a("mac").b(b5Var.c);
        }
        if (b5Var.q != null) {
            t0VarB.a(TapjoyConstants.TJC_DEVICE_COUNTRY_SIM).b(b5Var.q);
        }
        if (b5Var.r != null) {
            t0VarB.a("country_net").b(b5Var.r);
        }
        if (b5Var.s != null) {
            t0VarB.a("imei").b(b5Var.s);
        }
        if (b5Var.t != null) {
            t0VarB.a("android_id").b(b5Var.t);
        }
        return t0VarB.b().toString();
    }

    public static void a(HttpURLConnection httpURLConnection, String str, String str2, Charset charset) {
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Type", str);
        byte[] bytes = str2.getBytes(charset);
        httpURLConnection.setFixedLengthStreamingMode(bytes.length);
        OutputStream outputStream = httpURLConnection.getOutputStream();
        try {
            outputStream.write(bytes);
        } finally {
            outputStream.close();
        }
    }

    public static <E> void a(List<E> list, int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i <= 0) {
            return;
        }
        int size = list.size();
        if (i > size) {
            throw new IndexOutOfBoundsException();
        }
        if (i == size) {
            list.clear();
            return;
        }
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                return;
            }
            list.remove(0);
            i = i2;
        }
    }

    public static <T> List<T> a(String str, List<T> list) {
        if (list != null) {
            if (list instanceof h4) {
                list = ((h4) list).b;
            }
            if (list == Collections.emptyList() || (list instanceof g4)) {
                return list;
            }
            g4 g4Var = new g4(list);
            if (!g4Var.contains(null)) {
                return g4Var;
            }
            throw new IllegalArgumentException(str + ".contains(null)");
        }
        throw new NullPointerException(str + " == null");
    }

    public static void a() {
        z6 z6Var = z6.r;
        if (z6Var.b("endSession")) {
            z6Var.h.a();
        }
    }

    public static void a(Activity activity) {
        z6.r.a(activity);
    }

    public static void a(String str, String str2, String str3, String str4, long j) {
        LinkedHashMap linkedHashMap;
        z6 z6Var = z6.r;
        if (z6Var.a("trackEvent") && m327b((Object) str2, "trackEvent: name was null")) {
            if (j != 0) {
                linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("value", Long.valueOf(j));
            } else {
                linkedHashMap = null;
            }
            z6Var.g.a(str, str2, str3, str4, linkedHashMap);
            b("trackEvent category:%s, name:%s, p1:%s, p2:%s, values:%s called", str, str2, str3, str4, linkedHashMap);
        }
    }

    public static void a(String str, String str2, String str3, String str4, String str5, long j, String str6, long j2, String str7, long j3) {
        z6 z6Var = z6.r;
        if (z6Var.a("trackEvent") && m327b((Object) str2, "trackEvent: name was null")) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (str5 != null && j != 0) {
                linkedHashMap.put(str5, Long.valueOf(j));
            }
            if (str6 != null && j2 != 0) {
                linkedHashMap.put(str6, Long.valueOf(j2));
            }
            if (str7 != null && j3 != 0) {
                linkedHashMap.put(str7, Long.valueOf(j3));
            }
            if (linkedHashMap.isEmpty()) {
                linkedHashMap = null;
            }
            z6Var.g.a(str, str2, str3, str4, linkedHashMap);
            b("trackEvent category:%s, name:%s, p1:%s, p2:%s, values:%s called", str, str2, str3, str4, linkedHashMap);
        }
    }

    public static void a(String str, String str2, String str3, String str4) {
        z6 z6Var = z6.r;
        if (z6Var.b("trackPurchase")) {
            try {
                a1 a1Var = (a1) z0.b(str);
                a1Var.k();
                String strW = null;
                String strW2 = null;
                String strW3 = null;
                long jS = 0;
                while (a1Var.o()) {
                    String strT = a1Var.t();
                    if ("productId".equals(strT)) {
                        strW2 = a1Var.w();
                    } else if (TapjoyAuctionFlags.AUCTION_TYPE.equals(strT)) {
                        a1Var.w();
                    } else if (FirebaseAnalytics.Param.PRICE.equals(strT)) {
                        a1Var.w();
                    } else if (TJAdUnitConstants.String.TITLE.equals(strT)) {
                        a1Var.w();
                    } else if ("description".equals(strT)) {
                        a1Var.w();
                    } else if ("price_currency_code".equals(strT)) {
                        strW3 = a1Var.w();
                    } else if ("price_amount_micros".equals(strT)) {
                        jS = a1Var.s();
                    } else {
                        a1Var.B();
                    }
                }
                a1Var.n();
                String strF = f(strW2);
                String strF2 = f(strW3);
                if (strF != null && strF2 != null) {
                    if (strF2.length() != 3) {
                        a("trackPurchase", "skuDetails", "invalid currency code");
                        return;
                    }
                    String strF3 = f(str2);
                    String strF4 = f(str3);
                    if (strF3 != null) {
                        if (strF4 != null) {
                            try {
                                a1 a1Var2 = (a1) z0.b(strF3);
                                a1Var2.k();
                                String strW4 = null;
                                String strW5 = null;
                                long jS2 = 0;
                                while (a1Var2.o()) {
                                    String strT2 = a1Var2.t();
                                    if ("orderId".equals(strT2)) {
                                        strW = a1Var2.w();
                                    } else if ("packageName".equals(strT2)) {
                                        strW4 = a1Var2.w();
                                    } else if ("productId".equals(strT2)) {
                                        strW5 = a1Var2.w();
                                    } else if ("purchaseTime".equals(strT2)) {
                                        jS2 = a1Var2.s();
                                    } else if ("purchaseState".equals(strT2)) {
                                        a1Var2.r();
                                    } else if ("developerPayload".equals(strT2)) {
                                        a1Var2.w();
                                    } else if ("purchaseToken".equals(strT2)) {
                                        a1Var2.w();
                                    } else {
                                        a1Var2.B();
                                    }
                                }
                                a1Var2.n();
                                if (TextUtils.isEmpty(strW) || TextUtils.isEmpty(strW4) || TextUtils.isEmpty(strW5) || jS2 == 0) {
                                    a("trackPurchase", "purchaseData", "insufficient fields");
                                }
                            } catch (IOException unused) {
                                a("trackPurchase", "purchaseData", "invalid PurchaseData JSON");
                            }
                        } else {
                            a("trackPurchase", "dataSignature", "is null, skipping purchase validation");
                        }
                    } else if (strF4 != null) {
                        a("trackPurchase", "purchaseData", "is null. skipping purchase validation");
                    }
                    String upperCase = strF2.toUpperCase(Locale.US);
                    String strF5 = f(str4);
                    x6 x6Var = z6Var.g;
                    double d = jS;
                    Double.isNaN(d);
                    x6Var.a(strF, upperCase, d / 1000000.0d, strF3, strF4, strF5);
                    if (strF3 != null && strF4 != null) {
                        e("trackPurchase with purchaseData called");
                        return;
                    } else {
                        e("trackPurchase without purchaseData called");
                        return;
                    }
                }
                a("trackPurchase", "skuDetails", "insufficient fields");
            } catch (IOException unused2) {
                a("trackPurchase", "skuDetails", "invalid SkuDetails JSON");
            }
        }
    }

    public static long a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return j;
            }
            outputStream.write(bArr, 0, i);
            j += (long) i;
        }
    }

    public static void a(String str, Object... objArr) {
        if (b) {
            a("Tapjoy", str, objArr);
        }
    }

    public static String a(v4 v4Var) {
        t0 t0VarA = new t0().a();
        if (v4Var.c != null) {
            t0VarA.a(TapjoyConstants.TJC_PACKAGE_VERSION).b(v4Var.c);
        }
        if (v4Var.d != null) {
            t0VarA.a(TapjoyConstants.TJC_PACKAGE_REVISION).a((Number) v4Var.d);
        }
        if (v4Var.e != null) {
            t0VarA.a(TapjoyConstants.TJC_INSTALLER).b(v4Var.e);
        }
        if (v4Var.f != null) {
            t0VarA.a(TapjoyConstants.TJC_STORE).b(v4Var.f);
        }
        return t0VarA.b().toString();
    }

    public static void a(String str, String str2, String str3) {
        if (b) {
            a("Tapjoy", "%s: %s %s", str, str2, str3);
        }
    }

    public static String a(i5 i5Var, w4 w4Var) {
        String str;
        String str2;
        t0 t0VarA = new t0().a();
        if (i5Var.c != null) {
            t0VarA.a(TapjoyConstants.TJC_INSTALLED).a((Number) i5Var.c);
        }
        if (i5Var.d != null) {
            t0VarA.a(TapjoyConstants.TJC_REFERRER).b(i5Var.d);
        }
        if (i5Var.q != null) {
            t0VarA.a("idfa").b(i5Var.q);
            Boolean bool = i5Var.r;
            if (bool != null && bool.booleanValue()) {
                t0VarA.a("idfa_optout").a(1L);
            }
        } else if (w4Var != null && (str = w4Var.g) != null && c7.f.equals(str) && (str2 = n7.d) != null) {
            t0VarA.a("idfa").b(str2);
            if (n7.e) {
                t0VarA.a("idfa_optout").a(1L);
            }
        }
        if (i5Var.e != null) {
            t0VarA.a(TapjoyConstants.TJC_USER_WEEKLY_FREQUENCY).a(Math.max(i5Var.e.intValue(), 1));
        }
        if (i5Var.f != null) {
            t0VarA.a(TapjoyConstants.TJC_USER_MONTHLY_FREQUENCY).a(Math.max(i5Var.f.intValue(), 1));
        }
        if (i5Var.g.size() > 0) {
            ArrayList arrayList = new ArrayList(i5Var.g.size());
            for (f5 f5Var : i5Var.g) {
                if (f5Var.e != null) {
                    arrayList.add(f5Var.c);
                }
            }
            if (!arrayList.isEmpty()) {
                try {
                    t0VarA.a("push").b.d();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        t0VarA.b((String) it.next());
                    }
                    try {
                        t0VarA.b.f();
                    } catch (IOException e) {
                        a(e);
                        throw null;
                    }
                } catch (IOException e2) {
                    a(e2);
                    throw null;
                }
            }
        }
        t0VarA.a("session").a();
        if (i5Var.h != null) {
            t0VarA.a("total_count").a((Number) i5Var.h);
        }
        if (i5Var.i != null) {
            t0VarA.a("total_length").a((Number) i5Var.i);
        }
        if (i5Var.j != null) {
            t0VarA.a("last_at").a((Number) i5Var.j);
        }
        if (i5Var.k != null) {
            t0VarA.a("last_length").a((Number) i5Var.k);
        }
        t0VarA.b();
        t0VarA.a(FirebaseAnalytics.Event.PURCHASE).a();
        if (i5Var.l != null) {
            t0VarA.a("currency").b(i5Var.l);
        }
        if (i5Var.m != null) {
            t0VarA.a("total_count").a((Number) i5Var.m);
        }
        if (i5Var.n != null) {
            t0VarA.a("total_price").a((Number) i5Var.n);
        }
        if (i5Var.o != null) {
            t0VarA.a("last_at").a((Number) i5Var.o);
        }
        if (i5Var.p != null) {
            t0VarA.a("last_price").a((Number) i5Var.p);
        }
        t0VarA.b();
        if (i5Var.s != null) {
            t0VarA.a(ReportDBAdapter.ReportColumns.COLUMN_USER_ID).b(i5Var.s);
        }
        if (i5Var.t != null) {
            t0VarA.a(TapjoyConstants.TJC_USER_LEVEL).a((Number) i5Var.t);
        }
        if (i5Var.u != null) {
            t0VarA.a(TapjoyConstants.TJC_USER_FRIEND_COUNT).a((Number) i5Var.u);
        }
        if (i5Var.v != null) {
            t0VarA.a(TapjoyConstants.TJC_USER_VARIABLE_1).b(i5Var.v);
        }
        if (i5Var.w != null) {
            t0VarA.a(TapjoyConstants.TJC_USER_VARIABLE_2).b(i5Var.w);
        }
        if (i5Var.x != null) {
            t0VarA.a(TapjoyConstants.TJC_USER_VARIABLE_3).b(i5Var.x);
        }
        if (i5Var.y != null) {
            t0VarA.a(TapjoyConstants.TJC_USER_VARIABLE_4).b(i5Var.y);
        }
        if (i5Var.z != null) {
            t0VarA.a(TapjoyConstants.TJC_USER_VARIABLE_5).b(i5Var.z);
        }
        if (i5Var.A.size() > 0) {
            try {
                t0VarA.a("tags").b.a((Collection) i5Var.A);
            } catch (IOException e3) {
                a(e3);
                throw null;
            }
        }
        if (Boolean.TRUE.equals(i5Var.B)) {
            t0VarA.a("push_optout").a(1L);
        }
        return t0VarA.b().toString();
    }

    public static boolean a(boolean z, String str) {
        if (b && !z) {
            d(str);
        }
        return z;
    }

    public static IllegalStateException a(Object... objArr) {
        StringBuilder sb = new StringBuilder();
        int length = objArr.length;
        String str = "";
        for (int i = 0; i < length; i += 2) {
            if (objArr[i] == null) {
                if (sb.length() > 0) {
                    str = "s";
                }
                sb.append("\n  ");
                sb.append(objArr[i + 1]);
            }
        }
        throw new IllegalStateException("Required field" + str + " not set:" + ((Object) sb));
    }

    public static Iterable<View> a(ViewGroup viewGroup) {
        return new s(new t(viewGroup));
    }

    public static String a(z4 z4Var) {
        int iOrdinal = z4Var.ordinal();
        if (iOrdinal == 0) {
            return TapjoyConstants.TJC_APP_PLACEMENT;
        }
        if (iOrdinal == 1) {
            return "campaign";
        }
        if (iOrdinal == 2) {
            return "custom";
        }
        if (iOrdinal == 3) {
            return "usages";
        }
        throw new RuntimeException();
    }

    public static void a(String str, String str2, Object... objArr) {
        a(6, str, String.format(str2, objArr), (Throwable) null);
    }

    public static void a(int i, String str, String str2, Throwable th) {
        if (str2 != null) {
            Log.println(i, str, str2);
        }
        if (th != null) {
            Log.println(i, str, Log.getStackTraceString(th));
        }
    }

    public static Bundle a(Notification notification) {
        return notification.extras;
    }
}
