package com.iab.omid.library.vungle.b;

import android.view.View;
import com.iab.omid.library.vungle.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.vungle.e.a f1598a;
    private final String b;
    private final FriendlyObstructionPurpose c;
    private final String d;

    public c(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f1598a = new com.iab.omid.library.vungle.e.a(view);
        this.b = view.getClass().getCanonicalName();
        this.c = friendlyObstructionPurpose;
        this.d = str;
    }

    public com.iab.omid.library.vungle.e.a a() {
        return this.f1598a;
    }

    public String b() {
        return this.b;
    }

    public FriendlyObstructionPurpose c() {
        return this.c;
    }

    public String d() {
        return this.d;
    }
}
