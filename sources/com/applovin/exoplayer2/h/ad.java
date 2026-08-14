package com.applovin.exoplayer2.h;

import android.os.Bundle;
import com.applovin.exoplayer2.g;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ad implements com.applovin.exoplayer2.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ad f458a = new ad(new ac[0]);
    public static final g.a<ad> c = new g.a() { // from class: com.applovin.exoplayer2.h.ad$$ExternalSyntheticLambda0
        @Override // com.applovin.exoplayer2.g.a
        public final com.applovin.exoplayer2.g fromBundle(Bundle bundle) {
            return ad.a(bundle);
        }
    };
    public final int b;
    private final ac[] d;
    private int e;

    public ad(ac... acVarArr) {
        this.d = acVarArr;
        this.b = acVarArr.length;
    }

    public ac a(int i) {
        return this.d[i];
    }

    public int a(ac acVar) {
        for (int i = 0; i < this.b; i++) {
            if (this.d[i] == acVar) {
                return i;
            }
        }
        return -1;
    }

    public boolean a() {
        return this.b == 0;
    }

    public int hashCode() {
        if (this.e == 0) {
            this.e = Arrays.hashCode(this.d);
        }
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ad adVar = (ad) obj;
        return this.b == adVar.b && Arrays.equals(this.d, adVar.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ad a(Bundle bundle) {
        return new ad((ac[]) com.applovin.exoplayer2.l.c.a(ac.b, bundle.getParcelableArrayList(b(0)), com.applovin.exoplayer2.common.a.s.g()).toArray(new ac[0]));
    }

    private static String b(int i) {
        return Integer.toString(i, 36);
    }
}
