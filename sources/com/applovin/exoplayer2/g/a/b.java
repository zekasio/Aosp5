package com.applovin.exoplayer2.g.a;

import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.exoplayer2.g.d;
import com.applovin.exoplayer2.g.g;
import com.applovin.exoplayer2.l.x;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b extends g {
    @Override // com.applovin.exoplayer2.g.g
    protected com.applovin.exoplayer2.g.a a(d dVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return a(new x(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }

    private static com.applovin.exoplayer2.g.a a(x xVar) {
        xVar.b(12);
        int iC = (xVar.c() + xVar.c(12)) - 4;
        xVar.b(44);
        xVar.e(xVar.c(12));
        xVar.b(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strA = null;
            if (xVar.c() >= iC) {
                break;
            }
            xVar.b(48);
            int iC2 = xVar.c(8);
            xVar.b(4);
            int iC3 = xVar.c() + xVar.c(12);
            String strA2 = null;
            while (xVar.c() < iC3) {
                int iC4 = xVar.c(8);
                int iC5 = xVar.c(8);
                int iC6 = xVar.c() + iC5;
                if (iC4 == 2) {
                    int iC7 = xVar.c(16);
                    xVar.b(8);
                    if (iC7 == 3) {
                        while (xVar.c() < iC6) {
                            strA = xVar.a(xVar.c(8), Charsets.US_ASCII);
                            int iC8 = xVar.c(8);
                            for (int i = 0; i < iC8; i++) {
                                xVar.e(xVar.c(8));
                            }
                        }
                    }
                } else if (iC4 == 21) {
                    strA2 = xVar.a(iC5, Charsets.US_ASCII);
                }
                xVar.a(iC6 * 8);
            }
            xVar.a(iC3 * 8);
            if (strA != null && strA2 != null) {
                arrayList.add(new a(iC2, strA + strA2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new com.applovin.exoplayer2.g.a(arrayList);
    }
}
