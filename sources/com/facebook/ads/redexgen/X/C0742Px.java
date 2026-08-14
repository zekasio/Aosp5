package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Px, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0742Px {
    public static byte[] A09;
    public static String[] A0A = {"gG8B5BBzXX0tXn8mAXm3GrlCsmKREgEL", "fszKDaGs6AGUXXOQg2WnNIBtS95Yz1Wh", "pnaE4meNhzrzHKSDh8PgaIlwU76aGgw8", "2ARCPk0NRRRG", "SMbVAXo8eG5PUWUAvoNRrVLTO99Zprm", "yA01QlsAfT3JJVyfy2ZKp77MLzjsBWHz", "Xgpz8alFBhAPNTQJpcXFzk4NTQQyuYWJ", "Svb9BuXOcdwLltO0M440Yd8RGfHrN1wk"};
    public final C0947Xy A00;
    public final InterfaceC0575Jh A01;
    public final QK A02;
    public final SF A06;
    public final String A07;

    @Nullable
    public final Map<String, String> A08;
    public final N3 A04 = new N3() { // from class: com.facebook.ads.redexgen.X.8I
        public static String[] A01 = {"m3H5fDZT", "tfUidThth72U8se7Apa4PT2ZGwk9ZGOU", "C7sqCneijRx2oiAJ7jgCjnbvSplD6Hvu", "CUEN1UWJGCJ8qOG4MMTMPK9Ub", "uwIe", "I7QxkSDWYBotgEGySbiUy5NvkBUV0QEh", "dizwBFytggLGpocgnk6CXcKxg", "vsUFvcPPfrfWhSaT8AiBmEZ9b5CjjyAT"};

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.AbstractC03329c
        /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(AnonymousClass86 anonymousClass86) {
            SG sg = new SG(this.A00.A07, anonymousClass86.A03(), anonymousClass86.A01(), anonymousClass86.A02());
            if (anonymousClass86.A00() >= 0.05d) {
                sg.A05(anonymousClass86.A01());
            }
            this.A00.A06.A0B(sg);
            String[] strArr = A01;
            if (strArr[6].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[2] = "q64iGrGvaw5ijPmr6ZKPys7vT4QnDerr";
            strArr2[5] = "OAtIhinrRl4iSEKbz1e7g3lvuawk4XhB";
        }
    };
    public final AbstractC0640Lz A05 = new AbstractC0640Lz() { // from class: com.facebook.ads.redexgen.X.8G
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.AbstractC03329c
        /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(AnonymousClass85 anonymousClass85) {
            this.A00.A09();
        }
    };
    public final N6 A03 = new N6() { // from class: com.facebook.ads.redexgen.X.8F
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.AbstractC03329c
        /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(AnonymousClass88 anonymousClass88) {
            this.A00.A09();
        }
    };

    public static String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 96);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A09 = new byte[]{62, 42, 57, 53, 61, 43};
    }

    static {
        A08();
    }

    public C0742Px(C0947Xy c0947Xy, InterfaceC0575Jh interfaceC0575Jh, QK qk, String str, @Nullable Map<String, String> map) {
        this.A00 = c0947Xy;
        this.A01 = interfaceC0575Jh;
        this.A07 = str;
        this.A08 = map;
        this.A02 = qk;
        this.A06 = new SF(this.A07);
        this.A02.getEventBus().A03(this.A04, this.A05, this.A03);
    }

    private Map<String, String> A07(String str) {
        HashMap map = new HashMap();
        Map<String, String> map2 = this.A08;
        if (map2 != null) {
            map.putAll(map2);
        }
        map.put(A05(0, 6, 56), str);
        return map;
    }

    public final void A09() {
        String strA04 = SF.A04(this.A06.A0A());
        if (strA04 != null) {
            InterfaceC0575Jh interfaceC0575Jh = this.A01;
            String encodedFrameData = A0A[4];
            if (encodedFrameData.length() == 13) {
                throw new RuntimeException();
            }
            A0A[3] = "qc6G14080U";
            interfaceC0575Jh.A9H(this.A07, A07(strA04));
        }
    }

    public final void A0A() {
        C0786Rp c0786Rp = new C0786Rp(this);
        if (this.A02.A0l()) {
            MM.A00(c0786Rp);
        } else {
            this.A02.getStateHandler().post(c0786Rp);
        }
    }
}
