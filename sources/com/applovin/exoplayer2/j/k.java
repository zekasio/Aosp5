package com.applovin.exoplayer2.j;

import com.applovin.exoplayer2.at;
import com.applovin.exoplayer2.l.ai;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f568a;
    public final at[] b;
    public final d[] c;
    public final Object d;

    public k(at[] atVarArr, d[] dVarArr, Object obj) {
        this.b = atVarArr;
        this.c = (d[]) dVarArr.clone();
        this.d = obj;
        this.f568a = atVarArr.length;
    }

    public boolean a(int i) {
        return this.b[i] != null;
    }

    public boolean a(k kVar) {
        if (kVar == null || kVar.c.length != this.c.length) {
            return false;
        }
        for (int i = 0; i < this.c.length; i++) {
            if (!a(kVar, i)) {
                return false;
            }
        }
        return true;
    }

    public boolean a(k kVar, int i) {
        return kVar != null && ai.a(this.b[i], kVar.b[i]) && ai.a(this.c[i], kVar.c[i]);
    }
}
