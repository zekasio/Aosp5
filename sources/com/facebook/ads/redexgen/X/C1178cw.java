package com.facebook.ads.redexgen.X;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdSize;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1178cw implements Kj {
    public static byte[] A0E;
    public static String[] A0F = {"Um", "5O6Pi5UhekEiJBNtL2", "ByBiFstlzS", "VNZICTTmM6bBZ", "I3ykA2cHAONkN", "xnUs6VMzToWHuFoC", "Qkjm3fg24P6DD7pmZ7L4neN1zLjqdukp", "LFB8Dcv49A6aPeUL"};

    @Nullable
    public InterfaceC01561s A00;
    public C9H A01;

    @Nullable
    public String A02;
    public boolean A03;
    public final int A04;
    public final Handler A05;

    @Nullable
    public final AdSize A06;
    public final C01300s A07;
    public final C0947Xy A08;
    public final InterfaceC0575Jh A09;
    public final KM A0A;
    public final C0602Kk A0B;
    public final Runnable A0C;
    public final String A0D;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A0F[2].length() != 10) {
                throw new RuntimeException();
            }
            A0F[1] = "uoxYJqIRleds8fPMMv";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 87);
            i4++;
        }
    }

    public static void A05() {
        byte[] bArr = {64, 65, -14, 66, 62, 51, 53, 55, 63, 55, 64, 70, -14, 59, 64, -14, 68, 55, 69, 66, 65, 64, 69, 55};
        if (A0F[0].length() != 2) {
            throw new RuntimeException();
        }
        A0F[1] = "dKV76OJFyRmVPWeRzZ";
        A0E = bArr;
    }

    static {
        A05();
        MU.A02();
    }

    public C1178cw(C0947Xy c0947Xy, String str, KM km, @Nullable AdSize adSize, int i) {
        this.A08 = c0947Xy;
        this.A0D = str;
        this.A0A = km;
        this.A06 = adSize;
        this.A04 = i;
        this.A0B = new C0602Kk(this.A08);
        this.A0B.A0P(this);
        this.A07 = new C01300s();
        this.A03 = true;
        this.A05 = new Handler();
        this.A0C = new FM(this);
        this.A09 = c0947Xy.A08();
        DynamicLoaderFactory.makeLoader(this.A08).getInitApi().onAdLoadInvoked(this.A08);
    }

    private List<C1217da> A04() {
        C9H c9h = this.A01;
        ArrayList arrayList = new ArrayList(c9h.A02());
        for (C9F c9fA04 = c9h.A04(); c9fA04 != null; c9fA04 = c9h.A04()) {
            InterfaceC01250n interfaceC01250nA00 = this.A07.A00(this.A08, AdPlacementType.NATIVE);
            if (interfaceC01250nA00 != null && interfaceC01250nA00.A7B() == AdPlacementType.NATIVE) {
                C1217da c1217da = (C1217da) interfaceC01250nA00;
                c1217da.A0L(this.A08, new FN(this, arrayList, c1217da), this.A09, new C01541q(c9fA04.A04(), c9h.A05(), this.A0D, c9h.A05().A0C()), UB.A0K());
            }
        }
        return arrayList;
    }

    public final void A06() {
        this.A03 = false;
        this.A05.removeCallbacks(this.A0C);
    }

    public final void A07() {
        try {
            KR kr = new KR(this.A08, null, null, null);
            C0947Xy c0947Xy = this.A08;
            String str = this.A0D;
            AdSize adSize = this.A06;
            this.A0B.A0O(new C0600Kh(c0947Xy, str, adSize != null ? new M4(adSize.getWidth(), this.A06.getHeight()) : null, this.A0A, null, this.A04, AdSettings.isTestMode(this.A08), AdSettings.isMixedAudience(), kr, MA.A01(JR.A0H(this.A08)), this.A02, null));
        } catch (KI e) {
            AAi(KH.A02(e));
        }
    }

    public final void A08(InterfaceC01561s interfaceC01561s) {
        this.A00 = interfaceC01561s;
    }

    public final void A09(String str) {
        this.A02 = str;
    }

    public final boolean A0A() {
        C9H c9h = this.A01;
        return c9h == null || c9h.A0A();
    }

    @Override // com.facebook.ads.redexgen.X.Kj
    public final void AAi(KH kh) {
        if (this.A03) {
            this.A05.postDelayed(this.A0C, TapjoyConstants.SESSION_ID_INACTIVITY_TIME);
        }
        InterfaceC01561s interfaceC01561s = this.A00;
        if (A0F[2].length() != 10) {
            throw new RuntimeException();
        }
        A0F[2] = "yGn7NPCZVX";
        if (interfaceC01561s != null) {
            interfaceC01561s.AAi(kh);
        }
    }

    @Override // com.facebook.ads.redexgen.X.Kj
    public final void ACS(C0846Ty c0846Ty) {
        C9H c9hA00 = c0846Ty.A00();
        if (c9hA00 != null) {
            if (this.A03) {
                long jA0A = c9hA00.A05().A0A();
                if (jA0A == 0) {
                    jA0A = TapjoyConstants.SESSION_ID_INACTIVITY_TIME;
                }
                this.A05.postDelayed(this.A0C, jA0A);
            }
            this.A01 = c9hA00;
            List<C1217da> listA04 = A04();
            if (this.A00 != null) {
                if (listA04.isEmpty()) {
                    this.A00.AAi(KH.A01(AdErrorType.NO_FILL, A03(0, 0, 68)));
                    return;
                } else {
                    this.A00.ABd(listA04);
                    return;
                }
            }
            return;
        }
        throw new IllegalStateException(A03(0, 24, 123));
    }
}
