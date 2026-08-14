package com.vungle.warren.utility;

/* JADX INFO: loaded from: classes3.dex */
public interface Scheduler {
    void cancel(String str);

    void cancelAll();

    void schedule(Runnable runnable, long j);

    void schedule(Runnable runnable, String str, long j);
}
