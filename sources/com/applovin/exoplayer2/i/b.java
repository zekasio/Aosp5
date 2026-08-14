package com.applovin.exoplayer2.i;

import android.os.Bundle;
import android.os.Parcel;
import com.applovin.exoplayer2.common.a.s;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public s<a> a(byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
        parcelObtain.recycle();
        return com.applovin.exoplayer2.l.c.a(a.s, (ArrayList) com.applovin.exoplayer2.l.a.b(bundle.getParcelableArrayList("c")));
    }
}
