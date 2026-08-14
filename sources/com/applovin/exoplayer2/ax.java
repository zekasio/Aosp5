package com.applovin.exoplayer2;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.g;

/* JADX INFO: loaded from: classes.dex */
public final class ax extends aq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g.a<ax> f49a = new g.a() { // from class: com.applovin.exoplayer2.ax$$ExternalSyntheticLambda0
        @Override // com.applovin.exoplayer2.g.a
        public final g fromBundle(Bundle bundle) {
            return ax.a(bundle);
        }
    };
    private final int c;
    private final float d;

    public ax(int i) {
        com.applovin.exoplayer2.l.a.a(i > 0, "maxStars must be a positive integer");
        this.c = i;
        this.d = -1.0f;
    }

    public ax(int i, float f) {
        com.applovin.exoplayer2.l.a.a(i > 0, "maxStars must be a positive integer");
        com.applovin.exoplayer2.l.a.a(f >= 0.0f && f <= ((float) i), "starRating is out of range [0, maxStars]");
        this.c = i;
        this.d = f;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.c), Float.valueOf(this.d));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ax)) {
            return false;
        }
        ax axVar = (ax) obj;
        return this.c == axVar.c && this.d == axVar.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ax a(Bundle bundle) {
        com.applovin.exoplayer2.l.a.a(bundle.getInt(a(0), -1) == 2);
        int i = bundle.getInt(a(1), 5);
        float f = bundle.getFloat(a(2), -1.0f);
        if (f == -1.0f) {
            return new ax(i);
        }
        return new ax(i, f);
    }

    private static String a(int i) {
        return Integer.toString(i, 36);
    }
}
