package com.applovin.exoplayer2.g.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ai;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class j extends h {
    public static final Parcelable.Creator<j> CREATOR = new Parcelable.Creator<j>() { // from class: com.applovin.exoplayer2.g.e.j.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j[] newArray(int i) {
            return new j[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f434a;
    public final int b;
    public final int c;
    public final int[] d;
    public final int[] e;

    @Override // com.applovin.exoplayer2.g.e.h, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public j(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f434a = i;
        this.b = i2;
        this.c = i3;
        this.d = iArr;
        this.e = iArr2;
    }

    j(Parcel parcel) {
        super("MLLT");
        this.f434a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = (int[]) ai.a(parcel.createIntArray());
        this.e = (int[]) ai.a(parcel.createIntArray());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f434a == jVar.f434a && this.b == jVar.b && this.c == jVar.c && Arrays.equals(this.d, jVar.d) && Arrays.equals(this.e, jVar.e);
    }

    public int hashCode() {
        return ((((((((527 + this.f434a) * 31) + this.b) * 31) + this.c) * 31) + Arrays.hashCode(this.d)) * 31) + Arrays.hashCode(this.e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f434a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeIntArray(this.e);
    }
}
