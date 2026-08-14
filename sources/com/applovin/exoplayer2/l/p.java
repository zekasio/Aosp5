package com.applovin.exoplayer2.l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.applovin.exoplayer2.l.m;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class p<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f622a;
    private final o b;
    private final b<T> c;
    private final CopyOnWriteArraySet<c<T>> d;
    private final ArrayDeque<Runnable> e;
    private final ArrayDeque<Runnable> f;
    private boolean g;

    public interface a<T> {
        void invoke(T t);
    }

    public interface b<T> {
        void invoke(T t, m mVar);
    }

    public p(Looper looper, d dVar, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, dVar, bVar);
    }

    private p(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, d dVar, b<T> bVar) {
        this.f622a = dVar;
        this.d = copyOnWriteArraySet;
        this.c = bVar;
        this.e = new ArrayDeque<>();
        this.f = new ArrayDeque<>();
        this.b = dVar.a(looper, new Handler.Callback() { // from class: com.applovin.exoplayer2.l.p$$ExternalSyntheticLambda0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f$0.a(message);
            }
        });
    }

    public p<T> a(Looper looper, b<T> bVar) {
        return new p<>(this.d, looper, this.f622a, bVar);
    }

    public void a(T t) {
        if (this.g) {
            return;
        }
        com.applovin.exoplayer2.l.a.b(t);
        this.d.add(new c<>(t));
    }

    public void b(T t) {
        for (c<T> cVar : this.d) {
            if (cVar.f623a.equals(t)) {
                cVar.a(this.c);
                this.d.remove(cVar);
            }
        }
    }

    public void a(final int i, final a<T> aVar) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.d);
        this.f.add(new Runnable() { // from class: com.applovin.exoplayer2.l.p$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                p.a(copyOnWriteArraySet, i, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(CopyOnWriteArraySet copyOnWriteArraySet, int i, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i, aVar);
        }
    }

    public void a() {
        if (this.f.isEmpty()) {
            return;
        }
        if (!this.b.a(0)) {
            o oVar = this.b;
            oVar.a(oVar.b(0));
        }
        boolean zIsEmpty = this.e.isEmpty();
        this.e.addAll(this.f);
        this.f.clear();
        if (zIsEmpty) {
            while (!this.e.isEmpty()) {
                this.e.peekFirst().run();
                this.e.removeFirst();
            }
        }
    }

    public void b(int i, a<T> aVar) {
        a(i, aVar);
        a();
    }

    public void b() {
        Iterator<c<T>> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().a(this.c);
        }
        this.d.clear();
        this.g = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Message message) {
        Iterator<c<T>> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().b(this.c);
            if (this.b.a(0)) {
                return true;
            }
        }
        return true;
    }

    private static final class c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f623a;
        private m.a b = new m.a();
        private boolean c;
        private boolean d;

        public c(T t) {
            this.f623a = t;
        }

        public void a(b<T> bVar) {
            this.d = true;
            if (this.c) {
                bVar.invoke(this.f623a, this.b.a());
            }
        }

        public void a(int i, a<T> aVar) {
            if (this.d) {
                return;
            }
            if (i != -1) {
                this.b.a(i);
            }
            this.c = true;
            aVar.invoke(this.f623a);
        }

        public void b(b<T> bVar) {
            if (this.d || !this.c) {
                return;
            }
            m mVarA = this.b.a();
            this.b = new m.a();
            this.c = false;
            bVar.invoke(this.f623a, mVarA);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f623a.equals(((c) obj).f623a);
        }

        public int hashCode() {
            return this.f623a.hashCode();
        }
    }
}
