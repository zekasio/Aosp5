package com.applovin.exoplayer2.g.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ai;

/* JADX INFO: loaded from: classes.dex */
public final class i extends h {
    public static final Parcelable.Creator<i> CREATOR = new Parcelable.Creator<i>() { // from class: com.applovin.exoplayer2.g.e.i.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public i createFromParcel(Parcel parcel) {
            return new i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public i[] newArray(int i) {
            return new i[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f433a;
    public final String b;
    public final String c;

    public i(String str, String str2, String str3) {
        super("----");
        this.f433a = str;
        this.b = str2;
        this.c = str3;
    }

    i(Parcel parcel) {
        super("----");
        this.f433a = (String) ai.a(parcel.readString());
        this.b = (String) ai.a(parcel.readString());
        this.c = (String) ai.a(parcel.readString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return ai.a((Object) this.b, (Object) iVar.b) && ai.a((Object) this.f433a, (Object) iVar.f433a) && ai.a((Object) this.c, (Object) iVar.c);
    }

    public int hashCode() {
        String str = this.f433a;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.applovin.exoplayer2.g.e.h
    public String toString() {
        return this.f + ": domain=" + this.f433a + ", description=" + this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f);
        parcel.writeString(this.f433a);
        parcel.writeString(this.c);
    }
}
