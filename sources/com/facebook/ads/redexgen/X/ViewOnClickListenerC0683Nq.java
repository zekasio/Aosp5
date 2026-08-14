package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.gms.drive.DriveFile;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0683Nq implements View.OnClickListener {
    public static byte[] A02;
    public final /* synthetic */ C0947Xy A00;
    public final /* synthetic */ C0685Ns A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 66);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-58, -57, -44, -38, -39, -97, -57, -47, -58, -45, -48, Ascii.DC4, 33, Ascii.DC2, Ascii.DC4, Ascii.SYN, 39, Ascii.FS, 41, Ascii.FS, 39, 44, -60, -47, -57, -43, -46, -52, -57, -111, -52, -47, -41, -56, -47, -41, -111, -60, -58, -41, -52, -46, -47, -111, -71, -84, -88, -70};
    }

    public ViewOnClickListenerC0683Nq(C0685Ns c0685Ns, C0947Xy c0947Xy) {
        this.A01 = c0685Ns;
        this.A00 = c0947Xy;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            if (!TextUtils.isEmpty(this.A01.A06) && !A00(0, 11, 35).equals(this.A01.A06)) {
                Intent intent = new Intent(A00(22, 26, 33), C0617La.A00(this.A01.A06));
                intent.addFlags(DriveFile.MODE_READ_ONLY);
                this.A00.A0D().A8A();
                try {
                    LN.A0B(this.A00, intent);
                } catch (LL e) {
                    Throwable cause = e.getCause();
                    LL cause2 = e;
                    if (cause != null) {
                        cause2 = e.getCause();
                    }
                    this.A00.A06().A8y(A00(11, 11, 113), C03298z.A00, new AnonymousClass90(cause2));
                }
            }
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
