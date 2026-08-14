package com.applovin.exoplayer2.m;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.l.v;
import com.applovin.exoplayer2.l.y;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<byte[]> f640a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final String f;

    public static a a(y yVar) throws ai {
        String strA;
        int i;
        int i2;
        float f;
        try {
            yVar.e(4);
            int iH = (yVar.h() & 3) + 1;
            if (iH == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iH2 = yVar.h() & 31;
            for (int i3 = 0; i3 < iH2; i3++) {
                arrayList.add(b(yVar));
            }
            int iH3 = yVar.h();
            for (int i4 = 0; i4 < iH3; i4++) {
                arrayList.add(b(yVar));
            }
            if (iH2 > 0) {
                v.b bVarA = v.a((byte[]) arrayList.get(0), iH, ((byte[]) arrayList.get(0)).length);
                int i5 = bVarA.e;
                int i6 = bVarA.f;
                float f2 = bVarA.g;
                strA = com.applovin.exoplayer2.l.e.a(bVarA.f631a, bVarA.b, bVarA.c);
                i = i5;
                i2 = i6;
                f = f2;
            } else {
                strA = null;
                i = -1;
                i2 = -1;
                f = 1.0f;
            }
            return new a(arrayList, iH, i, i2, f, strA);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ai.b("Error parsing AVC config", e);
        }
    }

    private a(List<byte[]> list, int i, int i2, int i3, float f, String str) {
        this.f640a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
        this.f = str;
    }

    private static byte[] b(y yVar) {
        int i = yVar.i();
        int iC = yVar.c();
        yVar.e(i);
        return com.applovin.exoplayer2.l.e.a(yVar.d(), iC, i);
    }
}
