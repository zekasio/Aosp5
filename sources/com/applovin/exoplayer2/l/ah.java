package com.applovin.exoplayer2.l;

import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
public final class ah {
    public static void a(String str) {
        if (ai.f611a >= 18) {
            b(str);
        }
    }

    public static void a() {
        if (ai.f611a >= 18) {
            b();
        }
    }

    private static void b(String str) {
        Trace.beginSection(str);
    }

    private static void b() {
        Trace.endSection();
    }
}
