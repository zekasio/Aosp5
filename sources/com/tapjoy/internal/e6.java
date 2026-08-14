package com.tapjoy.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.tapjoy.TapjoyAuctionFlags;
import com.tapjoy.TapjoyConstants;
import com.tapjoy.TapjoyUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class e6 {
    public static final e6 g;
    public static e6 h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f1789a = null;
    public String b = null;
    public Boolean c = null;
    public String d = null;
    public boolean e = false;
    public Context f;

    static {
        e6 e6Var = new e6();
        g = e6Var;
        h = e6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0066 A[Catch: all -> 0x008c, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x0009, B:9:0x0010, B:11:0x001a, B:13:0x0022, B:14:0x002e, B:16:0x0032, B:17:0x003c, B:19:0x0040, B:21:0x0048, B:22:0x0054, B:24:0x0058, B:25:0x0062, B:27:0x0066, B:29:0x006e, B:31:0x0072, B:32:0x0075, B:34:0x0079, B:35:0x007c, B:37:0x0080, B:38:0x0083, B:40:0x0087), top: B:46:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0010 A[Catch: all -> 0x008c, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x0009, B:9:0x0010, B:11:0x001a, B:13:0x0022, B:14:0x002e, B:16:0x0032, B:17:0x003c, B:19:0x0040, B:21:0x0048, B:22:0x0054, B:24:0x0058, B:25:0x0062, B:27:0x0066, B:29:0x006e, B:31:0x0072, B:32:0x0075, B:34:0x0079, B:35:0x007c, B:37:0x0080, B:38:0x0083, B:40:0x0087), top: B:46:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void a(android.content.Context r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r5 == 0) goto L9
            android.content.Context r0 = r4.f     // Catch: java.lang.Throwable -> L8c
            if (r0 != 0) goto L9
            r4.f = r5     // Catch: java.lang.Throwable -> L8c
        L9:
            com.tapjoy.internal.e6 r5 = com.tapjoy.internal.e6.h     // Catch: java.lang.Throwable -> L8c
            android.content.Context r0 = r5.f     // Catch: java.lang.Throwable -> L8c
            r1 = 0
            if (r0 == 0) goto L62
            java.lang.String r2 = "tjcPrefrences"
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r2, r1)     // Catch: java.lang.Throwable -> L8c
            java.lang.Boolean r2 = r5.f1789a     // Catch: java.lang.Throwable -> L8c
            if (r2 != 0) goto L2e
            java.lang.String r2 = "gdpr"
            boolean r2 = r0.contains(r2)     // Catch: java.lang.Throwable -> L8c
            if (r2 == 0) goto L2e
            java.lang.String r2 = "gdpr"
            boolean r2 = r0.getBoolean(r2, r1)     // Catch: java.lang.Throwable -> L8c
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L8c
            r5.f1789a = r2     // Catch: java.lang.Throwable -> L8c
        L2e:
            java.lang.String r2 = r5.b     // Catch: java.lang.Throwable -> L8c
            if (r2 != 0) goto L3c
            java.lang.String r2 = "cgdpr"
            java.lang.String r3 = ""
            java.lang.String r2 = r0.getString(r2, r3)     // Catch: java.lang.Throwable -> L8c
            r5.b = r2     // Catch: java.lang.Throwable -> L8c
        L3c:
            java.lang.Boolean r2 = r5.c     // Catch: java.lang.Throwable -> L8c
            if (r2 != 0) goto L54
            java.lang.String r2 = "below_consent_age"
            boolean r2 = r0.contains(r2)     // Catch: java.lang.Throwable -> L8c
            if (r2 == 0) goto L54
            java.lang.String r2 = "below_consent_age"
            boolean r2 = r0.getBoolean(r2, r1)     // Catch: java.lang.Throwable -> L8c
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L8c
            r5.c = r2     // Catch: java.lang.Throwable -> L8c
        L54:
            java.lang.String r2 = r5.d     // Catch: java.lang.Throwable -> L8c
            if (r2 != 0) goto L62
            java.lang.String r2 = "us_privacy"
            java.lang.String r3 = ""
            java.lang.String r0 = r0.getString(r2, r3)     // Catch: java.lang.Throwable -> L8c
            r5.d = r0     // Catch: java.lang.Throwable -> L8c
        L62:
            boolean r5 = r4.e     // Catch: java.lang.Throwable -> L8c
            if (r5 == 0) goto L8a
            r4.e = r1     // Catch: java.lang.Throwable -> L8c
            com.tapjoy.internal.e6 r5 = com.tapjoy.internal.e6.h     // Catch: java.lang.Throwable -> L8c
            android.content.Context r0 = r5.f     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L8a
            java.lang.Boolean r0 = r5.f1789a     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L75
            r5.c()     // Catch: java.lang.Throwable -> L8c
        L75:
            java.lang.String r0 = r5.b     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L7c
            r5.e()     // Catch: java.lang.Throwable -> L8c
        L7c:
            java.lang.Boolean r0 = r5.c     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L83
            r5.b()     // Catch: java.lang.Throwable -> L8c
        L83:
            java.lang.String r0 = r5.d     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L8a
            r5.d()     // Catch: java.lang.Throwable -> L8c
        L8a:
            monitor-exit(r4)
            return
        L8c:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L8c
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.e6.a(android.content.Context):void");
    }

    public void b(boolean z) {
        this.f1789a = Boolean.valueOf(z);
        if (c()) {
            return;
        }
        this.e = true;
    }

    public final boolean c() {
        Context context = this.f;
        if (context == null) {
            return false;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0).edit();
        editorEdit.putBoolean("gdpr", this.f1789a.booleanValue());
        editorEdit.apply();
        return true;
    }

    public final boolean d() {
        Context context = this.f;
        if (context == null) {
            return false;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0).edit();
        editorEdit.putString("us_privacy", this.d);
        editorEdit.apply();
        return true;
    }

    public final boolean e() {
        Context context = this.f;
        if (context == null) {
            return false;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0).edit();
        editorEdit.putString("cgdpr", this.b);
        editorEdit.apply();
        return true;
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.b = str;
        if (e()) {
            return;
        }
        this.e = true;
    }

    public final boolean b() {
        Context context = this.f;
        if (context == null) {
            return false;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0).edit();
        editorEdit.putBoolean("below_consent_age", this.c.booleanValue());
        editorEdit.apply();
        return true;
    }

    public Map<String, String> a() {
        HashMap map = new HashMap();
        Boolean bool = this.f1789a;
        String str = TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE;
        if (bool != null) {
            TapjoyUtil.safePut(map, "gdpr", bool.booleanValue() ? TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE : "0", true);
        }
        if (!TextUtils.isEmpty(this.b)) {
            TapjoyUtil.safePut(map, "cgdpr", this.b, true);
        }
        Boolean bool2 = this.c;
        if (bool2 != null) {
            if (!bool2.booleanValue()) {
                str = "0";
            }
            TapjoyUtil.safePut(map, "below_consent_age", str, true);
        }
        if (!TextUtils.isEmpty(this.d)) {
            TapjoyUtil.safePut(map, "us_privacy", this.d, true);
        }
        return map;
    }

    public void a(boolean z) {
        this.c = Boolean.valueOf(z);
        if (b()) {
            return;
        }
        this.e = true;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.d = str;
        if (d()) {
            return;
        }
        this.e = true;
    }
}
