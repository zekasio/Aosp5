package com.applovin.exoplayer2.m;

import android.os.Bundle;
import com.applovin.exoplayer2.g;

/* JADX INFO: loaded from: classes.dex */
public final class o implements com.applovin.exoplayer2.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f666a = new o(0, 0);
    public static final g.a<o> f = new g.a() { // from class: com.applovin.exoplayer2.m.o$$ExternalSyntheticLambda0
        @Override // com.applovin.exoplayer2.g.a
        public final com.applovin.exoplayer2.g fromBundle(Bundle bundle) {
            return o.a(bundle);
        }
    };
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public o(int i, int i2) {
        this(i, i2, 0, 1.0f);
    }

    public o(int i, int i2, int i3, float f2) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.b == oVar.b && this.c == oVar.c && this.d == oVar.d && this.e == oVar.e;
    }

    public int hashCode() {
        return ((((((217 + this.b) * 31) + this.c) * 31) + this.d) * 31) + Float.floatToRawIntBits(this.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ o a(Bundle bundle) {
        return new o(bundle.getInt(a(0), 0), bundle.getInt(a(1), 0), bundle.getInt(a(2), 0), bundle.getFloat(a(3), 1.0f));
    }

    private static String a(int i) {
        return Integer.toString(i, 36);
    }
}
