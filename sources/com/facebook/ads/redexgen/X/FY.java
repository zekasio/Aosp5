package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class FY {
    public static String[] A04 = {"QAVxR1pm4g3OMy63NQvftsN2xqVHZpJs", "AzW64QlkVBQHB9f6Xzc9fy5MjwuFwf", "EYWLKn1ZI2FgvzG2Y3WEpQG0rKYdGsmO", "8MKSyYZIic", "8HCh", "B2G9RsjiNaG6Fd9EDgK8ZSLtpMYMPZWp", "0LWAgqDnvmn5Zl5Tjazxu4DQCyM2IyoB", "wKpHaIMIJd"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;

    public FY(int i) {
        this(i, -1L);
    }

    public FY(int i, int i2, int i3, long j) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A03 = j;
    }

    public FY(int i, long j) {
        this(i, -1, -1, j);
    }

    public final FY A00(int i) {
        if (this.A02 == i) {
            return this;
        }
        return new FY(i, this.A00, this.A01, this.A03);
    }

    public final boolean A01() {
        return this.A00 != -1;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FY fy = (FY) obj;
        if (this.A02 == fy.A02 && this.A00 == fy.A00) {
            int i = this.A01;
            int i2 = fy.A01;
            if (A04[6].charAt(12) == 'Y') {
                throw new RuntimeException();
            }
            A04[6] = "oyJ32Yzo0dJhSwoxIDwlIRMSMQ1R6SLA";
            if (i == i2 && this.A03 == fy.A03) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((17 * 31) + this.A02) * 31;
        int result = this.A00;
        int i2 = (((i + result) * 31) + this.A01) * 31;
        int result2 = (int) this.A03;
        return i2 + result2;
    }
}
