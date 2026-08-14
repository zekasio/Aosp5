package com.applovin.exoplayer2.m;

import com.applovin.exoplayer2.l.y;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f651a;
    public final int b;
    public final String c;

    public static c a(y yVar) {
        String str;
        yVar.e(2);
        int iH = yVar.h();
        int i = iH >> 1;
        int iH2 = ((yVar.h() >> 3) & 31) | ((iH & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else {
            if (i != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(iH2 >= 10 ? "." : ".0");
        sb.append(iH2);
        return new c(i, iH2, sb.toString());
    }

    private c(int i, int i2, String str) {
        this.f651a = i;
        this.b = i2;
        this.c = str;
    }
}
