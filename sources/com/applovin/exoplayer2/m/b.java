package com.applovin.exoplayer2.m;

import android.os.Bundle;
import com.applovin.exoplayer2.g;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b implements com.applovin.exoplayer2.g {
    public static final g.a<b> e = new g.a() { // from class: com.applovin.exoplayer2.m.b$$ExternalSyntheticLambda0
        @Override // com.applovin.exoplayer2.g.a
        public final com.applovin.exoplayer2.g fromBundle(Bundle bundle) {
            return b.a(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f650a;
    public final int b;
    public final int c;
    public final byte[] d;
    private int f;

    public static int a(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int b(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public b(int i, int i2, int i3, byte[] bArr) {
        this.f650a = i;
        this.b = i2;
        this.c = i3;
        this.d = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f650a == bVar.f650a && this.b == bVar.b && this.c == bVar.c && Arrays.equals(this.d, bVar.d);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(this.f650a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        sb.append(this.d != null);
        sb.append(")");
        return sb.toString();
    }

    public int hashCode() {
        if (this.f == 0) {
            this.f = ((((((527 + this.f650a) * 31) + this.b) * 31) + this.c) * 31) + Arrays.hashCode(this.d);
        }
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ b a(Bundle bundle) {
        return new b(bundle.getInt(c(0), -1), bundle.getInt(c(1), -1), bundle.getInt(c(2), -1), bundle.getByteArray(c(3)));
    }

    private static String c(int i) {
        return Integer.toString(i, 36);
    }
}
