package com.applovin.exoplayer2.i.e;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f518a;
    public final int b;
    public final Integer c;
    public final float d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    private static boolean a(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    private c(String str, int i, Integer num, float f, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f518a = str;
        this.b = i;
        this.c = num;
        this.d = f;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
    }

    public static c a(String str, a aVar) {
        com.applovin.exoplayer2.l.a.a(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        if (strArrSplit.length != aVar.i) {
            q.c("SsaStyle", ai.a("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(aVar.i), Integer.valueOf(strArrSplit.length), str));
            return null;
        }
        try {
            return new c(strArrSplit[aVar.f519a].trim(), aVar.b != -1 ? c(strArrSplit[aVar.b].trim()) : -1, aVar.c != -1 ? a(strArrSplit[aVar.c].trim()) : null, aVar.d != -1 ? d(strArrSplit[aVar.d].trim()) : -3.4028235E38f, aVar.e != -1 && e(strArrSplit[aVar.e].trim()), aVar.f != -1 && e(strArrSplit[aVar.f].trim()), aVar.g != -1 && e(strArrSplit[aVar.g].trim()), aVar.h != -1 && e(strArrSplit[aVar.h].trim()));
        } catch (RuntimeException e) {
            q.b("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(String str) {
        try {
            int i = Integer.parseInt(str.trim());
            if (a(i)) {
                return i;
            }
        } catch (NumberFormatException unused) {
        }
        q.c("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    public static Integer a(String str) {
        long j;
        try {
            if (str.startsWith("&H")) {
                j = Long.parseLong(str.substring(2), 16);
            } else {
                j = Long.parseLong(str);
            }
            com.applovin.exoplayer2.l.a.a(j <= 4294967295L);
            return Integer.valueOf(Color.argb(com.applovin.exoplayer2.common.b.c.a(((j >> 24) & 255) ^ 255), com.applovin.exoplayer2.common.b.c.a(j & 255), com.applovin.exoplayer2.common.b.c.a((j >> 8) & 255), com.applovin.exoplayer2.common.b.c.a((j >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            q.b("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    private static float d(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            q.b("SsaStyle", "Failed to parse font size: '" + str + "'", e);
            return -3.4028235E38f;
        }
    }

    private static boolean e(String str) {
        try {
            int i = Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (NumberFormatException e) {
            q.b("SsaStyle", "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f519a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;

        private a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.f519a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = i7;
            this.h = i8;
            this.i = i9;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static com.applovin.exoplayer2.i.e.c.a a(java.lang.String r14) {
            /*
                Method dump skipped, instruction units count: 224
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.i.e.c.a.a(java.lang.String):com.applovin.exoplayer2.i.e.c$a");
        }
    }

    static final class b {
        private static final Pattern c = Pattern.compile("\\{([^}]*)\\}");
        private static final Pattern d = Pattern.compile(ai.a("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        private static final Pattern e = Pattern.compile(ai.a("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        private static final Pattern f = Pattern.compile("\\\\an(\\d+)");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f520a;
        public final PointF b;

        private b(int i, PointF pointF) {
            this.f520a = i;
            this.b = pointF;
        }

        public static b a(String str) {
            Matcher matcher = c.matcher(str);
            PointF pointF = null;
            int i = -1;
            while (matcher.find()) {
                String str2 = (String) com.applovin.exoplayer2.l.a.b(matcher.group(1));
                try {
                    PointF pointFC = c(str2);
                    if (pointFC != null) {
                        pointF = pointFC;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int iD = d(str2);
                    if (iD != -1) {
                        i = iD;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new b(i, pointF);
        }

        public static String b(String str) {
            return c.matcher(str).replaceAll("");
        }

        private static PointF c(String str) {
            String strGroup;
            String strGroup2;
            Matcher matcher = d.matcher(str);
            Matcher matcher2 = e.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    q.b("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                strGroup = matcher.group(1);
                strGroup2 = matcher.group(2);
            } else {
                if (!zFind2) {
                    return null;
                }
                strGroup = matcher2.group(1);
                strGroup2 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) com.applovin.exoplayer2.l.a.b(strGroup)).trim()), Float.parseFloat(((String) com.applovin.exoplayer2.l.a.b(strGroup2)).trim()));
        }

        private static int d(String str) {
            Matcher matcher = f.matcher(str);
            if (matcher.find()) {
                return c.c((String) com.applovin.exoplayer2.l.a.b(matcher.group(1)));
            }
            return -1;
        }
    }
}
