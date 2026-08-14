package com.applovin.exoplayer2.g.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ai;

/* JADX INFO: loaded from: classes.dex */
public final class e extends h {
    public static final Parcelable.Creator<e> CREATOR = new Parcelable.Creator<e>() { // from class: com.applovin.exoplayer2.g.e.e.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i) {
            return new e[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f429a;
    public final String b;
    public final String c;

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f429a = str;
        this.b = str2;
        this.c = str3;
    }

    e(Parcel parcel) {
        super("COMM");
        this.f429a = (String) ai.a(parcel.readString());
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
        e eVar = (e) obj;
        return ai.a((Object) this.b, (Object) eVar.b) && ai.a((Object) this.f429a, (Object) eVar.f429a) && ai.a((Object) this.c, (Object) eVar.c);
    }

    public int hashCode() {
        String str = this.f429a;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.applovin.exoplayer2.g.e.h
    public String toString() {
        return this.f + ": language=" + this.f429a + ", description=" + this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f);
        parcel.writeString(this.f429a);
        parcel.writeString(this.c);
    }
}
