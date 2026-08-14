package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.89, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass89 extends OI {
    public int A00;
    public boolean A01;
    public final AbstractC03329c<AnonymousClass88> A02;
    public final AbstractC03329c<AnonymousClass85> A03;
    public final AbstractC03329c<C0639Ly> A04;
    public final AbstractC03329c<AnonymousClass84> A05;
    public final AbstractC03329c<L1> A06;
    public final AbstractC03329c<C0611Ku> A07;
    public final AbstractC03329c<C0609Kr> A08;
    public final AbstractC03329c<C0595Kb> A09;
    public final AbstractC03329c<C0594Ka> A0A;
    public final QK A0B;
    public final L4 A0C;
    public final AbstractC0596Kc A0D;

    public AnonymousClass89(C0947Xy c0947Xy, InterfaceC0575Jh interfaceC0575Jh, QK qk, String str) {
        this(c0947Xy, interfaceC0575Jh, qk, new ArrayList(), str);
    }

    public AnonymousClass89(C0947Xy c0947Xy, InterfaceC0575Jh interfaceC0575Jh, QK qk, String str, @Nullable Bundle bundle) {
        this(c0947Xy, interfaceC0575Jh, qk, new ArrayList(), str, bundle, null);
    }

    public AnonymousClass89(C0947Xy c0947Xy, InterfaceC0575Jh interfaceC0575Jh, QK qk, String str, @Nullable Map<String, String> extraParams) {
        this(c0947Xy, interfaceC0575Jh, qk, new ArrayList(), str, null, extraParams);
    }

    public AnonymousClass89(C0947Xy c0947Xy, InterfaceC0575Jh interfaceC0575Jh, QK qk, List<C2A> list, String str) {
        super(c0947Xy, interfaceC0575Jh, qk, list, str, !qk.A0h(), new C0692Nz(c0947Xy, qk));
        this.A0D = new AbstractC0596Kc() { // from class: com.facebook.ads.redexgen.X.8C
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC03329c
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C0597Kd c0597Kd) {
                this.A00.A0Z();
            }
        };
        this.A07 = new QD(this);
        this.A03 = new QC(this);
        this.A04 = new QB(this);
        this.A05 = new QA(this);
        this.A02 = new C0739Pu(this);
        this.A06 = new PW(this);
        this.A09 = new PV(this);
        this.A0A = new C0708Op(this);
        this.A08 = new QF(this);
        this.A0C = new L4() { // from class: com.facebook.ads.redexgen.X.8D
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC03329c
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(LG lg) {
                AnonymousClass89 anonymousClass89 = this.A00;
                anonymousClass89.A00 = anonymousClass89.A0B.getDuration();
            }
        };
        this.A01 = false;
        this.A0B = qk;
        this.A0B.getEventBus().A03(this.A0D, this.A05, this.A07, this.A04, this.A03, this.A02, this.A06, this.A09, this.A0A, this.A0C, this.A08);
    }

    public AnonymousClass89(C0947Xy c0947Xy, InterfaceC0575Jh interfaceC0575Jh, QK qk, List<C2A> list, String str, @Nullable Bundle bundle, @Nullable Map<String, String> extraParams) {
        super(c0947Xy, interfaceC0575Jh, qk, list, str, !qk.A0h(), bundle, extraParams, new C0692Nz(c0947Xy, qk));
        this.A0D = new AbstractC0596Kc() { // from class: com.facebook.ads.redexgen.X.8C
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC03329c
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C0597Kd c0597Kd) {
                this.A00.A0Z();
            }
        };
        this.A07 = new QD(this);
        this.A03 = new QC(this);
        this.A04 = new QB(this);
        this.A05 = new QA(this);
        this.A02 = new C0739Pu(this);
        this.A06 = new PW(this);
        this.A09 = new PV(this);
        this.A0A = new C0708Op(this);
        this.A08 = new QF(this);
        this.A0C = new L4() { // from class: com.facebook.ads.redexgen.X.8D
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC03329c
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(LG lg) {
                AnonymousClass89 anonymousClass89 = this.A00;
                anonymousClass89.A00 = anonymousClass89.A0B.getDuration();
            }
        };
        this.A01 = false;
        this.A0B = qk;
        this.A0B.getEventBus().A03(this.A0D, this.A05, this.A07, this.A04, this.A03, this.A02, this.A06, this.A09, this.A0A, this.A08);
    }

    public final void A0g() {
        QE qe = new QE(this);
        if (this.A0B.A0l()) {
            MM.A00(qe);
        } else {
            this.A0B.getStateHandler().post(qe);
        }
    }
}
