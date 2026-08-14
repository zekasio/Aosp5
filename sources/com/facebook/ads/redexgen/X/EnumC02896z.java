package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC02896z {
    A05(1),
    A0B(2),
    A08(4),
    A0A(8),
    A0N(16),
    A0F(32),
    A06(64),
    A0E(128),
    A0C(256),
    A0D(512),
    A0M(1024),
    A0J(2048),
    A0K(4096),
    A09(8192),
    A0I(16384),
    A0G(32768),
    A0H(65536),
    A0L(131072),
    A07(262144);

    public static byte[] A01;
    public static String[] A02 = {"0BJ5h", "uImWw", "eQs5ApErathnGGN0d7eChKCrZd8SdVGS", "kPzS2riknK7ja7wZhtH9DjUAaupVVGy6", "IlkU", "Bv", "wT", "cW"};
    public static final Map<Integer, EnumC02896z> A03;
    public int A00;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 73);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{3, 1, Ascii.SYN, Ascii.VT, Ascii.DC4, 7, 93, 82, 88, 78, 83, 85, 88, 67, 82, 93, 72, 85, 74, 89, Ascii.RS, Ascii.EM, Ascii.DC2, Ascii.NAK, Ascii.ESC, Ascii.DC2, 3, 8, Ascii.NAK, Ascii.EM, Ascii.SO, 37, 46, 40, 42, 34, 51, 53, 46, 36, 59, 44, 55, 61, 53, 60, Ascii.NAK, Ascii.DC4, 1, 3, Ascii.DC4, Ascii.DC2, Ascii.DLE, 5, Ascii.DC4, Ascii.NAK, 34, 63, 40, 39, 43, 47, 37, 69, 81, 85, 65, 76, 95, 66, 89, 95, 67, 79, 78, 84, 69, 88, 84, Ascii.GS, 9, Ascii.CR, Ascii.EM, Ascii.DC4, 7, Ascii.SUB, 1, 7, Ascii.FF, 17, Ascii.NAK, Ascii.GS, Ascii.VT, Ascii.FF, Ascii.EM, Ascii.NAK, 8, 8, Ascii.FS, Ascii.CAN, Ascii.FF, 1, Ascii.DC2, Ascii.SI, Ascii.DC4, Ascii.DC2, Ascii.ESC, Ascii.FF, 1, Ascii.CAN, 8, 110, 104, 116, 120, 105, 102, 115, 110, 113, 98, Ascii.EM, Ascii.DLE, Ascii.DLE, 5, Ascii.US, 2, 19, 19, Ascii.SUB, Ascii.SUB, Ascii.SI, Ascii.NAK, 8, Ascii.EM, 3, Ascii.SI, Ascii.EM, Ascii.DC2, Ascii.SI, Ascii.NAK, 8, Ascii.NAK, 10, Ascii.EM, Ascii.FS, Ascii.GS, 0, Ascii.SUB, 7, Ascii.SYN, 7, Ascii.SYN, 5, Ascii.SYN, Ascii.EM, Ascii.CAN, Ascii.RS, 19, 8, 3, Ascii.RS, Ascii.DC2, 5, Ascii.DC4, 7, 8, 2, 9, Ascii.VT, Ascii.EM, Ascii.NAK, 7, Ascii.VT, Ascii.SYN, 10, 3, Ascii.EM, Ascii.DC2, Ascii.SI, 3, Ascii.DC4, 84, 66, 73, 84, 78, 83, 78, 81, 66, Ascii.DC4, Ascii.DC2, Ascii.DC4, Ascii.ETB, Ascii.SO, 4, Ascii.SO, 8, Ascii.DC2, Ascii.DC4, Ascii.CAN, 19, Ascii.SO, 2, Ascii.NAK, Ascii.DC4, 6, 1};
    }

    static {
        A03();
        A03 = new HashMap();
        for (EnumC02896z enumC02896z : valuesCustom()) {
            A03.put(Integer.valueOf(enumC02896z.A00), enumC02896z);
        }
    }

    EnumC02896z(int i) {
        this.A00 = i;
    }

    @Nullable
    public static EnumC02896z A00(int i) {
        if (A03.containsKey(Integer.valueOf(i))) {
            return A03.get(Integer.valueOf(i));
        }
        return null;
    }

    @SuppressLint({"BadMethodUse-android.util.Log.e", "CatchGeneralException", "EmptyCatchBlock"})
    public static EnumSet<EnumC02896z> A02(int i) throws Exception {
        EnumSet<EnumC02896z> enumSetNoneOf = EnumSet.noneOf(EnumC02896z.class);
        if (i <= 0) {
            return enumSetNoneOf;
        }
        EnumC02896z[] enumC02896zArrValuesCustom = valuesCustom();
        while (i != 0) {
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i);
            i ^= Integer.lowestOneBit(i);
            if (iNumberOfTrailingZeros < enumC02896zArrValuesCustom.length) {
                enumSetNoneOf.add(enumC02896zArrValuesCustom[iNumberOfTrailingZeros]);
            }
        }
        return enumSetNoneOf;
    }

    public final int A04() {
        return this.A00;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC02896z[] valuesCustom() {
        EnumC02896z[] enumC02896zArr = (EnumC02896z[]) values().clone();
        if (A02[6].length() == 6) {
            throw new RuntimeException();
        }
        A02[3] = "eRZf21luPciybvl5gLFfDWdEin7TzD8T";
        return enumC02896zArr;
    }
}
