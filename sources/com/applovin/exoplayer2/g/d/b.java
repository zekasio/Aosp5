package com.applovin.exoplayer2.g.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.v;
import com.tapjoy.TapjoyAuctionFlags;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b implements a.InterfaceC0030a {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() { // from class: com.applovin.exoplayer2.g.d.b.1
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
    public final int f423a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;

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

    public static b a(Map<String, List<String>> map) {
        boolean z;
        int i;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i2;
        int i3;
        List<String> list = map.get("icy-br");
        boolean z2 = true;
        int i4 = -1;
        if (list != null) {
            String str4 = list.get(0);
            try {
                i3 = Integer.parseInt(str4) * 1000;
                if (i3 > 0) {
                    z = true;
                } else {
                    try {
                        q.c("IcyHeaders", "Invalid bitrate: " + str4);
                        z = false;
                        i3 = -1;
                    } catch (NumberFormatException unused) {
                        q.c("IcyHeaders", "Invalid bitrate header: " + str4);
                        i = i3;
                        z = false;
                    }
                }
                i = i3;
            } catch (NumberFormatException unused2) {
                i3 = -1;
            }
        } else {
            z = false;
            i = -1;
        }
        List<String> list2 = map.get("icy-genre");
        if (list2 != null) {
            str = list2.get(0);
            z = true;
        } else {
            str = null;
        }
        List<String> list3 = map.get("icy-name");
        if (list3 != null) {
            str2 = list3.get(0);
            z = true;
        } else {
            str2 = null;
        }
        List<String> list4 = map.get("icy-url");
        if (list4 != null) {
            str3 = list4.get(0);
            z = true;
        } else {
            str3 = null;
        }
        List<String> list5 = map.get("icy-pub");
        if (list5 != null) {
            zEquals = list5.get(0).equals(TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE);
            z = true;
        } else {
            zEquals = false;
        }
        List<String> list6 = map.get("icy-metaint");
        if (list6 != null) {
            String str5 = list6.get(0);
            try {
                int i5 = Integer.parseInt(str5);
                if (i5 > 0) {
                    i4 = i5;
                } else {
                    try {
                        q.c("IcyHeaders", "Invalid metadata interval: " + str5);
                        z2 = z;
                    } catch (NumberFormatException unused3) {
                        i4 = i5;
                        q.c("IcyHeaders", "Invalid metadata interval: " + str5);
                    }
                }
                z = z2;
            } catch (NumberFormatException unused4) {
            }
            i2 = i4;
        } else {
            i2 = -1;
        }
        if (z) {
            return new b(i, str, str2, str3, zEquals, i2);
        }
        return null;
    }

    public b(int i, String str, String str2, String str3, boolean z, int i2) {
        com.applovin.exoplayer2.l.a.a(i2 == -1 || i2 > 0);
        this.f423a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = i2;
    }

    b(Parcel parcel) {
        this.f423a = parcel.readInt();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = ai.a(parcel);
        this.f = parcel.readInt();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f423a == bVar.f423a && ai.a((Object) this.b, (Object) bVar.b) && ai.a((Object) this.c, (Object) bVar.c) && ai.a((Object) this.d, (Object) bVar.d) && this.e == bVar.e && this.f == bVar.f;
    }

    public int hashCode() {
        int i = (527 + this.f423a) * 31;
        String str = this.b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.e ? 1 : 0)) * 31) + this.f;
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.c + "\", genre=\"" + this.b + "\", bitrate=" + this.f423a + ", metadataInterval=" + this.f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f423a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        ai.a(parcel, this.e);
        parcel.writeInt(this.f);
    }
}
