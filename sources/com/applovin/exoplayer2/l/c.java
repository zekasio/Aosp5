package com.applovin.exoplayer2.l;

import android.os.Bundle;
import android.util.SparseArray;
import com.applovin.exoplayer2.common.a.s;
import com.applovin.exoplayer2.g;
import com.google.android.material.internal.ParcelableSparseArray;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static <T extends com.applovin.exoplayer2.g> T a(g.a<T> aVar, Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return (T) aVar.fromBundle(bundle);
    }

    public static <T extends com.applovin.exoplayer2.g> com.applovin.exoplayer2.common.a.s<T> a(g.a<T> aVar, List<Bundle> list) {
        s.a aVarI = com.applovin.exoplayer2.common.a.s.i();
        for (int i = 0; i < list.size(); i++) {
            aVarI.a(aVar.fromBundle((Bundle) a.b(list.get(i))));
        }
        return aVarI.a();
    }

    public static <T extends com.applovin.exoplayer2.g> List<T> a(g.a<T> aVar, List<Bundle> list, List<T> list2) {
        return list == null ? list2 : a(aVar, list);
    }

    public static <T extends com.applovin.exoplayer2.g> SparseArray<T> a(g.a<T> aVar, SparseArray<Bundle> sparseArray, SparseArray<T> sparseArray2) {
        if (sparseArray == null) {
            return sparseArray2;
        }
        ParcelableSparseArray parcelableSparseArray = (SparseArray<T>) new SparseArray(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            parcelableSparseArray.put(sparseArray.keyAt(i), aVar.fromBundle(sparseArray.valueAt(i)));
        }
        return parcelableSparseArray;
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) ai.a(c.class.getClassLoader()));
        }
    }

    private c() {
    }
}
