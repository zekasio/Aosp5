package com.applovin.exoplayer2.e.i;

import android.net.Uri;
import android.util.SparseArray;
import androidx.core.view.InputDeviceCompat;
import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.l.ag;
import java.io.IOException;
import java.util.Map;
import kotlin.UByte;

/* JADX INFO: loaded from: classes.dex */
public final class w implements com.applovin.exoplayer2.e.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.applovin.exoplayer2.e.l f365a = new com.applovin.exoplayer2.e.l() { // from class: com.applovin.exoplayer2.e.i.w$$ExternalSyntheticLambda0
        @Override // com.applovin.exoplayer2.e.l
        public /* synthetic */ com.applovin.exoplayer2.e.h[] a(Uri uri, Map map) {
            return createExtractors();
        }

        @Override // com.applovin.exoplayer2.e.l
        public final com.applovin.exoplayer2.e.h[] createExtractors() {
            return w.a();
        }
    };
    private final ag b;
    private final SparseArray<a> c;
    private final com.applovin.exoplayer2.l.y d;
    private final v e;
    private boolean f;
    private boolean g;
    private boolean h;
    private long i;
    private u j;
    private com.applovin.exoplayer2.e.j k;
    private boolean l;

    @Override // com.applovin.exoplayer2.e.h
    public void c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.applovin.exoplayer2.e.h[] a() {
        return new com.applovin.exoplayer2.e.h[]{new w()};
    }

    public w() {
        this(new ag(0L));
    }

    public w(ag agVar) {
        this.b = agVar;
        this.d = new com.applovin.exoplayer2.l.y(4096);
        this.c = new SparseArray<>();
        this.e = new v();
    }

    @Override // com.applovin.exoplayer2.e.h
    public boolean a(com.applovin.exoplayer2.e.i iVar) throws IOException {
        byte[] bArr = new byte[14];
        iVar.d(bArr, 0, 14);
        if (442 != (((bArr[0] & UByte.MAX_VALUE) << 24) | ((bArr[1] & UByte.MAX_VALUE) << 16) | ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[3] & UByte.MAX_VALUE)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        iVar.c(bArr[13] & 7);
        iVar.d(bArr, 0, 3);
        return 1 == ((((bArr[0] & UByte.MAX_VALUE) << 16) | ((bArr[1] & UByte.MAX_VALUE) << 8)) | (bArr[2] & UByte.MAX_VALUE));
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(com.applovin.exoplayer2.e.j jVar) {
        this.k = jVar;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(long j, long j2) {
        boolean z = this.b.c() == -9223372036854775807L;
        if (!z) {
            long jA = this.b.a();
            z = (jA == -9223372036854775807L || jA == 0 || jA == j2) ? false : true;
        }
        if (z) {
            this.b.a(j2);
        }
        u uVar = this.j;
        if (uVar != null) {
            uVar.a(j2);
        }
        for (int i = 0; i < this.c.size(); i++) {
            this.c.valueAt(i).a();
        }
    }

    @Override // com.applovin.exoplayer2.e.h
    public int a(com.applovin.exoplayer2.e.i iVar, com.applovin.exoplayer2.e.u uVar) throws IOException {
        j kVar;
        com.applovin.exoplayer2.l.a.a(this.k);
        long jD = iVar.d();
        if (jD != -1 && !this.e.a()) {
            return this.e.a(iVar, uVar);
        }
        a(jD);
        u uVar2 = this.j;
        if (uVar2 != null && uVar2.b()) {
            return this.j.a(iVar, uVar);
        }
        iVar.a();
        long jB = jD != -1 ? jD - iVar.b() : -1L;
        if ((jB != -1 && jB < 4) || !iVar.b(this.d.d(), 0, 4, true)) {
            return -1;
        }
        this.d.d(0);
        int iQ = this.d.q();
        if (iQ == 441) {
            return -1;
        }
        if (iQ == 442) {
            iVar.d(this.d.d(), 0, 10);
            this.d.d(9);
            iVar.b((this.d.h() & 7) + 14);
            return 0;
        }
        if (iQ == 443) {
            iVar.d(this.d.d(), 0, 2);
            this.d.d(0);
            iVar.b(this.d.i() + 6);
            return 0;
        }
        if (((iQ & InputDeviceCompat.SOURCE_ANY) >> 8) != 1) {
            iVar.b(1);
            return 0;
        }
        int i = iQ & 255;
        a aVar = this.c.get(i);
        if (!this.f) {
            if (aVar == null) {
                if (i == 189) {
                    kVar = new b();
                    this.g = true;
                    this.i = iVar.c();
                } else if ((iQ & 224) == 192) {
                    kVar = new q();
                    this.g = true;
                    this.i = iVar.c();
                } else if ((iQ & 240) == 224) {
                    kVar = new k();
                    this.h = true;
                    this.i = iVar.c();
                } else {
                    kVar = null;
                }
                if (kVar != null) {
                    kVar.a(this.k, new ad.d(i, 256));
                    aVar = new a(kVar, this.b);
                    this.c.put(i, aVar);
                }
            }
            if (iVar.c() > ((this.g && this.h) ? this.i + 8192 : 1048576L)) {
                this.f = true;
                this.k.a();
            }
        }
        iVar.d(this.d.d(), 0, 2);
        this.d.d(0);
        int i2 = this.d.i() + 6;
        if (aVar == null) {
            iVar.b(i2);
        } else {
            this.d.a(i2);
            iVar.b(this.d.d(), 0, i2);
            this.d.d(6);
            aVar.a(this.d);
            com.applovin.exoplayer2.l.y yVar = this.d;
            yVar.c(yVar.e());
        }
        return 0;
    }

    private void a(long j) {
        if (this.l) {
            return;
        }
        this.l = true;
        if (this.e.c() != -9223372036854775807L) {
            u uVar = new u(this.e.b(), this.e.c(), j);
            this.j = uVar;
            this.k.a(uVar.a());
            return;
        }
        this.k.a(new v.b(this.e.c()));
    }

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j f366a;
        private final ag b;
        private final com.applovin.exoplayer2.l.x c = new com.applovin.exoplayer2.l.x(new byte[64]);
        private boolean d;
        private boolean e;
        private boolean f;
        private int g;
        private long h;

        public a(j jVar, ag agVar) {
            this.f366a = jVar;
            this.b = agVar;
        }

        public void a() {
            this.f = false;
            this.f366a.a();
        }

        public void a(com.applovin.exoplayer2.l.y yVar) throws ai {
            yVar.a(this.c.f636a, 0, 3);
            this.c.a(0);
            b();
            yVar.a(this.c.f636a, 0, this.g);
            this.c.a(0);
            c();
            this.f366a.a(this.h, 4);
            this.f366a.a(yVar);
            this.f366a.b();
        }

        private void b() {
            this.c.b(8);
            this.d = this.c.e();
            this.e = this.c.e();
            this.c.b(6);
            this.g = this.c.c(8);
        }

        private void c() {
            this.h = 0L;
            if (this.d) {
                this.c.b(4);
                long jC = ((long) this.c.c(3)) << 30;
                this.c.b(1);
                long jC2 = jC | ((long) (this.c.c(15) << 15));
                this.c.b(1);
                long jC3 = jC2 | ((long) this.c.c(15));
                this.c.b(1);
                if (!this.f && this.e) {
                    this.c.b(4);
                    long jC4 = ((long) this.c.c(3)) << 30;
                    this.c.b(1);
                    long jC5 = jC4 | ((long) (this.c.c(15) << 15));
                    this.c.b(1);
                    long jC6 = jC5 | ((long) this.c.c(15));
                    this.c.b(1);
                    this.b.b(jC6);
                    this.f = true;
                }
                this.h = this.b.b(jC3);
            }
        }
    }
}
