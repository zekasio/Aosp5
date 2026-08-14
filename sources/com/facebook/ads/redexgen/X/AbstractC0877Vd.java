package com.facebook.ads.redexgen.X;

import android.os.Handler;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0877Vd implements InterfaceC0466Fa {
    public XH A00;
    public B1 A01;
    public Object A02;
    public final ArrayList<FZ> A04 = new ArrayList<>(1);
    public final C0477Fl A03 = new C0477Fl();

    public abstract void A02();

    public abstract void A03(XH xh, boolean z);

    public final C0477Fl A00(@Nullable FY fy) {
        return this.A03.A02(0, fy, 0L);
    }

    public final void A01(B1 b1, @Nullable Object obj) {
        this.A01 = b1;
        this.A02 = obj;
        Iterator<FZ> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().ACM(this, b1, obj);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0466Fa
    public final void A3C(Handler handler, InterfaceC0480Fo interfaceC0480Fo) {
        this.A03.A07(handler, interfaceC0480Fo);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0466Fa
    public final void ADJ(XH xh, boolean z, FZ fz) {
        XH xh2 = this.A00;
        IK.A03(xh2 == null || xh2 == xh);
        this.A04.add(fz);
        if (this.A00 == null) {
            this.A00 = xh;
            A03(xh, z);
        } else {
            B1 b1 = this.A01;
            if (b1 == null) {
                return;
            }
            fz.ACM(this, b1, this.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0466Fa
    public final void ADt(FZ fz) {
        this.A04.remove(fz);
        if (this.A04.isEmpty()) {
            this.A00 = null;
            this.A01 = null;
            this.A02 = null;
            A02();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0466Fa
    public final void ADv(InterfaceC0480Fo interfaceC0480Fo) {
        this.A03.A0D(interfaceC0480Fo);
    }
}
