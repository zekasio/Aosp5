package com.vungle.warren.utility;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public class UtilityResource {
    public long getSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public long getElapsedMillis() {
        return SystemClock.elapsedRealtime();
    }
}
