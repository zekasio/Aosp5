package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class UI implements C7M {
    public static byte[] A03;
    public static String[] A04 = {"WE91vPqiHLcyJwrbQHRJcIvZwn5D9l", "3LK2x46Pp3Ld9onr8DyN9Ggm", "60IU9PqapOW3gkaytJRkZEg3", "UqNMzTGRyBNLAx", "QjYmXRpW4", "DeQ01HErfJf7NLfnuVX6corDAbYDzPur", "bhlqPTI7mETXQlgoFXHPJBBhjQPpzoup", "oYTMQ3SHL"};
    public final /* synthetic */ C1217da A00;
    public final /* synthetic */ UB A01;
    public final /* synthetic */ boolean A02;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 60);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-16, Ascii.VT, 19, Ascii.SYN, Ascii.SI, Ascii.SO, -54, Ascii.RS, Ascii.EM, -54, Ascii.SO, Ascii.EM, 33, Ascii.CAN, Ascii.SYN, Ascii.EM, Ascii.VT, Ascii.SO, -54, Ascii.VT, -54, Ascii.ETB, Ascii.SI, Ascii.SO, 19, Ascii.VT, -40};
    }

    static {
        A01();
    }

    public UI(UB ub, C1217da c1217da, boolean z) {
        this.A01 = ub;
        this.A00 = c1217da;
        this.A02 = z;
    }

    @Override // com.facebook.ads.redexgen.X.C7M
    public final void AAH() {
        if (this.A01.A0a != null) {
            this.A01.A0a.A0J();
            this.A01.A0a = null;
        }
        AdErrorType adErrorType = AdErrorType.CACHE_FAILURE_ERROR;
        String strA00 = A00(0, 27, 110);
        this.A01.A0c.A0D().A2a(MJ.A01(this.A01.A00), adErrorType.getErrorCode(), strA00);
        if (this.A01.A0G != null) {
            UB ub = this.A01;
            String[] strArr = A04;
            String str = strArr[4];
            String errorMessage = strArr[7];
            if (str.length() != errorMessage.length()) {
                throw new RuntimeException();
            }
            A04[6] = "7cQ3648pyLFx7h83cxUuTBVDS0jRS450";
            ub.A0G.AAi(KH.A01(adErrorType, strA00));
        }
    }

    @Override // com.facebook.ads.redexgen.X.C7M
    public final void AAO() {
        UB ub = this.A01;
        ub.A0a = this.A00;
        if (this.A02 && ub.A0A != null) {
            FO fo = this.A01.A0A;
            String[] strArr = A04;
            if (strArr[4].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[4] = "vb7V14ygc";
            strArr2[7] = "eJXYUqUMt";
            fo.A0F();
        }
        if (this.A01.A0G != null) {
            if (this.A01.A0E.equals(EnumC0593Jz.A04) && !this.A01.A0q()) {
                this.A01.A0G.ABT();
            }
            if (this.A02) {
                if (!JR.A1C(this.A01.A0c) || this.A01.A0z() == null || !this.A01.A0z().A0r()) {
                    this.A01.A0G.A9w();
                } else {
                    UB ub2 = this.A01;
                    ub2.A0M = PB.A01(ub2.A0c, this.A01.A0z(), 4, new UJ(this));
                }
            }
        }
    }
}
