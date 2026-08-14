package com.applovin.exoplayer2.h.a;

import android.net.Uri;
import android.os.Bundle;
import com.applovin.exoplayer2.g;
import com.applovin.exoplayer2.h.a.a;
import com.applovin.exoplayer2.l.ai;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a implements g {
    public final Object b;
    public final int c;
    public final long d;
    public final long e;
    public final int f;
    private final C0031a[] i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f454a = new a(null, new C0031a[0], 0, -9223372036854775807L, 0);
    private static final C0031a h = new C0031a(0).b(0);
    public static final g.a<a> g = new g.a() { // from class: com.applovin.exoplayer2.h.a.a$$ExternalSyntheticLambda0
        @Override // com.applovin.exoplayer2.g.a
        public final g fromBundle(Bundle bundle) {
            return a.a(bundle);
        }
    };

    /* JADX INFO: renamed from: com.applovin.exoplayer2.h.a.a$a, reason: collision with other inner class name */
    public static final class C0031a implements g {
        public static final g.a<C0031a> h = new g.a() { // from class: com.applovin.exoplayer2.h.a.a$a$$ExternalSyntheticLambda0
            @Override // com.applovin.exoplayer2.g.a
            public final g fromBundle(Bundle bundle) {
                return a.C0031a.a(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f455a;
        public final int b;
        public final Uri[] c;
        public final int[] d;
        public final long[] e;
        public final long f;
        public final boolean g;

        public C0031a(long j) {
            this(j, -1, new int[0], new Uri[0], new long[0], 0L, false);
        }

        private C0031a(long j, int i, int[] iArr, Uri[] uriArr, long[] jArr, long j2, boolean z) {
            com.applovin.exoplayer2.l.a.a(iArr.length == uriArr.length);
            this.f455a = j;
            this.b = i;
            this.d = iArr;
            this.c = uriArr;
            this.e = jArr;
            this.f = j2;
            this.g = z;
        }

        public int a() {
            return a(-1);
        }

        public int a(int i) {
            int i2;
            int i3 = i + 1;
            while (true) {
                int[] iArr = this.d;
                if (i3 >= iArr.length || this.g || (i2 = iArr[i3]) == 0 || i2 == 1) {
                    break;
                }
                i3++;
            }
            return i3;
        }

        public boolean b() {
            return this.b == -1 || a() < this.b;
        }

        public boolean c() {
            if (this.b == -1) {
                return true;
            }
            for (int i = 0; i < this.b; i++) {
                int i2 = this.d[i];
                if (i2 == 0 || i2 == 1) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0031a c0031a = (C0031a) obj;
            return this.f455a == c0031a.f455a && this.b == c0031a.b && Arrays.equals(this.c, c0031a.c) && Arrays.equals(this.d, c0031a.d) && Arrays.equals(this.e, c0031a.e) && this.f == c0031a.f && this.g == c0031a.g;
        }

        public int hashCode() {
            int i = this.b * 31;
            long j = this.f455a;
            int iHashCode = (((((((i + ((int) (j ^ (j >>> 32)))) * 31) + Arrays.hashCode(this.c)) * 31) + Arrays.hashCode(this.d)) * 31) + Arrays.hashCode(this.e)) * 31;
            long j2 = this.f;
            return ((iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.g ? 1 : 0);
        }

        public C0031a b(int i) {
            int[] iArrA = a(this.d, i);
            long[] jArrA = a(this.e, i);
            return new C0031a(this.f455a, i, iArrA, (Uri[]) Arrays.copyOf(this.c, i), jArrA, this.f, this.g);
        }

        private static int[] a(int[] iArr, int i) {
            int length = iArr.length;
            int iMax = Math.max(i, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            return iArrCopyOf;
        }

        private static long[] a(long[] jArr, int i) {
            int length = jArr.length;
            int iMax = Math.max(i, length);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            Arrays.fill(jArrCopyOf, length, iMax, -9223372036854775807L);
            return jArrCopyOf;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static C0031a a(Bundle bundle) {
            long j = bundle.getLong(c(0));
            int i = bundle.getInt(c(1), -1);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(c(2));
            int[] intArray = bundle.getIntArray(c(3));
            long[] longArray = bundle.getLongArray(c(4));
            long j2 = bundle.getLong(c(5));
            boolean z = bundle.getBoolean(c(6));
            if (intArray == null) {
                intArray = new int[0];
            }
            return new C0031a(j, i, intArray, parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, j2, z);
        }

        private static String c(int i) {
            return Integer.toString(i, 36);
        }
    }

    private a(Object obj, C0031a[] c0031aArr, long j, long j2, int i) {
        this.b = obj;
        this.d = j;
        this.e = j2;
        this.c = c0031aArr.length + i;
        this.i = c0031aArr;
        this.f = i;
    }

    public C0031a a(int i) {
        int i2 = this.f;
        if (i < i2) {
            return h;
        }
        return this.i[i - i2];
    }

    public int a(long j, long j2) {
        int i = this.c - 1;
        while (i >= 0 && a(j, j2, i)) {
            i--;
        }
        if (i < 0 || !a(i).c()) {
            return -1;
        }
        return i;
    }

    public int b(long j, long j2) {
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        if (j2 != -9223372036854775807L && j >= j2) {
            return -1;
        }
        int i = this.f;
        while (i < this.c && ((a(i).f455a != Long.MIN_VALUE && a(i).f455a <= j) || !a(i).b())) {
            i++;
        }
        if (i < this.c) {
            return i;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return ai.a(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && Arrays.equals(this.i, aVar.i);
    }

    public int hashCode() {
        int i = this.c * 31;
        Object obj = this.b;
        return ((((((((i + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + this.f) * 31) + Arrays.hashCode(this.i);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=");
        sb.append(this.b);
        sb.append(", adResumePositionUs=");
        sb.append(this.d);
        sb.append(", adGroups=[");
        for (int i = 0; i < this.i.length; i++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.i[i].f455a);
            sb.append(", ads=[");
            for (int i2 = 0; i2 < this.i[i].d.length; i2++) {
                sb.append("ad(state=");
                int i3 = this.i[i].d[i2];
                if (i3 == 0) {
                    sb.append('_');
                } else if (i3 == 1) {
                    sb.append('R');
                } else if (i3 == 2) {
                    sb.append('S');
                } else if (i3 == 3) {
                    sb.append('P');
                } else if (i3 == 4) {
                    sb.append('!');
                } else {
                    sb.append('?');
                }
                sb.append(", durationUs=");
                sb.append(this.i[i].e[i2]);
                sb.append(')');
                if (i2 < this.i[i].d.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < this.i.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }

    private boolean a(long j, long j2, int i) {
        if (j == Long.MIN_VALUE) {
            return false;
        }
        long j3 = a(i).f455a;
        return j3 == Long.MIN_VALUE ? j2 == -9223372036854775807L || j < j2 : j < j3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static a a(Bundle bundle) {
        C0031a[] c0031aArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(b(1));
        if (parcelableArrayList == null) {
            c0031aArr = new C0031a[0];
        } else {
            C0031a[] c0031aArr2 = new C0031a[parcelableArrayList.size()];
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                c0031aArr2[i] = (C0031a) C0031a.h.fromBundle((Bundle) parcelableArrayList.get(i));
            }
            c0031aArr = c0031aArr2;
        }
        return new a(null, c0031aArr, bundle.getLong(b(2), 0L), bundle.getLong(b(3), -9223372036854775807L), bundle.getInt(b(4)));
    }

    private static String b(int i) {
        return Integer.toString(i, 36);
    }
}
