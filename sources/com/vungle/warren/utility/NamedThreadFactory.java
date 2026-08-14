package com.vungle.warren.utility;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class NamedThreadFactory implements ThreadFactory {
    private final String name;
    private ThreadFactory threadFactory = java.util.concurrent.Executors.defaultThreadFactory();
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public NamedThreadFactory(String str) {
        this.name = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.threadFactory.newThread(runnable);
        threadNewThread.setName(this.name + "-th-" + this.atomicInteger.incrementAndGet());
        return threadNewThread;
    }
}
