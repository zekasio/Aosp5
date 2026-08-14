package com.applovin.exoplayer2.i.i;

import com.applovin.exoplayer2.i.a;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a extends com.applovin.exoplayer2.i.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f536a;

    public a() {
        super("Mp4WebvttDecoder");
        this.f536a = new y();
    }

    @Override // com.applovin.exoplayer2.i.d
    protected com.applovin.exoplayer2.i.f a(byte[] bArr, int i, boolean z) throws com.applovin.exoplayer2.i.h {
        this.f536a.a(bArr, i);
        ArrayList arrayList = new ArrayList();
        while (this.f536a.a() > 0) {
            if (this.f536a.a() < 8) {
                throw new com.applovin.exoplayer2.i.h("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int iQ = this.f536a.q();
            if (this.f536a.q() == 1987343459) {
                arrayList.add(a(this.f536a, iQ - 8));
            } else {
                this.f536a.e(iQ - 8);
            }
        }
        return new b(arrayList);
    }

    private static com.applovin.exoplayer2.i.a a(y yVar, int i) throws com.applovin.exoplayer2.i.h {
        CharSequence charSequenceA = null;
        a.C0033a c0033aA = null;
        while (i > 0) {
            if (i < 8) {
                throw new com.applovin.exoplayer2.i.h("Incomplete vtt cue box header found.");
            }
            int iQ = yVar.q();
            int iQ2 = yVar.q();
            int i2 = iQ - 8;
            String strA = ai.a(yVar.d(), yVar.c(), i2);
            yVar.e(i2);
            i = (i - 8) - i2;
            if (iQ2 == 1937011815) {
                c0033aA = f.a(strA);
            } else if (iQ2 == 1885436268) {
                charSequenceA = f.a((String) null, strA.trim(), (List<d>) Collections.emptyList());
            }
        }
        if (charSequenceA == null) {
            charSequenceA = "";
        }
        if (c0033aA != null) {
            return c0033aA.a(charSequenceA).e();
        }
        return f.a(charSequenceA);
    }
}
