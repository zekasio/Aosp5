package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.gms.drive.MetadataChangeSet;
import cz.msebera.android.httpclient.HttpStatus;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0819Sw extends AbstractC0698Of {
    public static byte[] A06;
    public static String[] A07 = {"1qM0UqBuKeNFs4931PZdKXfB5ZchECK5", "3ZSmcCEAG5Dz0dWrJNlp2MNszP7YT25A", "Vrvau7r1HMpQKQXhvyVkTfJZAsfHOW4A", "oVRoE2FdK0le1s2SfNIozg00Kc9sH4MP", "npYoVlwUwM4clRwIxvjz9nauDkw8jySV", "7Yuh663Y", "kkRlGGIMUj7iwn7pYEfT9Vq54HRzcbQk", "UynwTjbvMY6JmtelA"};
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public KX A00;

    @Nullable
    public C0548Ig A01;
    public IT A02;
    public final AnonymousClass18 A03;
    public final C1B A04;
    public final OJ A05;

    public static String A0A(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 22);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        A06 = new byte[]{9, 5, 7, 68, Ascii.FF, Ascii.VT, 9, Ascii.SI, 8, 5, 5, 1, 68, Ascii.VT, Ascii.SO, Ascii.EM, 68, 3, 4, Ascii.RS, Ascii.SI, Ascii.CAN, Ascii.EM, Ascii.RS, 3, Ascii.RS, 3, Ascii.VT, 6, 68, 9, 6, 3, 9, 1, Ascii.SI, Ascii.SO, 92, 75, 89, 79, 92, 74, 75, 74, 113, 88, 71, 74, 75, 65};
    }

    static {
        A0B();
        A0B = (int) (Lr.A00 * 48.0f);
        A0F = (int) (Lr.A00 * 16.0f);
        A08 = (int) (Lr.A00 * 4.0f);
        A0E = (int) (Lr.A00 * 44.0f);
        A0C = (int) (Lr.A00 * 8.0f);
        A0D = (int) (Lr.A00 * 12.0f);
        A0H = (int) (Lr.A00 * 12.0f);
        A0G = (int) (Lr.A00 * 26.0f);
        A09 = C2U.A01(-1, 77);
        A0A = C2U.A01(A09, 90);
    }

    public AbstractC0819Sw(C0702Oj c0702Oj, boolean z) {
        super(c0702Oj, z);
        this.A03 = c0702Oj.A04();
        this.A04 = this.A03.A0O();
        this.A05 = A09(c0702Oj);
        AbstractC0656Mp abstractC0656MpA08 = c0702Oj.A08();
        if (abstractC0656MpA08 != null) {
            abstractC0656MpA08.setLayoutParams(new RelativeLayout.LayoutParams(-1, abstractC0656MpA08.getToolbarHeight()));
            abstractC0656MpA08.setPageDetailsVisible(false);
        }
    }

    private OJ A09(C0702Oj c0702Oj) {
        String strA0A;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        if (c0702Oj.A04().A0Y().equals(A0A(37, 14, 56))) {
            strA0A = Q9.A04.A02();
        } else {
            strA0A = A0A(0, 37, MetadataChangeSet.CUSTOM_PROPERTY_SIZE_LIMIT_BYTES);
        }
        C0820Sx c0820Sx = new C0820Sx(c0702Oj.A05(), A0B, this.A04.A0E().A00() == C1G.A05, getColors(), this.A04.A0F().A06(), strA0A, c0702Oj.A06(), c0702Oj.A09(), c0702Oj.A0B(), c0702Oj.A07());
        this.A02 = new IT(c0820Sx, HttpStatus.SC_BAD_REQUEST, 100, 0);
        MS.A0K(c0820Sx);
        c0820Sx.A0A(c0702Oj.A00());
        addView(c0820Sx, layoutParams);
        return c0820Sx;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0698Of
    public void A0b(C1B c1b, String str, double d, @Nullable Bundle bundle) {
        super.A0b(c1b, str, d, bundle);
        this.A05.setInfo(c1b.A0E(), c1b.A0F(), str, this.A03.A0R().A01(), null);
    }

    public final int A0e(@Nullable AbstractC0656Mp abstractC0656Mp) {
        return abstractC0656Mp == null ? AbstractC0656Mp.A00 : abstractC0656Mp.getToolbarHeight();
    }

    public void A0f() {
        View expandableLayout = getAdDetailsView().getExpandableLayout();
        if (expandableLayout != null) {
            this.A00 = new KX(true);
            C0548Ig c0548Ig = this.A01;
            if (c0548Ig != null) {
                KX kx = this.A00;
                if (A07[0].charAt(30) == 'l') {
                    throw new RuntimeException();
                }
                A07[7] = "KTvg88bTO6HmKn15GgbH1";
                kx.A0I(c0548Ig);
            }
            C1K c1kA01 = this.A03.A0N().A01();
            this.A00.A0I(new IV(getAdDetailsView().getCTAButton(), HttpStatus.SC_MULTIPLE_CHOICES, -1, c1kA01.A09(true)));
            this.A00.A0I(new C0549Ih(getAdDetailsView().getCTAButton(), HttpStatus.SC_MULTIPLE_CHOICES, MS.A08(A09, A0A, A08), MS.A05(c1kA01.A08(true), A08)));
            this.A00.A0I(new IY(expandableLayout, 150, false));
            this.A00.A0H(2300);
        }
    }

    public AnonymousClass18 getAdDataBundle() {
        return this.A03;
    }

    public IT getAdDetailsAnimation() {
        return this.A02;
    }

    public OJ getAdDetailsView() {
        return this.A05;
    }

    public C1B getAdInfo() {
        return this.A04;
    }

    public KX getAnimationPlugin() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0698Of, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getAdDetailsView().A0A(configuration.orientation);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View expandableLayout = getAdDetailsView().getExpandableLayout();
        if (expandableLayout == null || !z) {
            return;
        }
        C0548Ig c0548Ig = this.A01;
        if (A07[2].charAt(30) != '4') {
            throw new RuntimeException();
        }
        A07[0] = "AO2Vor543jhYYkt1oYijcT7buZTkR3eI";
        if (c0548Ig == null) {
            this.A01 = new C0548Ig(expandableLayout, HttpStatus.SC_MULTIPLE_CHOICES, expandableLayout.getHeight(), 0);
            this.A00.A0I(this.A01);
            this.A00.A0G();
        }
    }
}
