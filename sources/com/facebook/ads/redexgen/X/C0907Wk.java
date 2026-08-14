package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0907Wk extends Cq {
    public static byte[] A01;
    public static String[] A02 = {"VtWAGSJcoPK1ZfQIT7kg70", "uvijoF7s18JkyzfLjC52JO", "UbwrKHlSsB9uBr4pHbp3GiHEJPcDIn2y", "M5IiKhc4TX4EBu4m9nlnlg4KrGcCYGid", "uZSF2L4tKNd9pS0dTFbwskwuDNdjgXB", "5", "JxfitwILt0nkPD2n3YPqqh4", "RXlbAzoXPs3VSjVZyf6us5"};
    public long A00;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A01 = new byte[]{47, 62, 57, 42, 63, 34, 36, 37, 83, 82, 113, 89, 72, 93, 120, 93, 72, 93};
    }

    static {
        A0A();
    }

    public C0907Wk() {
        super(null);
        this.A00 = -9223372036854775807L;
    }

    public static int A00(C0551Ij c0551Ij) {
        return c0551Ij.A0E();
    }

    public static Boolean A01(C0551Ij c0551Ij) {
        return Boolean.valueOf(c0551Ij.A0E() == 1);
    }

    public static Double A02(C0551Ij c0551Ij) {
        return Double.valueOf(Double.longBitsToDouble(c0551Ij.A0L()));
    }

    public static Object A03(C0551Ij c0551Ij, int i) {
        if (i == 0) {
            return A02(c0551Ij);
        }
        if (i == 1) {
            return A01(c0551Ij);
        }
        if (i == 2) {
            return A05(c0551Ij);
        }
        if (i == 3) {
            return A09(c0551Ij);
        }
        if (i == 8) {
            HashMap<String, Object> mapA08 = A08(c0551Ij);
            if (A02[5].length() != 0) {
                String[] strArr = A02;
                strArr[7] = "dv1uUJDV50UY3341cCSHZj";
                strArr[6] = "lZLu8OCPwS2vewsoll9LjNz";
                return mapA08;
            }
        } else {
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                return A07(c0551Ij);
            }
            ArrayList<Object> arrayListA06 = A06(c0551Ij);
            String[] strArr2 = A02;
            if (strArr2[1].length() == strArr2[0].length()) {
                A02[4] = "2Wm";
                return arrayListA06;
            }
        }
        throw new RuntimeException();
    }

    public static String A05(C0551Ij c0551Ij) {
        int position = c0551Ij.A0I();
        int iA06 = c0551Ij.A06();
        c0551Ij.A0Z(position);
        return new String(c0551Ij.A00, iA06, position);
    }

    public static ArrayList<Object> A06(C0551Ij c0551Ij) {
        int iA0H = c0551Ij.A0H();
        ArrayList<Object> arrayList = new ArrayList<>(iA0H);
        for (int type = 0; type < iA0H; type++) {
            arrayList.add(A03(c0551Ij, A00(c0551Ij)));
        }
        return arrayList;
    }

    public static Date A07(C0551Ij c0551Ij) {
        Date date = new Date((long) A02(c0551Ij).doubleValue());
        c0551Ij.A0Z(2);
        return date;
    }

    public static HashMap<String, Object> A08(C0551Ij c0551Ij) {
        int iA0H = c0551Ij.A0H();
        HashMap<String, Object> map = new HashMap<>(iA0H);
        for (int i = 0; i < iA0H; i++) {
            map.put(A05(c0551Ij), A03(c0551Ij, A00(c0551Ij)));
        }
        return map;
    }

    public static HashMap<String, Object> A09(C0551Ij c0551Ij) {
        HashMap<String, Object> map = new HashMap<>();
        while (true) {
            String strA05 = A05(c0551Ij);
            int iA00 = A00(c0551Ij);
            if (A02[4].length() == 22) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[1] = "V4HwzONZDXYgxClN6ndm7q";
            strArr[0] = "UAxIIFeY73WGzRiRR4AY1i";
            if (iA00 == 9) {
                return map;
            }
            map.put(strA05, A03(c0551Ij, iA00));
        }
    }

    @Override // com.facebook.ads.redexgen.X.Cq
    public final void A0B(C0551Ij c0551Ij, long j) throws C0360Af {
        if (A00(c0551Ij) == 2) {
            if (!A04(8, 10, 28).equals(A05(c0551Ij)) || A00(c0551Ij) != 8) {
                return;
            }
            Map<String, Object> metadata = A08(c0551Ij);
            String strA04 = A04(0, 8, 107);
            if (metadata.containsKey(strA04)) {
                double dDoubleValue = ((Double) metadata.get(strA04)).doubleValue();
                if (dDoubleValue > 0.0d) {
                    this.A00 = (long) (1000000.0d * dDoubleValue);
                    return;
                }
                return;
            }
            return;
        }
        throw new C0360Af();
    }

    @Override // com.facebook.ads.redexgen.X.Cq
    public final boolean A0C(C0551Ij c0551Ij) {
        return true;
    }

    public final long A0D() {
        return this.A00;
    }
}
