package com.tapjoy.internal;

import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes2.dex */
public class k5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static k5 f1837a = new k5();

    public static URLConnection b(URL url) {
        return f1837a.a(url);
    }

    public URLConnection a(URL url) {
        return url.openConnection();
    }
}
