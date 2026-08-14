package com.applovin.exoplayer2;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class ai extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f35a;
    public final int b;

    public static ai a(String str, Throwable th) {
        return new ai(str, th, true, 0);
    }

    public static ai b(String str, Throwable th) {
        return new ai(str, th, true, 1);
    }

    public static ai a(String str) {
        return new ai(str, null, false, 1);
    }

    protected ai(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.f35a = z;
        this.b = i;
    }
}
