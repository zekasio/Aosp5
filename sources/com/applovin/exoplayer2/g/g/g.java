package com.applovin.exoplayer2.g.g;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ag;
import com.applovin.exoplayer2.l.y;

/* JADX INFO: loaded from: classes.dex */
public final class g extends b {
    public static final Parcelable.Creator<g> CREATOR = new Parcelable.Creator<g>() { // from class: com.applovin.exoplayer2.g.g.g.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g[] newArray(int i) {
            return new g[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f451a;
    public final long b;

    private g(long j, long j2) {
        this.f451a = j;
        this.b = j2;
    }

    static g a(y yVar, long j, ag agVar) {
        long jA = a(yVar, j);
        return new g(jA, agVar.b(jA));
    }

    static long a(y yVar, long j) {
        long jH = yVar.h();
        if ((128 & jH) != 0) {
            return 8589934591L & ((((jH & 1) << 32) | yVar.o()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f451a);
        parcel.writeLong(this.b);
    }
}
