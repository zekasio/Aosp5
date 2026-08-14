package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.v;
import java.util.Arrays;
import java.util.Collections;
import kotlin.UByte;

/* JADX INFO: loaded from: classes.dex */
public final class l implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float[] f349a = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final af b;
    private final com.applovin.exoplayer2.l.y c;
    private final boolean[] d;
    private final a e;
    private final r f;
    private b g;
    private long h;
    private String i;
    private com.applovin.exoplayer2.e.x j;
    private boolean k;
    private long l;

    @Override // com.applovin.exoplayer2.e.i.j
    public void b() {
    }

    public l() {
        this(null);
    }

    l(af afVar) {
        this.b = afVar;
        this.d = new boolean[4];
        this.e = new a(128);
        this.l = -9223372036854775807L;
        if (afVar != null) {
            this.f = new r(178, 128);
            this.c = new com.applovin.exoplayer2.l.y();
        } else {
            this.f = null;
            this.c = null;
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a() {
        com.applovin.exoplayer2.l.v.a(this.d);
        this.e.a();
        b bVar = this.g;
        if (bVar != null) {
            bVar.a();
        }
        r rVar = this.f;
        if (rVar != null) {
            rVar.a();
        }
        this.h = 0L;
        this.l = -9223372036854775807L;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        dVar.a();
        this.i = dVar.c();
        com.applovin.exoplayer2.e.x xVarA = jVar.a(dVar.b(), 2);
        this.j = xVarA;
        this.g = new b(xVarA);
        af afVar = this.b;
        if (afVar != null) {
            afVar.a(jVar, dVar);
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(long j, int i) {
        if (j != -9223372036854775807L) {
            this.l = j;
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.l.y yVar) {
        com.applovin.exoplayer2.l.a.a(this.g);
        com.applovin.exoplayer2.l.a.a(this.j);
        int iC = yVar.c();
        int iB = yVar.b();
        byte[] bArrD = yVar.d();
        this.h += (long) yVar.a();
        this.j.a(yVar, yVar.a());
        while (true) {
            int iA = com.applovin.exoplayer2.l.v.a(bArrD, iC, iB, this.d);
            if (iA == iB) {
                break;
            }
            int i = iA + 3;
            int i2 = yVar.d()[i] & UByte.MAX_VALUE;
            int i3 = iA - iC;
            int i4 = 0;
            if (!this.k) {
                if (i3 > 0) {
                    this.e.a(bArrD, iC, iA);
                }
                if (this.e.a(i2, i3 < 0 ? -i3 : 0)) {
                    com.applovin.exoplayer2.e.x xVar = this.j;
                    a aVar = this.e;
                    xVar.a(a(aVar, aVar.b, (String) com.applovin.exoplayer2.l.a.b(this.i)));
                    this.k = true;
                }
            }
            this.g.a(bArrD, iC, iA);
            r rVar = this.f;
            if (rVar != null) {
                if (i3 > 0) {
                    rVar.a(bArrD, iC, iA);
                } else {
                    i4 = -i3;
                }
                if (this.f.b(i4)) {
                    ((com.applovin.exoplayer2.l.y) ai.a(this.c)).a(this.f.f360a, com.applovin.exoplayer2.l.v.a(this.f.f360a, this.f.b));
                    ((af) ai.a(this.b)).a(this.l, this.c);
                }
                if (i2 == 178 && yVar.d()[iA + 2] == 1) {
                    this.f.a(i2);
                }
            }
            int i5 = iB - iA;
            this.g.a(this.h - ((long) i5), i5, this.k);
            this.g.a(i2, this.l);
            iC = i;
        }
        if (!this.k) {
            this.e.a(bArrD, iC, iB);
        }
        this.g.a(bArrD, iC, iB);
        r rVar2 = this.f;
        if (rVar2 != null) {
            rVar2.a(bArrD, iC, iB);
        }
    }

    private static com.applovin.exoplayer2.v a(a aVar, int i, String str) {
        byte[] bArrCopyOf = Arrays.copyOf(aVar.c, aVar.f350a);
        com.applovin.exoplayer2.l.x xVar = new com.applovin.exoplayer2.l.x(bArrCopyOf);
        xVar.e(i);
        xVar.e(4);
        xVar.d();
        xVar.b(8);
        if (xVar.e()) {
            xVar.b(4);
            xVar.b(3);
        }
        int iC = xVar.c(4);
        float f = 1.0f;
        if (iC == 15) {
            int iC2 = xVar.c(8);
            int iC3 = xVar.c(8);
            if (iC3 == 0) {
                com.applovin.exoplayer2.l.q.c("H263Reader", "Invalid aspect ratio");
            } else {
                f = iC2 / iC3;
            }
        } else {
            float[] fArr = f349a;
            if (iC < fArr.length) {
                f = fArr[iC];
            } else {
                com.applovin.exoplayer2.l.q.c("H263Reader", "Invalid aspect ratio");
            }
        }
        if (xVar.e()) {
            xVar.b(2);
            xVar.b(1);
            if (xVar.e()) {
                xVar.b(15);
                xVar.d();
                xVar.b(15);
                xVar.d();
                xVar.b(15);
                xVar.d();
                xVar.b(3);
                xVar.b(11);
                xVar.d();
                xVar.b(15);
                xVar.d();
            }
        }
        if (xVar.c(2) != 0) {
            com.applovin.exoplayer2.l.q.c("H263Reader", "Unhandled video object layer shape");
        }
        xVar.d();
        int iC4 = xVar.c(16);
        xVar.d();
        if (xVar.e()) {
            if (iC4 == 0) {
                com.applovin.exoplayer2.l.q.c("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i2 = 0;
                for (int i3 = iC4 - 1; i3 > 0; i3 >>= 1) {
                    i2++;
                }
                xVar.b(i2);
            }
        }
        xVar.d();
        int iC5 = xVar.c(13);
        xVar.d();
        int iC6 = xVar.c(13);
        xVar.d();
        xVar.d();
        return new v.a().a(str).f("video/mp4v-es").g(iC5).h(iC6).b(f).a(Collections.singletonList(bArrCopyOf)).a();
    }

    private static final class a {
        private static final byte[] d = {0, 0, 1};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f350a;
        public int b;
        public byte[] c;
        private boolean e;
        private int f;

        public a(int i) {
            this.c = new byte[i];
        }

        public void a() {
            this.e = false;
            this.f350a = 0;
            this.f = 0;
        }

        public boolean a(int i, int i2) {
            int i3 = this.f;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i == 179 || i == 181) {
                                this.f350a -= i2;
                                this.e = false;
                                return true;
                            }
                        } else if ((i & 240) != 32) {
                            com.applovin.exoplayer2.l.q.c("H263Reader", "Unexpected start code value");
                            a();
                        } else {
                            this.b = this.f350a;
                            this.f = 4;
                        }
                    } else if (i > 31) {
                        com.applovin.exoplayer2.l.q.c("H263Reader", "Unexpected start code value");
                        a();
                    } else {
                        this.f = 3;
                    }
                } else if (i != 181) {
                    com.applovin.exoplayer2.l.q.c("H263Reader", "Unexpected start code value");
                    a();
                } else {
                    this.f = 2;
                }
            } else if (i == 176) {
                this.f = 1;
                this.e = true;
            }
            byte[] bArr = d;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void a(byte[] bArr, int i, int i2) {
            if (this.e) {
                int i3 = i2 - i;
                byte[] bArr2 = this.c;
                int length = bArr2.length;
                int i4 = this.f350a;
                if (length < i4 + i3) {
                    this.c = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.c, this.f350a, i3);
                this.f350a += i3;
            }
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.exoplayer2.e.x f351a;
        private boolean b;
        private boolean c;
        private boolean d;
        private int e;
        private int f;
        private long g;
        private long h;

        public b(com.applovin.exoplayer2.e.x xVar) {
            this.f351a = xVar;
        }

        public void a() {
            this.b = false;
            this.c = false;
            this.d = false;
            this.e = -1;
        }

        public void a(int i, long j) {
            this.e = i;
            this.d = false;
            this.b = i == 182 || i == 179;
            this.c = i == 182;
            this.f = 0;
            this.h = j;
        }

        public void a(byte[] bArr, int i, int i2) {
            if (this.c) {
                int i3 = this.f;
                int i4 = (i + 1) - i3;
                if (i4 < i2) {
                    this.d = ((bArr[i4] & 192) >> 6) == 0;
                    this.c = false;
                } else {
                    this.f = i3 + (i2 - i);
                }
            }
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public void a(long j, int i, boolean z) {
            if (this.e == 182 && z && this.b) {
                long j2 = this.h;
                if (j2 != -9223372036854775807L) {
                    this.f351a.a(j2, this.d ? 1 : 0, (int) (j - this.g), i, null);
                }
            }
            if (this.e != 179) {
                this.g = j;
            }
        }
    }
}
