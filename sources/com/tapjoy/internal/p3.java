package com.tapjoy.internal;

import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public class p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<View, String> f1880a = new HashMap<>();
    public final HashMap<View, a> b = new HashMap<>();
    public final HashMap<String, View> c = new HashMap<>();
    public final HashSet<View> d = new HashSet<>();
    public final HashSet<String> e = new HashSet<>();
    public final HashSet<String> f = new HashSet<>();
    public final HashMap<String, String> g = new HashMap<>();
    public boolean h;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x2 f1881a;
        public final ArrayList<String> b;

        public a(x2 x2Var, String str) {
            ArrayList<String> arrayList = new ArrayList<>();
            this.b = arrayList;
            this.f1881a = x2Var;
            arrayList.add(str);
        }

        public void a(String str) {
            this.b.add(str);
        }
    }

    public HashSet<String> a() {
        return this.e;
    }

    public HashSet<String> b() {
        return this.f;
    }

    public void c() {
        String str;
        v2 v2Var = v2.c;
        if (v2Var != null) {
            for (q2 q2Var : Collections.unmodifiableCollection(v2Var.b)) {
                View viewC = q2Var.c();
                if (q2Var.d()) {
                    String str2 = q2Var.h;
                    if (viewC != null) {
                        if (viewC.hasWindowFocus()) {
                            HashSet hashSet = new HashSet();
                            View view = viewC;
                            while (true) {
                                if (view == null) {
                                    this.d.addAll(hashSet);
                                    str = null;
                                    break;
                                }
                                String strB = com.tapjoy.internal.a.b(view);
                                if (strB != null) {
                                    str = strB;
                                    break;
                                } else {
                                    hashSet.add(view);
                                    Object parent = view.getParent();
                                    view = parent instanceof View ? (View) parent : null;
                                }
                            }
                        } else {
                            str = "noWindowFocus";
                        }
                        if (str == null) {
                            this.e.add(str2);
                            this.f1880a.put(viewC, str2);
                            for (x2 x2Var : q2Var.c) {
                                View view2 = x2Var.f1940a.get();
                                if (view2 != null) {
                                    a aVar = this.b.get(view2);
                                    if (aVar != null) {
                                        aVar.a(q2Var.h);
                                    } else {
                                        this.b.put(view2, new a(x2Var, q2Var.h));
                                    }
                                }
                            }
                        } else {
                            this.f.add(str2);
                            this.c.put(str2, viewC);
                            this.g.put(str2, str);
                        }
                    } else {
                        this.f.add(str2);
                        this.g.put(str2, "noAdView");
                    }
                }
            }
        }
    }
}
