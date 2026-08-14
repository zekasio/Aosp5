package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0940Xr implements InterfaceC03178l {
    public static byte[] A04;
    public static String[] A05 = {"D3PJ2GNcgNGI4MtKfCaHjqEOfdHoPcVQ", "EJL0aGmI3i0Imoz4UWgpTxwTxGm9WRxT", "tfWCUNw0WGkvc5ldnWfg2BDK3aY0ceq2", "VYnzwe", "FWw4Dif8pFGferaZg4Cc6MDYh6zRU5", "BYQArfMrHiqwTG3fAjpcYjBOCFZN2nO4", "ZJiZak5asVL", "k4pPkd4ODWsyAa7ylPFb6IMORyuDH4"};
    public Context A00;
    public final InterfaceC03168k A02;
    public final AtomicBoolean A03 = new AtomicBoolean(false);

    @Nullable
    public C03148i A01 = A00();

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 126);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{107, 127, 96, 112, 124, 106, 123, 123, 102, 97, 104, 124, 112, 100, 106, 118};
    }

    static {
        A03();
    }

    public C0940Xr(Context context, InterfaceC03168k interfaceC03168k) {
        this.A00 = context;
        this.A02 = interfaceC03168k;
    }

    @Nullable
    private C03148i A00() {
        return C03148i.A00(C0610Kt.A00(this.A00).getString(A01(0, 16, 81), null));
    }

    private void A02() {
        this.A02.A9b(new C0941Xs(this));
    }

    public final void A04(@Nullable String[] strArr, @Nullable Integer num, @Nullable Integer num2) {
        C03148i c03148i = new C03148i(strArr, num, num2);
        if (c03148i.equals(this.A01)) {
            return;
        }
        this.A01 = c03148i;
        this.A03.set(true);
        SharedPreferences sharedPreferencesA00 = C0610Kt.A00(this.A00);
        if (A05[2].charAt(16) != 'n') {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[7] = "txsFPtaRD11LyA3dzoyK5U0Vbdrctz";
        strArr2[4] = "NLpqiEYsaOJ6LGl2A1qehjxsg53G43";
        sharedPreferencesA00.edit().putString(A01(0, 16, 81), this.A01.A07()).apply();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03178l
    @Nullable
    public final C03148i A6K() {
        A02();
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03178l
    public final boolean A8d() {
        A02();
        if (this.A01 == null) {
            return false;
        }
        Set<String> setA0X = JR.A0X(this.A00);
        String strA07 = this.A01.A07();
        Iterator<String> it = setA0X.iterator();
        while (it.hasNext()) {
            if (strA07.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03178l
    public final boolean AEm() {
        A02();
        return this.A03.getAndSet(false);
    }
}
