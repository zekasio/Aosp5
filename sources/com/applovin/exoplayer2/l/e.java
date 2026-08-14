package com.applovin.exoplayer2.l;

import android.util.Pair;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f614a = {0, 0, 0, 1};
    private static final String[] b = {"", "A", "B", "C"};

    public static Pair<Integer, Integer> a(byte[] bArr) {
        y yVar = new y(bArr);
        yVar.d(9);
        int iH = yVar.h();
        yVar.d(20);
        return Pair.create(Integer.valueOf(yVar.w()), Integer.valueOf(iH));
    }

    public static List<byte[]> a(boolean z) {
        return Collections.singletonList(z ? new byte[]{1} : new byte[]{0});
    }

    public static boolean a(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }

    public static String a(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static String a(z zVar) {
        zVar.a(24);
        int iC = zVar.c(2);
        boolean zB = zVar.b();
        int iC2 = zVar.c(5);
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            if (zVar.b()) {
                i |= 1 << i2;
            }
        }
        int i3 = 6;
        int[] iArr = new int[6];
        for (int i4 = 0; i4 < 6; i4++) {
            iArr[i4] = zVar.c(8);
        }
        StringBuilder sb = new StringBuilder(ai.a("hvc1.%s%d.%X.%c%d", b[iC], Integer.valueOf(iC2), Integer.valueOf(i), Character.valueOf(zB ? 'H' : 'L'), Integer.valueOf(zVar.c(8))));
        while (i3 > 0 && iArr[i3 - 1] == 0) {
            i3--;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i5])));
        }
        return sb.toString();
    }

    public static byte[] a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = f614a;
        byte[] bArr3 = new byte[bArr2.length + i2];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, bArr2.length, i2);
        return bArr3;
    }
}
