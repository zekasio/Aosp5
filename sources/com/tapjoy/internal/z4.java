package com.tapjoy.internal;

/* JADX INFO: loaded from: classes2.dex */
public enum z4 implements f4 {
    APP(0),
    CAMPAIGN(1),
    CUSTOM(2),
    USAGES(3);

    public static final b4<z4> f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1959a;

    public static final class a extends y3<z4> {
        public a() {
            super(z4.class);
        }
    }

    z4(int i) {
        this.f1959a = i;
    }

    public static z4 a(int i) {
        if (i == 0) {
            return APP;
        }
        if (i == 1) {
            return CAMPAIGN;
        }
        if (i == 2) {
            return CUSTOM;
        }
        if (i != 3) {
            return null;
        }
        return USAGES;
    }

    public int a() {
        return this.f1959a;
    }
}
