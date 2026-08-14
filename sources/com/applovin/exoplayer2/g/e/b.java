package com.applovin.exoplayer2.g.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ai;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b extends h {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() { // from class: com.applovin.exoplayer2.g.e.b.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i) {
            return new b[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f426a;

    public b(String str, byte[] bArr) {
        super(str);
        this.f426a = bArr;
    }

    b(Parcel parcel) {
        super((String) ai.a(parcel.readString()));
        this.f426a = (byte[]) ai.a(parcel.createByteArray());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f.equals(bVar.f) && Arrays.equals(this.f426a, bVar.f426a);
    }

    public int hashCode() {
        return ((527 + this.f.hashCode()) * 31) + Arrays.hashCode(this.f426a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f);
        parcel.writeByteArray(this.f426a);
    }
}
