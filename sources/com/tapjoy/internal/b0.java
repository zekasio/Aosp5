package com.tapjoy.internal;

import cz.msebera.android.httpclient.protocol.HTTP;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f1757a;

    static {
        Charset.forName("US-ASCII");
        Charset.forName("ISO-8859-1");
        f1757a = Charset.forName("UTF-8");
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        Charset.forName(HTTP.UTF_16);
    }
}
