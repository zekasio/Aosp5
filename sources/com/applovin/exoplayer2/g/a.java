package com.applovin.exoplayer2.g;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.v;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.applovin.exoplayer2.g.a.1
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
    private final InterfaceC0030a[] f415a;

    /* JADX INFO: renamed from: com.applovin.exoplayer2.g.a$a, reason: collision with other inner class name */
    public interface InterfaceC0030a extends Parcelable {

        /* JADX INFO: renamed from: com.applovin.exoplayer2.g.a$a$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static v $default$a(InterfaceC0030a _this) {
                return null;
            }

            public static void $default$a(InterfaceC0030a _this, ac.a aVar) {
            }

            public static byte[] $default$b(InterfaceC0030a _this) {
                return null;
            }
        }

        v a();

        void a(ac.a aVar);

        byte[] b();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public a(InterfaceC0030a... interfaceC0030aArr) {
        this.f415a = interfaceC0030aArr;
    }

    public a(List<? extends InterfaceC0030a> list) {
        this.f415a = (InterfaceC0030a[]) list.toArray(new InterfaceC0030a[0]);
    }

    a(Parcel parcel) {
        this.f415a = new InterfaceC0030a[parcel.readInt()];
        int i = 0;
        while (true) {
            InterfaceC0030a[] interfaceC0030aArr = this.f415a;
            if (i >= interfaceC0030aArr.length) {
                return;
            }
            interfaceC0030aArr[i] = (InterfaceC0030a) parcel.readParcelable(InterfaceC0030a.class.getClassLoader());
            i++;
        }
    }

    public int a() {
        return this.f415a.length;
    }

    public InterfaceC0030a a(int i) {
        return this.f415a[i];
    }

    public a a(a aVar) {
        return aVar == null ? this : a(aVar.f415a);
    }

    public a a(InterfaceC0030a... interfaceC0030aArr) {
        return interfaceC0030aArr.length == 0 ? this : new a((InterfaceC0030a[]) ai.a((Object[]) this.f415a, (Object[]) interfaceC0030aArr));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f415a, ((a) obj).f415a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f415a);
    }

    public String toString() {
        return "entries=" + Arrays.toString(this.f415a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f415a.length);
        for (InterfaceC0030a interfaceC0030a : this.f415a) {
            parcel.writeParcelable(interfaceC0030a, 0);
        }
    }
}
