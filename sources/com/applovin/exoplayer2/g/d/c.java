package com.applovin.exoplayer2.g.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.v;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c implements a.InterfaceC0030a {
    public static final Parcelable.Creator<c> CREATOR = new Parcelable.Creator<c>() { // from class: com.applovin.exoplayer2.g.d.c.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i) {
            return new c[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f424a;
    public final String b;
    public final String c;

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

    public c(byte[] bArr, String str, String str2) {
        this.f424a = bArr;
        this.b = str;
        this.c = str2;
    }

    c(Parcel parcel) {
        this.f424a = (byte[]) com.applovin.exoplayer2.l.a.b(parcel.createByteArray());
        this.b = parcel.readString();
        this.c = parcel.readString();
    }

    @Override // com.applovin.exoplayer2.g.a.InterfaceC0030a
    public void a(ac.a aVar) {
        String str = this.b;
        if (str != null) {
            aVar.a(str);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f424a, ((c) obj).f424a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f424a);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.b, this.c, Integer.valueOf(this.f424a.length));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f424a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
