package com.applovin.exoplayer2.l;

import java.util.Collections;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes.dex */
public final class aa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f605a = new Object();
    private final PriorityQueue<Integer> b = new PriorityQueue<>(10, Collections.reverseOrder());
    private int c = Integer.MIN_VALUE;

    public void a(int i) {
        synchronized (this.f605a) {
            this.b.add(Integer.valueOf(i));
            this.c = Math.max(this.c, i);
        }
    }

    public void b(int i) {
        synchronized (this.f605a) {
            this.b.remove(Integer.valueOf(i));
            this.c = this.b.isEmpty() ? Integer.MIN_VALUE : ((Integer) ai.a(this.b.peek())).intValue();
            this.f605a.notifyAll();
        }
    }
}
