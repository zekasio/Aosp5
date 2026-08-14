package com.applovin.impl.mediation.debugger.b.a;

/* JADX INFO: loaded from: classes.dex */
public class d implements Comparable<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1028a;
    private final String b;
    private final boolean c;
    private final com.applovin.impl.mediation.debugger.b.c.b d;

    d(String str, String str2, boolean z, com.applovin.impl.mediation.debugger.b.c.b bVar) {
        this.f1028a = str;
        this.b = str2;
        this.c = z;
        this.d = bVar;
    }

    public String a() {
        return this.f1028a;
    }

    public String b() {
        return this.b;
    }

    public com.applovin.impl.mediation.debugger.b.c.b c() {
        return this.d;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(d dVar) {
        return this.b.compareToIgnoreCase(dVar.b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f1028a;
        if (str == null ? dVar.f1028a != null : !str.equals(dVar.f1028a)) {
            return false;
        }
        String str2 = this.b;
        if (str2 == null ? dVar.b == null : str2.equals(dVar.b)) {
            return this.c == dVar.c;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f1028a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.c ? 1 : 0);
    }
}
