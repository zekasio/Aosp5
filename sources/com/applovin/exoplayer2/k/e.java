package com.applovin.exoplayer2.k;

import com.applovin.exoplayer2.l.ai;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f576a;
    private final ArrayList<aa> b = new ArrayList<>(1);
    private int c;
    private l d;

    @Override // com.applovin.exoplayer2.k.i
    public /* synthetic */ Map b() {
        return Collections.emptyMap();
    }

    protected e(boolean z) {
        this.f576a = z;
    }

    @Override // com.applovin.exoplayer2.k.i
    public final void a(aa aaVar) {
        com.applovin.exoplayer2.l.a.b(aaVar);
        if (this.b.contains(aaVar)) {
            return;
        }
        this.b.add(aaVar);
        this.c++;
    }

    protected final void b(l lVar) {
        for (int i = 0; i < this.c; i++) {
            this.b.get(i).a(this, lVar, this.f576a);
        }
    }

    protected final void c(l lVar) {
        this.d = lVar;
        for (int i = 0; i < this.c; i++) {
            this.b.get(i).b(this, lVar, this.f576a);
        }
    }

    protected final void a(int i) {
        l lVar = (l) ai.a(this.d);
        for (int i2 = 0; i2 < this.c; i2++) {
            this.b.get(i2).a(this, lVar, this.f576a, i);
        }
    }

    protected final void d() {
        l lVar = (l) ai.a(this.d);
        for (int i = 0; i < this.c; i++) {
            this.b.get(i).c(this, lVar, this.f576a);
        }
        this.d = null;
    }
}
