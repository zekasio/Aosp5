package com.applovin.exoplayer2.e.i;

import android.util.SparseArray;
import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.l.ag;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface ad {

    public interface c {
        SparseArray<ad> a();

        ad a(int i, b bVar);
    }

    void a();

    void a(ag agVar, com.applovin.exoplayer2.e.j jVar, d dVar);

    void a(com.applovin.exoplayer2.l.y yVar, int i) throws ai;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f336a;
        public final String b;
        public final List<a> c;
        public final byte[] d;

        public b(int i, String str, List<a> list, byte[] bArr) {
            List<a> listUnmodifiableList;
            this.f336a = i;
            this.b = str;
            if (list == null) {
                listUnmodifiableList = Collections.emptyList();
            } else {
                listUnmodifiableList = Collections.unmodifiableList(list);
            }
            this.c = listUnmodifiableList;
            this.d = bArr;
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f335a;
        public final int b;
        public final byte[] c;

        public a(String str, int i, byte[] bArr) {
            this.f335a = str;
            this.b = i;
            this.c = bArr;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f337a;
        private final int b;
        private final int c;
        private int d;
        private String e;

        public d(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        public d(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                str = i + "/";
            } else {
                str = "";
            }
            this.f337a = str;
            this.b = i2;
            this.c = i3;
            this.d = Integer.MIN_VALUE;
            this.e = "";
        }

        public void a() {
            int i = this.d;
            this.d = i == Integer.MIN_VALUE ? this.b : i + this.c;
            this.e = this.f337a + this.d;
        }

        public int b() {
            d();
            return this.d;
        }

        public String c() {
            d();
            return this.e;
        }

        private void d() {
            if (this.d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }
    }
}
