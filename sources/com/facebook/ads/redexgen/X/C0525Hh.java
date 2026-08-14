package com.facebook.ads.redexgen.X;

import android.util.Log;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0525Hh implements R1 {
    public static byte[] A04;
    public int A00;

    @Nullable
    public String A01;

    @Nullable
    public Map<String, List<String>> A02;

    @Nullable
    public byte[] A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 65);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-79, -56, -41, -38, -46, -43, -50, -125, -56, -43, -43, -46, -43};
    }

    public C0525Hh(HttpURLConnection httpURLConnection, @Nullable byte[] bArr) {
        try {
            this.A00 = httpURLConnection.getResponseCode();
            this.A01 = httpURLConnection.getURL().toString();
        } catch (IOException e) {
            Log.e(getClass().getSimpleName(), A00(0, 13, 34), e);
        }
        this.A02 = httpURLConnection.getHeaderFields();
        this.A03 = bArr;
    }

    @Override // com.facebook.ads.redexgen.X.R1
    @Nullable
    public final byte[] A5o() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.R1
    @Nullable
    public final String A5p() {
        byte[] bArr = this.A03;
        if (bArr != null) {
            return new String(bArr);
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.R1
    @Nullable
    public final Map<String, List<String>> A6k() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.R1
    public final int A7a() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.R1
    @Nullable
    public final String getUrl() {
        return this.A01;
    }
}
