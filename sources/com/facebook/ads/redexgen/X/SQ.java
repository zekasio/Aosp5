package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class SQ extends FrameLayout implements InterfaceC0658Mr {
    public static final RelativeLayout.LayoutParams A0D = new RelativeLayout.LayoutParams(-1, -1);
    public boolean A00;
    public final AnonymousClass18 A01;
    public final C7U A02;
    public final C0947Xy A03;
    public final InterfaceC0575Jh A04;
    public final C0583Jp A05;
    public final MK A06;
    public final AbstractC0656Mp A07;
    public final InterfaceC0657Mq A08;
    public final NI A09;
    public final C0767Qw A0A;
    public final MF A0B;

    @DoNotStrip
    public final AbstractC0766Qv A0C;

    public abstract void A0Q();

    public abstract void A0S(AnonymousClass59 anonymousClass59);

    public abstract boolean A0T();

    public SQ(C0947Xy c0947Xy, NI ni, InterfaceC0575Jh interfaceC0575Jh, AnonymousClass18 anonymousClass18, C7U c7u, InterfaceC0657Mq interfaceC0657Mq) {
        super(c0947Xy);
        this.A0C = new SU(this);
        this.A06 = new MK();
        this.A00 = false;
        this.A03 = c0947Xy;
        this.A09 = ni;
        this.A04 = interfaceC0575Jh;
        this.A01 = anonymousClass18;
        this.A02 = c7u;
        this.A08 = interfaceC0657Mq;
        this.A05 = new C0583Jp(this.A01.A0U(), this.A04);
        this.A0A = new C0767Qw(this, 1, new WeakReference(this.A0C), this.A03);
        this.A0A.A0W(this.A01.A0H());
        this.A0A.A0X(this.A01.A0I());
        this.A07 = A0N();
        this.A0B = new MF(this);
        this.A0B.A05(ME.A03);
    }

    private AbstractC0656Mp A0N() {
        FullScreenAdToolbar fullScreenAdToolbar = new FullScreenAdToolbar(this.A03, this.A08, this.A05, 1, this.A01.A0F());
        int iA03 = this.A01.A0O().A0D().A03();
        fullScreenAdToolbar.setPageDetails(this.A01.A0R(), this.A01.A0U(), iA03, this.A01.A0S());
        fullScreenAdToolbar.A04(this.A01.A0N().A01(), true);
        if (iA03 < 0 && this.A01.A0O().A0M()) {
            fullScreenAdToolbar.setToolbarActionMode(4);
        }
        fullScreenAdToolbar.setToolbarListener(new SR(this));
        return fullScreenAdToolbar;
    }

    private void A0O() {
        if (this.A01.A0O().A0P()) {
            PR prA0B = new PP(this.A03, this.A01.A0O().A0E(), this.A01.A0R()).A08(this.A01.A0N().A01()).A0B();
            C0585Jr.A04(prA0B, this.A05, EnumC0582Jo.A0U);
            addView(prA0B, A0D);
            prA0B.A04(new SS(this));
            return;
        }
        A0Q();
    }

    public final void A0P() {
        if (!this.A00) {
            this.A0A.A0U();
            this.A00 = true;
        }
    }

    public final void A0R(int i, L8 l8) {
        new C0628Ll(i, new ST(this, i, l8)).A07();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0658Mr
    public final void A8n(Intent intent, @Nullable Bundle bundle, AnonymousClass59 anonymousClass59) {
        this.A08.A3I(this, A0D);
        A0S(anonymousClass59);
        A0O();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0658Mr
    public final void AEI(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0658Mr
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onDestroy() {
        this.A0B.A03();
        if (!TextUtils.isEmpty(this.A01.A0U())) {
            this.A04.A8v(this.A01.A0U(), new OG().A03(this.A0A).A02(this.A06).A05());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A06.A06(this.A03, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setListener(InterfaceC0657Mq interfaceC0657Mq) {
    }

    public void setUpFullscreenMode(boolean z) {
        ME me;
        if (Build.VERSION.SDK_INT < 19) {
            return;
        }
        if (z) {
            me = ME.A04;
        } else {
            me = ME.A03;
        }
        this.A0B.A05(me);
    }
}
