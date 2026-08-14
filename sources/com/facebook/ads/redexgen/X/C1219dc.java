package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.util.Log;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.drive.MetadataChangeSet;
import cz.msebera.android.httpclient.HttpStatus;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.UUID;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1219dc implements InterfaceC01250n, InterfaceC01401c {
    public static byte[] A0B;
    public static String[] A0C = {"PgLDGrk3t3a26fQCrT3IpIrRB5PMNBKm", "uls9HIPpriPjzjIXJVTR7HWmS4IMGzWu", "f2YRmtND2fanruA3kJYGXgN9aGwgjawI", "EZdssni07U2TMPMup9RmA63S0tAhTBNo", "xilKUxawUAlWzUTJOedtCKHAHwNBDRxA", "SxIuirRfQS0L7ik0LzQXw", "dF8CYh", "NQmOIXzIEfwTEqDrM9Z7TuMEUTKSiMNX"};
    public long A00;
    public RewardData A01;
    public InterfaceC01350x A02;
    public C01360y A03;
    public C01411d A04;
    public C0947Xy A05;
    public String A06;

    @Nullable
    public String A07;
    public String A08;
    public boolean A09;
    public final String A0A = UUID.randomUUID().toString();

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 8);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        byte[] bArr = {78, 108, 99, 42, 121, 45, 126, 121, 108, 127, 121, 45, 76, 120, 105, 100, 104, 99, 110, 104, 67, 104, 121, 122, 98, 127, 102, 76, 110, 121, 100, 123, 100, 121, 116, 35, 45, 64, 108, 102, 104, 45, 126, 120, 127, 104, 45, 121, 101, 108, 121, 45, 100, 121, 42, 126, 45, 100, 99, 45, 116, 98, 120, 127, 45, 76, 99, 105, 127, 98, 100, 105, 64, 108, 99, 100, 107, 104, 126, 121, 35, 117, 96, 97, 45, 107, 100, 97, 104, 35, 73, 77, 78, 122, 107, 102, 106, 97, 108, 106, 65, 106, 123, 120, 96, 125, 100, 68, 37, 42, Ascii.ESC, 37, 39, 48, 45, 50, 45, 48, 61, 93, 82, 87, 91, 80, 74, 106, 81, 85, 91, 80, 17, Ascii.EM, Ascii.CAN, Ascii.NAK, Ascii.GS, 8, Ascii.NAK, 19, Ascii.DC2, 56, Ascii.GS, 8, Ascii.GS, 52, 40, 37, 39, 33, 41, 33, 42, 48, Ascii.CR, 32, 4, 6, 17, Ascii.DLE, 17, Ascii.DC2, Ascii.GS, Ascii.SUB, 17, Ascii.DLE, 59, 6, Ascii.GS, 17, Ascii.SUB, 0, Ascii.NAK, 0, Ascii.GS, Ascii.ESC, Ascii.SUB, 63, 17, Ascii.CR, 117, 98, 118, 114, 98, 116, 115, 83, 110, 106, 98, Ascii.GS, 6, 1, Ascii.EM, Ascii.GS, Ascii.CR, 33, Ascii.FF, 38, 57, 53, 39, 4, 41, 32, 53, 80, 78, 73, 67, 72, 80};
        if (A0C[1].charAt(29) == 'g') {
            throw new RuntimeException();
        }
        String[] strArr = A0C;
        strArr[4] = "6qgGoSyjmuhDFT94hunOHzgd3UUS7LMQ";
        strArr[0] = "q1PjRK7gg6WFD8n4pAFO870HLaNMi7ir";
        A0B = bArr;
    }

    static {
        A05();
    }

    private int A00() {
        int rotation = ((WindowManager) this.A05.getSystemService(A03(HttpStatus.SC_RESET_CONTENT, 6, 47))).getDefaultDisplay().getRotation();
        OH adOrientation = A02();
        if (adOrientation == OH.A06) {
            return -1;
        }
        if (adOrientation == OH.A04) {
            if (rotation != 2 && rotation != 3) {
                return 0;
            }
            if (A0C[1].charAt(29) == 'g') {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[3] = "WCZdwi0h9oyTFk4ywD5LtkOxTOpQ29Yc";
            strArr[7] = "4yy96Y2PoNFTEE84mLwUlYETryPZgGhE";
            return 8;
        }
        if (rotation != 2) {
            return 1;
        }
        return 9;
    }

    private final EnumC0608Kq A01() {
        return this.A04.A0C();
    }

    private OH A02() {
        return this.A04.A0D();
    }

    private void A04() {
        this.A09 = true;
    }

    private void A06(Intent intent) {
        C01411d c01411d = this.A04;
        RewardData rewardData = this.A01;
        c01411d.A0G(intent, rewardData, C0736Pr.A03(rewardData, this.A0A, this.A06));
    }

    private final void A07(C0947Xy c0947Xy, InterfaceC01350x interfaceC01350x, C01541q c01541q, EnumSet<CacheFlag> enumSet, @Nullable String str) {
        this.A04 = new C01411d(c0947Xy, c01541q, this, str);
        this.A04.A0H(c0947Xy, enumSet);
    }

    private void A08(EnumC0608Kq enumC0608Kq) {
        if (enumC0608Kq.equals(EnumC0608Kq.A07)) {
            this.A05.A0D().AEj(EnumC01150c.A03);
            return;
        }
        if (enumC0608Kq.equals(EnumC0608Kq.A08)) {
            this.A05.A0D().AEj(EnumC01150c.A07);
            return;
        }
        if (enumC0608Kq.equals(EnumC0608Kq.A0A)) {
            this.A05.A0D().AEj(EnumC01150c.A09);
            return;
        }
        if (enumC0608Kq.equals(EnumC0608Kq.A09)) {
            this.A05.A0D().AEj(EnumC01150c.A08);
            return;
        }
        if (!enumC0608Kq.equals(EnumC0608Kq.A03)) {
            return;
        }
        if (this.A04.A0J()) {
            C0R c0rA0D = this.A05.A0D();
            String[] strArr = A0C;
            if (strArr[5].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            A0C[2] = "SZ1DhKHJxqFOmux8c4F7iNiG5ZFRRvjL";
            c0rA0D.AEj(EnumC01150c.A04);
            return;
        }
        if (this.A04.A0I()) {
            this.A05.A0D().AEj(EnumC01150c.A06);
        } else {
            this.A05.A0D().AEj(EnumC01150c.A05);
        }
    }

    public final AnonymousClass18 A09() {
        return this.A04.A0B();
    }

    public final void A0A(C0947Xy c0947Xy, InterfaceC01350x interfaceC01350x, C01541q c01541q, EnumSet<CacheFlag> enumSet, @Nullable String str, @Nullable String str2, @Nullable RewardData rewardData) {
        this.A05 = c0947Xy;
        this.A02 = interfaceC01350x;
        this.A08 = c01541q.A02();
        String str3 = this.A08;
        this.A06 = str3 != null ? str3.split(A03(107, 1, 19))[0] : A03(0, 0, 5);
        this.A00 = c01541q.A00();
        this.A07 = str2;
        this.A01 = rewardData;
        A07(c0947Xy, interfaceC01350x, c01541q, enumSet, str);
    }

    public final boolean A0B() {
        if (!this.A09) {
            InterfaceC01350x interfaceC01350x = this.A02;
            if (interfaceC01350x != null) {
                interfaceC01350x.AB5(this, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR);
            }
            return false;
        }
        AdActivityIntent adActivityIntentA04 = LN.A04(this.A05);
        adActivityIntentA04.putExtra(A03(154, 24, MetadataChangeSet.CUSTOM_PROPERTY_SIZE_LIMIT_BYTES), A00());
        adActivityIntentA04.putExtra(A03(189, 8, 96), this.A0A);
        adActivityIntentA04.putExtra(A03(143, 11, 76), this.A08);
        adActivityIntentA04.putExtra(A03(178, 11, 15), this.A00);
        EnumC0608Kq enumC0608KqA01 = A01();
        A08(enumC0608KqA01);
        adActivityIntentA04.putExtra(A03(197, 8, 88), enumC0608KqA01);
        String str = this.A07;
        if (str != null) {
            adActivityIntentA04.putExtra(A03(130, 13, 116), str);
        }
        A06(adActivityIntentA04);
        adActivityIntentA04.addFlags(DriveFile.MODE_READ_ONLY);
        adActivityIntentA04.putExtra(A03(119, 11, 54), this.A04.A0E());
        try {
            ActivityUtils.A03(this.A05);
            LN.A09(this.A05, adActivityIntentA04);
            return true;
        } catch (LL e) {
            Throwable cause = e.getCause();
            LL cause2 = e;
            if (cause != null) {
                cause2 = e.getCause();
            }
            this.A05.A06().A8y(A03(108, 11, 76), C03298z.A0D, new AnonymousClass90(cause2));
            Log.e(A03(90, 17, 7), A03(0, 90, 5), cause2);
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01250n
    @Nullable
    public final String A65() {
        return this.A04.A0E();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01250n
    public final AdPlacementType A7B() {
        return AdPlacementType.INTERSTITIAL;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01401c
    public final void A9u(AdError adError) {
        InterfaceC01350x interfaceC01350x = this.A02;
        if (interfaceC01350x != null) {
            interfaceC01350x.AB5(this, adError);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01401c
    public final void A9v() {
        A04();
        this.A02.AB4(this);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01401c
    public final void ADj() {
        this.A03 = new C01360y(this.A05, this.A0A, this, this.A02);
        this.A03.A02();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01401c
    public final void AFH() {
        C01360y c01360y = this.A03;
        if (c01360y != null) {
            c01360y.A03();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01250n
    public final void onDestroy() {
        C01411d c01411d = this.A04;
        if (c01411d != null) {
            c01411d.A0F();
        }
    }
}
