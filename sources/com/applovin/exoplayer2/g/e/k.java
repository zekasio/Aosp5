package com.applovin.exoplayer2.g.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ai;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class k extends h {
    public static final Parcelable.Creator<k> CREATOR = new Parcelable.Creator<k>() { // from class: com.applovin.exoplayer2.g.e.k.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k[] newArray(int i) {
            return new k[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f435a;
    public final byte[] b;

    public k(String str, byte[] bArr) {
        super("PRIV");
        this.f435a = str;
        this.b = bArr;
    }

    k(Parcel parcel) {
        super("PRIV");
        this.f435a = (String) ai.a(parcel.readString());
        this.b = (byte[]) ai.a(parcel.createByteArray());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return ai.a((Object) this.f435a, (Object) kVar.f435a) && Arrays.equals(this.b, kVar.b);
    }

    public int hashCode() {
        String str = this.f435a;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.b);
    }

    @Override // com.applovin.exoplayer2.g.e.h
    public String toString() {
        return this.f + ": owner=" + this.f435a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f435a);
        parcel.writeByteArray(this.b);
    }
}
