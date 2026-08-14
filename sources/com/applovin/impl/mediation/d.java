package com.applovin.impl.mediation;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1011a;

    @Override // com.applovin.impl.mediation.e
    public /* synthetic */ void b() {
        Log.d("Java8FeatureTest", "Java 8 Default method feature test getDummyInteger(): " + a());
    }

    public d(int i) {
        this.f1011a = i;
    }

    @Override // com.applovin.impl.mediation.e
    public int a() {
        return this.f1011a;
    }
}
