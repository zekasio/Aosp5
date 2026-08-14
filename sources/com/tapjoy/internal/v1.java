package com.tapjoy.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f1927a = new String[512];

    public String a(char[] cArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            i3 = (i3 * 31) + cArr[i4];
        }
        int i5 = ((i3 >>> 20) ^ (i3 >>> 12)) ^ i3;
        int length = (i5 ^ ((i5 >>> 7) ^ (i5 >>> 4))) & (r2.length - 1);
        String str = this.f1927a[length];
        if (str != null && str.length() == i2) {
            for (int i6 = 0; i6 < i2; i6++) {
                if (cArr[i + i6] == str.charAt(i6)) {
                }
            }
            return str;
        }
        String str2 = new String(cArr, i, i2);
        this.f1927a[length] = str2;
        return str2;
    }
}
