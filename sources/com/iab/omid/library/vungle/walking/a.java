package com.iab.omid.library.vungle.walking;

import android.view.View;
import com.iab.omid.library.vungle.d.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f1615a = new HashMap<>();
    private final HashMap<View, C0095a> b = new HashMap<>();
    private final HashMap<String, View> c = new HashMap<>();
    private final HashSet<View> d = new HashSet<>();
    private final HashSet<String> e = new HashSet<>();
    private final HashSet<String> f = new HashSet<>();
    private final HashMap<String, String> g = new HashMap<>();
    private boolean h;

    /* JADX INFO: renamed from: com.iab.omid.library.vungle.walking.a$a, reason: collision with other inner class name */
    public static class C0095a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.iab.omid.library.vungle.b.c f1616a;
        private final ArrayList<String> b = new ArrayList<>();

        public C0095a(com.iab.omid.library.vungle.b.c cVar, String str) {
            this.f1616a = cVar;
            a(str);
        }

        public com.iab.omid.library.vungle.b.c a() {
            return this.f1616a;
        }

        public void a(String str) {
            this.b.add(str);
        }

        public ArrayList<String> b() {
            return this.b;
        }
    }

    private void a(com.iab.omid.library.vungle.adsession.a aVar) {
        Iterator<com.iab.omid.library.vungle.b.c> it = aVar.a().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(com.iab.omid.library.vungle.b.c cVar, com.iab.omid.library.vungle.adsession.a aVar) {
        View view = (View) cVar.a().get();
        if (view == null) {
            return;
        }
        C0095a c0095a = this.b.get(view);
        if (c0095a != null) {
            c0095a.a(aVar.getAdSessionId());
        } else {
            this.b.put(view, new C0095a(cVar, aVar.getAdSessionId()));
        }
    }

    private String d(View view) {
        if (!view.hasWindowFocus()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String strE = f.e(view);
            if (strE != null) {
                return strE;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.d.addAll(hashSet);
        return null;
    }

    public String a(View view) {
        if (this.f1615a.size() == 0) {
            return null;
        }
        String str = this.f1615a.get(view);
        if (str != null) {
            this.f1615a.remove(view);
        }
        return str;
    }

    public String a(String str) {
        return this.g.get(str);
    }

    public HashSet<String> a() {
        return this.e;
    }

    public View b(String str) {
        return this.c.get(str);
    }

    public C0095a b(View view) {
        C0095a c0095a = this.b.get(view);
        if (c0095a != null) {
            this.b.remove(view);
        }
        return c0095a;
    }

    public HashSet<String> b() {
        return this.f;
    }

    public c c(View view) {
        return this.d.contains(view) ? c.PARENT_VIEW : this.h ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void c() {
        com.iab.omid.library.vungle.b.a aVarA = com.iab.omid.library.vungle.b.a.a();
        if (aVarA != null) {
            for (com.iab.omid.library.vungle.adsession.a aVar : aVarA.c()) {
                View viewD = aVar.d();
                if (aVar.e()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewD != null) {
                        String strD = d(viewD);
                        if (strD == null) {
                            this.e.add(adSessionId);
                            this.f1615a.put(viewD, adSessionId);
                            a(aVar);
                        } else {
                            this.f.add(adSessionId);
                            this.c.put(adSessionId, viewD);
                            this.g.put(adSessionId, strD);
                        }
                    } else {
                        this.f.add(adSessionId);
                        this.g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void d() {
        this.f1615a.clear();
        this.b.clear();
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.h = false;
    }

    public void e() {
        this.h = true;
    }
}
