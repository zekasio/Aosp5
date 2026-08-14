package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.33, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass33 extends E4 implements Handler.Callback {
    public static String[] A0D = {"fagSsoac43UJSJG", "PL0Df5XObPsMjoFT3sU6Lp83XbviyP8R", "k75ap2fxOZvkqr2FjEQ9d3Y", "qEZm9kPptvCV49j1bDgJYwonF92a", "8QH8MqTnW7KMzd9bL", "CjrIcpNXno9M2QOeMZvTD2WdktHrPs5P", "AfT76Pf2kDJi2th", "sZbuEqgSWLt9Albo4x4yfDH"};
    public int A00;
    public int A01;
    public Format A02;
    public VS A03;
    public C0403Bx A04;
    public AbstractC0395Bp A05;
    public AbstractC0395Bp A06;
    public boolean A07;
    public boolean A08;
    public final Handler A09;
    public final AZ A0A;
    public final InterfaceC0492Ga A0B;
    public final InterfaceC0493Gb A0C;

    public AnonymousClass33(InterfaceC0493Gb interfaceC0493Gb, Looper looper) {
        this(interfaceC0493Gb, looper, InterfaceC0492Ga.A00);
    }

    public AnonymousClass33(InterfaceC0493Gb interfaceC0493Gb, Looper looper, InterfaceC0492Ga interfaceC0492Ga) {
        super(3);
        this.A0C = (InterfaceC0493Gb) IK.A01(interfaceC0493Gb);
        this.A09 = looper == null ? null : new Handler(looper, this);
        this.A0B = interfaceC0492Ga;
        this.A0A = new AZ();
    }

    private long A00() {
        int i = this.A01;
        if (i == -1 || i >= this.A06.A6c()) {
            return Long.MAX_VALUE;
        }
        return this.A06.A6b(this.A01);
    }

    private void A01() {
        A06(Collections.emptyList());
    }

    private void A02() {
        this.A04 = null;
        this.A01 = -1;
        AbstractC0395Bp abstractC0395Bp = this.A06;
        if (abstractC0395Bp != null) {
            abstractC0395Bp.A08();
            this.A06 = null;
        }
        AbstractC0395Bp abstractC0395Bp2 = this.A05;
        if (abstractC0395Bp2 != null) {
            abstractC0395Bp2.A08();
            this.A05 = null;
        }
    }

    private void A03() {
        A02();
        this.A03.ADm();
        this.A03 = null;
        this.A00 = 0;
    }

    private void A04() {
        A03();
        this.A03 = this.A0B.A4G(this.A02);
    }

    private void A05(List<GX> list) {
        this.A0C.AAS(list);
    }

    private void A06(List<GX> list) {
        Handler handler = this.A09;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            A05(list);
        }
    }

    @Override // com.facebook.ads.redexgen.X.E4
    public final void A12() {
        this.A02 = null;
        A01();
        A03();
    }

    @Override // com.facebook.ads.redexgen.X.E4
    public final void A15(long j, boolean z) {
        A01();
        this.A07 = false;
        this.A08 = false;
        if (this.A00 != 0) {
            A04();
            return;
        }
        A02();
        VS vs = this.A03;
        String[] strArr = A0D;
        if (strArr[2].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        A0D[1] = "SIdEizz9oP1X0InrrFd2Zym6xF4ie8Hi";
        vs.flush();
    }

    @Override // com.facebook.ads.redexgen.X.E4
    public final void A17(Format[] formatArr, long j) throws AM {
        this.A02 = formatArr[0];
        if (this.A03 != null) {
            this.A00 = 1;
        } else {
            this.A03 = this.A0B.A4G(this.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.X.XG
    public final boolean A8R() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.X.XG
    public final boolean A8c() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
    @Override // com.facebook.ads.redexgen.X.XG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ADz(long r10, long r12) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass33.ADz(long, long):void");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0375Au
    public final int AF7(Format format) {
        if (this.A0B.AF8(format)) {
            return E4.A0x(null, format.A0H) ? 4 : 2;
        }
        if (C0544Ic.A0A(format.A0O)) {
            return 1;
        }
        return 0;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            A05((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }
}
