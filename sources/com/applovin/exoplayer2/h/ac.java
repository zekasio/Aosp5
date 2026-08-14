package com.applovin.exoplayer2.h;

import android.os.Bundle;
import com.applovin.exoplayer2.g;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ac implements com.applovin.exoplayer2.g {
    public static final g.a<ac> b = new g.a() { // from class: com.applovin.exoplayer2.h.ac$$ExternalSyntheticLambda0
        @Override // com.applovin.exoplayer2.g.a
        public final com.applovin.exoplayer2.g fromBundle(Bundle bundle) {
            return ac.a(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f457a;
    private final com.applovin.exoplayer2.v[] c;
    private int d;

    private static int c(int i) {
        return i | 16384;
    }

    public ac(com.applovin.exoplayer2.v... vVarArr) {
        com.applovin.exoplayer2.l.a.a(vVarArr.length > 0);
        this.c = vVarArr;
        this.f457a = vVarArr.length;
        a();
    }

    public com.applovin.exoplayer2.v a(int i) {
        return this.c[i];
    }

    public int a(com.applovin.exoplayer2.v vVar) {
        int i = 0;
        while (true) {
            com.applovin.exoplayer2.v[] vVarArr = this.c;
            if (i >= vVarArr.length) {
                return -1;
            }
            if (vVar == vVarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public int hashCode() {
        if (this.d == 0) {
            this.d = 527 + Arrays.hashCode(this.c);
        }
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ac acVar = (ac) obj;
        return this.f457a == acVar.f457a && Arrays.equals(this.c, acVar.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ac a(Bundle bundle) {
        return new ac((com.applovin.exoplayer2.v[]) com.applovin.exoplayer2.l.c.a(com.applovin.exoplayer2.v.F, bundle.getParcelableArrayList(b(0)), com.applovin.exoplayer2.common.a.s.g()).toArray(new com.applovin.exoplayer2.v[0]));
    }

    private static String b(int i) {
        return Integer.toString(i, 36);
    }

    private void a() {
        String strA = a(this.c[0].c);
        int iC = c(this.c[0].e);
        int i = 1;
        while (true) {
            com.applovin.exoplayer2.v[] vVarArr = this.c;
            if (i >= vVarArr.length) {
                return;
            }
            if (!strA.equals(a(vVarArr[i].c))) {
                a("languages", this.c[0].c, this.c[i].c, i);
                return;
            } else {
                if (iC != c(this.c[i].e)) {
                    a("role flags", Integer.toBinaryString(this.c[0].e), Integer.toBinaryString(this.c[i].e), i);
                    return;
                }
                i++;
            }
        }
    }

    private static String a(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static void a(String str, String str2, String str3, int i) {
        com.applovin.exoplayer2.l.q.c("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + ")"));
    }
}
