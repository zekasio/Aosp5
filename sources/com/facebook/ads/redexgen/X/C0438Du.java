package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Du, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0438Du {
    public final int A00;
    public final String A01;
    public final List<C0437Dt> A02;
    public final byte[] A03;

    public C0438Du(int i, String str, List<C0437Dt> list, byte[] bArr) {
        List<C0437Dt> listUnmodifiableList;
        this.A00 = i;
        this.A01 = str;
        if (list == null) {
            listUnmodifiableList = Collections.emptyList();
        } else {
            listUnmodifiableList = Collections.unmodifiableList(list);
        }
        this.A02 = listUnmodifiableList;
        this.A03 = bArr;
    }
}
