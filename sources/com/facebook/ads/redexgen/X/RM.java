package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.gms.drive.MetadataChangeSet;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class RM extends AsyncTask<String, Void, RN> {
    public static byte[] A05;
    public static String[] A06 = {"iMGBqiSHm2uYyOurEO", "JHkNge3qKUrOixxb", "Efd0ZU7p6XsOViiGEn9FTnCEMV0phXsZ", "Qqux8MYyckh5CceEy", "ksejtLtP", "6qwv67", "yXEFufBpuo", "JuPO8KFa"};
    public static final String A07;
    public static final Set<String> A08;
    public C8U A00;
    public R1 A01;
    public RL A02;
    public Map<String, String> A03;
    public Map<String, String> A04;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 90);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{48, 0, 3, 57, 33, Ascii.SYN, Ascii.SYN, Ascii.VT, Ascii.SYN, 68, Ascii.VT, Ascii.DC4, 1, 10, Ascii.CR, 10, 3, 68, 17, Ascii.SYN, 8, 94, 68, 122, 117, 122, 119, 116, 124, 44, 55, 46, 46};
    }

    static {
        A04();
        A07 = RM.class.getSimpleName();
        A08 = new HashSet();
        A08.add(A01(0, 1, 73));
        A08.add(A01(29, 4, 24));
    }

    public RM(C8U c8u) {
        this(c8u, null, null);
    }

    public RM(C8U c8u, Map<String, String> map) {
        this(c8u, map, null);
    }

    public RM(C8U c8u, @Nullable Map<String, String> map, @Nullable Map<String, String> map2) {
        this.A00 = c8u;
        Map<String, String> postData = map != null ? new HashMap<>(map) : null;
        this.A03 = postData;
        Map<String, String> extraData = map2 != null ? new HashMap<>(map2) : null;
        this.A04 = extraData;
    }

    private final RN A00(String... strArr) throws Throwable {
        if (L0.A02(this)) {
            return null;
        }
        try {
            String str = strArr[0];
            if (!TextUtils.isEmpty(str) && !A08.contains(str)) {
                String strA02 = A02(str);
                if (this.A03 != null && !this.A03.isEmpty()) {
                    for (Map.Entry<String, String> entry : this.A03.entrySet()) {
                        String key = entry.getKey();
                        String url = entry.getValue();
                        strA02 = A03(strA02, key, url);
                    }
                }
                int i = 1;
                while (true) {
                    int i2 = i + 1;
                    if (i > 2) {
                        return null;
                    }
                    if (A06(strA02)) {
                        return new RN(this.A01);
                    }
                    i = i2;
                }
            }
            return null;
        } catch (Throwable th) {
            if (A06[6].length() == 31) {
                throw new RuntimeException();
            }
            A06[6] = "dO3qGWbyMuVAZQTwO1X30zVxIjEEo";
            L0.A00(th, this);
            return null;
        }
    }

    private String A02(String str) {
        try {
            return A03(str, A01(23, 6, 65), C0638Lx.A01(this.A00.A02().A5i()));
        } catch (Exception unused) {
            return str;
        }
    }

    private String A03(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return str;
        }
        String strA01 = A01(3, 1, 92);
        if (str.contains(strA01)) {
            strA01 = A01(1, 1, MetadataChangeSet.CUSTOM_PROPERTY_SIZE_LIMIT_BYTES);
        }
        return str + strA01 + str2 + A01(2, 1, 100) + URLEncoder.encode(str3);
    }

    private final void A05(RN rn) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            if (this.A02 != null) {
                this.A02.ADO(rn);
            }
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @SuppressLint({"CatchGeneralException"})
    private boolean A06(String str) {
        R1 r1ADA;
        R2 r2A00 = RK.A00(this.A00);
        try {
            if (this.A04 == null || this.A04.size() == 0) {
                r1ADA = r2A00.ADA(str, new RG());
            } else {
                RG rg = new RG();
                rg.A05(this.A04);
                r1ADA = r2A00.ADB(str, rg.A08());
            }
            this.A01 = r1ADA;
        } catch (Exception e) {
            Log.e(A07, A01(4, 19, 62) + str, e);
        }
        R1 r1 = this.A01;
        return r1 != null && r1.A7a() == 200;
    }

    public final void A07(RL rl) {
        this.A02 = rl;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ RN doInBackground(String[] strArr) throws Throwable {
        if (L0.A02(this)) {
            return null;
        }
        try {
            return A00(strArr);
        } catch (Throwable th) {
            L0.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        RL rl = this.A02;
        if (rl != null) {
            rl.ADM();
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(RN rn) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A05(rn);
        } catch (Throwable th) {
            if (A06[3].length() != 17) {
                throw new RuntimeException();
            }
            A06[2] = "KahWFkeddZk466vYoInqTxrEqXEaISmf";
            L0.A00(th, this);
        }
    }
}
