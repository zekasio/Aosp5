package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0653Mm implements View.OnClickListener {
    public final /* synthetic */ C1U A00;
    public final /* synthetic */ C0583Jp A01;
    public final /* synthetic */ C0654Mn A02;
    public final /* synthetic */ InterfaceC0657Mq A03;
    public final /* synthetic */ String A04;

    public ViewOnClickListenerC0653Mm(C0654Mn c0654Mn, C0583Jp c0583Jp, InterfaceC0657Mq interfaceC0657Mq, String str, C1U c1u) {
        this.A02 = c0654Mn;
        this.A01 = c0583Jp;
        this.A03 = interfaceC0657Mq;
        this.A04 = str;
        this.A00 = c1u;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A01.A02(EnumC0582Jo.A0A, null);
            if (this.A02.A02.A0O(this.A02.A03.A00(), true)) {
                this.A03.A8j(this.A04, this.A00);
            } else if (!TextUtils.isEmpty(this.A00.A00())) {
                LZ.A0E(new LZ(), this.A02.A03, C0617La.A00(this.A00.A00()), this.A04);
            }
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
