package com.applovin.exoplayer2.g.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ai;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class d extends h {
    public static final Parcelable.Creator<d> CREATOR = new Parcelable.Creator<d>() { // from class: com.applovin.exoplayer2.g.e.d.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i) {
            return new d[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f428a;
    public final boolean b;
    public final boolean c;
    public final String[] d;
    private final h[] e;

    public d(String str, boolean z, boolean z2, String[] strArr, h[] hVarArr) {
        super("CTOC");
        this.f428a = str;
        this.b = z;
        this.c = z2;
        this.d = strArr;
        this.e = hVarArr;
    }

    d(Parcel parcel) {
        super("CTOC");
        this.f428a = (String) ai.a(parcel.readString());
        this.b = parcel.readByte() != 0;
        this.c = parcel.readByte() != 0;
        this.d = (String[]) ai.a(parcel.createStringArray());
        int i = parcel.readInt();
        this.e = new h[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.e[i2] = (h) parcel.readParcelable(h.class.getClassLoader());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.b == dVar.b && this.c == dVar.c && ai.a((Object) this.f428a, (Object) dVar.f428a) && Arrays.equals(this.d, dVar.d) && Arrays.equals(this.e, dVar.e);
    }

    public int hashCode() {
        int i = (((527 + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31;
        String str = this.f428a;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f428a);
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.d);
        parcel.writeInt(this.e.length);
        for (h hVar : this.e) {
            parcel.writeParcelable(hVar, 0);
        }
    }
}
