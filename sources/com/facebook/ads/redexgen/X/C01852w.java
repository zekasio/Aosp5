package com.facebook.ads.redexgen.X;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.work.WorkRequest;
import com.applovin.exoplayer2.common.base.Ascii;
import cz.msebera.android.httpclient.HttpStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C01852w extends AbstractC0405Bz {
    public static byte[] A05;
    public static String[] A06 = {"nLO9L7XoEpR8vgnDFT", "WlEQ0W9HytVOtlcgcYyzDlj1QkZOFGjO", "ODtnbW3mHTyNn479FkodGv794qS9hsWl", "APk9cVzJYKr2vBqvSJCf7k3ktACu2ubu", "Tq9sEDvjDozJ9rvk5K396aURjyjwu7hY", "bGv", "ZQgwsO83xrUrRKbDM61rEvH7uEXNNVYo", "gyYiWp0aVpa2EpLIT9J28do7UtlziSMd"};
    public static final Pattern A07;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final boolean A04;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 114);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{-98, -20, 3, -2, -20, 32, 40, -17, -19, -2, -19, 3, -20, 32, 40, -17, -19, -2, -20, 32, 40, -17, -19, -20, 3, -2, -2, 64, 32, -14, -19, -20, 32, 40, -17, -19, -82, 44, 81, 73, 84, 87, 79, 93, 77, 34, 8, -2, 39, 42, 37, Ascii.EM, 44, -14, -40, -5, 19, 17, Ascii.CAN, Ascii.CAN, 17, Ascii.SYN, Ascii.SI, -56, Ascii.FF, 17, 9, Ascii.DC4, Ascii.ETB, Ascii.SI, Ascii.GS, Ascii.CR, -56, Ascii.DC4, 17, Ascii.SYN, Ascii.CR, -56, 10, Ascii.CR, Ascii.SO, Ascii.ETB, Ascii.SUB, Ascii.CR, -56, Ascii.VT, Ascii.ETB, Ascii.NAK, Ascii.CAN, Ascii.DC4, Ascii.CR, Ascii.FS, Ascii.CR, -56, Ascii.SO, Ascii.ETB, Ascii.SUB, Ascii.NAK, 9, Ascii.FS, -30, -56, 17, 41, 39, 46, 46, 39, 44, 37, -34, 34, 39, Ascii.US, 42, 45, 37, 51, 35, -34, 42, 39, 44, 35, -34, 53, 39, 50, 38, -34, 36, 35, 53, 35, 48, -34, 33, 45, 42, 51, 43, 44, 49, -34, 50, 38, Ascii.US, 44, -34, 36, 45, 48, 43, Ascii.US, 50, -8, -34, -35, -11, -13, -6, -6, -13, -8, -15, -86, -13, -8, 0, -21, -10, -13, -18, -86, -2, -13, -9, -13, -8, -15, -60, -86, 68, 100, 82, 53, 86, 84, 96, 85, 86, 99, -11, -33, Ascii.DLE, -1, 8, Ascii.SO, Ascii.CR, -9, 42, 42, Ascii.FS, 73, 73, 91, Ascii.NAK, 52, -25, -29, -8, Ascii.NAK, 54, -24, -15, -25, 53, 54, 35, 52, 54, 85, 70, 89, 85};
    }

    static {
        A03();
        A07 = Pattern.compile(A02(1, 35, 82));
    }

    public C01852w() {
        this(null);
    }

    public C01852w(@Nullable List<byte[]> list) {
        super(A02(182, 10, 127));
        if (list != null && !list.isEmpty()) {
            this.A04 = true;
            String strA0Q = C0567Iz.A0Q(list.get(0));
            IK.A03(strA0Q.startsWith(A02(47, 8, 70)));
            A06(strA0Q);
            A04(new C0551Ij(list.get(1)));
            return;
        }
        this.A04 = false;
    }

    public static long A00(String str) {
        Matcher matcher = A07.matcher(str);
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        long j = Long.parseLong(matcher.group(1)) * 60 * 60 * 1000000;
        long timestampUs = Long.parseLong(matcher.group(2));
        long j2 = j + (timestampUs * 60 * 1000000);
        long timestampUs2 = Long.parseLong(matcher.group(3));
        return j2 + (timestampUs2 * 1000000) + (Long.parseLong(matcher.group(4)) * WorkRequest.MIN_BACKOFF_MILLIS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC0405Bz
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final VM A0b(byte[] bArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        IZ iz = new IZ();
        C0551Ij c0551Ij = new C0551Ij(bArr, i);
        if (!this.A04) {
            A04(c0551Ij);
        }
        A05(c0551Ij, arrayList, iz);
        GX[] gxArr = new GX[arrayList.size()];
        arrayList.toArray(gxArr);
        return new VM(gxArr, iz.A05());
    }

    private void A04(C0551Ij c0551Ij) {
        String strA0P;
        do {
            strA0P = c0551Ij.A0P();
            if (strA0P == null) {
                return;
            }
            if (A06[6].charAt(30) != 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[0] = "7FHmrvaj0sy2XXhHTc";
            strArr[5] = "VJa";
        } while (!strA0P.startsWith(A02(192, 8, 40)));
    }

    private void A05(C0551Ij c0551Ij, List<GX> list, IZ iz) {
        while (true) {
            String strA0P = c0551Ij.A0P();
            if (strA0P != null) {
                if (!this.A04 && strA0P.startsWith(A02(47, 8, 70))) {
                    A06(strA0P);
                } else if (strA0P.startsWith(A02(37, 10, 118))) {
                    A07(strA0P, list, iz);
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A06(java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C01852w.A06(java.lang.String):void");
    }

    private void A07(String str, List<GX> list, IZ iz) {
        int i = this.A01;
        String strA02 = A02(182, 10, 127);
        if (i == 0) {
            Log.w(strA02, A02(55, 47, 54) + str);
            return;
        }
        String[] strArrSplit = str.substring(A02(37, 10, 118).length()).split(A02(36, 1, 16), this.A01);
        if (strArrSplit.length != this.A01) {
            Log.w(strA02, A02(102, 55, 76) + str);
            return;
        }
        long jA00 = A00(strArrSplit[this.A02]);
        String strA022 = A02(157, 25, 24);
        if (jA00 == -9223372036854775807L) {
            Log.w(strA02, strA022 + str);
            return;
        }
        long endTimeUs = -9223372036854775807L;
        String str2 = strArrSplit[this.A00];
        if (!str2.trim().isEmpty()) {
            endTimeUs = A00(str2);
            if (endTimeUs == -9223372036854775807L) {
                Log.w(strA02, strA022 + str);
                return;
            }
        }
        String strReplaceAll = strArrSplit[this.A03].replaceAll(A02(HttpStatus.SC_PARTIAL_CONTENT, 7, 71), A02(0, 0, 15));
        String strA023 = A02(0, 1, 34);
        list.add(new GX(strReplaceAll.replaceAll(A02(200, 3, 92), strA023).replaceAll(A02(HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION, 3, 123), strA023)));
        iz.A04(jA00);
        if (endTimeUs != -9223372036854775807L) {
            list.add(null);
            iz.A04(endTimeUs);
        }
    }
}
