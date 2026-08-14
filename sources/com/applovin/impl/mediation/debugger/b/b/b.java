package com.applovin.impl.mediation.debugger.b.b;

import cz.msebera.android.httpclient.message.TokenParser;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1031a;
    private final String b;
    private final String c;
    private final String d;
    private final boolean e;
    private final String f;
    private final int g;

    protected boolean a(Object obj) {
        return obj instanceof b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!bVar.a(this) || g() != bVar.g()) {
            return false;
        }
        String strA = a();
        String strA2 = bVar.a();
        if (strA != null ? !strA.equals(strA2) : strA2 != null) {
            return false;
        }
        String strB = b();
        String strB2 = bVar.b();
        if (strB != null ? !strB.equals(strB2) : strB2 != null) {
            return false;
        }
        String strC = c();
        String strC2 = bVar.c();
        if (strC != null ? !strC.equals(strC2) : strC2 != null) {
            return false;
        }
        String strD = d();
        String strD2 = bVar.d();
        return strD != null ? strD.equals(strD2) : strD2 == null;
    }

    public int hashCode() {
        int i = g() ? 79 : 97;
        String strA = a();
        int iHashCode = ((i + 59) * 59) + (strA == null ? 43 : strA.hashCode());
        String strB = b();
        int iHashCode2 = (iHashCode * 59) + (strB == null ? 43 : strB.hashCode());
        String strC = c();
        int iHashCode3 = (iHashCode2 * 59) + (strC == null ? 43 : strC.hashCode());
        String strD = d();
        return (iHashCode3 * 59) + (strD != null ? strD.hashCode() : 43);
    }

    public String toString() {
        return "AppAdsTxtEntry(domainName=" + a() + ", publisherId=" + b() + ", relationship=" + c() + ", certificateAuthorityId=" + d() + ", valid=" + g() + ", rawValue=" + e() + ", rowNumber=" + f() + ")";
    }

    public b(String str, int i) {
        this.f = str;
        this.g = i;
        String[] strArrSplit = str.split(",");
        boolean z = strArrSplit.length == 3 || strArrSplit.length == 4;
        this.e = z;
        if (z) {
            this.f1031a = a(strArrSplit[0]);
            this.b = a(strArrSplit[1]);
            this.c = a(strArrSplit[2]);
            this.d = strArrSplit.length == 4 ? a(strArrSplit[3]) : "";
            return;
        }
        this.f1031a = "";
        this.b = "";
        this.c = "";
        this.d = "";
    }

    public b(String str) {
        this(str, -1);
    }

    public String a() {
        return this.f1031a;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.d;
    }

    public String e() {
        return this.f;
    }

    public int f() {
        return this.g;
    }

    public boolean g() {
        return this.e;
    }

    private String a(String str) {
        return str.replace((char) 173, TokenParser.SP).trim();
    }
}
