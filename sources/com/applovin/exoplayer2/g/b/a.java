package com.applovin.exoplayer2.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.v;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a implements a.InterfaceC0030a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f417a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] e;
    private int h;
    private static final v f = new v.a().f("application/id3").a();
    private static final v g = new v.a().f("application/x-scte35").a();
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.applovin.exoplayer2.g.b.a.1
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

    @Override // com.applovin.exoplayer2.g.a.InterfaceC0030a
    public /* synthetic */ void a(ac.a aVar) {
        a.InterfaceC0030a.CC.$default$a(this, aVar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public a(String str, String str2, long j, long j2, byte[] bArr) {
        this.f417a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = bArr;
    }

    a(Parcel parcel) {
        this.f417a = (String) ai.a(parcel.readString());
        this.b = (String) ai.a(parcel.readString());
        this.c = parcel.readLong();
        this.d = parcel.readLong();
        this.e = (byte[]) ai.a(parcel.createByteArray());
    }

    @Override // com.applovin.exoplayer2.g.a.InterfaceC0030a
    public v a() {
        String str = this.f417a;
        str.hashCode();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return g;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f;
            default:
                return null;
        }
    }

    @Override // com.applovin.exoplayer2.g.a.InterfaceC0030a
    public byte[] b() {
        if (a() != null) {
            return this.e;
        }
        return null;
    }

    public int hashCode() {
        if (this.h == 0) {
            String str = this.f417a;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.b;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j = this.c;
            int i = (((iHashCode + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.d;
            this.h = ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.e);
        }
        return this.h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.c == aVar.c && this.d == aVar.d && ai.a((Object) this.f417a, (Object) aVar.f417a) && ai.a((Object) this.b, (Object) aVar.b) && Arrays.equals(this.e, aVar.e);
    }

    public String toString() {
        return "EMSG: scheme=" + this.f417a + ", id=" + this.d + ", durationMs=" + this.c + ", value=" + this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f417a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeByteArray(this.e);
    }
}
