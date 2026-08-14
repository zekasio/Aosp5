package com.applovin.exoplayer2.e.g;

import androidx.core.view.ViewCompat;
import com.applovin.exoplayer2.l.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f294a;

    public static int a(int i) {
        return (i >> 24) & 255;
    }

    public static int b(int i) {
        return i & ViewCompat.MEASURED_SIZE_MASK;
    }

    public a(int i) {
        this.f294a = i;
    }

    public String toString() {
        return c(this.f294a);
    }

    static final class b extends a {
        public final y b;

        public b(int i, y yVar) {
            super(i);
            this.b = yVar;
        }
    }

    /* JADX INFO: renamed from: com.applovin.exoplayer2.e.g.a$a, reason: collision with other inner class name */
    static final class C0024a extends a {
        public final long b;
        public final List<b> c;
        public final List<C0024a> d;

        public C0024a(int i, long j) {
            super(i);
            this.b = j;
            this.c = new ArrayList();
            this.d = new ArrayList();
        }

        public void a(b bVar) {
            this.c.add(bVar);
        }

        public void a(C0024a c0024a) {
            this.d.add(c0024a);
        }

        public b d(int i) {
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                b bVar = this.c.get(i2);
                if (bVar.f294a == i) {
                    return bVar;
                }
            }
            return null;
        }

        public C0024a e(int i) {
            int size = this.d.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0024a c0024a = this.d.get(i2);
                if (c0024a.f294a == i) {
                    return c0024a;
                }
            }
            return null;
        }

        @Override // com.applovin.exoplayer2.e.g.a
        public String toString() {
            return c(this.f294a) + " leaves: " + Arrays.toString(this.c.toArray()) + " containers: " + Arrays.toString(this.d.toArray());
        }
    }

    public static String c(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }
}
