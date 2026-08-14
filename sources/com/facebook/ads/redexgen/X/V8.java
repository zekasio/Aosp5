package com.facebook.ads.redexgen.X;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.vungle.warren.AdLoader;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class V8 implements HZ, I0<Object> {
    public static String[] A0A = {"8v43OWLt8X4Ft8FSsUnUJEljk6O9jZtl", "gqJU9rJqtCXP9nVsCJhzhjWr3OTUONn5", "evi8lnvhIGFpGwxvrEQ2HxpF9HfAYNb4", "XM9iQGBoaLQIRrKYvs1BFwTGSVuWakLP", "oYKHkHYzGvwdV8VAJO5FvOndhShHo3uL", "GsOQXWL80Wqi8CBj4PFxcrgidstVbv5Z", "TfEJwESWFeUjyASkqvscuoRhiyKsiSGj", "R3GeLkF45fmp7DtCtFYf0NMS1ko1sZ3Y"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;

    @Nullable
    public final Handler A06;

    @Nullable
    public final HY A07;
    public final IN A08;
    public final C0562Iu A09;

    public V8() {
        this(null, null, 1000000L, 2000, IN.A00);
    }

    public V8(@Nullable Handler handler, @Nullable HY hy, long j, int i, IN in) {
        this.A06 = handler;
        this.A07 = hy;
        this.A09 = new C0562Iu(i);
        this.A08 = in;
        this.A01 = j;
    }

    private void A01(int i, long j, long j2) {
        Handler handler = this.A06;
        if (handler != null) {
            HY hy = this.A07;
            String[] strArr = A0A;
            if (strArr[3].charAt(14) == strArr[2].charAt(14)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[3] = "mcMhHiKL1Hs40ZODL70g4thjgDTU4mJQ";
            strArr2[2] = "gdrxxP25NVrEqdTm0xFGwMteDAr0ERpE";
            if (hy != null) {
                handler.post(new Hj(this, i, j, j2));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.HZ
    public final synchronized long A5n() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.I0
    public final synchronized void AAG(Object obj, int i) {
        this.A02 += (long) i;
    }

    @Override // com.facebook.ads.redexgen.X.I0
    public final synchronized void ACa(Object obj) {
        IK.A04(this.A00 > 0);
        long jA58 = this.A08.A58();
        long nowMs = jA58 - this.A03;
        int i = (int) nowMs;
        long nowMs2 = i;
        this.A05 += nowMs2;
        long j = this.A04;
        long nowMs3 = this.A02;
        this.A04 = j + nowMs3;
        if (i > 0) {
            long nowMs4 = i;
            this.A09.A03((int) Math.sqrt(this.A02), (this.A02 * 8000) / nowMs4);
            if (this.A05 >= AdLoader.RETRY_DELAY || this.A04 >= 524288) {
                float bitsPerSecond = this.A09.A02(0.5f);
                this.A01 = (long) bitsPerSecond;
            }
        }
        A01(i, this.A02, this.A01);
        int i2 = this.A00 - 1;
        this.A00 = i2;
        if (i2 > 0) {
            this.A03 = jA58;
        }
        this.A02 = 0L;
    }

    @Override // com.facebook.ads.redexgen.X.I0
    public final synchronized void ACb(Object obj, C0526Hi c0526Hi) {
        if (this.A00 == 0) {
            this.A03 = this.A08.A58();
        }
        this.A00++;
    }
}
