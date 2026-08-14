package com.applovin.exoplayer2.g.c;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.v;

/* JADX INFO: loaded from: classes.dex */
public final class b implements a.InterfaceC0030a {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() { // from class: com.applovin.exoplayer2.g.c.b.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i) {
            return new b[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f421a;
    public final String b;

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

    public b(String str, String str2) {
        this.f421a = str;
        this.b = str2;
    }

    b(Parcel parcel) {
        this.f421a = (String) ai.a(parcel.readString());
        this.b = (String) ai.a(parcel.readString());
    }

    @Override // com.applovin.exoplayer2.g.a.InterfaceC0030a
    public void a(ac.a aVar) {
        String str = this.f421a;
        str.hashCode();
        switch (str) {
            case "ALBUM":
                aVar.c(this.b);
                break;
            case "TITLE":
                aVar.a(this.b);
                break;
            case "DESCRIPTION":
                aVar.g(this.b);
                break;
            case "ALBUMARTIST":
                aVar.d(this.b);
                break;
            case "ARTIST":
                aVar.b(this.b);
                break;
        }
    }

    public String toString() {
        return "VC: " + this.f421a + "=" + this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f421a.equals(bVar.f421a) && this.b.equals(bVar.b);
    }

    public int hashCode() {
        return ((527 + this.f421a.hashCode()) * 31) + this.b.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f421a);
        parcel.writeString(this.b);
    }
}
