package com.applovin.exoplayer2.i.i;

import android.text.TextUtils;
import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.l.y;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class g extends com.applovin.exoplayer2.i.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f546a;
    private final c b;

    public g() {
        super("WebvttDecoder");
        this.f546a = new y();
        this.b = new c();
    }

    @Override // com.applovin.exoplayer2.i.d
    protected com.applovin.exoplayer2.i.f a(byte[] bArr, int i, boolean z) throws com.applovin.exoplayer2.i.h {
        e eVarA;
        this.f546a.a(bArr, i);
        ArrayList arrayList = new ArrayList();
        try {
            h.a(this.f546a);
            while (!TextUtils.isEmpty(this.f546a.C())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int iA = a(this.f546a);
                if (iA == 0) {
                    return new i(arrayList2);
                }
                if (iA == 1) {
                    b(this.f546a);
                } else if (iA == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new com.applovin.exoplayer2.i.h("A style block was found after the first cue.");
                    }
                    this.f546a.C();
                    arrayList.addAll(this.b.a(this.f546a));
                } else if (iA == 3 && (eVarA = f.a(this.f546a, arrayList)) != null) {
                    arrayList2.add(eVarA);
                }
            }
        } catch (ai e) {
            throw new com.applovin.exoplayer2.i.h(e);
        }
    }

    private static int a(y yVar) {
        int i = -1;
        int iC = 0;
        while (i == -1) {
            iC = yVar.c();
            String strC = yVar.C();
            if (strC == null) {
                i = 0;
            } else if ("STYLE".equals(strC)) {
                i = 2;
            } else {
                i = strC.startsWith("NOTE") ? 1 : 3;
            }
        }
        yVar.d(iC);
        return i;
    }

    private static void b(y yVar) {
        while (!TextUtils.isEmpty(yVar.C())) {
        }
    }
}
