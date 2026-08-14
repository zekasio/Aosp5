package com.facebook.ads.redexgen.X;

import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1A, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1A extends ViewOnTouchListenerC01451h implements PX {
    public static byte[] A07;
    public static String[] A08 = {"T7MK6mm4Fzbg8PTMnM4kcHpb21LLpIaw", "PTQtUxKdjysMmbj8hCZsGKEwd1IRWqqZ", "Zw8mt4VncD", "79VYCrnrWW", "2MnAMBnkkiKtyd2cP7mHhabJycDYuMiE", "jaMauIT7sdi", "OgIH7ZaBRtH9hoDgrnw", "xZmsCngT77DU5lblEiekqTVKPqNdsast"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public InterfaceC0662Mv A04;
    public boolean A05;
    public final BF A06;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 28);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A07 = new byte[]{-6, -7, -37, -20, -14, -16, -50, -13, -20, -7, -14, -16, -17};
    }

    static {
        A03();
    }

    public C1A(C0947Xy c0947Xy) {
        super(c0947Xy);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new BF(c0947Xy, new PU(), new PT());
        A02();
    }

    public C1A(C0947Xy c0947Xy, AttributeSet attributeSet) {
        super(c0947Xy, attributeSet);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new BF(c0947Xy, new PU(), new PT());
        A02();
    }

    public C1A(C0947Xy c0947Xy, AttributeSet attributeSet, int i) {
        super(c0947Xy, attributeSet, i);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new BF(c0947Xy, new PU(), new PT());
        A02();
    }

    private int A00(int availableWidth) {
        int numFullItems = this.A00 * 2;
        int itemSize = (getMeasuredWidth() - getPaddingLeft()) - numFullItems;
        int iA0D = getAdapter().A0D();
        int i = 0;
        int numItems = Integer.MAX_VALUE;
        while (numItems > availableWidth) {
            i++;
            if (i >= iA0D) {
                return availableWidth;
            }
            int numItems2 = i * numFullItems;
            numItems = (int) ((itemSize - numItems2) / (i + 0.333f));
        }
        return numItems;
    }

    private void A02() {
        this.A06.A2E(0);
        setLayoutManager(this.A06);
        setSaveEnabled(false);
        setSnapDelegate(this);
        MS.A0K(this);
    }

    private void A04(int i, int i2) {
        if (i == this.A03 && i2 == this.A02) {
            return;
        }
        this.A03 = i;
        if (A08[1].charAt(11) == 'q') {
            throw new RuntimeException();
        }
        A08[6] = "hNBaptvkpj";
        this.A02 = i2;
        if (this.A04 != null) {
            throw new NullPointerException(A01(0, 13, FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION));
        }
    }

    @Override // com.facebook.ads.redexgen.X.ViewOnTouchListenerC01451h
    public final void A22(int i, boolean z) {
        super.A22(i, z);
        A04(i, 0);
    }

    @Override // com.facebook.ads.redexgen.X.PX
    public final int A7G(int i) {
        int iAbs = Math.abs(i);
        if (iAbs <= ((ViewOnTouchListenerC01451h) this).A06) {
            return 0;
        }
        int i2 = this.A01;
        if (i2 == 0) {
            return 1;
        }
        return 1 + (iAbs / i2);
    }

    public int getChildSpacing() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.F9, android.view.View
    public final void onMeasure(int i, int itemSize) {
        int iRound;
        int iA00;
        super.onMeasure(i, itemSize);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.A05) {
            iRound = (((int) Lr.A00) * JR.A0C(getContext())) + paddingTop;
        } else {
            iRound = Math.round(getMeasuredWidth() / 1.91f);
        }
        int mode = View.MeasureSpec.getMode(itemSize);
        if (mode == Integer.MIN_VALUE) {
            iRound = Math.min(View.MeasureSpec.getSize(itemSize), iRound);
        } else if (mode == 1073741824) {
            iRound = View.MeasureSpec.getSize(itemSize);
        }
        int i2 = iRound - paddingTop;
        if (this.A05) {
            iA00 = Math.min(C0659Ms.A09, i2);
        } else {
            iA00 = A00(i2);
        }
        setMeasuredDimension(getMeasuredWidth(), iA00 + paddingTop);
        if (!this.A05) {
            setChildWidth((this.A00 * 2) + iA00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.F9
    public void setAdapter(@Nullable C4H c4h) {
        this.A06.A2L(c4h == null ? -1 : c4h.hashCode());
        super.setAdapter(c4h);
    }

    public void setChildSpacing(int i) {
        this.A00 = i;
    }

    public void setChildWidth(int i) {
        this.A01 = i;
        int measuredWidth = getMeasuredWidth();
        this.A06.A2M((((measuredWidth - getPaddingLeft()) - getPaddingRight()) - this.A01) / 2);
        this.A06.A2K(((double) this.A01) / ((double) measuredWidth));
    }

    public void setCurrentPosition(int i) {
        A22(i, false);
    }

    public void setOnPageChangedListener(InterfaceC0662Mv interfaceC0662Mv) {
        this.A04 = interfaceC0662Mv;
    }

    public void setShowTextInCarousel(boolean z) {
        this.A05 = z;
    }
}
