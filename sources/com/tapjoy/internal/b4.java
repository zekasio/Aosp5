package com.tapjoy.internal;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b4<E> {
    public static final b4<Boolean> d = new e(z3.VARINT, Boolean.class);
    public static final b4<Integer> e = new f(z3.VARINT, Integer.class);
    public static final b4<Integer> f;
    public static final b4<Long> g;
    public static final b4<Long> h;
    public static final b4<Long> i;
    public static final b4<Double> j;
    public static final b4<String> k;
    public static final b4<x8> l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z3 f1760a;
    public final Class<?> b;
    public b4<List<E>> c;

    public static final class n extends IllegalArgumentException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1761a;

        public n(int i, Class<?> cls) {
            super("Unknown enum tag " + i + " for " + cls.getCanonicalName());
            this.f1761a = i;
        }
    }

    static {
        new g(z3.VARINT, Integer.class);
        new h(z3.VARINT, Integer.class);
        f = new i(z3.FIXED32, Integer.class);
        g = new j(z3.VARINT, Long.class);
        h = new k(z3.VARINT, Long.class);
        new l(z3.VARINT, Long.class);
        i = new m(z3.FIXED64, Long.class);
        new a(z3.FIXED32, Float.class);
        j = new b(z3.FIXED64, Double.class);
        k = new c(z3.LENGTH_DELIMITED, String.class);
        l = new d(z3.LENGTH_DELIMITED, x8.class);
    }

    public b4(z3 z3Var, Class<?> cls) {
        this.f1760a = z3Var;
        this.b = cls;
    }

    public int a(int i2, E e2) {
        int iB = b(e2);
        if (this.f1760a == z3.LENGTH_DELIMITED) {
            iB += e4.d(iB);
        }
        return iB + e4.d(e4.b(i2, z3.VARINT));
    }

    public abstract E a(d4 d4Var);

    public abstract void a(e4 e4Var, E e2);

    public abstract int b(E e2);

    public static class a extends b4<Float> {
        public a(z3 z3Var, Class cls) {
            super(z3Var, cls);
        }

        @Override // com.tapjoy.internal.b4
        public void a(e4 e4Var, Float f) {
            e4Var.a(Float.floatToIntBits(f.floatValue()));
        }

        @Override // com.tapjoy.internal.b4
        public int b(Float f) {
            return 4;
        }

        @Override // com.tapjoy.internal.b4
        public Float a(d4 d4Var) {
            return Float.valueOf(Float.intBitsToFloat(d4Var.e()));
        }
    }

    public static class b extends b4<Double> {
        public b(z3 z3Var, Class cls) {
            super(z3Var, cls);
        }

        @Override // com.tapjoy.internal.b4
        public void a(e4 e4Var, Double d) {
            e4Var.a(Double.doubleToLongBits(d.doubleValue()));
        }

        @Override // com.tapjoy.internal.b4
        public int b(Double d) {
            return 8;
        }

        @Override // com.tapjoy.internal.b4
        public Double a(d4 d4Var) {
            return Double.valueOf(Double.longBitsToDouble(d4Var.f()));
        }
    }

    public static class c extends b4<String> {
        public c(z3 z3Var, Class cls) {
            super(z3Var, cls);
        }

        @Override // com.tapjoy.internal.b4
        public String a(d4 d4Var) {
            return d4Var.f1779a.c(d4Var.a());
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
        @Override // com.tapjoy.internal.b4
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int b(java.lang.String r8) {
            /*
                r7 = this;
                java.lang.String r8 = (java.lang.String) r8
                int r0 = r8.length()
                r1 = 0
                r2 = 0
            L8:
                if (r1 >= r0) goto L49
                char r3 = r8.charAt(r1)
                r4 = 128(0x80, float:1.8E-43)
                if (r3 >= r4) goto L13
                goto L41
            L13:
                r4 = 2048(0x800, float:2.87E-42)
                if (r3 >= r4) goto L1a
                int r2 = r2 + 2
                goto L46
            L1a:
                r4 = 55296(0xd800, float:7.7486E-41)
                if (r3 < r4) goto L44
                r4 = 57343(0xdfff, float:8.0355E-41)
                if (r3 <= r4) goto L25
                goto L44
            L25:
                r5 = 56319(0xdbff, float:7.892E-41)
                if (r3 > r5) goto L41
                int r3 = r1 + 1
                if (r3 >= r0) goto L41
                char r5 = r8.charAt(r3)
                r6 = 56320(0xdc00, float:7.8921E-41)
                if (r5 < r6) goto L41
                char r5 = r8.charAt(r3)
                if (r5 > r4) goto L41
                int r2 = r2 + 4
                r1 = r3
                goto L46
            L41:
                int r2 = r2 + 1
                goto L46
            L44:
                int r2 = r2 + 3
            L46:
                int r1 = r1 + 1
                goto L8
            L49:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.b4.c.b(java.lang.Object):int");
        }

        @Override // com.tapjoy.internal.b4
        public void a(e4 e4Var, String str) {
            e4Var.f1788a.a(str);
        }
    }

    public static class d extends b4<x8> {
        public d(z3 z3Var, Class cls) {
            super(z3Var, cls);
        }

        @Override // com.tapjoy.internal.b4
        public x8 a(d4 d4Var) {
            return d4Var.f1779a.b(d4Var.a());
        }

        @Override // com.tapjoy.internal.b4
        public int b(x8 x8Var) {
            return x8Var.b();
        }

        @Override // com.tapjoy.internal.b4
        public void a(e4 e4Var, x8 x8Var) {
            e4Var.f1788a.a(x8Var);
        }
    }

    public static class e extends b4<Boolean> {
        public e(z3 z3Var, Class cls) {
            super(z3Var, cls);
        }

        @Override // com.tapjoy.internal.b4
        public void a(e4 e4Var, Boolean bool) {
            e4Var.b(bool.booleanValue() ? 1 : 0);
        }

        @Override // com.tapjoy.internal.b4
        public int b(Boolean bool) {
            return 1;
        }

        @Override // com.tapjoy.internal.b4
        public Boolean a(d4 d4Var) throws IOException {
            int iG = d4Var.g();
            if (iG == 0) {
                return Boolean.FALSE;
            }
            if (iG == 1) {
                return Boolean.TRUE;
            }
            throw new IOException(String.format("Invalid boolean value 0x%02x", Integer.valueOf(iG)));
        }
    }

    public static class g extends b4<Integer> {
        public g(z3 z3Var, Class cls) {
            super(z3Var, cls);
        }

        @Override // com.tapjoy.internal.b4
        public void a(e4 e4Var, Integer num) {
            e4Var.b(num.intValue());
        }

        @Override // com.tapjoy.internal.b4
        public int b(Integer num) {
            return e4.d(num.intValue());
        }

        @Override // com.tapjoy.internal.b4
        public Integer a(d4 d4Var) {
            return Integer.valueOf(d4Var.g());
        }
    }

    public static class h extends b4<Integer> {
        public h(z3 z3Var, Class cls) {
            super(z3Var, cls);
        }

        @Override // com.tapjoy.internal.b4
        public void a(e4 e4Var, Integer num) {
            e4Var.b(e4.c(num.intValue()));
        }

        @Override // com.tapjoy.internal.b4
        public int b(Integer num) {
            return e4.d(e4.c(num.intValue()));
        }

        @Override // com.tapjoy.internal.b4
        public Integer a(d4 d4Var) {
            int iG = d4Var.g();
            return Integer.valueOf((-(iG & 1)) ^ (iG >>> 1));
        }
    }

    public static class i extends b4<Integer> {
        public i(z3 z3Var, Class cls) {
            super(z3Var, cls);
        }

        @Override // com.tapjoy.internal.b4
        public void a(e4 e4Var, Integer num) {
            e4Var.a(num.intValue());
        }

        @Override // com.tapjoy.internal.b4
        public int b(Integer num) {
            return 4;
        }

        @Override // com.tapjoy.internal.b4
        public Integer a(d4 d4Var) {
            return Integer.valueOf(d4Var.e());
        }
    }

    public static class j extends b4<Long> {
        public j(z3 z3Var, Class cls) {
            super(z3Var, cls);
        }

        @Override // com.tapjoy.internal.b4
        public void a(e4 e4Var, Long l) {
            e4Var.b(l.longValue());
        }

        @Override // com.tapjoy.internal.b4
        public int b(Long l) {
            return e4.d(l.longValue());
        }

        @Override // com.tapjoy.internal.b4
        public Long a(d4 d4Var) {
            return Long.valueOf(d4Var.h());
        }
    }

    public static class k extends b4<Long> {
        public k(z3 z3Var, Class cls) {
            super(z3Var, cls);
        }

        @Override // com.tapjoy.internal.b4
        public void a(e4 e4Var, Long l) {
            e4Var.b(l.longValue());
        }

        @Override // com.tapjoy.internal.b4
        public int b(Long l) {
            return e4.d(l.longValue());
        }

        @Override // com.tapjoy.internal.b4
        public Long a(d4 d4Var) {
            return Long.valueOf(d4Var.h());
        }
    }

    public static class l extends b4<Long> {
        public l(z3 z3Var, Class cls) {
            super(z3Var, cls);
        }

        @Override // com.tapjoy.internal.b4
        public void a(e4 e4Var, Long l) {
            e4Var.b(e4.c(l.longValue()));
        }

        @Override // com.tapjoy.internal.b4
        public int b(Long l) {
            return e4.d(e4.c(l.longValue()));
        }

        @Override // com.tapjoy.internal.b4
        public Long a(d4 d4Var) {
            long jH = d4Var.h();
            return Long.valueOf((-(jH & 1)) ^ (jH >>> 1));
        }
    }

    public static class m extends b4<Long> {
        public m(z3 z3Var, Class cls) {
            super(z3Var, cls);
        }

        @Override // com.tapjoy.internal.b4
        public void a(e4 e4Var, Long l) {
            e4Var.a(l.longValue());
        }

        @Override // com.tapjoy.internal.b4
        public int b(Long l) {
            return 8;
        }

        @Override // com.tapjoy.internal.b4
        public Long a(d4 d4Var) {
            return Long.valueOf(d4Var.f());
        }
    }

    public void a(e4 e4Var, int i2, E e2) {
        e4Var.a(i2, this.f1760a);
        if (this.f1760a == z3.LENGTH_DELIMITED) {
            e4Var.b(b(e2));
        }
        a(e4Var, e2);
    }

    public static class f extends b4<Integer> {
        public f(z3 z3Var, Class cls) {
            super(z3Var, cls);
        }

        @Override // com.tapjoy.internal.b4
        public void a(e4 e4Var, Integer num) {
            int iIntValue = num.intValue();
            if (iIntValue >= 0) {
                e4Var.b(iIntValue);
            } else {
                e4Var.b(iIntValue);
            }
        }

        @Override // com.tapjoy.internal.b4
        public int b(Integer num) {
            int iIntValue = num.intValue();
            if (iIntValue >= 0) {
                return e4.d(iIntValue);
            }
            return 10;
        }

        @Override // com.tapjoy.internal.b4
        public Integer a(d4 d4Var) {
            return Integer.valueOf(d4Var.g());
        }
    }

    public final void a(v8 v8Var, E e2) {
        com.tapjoy.internal.a.b((Object) e2, "value == null");
        com.tapjoy.internal.a.b((Object) v8Var, "sink == null");
        a(new e4(v8Var), e2);
    }

    public final byte[] a(E e2) {
        com.tapjoy.internal.a.b((Object) e2, "value == null");
        u8 u8Var = new u8();
        try {
            a(u8Var, e2);
            try {
                return u8Var.e(u8Var.b);
            } catch (EOFException e3) {
                throw new AssertionError(e3);
            }
        } catch (IOException e4) {
            throw new AssertionError(e4);
        }
    }

    public final void a(OutputStream outputStream, E e2) {
        com.tapjoy.internal.a.b((Object) e2, "value == null");
        com.tapjoy.internal.a.b((Object) outputStream, "stream == null");
        b9 b9Var = new b9(a9.a(outputStream));
        a(b9Var, e2);
        if (!b9Var.c) {
            long jG = b9Var.f1764a.g();
            if (jG > 0) {
                b9Var.b.a(b9Var.f1764a, jG);
                return;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final E a(byte[] bArr) {
        com.tapjoy.internal.a.b((Object) bArr, "bytes == null");
        u8 u8VarA = new u8().a(bArr, 0, bArr.length);
        com.tapjoy.internal.a.b((Object) u8VarA, "source == null");
        return a(new d4(u8VarA));
    }

    public final E a(InputStream inputStream) {
        com.tapjoy.internal.a.b((Object) inputStream, "stream == null");
        c9 c9Var = new c9(a9.a(inputStream));
        com.tapjoy.internal.a.b((Object) c9Var, "source == null");
        return a(new d4(c9Var));
    }

    public final b4<List<E>> a() {
        b4<List<E>> b4Var = this.c;
        if (b4Var != null) {
            return b4Var;
        }
        c4 c4Var = new c4(this, this.f1760a, List.class);
        this.c = c4Var;
        return c4Var;
    }
}
