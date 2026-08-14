package com.applovin.exoplayer2.b;

import com.applovin.exoplayer2.ai;
import com.google.android.gms.games.GamesStatusCodes;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f55a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, GamesStatusCodes.STATUS_MILESTONE_CLAIMED_PREVIOUSLY, 7350};
    private static final int[] b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: renamed from: com.applovin.exoplayer2.b.a$a, reason: collision with other inner class name */
    public static final class C0011a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f56a;
        public final int b;
        public final String c;

        private C0011a(int i, int i2, String str) {
            this.f56a = i;
            this.b = i2;
            this.c = str;
        }
    }

    public static C0011a a(byte[] bArr) throws ai {
        return a(new com.applovin.exoplayer2.l.x(bArr), false);
    }

    public static C0011a a(com.applovin.exoplayer2.l.x xVar, boolean z) throws ai {
        int iA = a(xVar);
        int iB = b(xVar);
        int iC = xVar.c(4);
        String str = "mp4a.40." + iA;
        if (iA == 5 || iA == 29) {
            iB = b(xVar);
            iA = a(xVar);
            if (iA == 22) {
                iC = xVar.c(4);
            }
        }
        if (z) {
            if (iA != 1 && iA != 2 && iA != 3 && iA != 4 && iA != 6 && iA != 7 && iA != 17) {
                switch (iA) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw ai.a("Unsupported audio object type: " + iA);
                }
            }
            a(xVar, iA, iC);
            switch (iA) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iC2 = xVar.c(2);
                    if (iC2 == 2 || iC2 == 3) {
                        throw ai.a("Unsupported epConfig: " + iC2);
                    }
                    break;
            }
        }
        int i = b[iC];
        if (i == -1) {
            throw ai.b(null, null);
        }
        return new C0011a(iB, i, str);
    }

    public static byte[] a(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & 120))};
    }

    private static int a(com.applovin.exoplayer2.l.x xVar) {
        int iC = xVar.c(5);
        return iC == 31 ? xVar.c(6) + 32 : iC;
    }

    private static int b(com.applovin.exoplayer2.l.x xVar) throws ai {
        int iC = xVar.c(4);
        if (iC == 15) {
            return xVar.c(24);
        }
        if (iC < 13) {
            return f55a[iC];
        }
        throw ai.b(null, null);
    }

    private static void a(com.applovin.exoplayer2.l.x xVar, int i, int i2) {
        if (xVar.e()) {
            com.applovin.exoplayer2.l.q.c("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (xVar.e()) {
            xVar.b(14);
        }
        boolean zE = xVar.e();
        if (i2 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i == 6 || i == 20) {
            xVar.b(3);
        }
        if (zE) {
            if (i == 22) {
                xVar.b(16);
            }
            if (i == 17 || i == 19 || i == 20 || i == 23) {
                xVar.b(3);
            }
            xVar.b(1);
        }
    }
}
