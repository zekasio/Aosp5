package com.applovin.exoplayer2.i.i;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    private int f;
    private int h;
    private float o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f539a = "";
    private String b = "";
    private Set<String> c = Collections.emptySet();
    private String d = "";
    private String e = null;
    private boolean g = false;
    private boolean i = false;
    private int j = -1;
    private int k = -1;
    private int l = -1;
    private int m = -1;
    private int n = -1;
    private int p = -1;
    private boolean q = false;

    public void a(String str) {
        this.f539a = str;
    }

    public void b(String str) {
        this.b = str;
    }

    public void a(String[] strArr) {
        this.c = new HashSet(Arrays.asList(strArr));
    }

    public void c(String str) {
        this.d = str;
    }

    public int a(String str, String str2, Set<String> set, String str3) {
        if (this.f539a.isEmpty() && this.b.isEmpty() && this.c.isEmpty() && this.d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iA = a(a(a(0, this.f539a, str, 1073741824), this.b, str2, 2), this.d, str3, 4);
        if (iA == -1 || !set.containsAll(this.c)) {
            return 0;
        }
        return iA + (this.c.size() * 4);
    }

    public int a() {
        int i = this.l;
        if (i == -1 && this.m == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.m == 1 ? 2 : 0);
    }

    public boolean b() {
        return this.j == 1;
    }

    public boolean c() {
        return this.k == 1;
    }

    public d a(boolean z) {
        this.k = z ? 1 : 0;
        return this;
    }

    public d b(boolean z) {
        this.l = z ? 1 : 0;
        return this;
    }

    public d c(boolean z) {
        this.m = z ? 1 : 0;
        return this;
    }

    public String d() {
        return this.e;
    }

    public d d(String str) {
        this.e = str == null ? null : Ascii.toLowerCase(str);
        return this;
    }

    public int e() {
        if (!this.g) {
            throw new IllegalStateException("Font color not defined");
        }
        return this.f;
    }

    public d a(int i) {
        this.f = i;
        this.g = true;
        return this;
    }

    public boolean f() {
        return this.g;
    }

    public int g() {
        if (!this.i) {
            throw new IllegalStateException("Background color not defined.");
        }
        return this.h;
    }

    public d b(int i) {
        this.h = i;
        this.i = true;
        return this;
    }

    public boolean h() {
        return this.i;
    }

    public d a(float f) {
        this.o = f;
        return this;
    }

    public d c(int i) {
        this.n = i;
        return this;
    }

    public int i() {
        return this.n;
    }

    public float j() {
        return this.o;
    }

    public d d(int i) {
        this.p = i;
        return this;
    }

    public int k() {
        return this.p;
    }

    public d d(boolean z) {
        this.q = z;
        return this;
    }

    public boolean l() {
        return this.q;
    }

    private static int a(int i, String str, String str2, int i2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }
}
