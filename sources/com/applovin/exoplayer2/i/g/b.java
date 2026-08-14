package com.applovin.exoplayer2.i.g;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.a.w;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
final class b {
    private static final Pattern d = Pattern.compile("\\s+");
    private static final w<String> e = w.a("auto", "none");
    private static final w<String> f = w.a("dot", "sesame", "circle");
    private static final w<String> g = w.a("filled", "open");
    private static final w<String> h = w.a("after", "before", "outside");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f524a;
    public final int b;
    public final int c;

    private b(int i, int i2, int i3) {
        this.f524a = i;
        this.b = i2;
        this.c = i3;
    }

    public static b a(String str) {
        if (str == null) {
            return null;
        }
        String lowerCase = Ascii.toLowerCase(str.trim());
        if (lowerCase.isEmpty()) {
            return null;
        }
        return a((w<String>) w.a((Object[]) TextUtils.split(lowerCase, d)));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.applovin.exoplayer2.i.g.b a(com.applovin.exoplayer2.common.a.w<java.lang.String> r9) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.i.g.b.a(com.applovin.exoplayer2.common.a.w):com.applovin.exoplayer2.i.g.b");
    }
}
