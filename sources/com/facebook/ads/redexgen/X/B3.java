package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.ArrayList;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class B3 {
    public static String[] A06 = {"KiEP2P9b6TLdkEYwaN5ndNVtk9NQ5Y9p", "yrQkoPMIPCp0FUw5bDslSTdDJuyK", "OV0qCkDU4pR0s48LAW0LoXOWDo4ZunO9", "CNzCLbPvty9jTQMUswZxpqZWQtb7JEv9", "Vf", "ol3MR5ayifXszMqJK7WjfrE4Lr8bJhi8", "Hh8EscwfVF04VFT3j4sJSJqD2SmetI3K", "DN3PdRai96zSFxDytd4qNigxYecPuw8S"};
    public B4 A01;
    public B4 A02;
    public boolean A03;
    public final ArrayList<B4> A05 = new ArrayList<>();
    public final C0379Az A04 = new C0379Az();
    public B1 A00 = B1.A01;

    private B4 A00(B4 b4, B1 b1) {
        int iA04;
        if (b1.A0E() || this.A00.A0E() || (iA04 = b1.A04(this.A00.A0A(b4.A01.A02, this.A04, true).A03)) == -1) {
            return b4;
        }
        return new B4(b1.A09(iA04, this.A04).A00, b4.A01.A00(iA04));
    }

    private void A02() {
        if (!this.A05.isEmpty()) {
            this.A01 = this.A05.get(0);
        }
    }

    @Nullable
    public final B4 A03() {
        return this.A01;
    }

    @Nullable
    public final B4 A04() {
        if (this.A05.isEmpty()) {
            return null;
        }
        return this.A05.get(r1.size() - 1);
    }

    @Nullable
    public final B4 A05() {
        if (this.A05.isEmpty() || this.A00.A0E() || this.A03) {
            return null;
        }
        return this.A05.get(0);
    }

    @Nullable
    public final B4 A06() {
        return this.A02;
    }

    @Nullable
    public final FY A07(int timelinePeriodCount) {
        FY fy = null;
        B1 b1 = this.A00;
        if (b1 != null) {
            int periodIndex = b1.A00();
            for (int i = 0; i < this.A05.size(); i++) {
                B4 b4 = this.A05.get(i);
                int i2 = b4.A01.A02;
                if (i2 < periodIndex && this.A00.A09(i2, this.A04).A00 == timelinePeriodCount) {
                    if (fy != null) {
                        return null;
                    }
                    fy = b4.A01;
                }
            }
        }
        return fy;
    }

    public final void A08() {
        this.A03 = false;
        A02();
    }

    public final void A09() {
        this.A03 = true;
    }

    public final void A0A(int i) {
        A02();
    }

    public final void A0B(int i, FY fy) {
        this.A05.add(new B4(i, fy));
        if (this.A05.size() == 1) {
            boolean zA0E = this.A00.A0E();
            if (A06[0].charAt(21) == 'U') {
                throw new RuntimeException();
            }
            A06[0] = "SFS5Xb2c2LrmqtbhPrHYALinOi1MehvJ";
            if (!zA0E) {
                A02();
            }
        }
    }

    public final void A0C(int i, FY fy) {
        B4 b4 = new B4(i, fy);
        this.A05.remove(b4);
        if (!b4.equals(this.A02)) {
            return;
        }
        this.A02 = this.A05.isEmpty() ? null : this.A05.get(0);
    }

    public final void A0D(int i, FY fy) {
        this.A02 = new B4(i, fy);
    }

    public final void A0E(B1 b1) {
        for (int i = 0; i < this.A05.size(); i++) {
            ArrayList<B4> arrayList = this.A05;
            arrayList.set(i, A00(arrayList.get(i), b1));
        }
        B4 b4 = this.A02;
        if (A06[0].charAt(21) == 'U') {
            throw new RuntimeException();
        }
        A06[1] = "OE27bQwCbSc4SHZoCTNTYydrCDTv";
        if (b4 != null) {
            this.A02 = A00(b4, b1);
        }
        this.A00 = b1;
        A02();
    }

    public final boolean A0F() {
        return this.A03;
    }
}
