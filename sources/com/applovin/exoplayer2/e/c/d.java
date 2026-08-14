package com.applovin.exoplayer2.e.c;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.y;

/* JADX INFO: loaded from: classes.dex */
abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final x f271a;

    protected abstract boolean a(y yVar) throws ai;

    protected abstract boolean a(y yVar, long j) throws ai;

    public static final class a extends ai {
        public a(String str) {
            super(str, null, false, 1);
        }
    }

    protected d(x xVar) {
        this.f271a = xVar;
    }

    public final boolean b(y yVar, long j) throws ai {
        return a(yVar) && a(yVar, j);
    }
}
