package com.tapjoy.internal;

import com.tapjoy.internal.z0;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a1 extends z0 {
    public static final z0.a q = new a();
    public final Reader c;
    public e1 k;
    public String l;
    public String m;
    public int n;
    public int o;
    public boolean p;
    public final v1 b = new v1();
    public boolean d = false;
    public final char[] e = new char[1024];
    public int f = 0;
    public int g = 0;
    public int h = 1;
    public int i = 1;
    public final List<c1> j = new ArrayList();

    public static class a extends z0.a {
        @Override // com.tapjoy.internal.z0.a
        public z0 a(String str) {
            return new a1(new StringReader(str));
        }
    }

    public a1(Reader reader) {
        a(c1.EMPTY_DOCUMENT);
        this.p = false;
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.c = reader;
    }

    public final void A() {
        char c;
        do {
            if (this.f >= this.g && !a(1)) {
                return;
            }
            char[] cArr = this.e;
            int i = this.f;
            this.f = i + 1;
            c = cArr[i];
            if (c == '\r') {
                return;
            }
        } while (c != '\n');
    }

    public void B() throws IOException {
        y();
        e1 e1Var = this.k;
        if (e1Var == e1.END_ARRAY || e1Var == e1.END_OBJECT) {
            StringBuilder sbA = w1.a("Expected a value but was ");
            sbA.append(this.k);
            throw new IllegalStateException(sbA.toString());
        }
        this.p = true;
        int i = 0;
        do {
            try {
                e1 e1VarI = i();
                if (e1VarI == e1.BEGIN_ARRAY || e1VarI == e1.BEGIN_OBJECT) {
                    i++;
                } else if (e1VarI == e1.END_ARRAY || e1VarI == e1.END_OBJECT) {
                    i--;
                }
            } finally {
                this.p = false;
            }
        } while (i != 0);
    }

    public final void a(e1 e1Var) throws IOException {
        y();
        if (this.k == e1Var) {
            i();
            return;
        }
        throw new IllegalStateException("Expected " + e1Var + " but was " + y());
    }

    public final void b(c1 c1Var) {
        this.j.set(r0.size() - 1, c1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004e, code lost:
    
        l();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0048. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String c(boolean r7) throws com.tapjoy.internal.g1 {
        /*
            r6 = this;
            r0 = -1
            r6.n = r0
            r0 = 0
            r6.o = r0
            r1 = 0
            r3 = r1
        L8:
            r2 = 0
        L9:
            int r4 = r6.f
            int r4 = r4 + r2
            int r5 = r6.g
            if (r4 >= r5) goto L52
            char[] r5 = r6.e
            char r4 = r5[r4]
            r5 = 9
            if (r4 == r5) goto L66
            r5 = 10
            if (r4 == r5) goto L66
            r5 = 12
            if (r4 == r5) goto L66
            r5 = 13
            if (r4 == r5) goto L66
            r5 = 32
            if (r4 == r5) goto L66
            r5 = 35
            if (r4 == r5) goto L4e
            r5 = 44
            if (r4 == r5) goto L66
            r5 = 47
            if (r4 == r5) goto L4e
            r5 = 61
            if (r4 == r5) goto L4e
            r5 = 123(0x7b, float:1.72E-43)
            if (r4 == r5) goto L66
            r5 = 125(0x7d, float:1.75E-43)
            if (r4 == r5) goto L66
            r5 = 58
            if (r4 == r5) goto L66
            r5 = 59
            if (r4 == r5) goto L4e
            switch(r4) {
                case 91: goto L66;
                case 92: goto L4e;
                case 93: goto L66;
                default: goto L4b;
            }
        L4b:
            int r2 = r2 + 1
            goto L9
        L4e:
            r6.l()
            goto L66
        L52:
            char[] r4 = r6.e
            int r4 = r4.length
            if (r2 >= r4) goto L68
            int r4 = r2 + 1
            boolean r4 = r6.a(r4)
            if (r4 == 0) goto L60
            goto L9
        L60:
            char[] r4 = r6.e
            int r5 = r6.g
            r4[r5] = r0
        L66:
            r0 = r2
            goto L87
        L68:
            if (r3 != 0) goto L6f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
        L6f:
            char[] r4 = r6.e
            int r5 = r6.f
            r3.append(r4, r5, r2)
            int r4 = r6.o
            int r4 = r4 + r2
            r6.o = r4
            int r4 = r6.f
            int r4 = r4 + r2
            r6.f = r4
            r2 = 1
            boolean r2 = r6.a(r2)
            if (r2 != 0) goto L8
        L87:
            if (r7 == 0) goto L90
            if (r3 != 0) goto L90
            int r7 = r6.f
            r6.n = r7
            goto Laf
        L90:
            boolean r7 = r6.p
            if (r7 == 0) goto L97
            java.lang.String r1 = "skipped!"
            goto Laf
        L97:
            if (r3 != 0) goto La4
            com.tapjoy.internal.v1 r7 = r6.b
            char[] r1 = r6.e
            int r2 = r6.f
            java.lang.String r1 = r7.a(r1, r2, r0)
            goto Laf
        La4:
            char[] r7 = r6.e
            int r1 = r6.f
            r3.append(r7, r1, r0)
            java.lang.String r1 = r3.toString()
        Laf:
            int r7 = r6.o
            int r7 = r7 + r0
            r6.o = r7
            int r7 = r6.f
            int r7 = r7 + r0
            r6.f = r7
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.a1.c(boolean):java.lang.String");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.m = null;
        this.k = null;
        this.j.clear();
        this.j.add(c1.CLOSED);
        this.c.close();
    }

    public final e1 i() throws IOException {
        y();
        e1 e1Var = this.k;
        this.k = null;
        this.m = null;
        this.l = null;
        return e1Var;
    }

    public void j() throws IOException {
        a(e1.BEGIN_ARRAY);
    }

    public void k() throws IOException {
        a(e1.BEGIN_OBJECT);
    }

    public final void l() throws g1 {
        if (this.d) {
            return;
        }
        c("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    public void m() throws IOException {
        a(e1.END_ARRAY);
    }

    public void n() throws IOException {
        a(e1.END_OBJECT);
    }

    public boolean o() throws IOException {
        y();
        e1 e1Var = this.k;
        return (e1Var == e1.END_OBJECT || e1Var == e1.END_ARRAY) ? false : true;
    }

    public boolean p() throws IOException {
        y();
        if (this.k == e1.BOOLEAN) {
            boolean z = this.m == "true";
            i();
            return z;
        }
        StringBuilder sbA = w1.a("Expected a boolean but was ");
        sbA.append(this.k);
        throw new IllegalStateException(sbA.toString());
    }

    public double q() throws IOException {
        y();
        e1 e1Var = this.k;
        if (e1Var == e1.STRING || e1Var == e1.NUMBER) {
            double d = Double.parseDouble(this.m);
            i();
            return d;
        }
        StringBuilder sbA = w1.a("Expected a double but was ");
        sbA.append(this.k);
        throw new IllegalStateException(sbA.toString());
    }

    public int r() throws IOException {
        int i;
        y();
        e1 e1Var = this.k;
        if (e1Var != e1.STRING && e1Var != e1.NUMBER) {
            StringBuilder sbA = w1.a("Expected an int but was ");
            sbA.append(this.k);
            throw new IllegalStateException(sbA.toString());
        }
        try {
            i = Integer.parseInt(this.m);
        } catch (NumberFormatException unused) {
            double d = Double.parseDouble(this.m);
            int i2 = (int) d;
            if (i2 != d) {
                throw new NumberFormatException(this.m);
            }
            i = i2;
        }
        i();
        return i;
    }

    public long s() throws IOException {
        long j;
        y();
        e1 e1Var = this.k;
        if (e1Var != e1.STRING && e1Var != e1.NUMBER) {
            StringBuilder sbA = w1.a("Expected a long but was ");
            sbA.append(this.k);
            throw new IllegalStateException(sbA.toString());
        }
        try {
            j = Long.parseLong(this.m);
        } catch (NumberFormatException unused) {
            double d = Double.parseDouble(this.m);
            long j2 = (long) d;
            if (j2 != d) {
                throw new NumberFormatException(this.m);
            }
            j = j2;
        }
        i();
        return j;
    }

    public String t() throws IOException {
        y();
        if (this.k == e1.NAME) {
            String str = this.l;
            i();
            return str;
        }
        StringBuilder sbA = w1.a("Expected a name but was ");
        sbA.append(y());
        throw new IllegalStateException(sbA.toString());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("a1 near ");
        StringBuilder sb2 = new StringBuilder();
        int iMin = Math.min(this.f, 20);
        sb2.append(this.e, this.f - iMin, iMin);
        sb2.append(this.e, this.f, Math.min(this.g - this.f, 20));
        sb.append((Object) sb2);
        return sb.toString();
    }

    public final int u() throws g1, EOFException {
        while (true) {
            if (this.f >= this.g && !a(1)) {
                throw new EOFException("End of input");
            }
            char[] cArr = this.e;
            int i = this.f;
            int i2 = i + 1;
            this.f = i2;
            char c = cArr[i];
            if (c != '\t' && c != '\n' && c != '\r' && c != ' ') {
                if (c == '#') {
                    l();
                    A();
                } else {
                    if (c != '/') {
                        return c;
                    }
                    if (i2 == this.g && !a(1)) {
                        return c;
                    }
                    l();
                    char[] cArr2 = this.e;
                    int i3 = this.f;
                    char c2 = cArr2[i3];
                    if (c2 == '*') {
                        this.f = i3 + 1;
                        while (true) {
                            if (this.f + 2 > this.g && !a(2)) {
                                c("Unterminated comment");
                                throw null;
                            }
                            for (int i4 = 0; i4 < 2; i4++) {
                                if (this.e[this.f + i4] != "*/".charAt(i4)) {
                                    break;
                                }
                            }
                            this.f += 2;
                            break;
                            this.f++;
                        }
                    } else {
                        if (c2 != '/') {
                            return c;
                        }
                        this.f = i3 + 1;
                        A();
                    }
                }
            }
        }
    }

    public void v() throws IOException {
        y();
        if (this.k == e1.NULL) {
            i();
        } else {
            StringBuilder sbA = w1.a("Expected null but was ");
            sbA.append(this.k);
            throw new IllegalStateException(sbA.toString());
        }
    }

    public String w() throws IOException {
        y();
        e1 e1Var = this.k;
        if (e1Var == e1.STRING || e1Var == e1.NUMBER) {
            String str = this.m;
            i();
            return str;
        }
        StringBuilder sbA = w1.a("Expected a string but was ");
        sbA.append(y());
        throw new IllegalStateException(sbA.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tapjoy.internal.e1 x() throws com.tapjoy.internal.g1, java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.a1.x():com.tapjoy.internal.e1");
    }

    public e1 y() throws IOException {
        e1 e1Var;
        e1 e1Var2 = this.k;
        if (e1Var2 != null) {
            return e1Var2;
        }
        List<c1> list = this.j;
        switch (list.get(list.size() - 1)) {
            case EMPTY_ARRAY:
                return a(true);
            case NONEMPTY_ARRAY:
                return a(false);
            case EMPTY_OBJECT:
                return b(true);
            case DANGLING_NAME:
                int iU = u();
                if (iU != 58) {
                    if (iU != 61) {
                        c("Expected ':'");
                        throw null;
                    }
                    l();
                    if (this.f < this.g || a(1)) {
                        char[] cArr = this.e;
                        int i = this.f;
                        if (cArr[i] == '>') {
                            this.f = i + 1;
                        }
                    }
                }
                b(c1.NONEMPTY_OBJECT);
                return x();
            case NONEMPTY_OBJECT:
                return b(false);
            case EMPTY_DOCUMENT:
                b(c1.NONEMPTY_DOCUMENT);
                e1 e1VarX = x();
                if (this.d || (e1Var = this.k) == e1.BEGIN_ARRAY || e1Var == e1.BEGIN_OBJECT) {
                    return e1VarX;
                }
                StringBuilder sbA = w1.a("Expected JSON document to start with '[' or '{' but was ");
                sbA.append(this.k);
                throw new IOException(sbA.toString());
            case NONEMPTY_DOCUMENT:
                try {
                    e1 e1VarX2 = x();
                    if (this.d) {
                        return e1VarX2;
                    }
                    c("Expected EOF");
                    throw null;
                } catch (EOFException unused) {
                    e1 e1Var3 = e1.END_DOCUMENT;
                    this.k = e1Var3;
                    return e1Var3;
                }
            case CLOSED:
                throw new IllegalStateException("JsonReader is closed");
            default:
                throw new AssertionError();
        }
    }

    public final c1 z() {
        return this.j.remove(r0.size() - 1);
    }

    public final e1 b(boolean z) throws g1, EOFException {
        if (!z) {
            int iU = u();
            if (iU != 44 && iU != 59) {
                if (iU != 125) {
                    c("Unterminated object");
                    throw null;
                }
                z();
                e1 e1Var = e1.END_OBJECT;
                this.k = e1Var;
                return e1Var;
            }
        } else {
            if (u() == 125) {
                z();
                e1 e1Var2 = e1.END_OBJECT;
                this.k = e1Var2;
                return e1Var2;
            }
            this.f--;
        }
        int iU2 = u();
        if (iU2 == 34) {
            this.l = a((char) iU2);
        } else if (iU2 != 39) {
            l();
            this.f--;
            String strC = c(false);
            this.l = strC;
            if (strC.length() == 0) {
                c("Expected name");
                throw null;
            }
        } else {
            l();
            this.l = a((char) iU2);
        }
        b(c1.DANGLING_NAME);
        e1 e1Var3 = e1.NAME;
        this.k = e1Var3;
        return e1Var3;
    }

    public final void a(c1 c1Var) {
        this.j.add(c1Var);
    }

    public final e1 a(boolean z) throws g1, EOFException {
        if (z) {
            b(c1.NONEMPTY_ARRAY);
        } else {
            int iU = u();
            if (iU != 44) {
                if (iU != 59) {
                    if (iU == 93) {
                        z();
                        e1 e1Var = e1.END_ARRAY;
                        this.k = e1Var;
                        return e1Var;
                    }
                    c("Unterminated array");
                    throw null;
                }
                l();
            }
        }
        int iU2 = u();
        if (iU2 != 44 && iU2 != 59) {
            if (iU2 != 93) {
                this.f--;
                return x();
            }
            if (z) {
                z();
                e1 e1Var2 = e1.END_ARRAY;
                this.k = e1Var2;
                return e1Var2;
            }
        }
        l();
        this.f--;
        this.m = "null";
        e1 e1Var3 = e1.NULL;
        this.k = e1Var3;
        return e1Var3;
    }

    public final boolean a(int i) throws IOException {
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        while (true) {
            i2 = this.f;
            if (i5 >= i2) {
                break;
            }
            if (this.e[i5] == '\n') {
                this.h++;
                this.i = 1;
            } else {
                this.i++;
            }
            i5++;
        }
        int i6 = this.g;
        if (i6 != i2) {
            int i7 = i6 - i2;
            this.g = i7;
            char[] cArr = this.e;
            System.arraycopy(cArr, i2, cArr, 0, i7);
        } else {
            this.g = 0;
        }
        this.f = 0;
        do {
            Reader reader = this.c;
            char[] cArr2 = this.e;
            int i8 = this.g;
            int i9 = reader.read(cArr2, i8, cArr2.length - i8);
            if (i9 == -1) {
                return false;
            }
            i3 = this.g + i9;
            this.g = i3;
            if (this.h == 1 && (i4 = this.i) == 1 && i3 > 0 && this.e[0] == 65279) {
                this.f++;
                this.i = i4 - 1;
            }
        } while (i3 < i);
        return true;
    }

    public final IOException c(String str) throws g1 {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" at line ");
        int i = this.h;
        for (int i2 = 0; i2 < this.f; i2++) {
            if (this.e[i2] == '\n') {
                i++;
            }
        }
        sb.append(i);
        sb.append(" column ");
        int i3 = this.i;
        for (int i4 = 0; i4 < this.f; i4++) {
            i3 = this.e[i4] == '\n' ? 1 : i3 + 1;
        }
        sb.append(i3);
        throw new g1(sb.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b9, code lost:
    
        if (r1 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00bb, code lost:
    
        r1 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c0, code lost:
    
        r1.append(r7.e, r2, r7.f - r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(char r8) throws com.tapjoy.internal.g1 {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.a1.a(char):java.lang.String");
    }
}
