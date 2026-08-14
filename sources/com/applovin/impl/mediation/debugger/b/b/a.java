package com.applovin.impl.mediation.debugger.b.b;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, List<b>> f1030a;
    private final List<b> b;

    public a(Map<String, List<b>> map, List<b> list) {
        this.f1030a = map;
        this.b = list;
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
        if (!aVar.a(this)) {
            return false;
        }
        Map<String, List<b>> mapA = a();
        Map<String, List<b>> mapA2 = aVar.a();
        if (mapA != null ? !mapA.equals(mapA2) : mapA2 != null) {
            return false;
        }
        List<b> listB = b();
        List<b> listB2 = aVar.b();
        return listB != null ? listB.equals(listB2) : listB2 == null;
    }

    public int hashCode() {
        Map<String, List<b>> mapA = a();
        int iHashCode = mapA == null ? 43 : mapA.hashCode();
        List<b> listB = b();
        return ((iHashCode + 59) * 59) + (listB != null ? listB.hashCode() : 43);
    }

    public String toString() {
        return "AppAdsTxt(domainEntries=" + a() + ", invalidEntries=" + b() + ")";
    }

    public Map<String, List<b>> a() {
        return this.f1030a;
    }

    public List<b> b() {
        return this.b;
    }
}
