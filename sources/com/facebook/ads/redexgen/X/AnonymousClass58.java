package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.58, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class AnonymousClass58 implements View.OnLongClickListener {
    public final /* synthetic */ AnonymousClass59 A00;

    public AnonymousClass58(AnonymousClass59 anonymousClass59) {
        this.A00 = anonymousClass59;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.A00.A0B != null && this.A00.A06 != null) {
            this.A00.A0B.setBounds(0, 0, this.A00.A06.getWidth(), this.A00.A06.getHeight());
            this.A00.A0B.A0D(!this.A00.A0B.A0E());
        }
        return true;
    }
}
