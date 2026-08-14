package com.applovin.exoplayer2.l;

import android.os.Handler;
import android.os.Message;
import com.applovin.exoplayer2.l.o;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class ae implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<a> f607a = new ArrayList(50);
    private final Handler b;

    public ae(Handler handler) {
        this.b = handler;
    }

    @Override // com.applovin.exoplayer2.l.o
    public boolean a(int i) {
        return this.b.hasMessages(i);
    }

    @Override // com.applovin.exoplayer2.l.o
    public o.a b(int i) {
        return a().a(this.b.obtainMessage(i), this);
    }

    @Override // com.applovin.exoplayer2.l.o
    public o.a a(int i, Object obj) {
        return a().a(this.b.obtainMessage(i, obj), this);
    }

    @Override // com.applovin.exoplayer2.l.o
    public o.a a(int i, int i2, int i3) {
        return a().a(this.b.obtainMessage(i, i2, i3), this);
    }

    @Override // com.applovin.exoplayer2.l.o
    public o.a a(int i, int i2, int i3, Object obj) {
        return a().a(this.b.obtainMessage(i, i2, i3, obj), this);
    }

    @Override // com.applovin.exoplayer2.l.o
    public boolean a(o.a aVar) {
        return ((a) aVar).a(this.b);
    }

    @Override // com.applovin.exoplayer2.l.o
    public boolean c(int i) {
        return this.b.sendEmptyMessage(i);
    }

    @Override // com.applovin.exoplayer2.l.o
    public boolean a(int i, long j) {
        return this.b.sendEmptyMessageAtTime(i, j);
    }

    @Override // com.applovin.exoplayer2.l.o
    public void d(int i) {
        this.b.removeMessages(i);
    }

    @Override // com.applovin.exoplayer2.l.o
    public void a(Object obj) {
        this.b.removeCallbacksAndMessages(obj);
    }

    @Override // com.applovin.exoplayer2.l.o
    public boolean a(Runnable runnable) {
        return this.b.post(runnable);
    }

    private static a a() {
        a aVarRemove;
        List<a> list = f607a;
        synchronized (list) {
            if (list.isEmpty()) {
                aVarRemove = new a();
            } else {
                aVarRemove = list.remove(list.size() - 1);
            }
        }
        return aVarRemove;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(a aVar) {
        List<a> list = f607a;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(aVar);
            }
        }
    }

    private static final class a implements o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Message f608a;
        private ae b;

        private a() {
        }

        public a a(Message message, ae aeVar) {
            this.f608a = message;
            this.b = aeVar;
            return this;
        }

        public boolean a(Handler handler) {
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) com.applovin.exoplayer2.l.a.b(this.f608a));
            b();
            return zSendMessageAtFrontOfQueue;
        }

        @Override // com.applovin.exoplayer2.l.o.a
        public void a() {
            ((Message) com.applovin.exoplayer2.l.a.b(this.f608a)).sendToTarget();
            b();
        }

        private void b() {
            this.f608a = null;
            this.b = null;
            ae.b(this);
        }
    }
}
