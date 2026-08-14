package com.applovin.exoplayer2.g.g;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f extends com.applovin.exoplayer2.g.g.b {
    public static final Parcelable.Creator<f> CREATOR = new Parcelable.Creator<f>() { // from class: com.applovin.exoplayer2.g.g.f.1
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
    public final List<b> f448a;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f450a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final long e;
        public final List<a> f;
        public final boolean g;
        public final long h;
        public final int i;
        public final int j;
        public final int k;

        private b(long j, boolean z, boolean z2, boolean z3, List<a> list, long j2, boolean z4, long j3, int i, int i2, int i3) {
            this.f450a = j;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.f = Collections.unmodifiableList(list);
            this.e = j2;
            this.g = z4;
            this.h = j3;
            this.i = i;
            this.j = i2;
            this.k = i3;
        }

        private b(Parcel parcel) {
            this.f450a = parcel.readLong();
            this.b = parcel.readByte() == 1;
            this.c = parcel.readByte() == 1;
            this.d = parcel.readByte() == 1;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(a.b(parcel));
            }
            this.f = Collections.unmodifiableList(arrayList);
            this.e = parcel.readLong();
            this.g = parcel.readByte() == 1;
            this.h = parcel.readLong();
            this.i = parcel.readInt();
            this.j = parcel.readInt();
            this.k = parcel.readInt();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b b(y yVar) {
            ArrayList arrayList;
            boolean z;
            long j;
            boolean z2;
            long j2;
            int i;
            int i2;
            int iH;
            boolean z3;
            boolean z4;
            long jO;
            long jO2 = yVar.o();
            boolean z5 = (yVar.h() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z5) {
                arrayList = arrayList2;
                z = false;
                j = -9223372036854775807L;
                z2 = false;
                j2 = -9223372036854775807L;
                i = 0;
                i2 = 0;
                iH = 0;
                z3 = false;
            } else {
                int iH2 = yVar.h();
                boolean z6 = (iH2 & 128) != 0;
                boolean z7 = (iH2 & 64) != 0;
                boolean z8 = (iH2 & 32) != 0;
                long jO3 = z7 ? yVar.o() : -9223372036854775807L;
                if (!z7) {
                    int iH3 = yVar.h();
                    ArrayList arrayList3 = new ArrayList(iH3);
                    for (int i3 = 0; i3 < iH3; i3++) {
                        arrayList3.add(new a(yVar.h(), yVar.o()));
                    }
                    arrayList2 = arrayList3;
                }
                if (z8) {
                    long jH = yVar.h();
                    boolean z9 = (128 & jH) != 0;
                    jO = ((((jH & 1) << 32) | yVar.o()) * 1000) / 90;
                    z4 = z9;
                } else {
                    z4 = false;
                    jO = -9223372036854775807L;
                }
                int i4 = yVar.i();
                int iH4 = yVar.h();
                z3 = z7;
                iH = yVar.h();
                j2 = jO;
                arrayList = arrayList2;
                long j3 = jO3;
                i = i4;
                i2 = iH4;
                j = j3;
                boolean z10 = z6;
                z2 = z4;
                z = z10;
            }
            return new b(jO2, z5, z, z3, arrayList, j, z2, j2, i, i2, iH);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(Parcel parcel) {
            parcel.writeLong(this.f450a);
            parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
            int size = this.f.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                this.f.get(i).c(parcel);
            }
            parcel.writeLong(this.e);
            parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.h);
            parcel.writeInt(this.i);
            parcel.writeInt(this.j);
            parcel.writeInt(this.k);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b c(Parcel parcel) {
            return new b(parcel);
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f449a;
        public final long b;

        private a(int i, long j) {
            this.f449a = i;
            this.b = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static a b(Parcel parcel) {
            return new a(parcel.readInt(), parcel.readLong());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(Parcel parcel) {
            parcel.writeInt(this.f449a);
            parcel.writeLong(this.b);
        }
    }

    private f(List<b> list) {
        this.f448a = Collections.unmodifiableList(list);
    }

    private f(Parcel parcel) {
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(b.c(parcel));
        }
        this.f448a = Collections.unmodifiableList(arrayList);
    }

    static f a(y yVar) {
        int iH = yVar.h();
        ArrayList arrayList = new ArrayList(iH);
        for (int i = 0; i < iH; i++) {
            arrayList.add(b.b(yVar));
        }
        return new f(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int size = this.f448a.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.f448a.get(i2).b(parcel);
        }
    }
}
