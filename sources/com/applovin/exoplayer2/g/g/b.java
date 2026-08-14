package com.applovin.exoplayer2.g.g;

import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.v;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements a.InterfaceC0030a {
    @Override // com.applovin.exoplayer2.g.a.InterfaceC0030a
    public /* synthetic */ v a() {
        return a.InterfaceC0030a.CC.$default$a(this);
    }

    @Override // com.applovin.exoplayer2.g.a.InterfaceC0030a
    public /* synthetic */ void a(ac.a aVar) {
        a.InterfaceC0030a.CC.$default$a(this, aVar);
    }

    @Override // com.applovin.exoplayer2.g.a.InterfaceC0030a
    public /* synthetic */ byte[] b() {
        return a.InterfaceC0030a.CC.$default$b(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "SCTE-35 splice command: type=" + getClass().getSimpleName();
    }
}
