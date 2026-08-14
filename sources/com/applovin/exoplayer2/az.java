package com.applovin.exoplayer2;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.g;

/* JADX INFO: loaded from: classes.dex */
public final class az extends aq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g.a<az> f52a = new g.a() { // from class: com.applovin.exoplayer2.az$$ExternalSyntheticLambda0
        @Override // com.applovin.exoplayer2.g.a
        public final g fromBundle(Bundle bundle) {
            return az.a(bundle);
        }
    };
    private final boolean c;
    private final boolean d;

    public az() {
        this.c = false;
        this.d = false;
    }

    public az(boolean z) {
        this.c = true;
        this.d = z;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.c), Boolean.valueOf(this.d));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof az)) {
            return false;
        }
        az azVar = (az) obj;
        return this.d == azVar.d && this.c == azVar.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static az a(Bundle bundle) {
        com.applovin.exoplayer2.l.a.a(bundle.getInt(a(0), -1) == 3);
        if (bundle.getBoolean(a(1), false)) {
            return new az(bundle.getBoolean(a(2), false));
        }
        return new az();
    }

    private static String a(int i) {
        return Integer.toString(i, 36);
    }
}
