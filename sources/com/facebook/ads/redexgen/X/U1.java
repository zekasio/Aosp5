package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import org.json.JSONException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class U1 implements R3 {
    public static byte[] A03;
    public final /* synthetic */ long A00;
    public final /* synthetic */ C0600Kh A01;
    public final /* synthetic */ C0602Kk A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 10);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{98, 98, 97, 99, 104, 104, 105, 54, 19, 66, 65, Ascii.RS, Ascii.DC2, Ascii.DC2, 66, Ascii.DC2, 1, Ascii.CAN, 4, 5, Ascii.SO, 51, 40, 46, 59, 63, 34, 36, 37, 113, 107, 108, 90, 77, 73, 90, 77, Ascii.US, 90, 77, 77, 80, 77, Ascii.US, 80, 92, 92, 74, 77, 77, 90, 91, 75, 125, 106, 110, 125, 106, 56, 106, 125, 104, 116, 113, 125, 124, 56, 107, 109, 123, 123, 125, 107, 107, 126, 109, 116, 116, 97, 75, 74, 103, 75, 73, 84, 72, 65, 80, 65, 95, 94, 117, 66, 66, 95, 66};
    }

    public U1(C0602Kk c0602Kk, C0600Kh c0600Kh, long j) {
        this.A02 = c0602Kk;
        this.A01 = c0600Kh;
        this.A00 = j;
    }

    private final void A02(RF rf) {
        Kg.A06(this.A01);
        try {
            R1 r1A00 = rf.A00();
            if (r1A00 != null) {
                String errorMsg = r1A00.A5p();
                C0605Kn c0605KnA06 = this.A02.A05.A06(this.A02.A04, errorMsg, this.A00);
                if (c0605KnA06.A01() == EnumC0604Km.A03) {
                    C0845Tx c0845Tx = (C0845Tx) c0605KnA06;
                    String finalErrMessage = c0845Tx.A04();
                    AdErrorType adErrorTypeAdErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(c0845Tx.A03(), AdErrorType.ERROR_MESSAGE);
                    if (finalErrMessage != null) {
                        errorMsg = finalErrMessage;
                    }
                    this.A02.A04.A0D().A2j(MJ.A01(this.A02.A00), adErrorTypeAdErrorTypeFromCode.getErrorCode(), errorMsg, adErrorTypeAdErrorTypeFromCode.isPublicError());
                    this.A02.A0D(KH.A01(adErrorTypeAdErrorTypeFromCode, errorMsg));
                    return;
                }
            }
            AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
            String message = rf.getMessage();
            this.A02.A04.A0D().A2j(MJ.A01(this.A02.A00), adErrorType.getErrorCode(), message, adErrorType.isPublicError());
            this.A02.A0D(KH.A01(adErrorType, message));
        } catch (JSONException e) {
            AdErrorType adErrorType2 = AdErrorType.NETWORK_ERROR;
            String message2 = rf.getMessage();
            C0R c0rA0D = this.A02.A04.A0D();
            long jA01 = MJ.A01(this.A02.A00);
            int errorCode = adErrorType2.getErrorCode();
            StringBuilder sb = new StringBuilder();
            String errorMessage = A00(16, 15, 65);
            sb.append(errorMessage);
            String errorMessage2 = e.getMessage();
            sb.append(errorMessage2);
            c0rA0D.A2j(jA01, errorCode, sb.toString(), adErrorType2.isPublicError());
            this.A02.A0D(KH.A01(adErrorType2, message2));
        }
    }

    @Override // com.facebook.ads.redexgen.X.R3
    public final void AAM(R1 r1) {
        KV.A05(A00(79, 10, 46), A00(52, 27, 18), A00(8, 8, 45));
        if (r1 != null) {
            String strA5p = r1.A5p();
            Kg.A06(this.A01);
            this.A02.A0N(strA5p, this.A00, this.A01);
        }
    }

    @Override // com.facebook.ads.redexgen.X.R3
    public final void AAj(Exception exc) {
        KV.A05(A00(89, 7, 58), A00(31, 21, 53), A00(0, 8, 90));
        if (RF.class.equals(exc.getClass())) {
            A02((RF) exc);
            return;
        }
        AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
        String message = exc.getMessage();
        this.A02.A04.A0D().A2j(MJ.A01(this.A02.A00), adErrorType.getErrorCode(), message, adErrorType.isPublicError());
        this.A02.A0D(KH.A01(adErrorType, message));
    }
}
