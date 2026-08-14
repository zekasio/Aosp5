package com.facebook.ads.redexgen.X;

import android.util.Pair;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.gms.games.GamesStatusCodes;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class IO {
    public static byte[] A00;
    public static String[] A01 = {"7xLJJJjcPic97znxr7jYyKVhMaeA1j2E", "qlBokwmGez00tGn8Zoa7EPfSBX4wK2nd", "lNuywCj9LEYUa8avgu1fHofmnBtqXXwP", "QFj1OU4oR8zs4ROIl6ex9DnIWth", "MldRCxmPSCf85WqtCY5KHjt0bBRgqPbR", "RjpHJdGRFnKrV", "xTxTizoIhxSZQJal7HagUNUTtmhMrgov", "oiVBLQsg82rzAXMmQswhUJYEb9MEhzaa"};
    public static final byte[] A02;
    public static final int[] A03;
    public static final int[] A04;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 42);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{5, 62, 35, 37, 32, 32, 63, 34, 36, 53, 52, 112, 49, 37, 52, 57, 63, 112, 63, 50, 58, 53, 51, 36, 112, 36, 41, 32, 53, 106, 112, 116, 79, 82, 84, 81, 81, 78, 83, 85, 68, 69, 1, 68, 81, 98, 78, 79, 71, 72, 70, Ascii.ESC, 1};
    }

    static {
        A05();
        A02 = new byte[]{0, 0, 0, 1};
        A04 = new int[]{96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, GamesStatusCodes.STATUS_MILESTONE_CLAIMED_PREVIOUSLY, 7350};
        A03 = new int[]{0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    }

    public static int A00(C0550Ii c0550Ii) {
        int iA04 = c0550Ii.A04(5);
        if (iA04 == 31) {
            return c0550Ii.A04(6) + 32;
        }
        return iA04;
    }

    public static int A01(C0550Ii c0550Ii) {
        int iA04 = c0550Ii.A04(4);
        if (iA04 == 15) {
            int samplingFrequency = c0550Ii.A04(24);
            return samplingFrequency;
        }
        if (A01[3].length() != 27) {
            throw new RuntimeException();
        }
        A01[5] = "Rl706moC1hxTN";
        IK.A03(iA04 < 13);
        int samplingFrequency2 = A04[iA04];
        return samplingFrequency2;
    }

    public static Pair<Integer, Integer> A02(C0550Ii c0550Ii, boolean z) throws C0360Af {
        int iA00 = A00(c0550Ii);
        int channelConfiguration = A01(c0550Ii);
        int iA04 = c0550Ii.A04(4);
        if (iA00 == 5 || iA00 == 29) {
            channelConfiguration = A01(c0550Ii);
            iA00 = A00(c0550Ii);
            if (iA00 == 22) {
                iA04 = c0550Ii.A04(4);
            }
        }
        boolean z2 = true;
        if (z) {
            if (iA00 != 1 && iA00 != 2 && iA00 != 3 && iA00 != 4 && iA00 != 6 && iA00 != 7 && iA00 != 17) {
                switch (iA00) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw new C0360Af(A04(0, 31, 122) + iA00);
                }
            }
            A06(c0550Ii, iA00, iA04);
            if (A01[4].charAt(0) == 'c') {
                throw new RuntimeException();
            }
            A01[7] = "vV2yfuq3D8MlByvyd0FSsWmE07MYRaiH";
            switch (iA00) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int channelCount = c0550Ii.A04(2);
                    if (channelCount == 2 || channelCount == 3) {
                        throw new C0360Af(A04(31, 22, 11) + channelCount);
                    }
                    break;
            }
        }
        int i = A03[iA04];
        if (i == -1) {
            z2 = false;
        }
        IK.A03(z2);
        return Pair.create(Integer.valueOf(channelConfiguration), Integer.valueOf(i));
    }

    public static Pair<Integer, Integer> A03(byte[] bArr) throws C0360Af {
        return A02(new C0550Ii(bArr), false);
    }

    public static void A06(C0550Ii c0550Ii, int i, int i2) {
        c0550Ii.A08(1);
        if (c0550Ii.A0F()) {
            if (A01[5].length() != 13) {
                throw new RuntimeException();
            }
            A01[6] = "9ZbgWIK1Tjah9N2o7wCOkUZOiekVuClG";
            c0550Ii.A08(14);
        }
        boolean zA0F = c0550Ii.A0F();
        if (i2 != 0) {
            if (i == 6 || i == 20) {
                c0550Ii.A08(3);
            }
            if (zA0F) {
                if (i == 22) {
                    c0550Ii.A08(16);
                }
                if (i == 17 || i == 19 || i == 20 || i == 23) {
                    c0550Ii.A08(3);
                }
                c0550Ii.A08(1);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException();
    }

    public static byte[] A07(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & 120))};
    }

    public static byte[] A08(byte[] bArr, int i, int i2) {
        byte[] bArr2 = A02;
        byte[] bArr3 = new byte[bArr2.length + i2];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, A02.length, i2);
        return bArr3;
    }
}
