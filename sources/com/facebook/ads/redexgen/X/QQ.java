package com.facebook.ads.redexgen.X;

import android.graphics.Paint;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class QQ extends Paint {
    public final /* synthetic */ QR A00;
    public final /* synthetic */ boolean A01;

    public QQ(QR qr, boolean z) {
        this.A00 = qr;
        this.A01 = z;
        setStyle(Paint.Style.FILL_AND_STROKE);
        setStrokeCap(Paint.Cap.ROUND);
        setStrokeWidth(3.0f);
        setAntiAlias(true);
        setColor(this.A01 ? -1 : -10066330);
    }
}
