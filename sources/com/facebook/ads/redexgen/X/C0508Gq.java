package com.facebook.ads.redexgen.X;

import android.util.SparseArray;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0508Gq {
    public C0502Gk A00;
    public C0504Gm A01;
    public final int A02;
    public final int A03;
    public final SparseArray<C0506Go> A08 = new SparseArray<>();
    public final SparseArray<C0501Gj> A06 = new SparseArray<>();
    public final SparseArray<C0503Gl> A07 = new SparseArray<>();
    public final SparseArray<C0501Gj> A04 = new SparseArray<>();
    public final SparseArray<C0503Gl> A05 = new SparseArray<>();

    public C0508Gq(int i, int i2) {
        this.A03 = i;
        this.A02 = i2;
    }

    public final void A00() {
        this.A08.clear();
        this.A06.clear();
        this.A07.clear();
        this.A04.clear();
        this.A05.clear();
        this.A00 = null;
        this.A01 = null;
    }
}
