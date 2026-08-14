package com.applovin.exoplayer2.g.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.l.ai;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a extends h {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.applovin.exoplayer2.g.e.a.1
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

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f425a;
    public final String b;
    public final int c;
    public final byte[] d;

    public a(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f425a = str;
        this.b = str2;
        this.c = i;
        this.d = bArr;
    }

    a(Parcel parcel) {
        super("APIC");
        this.f425a = (String) ai.a(parcel.readString());
        this.b = parcel.readString();
        this.c = parcel.readInt();
        this.d = (byte[]) ai.a(parcel.createByteArray());
    }

    @Override // com.applovin.exoplayer2.g.e.h, com.applovin.exoplayer2.g.a.InterfaceC0030a
    public void a(ac.a aVar) {
        aVar.a(this.d, this.c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.c == aVar.c && ai.a((Object) this.f425a, (Object) aVar.f425a) && ai.a((Object) this.b, (Object) aVar.b) && Arrays.equals(this.d, aVar.d);
    }

    public int hashCode() {
        int i = (527 + this.c) * 31;
        String str = this.f425a;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.b;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.d);
    }

    @Override // com.applovin.exoplayer2.g.e.h
    public String toString() {
        return this.f + ": mimeType=" + this.f425a + ", description=" + this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f425a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeByteArray(this.d);
    }
}
