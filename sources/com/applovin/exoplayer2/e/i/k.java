package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.e.i.ad;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class k implements j {
    private static final double[] c = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f347a;
    private com.applovin.exoplayer2.e.x b;
    private final af d;
    private final com.applovin.exoplayer2.l.y e;
    private final r f;
    private final boolean[] g;
    private final a h;
    private long i;
    private boolean j;
    private boolean k;
    private long l;
    private long m;
    private long n;
    private long o;
    private boolean p;
    private boolean q;

    @Override // com.applovin.exoplayer2.e.i.j
    public void b() {
    }

    public k() {
        this(null);
    }

    k(af afVar) {
        this.d = afVar;
        this.g = new boolean[4];
        this.h = new a(128);
        if (afVar != null) {
            this.f = new r(178, 128);
            this.e = new com.applovin.exoplayer2.l.y();
        } else {
            this.f = null;
            this.e = null;
        }
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a() {
        com.applovin.exoplayer2.l.v.a(this.g);
        this.h.a();
        r rVar = this.f;
        if (rVar != null) {
            rVar.a();
        }
        this.i = 0L;
        this.j = false;
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        dVar.a();
        this.f347a = dVar.c();
        this.b = jVar.a(dVar.b(), 2);
        af afVar = this.d;
        if (afVar != null) {
            afVar.a(jVar, dVar);
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(long j, int i) {
        this.m = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0144  */
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
    @Override // com.applovin.exoplayer2.e.i.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.applovin.exoplayer2.l.y r21) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.i.k.a(com.applovin.exoplayer2.l.y):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.util.Pair<com.applovin.exoplayer2.v, java.lang.Long> a(com.applovin.exoplayer2.e.i.k.a r8, java.lang.String r9) {
        /*
            byte[] r0 = r8.c
            int r1 = r8.f348a
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            r1 = 4
            r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 5
            r4 = r0[r3]
            r5 = r4 & 255(0xff, float:3.57E-43)
            r6 = 6
            r6 = r0[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r1
            int r5 = r5 >> r1
            r2 = r2 | r5
            r4 = r4 & 15
            int r4 = r4 << 8
            r4 = r4 | r6
            r5 = 7
            r6 = r0[r5]
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >> r1
            r7 = 2
            if (r6 == r7) goto L3c
            r7 = 3
            if (r6 == r7) goto L36
            if (r6 == r1) goto L30
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L43
        L30:
            int r1 = r4 * 121
            float r1 = (float) r1
            int r6 = r2 * 100
            goto L41
        L36:
            int r1 = r4 * 16
            float r1 = (float) r1
            int r6 = r2 * 9
            goto L41
        L3c:
            int r1 = r4 * 4
            float r1 = (float) r1
            int r6 = r2 * 3
        L41:
            float r6 = (float) r6
            float r1 = r1 / r6
        L43:
            com.applovin.exoplayer2.v$a r6 = new com.applovin.exoplayer2.v$a
            r6.<init>()
            com.applovin.exoplayer2.v$a r9 = r6.a(r9)
            java.lang.String r6 = "video/mpeg2"
            com.applovin.exoplayer2.v$a r9 = r9.f(r6)
            com.applovin.exoplayer2.v$a r9 = r9.g(r2)
            com.applovin.exoplayer2.v$a r9 = r9.h(r4)
            com.applovin.exoplayer2.v$a r9 = r9.b(r1)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            com.applovin.exoplayer2.v$a r9 = r9.a(r1)
            com.applovin.exoplayer2.v r9 = r9.a()
            r1 = r0[r5]
            r1 = r1 & 15
            int r1 = r1 + (-1)
            if (r1 < 0) goto L9e
            double[] r2 = com.applovin.exoplayer2.e.i.k.c
            int r4 = r2.length
            if (r1 >= r4) goto L9e
            r1 = r2[r1]
            int r8 = r8.b
            int r8 = r8 + 9
            r8 = r0[r8]
            r0 = r8 & 96
            int r0 = r0 >> r3
            r8 = r8 & 31
            if (r0 == r8) goto L96
            double r3 = (double) r0
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double.isNaN(r3)
            double r3 = r3 + r5
            int r8 = r8 + 1
            double r5 = (double) r8
            java.lang.Double.isNaN(r5)
            double r3 = r3 / r5
            double r1 = r1 * r3
        L96:
            r3 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r3 = r3 / r1
            long r0 = (long) r3
            goto La0
        L9e:
            r0 = 0
        La0:
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            android.util.Pair r8 = android.util.Pair.create(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.i.k.a(com.applovin.exoplayer2.e.i.k$a, java.lang.String):android.util.Pair");
    }

    private static final class a {
        private static final byte[] d = {0, 0, 1};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f348a;
        public int b;
        public byte[] c;
        private boolean e;

        public a(int i) {
            this.c = new byte[i];
        }

        public void a() {
            this.e = false;
            this.f348a = 0;
            this.b = 0;
        }

        public boolean a(int i, int i2) {
            if (this.e) {
                int i3 = this.f348a - i2;
                this.f348a = i3;
                if (this.b == 0 && i == 181) {
                    this.b = i3;
                } else {
                    this.e = false;
                    return true;
                }
            } else if (i == 179) {
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
                int i4 = this.f348a;
                if (length < i4 + i3) {
                    this.c = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.c, this.f348a, i3);
                this.f348a += i3;
            }
        }
    }
}
