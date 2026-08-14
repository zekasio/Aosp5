package com.applovin.exoplayer2.i;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.applovin.exoplayer2.as;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.u;
import com.applovin.exoplayer2.v;
import com.applovin.exoplayer2.w;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m extends com.applovin.exoplayer2.e implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f549a;
    private final l b;
    private final i c;
    private final w d;
    private boolean e;
    private boolean f;
    private boolean g;
    private int h;
    private v i;
    private g j;
    private j k;
    private k l;
    private k m;
    private int n;
    private long o;

    @Override // com.applovin.exoplayer2.ar
    public boolean z() {
        return true;
    }

    public m(l lVar, Looper looper) {
        this(lVar, looper, i.f535a);
    }

    public m(l lVar, Looper looper, i iVar) {
        super(3);
        this.b = (l) com.applovin.exoplayer2.l.a.b(lVar);
        this.f549a = looper == null ? null : ai.a(looper, (Handler.Callback) this);
        this.c = iVar;
        this.d = new w();
        this.o = -9223372036854775807L;
    }

    @Override // com.applovin.exoplayer2.ar, com.applovin.exoplayer2.as
    public String y() {
        return "TextRenderer";
    }

    @Override // com.applovin.exoplayer2.as
    public int a(v vVar) {
        if (this.c.a(vVar)) {
            return as.CC.b(vVar.E == 0 ? 4 : 2);
        }
        if (u.c(vVar.l)) {
            return as.CC.b(1);
        }
        return as.CC.b(0);
    }

    public void c(long j) {
        com.applovin.exoplayer2.l.a.b(j());
        this.o = j;
    }

    @Override // com.applovin.exoplayer2.e
    protected void a(v[] vVarArr, long j, long j2) {
        this.i = vVarArr[0];
        if (this.j != null) {
            this.h = 1;
        } else {
            D();
        }
    }

    @Override // com.applovin.exoplayer2.e
    protected void a(long j, boolean z) {
        G();
        this.e = false;
        this.f = false;
        this.o = -9223372036854775807L;
        if (this.h != 0) {
            E();
        } else {
            B();
            ((g) com.applovin.exoplayer2.l.a.b(this.j)).c();
        }
    }

    @Override // com.applovin.exoplayer2.ar
    public void a(long j, long j2) {
        boolean z;
        if (j()) {
            long j3 = this.o;
            if (j3 != -9223372036854775807L && j >= j3) {
                B();
                this.f = true;
            }
        }
        if (this.f) {
            return;
        }
        if (this.m == null) {
            ((g) com.applovin.exoplayer2.l.a.b(this.j)).a(j);
            try {
                this.m = ((g) com.applovin.exoplayer2.l.a.b(this.j)).b();
            } catch (h e) {
                a(e);
                return;
            }
        }
        if (d_() != 2) {
            return;
        }
        if (this.l != null) {
            long jF = F();
            z = false;
            while (jF <= j) {
                this.n++;
                jF = F();
                z = true;
            }
        } else {
            z = false;
        }
        k kVar = this.m;
        if (kVar != null) {
            if (kVar.c()) {
                if (!z && F() == Long.MAX_VALUE) {
                    if (this.h == 2) {
                        E();
                    } else {
                        B();
                        this.f = true;
                    }
                }
            } else if (kVar.f103a <= j) {
                k kVar2 = this.l;
                if (kVar2 != null) {
                    kVar2.f();
                }
                this.n = kVar.a(j);
                this.l = kVar;
                this.m = null;
                z = true;
            }
        }
        if (z) {
            com.applovin.exoplayer2.l.a.b(this.l);
            a(this.l.b(j));
        }
        if (this.h == 2) {
            return;
        }
        while (!this.e) {
            try {
                j jVarA = this.k;
                if (jVarA == null) {
                    jVarA = ((g) com.applovin.exoplayer2.l.a.b(this.j)).a();
                    if (jVarA == null) {
                        return;
                    } else {
                        this.k = jVarA;
                    }
                }
                if (this.h == 1) {
                    jVarA.a_(4);
                    ((g) com.applovin.exoplayer2.l.a.b(this.j)).a(jVarA);
                    this.k = null;
                    this.h = 2;
                    return;
                }
                int iA = a(this.d, jVarA, 0);
                if (iA == -4) {
                    if (jVarA.c()) {
                        this.e = true;
                        this.g = false;
                    } else {
                        v vVar = this.d.b;
                        if (vVar == null) {
                            return;
                        }
                        jVarA.f = vVar.p;
                        jVarA.h();
                        this.g &= !jVarA.d();
                    }
                    if (!this.g) {
                        ((g) com.applovin.exoplayer2.l.a.b(this.j)).a(jVarA);
                        this.k = null;
                    }
                } else if (iA == -3) {
                    return;
                }
            } catch (h e2) {
                a(e2);
                return;
            }
        }
    }

    @Override // com.applovin.exoplayer2.e
    protected void r() {
        this.i = null;
        this.o = -9223372036854775807L;
        G();
        C();
    }

    @Override // com.applovin.exoplayer2.ar
    public boolean A() {
        return this.f;
    }

    private void B() {
        this.k = null;
        this.n = -1;
        k kVar = this.l;
        if (kVar != null) {
            kVar.f();
            this.l = null;
        }
        k kVar2 = this.m;
        if (kVar2 != null) {
            kVar2.f();
            this.m = null;
        }
    }

    private void C() {
        B();
        ((g) com.applovin.exoplayer2.l.a.b(this.j)).d();
        this.j = null;
        this.h = 0;
    }

    private void D() {
        this.g = true;
        this.j = this.c.b((v) com.applovin.exoplayer2.l.a.b(this.i));
    }

    private void E() {
        C();
        D();
    }

    private long F() {
        if (this.n == -1) {
            return Long.MAX_VALUE;
        }
        com.applovin.exoplayer2.l.a.b(this.l);
        if (this.n >= this.l.f_()) {
            return Long.MAX_VALUE;
        }
        return this.l.a(this.n);
    }

    private void a(List<a> list) {
        Handler handler = this.f549a;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            b(list);
        }
    }

    private void G() {
        a(Collections.emptyList());
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            b((List<a>) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    private void b(List<a> list) {
        this.b.a(list);
    }

    private void a(h hVar) {
        q.c("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.i, hVar);
        G();
        E();
    }
}
