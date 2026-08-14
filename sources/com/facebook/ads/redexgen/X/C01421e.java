package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.Format;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@TargetApi(16)
public final class C01421e extends C3G implements InterfaceC0542Ia {
    public static byte[] A0E;
    public static String[] A0F = {"aLXIjAOeq43kD47uUx47KIQfBztZ5JR6", "bYDvuG1CO7Q3NDumZhhBhB8jHe", "lzauC9VKCpzgBdv7KHug0xPju0EyyDRc", "zBmjWuq", "FwqFg", "FmVSMSIXQUSd0OcxsELVimAN3SmZwHxI", "I9K2sHUvqtNZm1Rj9xJMtQcmEPzsJytW", "SRtBuggTCbvw2MXSYfok3SEL95E53gc0"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public MediaFormat A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final Context A0B;
    public final BS A0C;
    public final BY A0D;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 16);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A0E = new byte[]{7, 5, Ascii.DLE, 102, Ascii.ESC, Ascii.CR, Ascii.VT, 102, 41, 41, 43, 102, 44, 45, 43, 65, 67, 86, 32, 105, 97, 97, 105, 98, 107, 32, 124, 111, 121, 32, 106, 107, 109, 97, 106, 107, 124, 54, 57, 51, 37, 56, 62, 51, 121, 36, 56, 49, 35, 32, 54, 37, 50, 121, 59, 50, 54, 57, 53, 54, 52, 60, 64, 84, 69, 72, 78, Ascii.SO, 83, 64, 86, Ascii.CAN, 19, Ascii.SUB, Ascii.NAK, Ascii.NAK, Ascii.RS, Ascii.ETB, 86, Ascii.CAN, Ascii.DC4, Ascii.SO, Ascii.NAK, Ascii.SI, 63, 50, 37, 56, 59, 35, 50, 76, 65, 86, 75, 85, 72, 80, 65, 95, 83, 74, Ascii.US, 91, 92, 66, 71, 70, Ascii.US, 65, 91, 72, 87, 70, 66, 70, 78, 48, 50, 41, 47, 50, 41, 52, 57, 121, 107, 103, 122, 102, 111, 39, 120, 107, 126, 111, 70, 84, 88, 70, 64, 91, 82, 5, Ascii.SUB, Ascii.CR, Ascii.DLE, Ascii.EM, 19, Ascii.VT, Ascii.SUB};
    }

    static {
        A06();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.CM != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public C01421e(Context context, E6 e6, @Nullable CM<C0919Ww> cm, boolean z, @Nullable Handler handler, @Nullable BT bt, @Nullable BE be, BL... blArr) {
        this(context, e6, cm, z, handler, bt, new X9(be, blArr));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.CM != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public C01421e(Context context, E6 e6, @Nullable CM<C0919Ww> cm, boolean z, @Nullable Handler handler, @Nullable BT bt, BY by) {
        super(1, e6, cm, z);
        this.A0B = context.getApplicationContext();
        this.A0D = by;
        this.A0C = new BS(handler, bt);
        by.AEb(new X7(this));
    }

    private int A00(E0 e0, Format format) {
        PackageManager packageManager;
        if (C0567Iz.A02 < 24) {
            if (A04(15, 22, 30).equals(e0.A02)) {
                boolean z = true;
                if (C0567Iz.A02 == 23 && (packageManager = this.A0B.getPackageManager()) != null && packageManager.hasSystemFeature(A04(37, 25, 71))) {
                    z = false;
                }
                if (z) {
                    return -1;
                }
            }
        }
        return format.A09;
    }

    private final int A01(E0 e0, Format format, Format[] formatArr) {
        return A00(e0, format);
    }

    @SuppressLint({"InlinedApi"})
    private final MediaFormat A02(Format format, String str, int i) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(A04(113, 4, 59), str);
        mediaFormat.setInteger(A04(71, 13, 107), format.A05);
        mediaFormat.setInteger(A04(125, 11, 26), format.A0C);
        EC.A06(mediaFormat, format.A0P);
        EC.A04(mediaFormat, A04(99, 14, 34), i);
        if (C0567Iz.A02 >= 23) {
            mediaFormat.setInteger(A04(117, 8, 80), 0);
        }
        return mediaFormat;
    }

    private void A05() {
        long jA6G = this.A0D.A6G(A8R());
        if (jA6G != Long.MIN_VALUE) {
            if (!this.A08) {
                jA6G = Math.max(this.A05, jA6G);
            }
            this.A05 = jA6G;
            this.A08 = false;
        }
    }

    public static boolean A08(String str) {
        if (C0567Iz.A02 < 24 && A04(0, 15, 88).equals(str)) {
            if (A04(136, 7, 37).equals(C0567Iz.A05) && (C0567Iz.A03.startsWith(A04(143, 8, FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION)) || C0567Iz.A03.startsWith(A04(84, 7, 71)) || C0567Iz.A03.startsWith(A04(91, 8, 52)))) {
                return true;
            }
        }
        return false;
    }

    private final boolean A09(String str) {
        int iA00 = C0544Ic.A00(str);
        if (iA00 != 0) {
            boolean zA8Q = this.A0D.A8Q(iA00);
            if (A0F[5].charAt(2) != 'V') {
                throw new RuntimeException();
            }
            A0F[1] = "OP";
            if (zA8Q) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.C3G, com.facebook.ads.redexgen.X.E4
    public final void A12() {
        try {
            this.A0D.ADm();
            try {
                super.A12();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.A12();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3G, com.facebook.ads.redexgen.X.E4
    public final void A13() {
        super.A13();
        this.A0D.ADE();
    }

    @Override // com.facebook.ads.redexgen.X.C3G, com.facebook.ads.redexgen.X.E4
    public final void A14() {
        A05();
        this.A0D.pause();
        super.A14();
    }

    @Override // com.facebook.ads.redexgen.X.C3G, com.facebook.ads.redexgen.X.E4
    public final void A15(long j, boolean z) throws AM {
        super.A15(j, z);
        this.A0D.reset();
        this.A05 = j;
        this.A07 = true;
        this.A08 = true;
    }

    @Override // com.facebook.ads.redexgen.X.C3G, com.facebook.ads.redexgen.X.E4
    public final void A16(boolean z) throws AM {
        super.A16(z);
        this.A0C.A05(this.A0U);
        int i = A11().A00;
        if (i != 0) {
            this.A0D.A5B(i);
        } else {
            this.A0D.A4o();
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final int A1A(MediaCodec mediaCodec, E0 e0, Format format, Format format2) {
        return 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.CM != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    /* JADX WARN: Incorrect condition in loop: B:30:0x0074 */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e5  */
    @Override // com.facebook.ads.redexgen.X.C3G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A1B(com.facebook.ads.redexgen.X.E6 r15, com.facebook.ads.redexgen.X.CM<com.facebook.ads.redexgen.X.C0919Ww> r16, com.facebook.ads.internal.exoplayer2.Format r17) throws com.facebook.ads.redexgen.X.E9 {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C01421e.A1B(com.facebook.ads.redexgen.X.E6, com.facebook.ads.redexgen.X.CM, com.facebook.ads.internal.exoplayer2.Format):int");
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final E0 A1E(E6 e6, Format format, boolean z) throws E9 {
        E0 e0A79;
        if (A09(format.A0O) && (e0A79 = e6.A79()) != null) {
            return e0A79;
        }
        return super.A1E(e6, format, z);
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final void A1H() throws AM {
        try {
            this.A0D.ADF();
        } catch (BX e) {
            throw AM.A01(e, A0y());
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final void A1K(MediaCodec mediaCodec, MediaFormat mediaFormat) throws AM {
        int i;
        int[] iArr;
        int i2;
        MediaFormat mediaFormat2 = this.A06;
        if (mediaFormat2 != null) {
            i = C0544Ic.A00(mediaFormat2.getString(A04(113, 4, 59)));
            mediaFormat = this.A06;
        } else {
            i = this.A04;
        }
        int integer = mediaFormat.getInteger(A04(71, 13, 107));
        int integer2 = mediaFormat.getInteger(A04(125, 11, 26));
        if (this.A09 && integer == 6 && (i2 = this.A00) < 6) {
            iArr = new int[i2];
            for (int i3 = 0; i3 < this.A00; i3++) {
                iArr[i3] = i3;
            }
        } else {
            iArr = null;
        }
        try {
            this.A0D.A46(i, integer, integer2, 0, iArr, this.A02, this.A03);
        } catch (BU e) {
            throw AM.A01(e, A0y());
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final void A1L(Format format) throws AM {
        int i;
        super.A1L(format);
        this.A0C.A03(format);
        if (A04(62, 9, 49).equals(format.A0O)) {
            i = format.A0A;
        } else {
            i = 2;
        }
        this.A04 = i;
        this.A00 = format.A05;
        this.A02 = format.A06;
        this.A03 = format.A07;
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final void A1M(X2 x2) {
        if (this.A07 && !x2.A03()) {
            if (Math.abs(x2.A00 - this.A05) > 500000) {
                this.A05 = x2.A00;
            }
            this.A07 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final void A1N(E0 e0, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) {
        this.A01 = A01(e0, format, A19());
        this.A09 = A08(e0.A02);
        this.A0A = e0.A04;
        MediaFormat mediaFormatA02 = A02(format, e0.A01 == null ? A04(62, 9, 49) : e0.A01, this.A01);
        mediaCodec.configure(mediaFormatA02, (Surface) null, mediaCrypto, 0);
        if (this.A0A) {
            this.A06 = mediaFormatA02;
            this.A06.setString(A04(113, 4, 59), format.A0O);
        } else {
            this.A06 = null;
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final void A1O(String str, long j, long j2) {
        this.A0C.A06(str, j, j2);
    }

    @Override // com.facebook.ads.redexgen.X.C3G
    public final boolean A1P(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws AM {
        if (this.A0A && (i2 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        }
        if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.A0U.A08++;
            this.A0D.A7y();
            return true;
        }
        try {
            if (!this.A0D.A7v(byteBuffer, j3)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i, false);
            this.A0U.A06++;
            return true;
        } catch (BV | BX e) {
            throw AM.A01(e, A0y());
        }
    }

    @Override // com.facebook.ads.redexgen.X.E4, com.facebook.ads.redexgen.X.XG
    public final InterfaceC0542Ia A6w() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0542Ia
    public final C0362Ah A7E() {
        return this.A0D.A7E();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0542Ia
    public final long A7H() {
        if (A7W() == 2) {
            A05();
        }
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.E4, com.facebook.ads.redexgen.X.InterfaceC0372Ar
    public final void A7z(int i, Object obj) throws AM {
        if (i != 2) {
            if (i != 3) {
                super.A7z(i, obj);
                return;
            } else {
                this.A0D.AEU((BD) obj);
                return;
            }
        }
        BY by = this.A0D;
        if (A0F[7].charAt(17) == 'P') {
            throw new RuntimeException();
        }
        A0F[4] = "awvXiH99cLu1HaadjiPENScqQYAeI";
        by.setVolume(((Float) obj).floatValue());
    }

    @Override // com.facebook.ads.redexgen.X.C3G, com.facebook.ads.redexgen.X.XG
    public final boolean A8R() {
        return super.A8R() && this.A0D.A8R();
    }

    @Override // com.facebook.ads.redexgen.X.C3G, com.facebook.ads.redexgen.X.XG
    public final boolean A8c() {
        return this.A0D.A83() || super.A8c();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0542Ia
    public final C0362Ah AEf(C0362Ah c0362Ah) {
        return this.A0D.AEf(c0362Ah);
    }
}
