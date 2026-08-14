package com.vungle.warren.utility;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public class WeakRunnable implements Runnable {
    private WeakReference<Runnable> weak;

    public WeakRunnable(Runnable runnable) {
        this.weak = new WeakReference<>(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        Runnable runnable = this.weak.get();
        if (runnable != null) {
            runnable.run();
        }
    }
}
