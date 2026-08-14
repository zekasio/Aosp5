package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class F7 extends C1117bs {
    public static String[] A00 = {"ebBTtcDfrXbt7XUNv2xXXzukgR", "AfSrg72OINfokWlk8lEehE43rER54C5K", "DLWRAT6zkYb5ZQ4lVerhsjeXnJdmq546", "HcA6UXt4lgXnqoCqWVxSHZRcl", "xLJGdEWbtHtgosfXVcR1IwW", "KlZdBiYd7CYsgOQcQxjIKqODuE8wujbn", "gwTEk6Fa0GjLNEZ2sqovA8E7SRT86ppt", "mobLesdsIst7Z6gfBQK3QOgi9WAmLStS"};

    public F7(AnonymousClass59 anonymousClass59) {
        super(anonymousClass59);
    }

    @Override // com.facebook.ads.redexgen.X.C1117bs, com.facebook.ads.redexgen.X.InterfaceC0657Mq
    public final void A3s(String rewardedVideoError) {
        if (this.A00.get() == null) {
            return;
        }
        AnonymousClass59 anonymousClass59 = this.A00.get();
        if (A00[1].charAt(12) != 'k') {
            throw new RuntimeException();
        }
        A00[0] = "wcnlDkVPCotGmNFV8gEH10X6";
        anonymousClass59.A0D(rewardedVideoError);
        String strA02 = Q9.A08.A02();
        String strA022 = Q9.A09.A02();
        if (rewardedVideoError.equals(strA02)) {
            this.A00.get().finish(11);
        } else if (rewardedVideoError.equals(strA022)) {
            this.A00.get().finish(12);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C1117bs, com.facebook.ads.redexgen.X.InterfaceC0657Mq
    public final void A3t(String str, C03309a c03309a) {
        super.A3t(str, c03309a);
    }
}
