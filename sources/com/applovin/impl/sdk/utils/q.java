package com.applovin.impl.sdk.utils;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.impl.sdk.y;
import com.vungle.warren.model.ReportDBAdapter;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f1498a;
    private String b;
    private final String c = a(com.applovin.impl.sdk.c.d.j, (String) com.applovin.impl.sdk.c.e.b(com.applovin.impl.sdk.c.d.i, (Object) null, com.applovin.impl.sdk.p.y()));
    private final String d;

    public q(com.applovin.impl.sdk.p pVar) {
        this.f1498a = pVar;
        this.d = a(com.applovin.impl.sdk.c.d.k, (String) pVar.a(com.applovin.impl.sdk.c.b.ad));
        a(d());
    }

    private String d() {
        if (!((Boolean) this.f1498a.a(com.applovin.impl.sdk.c.b.dT)).booleanValue()) {
            this.f1498a.b(com.applovin.impl.sdk.c.d.h);
        }
        String str = (String) this.f1498a.a(com.applovin.impl.sdk.c.d.h);
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        this.f1498a.L();
        if (y.a()) {
            this.f1498a.L().b("AppLovinSdk", "Using identifier (" + str + ") from previous session");
        }
        return str;
    }

    private String a(com.applovin.impl.sdk.c.d<String> dVar, String str) {
        String str2 = (String) com.applovin.impl.sdk.c.e.b(dVar, (Object) null, com.applovin.impl.sdk.p.y());
        if (StringUtils.isValidString(str2)) {
            return str2;
        }
        if (!StringUtils.isValidString(str)) {
            str = UUID.randomUUID().toString().toLowerCase(Locale.US);
        }
        com.applovin.impl.sdk.c.e.a(dVar, str, com.applovin.impl.sdk.p.y());
        return str;
    }

    public void a(String str) {
        if (((Boolean) this.f1498a.a(com.applovin.impl.sdk.c.b.dT)).booleanValue()) {
            this.f1498a.a(com.applovin.impl.sdk.c.d.h, str);
        }
        this.b = str;
        Bundle bundle = new Bundle(2);
        bundle.putString(ReportDBAdapter.ReportColumns.COLUMN_USER_ID, StringUtils.emptyIfNull(str));
        bundle.putString("applovin_random_token", c());
        this.f1498a.ab().a(bundle, "user_info");
    }

    public static String a(com.applovin.impl.sdk.p pVar) {
        String str = (String) pVar.a(com.applovin.impl.sdk.c.d.l);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String strValueOf = String.valueOf(((int) (Math.random() * 100.0d)) + 1);
        pVar.a(com.applovin.impl.sdk.c.d.l, strValueOf);
        return strValueOf;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.d;
    }
}
