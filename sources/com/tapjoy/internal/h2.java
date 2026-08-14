package com.tapjoy.internal;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o2 f1808a;
    public final WebView b;
    public final List<p2> c;
    public final Map<String, p2> d;
    public final String e;
    public final String f;
    public final String g;
    public final i2 h;

    public h2(o2 o2Var, WebView webView, String str, List<p2> list, String str2, String str3, i2 i2Var) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.d = new HashMap();
        this.f1808a = o2Var;
        this.b = webView;
        this.e = str;
        this.h = i2Var;
        if (list != null) {
            arrayList.addAll(list);
            for (p2 p2Var : list) {
                this.d.put(UUID.randomUUID().toString(), p2Var);
            }
        }
        this.g = str2;
        this.f = str3;
    }
}
