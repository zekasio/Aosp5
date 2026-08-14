package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0770Qz extends L8 {
    public static String[] A04 = {"pUIboC8CwdUMtM1tPR8iEtPz8p", "ladzvmq", "gZiIZXhhpFNWaRiPv", "vQtAVDGFp8M", "7j30UYRlUEXcM4Kd2wK", "XchzO9Mtzl1GyvdPdWlZd1J0iwZmFx3H", "VTwPVxpRcW0", "YPnzN72MuP4y3lnuBhqZ0NoSyY"};
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ QK A02;
    public final /* synthetic */ EnumC0764Qt A03;

    public C0770Qz(QK qk, EnumC0764Qt enumC0764Qt, int i, int i2) {
        this.A02 = qk;
        this.A03 = enumC0764Qt;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        if (this.A03 == EnumC0764Qt.A07) {
            this.A02.A0L(EnumC0582Jo.A0q);
            this.A02.A0A.A0D().A2w();
            this.A02.A0B.A02(QK.A0C());
            return;
        }
        if (this.A03 == EnumC0764Qt.A03) {
            this.A02.A0L(EnumC0582Jo.A0l);
            this.A02.A03 = true;
            this.A02.A0B.A02(QK.A0G);
            this.A02.A0K(this.A00);
            return;
        }
        EnumC0764Qt enumC0764Qt = this.A03;
        EnumC0764Qt enumC0764Qt2 = EnumC0764Qt.A06;
        String[] strArr = A04;
        if (strArr[0].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        A04[5] = "Wlqb3PCyph61UkVVxo7ng7VZa1hYfmo4";
        if (enumC0764Qt == enumC0764Qt2) {
            this.A02.A0L(EnumC0582Jo.A0k);
            this.A02.A0A.A0D().A2o();
            this.A02.A03 = true;
            this.A02.A07.removeCallbacksAndMessages(null);
            C03319b c03319b = this.A02.A0B;
            int i = this.A01;
            c03319b.A02(new AnonymousClass88(i, i));
            this.A02.A0K(this.A01);
            return;
        }
        if (this.A03 == EnumC0764Qt.A0A) {
            if (JR.A1I(this.A02.A0A)) {
                this.A02.A0A.A09().ACr();
            }
            this.A02.A0L(EnumC0582Jo.A0o);
            this.A02.A0A.A0D().A33();
            this.A02.A0B.A02(QK.A0H);
            this.A02.A07.removeCallbacksAndMessages(null);
            this.A02.A0H();
            return;
        }
        if (this.A03 == EnumC0764Qt.A05) {
            this.A02.A0L(EnumC0582Jo.A0n);
            this.A02.A0A.A0D().A2s();
            C03319b c03319b2 = this.A02.A0B;
            final int i2 = this.A00;
            c03319b2.A02(new NE(i2) { // from class: com.facebook.ads.redexgen.X.85
            });
            this.A02.A07.removeCallbacksAndMessages(null);
            this.A02.A0K(this.A00);
            return;
        }
        if (this.A03 == EnumC0764Qt.A04) {
            this.A02.A0L(EnumC0582Jo.A0m);
            this.A02.A0A.A0D().A2p();
            this.A02.A0B.A02(QK.A0K);
            this.A02.A07.removeCallbacksAndMessages(null);
            return;
        }
        if (this.A03 == EnumC0764Qt.A09) {
            this.A02.A0L(EnumC0582Jo.A0k);
            this.A02.A0A.A0D().A2y();
            this.A02.A03 = true;
            this.A02.A07.removeCallbacksAndMessages(null);
            this.A02.A0B.A02(new AnonymousClass88(this.A00, this.A01));
            this.A02.A0K(this.A00);
        }
    }
}
