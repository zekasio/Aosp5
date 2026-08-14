package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.facebook.ads.RewardData;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class OU extends FrameLayout {
    public static String[] A07 = {"Lu0oG19N", "JNY", "Ev6F9eDhg42RHlCeRuJfEtiFO07AluFn", "qSbaO4FE34QcNqD1YWxCxyT8wr5s9kWw", "hZddA1hSD7Y", "v9TnLSaOxYneacolptRVdRHaZQ0ab06L", "iyW9tyIIQvF7WQz3LOxNHXxa074IcWbN", "vzh"};

    @Nullable
    public AbstractC0656Mp A00;
    public final AnonymousClass18 A01;
    public final C0947Xy A02;
    public final InterfaceC0657Mq A03;
    public final OT A04;

    @Nullable
    public final QK A05;
    public final View[] A06;

    public OU(C0702Oj c0702Oj, AnonymousClass18 anonymousClass18, @Nullable QK qk, C0565Ix c0565Ix, OJ oj, InterfaceC0657Mq interfaceC0657Mq, OT ot) {
        this(c0702Oj, anonymousClass18, qk, interfaceC0657Mq, ot, c0565Ix, oj);
    }

    public OU(C0702Oj c0702Oj, AnonymousClass18 anonymousClass18, @Nullable QK qk, InterfaceC0657Mq interfaceC0657Mq, OT ot, View... viewArr) {
        this(c0702Oj.A05(), c0702Oj.A08(), anonymousClass18, qk, interfaceC0657Mq, ot, viewArr);
    }

    public OU(C0947Xy c0947Xy, @Nullable AbstractC0656Mp abstractC0656Mp, AnonymousClass18 anonymousClass18, @Nullable QK qk, InterfaceC0657Mq interfaceC0657Mq, OT ot, View... viewArr) {
        super(c0947Xy);
        this.A02 = c0947Xy;
        this.A00 = abstractC0656Mp;
        this.A01 = anonymousClass18;
        this.A06 = viewArr;
        this.A03 = interfaceC0657Mq;
        this.A05 = qk;
        this.A04 = ot;
        A03();
    }

    private void A03() {
        String title;
        RewardData rewardDataA0M = this.A01.A0M();
        if (rewardDataA0M == null) {
            title = this.A01.A0Q().A05();
        } else {
            title = this.A01.A0Q().A06(rewardDataA0M.getCurrency(), rewardDataA0M.getQuantity());
        }
        C0666Mz c0666Mz = new C0666Mz(this.A02, -1, ViewCompat.MEASURED_STATE_MASK, title, null, this.A01.A0Q().A04(), this.A01.A0Q().A03(), C0642Mb.A01(EnumC0641Ma.REWARD_ICON));
        c0666Mz.A02.setOnClickListener(new OR(this));
        c0666Mz.A01.setOnClickListener(new OS(this));
        addView(c0666Mz, new RelativeLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        QK qk = this.A05;
        if (qk != null) {
            qk.A0a(Q1.A07);
        }
        this.A04.A9x();
        if (!this.A01.A0O().A0O()) {
            this.A01.A0h(this.A03);
        }
    }

    public final void A07(ViewGroup viewGroup) {
        QK qk = this.A05;
        if (qk != null && !qk.A0j()) {
            this.A05.A0f(false, false, 11);
            MS.A0N(this.A05, 4);
        }
        AbstractC0656Mp abstractC0656Mp = this.A00;
        String[] strArr = A07;
        if (strArr[7].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A07[0] = "vGH3jzSu";
        if (abstractC0656Mp != null) {
            MS.A0H(abstractC0656Mp);
        }
        for (View view : this.A06) {
            view.clearAnimation();
            MS.A0N(view, 4);
        }
        viewGroup.addView(this, new RelativeLayout.LayoutParams(-1, -1));
        this.A04.ABQ();
    }
}
