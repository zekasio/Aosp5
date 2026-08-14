package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0755Qk {
    public static C0755Qk A09;
    public static byte[] A0A;
    public static final DownloadAction.Deserializer[] A0B;
    public F0 A00;

    @Nullable
    public I4 A01;
    public File A02;
    public boolean A03;
    public final C0946Xx A06;
    public final Handler A04 = new Handler(Looper.getMainLooper());
    public final SparseArray<C0753Qi> A05 = new SparseArray<>();
    public final Runnable A08 = new RunnableC0752Qh(this);
    public final InterfaceC0459Et A07 = new ID(this);

    public static String A07(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 103);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0C() {
        A0A = new byte[]{-103, -69, -14, -19, -34, -20, -77, -103, -69, -3, Ascii.DC4, Ascii.SI, 0, Ascii.SO, -69, -24, 19, Ascii.ESC, Ascii.DC2, Ascii.DLE, 19, 5, 8, 9, 8, -46, -60, -9, Ascii.CAN, 5, Ascii.CAN, 9, -34, -60, Ascii.ESC, 72, 72, 69, 72, 4, -10, 41, 74, 55, 74, 59, Ascii.DLE, -10, -44, -31, -13, -21, 33, 36, 46, 55, -19, 33, 35, 52, 41, 47, 46, 51, -40, -37, -27, -18, -92, -37, -26, -18, -27, -29, -26, -40, -37, -22, 33, 36, 51, -40, -42, -40, -35, -38};
    }

    static {
        A0C();
        A0B = new DownloadAction.Deserializer[]{C0879Vf.A03};
    }

    @VisibleForTesting
    public C0755Qk(C0946Xx c0946Xx, @Nullable F0 f0) {
        this.A06 = c0946Xx;
        if (f0 != null) {
            this.A00 = f0;
            f0.A0Q(this.A07);
        }
        A01().A0P();
    }

    private synchronized F0 A01() {
        if (this.A00 == null) {
            this.A00 = new F0(new F5(A03(), A02()), 10, 5, new File(A06(), A07(52, 12, 89)), A0B);
            this.A00.A0Q(this.A07);
        }
        return this.A00;
    }

    private V0 A02() {
        return new C2N(A07(78, 3, 89), null);
    }

    private final synchronized I4 A03() {
        if (this.A01 == null) {
            this.A01 = new C0860Um(new File(A06(), A07(64, 14, 16)), new BI(JR.A0N(this.A06)));
        }
        return this.A01;
    }

    public static C0863Up A04(V6 v6, I4 i4) {
        return new C0863Up(i4, v6, new V2(), null, 2, null);
    }

    public static synchronized C0755Qk A05(C0946Xx c0946Xx) {
        if (A09 == null) {
            A09 = new C0755Qk(c0946Xx, null);
        }
        return A09;
    }

    private File A06() {
        if (this.A02 == null) {
            this.A02 = this.A06.getCacheDir();
        }
        return this.A02;
    }

    @Nullable
    public static String A08(C0946Xx c0946Xx, Uri uri) {
        try {
            if (!JR.A1F(c0946Xx)) {
                return null;
            }
            return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, uri.getFragment()).toString();
        } catch (URISyntaxException e) {
            c0946Xx.A06().A8y(A07(81, 5, 14), C03298z.A0u, new AnonymousClass90(e));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09() {
        for (C0465Ez c0465Ez : A01().A0S()) {
            int state = c0465Ez.A02;
            C0753Qi c0753Qi = this.A05.get(state);
            if (c0753Qi != null) {
                int i = c0465Ez.A01;
                if (i == 2 || c0465Ez.A03 > c0753Qi.A00) {
                    String str = A07(15, 19, 61) + i + A07(0, 8, 18) + c0465Ez.A03;
                    c0753Qi.A01.AAY(c0753Qi.A02);
                    this.A05.remove(state);
                } else if (i == 4 || i == 3) {
                    String str2 = A07(34, 14, FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION) + i;
                    c0753Qi.A01.AAk(c0465Ez.A05);
                    this.A05.remove(state);
                }
            }
            String str3 = A07(48, 4, 25) + state + A07(8, 7, 52) + c0465Ez.A03;
        }
    }

    private void A0A() {
        if (!this.A03) {
            this.A03 = true;
            this.A04.post(this.A08);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        this.A04.removeCallbacks(this.A08);
        this.A03 = false;
    }

    public final InterfaceC0521Hd A0F(Context context) {
        return A04(new V6(context, (I0<? super InterfaceC0522He>) null, A02()), A03());
    }

    public final void A0G(Uri uri, InterfaceC0754Qj interfaceC0754Qj, long j) {
        String cacheKey = A08(this.A06, uri);
        if (cacheKey == null) {
            cacheKey = uri.toString();
        }
        boolean cacheHit = A0H(cacheKey);
        C0879Vf c0879Vf = new C0879Vf(uri, false, null, cacheKey);
        F0 downloadManager = A01();
        int actionId = downloadManager.A0O(c0879Vf);
        this.A05.put(actionId, new C0753Qi(interfaceC0754Qj, j, cacheHit, null));
        A0A();
    }

    public final boolean A0H(String str) {
        return A03().A5w(str, 0L, 1L) > 0;
    }
}
