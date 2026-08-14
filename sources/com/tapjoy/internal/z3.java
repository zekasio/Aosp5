package com.tapjoy.internal;

/* JADX INFO: loaded from: classes2.dex */
public enum z3 {
    VARINT(0),
    FIXED64(1),
    LENGTH_DELIMITED(2),
    FIXED32(5);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1958a;

    z3(int i) {
        this.f1958a = i;
    }

    public b4<?> a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return b4.h;
        }
        if (iOrdinal == 1) {
            return b4.i;
        }
        if (iOrdinal == 2) {
            return b4.l;
        }
        if (iOrdinal == 3) {
            return b4.f;
        }
        throw new AssertionError();
    }
}
