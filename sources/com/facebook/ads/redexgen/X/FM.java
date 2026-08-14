package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class FM extends AbstractC0832Tk<C1178cw> {
    public static String[] A00 = {"ByMq6MLqhjUJsdWB3RBIp", "zuOr3", "msyHKBX3wHVeYE5obxbctQprcgEzI02t", "I3sOgeRwcNYGF4oixOV5Q17", "dcB", "ibtCqc8qysdz0E5AMIDmPhuL1XZA", "mNtKCg4kzaH6sXUtb2oDuqx2", "ObFvkEusatMYzjWaq72f4FkWXHrQjerH"};

    public FM(C1178cw c1178cw) {
        super(c1178cw);
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        C1178cw c1178cwA07 = A07();
        if (c1178cwA07 == null) {
            return;
        }
        C0947Xy c0947Xy = c1178cwA07.A08;
        String[] strArr = A00;
        if (strArr[3].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A00[5] = "SiVLKh";
        if (C0650Mj.A02(c0947Xy)) {
            c1178cwA07.A07();
        } else {
            c1178cwA07.A05.postDelayed(c1178cwA07.A0C, 5000L);
        }
    }
}
