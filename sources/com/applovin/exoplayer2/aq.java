package com.applovin.exoplayer2;

import android.os.Bundle;
import com.applovin.exoplayer2.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class aq implements g {
    public static final g.a<aq> b = new g.a() { // from class: com.applovin.exoplayer2.aq$$ExternalSyntheticLambda0
        @Override // com.applovin.exoplayer2.g.a
        public final g fromBundle(Bundle bundle) {
            return aq.a(bundle);
        }
    };

    aq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static aq a(Bundle bundle) {
        int i = bundle.getInt(a(0), -1);
        if (i == 0) {
            return (aq) x.f703a.fromBundle(bundle);
        }
        if (i == 1) {
            return (aq) aj.f36a.fromBundle(bundle);
        }
        if (i == 2) {
            return (aq) ax.f49a.fromBundle(bundle);
        }
        if (i == 3) {
            return (aq) az.f52a.fromBundle(bundle);
        }
        throw new IllegalArgumentException("Encountered unknown rating type: " + i);
    }

    private static String a(int i) {
        return Integer.toString(i, 36);
    }
}
