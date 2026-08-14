package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TS implements InterfaceC0655Mo {
    public static String[] A01 = {"h2gmCgzeOSwPpQadyubORmPME", "FUsicmE", "hn4NyL1W4e9kqLwlHKvUfsHZQMREJpya", "eHNPFabCzKzaRImgdDwbhByrCj67ZmIn", "6elmdBIgNV", "KYWsfvA8UKVAEYMYl", "OScpkLbA9Akq1WCCJj9B2P18mljyrRf1", "CLPqh0UltEqIAscKXF8yE5GQF7q0sxf27"};
    public final /* synthetic */ TO A00;

    public TS(TO to) {
        this.A00 = to;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0655Mo
    public final void AAK() {
        if (this.A00.A0Z()) {
            TO to = this.A00;
            if (A01[5].length() != 17) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "BQfapZ2cL00AEaaE3FSFtmiC2NvNVd8B";
            strArr[7] = "2Eilcj8Fw7KGtRQsL0qtkyDrsBY20NGQL";
            if (!to.A0Q.get()) {
                this.A00.A0O.A07(this.A00);
                return;
            }
        }
        if (this.A00.A0S) {
            boolean z = this.A00.A0Q.get();
            String[] strArr2 = A01;
            if (strArr2[1].length() != strArr2[4].length()) {
                A01[5] = "H8RzDb7PgK43jKvxQ";
                if (!z && this.A00.A0Y()) {
                    this.A00.A0V.setToolbarActionMode(0);
                    TO to2 = this.A00;
                    String[] strArr3 = A01;
                    if (strArr3[1].length() != strArr3[4].length()) {
                        A01[3] = "HnGIws8hCrqNeUOcBeXjDBOXn0GrcMNy";
                        to2.A0M();
                        return;
                    } else {
                        to2.A0M();
                        return;
                    }
                }
            } else {
                throw new RuntimeException();
            }
        }
        this.A00.A0I.A02(EnumC0582Jo.A07, null);
        this.A00.A0L.A3s(this.A00.A0M.A6U());
    }
}
