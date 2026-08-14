package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC0723Pe {
    A03,
    A04;

    public static byte[] A00;
    public static String[] A01 = {"p5IIOLlp1B1ZcinDN0X6ynPo7iUU6KYH", "pR9Fkr1wWPG0d9ySETcIXHMYi8wcMlk0", "E7RgkNcVOxUPlMLAnYmg2qDI6nJpawyt", "j32M5Jmc2ihmMgTvSB0S3AGv8SFv23ML", "DP3a2sR6Ao5znMBkyRuDzqvSCPyaW43t", "aJygC0wABx4", "92sHBdTkJGpDSWYr6Ma8vgCUoSk9iZG6", "rW1xsMZdRBLA1hSdWjmrmwJE36RmnU9E"};

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A01[3].charAt(15) != 'v') {
                throw new RuntimeException();
            }
            A01[3] = "UISLjJpxihM79aLvihwYrwdsqCfo0Nro";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 25);
            i4++;
        }
    }

    public static void A01() {
        A00 = new byte[]{-66, -49, -49, -52, -44, -36, -55, -62, -61, -47, -86, -69, -69, -72, -64, -56, -69, -78, -80, -79, -67};
    }

    static {
        A01();
    }
}
