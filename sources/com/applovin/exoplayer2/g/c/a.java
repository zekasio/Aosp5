package com.applovin.exoplayer2.g.c;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.v;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a implements a.InterfaceC0030a {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.applovin.exoplayer2.g.c.a.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i) {
            return new a[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f420a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;

    @Override // com.applovin.exoplayer2.g.a.InterfaceC0030a
    public /* synthetic */ v a() {
        return a.InterfaceC0030a.CC.$default$a(this);
    }

    @Override // com.applovin.exoplayer2.g.a.InterfaceC0030a
    public /* synthetic */ byte[] b() {
        return a.InterfaceC0030a.CC.$default$b(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public a(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f420a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = bArr;
    }

    a(Parcel parcel) {
        this.f420a = parcel.readInt();
        this.b = (String) ai.a(parcel.readString());
        this.c = (String) ai.a(parcel.readString());
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = (byte[]) ai.a(parcel.createByteArray());
    }

    @Override // com.applovin.exoplayer2.g.a.InterfaceC0030a
    public void a(ac.a aVar) {
        aVar.a(this.h, this.f420a);
    }

    public String toString() {
        return "Picture: mimeType=" + this.b + ", description=" + this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f420a == aVar.f420a && this.b.equals(aVar.b) && this.c.equals(aVar.c) && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g && Arrays.equals(this.h, aVar.h);
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f420a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + Arrays.hashCode(this.h);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f420a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeByteArray(this.h);
    }
}
