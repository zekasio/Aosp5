package com.applovin.exoplayer2;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.g;

/* JADX INFO: loaded from: classes.dex */
public final class aj extends aq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g.a<aj> f36a = new g.a() { // from class: com.applovin.exoplayer2.aj$$ExternalSyntheticLambda0
        @Override // com.applovin.exoplayer2.g.a
        public final g fromBundle(Bundle bundle) {
            return aj.a(bundle);
        }
    };
    private final float c;

    public aj() {
        this.c = -1.0f;
    }

    public aj(float f) {
        com.applovin.exoplayer2.l.a.a(f >= 0.0f && f <= 100.0f, "percent must be in the range of [0, 100]");
        this.c = f;
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.c));
    }

    public boolean equals(Object obj) {
        return (obj instanceof aj) && this.c == ((aj) obj).c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static aj a(Bundle bundle) {
        com.applovin.exoplayer2.l.a.a(bundle.getInt(a(0), -1) == 1);
        float f = bundle.getFloat(a(1), -1.0f);
        return f == -1.0f ? new aj() : new aj(f);
    }

    private static String a(int i) {
        return Integer.toString(i, 36);
    }
}
