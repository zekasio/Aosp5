package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@SuppressLint({"DeprecatedMethod"})
public final class C0935Xm implements InterfaceC03288y {
    public final C8U A00;

    public C0935Xm(C8U c8u) {
        this.A00 = c8u;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03288y
    public final void A3R(Throwable th) {
        C03238t.A0E(th);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03288y
    public final void A8F(String str) {
        C0586Js.A08(this.A00, str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03288y
    public final void A8y(String str, int i, AnonymousClass90 anonymousClass90) {
        C03238t.A06(this.A00, str, i, anonymousClass90);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03288y
    public final void A8z(String str, int i, AnonymousClass90 anonymousClass90) {
        C03238t.A06(this.A00, str, i, anonymousClass90);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03288y
    public final void A98(long j, long j2, long j3, long j4, int i, @Nullable Exception exc) {
        AnonymousClass94.A03(this.A00, j, j2, j3, j4, i, exc);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03288y
    public final void A9I(String str, int i, AnonymousClass90 anonymousClass90) {
        C03238t.A07(this.A00, str, i, anonymousClass90);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03288y
    public final void A9Q(String str, int i, AnonymousClass90 anonymousClass90) {
        C03238t.A08(this.A00, str, i, anonymousClass90);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03288y
    public final void A9W() {
        this.A00.A02().A9W();
    }
}
