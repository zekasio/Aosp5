package com.applovin.exoplayer2.g.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ai;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c extends h {
    public static final Parcelable.Creator<c> CREATOR = new Parcelable.Creator<c>() { // from class: com.applovin.exoplayer2.g.e.c.1
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
    public final String f427a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    private final h[] g;

    @Override // com.applovin.exoplayer2.g.e.h, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public c(String str, int i, int i2, long j, long j2, h[] hVarArr) {
        super("CHAP");
        this.f427a = str;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = j2;
        this.g = hVarArr;
    }

    c(Parcel parcel) {
        super("CHAP");
        this.f427a = (String) ai.a(parcel.readString());
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readLong();
        this.e = parcel.readLong();
        int i = parcel.readInt();
        this.g = new h[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.g[i2] = (h) parcel.readParcelable(h.class.getClassLoader());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.b == cVar.b && this.c == cVar.c && this.d == cVar.d && this.e == cVar.e && ai.a((Object) this.f427a, (Object) cVar.f427a) && Arrays.equals(this.g, cVar.g);
    }

    public int hashCode() {
        int i = (((((((527 + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31;
        String str = this.f427a;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f427a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
        parcel.writeInt(this.g.length);
        for (h hVar : this.g) {
            parcel.writeParcelable(hVar, 0);
        }
    }
}
