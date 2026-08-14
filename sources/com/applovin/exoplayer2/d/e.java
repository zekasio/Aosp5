package com.applovin.exoplayer2.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ai;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Parcelable, Comparator<a> {
    public static final Parcelable.Creator<e> CREATOR = new Parcelable.Creator<e>() { // from class: com.applovin.exoplayer2.d.e.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i) {
            return new e[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f248a;
    public final int b;
    private final a[] c;
    private int d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public e(List<a> list) {
        this(null, false, (a[]) list.toArray(new a[0]));
    }

    public e(a... aVarArr) {
        this(null, aVarArr);
    }

    public e(String str, a... aVarArr) {
        this(str, true, aVarArr);
    }

    private e(String str, boolean z, a... aVarArr) {
        this.f248a = str;
        aVarArr = z ? (a[]) aVarArr.clone() : aVarArr;
        this.c = aVarArr;
        this.b = aVarArr.length;
        Arrays.sort(aVarArr, this);
    }

    e(Parcel parcel) {
        this.f248a = parcel.readString();
        a[] aVarArr = (a[]) ai.a((a[]) parcel.createTypedArray(a.CREATOR));
        this.c = aVarArr;
        this.b = aVarArr.length;
    }

    public a a(int i) {
        return this.c[i];
    }

    public e a(String str) {
        return ai.a((Object) this.f248a, (Object) str) ? this : new e(str, false, this.c);
    }

    public int hashCode() {
        if (this.d == 0) {
            String str = this.f248a;
            this.d = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.c);
        }
        return this.d;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return ai.a((Object) this.f248a, (Object) eVar.f248a) && Arrays.equals(this.c, eVar.c);
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(a aVar, a aVar2) {
        if (com.applovin.exoplayer2.h.f452a.equals(aVar.f249a)) {
            return com.applovin.exoplayer2.h.f452a.equals(aVar2.f249a) ? 0 : 1;
        }
        return aVar.f249a.compareTo(aVar2.f249a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f248a);
        parcel.writeTypedArray(this.c, 0);
    }

    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.applovin.exoplayer2.d.e.a.1
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
        public final UUID f249a;
        public final String b;
        public final String c;
        public final byte[] d;
        private int e;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public a(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        public a(UUID uuid, String str, String str2, byte[] bArr) {
            this.f249a = (UUID) com.applovin.exoplayer2.l.a.b(uuid);
            this.b = str;
            this.c = (String) com.applovin.exoplayer2.l.a.b(str2);
            this.d = bArr;
        }

        a(Parcel parcel) {
            this.f249a = new UUID(parcel.readLong(), parcel.readLong());
            this.b = parcel.readString();
            this.c = (String) ai.a(parcel.readString());
            this.d = parcel.createByteArray();
        }

        public boolean a(UUID uuid) {
            return com.applovin.exoplayer2.h.f452a.equals(this.f249a) || uuid.equals(this.f249a);
        }

        public a a(byte[] bArr) {
            return new a(this.f249a, this.b, this.c, bArr);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            a aVar = (a) obj;
            return ai.a((Object) this.b, (Object) aVar.b) && ai.a((Object) this.c, (Object) aVar.c) && ai.a(this.f249a, aVar.f249a) && Arrays.equals(this.d, aVar.d);
        }

        public int hashCode() {
            if (this.e == 0) {
                int iHashCode = this.f249a.hashCode() * 31;
                String str = this.b;
                this.e = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode()) * 31) + Arrays.hashCode(this.d);
            }
            return this.e;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f249a.getMostSignificantBits());
            parcel.writeLong(this.f249a.getLeastSignificantBits());
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeByteArray(this.d);
        }
    }
}
