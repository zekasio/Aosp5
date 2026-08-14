package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0960Yl extends C02766m {
    public final Context A00;

    public C0960Yl(Context context, C6C c6c) {
        super(context, c6c);
        this.A00 = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"Nullable Dereference"})
    public C7A A03(HashMap<String, C0961Ym> map) {
        return new Y7(SystemClock.elapsedRealtime(), A02(), map, AnonymousClass79.A0C);
    }

    public final InterfaceC02856v A0G(List<C02846u> list, EnumC02816r enumC02816r) {
        return new C0962Yn(this, list, enumC02816r);
    }
}
