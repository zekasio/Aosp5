package com.tapjoy.internal;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.tapjoy.TJConnectListener;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f1768a;
    public final Condition b;
    public volatile c c;
    public final LinkedList<TJConnectListener> d;
    public b e;
    public long f;
    public a g;
    public a h;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f1769a;
        public final String b;
        public final Hashtable<String, ?> c;

        public a(c6 c6Var, Context context, String str, Hashtable<String, ?> hashtable) {
            this.f1769a = c6Var.a(context);
            this.b = str;
            this.c = hashtable;
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1770a;
        public boolean b;
        public Context c;
        public BroadcastReceiver d = new C0103b();

        public class a implements Observer {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CountDownLatch f1771a;

            public a(CountDownLatch countDownLatch) {
                this.f1771a = countDownLatch;
            }

            @Override // java.util.Observer
            public void update(Observable observable, Object obj) {
                s5.b.deleteObserver(this);
                b.this.b = Boolean.TRUE.equals(obj);
                this.f1771a.countDown();
            }
        }

        /* JADX INFO: renamed from: com.tapjoy.internal.c6$b$b, reason: collision with other inner class name */
        public class C0103b extends BroadcastReceiver {
            public C0103b() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                c6.this.a();
            }
        }

        public /* synthetic */ b(a6 a6Var) {
        }

        public final void b() {
            this.c.unregisterReceiver(this.d);
        }

        @Override // java.lang.Runnable
        public void run() {
            c6 c6Var = c6.this;
            c cVar = c.RETRYING;
            c cVar2 = c.TRYING;
            c6Var.a(cVar);
            this.c = c6.a(c6.this).f1769a;
            this.c.registerReceiver(this.d, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            while (!this.f1770a) {
                try {
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    s5.b.addObserver(new a(countDownLatch));
                    a aVarA = c6.a(c6.this);
                    c6 c6Var2 = c6.this;
                    if (!super/*com.tapjoy.internal.p4*/.a(aVarA.f1769a, aVarA.b, aVarA.c, (TJConnectListener) null)) {
                        c6.this.a(false);
                        return;
                    }
                    try {
                        countDownLatch.await();
                    } catch (InterruptedException unused) {
                    }
                    if (this.b) {
                        c6 c6Var3 = c6.this;
                        c cVar3 = c.CONNECTED;
                        c cVar4 = c.RETRYING;
                        c6Var3.a(cVar3);
                        c6.this.a(true);
                        return;
                    }
                    c6.this.a(false);
                    long jMax = Math.max(c6.this.f, 1000L);
                    c6.this.f = Math.min(jMax << 2, 3600000L);
                    c6.this.a(jMax);
                } finally {
                    b();
                    a();
                }
            }
        }

        public void a() {
            c6 c6Var = c6.this;
            if (c6Var.e == this) {
                c6Var.e = null;
            }
            if (c6.this.c == c.RETRYING) {
                c6 c6Var2 = c6.this;
                c cVar = c.STOPPED;
                c cVar2 = c.RETRYING;
                c6Var2.a(cVar);
            }
        }
    }

    public enum c {
        STOPPED,
        TRYING,
        RETRYING,
        BACKOFF,
        CONNECTED
    }

    public c6() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f1768a = reentrantLock;
        this.b = reentrantLock.newCondition();
        this.c = c.STOPPED;
        this.d = new LinkedList<>();
        this.f = 1000L;
    }

    public abstract boolean a(Context context, String str, Hashtable<String, ?> hashtable, TJConnectListener tJConnectListener);

    public final Context a(Context context) {
        Context applicationContext = context != null ? context instanceof Application ? context : context.getApplicationContext() : null;
        return applicationContext != null ? applicationContext : context;
    }

    public final void a(c cVar) {
        this.f1768a.lock();
        try {
            this.c = cVar;
        } finally {
            this.f1768a.unlock();
        }
    }

    public static /* synthetic */ a a(c6 c6Var) {
        c6Var.f1768a.lock();
        try {
            a aVar = c6Var.h;
            if (aVar != null) {
                c6Var.g = aVar;
                c6Var.h = null;
            }
            return c6Var.g;
        } finally {
            c6Var.f1768a.unlock();
        }
    }

    public final void a(boolean z) {
        this.f1768a.lock();
        try {
            if (this.d.size() == 0) {
                return;
            }
            ArrayList<TJConnectListener> arrayList = new ArrayList(this.d);
            this.d.clear();
            this.f1768a.unlock();
            for (TJConnectListener tJConnectListener : arrayList) {
                if (z) {
                    tJConnectListener.onConnectSuccess();
                } else {
                    tJConnectListener.onConnectFailure();
                }
            }
        } finally {
            this.f1768a.unlock();
        }
    }

    public void a() {
        this.f1768a.lock();
        try {
            this.f = 1000L;
            this.b.signal();
        } finally {
            this.f1768a.unlock();
        }
    }

    public boolean a(long j) {
        this.f1768a.lock();
        try {
            c cVar = c.BACKOFF;
            c cVar2 = c.RETRYING;
            a(cVar);
            if (this.b.await(j, TimeUnit.MILLISECONDS)) {
                this.f = 1000L;
            }
            return false;
        } catch (InterruptedException unused) {
            return false;
        } finally {
            c cVar3 = c.RETRYING;
            c cVar4 = c.BACKOFF;
            a(cVar3);
            this.f1768a.unlock();
        }
    }
}
