package com.tapjoy.internal;

import com.tapjoy.TJAdUnitConstants;
import java.io.Closeable;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class f1 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Writer f1796a;
    public final List<c1> b;
    public String c;
    public String d;
    public boolean e;

    public f1(Writer writer) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(c1.EMPTY_DOCUMENT);
        this.d = ":";
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.f1796a = writer;
    }

    public final f1 a(c1 c1Var, c1 c1Var2, String str) throws IOException {
        c1 c1VarJ = j();
        if (c1VarJ != c1Var2 && c1VarJ != c1Var) {
            StringBuilder sbA = w1.a("Nesting problem: ");
            sbA.append(this.b);
            throw new IllegalStateException(sbA.toString());
        }
        this.b.remove(r3.size() - 1);
        if (c1VarJ == c1Var2) {
            h();
        }
        this.f1796a.write(str);
        return this;
    }

    public f1 b(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        c1 c1VarJ = j();
        if (c1VarJ == c1.NONEMPTY_OBJECT) {
            this.f1796a.write(44);
        } else if (c1VarJ != c1.EMPTY_OBJECT) {
            StringBuilder sbA = w1.a("Nesting problem: ");
            sbA.append(this.b);
            throw new IllegalStateException(sbA.toString());
        }
        h();
        a(c1.DANGLING_NAME);
        c(str);
        return this;
    }

    public final void c(String str) throws IOException {
        this.f1796a.write("\"");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\f') {
                this.f1796a.write("\\f");
            } else if (cCharAt == '\r') {
                this.f1796a.write("\\r");
            } else if (cCharAt == '\"' || cCharAt == '\\') {
                this.f1796a.write(92);
                this.f1796a.write(cCharAt);
            } else if (cCharAt != 8232 && cCharAt != 8233) {
                switch (cCharAt) {
                    case '\b':
                        this.f1796a.write("\\b");
                        break;
                    case '\t':
                        this.f1796a.write("\\t");
                        break;
                    case '\n':
                        this.f1796a.write("\\n");
                        break;
                    default:
                        if (cCharAt <= 31) {
                            this.f1796a.write(String.format("\\u%04x", Integer.valueOf(cCharAt)));
                        } else {
                            this.f1796a.write(cCharAt);
                        }
                        break;
                }
            } else {
                this.f1796a.write(String.format("\\u%04x", Integer.valueOf(cCharAt)));
            }
        }
        this.f1796a.write("\"");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f1796a.close();
        if (j() != c1.NONEMPTY_DOCUMENT) {
            throw new IOException("Incomplete document");
        }
    }

    public f1 d() throws IOException {
        c1 c1Var = c1.EMPTY_ARRAY;
        a(true);
        this.b.add(c1Var);
        this.f1796a.write("[");
        return this;
    }

    public f1 e() throws IOException {
        c1 c1Var = c1.EMPTY_OBJECT;
        a(true);
        this.b.add(c1Var);
        this.f1796a.write("{");
        return this;
    }

    public f1 f() {
        return a(c1.EMPTY_ARRAY, c1.NONEMPTY_ARRAY, "]");
    }

    public void flush() throws IOException {
        this.f1796a.flush();
    }

    public f1 g() {
        return a(c1.EMPTY_OBJECT, c1.NONEMPTY_OBJECT, "}");
    }

    public final void h() throws IOException {
        if (this.c == null) {
            return;
        }
        this.f1796a.write("\n");
        for (int i = 1; i < this.b.size(); i++) {
            this.f1796a.write(this.c);
        }
    }

    public f1 i() throws IOException {
        a(false);
        this.f1796a.write("null");
        return this;
    }

    public final c1 j() {
        return this.b.get(r0.size() - 1);
    }

    public f1 d(String str) throws IOException {
        if (str == null) {
            return i();
        }
        a(false);
        c(str);
        return this;
    }

    public final void a(c1 c1Var) {
        this.b.set(r0.size() - 1, c1Var);
    }

    public f1 a(Number number) throws IOException {
        if (number == null) {
            return i();
        }
        String string = number.toString();
        if (!this.e && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        a(false);
        this.f1796a.append((CharSequence) string);
        return this;
    }

    public final void a(boolean z) throws IOException {
        int iOrdinal = j().ordinal();
        if (iOrdinal == 0) {
            a(c1.NONEMPTY_ARRAY);
            h();
            return;
        }
        if (iOrdinal == 1) {
            this.f1796a.append(',');
            h();
            return;
        }
        if (iOrdinal == 3) {
            this.f1796a.append((CharSequence) this.d);
            a(c1.NONEMPTY_OBJECT);
        } else {
            if (iOrdinal != 5) {
                if (iOrdinal != 6) {
                    StringBuilder sbA = w1.a("Nesting problem: ");
                    sbA.append(this.b);
                    throw new IllegalStateException(sbA.toString());
                }
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
            if (!this.e && !z) {
                throw new IllegalStateException("JSON must start with an array or an object.");
            }
            a(c1.NONEMPTY_DOCUMENT);
        }
    }

    public f1 a(Object obj) throws IOException {
        if (obj == null) {
            return i();
        }
        if (obj instanceof d1) {
            int size = this.b.size();
            ((d1) obj).a(this);
            if (this.b.size() == size) {
                return this;
            }
            throw new IllegalStateException(obj.getClass().getName() + ".writeToJson(JsonWriter) wrote incomplete value");
        }
        if (obj instanceof Boolean) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            a(false);
            this.f1796a.write(zBooleanValue ? "true" : TJAdUnitConstants.String.FALSE);
            return this;
        }
        if (obj instanceof Number) {
            if (obj instanceof Long) {
                long jLongValue = ((Number) obj).longValue();
                a(false);
                this.f1796a.write(Long.toString(jLongValue));
                return this;
            }
            if (obj instanceof Double) {
                double dDoubleValue = ((Number) obj).doubleValue();
                if (!this.e && (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue))) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was " + dDoubleValue);
                }
                a(false);
                this.f1796a.append((CharSequence) Double.toString(dDoubleValue));
                return this;
            }
            return a((Number) obj);
        }
        if (obj instanceof String) {
            return d((String) obj);
        }
        if (obj instanceof x0) {
            a(false);
            ((x0) obj).a(this.f1796a);
            return this;
        }
        if (obj instanceof Collection) {
            return a((Collection) obj);
        }
        if (obj instanceof Map) {
            return a((Map) obj);
        }
        if (obj instanceof Date) {
            return d(q.f1888a.get().format((Date) obj));
        }
        if (obj instanceof Object[]) {
            d();
            for (Object obj2 : (Object[]) obj) {
                a(obj2);
            }
            f();
            return this;
        }
        StringBuilder sbA = w1.a("Unknown type: ");
        sbA.append(obj.getClass().getName());
        throw new IllegalArgumentException(sbA.toString());
    }

    public f1 a(Collection collection) throws IOException {
        if (collection == null) {
            return i();
        }
        d();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        f();
        return this;
    }

    public f1 a(Map map) throws IOException {
        if (map == null) {
            return i();
        }
        e();
        for (Map.Entry entry : map.entrySet()) {
            b(String.valueOf(entry.getKey()));
            a(entry.getValue());
        }
        g();
        return this;
    }
}
