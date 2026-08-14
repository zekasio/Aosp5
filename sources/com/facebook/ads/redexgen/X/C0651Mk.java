package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.app.KeyguardManager;
import android.util.Log;
import android.view.Window;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0651Mk {
    public static byte[] A00;
    public static String[] A01 = {"75", "", "84T1cPcVhFaG3gZ5iFCuz5VGfvW435Ys", "hmgtvPST3LKdfFpjmmFZYvFoyIGtsiKE", "1o0hQSlG2MREJWQYXtVsar2Zo68mKpVL", "LjPyS32kIH6YipP2gsYrsbvo7R8K", "pRhgJcRZc8j2ATnbWVmWTgInp0JNCNsL", "EpPf5pm3Rz1UtI6LaI9QQC8GFK2ymH0S"};
    public static final String A02;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 115);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{75, 44, 126, 67, 88, 94, 75, 79, 82, 84, 85, Ascii.ESC, 82, 85, Ascii.ESC, 76, 82, 85, 95, 84, 76, Ascii.ESC, 82, 85, 93, 84, Ascii.ESC, 88, 83, 94, 88, 80, Ascii.FS, Ascii.DC2, Ascii.SO, Ascii.DLE, 2, Ascii.SYN, 5, 19, 119, 123, 110, 115, 104, 114, 106, 120, 10, Ascii.ESC, Ascii.EM, Ascii.SYN, Ascii.SUB, Ascii.SYN, 7, Ascii.DC2, Ascii.SYN, Ascii.CR, 90, 89};
    }

    static {
        A02();
        A02 = C0651Mk.class.getSimpleName();
    }

    public static Map<String, String> A01(C0947Xy c0947Xy) {
        Window window;
        HashMap map = new HashMap();
        if (c0947Xy == null) {
            return map;
        }
        try {
            map.put(A00(40, 3, FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION), String.valueOf(A04(c0947Xy)));
            Activity activityA0C = c0947Xy.A0C();
            if (activityA0C != null && (window = activityA0C.getWindow()) != null) {
                int i = window.getAttributes().flags;
                map.put(A00(58, 2, 94), Integer.toString(window.getAttributes().type));
                int i2 = 4194304 & i;
                String strA00 = A00(1, 1, 110);
                String strA002 = A00(0, 1, 8);
                map.put(A00(48, 5, 14), i2 > 0 ? strA00 : strA002);
                if (A01[1].length() == 23) {
                    throw new RuntimeException();
                }
                A01[7] = "fwmMHJhcrVWyeAGw8Re8ymmckApbJBDL";
                if ((524288 & i) <= 0) {
                    strA00 = strA002;
                }
                String flagShowWhenLockedEnabled = A00(53, 5, 18);
                map.put(flagShowWhenLockedEnabled, strA00);
            }
        } catch (Exception e) {
            String str = A02;
            String flagShowWhenLockedEnabled2 = A00(2, 30, 72);
            Log.e(str, flagShowWhenLockedEnabled2, e);
            InterfaceC03288y interfaceC03288yA06 = c0947Xy.A06();
            int i3 = C03298z.A2S;
            AnonymousClass90 anonymousClass90 = new AnonymousClass90(e);
            String flagShowWhenLockedEnabled3 = A00(43, 5, 114);
            interfaceC03288yA06.A8y(flagShowWhenLockedEnabled3, i3, anonymousClass90);
        }
        return map;
    }

    public static boolean A03(C0947Xy c0947Xy) {
        return !MT.A04(A01(c0947Xy));
    }

    public static boolean A04(C0947Xy c0947Xy) {
        KeyguardManager keyguardManager = (KeyguardManager) c0947Xy.getSystemService(A00(32, 8, 4));
        return keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode();
    }
}
