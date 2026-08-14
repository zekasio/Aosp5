package com.applovin.exoplayer2.g.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ai;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class f extends h {
    public static final Parcelable.Creator<f> CREATOR = new Parcelable.Creator<f>() { // from class: com.applovin.exoplayer2.g.e.f.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f[] newArray(int i) {
            return new f[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f430a;
    public final String b;
    public final String c;
    public final byte[] d;

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f430a = str;
        this.b = str2;
        this.c = str3;
        this.d = bArr;
    }

    f(Parcel parcel) {
        super("GEOB");
        this.f430a = (String) ai.a(parcel.readString());
        this.b = (String) ai.a(parcel.readString());
        this.c = (String) ai.a(parcel.readString());
        this.d = (byte[]) ai.a(parcel.createByteArray());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return ai.a((Object) this.f430a, (Object) fVar.f430a) && ai.a((Object) this.b, (Object) fVar.b) && ai.a((Object) this.c, (Object) fVar.c) && Arrays.equals(this.d, fVar.d);
    }

    public int hashCode() {
        String str = this.f430a;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.d);
    }

    @Override // com.applovin.exoplayer2.g.e.h
    public String toString() {
        return this.f + ": mimeType=" + this.f430a + ", filename=" + this.b + ", description=" + this.c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f430a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeByteArray(this.d);
    }
}
