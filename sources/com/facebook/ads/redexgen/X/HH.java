package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$Parameters;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class HH implements Comparable<HH> {
    public static String[] A07 = {"UOhnAWHUvWrKh39blc2", "rJoZ4rjs3", "mwxErCj8CFXQtRdeT7I", "OMBsSVN1m", "xKR0iM7hb", "rY23JmNnbt4", "7JhRM9", "FTdecT"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final DefaultTrackSelector$Parameters A06;

    public HH(Format format, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, int i) {
        this.A06 = defaultTrackSelector$Parameters;
        this.A05 = C0390Bk.A0H(i, false) ? 1 : 0;
        this.A03 = C0390Bk.A0K(format, defaultTrackSelector$Parameters.A07) ? 1 : 0;
        this.A02 = (format.A0D & 1) != 0 ? 1 : 0;
        this.A01 = format.A05;
        this.A04 = format.A0C;
        this.A00 = format.A04;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(HH hh) {
        int i = this.A05;
        int i2 = hh.A05;
        if (i != i2) {
            return C0390Bk.A01(i, i2);
        }
        int i3 = this.A03;
        int i4 = hh.A03;
        if (i3 != i4) {
            return C0390Bk.A01(i3, i4);
        }
        int i5 = this.A02;
        int i6 = hh.A02;
        if (i5 != i6) {
            return C0390Bk.A01(i5, i6);
        }
        if (this.A06.A0D) {
            return C0390Bk.A01(hh.A00, this.A00);
        }
        int i7 = this.A05 != 1 ? -1 : 1;
        int i8 = this.A01;
        int i9 = hh.A01;
        String[] strArr = A07;
        if (strArr[6].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        A07[3] = "q1nzmC2W0";
        if (i8 != i9) {
            return C0390Bk.A01(i8, i9) * i7;
        }
        int i10 = this.A04;
        int i11 = hh.A04;
        return i10 != i11 ? C0390Bk.A01(i10, i11) * i7 : C0390Bk.A01(this.A00, hh.A00) * i7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HH hh = (HH) obj;
        if (this.A05 == hh.A05 && this.A03 == hh.A03 && this.A02 == hh.A02 && this.A01 == hh.A01 && this.A04 == hh.A04) {
            int i = this.A00;
            if (A07[5].length() != 11) {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[0] = "5gFFNpUtyAKNtlVcilC";
            strArr[2] = "oFDw9vE2Y7jHYxyqfLD";
            if (i == hh.A00) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((this.A05 * 31) + this.A03) * 31;
        int result = this.A02;
        int i2 = (((i + result) * 31) + this.A01) * 31;
        int result2 = this.A04;
        return ((i2 + result2) * 31) + this.A00;
    }
}
