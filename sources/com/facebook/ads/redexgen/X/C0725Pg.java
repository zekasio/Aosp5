package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.widget.ImageView;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@SuppressLint({"ViewConstructor"})
public final class C0725Pg extends ImageView {
    public static byte[] A03;
    public static final int A04;
    public final Paint A00;
    public final EnumC0723Pe A01;
    public final InterfaceC0724Pf A02;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{Ascii.VT, 47, 33, 40, Ascii.GS, -40, 36, Ascii.GS, Ascii.RS, 44, Ascii.SO, 50, 36, 43, 32, -37, 45, 36, 34, 35, 47};
    }

    static {
        A03();
        A04 = (int) (Lr.A00 * 4.0f);
    }

    public C0725Pg(C0947Xy c0947Xy, EnumC0723Pe enumC0723Pe, InterfaceC0724Pf interfaceC0724Pf) {
        super(c0947Xy);
        this.A01 = enumC0723Pe;
        this.A02 = interfaceC0724Pf;
        this.A00 = new Paint();
        this.A00.setColor(-1728053248);
        setColorFilter(-1);
        int i = A04;
        setPadding(i, i, i, i);
        boolean z = this.A01 == EnumC0723Pe.A03;
        setContentDescription(z ? A02(0, 10, 106) : A02(10, 11, 109));
        Bitmap bitmapA01 = C0642Mb.A01(EnumC0641Ma.TO_RIGHT_ARROW);
        if (z) {
            Matrix matrix = new Matrix();
            matrix.postRotate(180.0f);
            bitmapA01 = Bitmap.createBitmap(bitmapA01, 0, 0, bitmapA01.getWidth(), bitmapA01.getHeight(), matrix, true);
        }
        setImageBitmap(bitmapA01);
        setOnClickListener(new ViewOnClickListenerC0722Pd(this));
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, Math.min(r1, r0), this.A00);
        super.onDraw(canvas);
    }
}
