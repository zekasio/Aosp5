package com.applovin.exoplayer2.i.c;

import android.graphics.Bitmap;
import com.applovin.exoplayer2.i.a;
import com.applovin.exoplayer2.i.d;
import com.applovin.exoplayer2.i.f;
import com.applovin.exoplayer2.i.h;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f510a;
    private final y b;
    private final C0038a c;
    private Inflater d;

    public a() {
        super("PgsDecoder");
        this.f510a = new y();
        this.b = new y();
        this.c = new C0038a();
    }

    @Override // com.applovin.exoplayer2.i.d
    protected f a(byte[] bArr, int i, boolean z) throws h {
        this.f510a.a(bArr, i);
        a(this.f510a);
        this.c.b();
        ArrayList arrayList = new ArrayList();
        while (this.f510a.a() >= 3) {
            com.applovin.exoplayer2.i.a aVarA = a(this.f510a, this.c);
            if (aVarA != null) {
                arrayList.add(aVarA);
            }
        }
        return new b(Collections.unmodifiableList(arrayList));
    }

    private void a(y yVar) {
        if (yVar.a() <= 0 || yVar.f() != 120) {
            return;
        }
        if (this.d == null) {
            this.d = new Inflater();
        }
        if (ai.a(yVar, this.b, this.d)) {
            yVar.a(this.b.d(), this.b.b());
        }
    }

    private static com.applovin.exoplayer2.i.a a(y yVar, C0038a c0038a) {
        int iB = yVar.b();
        int iH = yVar.h();
        int i = yVar.i();
        int iC = yVar.c() + i;
        com.applovin.exoplayer2.i.a aVarA = null;
        if (iC > iB) {
            yVar.d(iB);
            return null;
        }
        if (iH == 128) {
            aVarA = c0038a.a();
            c0038a.b();
        } else {
            switch (iH) {
                case 20:
                    c0038a.a(yVar, i);
                    break;
                case 21:
                    c0038a.b(yVar, i);
                    break;
                case 22:
                    c0038a.c(yVar, i);
                    break;
            }
        }
        yVar.d(iC);
        return aVarA;
    }

    /* JADX INFO: renamed from: com.applovin.exoplayer2.i.c.a$a, reason: collision with other inner class name */
    private static final class C0038a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final y f511a = new y();
        private final int[] b = new int[256];
        private boolean c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;

        /* JADX INFO: Access modifiers changed from: private */
        public void a(y yVar, int i) {
            if (i % 5 != 2) {
                return;
            }
            yVar.e(2);
            Arrays.fill(this.b, 0);
            int i2 = i / 5;
            for (int i3 = 0; i3 < i2; i3++) {
                int iH = yVar.h();
                int iH2 = yVar.h();
                int iH3 = yVar.h();
                int iH4 = yVar.h();
                int iH5 = yVar.h();
                double d = iH2;
                double d2 = iH3 - 128;
                Double.isNaN(d2);
                Double.isNaN(d);
                double d3 = iH4 - 128;
                Double.isNaN(d3);
                Double.isNaN(d);
                Double.isNaN(d2);
                Double.isNaN(d3);
                Double.isNaN(d);
                this.b[iH] = (ai.a((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255) << 8) | (iH5 << 24) | (ai.a((int) ((1.402d * d2) + d), 0, 255) << 16) | ai.a((int) (d + (d3 * 1.772d)), 0, 255);
            }
            this.c = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(y yVar, int i) {
            int iM;
            if (i < 4) {
                return;
            }
            yVar.e(3);
            int i2 = i - 4;
            if ((yVar.h() & 128) != 0) {
                if (i2 < 7 || (iM = yVar.m()) < 4) {
                    return;
                }
                this.h = yVar.i();
                this.i = yVar.i();
                this.f511a.a(iM - 4);
                i2 = i - 11;
            }
            int iC = this.f511a.c();
            int iB = this.f511a.b();
            if (iC >= iB || i2 <= 0) {
                return;
            }
            int iMin = Math.min(i2, iB - iC);
            yVar.a(this.f511a.d(), iC, iMin);
            this.f511a.d(iC + iMin);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(y yVar, int i) {
            if (i < 19) {
                return;
            }
            this.d = yVar.i();
            this.e = yVar.i();
            yVar.e(11);
            this.f = yVar.i();
            this.g = yVar.i();
        }

        public com.applovin.exoplayer2.i.a a() {
            int iH;
            if (this.d == 0 || this.e == 0 || this.h == 0 || this.i == 0 || this.f511a.b() == 0 || this.f511a.c() != this.f511a.b() || !this.c) {
                return null;
            }
            this.f511a.d(0);
            int i = this.h * this.i;
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int iH2 = this.f511a.h();
                if (iH2 != 0) {
                    iH = i2 + 1;
                    iArr[i2] = this.b[iH2];
                } else {
                    int iH3 = this.f511a.h();
                    if (iH3 != 0) {
                        iH = ((iH3 & 64) == 0 ? iH3 & 63 : ((iH3 & 63) << 8) | this.f511a.h()) + i2;
                        Arrays.fill(iArr, i2, iH, (iH3 & 128) == 0 ? 0 : this.b[this.f511a.h()]);
                    }
                }
                i2 = iH;
            }
            return new a.C0033a().a(Bitmap.createBitmap(iArr, this.h, this.i, Bitmap.Config.ARGB_8888)).a(this.f / this.d).b(0).a(this.g / this.e, 0).a(0).b(this.h / this.d).c(this.i / this.e).e();
        }

        public void b() {
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.f511a.a(0);
            this.c = false;
        }
    }
}
