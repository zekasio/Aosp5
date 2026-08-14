package com.applovin.exoplayer2.g.f;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.common.a.n;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.g.f.c;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.v;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c implements a.InterfaceC0030a {
    public static final Parcelable.Creator<c> CREATOR = new Parcelable.Creator<c>() { // from class: com.applovin.exoplayer2.g.f.c.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, a.class.getClassLoader());
            return new c(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i) {
            return new c[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<a> f441a;

    @Override // com.applovin.exoplayer2.g.a.InterfaceC0030a
    public /* synthetic */ v a() {
        return a.InterfaceC0030a.CC.$default$a(this);
    }

    @Override // com.applovin.exoplayer2.g.a.InterfaceC0030a
    public /* synthetic */ void a(ac.a aVar) {
        a.InterfaceC0030a.CC.$default$a(this, aVar);
    }

    @Override // com.applovin.exoplayer2.g.a.InterfaceC0030a
    public /* synthetic */ byte[] b() {
        return a.InterfaceC0030a.CC.$default$b(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static final class a implements Parcelable {
        public final long b;
        public final long c;
        public final int d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Comparator<a> f442a = new Comparator() { // from class: com.applovin.exoplayer2.g.f.c$a$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return c.a.a((c.a) obj, (c.a) obj2);
            }
        };
        public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.applovin.exoplayer2.g.f.c.a.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i) {
                return new a[i];
            }
        };

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int a(a aVar, a aVar2) {
            return n.a().a(aVar.b, aVar2.b).a(aVar.c, aVar2.c).a(aVar.d, aVar2.d).b();
        }

        public a(long j, long j2, int i) {
            com.applovin.exoplayer2.l.a.a(j < j2);
            this.b = j;
            this.c = j2;
            this.d = i;
        }

        public String toString() {
            return ai.a("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.b), Long.valueOf(this.c), Integer.valueOf(this.d));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
        }

        public int hashCode() {
            return Objects.hashCode(Long.valueOf(this.b), Long.valueOf(this.c), Integer.valueOf(this.d));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.b);
            parcel.writeLong(this.c);
            parcel.writeInt(this.d);
        }
    }

    public c(List<a> list) {
        this.f441a = list;
        com.applovin.exoplayer2.l.a.a(!a(list));
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f441a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f441a.equals(((c) obj).f441a);
    }

    public int hashCode() {
        return this.f441a.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f441a);
    }

    private static boolean a(List<a> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j = list.get(0).c;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).b < j) {
                return true;
            }
            j = list.get(i).c;
        }
        return false;
    }
}
