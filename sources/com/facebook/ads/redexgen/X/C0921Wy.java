package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import com.facebook.ads.redexgen.X.CN;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@TargetApi(18)
public final class C0921Wy<T extends CN> implements CM<T>, C3<T> {
    public static byte[] A0D;
    public static String[] A0E = {"0jHq0iWGhsIySlQoDiDGup3biHh1u6", "i2l5O7Dt7qLUzCpPXTMvAA2Zo4KmgWR2", "WWWB5", "5af5rLtbMnzIwH5Nva3tIodv6", "N1ag4SyeR1bkHrLLU69ntDAZG70pDTMe", "aZncB9cokv9961OmHq", "gIBDsbvLQEgXIogWiAeZHaFgFZc1jweS", "Prja9buVBy0glhaqAx1SHba3MELDXzlR"};
    public int A00;
    public Looper A01;
    public byte[] A02;
    public final int A03;
    public final C9 A04;
    public final CT<T> A05;
    public final CX A06;
    public final HashMap<String, String> A07;
    public final List<C0922Wz<T>> A08;
    public final List<C0922Wz<T>> A09;
    public final UUID A0A;
    public final boolean A0B;

    /* JADX WARN: Incorrect inner types in field signature: Lcom/facebook/ads/redexgen/X/Wy<TT;>.MediaDrmHandler; */
    public volatile CC A0C;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 37);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A0D = new byte[]{74, 107, 104, 111, 123, 98, 122, 74, 124, 99, 93, 107, 125, 125, 103, 97, 96, 67, 105, 124, 9, 63, 32, 4, 35, 36, 57, 9, 44, 57, 44, 109, 34, 35, 33, 52, 109, 46, 34, 35, 57, 44, 36, 35, 62, 109, 46, 34, 32, 32, 34, 35, 109, Ascii.GS, Ascii.RS, Ascii.RS, 5, 109, Ascii.RS, 46, 37, 40, 32, 40, 9, 44, 57, 44, 99, 109, Ascii.FF, 62, 62, 56, 32, 36, 35, 42, 109, 62, 56, 61, 61, 34, 63, 57, 109, 43, 34, 63, 119, 109, 109, 108, 109, 63, 120, 121, 120, 104, 10, Ascii.FF, 7, 10, 49, 55, 60, 33};
    }

    static {
        A03();
    }

    public static DrmInitData.SchemeData A00(DrmInitData drmInitData, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(drmInitData.A01);
        int i = 0;
        while (true) {
            boolean z2 = false;
            if (i < drmInitData.A01) {
                DrmInitData.SchemeData schemeDataA01 = drmInitData.A01(i);
                boolean zA02 = schemeDataA01.A02(uuid);
                if (A0E[0].length() != 30) {
                    break;
                }
                A0E[2] = "V0Q9eaLMfBF3CEdW";
                if (zA02 || (AG.A01.equals(uuid) && schemeDataA01.A02(AG.A02))) {
                    z2 = true;
                }
                if (z2 && (schemeDataA01.A04 != null || z)) {
                    arrayList.add(schemeDataA01);
                }
                i++;
            } else {
                if (arrayList.isEmpty()) {
                    return null;
                }
                if (AG.A05.equals(uuid)) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        DrmInitData.SchemeData schemeData = (DrmInitData.SchemeData) arrayList.get(i2);
                        int iA00 = schemeData.A01() ? DL.A00(schemeData.A04) : -1;
                        if (C0567Iz.A02 < 23 && iA00 == 0) {
                            return schemeData;
                        }
                        if (C0567Iz.A02 >= 23 && iA00 == 1) {
                            return schemeData;
                        }
                    }
                }
                DrmInitData.SchemeData schemeData2 = (DrmInitData.SchemeData) arrayList.get(0);
                if (A0E[6].charAt(29) == 'w') {
                    A0E[7] = "QMUEyZuv57oImxraVf5zIpun0ErJkPMX";
                    return schemeData2;
                }
            }
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wy != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.CN> */
    public final void A04(Handler handler, CA ca) {
        this.A04.A03(handler, ca);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wy != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.CN> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wz != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.CN> */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.facebook.ads.redexgen.X.CM
    public final CL<T> A2P(Looper looper, DrmInitData drmInitData) {
        Looper looper2 = this.A01;
        IK.A04(looper2 == null || looper2 == looper);
        if (this.A09.isEmpty()) {
            this.A01 = looper;
            if (this.A0C == null) {
                this.A0C = new CC(this, looper);
            }
        }
        DrmInitData.SchemeData schemeDataA00 = null;
        C0922Wz<T> c0922Wz = null;
        if (this.A02 == null && (schemeDataA00 = A00(drmInitData, this.A0A, false)) == null) {
            CD cd = new CD(this.A0A);
            this.A04.A04(cd);
            return new C0920Wx(new CJ(cd));
        }
        if (this.A0B) {
            if (A0E[6].charAt(29) == 'w') {
                A0E[7] = "2tfSkouS8gaRHNrU7OMeTyiBrWH6VnUA";
                byte[] bArr = schemeDataA00 != null ? schemeDataA00.A04 : null;
                Iterator<C0922Wz<T>> it = this.A09.iterator();
                while (true) {
                    if (it.hasNext()) {
                        C0922Wz<T> next = it.next();
                        if (next.A0M(bArr)) {
                            c0922Wz = next;
                            break;
                        }
                    } else {
                        c0922Wz = null;
                        break;
                    }
                }
            } else {
                throw new RuntimeException();
            }
        } else if (!this.A09.isEmpty()) {
            C0922Wz<T> c0922Wz2 = this.A09.get(0);
            if (A0E[0].length() != 30) {
                throw new RuntimeException();
            }
            A0E[5] = "NYlDF58TVUPxDFfWvHrOlngI";
            c0922Wz = c0922Wz2;
        }
        if (c0922Wz == null) {
            c0922Wz = new C0922Wz<>(this.A0A, this.A05, this, schemeDataA00, this.A00, this.A02, this.A07, this.A06, looper, this.A04, this.A03);
            this.A09.add(c0922Wz);
        }
        c0922Wz.A0G();
        return c0922Wz;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wy != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.CN> */
    @Override // com.facebook.ads.redexgen.X.CM
    public final boolean A3x(@NonNull DrmInitData drmInitData) {
        if (this.A02 != null) {
            return true;
        }
        DrmInitData.SchemeData schemeDataA00 = A00(drmInitData, this.A0A, true);
        if (A0E[2].length() == 25) {
            throw new RuntimeException();
        }
        A0E[2] = "f9Fo7yPZ7tYjgWekbXY";
        if (schemeDataA00 == null) {
            if (drmInitData.A01 != 1 || !drmInitData.A01(0).A02(AG.A02)) {
                return false;
            }
            Log.w(A01(0, 20, 43), A01(20, 72, 104) + this.A0A);
        }
        String str = drmInitData.A02;
        if (str == null || A01(100, 4, 76).equals(str)) {
            return true;
        }
        return !(A01(92, 4, 43).equals(str) || A01(96, 4, 62).equals(str) || A01(104, 4, 119).equals(str)) || C0567Iz.A02 >= 25;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wy != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.CN> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wz != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.CN> */
    @Override // com.facebook.ads.redexgen.X.C3
    public final void AC0() {
        Iterator<C0922Wz<T>> it = this.A08.iterator();
        while (it.hasNext()) {
            it.next().A0H();
        }
        this.A08.clear();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wy != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.CN> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wz != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.CN> */
    @Override // com.facebook.ads.redexgen.X.C3
    public final void AC1(Exception exc) {
        Iterator<C0922Wz<T>> it = this.A08.iterator();
        while (it.hasNext()) {
            it.next().A0K(exc);
        }
        List<C0922Wz<T>> list = this.A08;
        String[] strArr = A0E;
        if (strArr[4].charAt(7) == strArr[1].charAt(7)) {
            throw new RuntimeException();
        }
        A0E[3] = "LfmgySfdwng";
        list.clear();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wy != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.CN> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wz != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.CN> */
    @Override // com.facebook.ads.redexgen.X.C3
    public final void ADQ(C0922Wz<T> c0922Wz) {
        this.A08.add(c0922Wz);
        if (this.A08.size() == 1) {
            c0922Wz.A0I();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.CL != com.facebook.ads.internal.exoplayer2.drm.DrmSession<T extends com.facebook.ads.redexgen.X.CN> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wy != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.CN> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wz != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.CN> */
    @Override // com.facebook.ads.redexgen.X.CM
    public final void ADs(CL<T> cl) {
        if (cl instanceof C0920Wx) {
            return;
        }
        C0922Wz<T> c0922Wz = (C0922Wz) cl;
        if (c0922Wz.A0L()) {
            this.A09.remove(c0922Wz);
            if (this.A08.size() > 1 && this.A08.get(0) == c0922Wz) {
                this.A08.get(1).A0I();
            }
            this.A08.remove(c0922Wz);
        }
    }
}
