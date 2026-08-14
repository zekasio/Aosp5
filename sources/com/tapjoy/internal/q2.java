package com.tapjoy.internal;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class q2 extends f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h2 f1889a;
    public final g2 b;
    public k3 e;
    public boolean i;
    public boolean j;
    public final List<x2> c = new ArrayList();
    public boolean f = false;
    public boolean g = false;
    public final String h = UUID.randomUUID().toString();
    public i3 d = new i3(null);

    static {
        Pattern.compile("^[a-zA-Z0-9 ]+$");
    }

    public q2(g2 g2Var, h2 h2Var) {
        this.b = g2Var;
        this.f1889a = h2Var;
        i2 i2Var = h2Var.h;
        if (i2Var == i2.HTML || i2Var == i2.JAVASCRIPT) {
            this.e = new l3(h2Var.b);
        } else {
            this.e = new m3(Collections.unmodifiableMap(h2Var.d), h2Var.e);
        }
        this.e.a();
        v2.c.f1928a.add(this);
        this.e.a(g2Var);
    }

    @Override // com.tapjoy.internal.f2
    public void a(k2 k2Var, String str) {
        if (this.g) {
            throw new IllegalStateException("AdSession is finished");
        }
        a.a((Object) k2Var, "Error type is null");
        a.a(str, "Message is null");
        this.e.a(k2Var, str);
    }

    @Override // com.tapjoy.internal.f2
    public void b() {
        if (this.f) {
            return;
        }
        this.f = true;
        v2 v2Var = v2.c;
        boolean zA = v2Var.a();
        v2Var.b.add(this);
        if (!zA) {
            b3.c().a();
        }
        this.e.a(b3.c().f1759a);
        this.e.a(this, this.f1889a);
    }

    public View c() {
        return this.d.get();
    }

    public boolean d() {
        return this.f && !this.g;
    }

    public boolean e() {
        return this.f;
    }

    @Override // com.tapjoy.internal.f2
    public void a() {
        if (this.g) {
            return;
        }
        this.d.clear();
        if (!this.g) {
            this.c.clear();
        }
        this.g = true;
        this.e.c();
        v2 v2Var = v2.c;
        boolean zA = v2Var.a();
        v2Var.f1928a.remove(this);
        v2Var.b.remove(this);
        if (zA && !v2Var.a()) {
            b3.c().b();
        }
        this.e.b();
        this.e = null;
    }

    @Override // com.tapjoy.internal.f2
    public void a(View view) {
        if (this.g) {
            return;
        }
        a.a((Object) view, "AdView is null");
        if (c() == view) {
            return;
        }
        this.d = new i3(view);
        this.e.f();
        Collection<q2> collectionUnmodifiableCollection = Collections.unmodifiableCollection(v2.c.f1928a);
        if (collectionUnmodifiableCollection == null || collectionUnmodifiableCollection.isEmpty()) {
            return;
        }
        for (q2 q2Var : collectionUnmodifiableCollection) {
            if (q2Var != this && q2Var.c() == view) {
                q2Var.d.clear();
            }
        }
    }
}
