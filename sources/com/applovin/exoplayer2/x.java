package com.applovin.exoplayer2;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.g;

/* JADX INFO: loaded from: classes.dex */
public final class x extends aq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g.a<x> f703a = new g.a() { // from class: com.applovin.exoplayer2.x$$ExternalSyntheticLambda0
        @Override // com.applovin.exoplayer2.g.a
        public final g fromBundle(Bundle bundle) {
            return x.a(bundle);
        }
    };
    private final boolean c;
    private final boolean d;

    public x() {
        this.c = false;
        this.d = false;
    }

    public x(boolean z) {
        this.c = true;
        this.d = z;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.c), Boolean.valueOf(this.d));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.d == xVar.d && this.c == xVar.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static x a(Bundle bundle) {
        com.applovin.exoplayer2.l.a.a(bundle.getInt(a(0), -1) == 0);
        if (bundle.getBoolean(a(1), false)) {
            return new x(bundle.getBoolean(a(2), false));
        }
        return new x();
    }

    private static String a(int i) {
        return Integer.toString(i, 36);
    }
}
