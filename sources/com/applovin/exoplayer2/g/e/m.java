package com.applovin.exoplayer2.g.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ai;

/* JADX INFO: loaded from: classes.dex */
public final class m extends h {
    public static final Parcelable.Creator<m> CREATOR = new Parcelable.Creator<m>() { // from class: com.applovin.exoplayer2.g.e.m.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public m[] newArray(int i) {
            return new m[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f437a;
    public final String b;

    public m(String str, String str2, String str3) {
        super(str);
        this.f437a = str2;
        this.b = str3;
    }

    m(Parcel parcel) {
        super((String) ai.a(parcel.readString()));
        this.f437a = parcel.readString();
        this.b = (String) ai.a(parcel.readString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return this.f.equals(mVar.f) && ai.a((Object) this.f437a, (Object) mVar.f437a) && ai.a((Object) this.b, (Object) mVar.b);
    }

    public int hashCode() {
        int iHashCode = (527 + this.f.hashCode()) * 31;
        String str = this.f437a;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.b;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.applovin.exoplayer2.g.e.h
    public String toString() {
        return this.f + ": url=" + this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f);
        parcel.writeString(this.f437a);
        parcel.writeString(this.b);
    }
}
