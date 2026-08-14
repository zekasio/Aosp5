package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class VK implements GY {
    public final C0513Gv A00;
    public final Map<String, H1> A01;
    public final Map<String, C0514Gw> A02;
    public final long[] A03;

    public VK(C0513Gv c0513Gv, Map<String, H1> map, Map<String, C0514Gw> map2) {
        Map<String, H1> mapEmptyMap;
        this.A00 = c0513Gv;
        this.A02 = map2;
        if (map != null) {
            mapEmptyMap = Collections.unmodifiableMap(map);
        } else {
            mapEmptyMap = Collections.emptyMap();
        }
        this.A01 = mapEmptyMap;
        this.A03 = c0513Gv.A0F();
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final List<GX> A6B(long j) {
        return this.A00.A0D(j, this.A01, this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final long A6b(int i) {
        return this.A03[i];
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final int A6c() {
        return this.A03.length;
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final int A70(long j) {
        int iA0A = C0567Iz.A0A(this.A03, j, false, false);
        if (iA0A < this.A03.length) {
            return iA0A;
        }
        return -1;
    }
}
