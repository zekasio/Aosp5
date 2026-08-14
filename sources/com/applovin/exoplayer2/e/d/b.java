package com.applovin.exoplayer2.e.d;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f274a;
    public final List<a> b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f275a;
        public final String b;
        public final long c;
        public final long d;

        public a(String str, String str2, long j, long j2) {
            this.f275a = str;
            this.b = str2;
            this.c = j;
            this.d = j2;
        }
    }

    public b(long j, List<a> list) {
        this.f274a = j;
        this.b = list;
    }

    public com.applovin.exoplayer2.g.f.b a(long j) {
        long j2;
        if (this.b.size() < 2) {
            return null;
        }
        long j3 = j;
        long j4 = -1;
        long j5 = -1;
        long j6 = -1;
        long j7 = -1;
        boolean z = false;
        for (int size = this.b.size() - 1; size >= 0; size--) {
            a aVar = this.b.get(size);
            boolean zEquals = "video/mp4".equals(aVar.f275a) | z;
            if (size == 0) {
                j3 -= aVar.d;
                j2 = 0;
            } else {
                j2 = j3 - aVar.c;
            }
            long j8 = j3;
            j3 = j2;
            if (!zEquals || j3 == j8) {
                z = zEquals;
            } else {
                j7 = j8 - j3;
                j6 = j3;
                z = false;
            }
            if (size == 0) {
                j4 = j3;
                j5 = j8;
            }
        }
        if (j6 == -1 || j7 == -1 || j4 == -1 || j5 == -1) {
            return null;
        }
        return new com.applovin.exoplayer2.g.f.b(j4, j5, this.f274a, j6, j7);
    }
}
