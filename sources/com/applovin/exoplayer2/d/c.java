package com.applovin.exoplayer2.d;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.work.PeriodicWorkRequest;
import com.applovin.exoplayer2.common.a.aq;
import com.applovin.exoplayer2.common.a.ax;
import com.applovin.exoplayer2.common.a.w;
import com.applovin.exoplayer2.d.b;
import com.applovin.exoplayer2.d.e;
import com.applovin.exoplayer2.d.f;
import com.applovin.exoplayer2.d.g;
import com.applovin.exoplayer2.d.h;
import com.applovin.exoplayer2.d.m;
import com.applovin.exoplayer2.k.v;
import com.applovin.exoplayer2.l.ai;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    volatile HandlerC0019c f240a;
    private final UUID d;
    private final m.c e;
    private final r f;
    private final HashMap<String, String> g;
    private final boolean h;
    private final int[] i;
    private final boolean j;
    private final f k;
    private final v l;
    private final g m;
    private final long n;
    private final List<com.applovin.exoplayer2.d.b> o;
    private final Set<e> p;
    private final Set<com.applovin.exoplayer2.d.b> q;
    private int r;
    private m s;
    private com.applovin.exoplayer2.d.b t;
    private com.applovin.exoplayer2.d.b u;
    private Looper v;
    private Handler w;
    private int x;
    private byte[] y;

    public static final class a {
        private boolean d;
        private boolean f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap<String, String> f241a = new HashMap<>();
        private UUID b = com.applovin.exoplayer2.h.d;
        private m.c c = o.f257a;
        private v g = new com.applovin.exoplayer2.k.r();
        private int[] e = new int[0];
        private long h = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;

        public a a(UUID uuid, m.c cVar) {
            this.b = (UUID) com.applovin.exoplayer2.l.a.b(uuid);
            this.c = (m.c) com.applovin.exoplayer2.l.a.b(cVar);
            return this;
        }

        public a a(boolean z) {
            this.d = z;
            return this;
        }

        public a a(int... iArr) {
            for (int i : iArr) {
                boolean z = true;
                if (i != 2 && i != 1) {
                    z = false;
                }
                com.applovin.exoplayer2.l.a.a(z);
            }
            this.e = (int[]) iArr.clone();
            return this;
        }

        public a b(boolean z) {
            this.f = z;
            return this;
        }

        public c a(r rVar) {
            return new c(this.b, this.c, rVar, this.f241a, this.d, this.e, this.f, this.g, this.h);
        }
    }

    public static final class d extends Exception {
        private d(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    private c(UUID uuid, m.c cVar, r rVar, HashMap<String, String> map, boolean z, int[] iArr, boolean z2, v vVar, long j) {
        com.applovin.exoplayer2.l.a.b(uuid);
        com.applovin.exoplayer2.l.a.a(!com.applovin.exoplayer2.h.b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.d = uuid;
        this.e = cVar;
        this.f = rVar;
        this.g = map;
        this.h = z;
        this.i = iArr;
        this.j = z2;
        this.l = vVar;
        this.k = new f();
        this.m = new g();
        this.x = 0;
        this.o = new ArrayList();
        this.p = aq.b();
        this.q = aq.b();
        this.n = j;
    }

    public void a(int i, byte[] bArr) {
        com.applovin.exoplayer2.l.a.b(this.o.isEmpty());
        if (i == 1 || i == 3) {
            com.applovin.exoplayer2.l.a.b(bArr);
        }
        this.x = i;
        this.y = bArr;
    }

    @Override // com.applovin.exoplayer2.d.h
    public final void a() {
        int i = this.r;
        this.r = i + 1;
        if (i != 0) {
            return;
        }
        if (this.s == null) {
            m mVarAcquireExoMediaDrm = this.e.acquireExoMediaDrm(this.d);
            this.s = mVarAcquireExoMediaDrm;
            mVarAcquireExoMediaDrm.a(new b());
        } else if (this.n != -9223372036854775807L) {
            for (int i2 = 0; i2 < this.o.size(); i2++) {
                this.o.get(i2).a((g.a) null);
            }
        }
    }

    @Override // com.applovin.exoplayer2.d.h
    public final void b() {
        int i = this.r - 1;
        this.r = i;
        if (i != 0) {
            return;
        }
        if (this.n != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.o);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((com.applovin.exoplayer2.d.b) arrayList.get(i2)).b(null);
            }
        }
        d();
        e();
    }

    @Override // com.applovin.exoplayer2.d.h
    public h.a a(Looper looper, g.a aVar, com.applovin.exoplayer2.v vVar) {
        com.applovin.exoplayer2.l.a.b(this.r > 0);
        a(looper);
        e eVar = new e(aVar);
        eVar.a(vVar);
        return eVar;
    }

    @Override // com.applovin.exoplayer2.d.h
    public com.applovin.exoplayer2.d.f b(Looper looper, g.a aVar, com.applovin.exoplayer2.v vVar) {
        com.applovin.exoplayer2.l.a.b(this.r > 0);
        a(looper);
        return a(looper, aVar, vVar, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public com.applovin.exoplayer2.d.f a(Looper looper, g.a aVar, com.applovin.exoplayer2.v vVar, boolean z) {
        List<e.a> listA;
        b(looper);
        if (vVar.o == null) {
            return a(com.applovin.exoplayer2.l.u.e(vVar.l), z);
        }
        com.applovin.exoplayer2.d.b bVarA = null;
        Object[] objArr = 0;
        if (this.y == null) {
            listA = a((com.applovin.exoplayer2.d.e) com.applovin.exoplayer2.l.a.b(vVar.o), this.d, false);
            if (listA.isEmpty()) {
                d dVar = new d(this.d);
                com.applovin.exoplayer2.l.q.c("DefaultDrmSessionMgr", "DRM error", dVar);
                if (aVar != null) {
                    aVar.a(dVar);
                }
                return new l(new f.a(dVar, 6003));
            }
        } else {
            listA = null;
        }
        if (!this.h) {
            bVarA = this.u;
        } else {
            Iterator<com.applovin.exoplayer2.d.b> it = this.o.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.applovin.exoplayer2.d.b next = it.next();
                if (ai.a(next.f236a, listA)) {
                    bVarA = next;
                    break;
                }
            }
        }
        if (bVarA == null) {
            bVarA = a(listA, false, aVar, z);
            if (!this.h) {
                this.u = bVarA;
            }
            this.o.add(bVarA);
        } else {
            bVarA.a(aVar);
        }
        return bVarA;
    }

    @Override // com.applovin.exoplayer2.d.h
    public int a(com.applovin.exoplayer2.v vVar) {
        int iD = ((m) com.applovin.exoplayer2.l.a.b(this.s)).d();
        if (vVar.o == null) {
            if (ai.a(this.i, com.applovin.exoplayer2.l.u.e(vVar.l)) != -1) {
                return iD;
            }
            return 0;
        }
        if (a(vVar.o)) {
            return iD;
        }
        return 1;
    }

    private com.applovin.exoplayer2.d.f a(int i, boolean z) {
        m mVar = (m) com.applovin.exoplayer2.l.a.b(this.s);
        if ((mVar.d() == 2 && n.f256a) || ai.a(this.i, i) == -1 || mVar.d() == 1) {
            return null;
        }
        com.applovin.exoplayer2.d.b bVar = this.t;
        if (bVar == null) {
            com.applovin.exoplayer2.d.b bVarA = a((List<e.a>) com.applovin.exoplayer2.common.a.s.g(), true, (g.a) null, z);
            this.o.add(bVarA);
            this.t = bVarA;
        } else {
            bVar.a((g.a) null);
        }
        return this.t;
    }

    private boolean a(com.applovin.exoplayer2.d.e eVar) {
        if (this.y != null) {
            return true;
        }
        if (a(eVar, this.d, true).isEmpty()) {
            if (eVar.b != 1 || !eVar.a(0).a(com.applovin.exoplayer2.h.b)) {
                return false;
            }
            com.applovin.exoplayer2.l.q.c("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.d);
        }
        String str = eVar.f248a;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return "cbcs".equals(str) ? ai.f611a >= 25 : ("cbc1".equals(str) || "cens".equals(str)) ? false : true;
    }

    private synchronized void a(Looper looper) {
        Looper looper2 = this.v;
        if (looper2 == null) {
            this.v = looper;
            this.w = new Handler(looper);
        } else {
            com.applovin.exoplayer2.l.a.b(looper2 == looper);
            com.applovin.exoplayer2.l.a.b(this.w);
        }
    }

    private void b(Looper looper) {
        if (this.f240a == null) {
            this.f240a = new HandlerC0019c(looper);
        }
    }

    private com.applovin.exoplayer2.d.b a(List<e.a> list, boolean z, g.a aVar, boolean z2) {
        com.applovin.exoplayer2.d.b bVarA = a(list, z, aVar);
        if (a(bVarA) && !this.q.isEmpty()) {
            c();
            a(bVarA, aVar);
            bVarA = a(list, z, aVar);
        }
        if (!a(bVarA) || !z2 || this.p.isEmpty()) {
            return bVarA;
        }
        d();
        if (!this.q.isEmpty()) {
            c();
        }
        a(bVarA, aVar);
        return a(list, z, aVar);
    }

    private static boolean a(com.applovin.exoplayer2.d.f fVar) {
        return fVar.c() == 1 && (ai.f611a < 19 || (((f.a) com.applovin.exoplayer2.l.a.b(fVar.e())).getCause() instanceof ResourceBusyException));
    }

    private void a(com.applovin.exoplayer2.d.f fVar, g.a aVar) {
        fVar.b(aVar);
        if (this.n != -9223372036854775807L) {
            fVar.b(null);
        }
    }

    private void c() {
        ax it = w.a((Collection) this.q).iterator();
        while (it.hasNext()) {
            ((com.applovin.exoplayer2.d.f) it.next()).b(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void d() {
        ax it = w.a((Collection) this.p).iterator();
        while (it.hasNext()) {
            ((e) it.next()).release();
        }
    }

    private com.applovin.exoplayer2.d.b a(List<e.a> list, boolean z, g.a aVar) {
        com.applovin.exoplayer2.l.a.b(this.s);
        com.applovin.exoplayer2.d.b bVar = new com.applovin.exoplayer2.d.b(this.d, this.s, this.k, this.m, list, this.x, this.j | z, z, this.y, this.g, this.f, (Looper) com.applovin.exoplayer2.l.a.b(this.v), this.l);
        bVar.a(aVar);
        if (this.n != -9223372036854775807L) {
            bVar.a((g.a) null);
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.s != null && this.r == 0 && this.o.isEmpty() && this.p.isEmpty()) {
            ((m) com.applovin.exoplayer2.l.a.b(this.s)).c();
            this.s = null;
        }
    }

    private static List<e.a> a(com.applovin.exoplayer2.d.e eVar, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(eVar.b);
        for (int i = 0; i < eVar.b; i++) {
            e.a aVarA = eVar.a(i);
            if ((aVarA.a(uuid) || (com.applovin.exoplayer2.h.c.equals(uuid) && aVarA.a(com.applovin.exoplayer2.h.b))) && (aVarA.d != null || z)) {
                arrayList.add(aVarA);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: com.applovin.exoplayer2.d.c$c, reason: collision with other inner class name */
    private class HandlerC0019c extends Handler {
        public HandlerC0019c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (com.applovin.exoplayer2.d.b bVar : c.this.o) {
                if (bVar.a(bArr)) {
                    bVar.a(message.what);
                    return;
                }
            }
        }
    }

    private class f implements b.a {
        private final Set<com.applovin.exoplayer2.d.b> b = new HashSet();
        private com.applovin.exoplayer2.d.b c;

        public f() {
        }

        @Override // com.applovin.exoplayer2.d.b.a
        public void a(com.applovin.exoplayer2.d.b bVar) {
            this.b.add(bVar);
            if (this.c != null) {
                return;
            }
            this.c = bVar;
            bVar.a();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.applovin.exoplayer2.d.b.a
        public void a() {
            this.c = null;
            com.applovin.exoplayer2.common.a.s sVarA = com.applovin.exoplayer2.common.a.s.a((Collection) this.b);
            this.b.clear();
            ax it = sVarA.iterator();
            while (it.hasNext()) {
                ((com.applovin.exoplayer2.d.b) it.next()).b();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.applovin.exoplayer2.d.b.a
        public void a(Exception exc, boolean z) {
            this.c = null;
            com.applovin.exoplayer2.common.a.s sVarA = com.applovin.exoplayer2.common.a.s.a((Collection) this.b);
            this.b.clear();
            ax it = sVarA.iterator();
            while (it.hasNext()) {
                ((com.applovin.exoplayer2.d.b) it.next()).a(exc, z);
            }
        }

        public void b(com.applovin.exoplayer2.d.b bVar) {
            this.b.remove(bVar);
            if (this.c == bVar) {
                this.c = null;
                if (this.b.isEmpty()) {
                    return;
                }
                com.applovin.exoplayer2.d.b next = this.b.iterator().next();
                this.c = next;
                next.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class g implements b.InterfaceC0018b {
        private g() {
        }

        @Override // com.applovin.exoplayer2.d.b.InterfaceC0018b
        public void a(com.applovin.exoplayer2.d.b bVar, int i) {
            if (c.this.n != -9223372036854775807L) {
                c.this.q.remove(bVar);
                ((Handler) com.applovin.exoplayer2.l.a.b(c.this.w)).removeCallbacksAndMessages(bVar);
            }
        }

        @Override // com.applovin.exoplayer2.d.b.InterfaceC0018b
        public void b(final com.applovin.exoplayer2.d.b bVar, int i) {
            if (i == 1 && c.this.r > 0 && c.this.n != -9223372036854775807L) {
                c.this.q.add(bVar);
                ((Handler) com.applovin.exoplayer2.l.a.b(c.this.w)).postAtTime(new Runnable() { // from class: com.applovin.exoplayer2.d.c$g$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        bVar.b(null);
                    }
                }, bVar, SystemClock.uptimeMillis() + c.this.n);
            } else if (i == 0) {
                c.this.o.remove(bVar);
                if (c.this.t == bVar) {
                    c.this.t = null;
                }
                if (c.this.u == bVar) {
                    c.this.u = null;
                }
                c.this.k.b(bVar);
                if (c.this.n != -9223372036854775807L) {
                    ((Handler) com.applovin.exoplayer2.l.a.b(c.this.w)).removeCallbacksAndMessages(bVar);
                    c.this.q.remove(bVar);
                }
            }
            c.this.e();
        }
    }

    private class b implements m.b {
        private b() {
        }

        @Override // com.applovin.exoplayer2.d.m.b
        public void a(m mVar, byte[] bArr, int i, int i2, byte[] bArr2) {
            ((HandlerC0019c) com.applovin.exoplayer2.l.a.b(c.this.f240a)).obtainMessage(i, bArr).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class e implements h.a {
        private final g.a c;
        private com.applovin.exoplayer2.d.f d;
        private boolean e;

        public e(g.a aVar) {
            this.c = aVar;
        }

        public void a(final com.applovin.exoplayer2.v vVar) {
            ((Handler) com.applovin.exoplayer2.l.a.b(c.this.w)).post(new Runnable() { // from class: com.applovin.exoplayer2.d.c$e$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.b(vVar);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(com.applovin.exoplayer2.v vVar) {
            if (c.this.r == 0 || this.e) {
                return;
            }
            c cVar = c.this;
            this.d = cVar.a((Looper) com.applovin.exoplayer2.l.a.b(cVar.v), this.c, vVar, false);
            c.this.p.add(this);
        }

        @Override // com.applovin.exoplayer2.d.h.a
        public void release() {
            ai.a((Handler) com.applovin.exoplayer2.l.a.b(c.this.w), new Runnable() { // from class: com.applovin.exoplayer2.d.c$e$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            if (this.e) {
                return;
            }
            com.applovin.exoplayer2.d.f fVar = this.d;
            if (fVar != null) {
                fVar.b(this.c);
            }
            c.this.p.remove(this);
            this.e = true;
        }
    }
}
