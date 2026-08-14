package com.facebook.ads.redexgen.X;

import com.vungle.warren.AdLoader;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ss, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0815Ss extends L8 {
    public static String[] A01 = {"ZvDtHAz5m48M18w3xVBvW9UUvAxUfTco", "Su9zcdtZ9ImnInrf0ILgVeApSeGsgvZI", "xXqvKIRF0PBjEGaR7TZ18ROMB", "m2Hewa3Z6gbURtNYV3SWt7DVdluwrYvz", "mWXUFmbAmKViJClAM9LXlAC", "0Y7AahKvzPLarINwhoocY8ezozCmsz", "5fBoxvqmYpNfoXwOAmWasRGE3QCsQXLn", "O4RwXCXfxOQMJWQD0Tqe5fA"};
    public final /* synthetic */ C0809Sm A00;

    public C0815Ss(C0809Sm c0809Sm) {
        this.A00 = c0809Sm;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        if (!this.A00.A0L) {
            MS.A0F(1000, this.A00.A0F);
        }
        this.A00.postDelayed(this, AdLoader.RETRY_DELAY);
        if (A01[2].length() == 24) {
            throw new RuntimeException();
        }
        A01[2] = "V75DU12eQT8nm";
    }
}
