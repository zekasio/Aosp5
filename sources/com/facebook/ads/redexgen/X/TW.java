package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class TW extends RelativeLayout implements InterfaceC0658Mr {
    public static byte[] A0D;
    public static String[] A0E = {"fqT9snXDZkE2N6bIU2twhbCcrvrF5wQR", "W8MK3buqarkLhDixdfnbfGeXuw3i87xB", "M5iWaw3OwwKxChS5bTa9KUrj63pwu1Od", "QKu8TlGQ3D7NsDDaY", "OUnrWL6BanKvWJF", "644mHU9zQQHAcSiNB", "MqQzuM0GD0HqxOL2854PPJvoiao7nama", "mSpdOD621tCilusEUOf234Jx9LR3KzyX"};
    public View A00;

    @Nullable
    public C0628Ll A01;

    @Nullable
    public PR A02;
    public boolean A03;
    public boolean A04;
    public AnonymousClass19 A05;
    public final MF A06;
    public final InterfaceC0657Mq A07;
    public final C1200dJ A08;
    public final C0947Xy A09;
    public final InterfaceC0575Jh A0A;
    public final C0583Jp A0B;
    public final AbstractC0656Mp A0C;

    public static String A0L(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0O() {
        A0D = new byte[]{88, 84, 86, Ascii.NAK, 93, 90, 88, 94, 89, 84, 84, 80, Ascii.NAK, 90, 95, 72, Ascii.NAK, 82, 85, 79, 94, 73, 72, 79, 82, 79, 82, 90, 87, Ascii.NAK, 82, 86, 75, 73, 94, 72, 72, 82, 84, 85, Ascii.NAK, 87, 84, 92, 92, 94, 95};
    }

    public abstract boolean A0a();

    @ToolbarActionView$ToolbarActionMode
    public abstract int getCloseButtonStyle();

    static {
        A0O();
    }

    public TW(C0947Xy c0947Xy, InterfaceC0575Jh interfaceC0575Jh, InterfaceC0657Mq interfaceC0657Mq, C1200dJ c1200dJ) {
        super(c0947Xy);
        this.A04 = false;
        this.A03 = false;
        this.A09 = c0947Xy;
        this.A0A = interfaceC0575Jh;
        this.A07 = interfaceC0657Mq;
        this.A06 = new MF(this);
        this.A08 = c1200dJ;
        this.A0B = new C0583Jp(this.A08.A0U(), this.A0A);
        this.A0C = new FullScreenAdToolbar(this.A09, getAudienceNetworkListener(), this.A0B, 0, this.A08.A0F());
    }

    private C1K A0K(int i) {
        if (i == 1) {
            return this.A05.A01();
        }
        AnonymousClass19 anonymousClass19 = this.A05;
        if (A0E[2].charAt(7) != 'O') {
            throw new RuntimeException();
        }
        A0E[0] = "MYlveE6g4wScBr3MsnlZwbj0w3RA4Q0m";
        return anonymousClass19.A00();
    }

    private void A0M() {
        removeAllViews();
        MS.A0J(this);
    }

    private void A0N() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (A0X() && this.A02 == null) {
            this.A04 = true;
            this.A02 = new PP(this.A09, this.A08.A0O().A0E(), this.A08.A0R()).A08(this.A08.A0N().A01()).A0B();
            C0585Jr.A04(this.A02, this.A0B, EnumC0582Jo.A0U);
            this.A07.A3H(this, 0, layoutParams);
            this.A07.A3H(this.A02, 1, layoutParams);
            this.A02.A04(new TY(this));
            return;
        }
        this.A07.A3H(this, 0, layoutParams);
    }

    private void A0P(C1K c1k, boolean z) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A0C.getToolbarHeight());
        layoutParams.addRule(10);
        this.A0C.A04(c1k, z);
        addView(this.A0C, layoutParams);
    }

    public final void A0S() {
        View view = this.A00;
        if (view == null || !(view instanceof AbstractC0698Of)) {
            return;
        }
        if (A0Y()) {
            ((AbstractC0698Of) this.A00).A0a();
        } else {
            ((AbstractC0698Of) this.A00).A0Z();
        }
    }

    public final void A0T(int i) {
        this.A01 = new C0628Ll(i, new TX(this, i));
        this.A03 = true;
        A0S();
        this.A01.A07();
    }

    public final void A0U(View view, boolean z, int i) {
        this.A00 = view;
        this.A06.A05(ME.A03);
        A0M();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, z ? 0 : this.A0C.getToolbarHeight(), 0, 0);
        layoutParams.addRule(12);
        addView(view, layoutParams);
        C1K c1kA0K = A0K(i);
        A0P(c1kA0K, z);
        MS.A0M(this, c1kA0K.A07(false));
        if (this.A07 != null) {
            A0N();
            String[] strArr = A0E;
            if (strArr[3].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A0E[0] = "NsWlVTe7e8AxmZfep9MsD1WsEVvEb3lR";
            if (z && Build.VERSION.SDK_INT >= 19) {
                MF mf = this.A06;
                if (A0E[0].charAt(10) == 'o') {
                    throw new RuntimeException();
                }
                A0E[2] = "LlUUcmlOaTawHlOzciUSj9DhXPbTXBAe";
                mf.A05(ME.A04);
            }
        }
    }

    public final void A0V(AnonymousClass59 anonymousClass59) {
        this.A06.A04(anonymousClass59.A0H().getWindow());
        this.A05 = this.A08.A0N();
        C1B c1bA0O = null;
        if (this.A08.A0O() != null && this.A08.A0O() != null) {
            c1bA0O = this.A08.A0O();
        }
        this.A0C.setPageDetails(this.A08.A0R(), this.A08.A0U(), c1bA0O != null ? c1bA0O.A0D().A03() : 0, this.A08.A0S());
        this.A0C.setToolbarListener(new C0823Ta(this, anonymousClass59));
    }

    public final void A0W(AnonymousClass59 anonymousClass59) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(200L);
        alphaAnimation.setAnimationListener(new AnimationAnimationListenerC0664Mx(this, this, anonymousClass59));
        startAnimation(alphaAnimation);
    }

    public final boolean A0X() {
        if (!this.A08.A0c().isEmpty()) {
            boolean zA0P = this.A08.A0O().A0P();
            if (A0E[6].charAt(3) != 'z') {
                throw new RuntimeException();
            }
            A0E[2] = "rwsNokIOLx9Fj0KMvDMbhHWjcozH5rOe";
            if (zA0P) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0Y() {
        return this.A03;
    }

    public final boolean A0Z() {
        return this.A04;
    }

    public void ABj(boolean z) {
        C0628Ll c0628Ll = this.A01;
        if (c0628Ll != null && c0628Ll.A05()) {
            this.A01.A06();
        }
    }

    public void AC8(boolean z) {
        C0628Ll c0628Ll = this.A01;
        if (c0628Ll != null && !c0628Ll.A04()) {
            this.A01.A07();
        }
    }

    public InterfaceC0575Jh getAdEventManager() {
        return this.A0A;
    }

    public InterfaceC0657Mq getAudienceNetworkListener() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0658Mr
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    public void onDestroy() {
        this.A06.A03();
        this.A0C.setToolbarListener(null);
        A0M();
    }

    public void setImpressionRecordingFlag(MK mk) {
        mk.A05();
        if (getAudienceNetworkListener() != null) {
            getAudienceNetworkListener().A3s(A0L(0, 47, 106));
        }
    }

    public void setListener(InterfaceC0657Mq interfaceC0657Mq) {
    }
}
