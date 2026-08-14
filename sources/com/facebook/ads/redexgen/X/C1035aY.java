package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.SystemClock;
import java.util.HashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1035aY extends C02766m {
    public final Context A00;
    public final ApplicationInfo A01;
    public final C6C A02;
    public final C7F A03;

    public C1035aY(Context context, C6C c6c) {
        super(context, c6c);
        this.A01 = context.getApplicationInfo();
        this.A00 = context;
        this.A02 = c6c;
        this.A03 = C7F.A00(this.A00, this.A02.A0a(), this.A02.A0g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"Nullable Dereference"})
    public C7A A05(HashMap<Integer, C1036aZ> map) {
        return new Y7(SystemClock.elapsedRealtime(), A02(), map, AnonymousClass79.A06);
    }

    public final InterfaceC02856v A0G() {
        return new C1046aj(this);
    }

    public final InterfaceC02856v A0H() {
        return new C1048al(this);
    }

    public final InterfaceC02856v A0I() {
        return new C1049am(this);
    }

    public final InterfaceC02856v A0J() {
        return new C1053aq(this);
    }

    public final InterfaceC02856v A0K() {
        return new C1041ae(this);
    }

    public final InterfaceC02856v A0L() {
        return new C1038ab(this);
    }

    public final InterfaceC02856v A0M() {
        return new C1045ai(this);
    }

    public final InterfaceC02856v A0N() {
        return new C1044ah(this);
    }

    public final InterfaceC02856v A0O() {
        return new C1040ad(this);
    }

    public final InterfaceC02856v A0P() {
        return new C1037aa(this);
    }

    public final InterfaceC02856v A0Q() {
        return new C1039ac(this);
    }

    public final InterfaceC02856v A0R() {
        return new C1042af(this);
    }

    public final InterfaceC02856v A0S() {
        return new C1043ag(this);
    }

    public final InterfaceC02856v A0T() {
        return new C1055as(this);
    }

    public final InterfaceC02856v A0U() {
        return new C1054ar(this);
    }

    public final InterfaceC02856v A0V() {
        return new C1052ap(this);
    }

    public final InterfaceC02856v A0W() {
        return new C1051ao(this);
    }

    public final InterfaceC02856v A0X() {
        return new C1050an(this);
    }

    public final InterfaceC02856v A0Y() {
        return new C1047ak(this);
    }
}
