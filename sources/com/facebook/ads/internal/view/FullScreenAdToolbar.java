package com.facebook.ads.internal.view;

import android.graphics.drawable.GradientDrawable;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.redexgen.X.AbstractC0656Mp;
import com.facebook.ads.redexgen.X.C01391b;
import com.facebook.ads.redexgen.X.C0583Jp;
import com.facebook.ads.redexgen.X.C0654Mn;
import com.facebook.ads.redexgen.X.C0947Xy;
import com.facebook.ads.redexgen.X.C1K;
import com.facebook.ads.redexgen.X.C1U;
import com.facebook.ads.redexgen.X.InterfaceC0655Mo;
import com.facebook.ads.redexgen.X.InterfaceC0657Mq;
import com.facebook.ads.redexgen.X.Lr;
import com.facebook.ads.redexgen.X.MS;
import com.facebook.ads.redexgen.X.NA;
import com.facebook.ads.redexgen.X.PZ;
import com.facebook.ads.redexgen.X.ViewOnClickListenerC0661Mu;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class FullScreenAdToolbar extends AbstractC0656Mp {
    public static byte[] A07;
    public static String[] A08 = {"elaUgpg", "xyZ5KhWZZkOCw26QnbyRE89VYXYHkT38", "j2Hg99bd5kkvFLrtwtqoGvtE7T", "FtK0h2Y990QReQxCoMrwn7Y", "09p430KvfvIa5D7TMMbG57be7BWhVuc0", "4K9Dg6G4rdQDm1ubILJxRl9GbBVTjarc", "MQsbPX4", "ODYsITK"};
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;

    @Nullable
    public InterfaceC0655Mo A00;
    public final RelativeLayout A01;
    public final C0583Jp A02;
    public final C0654Mn A03;
    public final InterfaceC0657Mq A04;
    public final NA A05;
    public final PZ A06;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 113);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A07 = new byte[]{-26, Ascii.SI, Ascii.DC2, Ascii.SYN, 8, -61, -28, 7, 56, 75, 86, 85, 88, 90, 6, 39, 74};
    }

    static {
        A03();
        A09 = (int) (Lr.A00 * 10.0f);
        A0D = (int) (Lr.A00 * 16.0f);
        int i = A0D;
        int i2 = A09;
        A0B = i - i2;
        A0C = (i * 2) - i2;
        A0A = (int) (Lr.A00 * 4.0f);
    }

    public FullScreenAdToolbar(C0947Xy c0947Xy, InterfaceC0657Mq interfaceC0657Mq, C0583Jp c0583Jp, @ToolbarActionView$ToolbarActionMode int i, int i2) {
        super(c0947Xy);
        this.A04 = interfaceC0657Mq;
        this.A02 = c0583Jp;
        setGravity(16);
        this.A05 = new NA(c0947Xy, i);
        this.A05.setContentDescription(A02(0, 8, 50));
        this.A05.setActionClickListener(new ViewOnClickListenerC0661Mu(this));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i3 = A0B;
        layoutParams.setMargins(i3, i3, A0C, i3);
        addView(this.A05, layoutParams);
        this.A01 = new RelativeLayout(c0947Xy);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        layoutParams2.weight = 1.0f;
        this.A06 = new PZ(c0947Xy);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        this.A06.setLayoutParams(layoutParams3);
        this.A01.addView(this.A06);
        addView(this.A01, layoutParams2);
        this.A03 = new C0654Mn(c0947Xy, i2);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -1);
        int i4 = A0D;
        layoutParams4.setMargins(0, i4 / 2, i4 / 2, i4 / 2);
        addView(this.A03, layoutParams4);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0656Mp
    public final void A04(C1K c1k, boolean z) {
        int iA04 = c1k.A04(z);
        this.A06.A01(c1k.A0A(z), iA04);
        this.A03.setIconColors(iA04);
        this.A03.setContentDescription(A02(8, 9, 117));
        this.A05.setColors(iA04);
        if (z) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-1778384896, 0});
            gradientDrawable.setCornerRadius(0.0f);
            MS.A0S(this, gradientDrawable);
            MS.A0Q(this.A03, 0, ViewCompat.MEASURED_STATE_MASK, A0A);
            return;
        }
        MS.A0M(this, 0);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0656Mp
    public final boolean A05() {
        return this.A05.A02();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0656Mp
    public int getToolbarHeight() {
        return AbstractC0656Mp.A00;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0656Mp
    public void setAdReportingVisible(boolean z) {
        this.A03.setVisibility(z ? 0 : 8);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0656Mp
    public void setPageDetails(C1U c1u, String str, int i, C01391b c01391b) {
        this.A05.setInitialUnskippableSeconds(i);
        this.A06.setPageDetails(c1u);
        this.A03.setAdDetails(c1u, str, this.A02, this.A04);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0656Mp
    public void setPageDetailsVisible(boolean z) {
        this.A01.removeAllViews();
        if (z) {
            RelativeLayout relativeLayout = this.A01;
            PZ pz = this.A06;
            if (A08[4].charAt(4) != '3') {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[2] = "uYrc95dj4mq6YR3RipRhNZPjST";
            strArr[3] = "ufyXPPKrvmASdIniU0CJIS9";
            relativeLayout.addView(pz);
        }
        NA na = this.A05;
        String[] strArr2 = A08;
        if (strArr2[2].length() == strArr2[3].length()) {
            na.setToolbarMessageEnabled(!z);
        } else {
            A08[1] = "RoBBOPMqmB8G6B1FErbRchWOJuWn3pgq";
            na.setToolbarMessageEnabled(!z);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0656Mp
    public void setProgress(float f) {
        this.A05.setProgress(f);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0656Mp
    public void setProgressSpinnerInvisible(boolean z) {
        this.A05.setProgressSpinnerInvisible(z);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0656Mp
    public void setToolbarActionMessage(String str) {
        this.A05.setToolbarMessage(str);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0656Mp
    public void setToolbarActionMode(@ToolbarActionView$ToolbarActionMode int i) {
        this.A05.setToolbarActionMode(i);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0656Mp
    public void setToolbarListener(InterfaceC0655Mo interfaceC0655Mo) {
        this.A00 = interfaceC0655Mo;
    }
}
