package com.applovin.exoplayer2;

import android.os.Bundle;
import com.applovin.exoplayer2.g;

/* JADX INFO: loaded from: classes.dex */
public final class am implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final am f38a = new am(1.0f);
    public static final g.a<am> d = new g.a() { // from class: com.applovin.exoplayer2.am$$ExternalSyntheticLambda0
        @Override // com.applovin.exoplayer2.g.a
        public final g fromBundle(Bundle bundle) {
            return am.a(bundle);
        }
    };
    public final float b;
    public final float c;
    private final int e;

    public am(float f) {
        this(f, 1.0f);
    }

    public am(float f, float f2) {
        com.applovin.exoplayer2.l.a.a(f > 0.0f);
        com.applovin.exoplayer2.l.a.a(f2 > 0.0f);
        this.b = f;
        this.c = f2;
        this.e = Math.round(f * 1000.0f);
    }

    public long a(long j) {
        return j * ((long) this.e);
    }

    public am a(float f) {
        return new am(f, this.c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        am amVar = (am) obj;
        return this.b == amVar.b && this.c == amVar.c;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.b)) * 31) + Float.floatToRawIntBits(this.c);
    }

    public String toString() {
        return com.applovin.exoplayer2.l.ai.a("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.b), Float.valueOf(this.c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ am a(Bundle bundle) {
        return new am(bundle.getFloat(a(0), 1.0f), bundle.getFloat(a(1), 1.0f));
    }

    private static String a(int i) {
        return Integer.toString(i, 36);
    }
}
