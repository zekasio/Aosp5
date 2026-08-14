package com.applovin.impl.mediation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<a> f1158a = Collections.synchronizedList(new ArrayList());

    public interface a {
        void a(com.applovin.impl.mediation.a.a aVar);
    }

    public void a(a aVar) {
        this.f1158a.add(aVar);
    }

    public void b(a aVar) {
        this.f1158a.remove(aVar);
    }

    public void a(com.applovin.impl.mediation.a.a aVar) {
        Iterator it = new ArrayList(this.f1158a).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(aVar);
        }
    }
}
