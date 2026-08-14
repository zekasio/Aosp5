package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5R, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C5R extends AsyncTask<C5T, Void, Drawable> {
    public static byte[] A03;
    public static String[] A04 = {"1BJo9noXfKND6AuvSNdcB1V3GCwIAiOG", "Zj7TA2K", "dGMOiNue98uIHvh7voSV0LAZFWXYzfEv", "CcnxrNYo5kyWzKS3XGCDqe4PQiCtH", "knheqnusZFI0swerek9wKwEDBcdWqhKt", "XjDOSOe9Ixcmw73z7hfuGI1aFjWKj", "M2ugdIZCKbhB2vBaVocVLhBvD0BsDTY5", "metH7Y2aXkNKgtpuuGKiPWqQd6SU"};
    public final C5S A00;
    public final C0947Xy A01;
    public final boolean A02;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 118);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{59, 57, 50, 57, 46, 53, 63};
    }

    static {
        A02();
    }

    public C5R(C0947Xy c0947Xy, C5S c5s, boolean z) {
        this.A01 = c0947Xy;
        this.A00 = c5s;
        this.A02 = z;
    }

    public /* synthetic */ C5R(C0947Xy c0947Xy, C5S c5s, boolean z, C1094bV c1094bV) {
        this(c0947Xy, c5s, z);
    }

    @SuppressLint({"CatchGeneralException"})
    private final Drawable A00(C5T... c5tArr) throws Throwable {
        if (!L0.A02(this) && c5tArr != null) {
            try {
                if (c5tArr.length >= 1) {
                    String str = c5tArr[0].A01;
                    String str2 = c5tArr[0].A00;
                    Bitmap bitmapA0N = null;
                    try {
                        bitmapA0N = new C7U(this.A01).A0N(str, -1, -1);
                    } catch (Throwable th) {
                        this.A01.A06().A8y(A01(0, 7, 42), C03298z.A1V, new AnonymousClass90(th));
                    }
                    if (bitmapA0N != null) {
                        return UB.A05(this.A01, bitmapA0N, this.A02, str2);
                    }
                    return null;
                }
            } catch (Throwable th2) {
                L0.A00(th2, this);
                return null;
            }
        }
        return null;
    }

    private final void A03(Drawable drawable) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A00.AAy(drawable);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // android.os.AsyncTask
    @SuppressLint({"CatchGeneralException"})
    public final /* bridge */ /* synthetic */ Drawable doInBackground(C5T[] c5tArr) throws Throwable {
        if (L0.A02(this)) {
            return null;
        }
        try {
            return A00(c5tArr);
        } catch (Throwable th) {
            L0.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Drawable drawable) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            A03(drawable);
        } catch (Throwable th) {
            L0.A00(th, this);
            String[] strArr = A04;
            if (strArr[0].charAt(5) != strArr[4].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[1] = "H4qVqfS";
            strArr2[7] = "3NPSPTmKkS9byZNXvPXu57LevjUG";
        }
    }
}
