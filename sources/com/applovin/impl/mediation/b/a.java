package com.applovin.impl.mediation.b;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f975a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final int f;
    private final int g;
    private final String h;
    private final JSONArray i;
    private final List<String> j;
    private final List<String> k;

    /* JADX INFO: renamed from: com.applovin.impl.mediation.b.a$a, reason: collision with other inner class name */
    public static class C0059a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f976a;
        private String b;
        private boolean c;
        private String d;
        private boolean e;
        private String f;
        private boolean g;
        private String h;
        private String i;
        private int j;
        private int k;
        private String l;
        private boolean m;
        private JSONArray n;
        private boolean o;
        private List<String> p;
        private boolean q;
        private List<String> r;

        C0059a() {
        }

        public C0059a a(int i) {
            this.j = i;
            return this;
        }

        public C0059a a(String str) {
            this.b = str;
            this.f976a = true;
            return this;
        }

        public C0059a a(List<String> list) {
            this.p = list;
            this.o = true;
            return this;
        }

        public C0059a a(JSONArray jSONArray) {
            this.n = jSONArray;
            this.m = true;
            return this;
        }

        public a a() {
            String strT = this.b;
            if (!this.f976a) {
                strT = a.t();
            }
            String str = strT;
            String strU = this.d;
            if (!this.c) {
                strU = a.u();
            }
            String str2 = strU;
            String strV = this.f;
            if (!this.e) {
                strV = a.v();
            }
            String str3 = strV;
            String strW = this.h;
            if (!this.g) {
                strW = a.w();
            }
            String str4 = strW;
            JSONArray jSONArrayX = this.n;
            if (!this.m) {
                jSONArrayX = a.x();
            }
            JSONArray jSONArray = jSONArrayX;
            List<String> listY = this.p;
            if (!this.o) {
                listY = a.y();
            }
            List<String> list = listY;
            List<String> listZ = this.r;
            if (!this.q) {
                listZ = a.z();
            }
            return new a(str, str2, str3, str4, this.i, this.j, this.k, this.l, jSONArray, list, listZ);
        }

        public C0059a b(int i) {
            this.k = i;
            return this;
        }

        public C0059a b(String str) {
            this.d = str;
            this.c = true;
            return this;
        }

        public C0059a b(List<String> list) {
            this.r = list;
            this.q = true;
            return this;
        }

        public C0059a c(String str) {
            this.f = str;
            this.e = true;
            return this;
        }

        public C0059a d(String str) {
            this.h = str;
            this.g = true;
            return this;
        }

        public C0059a e(String str) {
            this.i = str;
            return this;
        }

        public C0059a f(String str) {
            this.l = str;
            return this;
        }

        public String toString() {
            return "OpenRtbAdConfiguration.Builder(version$value=" + this.b + ", title$value=" + this.d + ", advertiser$value=" + this.f + ", body$value=" + this.h + ", mainImageUrl=" + this.i + ", mainImageWidth=" + this.j + ", mainImageHeight=" + this.k + ", clickDestinationUrl=" + this.l + ", clickTrackingUrls$value=" + this.n + ", jsTrackers$value=" + this.p + ", impressionUrls$value=" + this.r + ")";
        }
    }

    a(String str, String str2, String str3, String str4, String str5, int i, int i2, String str6, JSONArray jSONArray, List<String> list, List<String> list2) {
        this.f975a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = i2;
        this.h = str6;
        this.i = jSONArray;
        this.j = list;
        this.k = list2;
    }

    public static C0059a a() {
        return new C0059a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String t() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String u() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String v() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String w() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONArray x() {
        return new JSONArray();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<String> y() {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<String> z() {
        return new ArrayList();
    }

    public String b() {
        return this.f975a;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public String e() {
        return this.d;
    }

    public String f() {
        return this.e;
    }

    public int g() {
        return this.f;
    }

    public int h() {
        return this.g;
    }

    public String i() {
        return this.h;
    }

    public JSONArray j() {
        return this.i;
    }

    public List<String> k() {
        return this.j;
    }

    public List<String> l() {
        return this.k;
    }
}
