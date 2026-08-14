package com.facebook.ads.redexgen.X;

import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.drive.MetadataChangeSet;
import cz.msebera.android.httpclient.HttpStatus;
import cz.msebera.android.httpclient.message.TokenParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.32, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass32 extends AbstractC0394Bo {
    public static byte[] A0C;
    public static String[] A0D = {"23YoP", "C5PaKb5CuNZ88jAQuKda3Ijqs42X0e51", "UjAKU", "ig9eEatozIbUeilu6P8PDlGI40FLnJQN", "3", "3yPqbEimTjK1Te0jzRxw8Mq4WDJCEE6c", "iulf573S2lPMND7gJrZX6jdv4yAWs7sY", "6"};
    public static final int[] A0E;
    public static final int[] A0F;
    public static final int[] A0G;
    public static final int[] A0H;
    public static final int[] A0I;
    public static final int[] A0J;
    public static final int[] A0K;
    public byte A00;
    public byte A01;
    public int A02;
    public int A03;
    public List<GX> A05;
    public List<GX> A06;
    public boolean A07;
    public final int A08;
    public final int A09;
    public final C0551Ij A0A = new C0551Ij();
    public final ArrayList<C0496Ge> A0B = new ArrayList<>();
    public C0496Ge A04 = new C0496Ge(0, 4);

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 105);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A0C = new byte[]{88, 73, 73, 85, 80, 90, 88, 77, 80, 86, 87, Ascii.SYN, 65, Ascii.DC4, 84, 73, Ascii.CR, Ascii.DC4, 90, 92, 88, Ascii.DC4, Ascii.SI, 9, 1};
    }

    static {
        A07();
        A0G = new int[]{11, 1, 3, 12, 14, 5, 7, 9};
        A0F = new int[]{0, 4, 8, 12, 16, 20, 24, 28};
        A0K = new int[]{-1, -16711936, -16776961, -16711681, SupportMenu.CATEGORY_MASK, InputDeviceCompat.SOURCE_ANY, -65281};
        A0E = new int[]{32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
        A0H = new int[]{174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
        A0I = new int[]{193, HttpStatus.SC_CREATED, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, HttpStatus.SC_ACCEPTED, HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION, 235, HttpStatus.SC_PARTIAL_CONTENT, HttpStatus.SC_MULTI_STATUS, 239, 212, 217, 249, 219, 171, 187};
        A0J = new int[]{195, 227, HttpStatus.SC_RESET_CONTENT, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, MetadataChangeSet.CUSTOM_PROPERTY_SIZE_LIMIT_BYTES, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    }

    public AnonymousClass32(String str, int i) {
        this.A08 = A04(0, 25, 80).equals(str) ? 2 : 3;
        if (i != 3 && i != 4) {
            this.A09 = 1;
        } else {
            this.A09 = 2;
        }
        A0B(0);
        A06();
    }

    public static char A00(byte b) {
        int index = (b & 127) - 32;
        return (char) A0E[index];
    }

    public static char A01(byte b) {
        int index = b & 31;
        return (char) A0I[index];
    }

    public static char A02(byte b) {
        int index = b & 31;
        return (char) A0J[index];
    }

    public static char A03(byte b) {
        int index = b & 15;
        return (char) A0H[index];
    }

    private List<GX> A05() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.A0B.size(); i++) {
            GX gxA05 = this.A0B.get(i).A05();
            if (gxA05 != null) {
                arrayList.add(gxA05);
            }
        }
        return arrayList;
    }

    private void A06() {
        this.A04.A09(this.A02);
        this.A0B.clear();
        this.A0B.add(this.A04);
    }

    private void A08(byte b) {
        this.A04.A08(TokenParser.SP);
        this.A04.A0E((b >> 1) & 7, (b & 1) == 1);
    }

    private void A09(byte b) {
        if (b == 32) {
            A0B(2);
            return;
        }
        String[] strArr = A0D;
        if (strArr[4].length() == strArr[7].length()) {
            String[] strArr2 = A0D;
            strArr2[1] = "VpP0XbxTm16oYjwBPQX9pkQBfCeMI0LC";
            strArr2[5] = "MOPRimaIhpXtOf0evsEmKI44xylzjAWv";
            if (b != 41) {
                switch (b) {
                    case 37:
                        A0B(1);
                        A0C(2);
                        return;
                    case 38:
                        A0B(1);
                        A0C(3);
                        return;
                    case 39:
                        A0B(1);
                        String[] strArr3 = A0D;
                        if (strArr3[3].charAt(24) == strArr3[6].charAt(24)) {
                            String[] strArr4 = A0D;
                            strArr4[4] = "Y";
                            strArr4[7] = "Z";
                            A0C(4);
                            return;
                        }
                        break;
                    default:
                        int i = this.A02;
                        if (i == 0) {
                            return;
                        }
                        if (b == 33) {
                            this.A04.A06();
                            return;
                        }
                        if (b == 36) {
                            return;
                        }
                        switch (b) {
                            case 44:
                                this.A05 = null;
                                if (i != 1 && i != 3) {
                                    return;
                                }
                                A06();
                                return;
                            case 45:
                                if (i != 1 || this.A04.A0F()) {
                                    return;
                                }
                                this.A04.A07();
                                return;
                            case 46:
                                A06();
                                return;
                            case 47:
                                this.A05 = A05();
                                A06();
                                return;
                            default:
                                return;
                        }
                }
            } else {
                A0B(3);
                return;
            }
        }
        throw new RuntimeException();
    }

    private void A0A(byte b, byte b2) {
        int i = A0G[b & 7];
        if ((b2 & 32) != 0) {
            i++;
        }
        if (i != this.A04.A04()) {
            int i2 = this.A02;
            String[] strArr = A0D;
            if (strArr[3].charAt(24) != strArr[6].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[2] = "0Lleg";
            strArr2[0] = "zZ088";
            if (i2 != 1 && !this.A04.A0F()) {
                this.A04 = new C0496Ge(this.A02, this.A03);
                this.A0B.add(this.A04);
            }
            this.A04.A0C(i);
        }
        boolean z = (b2 & Ascii.DLE) == 16;
        int i3 = (b2 >> 1) & 7;
        this.A04.A0E(z ? 8 : i3, (b2 & 1) == 1);
        if (z) {
            this.A04.A0B(A0F[i3]);
        }
    }

    private void A0B(int i) {
        if (this.A02 == i) {
            return;
        }
        int i2 = this.A02;
        this.A02 = i;
        A06();
        if (i2 == 3 || i == 1 || i == 0) {
            this.A05 = null;
        }
    }

    private void A0C(int i) {
        this.A03 = i;
        this.A04.A0A(i);
    }

    public static boolean A0D(byte b) {
        return (b & 240) == 16;
    }

    private boolean A0E(byte b, byte b2) {
        boolean zA0D = A0D(b);
        if (zA0D) {
            if (this.A07 && this.A00 == b && this.A01 == b2) {
                this.A07 = false;
                return true;
            }
            this.A07 = true;
            this.A00 = b;
            this.A01 = b2;
        }
        if (A0F(b, b2)) {
            A08(b2);
        } else if (A0H(b, b2)) {
            A0A(b, b2);
        } else if (A0I(b, b2)) {
            this.A04.A0D(b2 - 32);
        } else if (A0G(b, b2)) {
            A09(b2);
        }
        return zA0D;
    }

    public static boolean A0F(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 32;
    }

    public static boolean A0G(byte b, byte b2) {
        return (b & 247) == 20 && (b2 & 240) == 32;
    }

    public static boolean A0H(byte b, byte b2) {
        return (b & 240) == 16 && (b2 & 192) == 64;
    }

    public static boolean A0I(byte b, byte b2) {
        return (b & 247) == 23 && b2 >= 33 && b2 <= 35;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0394Bo
    public final GY A0L() {
        List<GX> list = this.A05;
        this.A06 = list;
        return new VP(list);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0394Bo
    /* JADX INFO: renamed from: A0M */
    public final /* bridge */ /* synthetic */ C0403Bx A4k() throws GZ {
        return super.A4k();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0394Bo
    /* JADX INFO: renamed from: A0N */
    public final /* bridge */ /* synthetic */ AbstractC0395Bp A4l() throws GZ {
        return super.A4l();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0394Bo
    /* JADX INFO: renamed from: A0O */
    public final /* bridge */ /* synthetic */ void ADW(C0403Bx c0403Bx) throws GZ {
        super.ADW(c0403Bx);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0394Bo
    public final void A0P(C0403Bx c0403Bx) {
        this.A0A.A0b(c0403Bx.A01.array(), c0403Bx.A01.limit());
        boolean z = false;
        boolean zA0E = false;
        while (true) {
            int iA04 = this.A0A.A04();
            int i = this.A08;
            if (iA04 >= i) {
                byte bA0E = i == 2 ? (byte) -4 : (byte) this.A0A.A0E();
                byte bA0E2 = (byte) (this.A0A.A0E() & 127);
                byte bA0E3 = (byte) (this.A0A.A0E() & 127);
                if ((bA0E & 6) == 4 && (this.A09 != 1 || (bA0E & 1) == 0)) {
                    if (this.A09 != 2 || (bA0E & 1) == 1) {
                        if (bA0E2 != 0 || bA0E3 != 0) {
                            z = true;
                            if ((bA0E2 & 247) == 17 && (bA0E3 & 240) == 48) {
                                C0496Ge c0496Ge = this.A04;
                                char cA03 = A03(bA0E3);
                                String[] strArr = A0D;
                                if (strArr[4].length() != strArr[7].length()) {
                                    throw new RuntimeException();
                                }
                                String[] strArr2 = A0D;
                                strArr2[4] = "p";
                                strArr2[7] = "B";
                                c0496Ge.A08(cA03);
                            } else if ((bA0E2 & 246) == 18 && (bA0E3 & 224) == 32) {
                                this.A04.A06();
                                int i2 = bA0E2 & 1;
                                String[] strArr3 = A0D;
                                if (strArr3[4].length() != strArr3[7].length()) {
                                    String[] strArr4 = A0D;
                                    strArr4[2] = "9HiUv";
                                    strArr4[0] = "jgZGy";
                                    if (i2 == 0) {
                                        this.A04.A08(A01(bA0E3));
                                    } else {
                                        this.A04.A08(A02(bA0E3));
                                    }
                                } else {
                                    String[] strArr5 = A0D;
                                    strArr5[3] = "JTanLGl8juahhTvO0cevOVMW4Tf5Dblj";
                                    strArr5[6] = "p0GbhYKTQLQ9v5Vn33otxdnR4fUxZFvy";
                                    if (i2 == 0) {
                                        this.A04.A08(A01(bA0E3));
                                    } else {
                                        this.A04.A08(A02(bA0E3));
                                    }
                                }
                            } else if ((bA0E2 & 224) == 0) {
                                zA0E = A0E(bA0E2, bA0E3);
                            } else {
                                this.A04.A08(A00(bA0E2));
                                if ((bA0E3 & 224) != 0) {
                                    this.A04.A08(A00(bA0E3));
                                }
                            }
                        }
                    }
                }
            } else {
                if (z) {
                    if (!zA0E) {
                        this.A07 = false;
                    }
                    int i3 = this.A02;
                    if (i3 == 1 || i3 == 3) {
                        this.A05 = A05();
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0394Bo
    public final boolean A0R() {
        return this.A05 != this.A06;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0394Bo, com.facebook.ads.redexgen.X.InterfaceC0401Bv
    public final void ADm() {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0394Bo, com.facebook.ads.redexgen.X.VS
    public final /* bridge */ /* synthetic */ void AEg(long j) {
        super.AEg(j);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0394Bo, com.facebook.ads.redexgen.X.InterfaceC0401Bv
    public final void flush() {
        super.flush();
        this.A05 = null;
        this.A06 = null;
        A0B(0);
        A0C(4);
        A06();
        this.A07 = false;
        this.A00 = (byte) 0;
        this.A01 = (byte) 0;
    }
}
