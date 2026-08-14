package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8U, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C8U extends ContextWrapper {
    public final C8W A00;
    public final AtomicReference<String> A01;

    public C8U(Context context, C8W c8w) {
        super(context.getApplicationContext());
        this.A01 = new AtomicReference<>();
        this.A00 = c8w;
    }

    public final C0946Xx A00() {
        return this.A00.A7M(this);
    }

    public final C8V A01() {
        return this.A00.A5q(this);
    }

    public final C8X A02() {
        return this.A00.A6V(this);
    }

    public final C8Z A03() {
        return this.A00.A7L(this);
    }

    public final InterfaceC03098a A04() {
        return this.A00.A7d();
    }

    public final InterfaceC03178l A05() {
        return this.A00.A6L(this);
    }

    public final InterfaceC03288y A06() {
        return this.A00.A6M(this);
    }

    public final C9P A07() {
        return this.A00.A7T();
    }

    public final InterfaceC0575Jh A08() {
        return this.A00.A5c(A00());
    }

    public final InterfaceC0587Jt A09() {
        return this.A00.A7N(A00());
    }

    @Nullable
    public final String A0A() {
        return this.A01.get();
    }

    public final void A0B(@Nullable String str) {
        this.A01.set(str);
    }
}
