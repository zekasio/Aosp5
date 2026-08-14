package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.TelephonyManager;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class YR extends C02766m {
    public static byte[] A01;
    public final TelephonyManager A00;

    static {
        A05();
    }

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 60);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A01 = new byte[]{Ascii.SI, 7, Ascii.SO, Ascii.CR, 4};
    }

    public YR(Context context, C6C c6c) {
        super(context, c6c);
        this.A00 = (TelephonyManager) context.getSystemService(A04(0, 5, 99));
    }

    public static int A01(CellInfo cellInfo) {
        if (cellInfo != null) {
            if (Build.VERSION.SDK_INT >= 18) {
                if (cellInfo instanceof CellInfoCdma) {
                    return ((CellInfoCdma) cellInfo).getCellSignalStrength().getLevel();
                }
                if (cellInfo instanceof CellInfoGsm) {
                    return ((CellInfoGsm) cellInfo).getCellSignalStrength().getLevel();
                }
                if (cellInfo instanceof CellInfoLte) {
                    return ((CellInfoLte) cellInfo).getCellSignalStrength().getLevel();
                }
                if (cellInfo instanceof CellInfoWcdma) {
                    return ((CellInfoWcdma) cellInfo).getCellSignalStrength().getLevel();
                }
                throw new UnsupportedOperationException(cellInfo.getClass().getSimpleName());
            }
            throw new UnsupportedOperationException();
        }
        throw new NullPointerException();
    }

    public final InterfaceC02856v A0G() {
        return new C0950Yb(this);
    }

    @SuppressLint({"MissingPermission", "CatchGeneralException"})
    public final InterfaceC02856v A0H() {
        return new C0949Ya(this);
    }

    public final InterfaceC02856v A0I() {
        return new YW(this);
    }

    public final InterfaceC02856v A0J() {
        return new YV(this);
    }

    public final InterfaceC02856v A0K() {
        return new YX(this);
    }

    public final InterfaceC02856v A0L() {
        return new YY(this);
    }

    public final InterfaceC02856v A0M() {
        return new YS(this);
    }

    public final InterfaceC02856v A0N() {
        return new C0953Ye(this);
    }

    public final InterfaceC02856v A0O() {
        return new YU(this);
    }

    public final InterfaceC02856v A0P() {
        return new YT(this);
    }

    public final InterfaceC02856v A0Q() {
        return new C0952Yd(this);
    }

    public final InterfaceC02856v A0R() {
        return new C0951Yc(this);
    }

    @SuppressLint({"MissingPermission", "CatchGeneralException"})
    public final InterfaceC02856v A0S() {
        return new YZ(this);
    }
}
