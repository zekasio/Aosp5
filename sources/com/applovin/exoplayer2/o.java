package com.applovin.exoplayer2;

import android.os.Bundle;
import com.applovin.exoplayer2.g;

/* JADX INFO: loaded from: classes.dex */
public final class o implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f668a = new o(0, 0, 0);
    public static final g.a<o> e = new g.a() { // from class: com.applovin.exoplayer2.o$$ExternalSyntheticLambda0
        @Override // com.applovin.exoplayer2.g.a
        public final g fromBundle(Bundle bundle) {
            return o.a(bundle);
        }
    };
    public final int b;
    public final int c;
    public final int d;

    public o(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.b == oVar.b && this.c == oVar.c && this.d == oVar.d;
    }

    public int hashCode() {
        return ((((527 + this.b) * 31) + this.c) * 31) + this.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ o a(Bundle bundle) {
        return new o(bundle.getInt(a(0), 0), bundle.getInt(a(1), 0), bundle.getInt(a(2), 0));
    }

    private static String a(int i) {
        return Integer.toString(i, 36);
    }
}
