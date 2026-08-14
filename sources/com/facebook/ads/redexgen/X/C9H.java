package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9H, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C9H {
    public static byte[] A05;
    public C9I A01;

    @Nullable
    public String A02;

    @Nullable
    public String A03;
    public int A00 = 0;
    public List<C9F> A04 = new ArrayList();

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 109);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{79, 88};
    }

    public C9H(C9I c9i, @Nullable String str, @Nullable String str2) {
        this.A01 = c9i;
        this.A03 = str;
        this.A02 = str2;
    }

    public final int A02() {
        return this.A04.size();
    }

    public final long A03() {
        C9I c9i = this.A01;
        if (c9i != null) {
            return c9i.A0C() + ((long) this.A01.A03());
        }
        return -1L;
    }

    public final C9F A04() {
        if (this.A00 < this.A04.size()) {
            this.A00++;
            return this.A04.get(this.A00 - 1);
        }
        return null;
    }

    public final C9I A05() {
        return this.A01;
    }

    @Nullable
    public final String A06() {
        return this.A02;
    }

    @Nullable
    public final String A07() {
        int i = this.A00;
        if (i > 0 && i <= this.A04.size()) {
            return this.A04.get(this.A00 - 1).A04().optString(A00(0, 2, 65));
        }
        return null;
    }

    @Nullable
    public final String A08() {
        return this.A03;
    }

    public final void A09(C9F c9f) {
        this.A04.add(c9f);
    }

    public final boolean A0A() {
        return this.A01 == null || MJ.A00() > this.A01.A0C() + ((long) this.A01.A03());
    }
}
