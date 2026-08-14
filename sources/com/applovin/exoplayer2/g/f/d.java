package com.applovin.exoplayer2.g.f;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.v;

/* JADX INFO: loaded from: classes.dex */
public final class d implements a.InterfaceC0030a {
    public static final Parcelable.Creator<d> CREATOR = new Parcelable.Creator<d>() { // from class: com.applovin.exoplayer2.g.f.d.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i) {
            return new d[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f443a;
    public final int b;

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

    public d(float f, int i) {
        this.f443a = f;
        this.b = i;
    }

    private d(Parcel parcel) {
        this.f443a = parcel.readFloat();
        this.b = parcel.readInt();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f443a == dVar.f443a && this.b == dVar.b;
    }

    public int hashCode() {
        return ((527 + com.applovin.exoplayer2.common.b.b.a(this.f443a)) * 31) + this.b;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f443a + ", svcTemporalLayerCount=" + this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f443a);
        parcel.writeInt(this.b);
    }
}
