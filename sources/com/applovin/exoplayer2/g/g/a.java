package com.applovin.exoplayer2.g.g;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.y;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.applovin.exoplayer2.g.g.a.1
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
    public final long f444a;
    public final long b;
    public final byte[] c;

    private a(long j, byte[] bArr, long j2) {
        this.f444a = j2;
        this.b = j;
        this.c = bArr;
    }

    private a(Parcel parcel) {
        this.f444a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = (byte[]) ai.a(parcel.createByteArray());
    }

    static a a(y yVar, int i, long j) {
        long jO = yVar.o();
        int i2 = i - 4;
        byte[] bArr = new byte[i2];
        yVar.a(bArr, 0, i2);
        return new a(jO, bArr, j);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f444a);
        parcel.writeLong(this.b);
        parcel.writeByteArray(this.c);
    }
}
