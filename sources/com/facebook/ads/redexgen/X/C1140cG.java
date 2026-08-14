package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1140cG implements InterfaceC01923e {
    public final /* synthetic */ FD A00;
    public final /* synthetic */ C3Z A01;

    public C1140cG(FD fd, C3Z c3z) {
        this.A00 = fd;
        this.A01 = c3z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01923e
    public final Object A4D(int i) {
        C3X c3xA00 = this.A01.A00(i);
        if (c3xA00 == null) {
            return null;
        }
        return c3xA00.A0M();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01923e
    public final List<Object> A5O(String str, int i) {
        List<C3X> listA03 = this.A01.A03(str, i);
        if (listA03 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = listA03.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(listA03.get(i2).A0M());
        }
        return arrayList;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01923e
    public final Object A5P(int i) {
        C3X c3xA01 = this.A01.A01(i);
        if (c3xA01 == null) {
            return null;
        }
        return c3xA01.A0M();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01923e
    public final boolean AD9(int i, int i2, Bundle bundle) {
        return this.A01.A04(i, i2, bundle);
    }
}
