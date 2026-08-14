package com.applovin.exoplayer2.g.g;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ag;
import com.applovin.exoplayer2.l.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b {
    public static final Parcelable.Creator<d> CREATOR = new Parcelable.Creator<d>() { // from class: com.applovin.exoplayer2.g.g.d.1
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
    public final long f446a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final long g;
    public final List<a> h;
    public final boolean i;
    public final long j;
    public final int k;
    public final int l;
    public final int m;

    private d(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<a> list, boolean z5, long j4, int i, int i2, int i3) {
        this.f446a = j;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = j2;
        this.g = j3;
        this.h = Collections.unmodifiableList(list);
        this.i = z5;
        this.j = j4;
        this.k = i;
        this.l = i2;
        this.m = i3;
    }

    private d(Parcel parcel) {
        this.f446a = parcel.readLong();
        this.b = parcel.readByte() == 1;
        this.c = parcel.readByte() == 1;
        this.d = parcel.readByte() == 1;
        this.e = parcel.readByte() == 1;
        this.f = parcel.readLong();
        this.g = parcel.readLong();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(a.b(parcel));
        }
        this.h = Collections.unmodifiableList(arrayList);
        this.i = parcel.readByte() == 1;
        this.j = parcel.readLong();
        this.k = parcel.readInt();
        this.l = parcel.readInt();
        this.m = parcel.readInt();
    }

    static d a(y yVar, long j, ag agVar) {
        List list;
        boolean z;
        boolean z2;
        long j2;
        boolean z3;
        long j3;
        int i;
        int iH;
        int iH2;
        boolean z4;
        boolean z5;
        long jO;
        long jO2 = yVar.o();
        boolean z6 = (yVar.h() & 128) != 0;
        List listEmptyList = Collections.emptyList();
        if (z6) {
            list = listEmptyList;
            z = false;
            z2 = false;
            j2 = -9223372036854775807L;
            z3 = false;
            j3 = -9223372036854775807L;
            i = 0;
            iH = 0;
            iH2 = 0;
            z4 = false;
        } else {
            int iH3 = yVar.h();
            boolean z7 = (iH3 & 128) != 0;
            boolean z8 = (iH3 & 64) != 0;
            boolean z9 = (iH3 & 32) != 0;
            boolean z10 = (iH3 & 16) != 0;
            long jA = (!z8 || z10) ? -9223372036854775807L : g.a(yVar, j);
            if (!z8) {
                int iH4 = yVar.h();
                ArrayList arrayList = new ArrayList(iH4);
                for (int i2 = 0; i2 < iH4; i2++) {
                    int iH5 = yVar.h();
                    long jA2 = !z10 ? g.a(yVar, j) : -9223372036854775807L;
                    arrayList.add(new a(iH5, jA2, agVar.b(jA2)));
                }
                listEmptyList = arrayList;
            }
            if (z9) {
                long jH = yVar.h();
                boolean z11 = (128 & jH) != 0;
                jO = ((((jH & 1) << 32) | yVar.o()) * 1000) / 90;
                z5 = z11;
            } else {
                z5 = false;
                jO = -9223372036854775807L;
            }
            i = yVar.i();
            z4 = z8;
            iH = yVar.h();
            iH2 = yVar.h();
            list = listEmptyList;
            long j4 = jA;
            z3 = z5;
            j3 = jO;
            z2 = z10;
            z = z7;
            j2 = j4;
        }
        return new d(jO2, z6, z, z4, z2, j2, agVar.b(j2), list, z3, j3, i, iH, iH2);
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f447a;
        public final long b;
        public final long c;

        private a(int i, long j, long j2) {
            this.f447a = i;
            this.b = j;
            this.c = j2;
        }

        public void a(Parcel parcel) {
            parcel.writeInt(this.f447a);
            parcel.writeLong(this.b);
            parcel.writeLong(this.c);
        }

        public static a b(Parcel parcel) {
            return new a(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f446a);
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f);
        parcel.writeLong(this.g);
        int size = this.h.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.h.get(i2).a(parcel);
        }
        parcel.writeByte(this.i ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
    }
}
