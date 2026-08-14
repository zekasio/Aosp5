package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1267eU<ModelType, StateType> {
    public static byte[] A05;
    public static final C1267eU A06;
    public final C1267eU A00;
    public final ModelType A01;
    public final StateType A02;
    public final String A03;
    public final List<InterfaceC1270eX<ModelType, StateType>> A04;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 113);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{81, 89, 92, 96, 101};
    }

    static {
        A02();
        A06 = new C1267eU(null, null, A01(0, 5, 123), Collections.emptyList(), A06);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.eU != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.eV != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    /* JADX WARN: Illegal instructions before constructor call */
    public C1267eU(C1268eV<ModelType, StateType> c1268eV) {
        List listEmptyList;
        Object obj = c1268eV.A02;
        Object obj2 = c1268eV.A03;
        String str = c1268eV.A04;
        if (c1268eV.A01 == null) {
            listEmptyList = Collections.emptyList();
        } else {
            listEmptyList = c1268eV.A01;
        }
        this(obj, obj2, str, listEmptyList, c1268eV.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.eU != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    public C1267eU(ModelType model, StateType state, String str, List<InterfaceC1270eX<ModelType, StateType>> list, C1267eU c1267eU) {
        this.A01 = model;
        this.A02 = state;
        this.A03 = str;
        this.A00 = c1267eU;
        this.A04 = list;
    }

    public static <ModelType, StateType> C1268eV<ModelType, StateType> A00(ModelType modeltype, StateType statetype, String str) {
        return new C1268eV<>(modeltype, statetype, str);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.eU != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.eX != com.instagram.common.viewpoint.core.ViewpointAction<ModelType, StateType> */
    public final void A03(InterfaceC1256eJ interfaceC1256eJ) {
        Iterator<InterfaceC1270eX<ModelType, StateType>> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().A5I(this, interfaceC1256eJ);
        }
    }
}
