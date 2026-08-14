package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class X9 implements BY {
    public static boolean A0p;
    public static boolean A0q;
    public static byte[] A0r;
    public static String[] A0s = {"5Nyv0guRYVcKSAuezGPcUxg9vJAOBGI4", "vvUbbcGamjazB6O7sNKlV2Due1EGN4h1", "bCdq7Y65nqLa7O1PpyZ9UmfFfim1tIKH", "XSMaSGyqY735xp0uf5mX1ioiT5AfU73", "LbuXdG3g6wlkS0wgubrQcd1EFcxL1vaW", "BfdFnDj7fdcaZnnCNK5XWBslzsEwyMTC", "82TROEAjyC6M053XP3PwF3IgkAnZSWb8", "TH4S9e3rxD8emXavfeipeAwkF3kWLOvQ"};
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public AudioTrack A0M;

    @Nullable
    public AudioTrack A0N;

    @Nullable
    public C0362Ah A0O;
    public C0362Ah A0P;
    public BD A0Q;

    @Nullable
    public BW A0R;

    @Nullable
    public ByteBuffer A0S;

    @Nullable
    public ByteBuffer A0T;

    @Nullable
    public ByteBuffer A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public byte[] A0c;
    public BL[] A0d;
    public ByteBuffer[] A0e;
    public final ConditionVariable A0f;

    @Nullable
    public final BE A0g;
    public final C0384Be A0h;
    public final XC A0i;
    public final InterfaceC0387Bh A0j;
    public final X3 A0k;
    public final ArrayDeque<C0389Bj> A0l;
    public final boolean A0m;
    public final BL[] A0n;
    public final BL[] A0o;

    public static String A0I(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0r, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 75);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0O() {
        A0r = new byte[]{68, 72, Ascii.SI, 7, Ascii.FS, 72, 94, 106, 123, 118, 112, 75, 109, 126, 124, 116, 78, 99, 121, 105, 101, 100, 126, 99, 100, 127, 99, 126, 115, 42, 110, 111, 126, 111, 105, 126, 111, 110, 42, 81, 111, 114, 122, 111, 105, 126, 111, 110, 42, Ascii.SO, Ascii.SYN, 9, 4, 9, 1, 8, 63, 41, 63, 46, 46, 51, 52, 61, 122, 41, 46, 59, 54, 54, 63, 62, 122, 59, 47, 62, 51, 53, 122, 46, 40, 59, 57, 49, 102, 93, 86, 75, 67, 86, 80, 71, 86, 87, 19, 82, 70, 87, 90, 92, 19, 86, 93, 80, 92, 87, 90, 93, 84, 9, 19, 96, 91, 70, 64, 69, 69, 90, 71, 65, 80, 81, Ascii.NAK, 86, 93, 84, 91, 91, 80, 89, Ascii.NAK, 86, 90, 64, 91, 65, Ascii.SI, Ascii.NAK, 101, 10, 3, Ascii.US, Ascii.CAN, 9, Ascii.RS, 59, 40, 58, 40};
    }

    static {
        A0O();
        A0p = false;
        A0q = false;
    }

    public X9(@Nullable BE be, InterfaceC0387Bh interfaceC0387Bh, boolean z) {
        this.A0g = be;
        this.A0j = (InterfaceC0387Bh) IK.A01(interfaceC0387Bh);
        this.A0m = z;
        this.A0f = new ConditionVariable(true);
        this.A0h = new C0384Be(new XA(this, null));
        this.A0i = new XC();
        this.A0k = new X3();
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new X6(), this.A0i, this.A0k);
        Collections.addAll(arrayList, interfaceC0387Bh.A5l());
        this.A0o = (BL[]) arrayList.toArray(new BL[arrayList.size()]);
        this.A0n = new BL[]{new X8()};
        this.A00 = 1.0f;
        this.A0D = 0;
        this.A0Q = BD.A04;
        this.A01 = 0;
        this.A0P = C0362Ah.A04;
        this.A04 = -1;
        this.A0d = new BL[0];
        this.A0e = new ByteBuffer[0];
        this.A0l = new ArrayDeque<>();
    }

    public X9(@Nullable BE be, BL[] blArr) {
        this(be, blArr, false);
    }

    public X9(@Nullable BE be, BL[] blArr, boolean z) {
        this(be, new XB(blArr), z);
    }

    public static int A00(int i, ByteBuffer byteBuffer) {
        if (i == 7 || i == 8) {
            return C0391Bl.A00(byteBuffer);
        }
        if (i == 5) {
            return BA.A00();
        }
        if (i == 6) {
            return BA.A03(byteBuffer);
        }
        if (i == 14) {
            int iA02 = BA.A02(byteBuffer);
            if (iA02 == -1) {
                return 0;
            }
            int iA04 = BA.A04(byteBuffer, iA02);
            String[] strArr = A0s;
            if (strArr[5].charAt(2) != strArr[2].charAt(2)) {
                throw new RuntimeException();
            }
            A0s[3] = "Dqt88CMr8vwwAc3fZIJcRVt2XyhD8Cl";
            return iA04 * 16;
        }
        throw new IllegalStateException(A0I(84, 27, 120) + i);
    }

    @TargetApi(21)
    public static int A01(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    @TargetApi(21)
    private int A02(AudioTrack audioTrack, ByteBuffer byteBuffer, int i, long j) {
        if (this.A0S == null) {
            this.A0S = ByteBuffer.allocate(16);
            this.A0S.order(ByteOrder.BIG_ENDIAN);
            this.A0S.putInt(1431633921);
        }
        if (this.A03 == 0) {
            this.A0S.putInt(4, i);
            this.A0S.putLong(8, 1000 * j);
            this.A0S.position(0);
            this.A03 = i;
        }
        int iRemaining = this.A0S.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.A0S, iRemaining, 1);
            if (iWrite < 0) {
                this.A03 = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iA01 = A01(audioTrack, byteBuffer, i);
        String[] strArr = A0s;
        if (strArr[4].charAt(9) == strArr[1].charAt(9)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0s;
        strArr2[5] = "EGdI4VK4aN1uiBzzsuaeFo7lQ03tB7Gh";
        strArr2[2] = "vodoofn0TiYpLi76FRuwTlDh379TFVaK";
        if (iA01 < 0) {
            this.A03 = 0;
            return iA01;
        }
        this.A03 -= iA01;
        return iA01;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A03() {
        return this.A0X ? this.A0J / ((long) this.A0B) : this.A0I;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A04() {
        return this.A0X ? this.A0L / ((long) this.A09) : this.A0K;
    }

    private long A05(long j) {
        return A08(this.A0j.A7V()) + j;
    }

    private long A06(long j) {
        C0389Bj c0389BjRemove = null;
        while (!this.A0l.isEmpty() && j >= this.A0l.getFirst().A01) {
            c0389BjRemove = this.A0l.remove();
        }
        if (c0389BjRemove != null) {
            this.A0P = c0389BjRemove.A02;
            this.A0G = c0389BjRemove.A01;
            this.A0F = c0389BjRemove.A00 - this.A0H;
        }
        if (this.A0P.A01 == 1.0f) {
            return (this.A0F + j) - this.A0G;
        }
        if (this.A0l.isEmpty()) {
            return this.A0F + this.A0j.A6y(j - this.A0G);
        }
        return this.A0F + C0567Iz.A0C(j - this.A0G, this.A0P.A01);
    }

    private long A07(long j) {
        return (((long) this.A0A) * j) / 1000000;
    }

    private long A08(long j) {
        return (1000000 * j) / ((long) this.A0A);
    }

    private long A09(long j) {
        return (1000000 * j) / ((long) this.A06);
    }

    @TargetApi(21)
    private AudioTrack A0D() {
        AudioAttributes audioAttributesA00;
        if (this.A0b) {
            audioAttributesA00 = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        } else {
            audioAttributesA00 = this.A0Q.A00();
        }
        AudioFormat audioFormatBuild = new AudioFormat.Builder().setChannelMask(this.A07).setEncoding(this.A08).setSampleRate(this.A0A).build();
        int i = this.A01;
        if (i == 0) {
            i = 0;
        }
        return new AudioTrack(audioAttributesA00, audioFormatBuild, this.A02, 1, i);
    }

    private AudioTrack A0E() throws BV {
        AudioTrack audioTrack;
        if (C0567Iz.A02 >= 21) {
            audioTrack = A0D();
        } else {
            int iA03 = C0567Iz.A03(this.A0Q.A03);
            int i = this.A01;
            String[] strArr = A0s;
            String str = strArr[4];
            String str2 = strArr[1];
            int state = str.charAt(9);
            if (state == str2.charAt(9)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[4] = "uEqtixTroQ47jvhgXsjygxp317gkhCVZ";
            strArr2[1] = "MeWTB72qJhBmjPGmSmxXQDSK14yx53vJ";
            if (i == 0) {
                audioTrack = new AudioTrack(iA03, this.A0A, this.A07, this.A08, this.A02, 1);
            } else {
                audioTrack = new AudioTrack(iA03, this.A0A, this.A07, this.A08, this.A02, 1, i);
            }
        }
        int state2 = audioTrack.getState();
        if (state2 == 1) {
            return audioTrack;
        }
        try {
            audioTrack.release();
        } catch (Exception unused) {
        }
        throw new BV(state2, this.A0A, this.A07, this.A02);
    }

    private AudioTrack A0F(int i) {
        return new AudioTrack(3, 4000, 4, 2, 2, 0, i);
    }

    private void A0J() {
        int i = 0;
        while (true) {
            BL[] blArr = this.A0d;
            if (i < blArr.length) {
                BL bl = blArr[i];
                bl.flush();
                this.A0e[i] = bl.A73();
                i++;
            } else {
                return;
            }
        }
    }

    private void A0K() throws BV {
        C0362Ah c0362AhA3Q;
        this.A0f.block();
        this.A0M = A0E();
        int audioSessionId = this.A0M.getAudioSessionId();
        if (A0p && C0567Iz.A02 < 21) {
            AudioTrack audioTrack = this.A0N;
            if (audioTrack != null) {
                int audioSessionId2 = audioTrack.getAudioSessionId();
                String[] strArr = A0s;
                if (strArr[4].charAt(9) == strArr[1].charAt(9)) {
                    throw new RuntimeException();
                }
                A0s[7] = "BXErtyYgJXamt9yde7CeLqS26Q9j6Dt3";
                if (audioSessionId != audioSessionId2) {
                    A0L();
                }
            }
            if (this.A0N == null) {
                this.A0N = A0F(audioSessionId);
            }
        }
        if (this.A01 != audioSessionId) {
            this.A01 = audioSessionId;
            BW bw = this.A0R;
            if (bw != null) {
                bw.AA8(audioSessionId);
            }
        }
        if (this.A0V) {
            c0362AhA3Q = this.A0j.A3Q(this.A0P);
        } else {
            c0362AhA3Q = C0362Ah.A04;
        }
        this.A0P = c0362AhA3Q;
        A0N();
        this.A0h.A0G(this.A0M, this.A08, this.A09, this.A02);
        A0M();
    }

    private void A0L() {
        if (this.A0N == null) {
            return;
        }
        AudioTrack audioTrack = this.A0N;
        this.A0N = null;
        new C0386Bg(this, audioTrack).start();
    }

    private void A0M() {
        if (!A0U()) {
            return;
        }
        if (C0567Iz.A02 >= 21) {
            AudioTrack audioTrack = this.A0M;
            float f = this.A00;
            if (A0s[3].length() != 31) {
                throw new RuntimeException();
            }
            A0s[7] = "8NL9PZoDB9Ch1WQJQaXfXaVAIVHPoweZ";
            A0Q(audioTrack, f);
            return;
        }
        A0R(this.A0M, this.A00);
    }

    private void A0N() {
        ArrayList arrayList = new ArrayList();
        for (BL bl : A0V()) {
            if (bl.A8N()) {
                arrayList.add(bl);
            } else {
                bl.flush();
            }
        }
        int size = arrayList.size();
        BL[] blArr = new BL[size];
        if (A0s[3].length() != 31) {
            throw new RuntimeException();
        }
        String[] strArr = A0s;
        strArr[5] = "YRdEguSYP1wOqJMzR8T0sEbN9ru3F1GF";
        strArr[2] = "jCd7Ib2fALhdhS4xedSLoMHgXMVbMQ2Z";
        this.A0d = (BL[]) arrayList.toArray(blArr);
        this.A0e = new ByteBuffer[size];
        A0J();
    }

    private void A0P(long j) throws BX {
        ByteBuffer input;
        int length = this.A0d.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                input = this.A0e[i - 1];
            } else {
                input = this.A0T;
                if (input == null) {
                    input = BL.A00;
                }
            }
            if (i == length) {
                A0S(input, j);
            } else {
                BL audioProcessor = this.A0d[i];
                audioProcessor.ADV(input);
                ByteBuffer byteBufferA73 = audioProcessor.A73();
                this.A0e[i] = byteBufferA73;
                if (byteBufferA73.hasRemaining()) {
                    i++;
                }
            }
            if (input.hasRemaining()) {
                return;
            } else {
                i--;
            }
        }
    }

    @TargetApi(21)
    public static void A0Q(AudioTrack audioTrack, float f) {
        audioTrack.setVolume(f);
    }

    public static void A0R(AudioTrack audioTrack, float f) {
        audioTrack.setStereoVolume(f, f);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0S(java.nio.ByteBuffer r12, long r13) throws com.facebook.ads.redexgen.X.BX {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.X9.A0S(java.nio.ByteBuffer, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A0T() throws com.facebook.ads.redexgen.X.BX {
        /*
            r9 = this;
            r5 = 0
            int r0 = r9.A04
            r6 = -1
            r8 = 0
            if (r0 != r6) goto Lf
            boolean r0 = r9.A0Z
            if (r0 == 0) goto L54
            r0 = 0
        Lc:
            r9.A04 = r0
            r5 = 1
        Lf:
            int r4 = r9.A04
            com.facebook.ads.redexgen.X.BL[] r1 = r9.A0d
            int r0 = r1.length
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 1
            if (r4 >= r0) goto L5e
            r0 = r1[r4]
            if (r5 == 0) goto L23
            r0.ADU()
        L23:
            r9.A0P(r2)
            boolean r3 = r0.A8R()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.X9.A0s
            r0 = 4
            r1 = r2[r0]
            r0 = 1
            r2 = r2[r0]
            r0 = 9
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L58
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.X9.A0s
            java.lang.String r1 = "2xZTToEoCwsl8MeSQ9EIUdCBiuq4j6Lb"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "WXli42TSAlQlgSv7suJf6xw7W0hHNYE8"
            r0 = 1
            r2[r0] = r1
            if (r3 != 0) goto L4d
            return r8
        L4d:
            r5 = 1
            int r0 = r9.A04
            int r0 = r0 + r7
            r9.A04 = r0
            goto Lf
        L54:
            com.facebook.ads.redexgen.X.BL[] r0 = r9.A0d
            int r0 = r0.length
            goto Lc
        L58:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L5e:
            java.nio.ByteBuffer r5 = r9.A0U
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.X9.A0s
            r0 = 3
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 31
            if (r1 == r0) goto L77
            if (r5 == 0) goto L86
        L6f:
            r9.A0S(r5, r2)
            java.nio.ByteBuffer r0 = r9.A0U
            if (r0 == 0) goto L86
            return r8
        L77:
            java.lang.String[] r4 = com.facebook.ads.redexgen.X.X9.A0s
            java.lang.String r1 = "9QdkqYSTFHb7WYiPiRp7Y6nS2TP2i0It"
            r0 = 5
            r4[r0] = r1
            java.lang.String r1 = "gIdgEUZyaZheDXAdPlxJ5YfvFSsVsGnk"
            r0 = 2
            r4[r0] = r1
            if (r5 == 0) goto L86
            goto L6f
        L86:
            r9.A04 = r6
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.X9.A0T():boolean");
    }

    private boolean A0U() {
        return this.A0M != null;
    }

    private BL[] A0V() {
        if (this.A0a) {
            return this.A0n;
        }
        return this.A0o;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f1 A[PHI: r5
      0x00f1: PHI (r5v2 int) = (r5v0 int), (r5v3 int) binds: [B:76:0x0163, B:53:0x00ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0166  */
    @Override // com.facebook.ads.redexgen.X.BY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A46(int r12, int r13, int r14, int r15, @androidx.annotation.Nullable int[] r16, int r17, int r18) throws com.facebook.ads.redexgen.X.BU {
        /*
            Method dump skipped, instruction units count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.X9.A46(int, int, int, int, int[], int, int):void");
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A4o() {
        if (this.A0b) {
            this.A0b = false;
            this.A01 = 0;
            reset();
        }
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A5B(int i) {
        IK.A04(C0567Iz.A02 >= 21);
        if (!this.A0b || this.A01 != i) {
            this.A0b = true;
            this.A01 = i;
            reset();
        }
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final long A6G(boolean z) {
        if (!A0U() || this.A0D == 0) {
            return Long.MIN_VALUE;
        }
        return this.A0H + A05(A06(Math.min(this.A0h.A0C(z), A08(A04()))));
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final C0362Ah A7E() {
        return this.A0P;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0173  */
    @Override // com.facebook.ads.redexgen.X.BY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A7v(java.nio.ByteBuffer r20, long r21) throws com.facebook.ads.redexgen.X.BV, com.facebook.ads.redexgen.X.BX {
        /*
            Method dump skipped, instruction units count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.X9.A7v(java.nio.ByteBuffer, long):boolean");
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A7y() {
        if (this.A0D == 1) {
            this.A0D = 2;
        }
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final boolean A83() {
        return A0U() && this.A0h.A0J(A04());
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final boolean A8Q(int i) {
        if (C0567Iz.A0c(i)) {
            return i != 4 || C0567Iz.A02 >= 21;
        }
        BE be = this.A0g;
        return be != null && be.A04(i);
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final boolean A8R() {
        return !A0U() || (this.A0W && !A83());
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void ADE() {
        this.A0Y = true;
        if (A0U()) {
            this.A0h.A0E();
            AudioTrack audioTrack = this.A0M;
            if (A0s[3].length() != 31) {
                throw new RuntimeException();
            }
            A0s[3] = "NrYH7da7InJYZ7DcifiCDIWgHy9XttZ";
            audioTrack.play();
        }
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void ADF() throws BX {
        if (this.A0W) {
            return;
        }
        boolean zA0U = A0U();
        String[] strArr = A0s;
        if (strArr[6].charAt(18) != strArr[0].charAt(18)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0s;
        strArr2[6] = "potoNIjJr8c5PhhOHWP3V8xbrUltb98O";
        strArr2[0] = "s7h49TBBG9Upv5zOzLPi805BwVxtpEdY";
        if (zA0U && A0T()) {
            this.A0h.A0F(A04());
            this.A0M.stop();
            this.A03 = 0;
            this.A0W = true;
        }
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void ADm() {
        reset();
        A0L();
        for (BL bl : this.A0o) {
            bl.reset();
            if (A0s[3].length() != 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0s;
            strArr[5] = "qwdTDv5zTd3QZESqVqPfOIKdJj7Lz8kg";
            strArr[2] = "LbdTDWALSGuogzF76GUONHDiI7JL2ED4";
        }
        for (BL bl2 : this.A0n) {
            bl2.reset();
        }
        this.A01 = 0;
        this.A0Y = false;
        if (A0s[7].charAt(5) != 'v') {
            A0s[3] = "7yJp0zMcRreZgWUPzTirOlbpECU1qPL";
            return;
        }
        String[] strArr2 = A0s;
        strArr2[5] = "IJdzF7l1OUCqcHSZRNfx63TpictB3CeC";
        strArr2[2] = "IidC6PogfV1YW6p29FProDWayU60rDbu";
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void AEU(BD bd) {
        if (this.A0Q.equals(bd)) {
            return;
        }
        this.A0Q = bd;
        if (this.A0b) {
            return;
        }
        reset();
        this.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void AEb(BW bw) {
        this.A0R = bw;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final C0362Ah AEf(C0362Ah c0362Ah) {
        if (A0U() && !this.A0V) {
            this.A0P = C0362Ah.A04;
            return this.A0P;
        }
        C0362Ah c0362Ah2 = this.A0O;
        if (c0362Ah2 == null) {
            if (!this.A0l.isEmpty()) {
                c0362Ah2 = this.A0l.getLast().A02;
            } else {
                c0362Ah2 = this.A0P;
            }
        }
        if (!c0362Ah.equals(c0362Ah2)) {
            if (A0U()) {
                this.A0O = c0362Ah;
            } else {
                this.A0P = this.A0j.A3Q(c0362Ah);
            }
        }
        return this.A0P;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void pause() {
        this.A0Y = false;
        if (A0U() && this.A0h.A0I()) {
            this.A0M.pause();
        }
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void reset() {
        if (A0U()) {
            this.A0J = 0L;
            this.A0I = 0L;
            this.A0L = 0L;
            this.A0K = 0L;
            this.A05 = 0;
            C0362Ah c0362Ah = this.A0O;
            if (c0362Ah != null) {
                this.A0P = c0362Ah;
                this.A0O = null;
            } else if (!this.A0l.isEmpty()) {
                ArrayDeque<C0389Bj> arrayDeque = this.A0l;
                if (A0s[7].charAt(5) == 'v') {
                    throw new RuntimeException();
                }
                A0s[7] = "7Zd0LJuJ8v1AsDIGeh9Ten8e10sO09Lx";
                this.A0P = arrayDeque.getLast().A02;
            }
            this.A0l.clear();
            this.A0F = 0L;
            this.A0G = 0L;
            this.A0T = null;
            this.A0U = null;
            A0J();
            this.A0W = false;
            this.A04 = -1;
            this.A0S = null;
            this.A03 = 0;
            this.A0D = 0;
            if (this.A0h.A0H()) {
                this.A0M.pause();
            }
            AudioTrack audioTrack = this.A0M;
            this.A0M = null;
            this.A0h.A0D();
            this.A0f.close();
            new C0385Bf(this, audioTrack).start();
        }
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void setVolume(float f) {
        if (this.A00 != f) {
            this.A00 = f;
            A0M();
        }
    }
}
