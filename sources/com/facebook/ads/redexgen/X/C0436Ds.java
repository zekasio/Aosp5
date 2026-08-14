package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ds, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@TargetApi(16)
public final class C0436Ds implements XH, InterfaceC0369Ao, InterfaceC0367Am {
    public static byte[] A0O;
    public static String[] A0P = {"p1p2g9mbI7jG28uS1AIjZaN2DuNLisT4", "5M6TC2sONh3rGys5YKd78dMRKX2wOUqH", "h92WNkWPJTM", "jYXxaa6xf7axcTjhEWPmUH7zZsfwsjgI", "vYDSW5DyAu5jQwnIRgw24Ezub5gSEfu7", "VyMVayVAQGyPc0QthTR0tkMwCD52dsyF", "LU4FXKZXpKPxotYf", "puFnwNxTYtdaaLd9gUGAlTVzIEShK4ZY"};
    public float A00;
    public int A01;
    public int A02;

    @Nullable
    public Surface A03;

    @Nullable
    public SurfaceHolder A04;

    @Nullable
    public TextureView A05;
    public Format A06;
    public Format A07;
    public BD A08;
    public C0402Bw A09;
    public C0402Bw A0A;
    public InterfaceC0466Fa A0B;
    public List<GX> A0C;
    public boolean A0D;
    public final Handler A0E;
    public final XH A0F;
    public final XF A0G;
    public final XD A0H;
    public final CopyOnWriteArraySet<BT> A0I;
    public final CopyOnWriteArraySet<EJ> A0J;
    public final CopyOnWriteArraySet<InterfaceC0493Gb> A0K;
    public final CopyOnWriteArraySet<JN> A0L;
    public final CopyOnWriteArraySet<JE> A0M;
    public final XG[] A0N;

    public static String A07(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0O, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 58);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0F() {
        A0O = new byte[]{45, Ascii.ETB, 19, Ascii.SO, Ascii.DC2, Ascii.ESC, 59, 6, 17, 46, Ascii.DC2, Ascii.US, 7, Ascii.ESC, Ascii.FF, 9, 47, 40, 60, 59, 57, 63, Ascii.SO, 63, 34, 46, 47, 40, 63, Ascii.SYN, 51, 41, 46, 63, 52, 63, 40, 122, 59, 54, 40, 63, 59, 62, 35, 122, 47, 52, 41, 63, 46, 122, 53, 40, 122, 40, 63, 42, 54, 59, 57, 63, 62, 116};
    }

    static {
        A0F();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.CM != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public C0436Ds(InterfaceC0377Aw interfaceC0377Aw, HT ht, InterfaceC0356Ab interfaceC0356Ab, @Nullable CM<C0919Ww> cm) {
        this(interfaceC0377Aw, ht, interfaceC0356Ab, cm, new B2());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.CM != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public C0436Ds(InterfaceC0377Aw interfaceC0377Aw, HT ht, InterfaceC0356Ab interfaceC0356Ab, @Nullable CM<C0919Ww> cm, B2 b2) {
        this(interfaceC0377Aw, ht, interfaceC0356Ab, cm, b2, IN.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.CM != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public C0436Ds(InterfaceC0377Aw interfaceC0377Aw, HT ht, InterfaceC0356Ab interfaceC0356Ab, @Nullable CM<C0919Ww> cm, B2 b2, IN in) {
        this.A0G = new XF(this);
        this.A0M = new CopyOnWriteArraySet<>();
        this.A0K = new CopyOnWriteArraySet<>();
        this.A0J = new CopyOnWriteArraySet<>();
        this.A0L = new CopyOnWriteArraySet<>();
        this.A0I = new CopyOnWriteArraySet<>();
        this.A0E = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        Handler handler = this.A0E;
        XF xf = this.A0G;
        this.A0N = interfaceC0377Aw.A4R(handler, xf, xf, xf, xf, cm);
        this.A00 = 1.0f;
        this.A01 = 0;
        this.A08 = BD.A04;
        this.A02 = 1;
        this.A0C = Collections.emptyList();
        this.A0F = A02(this.A0N, ht, interfaceC0356Ab, in);
        this.A0H = b2.A00(this.A0F, in);
        A3E(this.A0H);
        this.A0L.add(this.A0H);
        this.A0I.add(this.A0H);
        A0I(this.A0H);
        if (cm instanceof C0921Wy) {
            ((C0921Wy) cm).A04(this.A0E, this.A0H);
        }
    }

    private final XH A02(XG[] xgArr, HT ht, InterfaceC0356Ab interfaceC0356Ab, IN in) {
        return new E3(xgArr, ht, interfaceC0356Ab, in);
    }

    private void A0E() {
        TextureView textureView = this.A05;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.A0G) {
                Log.w(A07(0, 15, 68), A07(15, 49, 96));
            } else {
                this.A05.setSurfaceTextureListener(null);
            }
            this.A05 = null;
        }
        SurfaceHolder surfaceHolder = this.A04;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.A0G);
            this.A04 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G(@Nullable Surface surface, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (XG xg : this.A0N) {
            int iA7i = xg.A7i();
            String[] strArr = A0P;
            if (strArr[5].charAt(24) == strArr[4].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0P;
            strArr2[6] = "VrJ3McZcw7cn2zeT";
            strArr2[0] = "MNepmlV8OvsHi61EfIBswCx5NcPOIPrl";
            if (iA7i == 2) {
                arrayList.add(this.A0F.A4L(xg).A06(1).A07(surface).A05());
            }
        }
        Surface surface2 = this.A03;
        if (surface2 != null && surface2 != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C0373As) it.next()).A0C();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (this.A0D) {
                this.A03.release();
            }
        }
        this.A03 = surface;
        if (A0P[7].charAt(22) != 'V') {
            throw new RuntimeException();
        }
        String[] strArr3 = A0P;
        strArr3[5] = "BcNzrhvciYYCifYD3J0kGNpt4Q56t2ws";
        strArr3[4] = "LBzJc3KMaCoazXjGhEegCXyOf3paMmXp";
        this.A0D = z;
    }

    private final void A0I(EJ ej) {
        this.A0J.add(ej);
    }

    public final int A0J() {
        return this.A01;
    }

    public final Format A0K() {
        return this.A06;
    }

    @Nullable
    public final Format A0L() {
        return this.A07;
    }

    public final void A0M() {
        AF4(false);
    }

    public final void A0N(float f) {
        this.A00 = f;
        for (XG xg : this.A0N) {
            String[] strArr = A0P;
            if (strArr[5].charAt(24) == strArr[4].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0P;
            strArr2[6] = "TZ1OBcEbhXggSiRE";
            strArr2[0] = "o47SCfAcsD46THYYRPii4HELThPbmwG8";
            if (xg.A7i() == 1) {
                this.A0F.A4L(xg).A06(2).A07(Float.valueOf(f)).A05();
            }
        }
    }

    public final void A0O(@Nullable Surface surface) {
        A0E();
        A0G(surface, false);
    }

    public final void A0P(InterfaceC0466Fa interfaceC0466Fa) {
        ADH(interfaceC0466Fa, true, true);
    }

    public final void A0Q(JE je) {
        this.A0M.add(je);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0370Ap
    public final void A3E(InterfaceC0365Ak interfaceC0365Ak) {
        this.A0F.A3E(interfaceC0365Ak);
    }

    @Override // com.facebook.ads.redexgen.X.XH
    public final C0373As A4L(InterfaceC0372Ar interfaceC0372Ar) {
        return this.A0F.A4L(interfaceC0372Ar);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0370Ap
    public final int A5r() {
        return this.A0F.A5r();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0370Ap
    public final long A5s() {
        return this.A0F.A5s();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0370Ap
    public final long A6A() {
        return this.A0F.A6A();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0370Ap
    public final int A6C() {
        return this.A0F.A6C();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0370Ap
    public final int A6D() {
        return this.A0F.A6D();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0370Ap
    public final long A6F() {
        return this.A0F.A6F();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0370Ap
    public final B1 A6H() {
        return this.A0F.A6H();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0370Ap
    public final int A6I() {
        return this.A0F.A6I();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0370Ap
    public final long A6R() {
        return this.A0F.A6R();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0370Ap
    public final boolean A7D() {
        return this.A0F.A7D();
    }

    @Override // com.facebook.ads.redexgen.X.XH
    public final void ADH(InterfaceC0466Fa interfaceC0466Fa, boolean z, boolean z2) {
        InterfaceC0466Fa interfaceC0466Fa2 = this.A0B;
        if (interfaceC0466Fa2 != interfaceC0466Fa) {
            if (interfaceC0466Fa2 != null) {
                interfaceC0466Fa2.ADv(this.A0H);
                this.A0H.A07();
            }
            interfaceC0466Fa.A3C(this.A0E, this.A0H);
            this.A0B = interfaceC0466Fa;
        }
        this.A0F.ADH(interfaceC0466Fa, z, z2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0370Ap
    public final void ADm() {
        this.A0F.ADm();
        A0E();
        Surface surface = this.A03;
        if (surface != null) {
            if (this.A0D) {
                surface.release();
            }
            this.A03 = null;
        }
        InterfaceC0466Fa interfaceC0466Fa = this.A0B;
        if (interfaceC0466Fa != null) {
            interfaceC0466Fa.ADv(this.A0H);
        }
        this.A0C = Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0370Ap
    public final void AEN(long j) {
        this.A0H.A06();
        this.A0F.AEN(j);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0370Ap
    public final void AEO() {
        this.A0H.A06();
        this.A0F.AEO();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0370Ap
    public final void AEe(boolean z) {
        this.A0F.AEe(z);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0370Ap
    public final void AF4(boolean z) {
        this.A0F.AF4(z);
        InterfaceC0466Fa interfaceC0466Fa = this.A0B;
        if (interfaceC0466Fa != null) {
            interfaceC0466Fa.ADv(this.A0H);
            this.A0B = null;
            this.A0H.A07();
        }
        this.A0C = Collections.emptyList();
        String[] strArr = A0P;
        if (strArr[6].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0P;
        strArr2[5] = "8NqoZsSfBCZ1v43okD4Pix8d8oY1Moxp";
        strArr2[4] = "VfYOa1CKuZhM9jsFhHY6jw4UB0OoLmrV";
    }
}
