package com.applovin.exoplayer2.d;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.applovin.exoplayer2.d.e;
import com.applovin.exoplayer2.d.f;
import com.applovin.exoplayer2.d.g;
import com.applovin.exoplayer2.d.m;
import com.applovin.exoplayer2.k.v;
import com.applovin.exoplayer2.l.ai;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
class b implements com.applovin.exoplayer2.d.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<e.a> f236a;
    final r b;
    final UUID c;
    final e d;
    private final m e;
    private final a f;
    private final InterfaceC0018b g;
    private final int h;
    private final boolean i;
    private final boolean j;
    private final HashMap<String, String> k;
    private final com.applovin.exoplayer2.l.i<g.a> l;
    private final v m;
    private int n;
    private int o;
    private HandlerThread p;
    private c q;
    private com.applovin.exoplayer2.c.b r;
    private f.a s;
    private byte[] t;
    private byte[] u;
    private m.a v;
    private m.d w;

    public interface a {
        void a();

        void a(b bVar);

        void a(Exception exc, boolean z);
    }

    /* JADX INFO: renamed from: com.applovin.exoplayer2.d.b$b, reason: collision with other inner class name */
    public interface InterfaceC0018b {
        void a(b bVar, int i);

        void b(b bVar, int i);
    }

    public static final class f extends IOException {
        public f(Throwable th) {
            super(th);
        }
    }

    public b(UUID uuid, m mVar, a aVar, InterfaceC0018b interfaceC0018b, List<e.a> list, int i, boolean z, boolean z2, byte[] bArr, HashMap<String, String> map, r rVar, Looper looper, v vVar) {
        if (i == 1 || i == 3) {
            com.applovin.exoplayer2.l.a.b(bArr);
        }
        this.c = uuid;
        this.f = aVar;
        this.g = interfaceC0018b;
        this.e = mVar;
        this.h = i;
        this.i = z;
        this.j = z2;
        if (bArr != null) {
            this.u = bArr;
            this.f236a = null;
        } else {
            this.f236a = Collections.unmodifiableList((List) com.applovin.exoplayer2.l.a.b(list));
        }
        this.k = map;
        this.b = rVar;
        this.l = new com.applovin.exoplayer2.l.i<>();
        this.m = vVar;
        this.n = 2;
        this.d = new e(looper);
    }

    public boolean a(byte[] bArr) {
        return Arrays.equals(this.t, bArr);
    }

    public void a(int i) {
        if (i != 2) {
            return;
        }
        l();
    }

    public void a() {
        this.w = this.e.b();
        ((c) ai.a(this.q)).a(0, com.applovin.exoplayer2.l.a.b(this.w), true);
    }

    public void b() {
        if (i()) {
            a(true);
        }
    }

    public void a(Exception exc, boolean z) {
        a(exc, z ? 1 : 3);
    }

    @Override // com.applovin.exoplayer2.d.f
    public final int c() {
        return this.n;
    }

    @Override // com.applovin.exoplayer2.d.f
    public boolean d() {
        return this.i;
    }

    @Override // com.applovin.exoplayer2.d.f
    public final f.a e() {
        if (this.n == 1) {
            return this.s;
        }
        return null;
    }

    @Override // com.applovin.exoplayer2.d.f
    public final UUID f() {
        return this.c;
    }

    @Override // com.applovin.exoplayer2.d.f
    public final com.applovin.exoplayer2.c.b g() {
        return this.r;
    }

    @Override // com.applovin.exoplayer2.d.f
    public Map<String, String> h() {
        byte[] bArr = this.t;
        if (bArr == null) {
            return null;
        }
        return this.e.c(bArr);
    }

    @Override // com.applovin.exoplayer2.d.f
    public boolean a(String str) {
        return this.e.a((byte[]) com.applovin.exoplayer2.l.a.a(this.t), str);
    }

    @Override // com.applovin.exoplayer2.d.f
    public void a(g.a aVar) {
        com.applovin.exoplayer2.l.a.b(this.o >= 0);
        if (aVar != null) {
            this.l.a(aVar);
        }
        int i = this.o + 1;
        this.o = i;
        if (i == 1) {
            com.applovin.exoplayer2.l.a.b(this.n == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.p = handlerThread;
            handlerThread.start();
            this.q = new c(this.p.getLooper());
            if (i()) {
                a(true);
            }
        } else if (aVar != null && m() && this.l.c(aVar) == 1) {
            aVar.a(this.n);
        }
        this.g.a(this, this.o);
    }

    @Override // com.applovin.exoplayer2.d.f
    public void b(g.a aVar) {
        com.applovin.exoplayer2.l.a.b(this.o > 0);
        int i = this.o - 1;
        this.o = i;
        if (i == 0) {
            this.n = 0;
            ((e) ai.a(this.d)).removeCallbacksAndMessages(null);
            ((c) ai.a(this.q)).a();
            this.q = null;
            ((HandlerThread) ai.a(this.p)).quit();
            this.p = null;
            this.r = null;
            this.s = null;
            this.v = null;
            this.w = null;
            byte[] bArr = this.t;
            if (bArr != null) {
                this.e.a(bArr);
                this.t = null;
            }
        }
        if (aVar != null) {
            this.l.b(aVar);
            if (this.l.c(aVar) == 0) {
                aVar.d();
            }
        }
        this.g.b(this, this.o);
    }

    private boolean i() {
        if (m()) {
            return true;
        }
        try {
            byte[] bArrA = this.e.a();
            this.t = bArrA;
            this.r = this.e.d(bArrA);
            final int i = 3;
            this.n = 3;
            a(new com.applovin.exoplayer2.l.h() { // from class: com.applovin.exoplayer2.d.b$$ExternalSyntheticLambda0
                @Override // com.applovin.exoplayer2.l.h
                public final void accept(Object obj) {
                    ((g.a) obj).a(i);
                }
            });
            com.applovin.exoplayer2.l.a.b(this.t);
            return true;
        } catch (NotProvisionedException unused) {
            this.f.a(this);
            return false;
        } catch (Exception e2) {
            a(e2, 1);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Object obj, Object obj2) {
        if (obj == this.w) {
            if (this.n == 2 || m()) {
                this.w = null;
                if (obj2 instanceof Exception) {
                    this.f.a((Exception) obj2, false);
                    return;
                }
                try {
                    this.e.b((byte[]) obj2);
                    this.f.a();
                } catch (Exception e2) {
                    this.f.a(e2, true);
                }
            }
        }
    }

    private void a(boolean z) {
        if (this.j) {
            return;
        }
        byte[] bArr = (byte[]) ai.a(this.t);
        int i = this.h;
        if (i != 0 && i != 1) {
            if (i == 2) {
                if (this.u == null || j()) {
                    a(bArr, 2, z);
                    return;
                }
                return;
            }
            if (i != 3) {
                return;
            }
            com.applovin.exoplayer2.l.a.b(this.u);
            com.applovin.exoplayer2.l.a.b(this.t);
            a(this.u, 3, z);
            return;
        }
        if (this.u == null) {
            a(bArr, 1, z);
            return;
        }
        if (this.n == 4 || j()) {
            long jK = k();
            if (this.h == 0 && jK <= 60) {
                com.applovin.exoplayer2.l.q.a("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jK);
                a(bArr, 2, z);
                return;
            }
            if (jK <= 0) {
                a(new q(), 2);
            } else {
                this.n = 4;
                a(new com.applovin.exoplayer2.l.h() { // from class: com.applovin.exoplayer2.d.b$$ExternalSyntheticLambda1
                    @Override // com.applovin.exoplayer2.l.h
                    public final void accept(Object obj) {
                        ((g.a) obj).b();
                    }
                });
            }
        }
    }

    private boolean j() {
        try {
            this.e.b(this.t, this.u);
            return true;
        } catch (Exception e2) {
            a(e2, 1);
            return false;
        }
    }

    private long k() {
        if (!com.applovin.exoplayer2.h.d.equals(this.c)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) com.applovin.exoplayer2.l.a.b(u.a(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    private void a(byte[] bArr, int i, boolean z) {
        try {
            this.v = this.e.a(bArr, this.f236a, i, this.k);
            ((c) ai.a(this.q)).a(1, com.applovin.exoplayer2.l.a.b(this.v), z);
        } catch (Exception e2) {
            b(e2, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Object obj, Object obj2) {
        if (obj == this.v && m()) {
            this.v = null;
            if (obj2 instanceof Exception) {
                b((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.h == 3) {
                    this.e.a((byte[]) ai.a(this.u), bArr);
                    a(new com.applovin.exoplayer2.l.h() { // from class: com.applovin.exoplayer2.d.b$$ExternalSyntheticLambda3
                        @Override // com.applovin.exoplayer2.l.h
                        public final void accept(Object obj3) {
                            ((g.a) obj3).c();
                        }
                    });
                    return;
                }
                byte[] bArrA = this.e.a(this.t, bArr);
                int i = this.h;
                if ((i == 2 || (i == 0 && this.u != null)) && bArrA != null && bArrA.length != 0) {
                    this.u = bArrA;
                }
                this.n = 4;
                a(new com.applovin.exoplayer2.l.h() { // from class: com.applovin.exoplayer2.d.b$$ExternalSyntheticLambda4
                    @Override // com.applovin.exoplayer2.l.h
                    public final void accept(Object obj3) {
                        ((g.a) obj3).a();
                    }
                });
            } catch (Exception e2) {
                b(e2, true);
            }
        }
    }

    private void l() {
        if (this.h == 0 && this.n == 4) {
            ai.a(this.t);
            a(false);
        }
    }

    private void b(Exception exc, boolean z) {
        if (exc instanceof NotProvisionedException) {
            this.f.a(this);
        } else {
            a(exc, z ? 1 : 2);
        }
    }

    private void a(final Exception exc, int i) {
        this.s = new f.a(exc, j.a(exc, i));
        com.applovin.exoplayer2.l.q.c("DefaultDrmSession", "DRM session error", exc);
        a(new com.applovin.exoplayer2.l.h() { // from class: com.applovin.exoplayer2.d.b$$ExternalSyntheticLambda2
            @Override // com.applovin.exoplayer2.l.h
            public final void accept(Object obj) {
                ((g.a) obj).a(exc);
            }
        });
        if (this.n != 4) {
            this.n = 1;
        }
    }

    private boolean m() {
        int i = this.n;
        return i == 3 || i == 4;
    }

    private void a(com.applovin.exoplayer2.l.h<g.a> hVar) {
        Iterator<g.a> it = this.l.a().iterator();
        while (it.hasNext()) {
            hVar.accept(it.next());
        }
    }

    private class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i == 0) {
                b.this.a(obj, obj2);
            } else {
                if (i != 1) {
                    return;
                }
                b.this.b(obj, obj2);
            }
        }
    }

    private class c extends Handler {
        private boolean b;

        public c(Looper looper) {
            super(looper);
        }

        void a(int i, Object obj, boolean z) {
            obtainMessage(i, new d(com.applovin.exoplayer2.h.j.a(), z, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object objA;
            d dVar = (d) message.obj;
            try {
                int i = message.what;
                if (i == 0) {
                    objA = b.this.b.a(b.this.c, (m.d) dVar.d);
                } else if (i == 1) {
                    objA = b.this.b.a(b.this.c, (m.a) dVar.d);
                } else {
                    throw new RuntimeException();
                }
            } catch (s e) {
                boolean zA = a(message, e);
                objA = e;
                if (zA) {
                    return;
                }
            } catch (Exception e2) {
                com.applovin.exoplayer2.l.q.b("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
                objA = e2;
            }
            b.this.m.a(dVar.f238a);
            synchronized (this) {
                if (!this.b) {
                    b.this.d.obtainMessage(message.what, Pair.create(dVar.d, objA)).sendToTarget();
                }
            }
        }

        private boolean a(Message message, s sVar) {
            IOException fVar;
            d dVar = (d) message.obj;
            if (!dVar.b) {
                return false;
            }
            dVar.e++;
            if (dVar.e > b.this.m.a(3)) {
                return false;
            }
            com.applovin.exoplayer2.h.j jVar = new com.applovin.exoplayer2.h.j(dVar.f238a, sVar.f259a, sVar.b, sVar.c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.c, sVar.d);
            com.applovin.exoplayer2.h.m mVar = new com.applovin.exoplayer2.h.m(3);
            if (sVar.getCause() instanceof IOException) {
                fVar = (IOException) sVar.getCause();
            } else {
                fVar = new f(sVar.getCause());
            }
            long jA = b.this.m.a(new v.a(jVar, mVar, fVar, dVar.e));
            if (jA == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                if (this.b) {
                    return false;
                }
                sendMessageDelayed(Message.obtain(message), jA);
                return true;
            }
        }

        public synchronized void a() {
            removeCallbacksAndMessages(null);
            this.b = true;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f238a;
        public final boolean b;
        public final long c;
        public final Object d;
        public int e;

        public d(long j, boolean z, long j2, Object obj) {
            this.f238a = j;
            this.b = z;
            this.c = j2;
            this.d = obj;
        }
    }
}
