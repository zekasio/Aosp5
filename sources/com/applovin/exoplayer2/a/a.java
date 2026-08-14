package com.applovin.exoplayer2.a;

import android.os.Looper;
import android.util.SparseArray;
import androidx.core.view.InputDeviceCompat;
import com.applovin.exoplayer2.a.b;
import com.applovin.exoplayer2.ab;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.ak;
import com.applovin.exoplayer2.am;
import com.applovin.exoplayer2.an;
import com.applovin.exoplayer2.b.g;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.c.e;
import com.applovin.exoplayer2.c.h;
import com.applovin.exoplayer2.common.a.s;
import com.applovin.exoplayer2.common.a.u;
import com.applovin.exoplayer2.common.a.x;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.d.g;
import com.applovin.exoplayer2.h.ad;
import com.applovin.exoplayer2.h.j;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.h.q;
import com.applovin.exoplayer2.k.d;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.m;
import com.applovin.exoplayer2.l.o;
import com.applovin.exoplayer2.l.p;
import com.applovin.exoplayer2.m.n;
import com.applovin.exoplayer2.v;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import org.cocos2dx.lib.GameControllerDelegate;

/* JADX INFO: loaded from: classes.dex */
public class a implements an.d, g, com.applovin.exoplayer2.d.g, q, d.a, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.d f13a;
    private final ba.a b;
    private final ba.c c;
    private final C0007a d;
    private final SparseArray<b.a> e;
    private p<b> f;
    private an g;
    private o h;
    private boolean i;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(b bVar, m mVar) {
    }

    @Override // com.applovin.exoplayer2.an.d
    public /* synthetic */ void a() {
        an.d.CC.$default$a(this);
    }

    @Override // com.applovin.exoplayer2.an.d
    public /* synthetic */ void a(int i, boolean z) {
        an.d.CC.$default$a(this, i, z);
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public /* synthetic */ void a(an anVar, an.c cVar) {
        an.d.CC.$default$a(this, anVar, cVar);
    }

    @Override // com.applovin.exoplayer2.an.d
    public /* synthetic */ void a(com.applovin.exoplayer2.o oVar) {
        an.d.CC.$default$a(this, oVar);
    }

    @Override // com.applovin.exoplayer2.b.g
    public /* synthetic */ void a(v vVar) {
        g.CC.$default$a(this, vVar);
    }

    @Override // com.applovin.exoplayer2.an.d
    public /* synthetic */ void a(List list) {
        an.d.CC.$default$a(this, list);
    }

    @Override // com.applovin.exoplayer2.m.n
    public /* synthetic */ void a_(v vVar) {
        n.CC.$default$a_(this, vVar);
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public /* synthetic */ void b(ak akVar) {
        an.d.CC.$default$b(this, akVar);
    }

    @Override // com.applovin.exoplayer2.an.b
    public /* synthetic */ void c(boolean z) {
        an.b.CC.$default$c(this, z);
    }

    @Override // com.applovin.exoplayer2.an.b
    public /* synthetic */ void e(int i) {
        an.b.CC.$default$e(this, i);
    }

    @Override // com.applovin.exoplayer2.d.g
    public /* synthetic */ void e(int i, p.a aVar) {
        g.CC.$default$e(this, i, aVar);
    }

    public a(com.applovin.exoplayer2.l.d dVar) {
        this.f13a = (com.applovin.exoplayer2.l.d) com.applovin.exoplayer2.l.a.b(dVar);
        this.f = new com.applovin.exoplayer2.l.p<>(ai.c(), dVar, new p.b() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda28
            @Override // com.applovin.exoplayer2.l.p.b
            public final void invoke(Object obj, m mVar) {
                a.a((b) obj, mVar);
            }
        });
        ba.a aVar = new ba.a();
        this.b = aVar;
        this.c = new ba.c();
        this.d = new C0007a(aVar);
        this.e = new SparseArray<>();
    }

    public void a(final an anVar, Looper looper) {
        com.applovin.exoplayer2.l.a.b(this.g == null || this.d.b.isEmpty());
        this.g = (an) com.applovin.exoplayer2.l.a.b(anVar);
        this.h = this.f13a.a(looper, null);
        this.f = this.f.a(looper, new p.b() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda47
            @Override // com.applovin.exoplayer2.l.p.b
            public final void invoke(Object obj, m mVar) {
                this.f$0.a(anVar, (b) obj, mVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(an anVar, b bVar, m mVar) {
        bVar.a(anVar, new b.C0008b(mVar, this.e));
    }

    public void c() {
        final b.a aVarE = e();
        this.e.put(1036, aVarE);
        a(aVarE, 1036, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda26
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).h(aVarE);
            }
        });
        ((o) com.applovin.exoplayer2.l.a.a(this.h)).a(new Runnable() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda27
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.i();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        this.f.b();
    }

    public final void a(List<p.a> list, p.a aVar) {
        this.d.a(list, aVar, (an) com.applovin.exoplayer2.l.a.b(this.g));
    }

    public final void d() {
        if (this.i) {
            return;
        }
        final b.a aVarE = e();
        this.i = true;
        a(aVarE, -1, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda21
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).a(aVarE);
            }
        });
    }

    @Override // com.applovin.exoplayer2.b.g
    public final void c(final e eVar) {
        final b.a aVarG = g();
        a(aVarG, 1008, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda46
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                a.d(aVarG, eVar, (b) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(b.a aVar, e eVar, b bVar) {
        bVar.a(aVar, eVar);
        bVar.a(aVar, 1, eVar);
    }

    @Override // com.applovin.exoplayer2.b.g
    public final void b(final String str, final long j, final long j2) {
        final b.a aVarG = g();
        a(aVarG, 1009, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda34
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                a.b(aVarG, str, j2, j, (b) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(b.a aVar, String str, long j, long j2, b bVar) {
        bVar.a(aVar, str, j);
        bVar.a(aVar, str, j2, j);
        bVar.a(aVar, 1, str, j);
    }

    @Override // com.applovin.exoplayer2.b.g
    public final void b(final v vVar, final h hVar) {
        final b.a aVarG = g();
        a(aVarG, 1010, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda39
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                a.b(aVarG, vVar, hVar, (b) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(b.a aVar, v vVar, h hVar, b bVar) {
        bVar.a(aVar, vVar);
        bVar.a(aVar, vVar, hVar);
        bVar.a(aVar, 1, vVar);
    }

    @Override // com.applovin.exoplayer2.b.g
    public final void a(final long j) {
        final b.a aVarG = g();
        a(aVarG, 1011, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda3
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).a(aVarG, j);
            }
        });
    }

    @Override // com.applovin.exoplayer2.b.g
    public final void a(final int i, final long j, final long j2) {
        final b.a aVarG = g();
        a(aVarG, 1012, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda7
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).b(aVarG, i, j, j2);
            }
        });
    }

    @Override // com.applovin.exoplayer2.b.g
    public final void b(final String str) {
        final b.a aVarG = g();
        a(aVarG, 1013, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda49
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).a(aVarG, str);
            }
        });
    }

    @Override // com.applovin.exoplayer2.b.g
    public final void d(final e eVar) {
        final b.a aVarF = f();
        a(aVarF, 1014, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda50
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                a.c(aVarF, eVar, (b) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(b.a aVar, e eVar, b bVar) {
        bVar.b(aVar, eVar);
        bVar.b(aVar, 1, eVar);
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.b.g
    public final void a_(final boolean z) {
        final b.a aVarG = g();
        a(aVarG, 1017, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda13
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).e(aVarG, z);
            }
        });
    }

    @Override // com.applovin.exoplayer2.b.g
    public final void b(final Exception exc) {
        final b.a aVarG = g();
        a(aVarG, 1018, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda38
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).a(aVarG, exc);
            }
        });
    }

    @Override // com.applovin.exoplayer2.b.g
    public final void c(final Exception exc) {
        final b.a aVarG = g();
        a(aVarG, 1037, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda22
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).b(aVarG, exc);
            }
        });
    }

    @Override // com.applovin.exoplayer2.an.d
    public final void a(final float f) {
        final b.a aVarG = g();
        a(aVarG, 1019, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda29
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).a(aVarG, f);
            }
        });
    }

    @Override // com.applovin.exoplayer2.m.n
    public final void a(final e eVar) {
        final b.a aVarG = g();
        a(aVarG, 1020, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda12
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                a.b(aVarG, eVar, (b) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(b.a aVar, e eVar, b bVar) {
        bVar.c(aVar, eVar);
        bVar.a(aVar, 2, eVar);
    }

    @Override // com.applovin.exoplayer2.m.n
    public final void a(final String str, final long j, final long j2) {
        final b.a aVarG = g();
        a(aVarG, 1021, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda51
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                a.a(aVarG, str, j2, j, (b) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(b.a aVar, String str, long j, long j2, b bVar) {
        bVar.b(aVar, str, j);
        bVar.b(aVar, str, j2, j);
        bVar.a(aVar, 2, str, j);
    }

    @Override // com.applovin.exoplayer2.m.n
    public final void a(final v vVar, final h hVar) {
        final b.a aVarG = g();
        a(aVarG, GameControllerDelegate.BUTTON_SELECT, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda24
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                a.a(aVarG, vVar, hVar, (b) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(b.a aVar, v vVar, h hVar, b bVar) {
        bVar.b(aVar, vVar);
        bVar.b(aVar, vVar, hVar);
        bVar.a(aVar, 2, vVar);
    }

    @Override // com.applovin.exoplayer2.m.n
    public final void a(final int i, final long j) {
        final b.a aVarF = f();
        a(aVarF, 1023, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda36
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).a(aVarF, i, j);
            }
        });
    }

    @Override // com.applovin.exoplayer2.m.n
    public final void a(final String str) {
        final b.a aVarG = g();
        a(aVarG, 1024, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda54
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).b(aVarG, str);
            }
        });
    }

    @Override // com.applovin.exoplayer2.m.n
    public final void b(final e eVar) {
        final b.a aVarF = f();
        a(aVarF, InputDeviceCompat.SOURCE_GAMEPAD, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda14
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                a.a(aVarF, eVar, (b) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(b.a aVar, e eVar, b bVar) {
        bVar.d(aVar, eVar);
        bVar.b(aVar, 2, eVar);
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.m.n
    public final void a(final com.applovin.exoplayer2.m.o oVar) {
        final b.a aVarG = g();
        a(aVarG, 1028, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda6
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                a.a(aVarG, oVar, (b) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(b.a aVar, com.applovin.exoplayer2.m.o oVar, b bVar) {
        bVar.a(aVar, oVar);
        bVar.a(aVar, oVar.b, oVar.c, oVar.d, oVar.e);
    }

    @Override // com.applovin.exoplayer2.m.n
    public final void a(final Object obj, final long j) {
        final b.a aVarG = g();
        a(aVarG, 1027, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda31
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj2) {
                ((b) obj2).a(aVarG, obj, j);
            }
        });
    }

    @Override // com.applovin.exoplayer2.m.n
    public final void a(final long j, final int i) {
        final b.a aVarF = f();
        a(aVarF, 1026, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda33
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).a(aVarF, j, i);
            }
        });
    }

    @Override // com.applovin.exoplayer2.m.n
    public final void a(final Exception exc) {
        final b.a aVarG = g();
        a(aVarG, 1038, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda41
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).c(aVarG, exc);
            }
        });
    }

    @Override // com.applovin.exoplayer2.an.d
    public void a(final int i, final int i2) {
        final b.a aVarG = g();
        a(aVarG, 1029, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda2
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).a(aVarG, i, i2);
            }
        });
    }

    @Override // com.applovin.exoplayer2.h.q
    public final void a(int i, p.a aVar, final j jVar, final com.applovin.exoplayer2.h.m mVar) {
        final b.a aVarF = f(i, aVar);
        a(aVarF, 1000, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda43
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).a(aVarF, jVar, mVar);
            }
        });
    }

    @Override // com.applovin.exoplayer2.h.q
    public final void b(int i, p.a aVar, final j jVar, final com.applovin.exoplayer2.h.m mVar) {
        final b.a aVarF = f(i, aVar);
        a(aVarF, 1001, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda48
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).b(aVarF, jVar, mVar);
            }
        });
    }

    @Override // com.applovin.exoplayer2.h.q
    public final void c(int i, p.a aVar, final j jVar, final com.applovin.exoplayer2.h.m mVar) {
        final b.a aVarF = f(i, aVar);
        a(aVarF, 1002, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda10
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).c(aVarF, jVar, mVar);
            }
        });
    }

    @Override // com.applovin.exoplayer2.h.q
    public final void a(int i, p.a aVar, final j jVar, final com.applovin.exoplayer2.h.m mVar, final IOException iOException, final boolean z) {
        final b.a aVarF = f(i, aVar);
        a(aVarF, 1003, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda32
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).a(aVarF, jVar, mVar, iOException, z);
            }
        });
    }

    @Override // com.applovin.exoplayer2.h.q
    public final void a(int i, p.a aVar, final com.applovin.exoplayer2.h.m mVar) {
        final b.a aVarF = f(i, aVar);
        a(aVarF, 1004, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda23
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).a(aVarF, mVar);
            }
        });
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public final void a(ba baVar, final int i) {
        this.d.b((an) com.applovin.exoplayer2.l.a.b(this.g));
        final b.a aVarE = e();
        a(aVarE, 0, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda25
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).c(aVarE, i);
            }
        });
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public final void a(final ab abVar, final int i) {
        final b.a aVarE = e();
        a(aVarE, 1, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda45
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).a(aVarE, abVar, i);
            }
        });
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public final void a(final ad adVar, final com.applovin.exoplayer2.j.h hVar) {
        final b.a aVarE = e();
        a(aVarE, 2, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda11
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).a(aVarE, adVar, hVar);
            }
        });
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public final void b_(final boolean z) {
        final b.a aVarE = e();
        a(aVarE, 3, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda53
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                a.c(aVarE, z, (b) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(b.a aVar, boolean z, b bVar) {
        bVar.d(aVar, z);
        bVar.c(aVar, z);
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public void a(final an.a aVar) {
        final b.a aVarE = e();
        a(aVarE, 13, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda42
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).a(aVarE, aVar);
            }
        });
    }

    @Override // com.applovin.exoplayer2.an.b
    public final void a(final boolean z, final int i) {
        final b.a aVarE = e();
        a(aVarE, -1, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda4
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).a(aVarE, z, i);
            }
        });
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public final void b(final int i) {
        final b.a aVarE = e();
        a(aVarE, 4, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda1
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).a(aVarE, i);
            }
        });
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public final void b(final boolean z, final int i) {
        final b.a aVarE = e();
        a(aVarE, 5, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda56
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).b(aVarE, z, i);
            }
        });
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public final void c(final int i) {
        final b.a aVarE = e();
        a(aVarE, 6, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda15
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).b(aVarE, i);
            }
        });
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public void d(final boolean z) {
        final b.a aVarE = e();
        a(aVarE, 7, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda9
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).a(aVarE, z);
            }
        });
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public final void d(final int i) {
        final b.a aVarE = e();
        a(aVarE, 8, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda19
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).e(aVarE, i);
            }
        });
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public final void e(final boolean z) {
        final b.a aVarE = e();
        a(aVarE, 9, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda30
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).b(aVarE, z);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(final com.applovin.exoplayer2.ak r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof com.applovin.exoplayer2.p
            if (r0 == 0) goto L17
            r0 = r3
            com.applovin.exoplayer2.p r0 = (com.applovin.exoplayer2.p) r0
            com.applovin.exoplayer2.h.o r1 = r0.f
            if (r1 == 0) goto L17
            com.applovin.exoplayer2.h.p$a r1 = new com.applovin.exoplayer2.h.p$a
            com.applovin.exoplayer2.h.o r0 = r0.f
            r1.<init>(r0)
            com.applovin.exoplayer2.a.b$a r0 = r2.a(r1)
            goto L18
        L17:
            r0 = 0
        L18:
            if (r0 != 0) goto L1e
            com.applovin.exoplayer2.a.b$a r0 = r2.e()
        L1e:
            com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda0 r1 = new com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda0
            r1.<init>()
            r3 = 10
            r2.a(r0, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.a.a.a(com.applovin.exoplayer2.ak):void");
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public final void a(final an.e eVar, final an.e eVar2, final int i) {
        if (i == 1) {
            this.i = false;
        }
        this.d.a((an) com.applovin.exoplayer2.l.a.b(this.g));
        final b.a aVarE = e();
        a(aVarE, 11, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda55
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                a.a(aVarE, i, eVar, eVar2, (b) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(b.a aVar, int i, an.e eVar, an.e eVar2, b bVar) {
        bVar.d(aVar, i);
        bVar.a(aVar, eVar, eVar2, i);
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public final void a(final am amVar) {
        final b.a aVarE = e();
        a(aVarE, 12, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda18
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).a(aVarE, amVar);
            }
        });
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public void a(final ac acVar) {
        final b.a aVarE = e();
        a(aVarE, 14, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda40
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).a(aVarE, acVar);
            }
        });
    }

    @Override // com.applovin.exoplayer2.an.d
    public final void a(final com.applovin.exoplayer2.g.a aVar) {
        final b.a aVarE = e();
        a(aVarE, 1007, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda37
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).a(aVarE, aVar);
            }
        });
    }

    @Override // com.applovin.exoplayer2.an.b
    public final void b() {
        final b.a aVarE = e();
        a(aVarE, -1, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda20
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).b(aVarE);
            }
        });
    }

    @Override // com.applovin.exoplayer2.k.d.a
    public final void b(final int i, final long j, final long j2) {
        final b.a aVarH = h();
        a(aVarH, 1006, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda16
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).a(aVarH, i, j, j2);
            }
        });
    }

    @Override // com.applovin.exoplayer2.d.g
    public final void a(int i, p.a aVar, final int i2) {
        final b.a aVarF = f(i, aVar);
        a(aVarF, 1030, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda5
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                a.a(aVarF, i2, (b) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(b.a aVar, int i, b bVar) {
        bVar.c(aVar);
        bVar.f(aVar, i);
    }

    @Override // com.applovin.exoplayer2.d.g
    public final void a(int i, p.a aVar) {
        final b.a aVarF = f(i, aVar);
        a(aVarF, 1031, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda52
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).d(aVarF);
            }
        });
    }

    @Override // com.applovin.exoplayer2.d.g
    public final void a(int i, p.a aVar, final Exception exc) {
        final b.a aVarF = f(i, aVar);
        a(aVarF, 1032, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda17
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).d(aVarF, exc);
            }
        });
    }

    @Override // com.applovin.exoplayer2.d.g
    public final void b(int i, p.a aVar) {
        final b.a aVarF = f(i, aVar);
        a(aVarF, 1033, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda35
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).e(aVarF);
            }
        });
    }

    @Override // com.applovin.exoplayer2.d.g
    public final void c(int i, p.a aVar) {
        final b.a aVarF = f(i, aVar);
        a(aVarF, 1034, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda44
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).f(aVarF);
            }
        });
    }

    @Override // com.applovin.exoplayer2.d.g
    public final void d(int i, p.a aVar) {
        final b.a aVarF = f(i, aVar);
        a(aVarF, 1035, new p.a() { // from class: com.applovin.exoplayer2.a.a$$ExternalSyntheticLambda8
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).g(aVarF);
            }
        });
    }

    protected final void a(b.a aVar, int i, p.a<b> aVar2) {
        this.e.put(i, aVar);
        this.f.b(i, aVar2);
    }

    protected final b.a e() {
        return a(this.d.a());
    }

    protected final b.a a(ba baVar, int i, p.a aVar) {
        p.a aVar2 = baVar.d() ? null : aVar;
        long jA = this.f13a.a();
        boolean z = baVar.equals(this.g.S()) && i == this.g.G();
        long jA2 = 0;
        if (aVar2 == null || !aVar2.a()) {
            if (z) {
                jA2 = this.g.N();
            } else if (!baVar.d()) {
                jA2 = baVar.a(i, this.c).a();
            }
        } else if (z && this.g.L() == aVar2.b && this.g.M() == aVar2.c) {
            jA2 = this.g.I();
        }
        return new b.a(jA, baVar, i, aVar2, jA2, this.g.S(), this.g.G(), this.d.a(), this.g.I(), this.g.J());
    }

    private b.a a(p.a aVar) {
        com.applovin.exoplayer2.l.a.b(this.g);
        ba baVarA = aVar == null ? null : this.d.a(aVar);
        if (aVar == null || baVarA == null) {
            int iG = this.g.G();
            ba baVarS = this.g.S();
            if (iG >= baVarS.b()) {
                baVarS = ba.f89a;
            }
            return a(baVarS, iG, (p.a) null);
        }
        return a(baVarA, baVarA.a(aVar.f471a, this.b).c, aVar);
    }

    private b.a f() {
        return a(this.d.b());
    }

    private b.a g() {
        return a(this.d.c());
    }

    private b.a h() {
        return a(this.d.d());
    }

    private b.a f(int i, p.a aVar) {
        com.applovin.exoplayer2.l.a.b(this.g);
        if (aVar != null) {
            if (this.d.a(aVar) != null) {
                return a(aVar);
            }
            return a(ba.f89a, i, aVar);
        }
        ba baVarS = this.g.S();
        if (i >= baVarS.b()) {
            baVarS = ba.f89a;
        }
        return a(baVarS, i, (p.a) null);
    }

    /* JADX INFO: renamed from: com.applovin.exoplayer2.a.a$a, reason: collision with other inner class name */
    private static final class C0007a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ba.a f14a;
        private s<p.a> b = s.g();
        private u<p.a, ba> c = u.a();
        private p.a d;
        private p.a e;
        private p.a f;

        public C0007a(ba.a aVar) {
            this.f14a = aVar;
        }

        public p.a a() {
            return this.d;
        }

        public p.a b() {
            return this.e;
        }

        public p.a c() {
            return this.f;
        }

        public p.a d() {
            if (this.b.isEmpty()) {
                return null;
            }
            return (p.a) x.c(this.b);
        }

        public ba a(p.a aVar) {
            return this.c.get(aVar);
        }

        public void a(an anVar) {
            this.d = a(anVar, this.b, this.e, this.f14a);
        }

        public void b(an anVar) {
            this.d = a(anVar, this.b, this.e, this.f14a);
            a(anVar.S());
        }

        public void a(List<p.a> list, p.a aVar, an anVar) {
            this.b = s.a((Collection) list);
            if (!list.isEmpty()) {
                this.e = list.get(0);
                this.f = (p.a) com.applovin.exoplayer2.l.a.b(aVar);
            }
            if (this.d == null) {
                this.d = a(anVar, this.b, this.e, this.f14a);
            }
            a(anVar.S());
        }

        private void a(ba baVar) {
            u.a<p.a, ba> aVarB = u.b();
            if (this.b.isEmpty()) {
                a(aVarB, this.e, baVar);
                if (!Objects.equal(this.f, this.e)) {
                    a(aVarB, this.f, baVar);
                }
                if (!Objects.equal(this.d, this.e) && !Objects.equal(this.d, this.f)) {
                    a(aVarB, this.d, baVar);
                }
            } else {
                for (int i = 0; i < this.b.size(); i++) {
                    a(aVarB, this.b.get(i), baVar);
                }
                if (!this.b.contains(this.d)) {
                    a(aVarB, this.d, baVar);
                }
            }
            this.c = aVarB.a();
        }

        private void a(u.a<p.a, ba> aVar, p.a aVar2, ba baVar) {
            if (aVar2 == null) {
                return;
            }
            if (baVar.c(aVar2.f471a) != -1) {
                aVar.a(aVar2, baVar);
                return;
            }
            ba baVar2 = this.c.get(aVar2);
            if (baVar2 != null) {
                aVar.a(aVar2, baVar2);
            }
        }

        private static p.a a(an anVar, s<p.a> sVar, p.a aVar, ba.a aVar2) {
            ba baVarS = anVar.S();
            int iF = anVar.F();
            Object objA = baVarS.d() ? null : baVarS.a(iF);
            int iB = (anVar.K() || baVarS.d()) ? -1 : baVarS.a(iF, aVar2).b(com.applovin.exoplayer2.h.b(anVar.I()) - aVar2.c());
            for (int i = 0; i < sVar.size(); i++) {
                p.a aVar3 = sVar.get(i);
                if (a(aVar3, objA, anVar.K(), anVar.L(), anVar.M(), iB)) {
                    return aVar3;
                }
            }
            if (sVar.isEmpty() && aVar != null) {
                if (a(aVar, objA, anVar.K(), anVar.L(), anVar.M(), iB)) {
                    return aVar;
                }
            }
            return null;
        }

        private static boolean a(p.a aVar, Object obj, boolean z, int i, int i2, int i3) {
            if (aVar.f471a.equals(obj)) {
                return (z && aVar.b == i && aVar.c == i2) || (!z && aVar.b == -1 && aVar.e == i3);
            }
            return false;
        }
    }
}
