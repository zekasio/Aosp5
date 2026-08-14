package com.tapjoy.internal;

import com.tapjoy.internal.a4;
import com.tapjoy.internal.a4.a;
import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a4<M extends a4<M, B>, B extends a<M, B>> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient x8 f1745a;
    public transient int b = 0;

    public a4(b4<M> b4Var, x8 x8Var) {
        if (b4Var == null) {
            throw new NullPointerException("adapter == null");
        }
        if (x8Var == null) {
            throw new NullPointerException("unknownFields == null");
        }
        this.f1745a = x8Var;
    }

    public final x8 a() {
        x8 x8Var = this.f1745a;
        return x8Var != null ? x8Var : x8.e;
    }

    public static abstract class a<T extends a4<T, B>, B extends a<T, B>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public u8 f1746a;
        public e4 b;

        public final a<T, B> a(int i, z3 z3Var, Object obj) {
            if (this.b == null) {
                u8 u8Var = new u8();
                this.f1746a = u8Var;
                this.b = new e4(u8Var);
            }
            try {
                z3Var.a().a(this.b, i, obj);
                return this;
            } catch (IOException unused) {
                throw new AssertionError();
            }
        }

        public final x8 a() {
            u8 u8Var = this.f1746a;
            if (u8Var != null) {
                return new x8(u8Var.m328clone().e());
            }
            return x8.e;
        }
    }
}
