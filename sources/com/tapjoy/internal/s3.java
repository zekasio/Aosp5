package com.tapjoy.internal;

import com.tapjoy.internal.r3;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class s3 implements r3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BlockingQueue<Runnable> f1903a;
    public final ThreadPoolExecutor b;
    public final ArrayDeque<r3> c = new ArrayDeque<>();
    public r3 d = null;

    public s3() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f1903a = linkedBlockingQueue;
        this.b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    public final void a() {
        r3 r3VarPoll = this.c.poll();
        this.d = r3VarPoll;
        if (r3VarPoll != null) {
            r3VarPoll.executeOnExecutor(this.b, new Object[0]);
        }
    }

    public void a(r3 r3Var) {
        r3Var.f1896a = this;
        this.c.add(r3Var);
        if (this.d == null) {
            a();
        }
    }
}
