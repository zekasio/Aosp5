package com.applovin.exoplayer2;

import android.os.Build;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final String f679a = "ExoPlayerLib/2.15.1 (Linux; Android " + Build.VERSION.RELEASE + ") ExoPlayerLib/2.15.1";
    private static final HashSet<String> b = new HashSet<>();
    private static String c = "goog.exo.core";

    public static synchronized String a() {
        return c;
    }

    public static synchronized void a(String str) {
        if (b.add(str)) {
            c += ", " + str;
        }
    }
}
