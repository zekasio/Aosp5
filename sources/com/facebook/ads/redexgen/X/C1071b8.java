package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.ThreadSafe;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.b8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ThreadSafe
public final class C1071b8 implements C6E {
    public EnumC02866w A00;
    public C7K A01;
    public C7L A02;
    public final C6C A03;
    public final C02716h A04;
    public final AtomicBoolean A05 = new AtomicBoolean();

    public C1071b8(C6C c6c, C02716h c02716h) {
        this.A03 = c6c;
        this.A04 = c02716h;
    }

    private final synchronized void A04() {
        if (this.A02 != null && this.A05.get()) {
            this.A01.A01(this.A02);
            C7G.A00().A04();
            this.A04.A02();
            this.A05.compareAndSet(true, false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [com.facebook.ads.redexgen.X.7L] */
    public final synchronized void A05(final EnumC02866w enumC02866w) {
        if (this.A05.get() || enumC02866w == null) {
            return;
        }
        if (this.A03.A0k() && C7J.A0E(enumC02866w)) {
            this.A01 = new C7K(C7G.A00().A03().getLooper());
            this.A00 = enumC02866w;
            final Runnable runnable = new Runnable(enumC02866w) { // from class: com.facebook.ads.redexgen.X.6G
                public EnumC02866w A00;

                {
                    this.A00 = enumC02866w;
                }

                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    if (L0.A02(this)) {
                        return;
                    }
                    try {
                        this.A01.A04.A04(EnumC02886y.A03, this.A00, null);
                        this.A01.A01.A02(this.A01.A02, TimeUnit.SECONDS.toMillis(this.A01.A03.A0T()));
                    } catch (Throwable th) {
                        L0.A00(th, this);
                    }
                }
            };
            this.A02 = new Runnable(runnable) { // from class: com.facebook.ads.redexgen.X.7L
                public final Runnable A00;

                {
                    this.A00 = runnable;
                }

                @Override // java.lang.Runnable
                @SuppressLint({"CatchGeneralException"})
                public final void run() throws Throwable {
                    if (L0.A02(this)) {
                        return;
                    }
                    try {
                        this.A00.run();
                    } catch (Throwable t) {
                        try {
                            C6O.A03(t);
                        } catch (Throwable t2) {
                            L0.A00(t2, this);
                        }
                    }
                }
            };
            this.A04.A03(enumC02866w);
            this.A01.A00(this.A02);
            this.A05.compareAndSet(false, true);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C6E
    public final synchronized void AFL(EnumC02866w enumC02866w) {
        if (this.A00 == enumC02866w) {
            return;
        }
        this.A00 = enumC02866w;
        if (enumC02866w == EnumC02866w.A04) {
            A04();
        } else {
            A05(enumC02866w);
        }
    }
}
