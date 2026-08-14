package com.tapjoy.internal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes2.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<DateFormat> f1888a = new a();

    public static class a extends ThreadLocal<DateFormat> {
        @Override // java.lang.ThreadLocal
        public DateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ");
        }
    }

    public static class b extends ThreadLocal<DateFormat> {
        @Override // java.lang.ThreadLocal
        public DateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
        }
    }

    static {
        new b();
    }
}
