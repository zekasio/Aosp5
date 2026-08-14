package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class SX extends O6 {
    public static byte[] A01;
    public final /* synthetic */ PA A00;

    static {
        A04();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 114);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{5, Ascii.CAN, Ascii.SI, 0, Ascii.FF, 8, 2, 62, Ascii.DC2, 5, 10, 62, Ascii.CR, 0, Ascii.CAN, 4, 19, 62, 2, Ascii.SO, Ascii.SI, Ascii.NAK, 4, Ascii.SI, Ascii.NAK, 62, 9, 4, 8, 6, 9, Ascii.NAK, Ascii.FF, 17, 6, 9, 5, 1, Ascii.VT, 55, Ascii.ESC, Ascii.FF, 3, 55, 4, 9, 17, Ascii.CR, Ascii.SUB, 55, Ascii.VT, 7, 6, Ascii.FS, Ascii.CR, 6, Ascii.FS, 55, Ascii.US, 1, Ascii.FF, Ascii.FS, 0};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SX(PA pa, C0947Xy c0947Xy) {
        super(c0947Xy);
        this.A00 = pa;
        getSettings().setAllowFileAccess(true);
        setBackgroundColor(0);
    }

    private int A01(int specMode, int specSize, int i) {
        int mode = View.MeasureSpec.getMode(i);
        int specMode2 = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(Math.min(specMode, specMode2), specSize);
        }
        if (mode == 0) {
            return Math.min(specMode, specSize);
        }
        if (mode != 1073741824) {
            return specMode;
        }
        return specMode2;
    }

    @Override // com.facebook.ads.redexgen.X.O6
    public final WebChromeClient A0D() {
        return new P5(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.O6
    public final WebViewClient A0E() {
        return new P6(this.A00);
    }

    private int getDynamicWebViewHeight() {
        return this.A00.A09.A0d().optInt(A03(0, 32, 19));
    }

    private int getDynamicWebViewWidth() {
        return this.A00.A09.A0d().optInt(A03(32, 31, 26));
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public final void onMeasure(int w, int h) {
        int widthSpecMode = getDynamicWebViewWidth();
        int heightSpecMode = getDynamicWebViewHeight();
        if (widthSpecMode <= 0 || heightSpecMode <= 0) {
            super.onMeasure(w, h);
            return;
        }
        float f = widthSpecMode / heightSpecMode;
        int mode = View.MeasureSpec.getMode(w);
        int mode2 = View.MeasureSpec.getMode(h);
        boolean z = true;
        boolean z2 = mode != 1073741824;
        if (mode2 == 1073741824) {
            z = false;
        }
        int width = getResources().getDisplayMetrics().widthPixels;
        int height = getResources().getDisplayMetrics().heightPixels;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            int maxWidth = viewGroup.getWidth();
            height = Integer.MAX_VALUE;
            width = maxWidth != 0 ? viewGroup.getWidth() : Integer.MAX_VALUE;
            int maxWidth2 = viewGroup.getHeight();
            if (maxWidth2 != 0) {
                height = viewGroup.getHeight();
            }
        }
        int iA01 = A01(widthSpecMode, width, w);
        int widthSpecMode2 = A01(heightSpecMode, height, h);
        if (z || z2) {
            int maxWidth3 = iA01 / widthSpecMode2;
            if (Math.abs(maxWidth3 - f) > 1.0E-7d) {
                int maxWidth4 = 0;
                if (z) {
                    widthSpecMode2 = (int) (iA01 / f);
                    maxWidth4 = 1;
                }
                if (maxWidth4 == 0 && z2) {
                    iA01 = (int) (widthSpecMode2 * f);
                }
            }
        }
        setMeasuredDimension(iA01, widthSpecMode2);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.A00.A02 != null) {
            this.A00.A02.ACX(this, motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }
}
