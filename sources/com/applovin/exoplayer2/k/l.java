package com.applovin.exoplayer2.k;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f581a;
    public final long b;
    public final int c;
    public final byte[] d;
    public final Map<String, String> e;

    @Deprecated
    public final long f;
    public final long g;
    public final long h;
    public final String i;
    public final int j;
    public final Object k;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Uri f582a;
        private long b;
        private int c;
        private byte[] d;
        private Map<String, String> e;
        private long f;
        private long g;
        private String h;
        private int i;
        private Object j;

        public a() {
            this.c = 1;
            this.e = Collections.emptyMap();
            this.g = -1L;
        }

        private a(l lVar) {
            this.f582a = lVar.f581a;
            this.b = lVar.b;
            this.c = lVar.c;
            this.d = lVar.d;
            this.e = lVar.e;
            this.f = lVar.g;
            this.g = lVar.h;
            this.h = lVar.i;
            this.i = lVar.j;
            this.j = lVar.k;
        }

        public a a(String str) {
            this.f582a = Uri.parse(str);
            return this;
        }

        public a a(Uri uri) {
            this.f582a = uri;
            return this;
        }

        public a a(int i) {
            this.c = i;
            return this;
        }

        public a a(byte[] bArr) {
            this.d = bArr;
            return this;
        }

        public a a(Map<String, String> map) {
            this.e = map;
            return this;
        }

        public a a(long j) {
            this.f = j;
            return this;
        }

        public a b(String str) {
            this.h = str;
            return this;
        }

        public a b(int i) {
            this.i = i;
            return this;
        }

        public l a() {
            com.applovin.exoplayer2.l.a.a(this.f582a, "The uri must be set.");
            return new l(this.f582a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
        }
    }

    public static String a(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    private l(Uri uri, long j, int i, byte[] bArr, Map<String, String> map, long j2, long j3, String str, int i2, Object obj) {
        byte[] bArr2 = bArr;
        long j4 = j + j2;
        boolean z = true;
        com.applovin.exoplayer2.l.a.a(j4 >= 0);
        com.applovin.exoplayer2.l.a.a(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        com.applovin.exoplayer2.l.a.a(z);
        this.f581a = uri;
        this.b = j;
        this.c = i;
        this.d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.e = Collections.unmodifiableMap(new HashMap(map));
        this.g = j2;
        this.f = j4;
        this.h = j3;
        this.i = str;
        this.j = i2;
        this.k = obj;
    }

    public boolean b(int i) {
        return (this.j & i) == i;
    }

    public final String a() {
        return a(this.c);
    }

    public a b() {
        return new a();
    }

    public String toString() {
        return "DataSpec[" + a() + " " + this.f581a + ", " + this.g + ", " + this.h + ", " + this.i + ", " + this.j + "]";
    }
}
