package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.48, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class AnonymousClass48 {
    public int A00;
    public int A01;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public boolean A09;
    public boolean A0B = true;
    public int A02 = 0;
    public boolean A0A = false;
    public List<AbstractC02244l> A08 = null;

    private View A00() {
        int size = this.A08.size();
        for (int i = 0; i < size; i++) {
            View view = this.A08.get(i).A0H;
            C4U c4u = (C4U) view.getLayoutParams();
            if (!c4u.A02()) {
                int i2 = this.A01;
                int i3 = c4u.A00();
                if (i2 == i3) {
                    A02(view);
                    return view;
                }
            }
        }
        return null;
    }

    private final View A01(View closest) {
        int i = this.A08.size();
        View view = null;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < i; i3++) {
            View view2 = this.A08.get(i3).A0H;
            C4U c4u = (C4U) view2.getLayoutParams();
            if (view2 != closest && !c4u.A02()) {
                int iA00 = c4u.A00();
                int closestDistance = this.A01;
                int i4 = iA00 - closestDistance;
                int closestDistance2 = this.A03;
                int i5 = i4 * closestDistance2;
                if (i5 >= 0 && i5 < i2) {
                    view = view2;
                    i2 = i5;
                    if (i5 == 0) {
                        break;
                    }
                }
            }
        }
        return view;
    }

    private final void A02(View view) {
        View viewA01 = A01(view);
        if (viewA01 == null) {
            this.A01 = -1;
        } else {
            this.A01 = ((C4U) viewA01.getLayoutParams()).A00();
        }
    }

    public final View A03(C02144b c02144b) {
        if (this.A08 != null) {
            return A00();
        }
        View viewA0G = c02144b.A0G(this.A01);
        this.A01 += this.A03;
        return viewA0G;
    }

    public final void A04() {
        A02(null);
    }

    public final boolean A05(C02214i c02214i) {
        int i = this.A01;
        return i >= 0 && i < c02214i.A03();
    }
}
