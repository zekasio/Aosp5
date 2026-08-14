package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0477Fl {
    public static String[] A04 = {"HGHzNcawqnVFgJx8ceQNwcxcn1SDkpDb", "AD2ta0a", "biSUTEi4nYJndXTTLsT", "38FOXeSW4cnwnxdXp60to", "WtyRCcfaPM", "iLolo35", "fvJAwdggv90DLF", "FbA7S8K"};
    public final int A00;

    @Nullable
    public final FY A01;
    public final long A02;
    public final CopyOnWriteArrayList<C0476Fk> A03;

    public C0477Fl() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public C0477Fl(CopyOnWriteArrayList<C0476Fk> copyOnWriteArrayList, int i, @Nullable FY fy, long j) {
        this.A03 = copyOnWriteArrayList;
        this.A00 = i;
        this.A01 = fy;
        this.A02 = j;
    }

    private long A00(long j) {
        long jA01 = AG.A01(j);
        if (jA01 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.A02;
        if (A04[2].length() != 19) {
            throw new RuntimeException();
        }
        A04[7] = "vQJR5ZN";
        return j2 + jA01;
    }

    private void A01(Handler handler, Runnable runnable) {
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    @CheckResult
    public final C0477Fl A02(int i, @Nullable FY fy, long j) {
        return new C0477Fl(this.A03, i, fy, j);
    }

    public final void A03() {
        IK.A04(this.A01 != null);
        for (C0476Fk listenerAndHandler : this.A03) {
            A01(listenerAndHandler.A00, new RunnableC0467Fb(this, listenerAndHandler.A01));
        }
    }

    public final void A04() {
        IK.A04(this.A01 != null);
        for (C0476Fk listenerAndHandler : this.A03) {
            A01(listenerAndHandler.A00, new RunnableC0468Fc(this, listenerAndHandler.A01));
        }
    }

    public final void A05() {
        IK.A04(this.A01 != null);
        Iterator<C0476Fk> it = this.A03.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A04[7].length() != 7) {
                throw new RuntimeException();
            }
            A04[2] = "JAadAeVCHcunsRCfoQL";
            if (zHasNext) {
                C0476Fk listenerAndHandler = it.next();
                A01(listenerAndHandler.A00, new RunnableC0473Fh(this, listenerAndHandler.A01));
            } else {
                return;
            }
        }
    }

    public final void A06(int i, @Nullable Format format, int i2, @Nullable Object obj, long j) {
        A0C(new C0479Fn(1, i, format, i2, obj, A00(j), -9223372036854775807L));
    }

    public final void A07(Handler handler, InterfaceC0480Fo interfaceC0480Fo) {
        IK.A03((handler == null || interfaceC0480Fo == null) ? false : true);
        this.A03.add(new C0476Fk(handler, interfaceC0480Fo));
    }

    public final void A08(C0478Fm c0478Fm, C0479Fn c0479Fn) {
        for (C0476Fk c0476Fk : this.A03) {
            A01(c0476Fk.A00, new RunnableC0471Ff(this, c0476Fk.A01, c0478Fm, c0479Fn));
        }
    }

    public final void A09(C0478Fm c0478Fm, C0479Fn c0479Fn) {
        for (C0476Fk c0476Fk : this.A03) {
            A01(c0476Fk.A00, new RunnableC0470Fe(this, c0476Fk.A01, c0478Fm, c0479Fn));
        }
    }

    public final void A0A(C0478Fm c0478Fm, C0479Fn c0479Fn) {
        for (C0476Fk c0476Fk : this.A03) {
            A01(c0476Fk.A00, new RunnableC0469Fd(this, c0476Fk.A01, c0478Fm, c0479Fn));
        }
    }

    public final void A0B(C0478Fm c0478Fm, C0479Fn c0479Fn, IOException iOException, boolean z) {
        for (C0476Fk listenerAndHandler : this.A03) {
            A01(listenerAndHandler.A00, new RunnableC0472Fg(this, listenerAndHandler.A01, c0478Fm, c0479Fn, iOException, z));
        }
    }

    public final void A0C(C0479Fn c0479Fn) {
        for (C0476Fk c0476Fk : this.A03) {
            A01(c0476Fk.A00, new RunnableC0475Fj(this, c0476Fk.A01, c0479Fn));
        }
    }

    public final void A0D(InterfaceC0480Fo interfaceC0480Fo) {
        for (C0476Fk c0476Fk : this.A03) {
            if (c0476Fk.A01 == interfaceC0480Fo) {
                this.A03.remove(c0476Fk);
            }
        }
    }

    public final void A0E(C0526Hi c0526Hi, int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2, long j3) {
        A0A(new C0478Fm(c0526Hi, j3, 0L, 0L), new C0479Fn(i, i2, format, i3, obj, A00(j), A00(j2)));
    }

    public final void A0F(C0526Hi c0526Hi, int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2, long j3, long j4, long j5) {
        A08(new C0478Fm(c0526Hi, j3, j4, j5), new C0479Fn(i, i2, format, i3, obj, A00(j), A00(j2)));
    }

    public final void A0G(C0526Hi c0526Hi, int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2, long j3, long j4, long j5) {
        A09(new C0478Fm(c0526Hi, j3, j4, j5), new C0479Fn(i, i2, format, i3, obj, A00(j), A00(j2)));
    }

    public final void A0H(C0526Hi c0526Hi, int i, int i2, @Nullable Format format, int i3, @Nullable Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z) {
        A0B(new C0478Fm(c0526Hi, j3, j4, j5), new C0479Fn(i, i2, format, i3, obj, A00(j), A00(j2)), iOException, z);
    }
}
