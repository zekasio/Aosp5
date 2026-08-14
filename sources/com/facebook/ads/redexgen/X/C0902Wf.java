package com.facebook.ads.redexgen.X;

import com.google.firebase.FirebaseError;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0902Wf implements InterfaceC0419Cw {
    public static String[] A01 = {"QxyXczWrJPO3wVR2PYQEuzattRFJZIJg", "XsmQOXxz56F8ZFhcTY7SGeacCVF", "LQ6zZ9Zapjn1TRDyEulQRXNFGY7QAnZu", "xNUQQ3qsLAAUx2yJDK4JRdV8dnV4oHU2", "y0XWt2t2M5t5jOwvErVmSfYW64pV03wh", "08OFOgjSb41ktoPQP1wiTHuWkUblsKHS", "6O4T6stZYTO64A1eR5mIXItGp3sSNy8u", "W8gkc1teFinis0XUwJ8nE"};
    public final /* synthetic */ C0901We A00;

    public C0902Wf(C0901We c0901We) {
        this.A00 = c0901We;
    }

    public /* synthetic */ C0902Wf(C0901We c0901We, C0903Wg c0903Wg) {
        this(c0901We);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0419Cw
    public final void A3r(int i, int i2, InterfaceC0408Cd interfaceC0408Cd) throws InterruptedException, IOException {
        this.A00.A0K(i, i2, interfaceC0408Cd);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0419Cw
    public final void A5C(int i) throws C0360Af {
        this.A00.A0I(i);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0419Cw
    public final void A5R(int i, double d) throws C0360Af {
        this.A00.A0J(i, d);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0419Cw
    public final int A6T(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                if (A01[5].charAt(21) != 'H') {
                    throw new RuntimeException();
                }
                A01[5] = "OUtMPH0VOq9GijvQqOpwMHvOHPexZJaI";
                return 2;
            case 134:
            case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
            case 2274716:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
                return 5;
            default:
                return 0;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0419Cw
    public final void A8L(int i, long j) throws C0360Af {
        this.A00.A0L(i, j);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0419Cw
    public final boolean A8X(int i) {
        if (i != 357149030) {
            if (A01[3].charAt(17) != 'K') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[4] = "tUcPl0tEvSxC8oU8uPz5JVtDe3SsNXw6";
            strArr[2] = "wRikutKgqwJwqf30vjhaLiDyNnSQZYBE";
            if (i != 524531317 && i != 475249515 && i != 374648427) {
                return false;
            }
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0419Cw
    public final void AEy(int i, long j, long j2) throws C0360Af {
        this.A00.A0M(i, j, j2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0419Cw
    public final void AF6(int i, String str) throws C0360Af {
        this.A00.A0N(i, str);
    }
}
