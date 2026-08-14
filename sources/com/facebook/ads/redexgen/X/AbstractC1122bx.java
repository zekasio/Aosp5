package com.facebook.ads.redexgen.X;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1122bx extends C4P {
    public static String[] A01 = {"ufm8s7LRmOM7", "sIBwdoM05ajejE", "0NxvrnR7UZDHrBy4xVhLU5lsqzWJ5R3x", "FsILnIqpIa8iE3wffvJrO4tNlZdDmpUd", "wKnqjXSh8f61FKWyknAGi8xlXXoDdiLA", "lpMPMGmveEx5YZPPZgDkriuB4nzdouJK", "fQPzW90JHWOApVaaQbndX59CGXgCnXlm", "Pp9SKBa6RS3IfLIGXA9e4oeVKGHa5CsE"};
    public boolean A00 = true;

    public abstract boolean A0R(AbstractC02244l abstractC02244l);

    public abstract boolean A0S(AbstractC02244l abstractC02244l);

    public abstract boolean A0T(AbstractC02244l abstractC02244l, int i, int i2, int i3, int i4);

    public abstract boolean A0U(AbstractC02244l abstractC02244l, AbstractC02244l abstractC02244l2, int i, int i2, int i3, int i4);

    @Override // com.facebook.ads.redexgen.X.C4P
    public final boolean A0D(@NonNull AbstractC02244l abstractC02244l) {
        return !this.A00 || abstractC02244l.A0b();
    }

    @Override // com.facebook.ads.redexgen.X.C4P
    public final boolean A0E(@NonNull AbstractC02244l abstractC02244l, @Nullable C4O c4o, @NonNull C4O c4o2) {
        if (c4o != null && (c4o.A01 != c4o2.A01 || c4o.A03 != c4o2.A03)) {
            return A0T(abstractC02244l, c4o.A01, c4o.A03, c4o2.A01, c4o2.A03);
        }
        return A0R(abstractC02244l);
    }

    @Override // com.facebook.ads.redexgen.X.C4P
    public final boolean A0F(@NonNull AbstractC02244l abstractC02244l, @NonNull C4O c4o, @Nullable C4O c4o2) {
        int i = c4o.A01;
        int i2 = c4o.A03;
        View view = abstractC02244l.A0H;
        int left = c4o2 == null ? view.getLeft() : c4o2.A01;
        int newLeft = c4o2 == null ? view.getTop() : c4o2.A03;
        if (!abstractC02244l.A0c() && (i != left || i2 != newLeft)) {
            view.layout(left, newLeft, view.getWidth() + left, view.getHeight() + newLeft);
            return A0T(abstractC02244l, i, i2, left, newLeft);
        }
        return A0S(abstractC02244l);
    }

    @Override // com.facebook.ads.redexgen.X.C4P
    public final boolean A0G(@NonNull AbstractC02244l abstractC02244l, @NonNull C4O c4o, @NonNull C4O c4o2) {
        if (c4o.A01 != c4o2.A01 || c4o.A03 != c4o2.A03) {
            return A0T(abstractC02244l, c4o.A01, c4o.A03, c4o2.A01, c4o2.A03);
        }
        A0O(abstractC02244l);
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.C4P
    public final boolean A0H(@NonNull AbstractC02244l abstractC02244l, @NonNull AbstractC02244l abstractC02244l2, @NonNull C4O c4o, @NonNull C4O c4o2) {
        int fromTop;
        int toLeft;
        int i = c4o.A01;
        int i2 = c4o.A03;
        if (abstractC02244l2.A0h()) {
            fromTop = c4o.A01;
            toLeft = c4o.A03;
        } else {
            fromTop = c4o2.A01;
            toLeft = c4o2.A03;
        }
        if (A01[1].length() != 14) {
            throw new RuntimeException();
        }
        A01[1] = "7F8ns227Orjao7";
        return A0U(abstractC02244l, abstractC02244l2, i, i2, fromTop, toLeft);
    }

    public final void A0N(AbstractC02244l abstractC02244l) {
        A0C(abstractC02244l);
    }

    public final void A0O(AbstractC02244l abstractC02244l) {
        A0C(abstractC02244l);
    }

    public final void A0P(AbstractC02244l abstractC02244l) {
        A0C(abstractC02244l);
    }

    public final void A0Q(AbstractC02244l abstractC02244l, boolean z) {
        A0C(abstractC02244l);
    }
}
