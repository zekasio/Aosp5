package com.tapjoy.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class d9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f1783a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public d9 f;
    public d9 g;

    public d9() {
        this.f1783a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public d9 a() {
        d9 d9Var = this.f;
        d9 d9Var2 = d9Var != this ? d9Var : null;
        d9 d9Var3 = this.g;
        d9Var3.f = d9Var;
        this.f.g = d9Var3;
        this.f = null;
        this.g = null;
        return d9Var2;
    }

    public d9(d9 d9Var) {
        this(d9Var.f1783a, d9Var.b, d9Var.c);
        d9Var.d = true;
    }

    public d9 a(d9 d9Var) {
        d9Var.g = this;
        d9Var.f = this.f;
        this.f.g = d9Var;
        this.f = d9Var;
        return d9Var;
    }

    public d9(byte[] bArr, int i, int i2) {
        this.f1783a = bArr;
        this.b = i;
        this.c = i2;
        this.e = false;
        this.d = true;
    }

    public d9 a(int i) {
        d9 d9VarA;
        if (i > 0 && i <= this.c - this.b) {
            if (i >= 1024) {
                d9VarA = new d9(this);
            } else {
                d9VarA = e9.a();
                System.arraycopy(this.f1783a, this.b, d9VarA.f1783a, 0, i);
            }
            d9VarA.c = d9VarA.b + i;
            this.b += i;
            this.g.a(d9VarA);
            return d9VarA;
        }
        throw new IllegalArgumentException();
    }

    public void a(d9 d9Var, int i) {
        if (d9Var.e) {
            int i2 = d9Var.c;
            int i3 = i2 + i;
            if (i3 > 8192) {
                if (!d9Var.d) {
                    int i4 = d9Var.b;
                    if (i3 - i4 <= 8192) {
                        byte[] bArr = d9Var.f1783a;
                        System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
                        d9Var.c -= d9Var.b;
                        d9Var.b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f1783a, this.b, d9Var.f1783a, d9Var.c, i);
            d9Var.c += i;
            this.b += i;
            return;
        }
        throw new IllegalArgumentException();
    }
}
