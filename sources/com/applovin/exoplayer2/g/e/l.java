package com.applovin.exoplayer2.g.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.l.ai;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l extends h {
    public static final Parcelable.Creator<l> CREATOR = new Parcelable.Creator<l>() { // from class: com.applovin.exoplayer2.g.e.l.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l[] newArray(int i) {
            return new l[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f436a;
    public final String b;

    public l(String str, String str2, String str3) {
        super(str);
        this.f436a = str2;
        this.b = str3;
    }

    l(Parcel parcel) {
        super((String) ai.a(parcel.readString()));
        this.f436a = parcel.readString();
        this.b = (String) ai.a(parcel.readString());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.applovin.exoplayer2.g.e.h, com.applovin.exoplayer2.g.a.InterfaceC0030a
    public void a(ac.a aVar) {
        String str = this.f;
        str.hashCode();
        byte b = -1;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    b = 0;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    b = 1;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    b = 2;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    b = 3;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    b = 4;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    b = 5;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    b = 6;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    b = 7;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    b = 8;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    b = 9;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    b = 10;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    b = Ascii.VT;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    b = Ascii.FF;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    b = Ascii.CR;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    b = Ascii.SO;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    b = Ascii.SI;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    b = Ascii.DLE;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    b = 17;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    b = Ascii.DC2;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    b = 19;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    b = Ascii.DC4;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    b = Ascii.NAK;
                }
                break;
        }
        try {
            switch (b) {
                case 0:
                case 10:
                    aVar.c(this.b);
                    break;
                case 1:
                case 11:
                    aVar.i(this.b);
                    break;
                case 2:
                case 12:
                    aVar.e(Integer.valueOf(Integer.parseInt(this.b.substring(2, 4)))).f(Integer.valueOf(Integer.parseInt(this.b.substring(0, 2))));
                    break;
                case 3:
                case 17:
                    aVar.b(this.b);
                    break;
                case 4:
                case 18:
                    aVar.d(this.b);
                    break;
                case 5:
                case 19:
                    aVar.j(this.b);
                    break;
                case 6:
                case 20:
                    String[] strArrA = ai.a(this.b, "/");
                    aVar.a(Integer.valueOf(Integer.parseInt(strArrA[0]))).b(strArrA.length > 1 ? Integer.valueOf(Integer.parseInt(strArrA[1])) : null);
                    break;
                case 7:
                case 16:
                    aVar.a(this.b);
                    break;
                case 8:
                case 15:
                    aVar.h(this.b);
                    break;
                case 9:
                case 21:
                    aVar.d(Integer.valueOf(Integer.parseInt(this.b)));
                    break;
                case 13:
                    List<Integer> listA = a(this.b);
                    int size = listA.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                aVar.f(listA.get(2));
                            }
                        }
                        aVar.e(listA.get(1));
                    }
                    aVar.d(listA.get(0));
                    break;
                case 14:
                    List<Integer> listA2 = a(this.b);
                    int size2 = listA2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                aVar.i(listA2.get(2));
                            }
                        }
                        aVar.h(listA2.get(1));
                    }
                    aVar.g(listA2.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return ai.a((Object) this.f, (Object) lVar.f) && ai.a((Object) this.f436a, (Object) lVar.f436a) && ai.a((Object) this.b, (Object) lVar.b);
    }

    public int hashCode() {
        int iHashCode = (527 + this.f.hashCode()) * 31;
        String str = this.f436a;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.b;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.applovin.exoplayer2.g.e.h
    public String toString() {
        return this.f + ": description=" + this.f436a + ": value=" + this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f);
        parcel.writeString(this.f436a);
        parcel.writeString(this.b);
    }

    private static List<Integer> a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }
}
