package com.tapjoy.internal;

/* JADX INFO: loaded from: classes2.dex */
public class p5 {

    public enum a {
        SDK_ANDROID((byte) 2),
        RPC_ANALYTICS((byte) 49);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte f1884a;

        a(byte b) {
            this.f1884a = b;
        }
    }

    public static String a(String str) {
        if (str.regionMatches(13, "-8000-8000-", 0, 11)) {
            return new StringBuffer().append(str.substring(0, 8)).append(str.substring(24, 30)).append(str.substring(9, 13)).append(str.substring(30)).toString();
        }
        throw new IllegalArgumentException("The given UUID did not come from 5Rocks.");
    }
}
