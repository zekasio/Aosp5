package com.applovin.exoplayer2.i.i;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.l.y;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f547a = Pattern.compile("^NOTE([ \t].*)?$");

    public static void a(y yVar) throws ai {
        int iC = yVar.c();
        if (b(yVar)) {
            return;
        }
        yVar.d(iC);
        throw ai.b("Expected WEBVTT. Got " + yVar.C(), null);
    }

    public static boolean b(y yVar) {
        String strC = yVar.C();
        return strC != null && strC.startsWith("WEBVTT");
    }

    public static long a(String str) throws NumberFormatException {
        String[] strArrB = com.applovin.exoplayer2.l.ai.b(str, "\\.");
        long j = 0;
        for (String str2 : com.applovin.exoplayer2.l.ai.a(strArrB[0], ":")) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (strArrB.length == 2) {
            j2 += Long.parseLong(strArrB[1]);
        }
        return j2 * 1000;
    }

    public static float b(String str) throws NumberFormatException {
        if (!str.endsWith("%")) {
            throw new NumberFormatException("Percentages must end with %");
        }
        return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
    }
}
