package com.applovin.exoplayer2.m;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.l.v;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.l.z;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<byte[]> f656a;
    public final int b;
    public final String c;

    public static f a(y yVar) throws ai {
        try {
            yVar.e(21);
            int iH = yVar.h() & 3;
            int iH2 = yVar.h();
            int iC = yVar.c();
            int i = 0;
            for (int i2 = 0; i2 < iH2; i2++) {
                yVar.e(1);
                int i3 = yVar.i();
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = yVar.i();
                    i += i5 + 4;
                    yVar.e(i5);
                }
            }
            yVar.d(iC);
            byte[] bArr = new byte[i];
            String strA = null;
            int i6 = 0;
            for (int i7 = 0; i7 < iH2; i7++) {
                int iH3 = yVar.h() & 127;
                int i8 = yVar.i();
                for (int i9 = 0; i9 < i8; i9++) {
                    int i10 = yVar.i();
                    System.arraycopy(v.f629a, 0, bArr, i6, v.f629a.length);
                    int length = i6 + v.f629a.length;
                    System.arraycopy(yVar.d(), yVar.c(), bArr, length, i10);
                    if (iH3 == 33 && i9 == 0) {
                        strA = com.applovin.exoplayer2.l.e.a(new z(bArr, length, length + i10));
                    }
                    i6 = length + i10;
                    yVar.e(i10);
                }
            }
            return new f(i == 0 ? null : Collections.singletonList(bArr), iH + 1, strA);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ai.b("Error parsing HEVC config", e);
        }
    }

    private f(List<byte[]> list, int i, String str) {
        this.f656a = list;
        this.b = i;
        this.c = str;
    }
}
