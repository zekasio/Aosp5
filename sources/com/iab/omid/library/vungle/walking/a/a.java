package com.iab.omid.library.vungle.walking.a;

import com.iab.omid.library.vungle.walking.a.b;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final HashSet<String> f1617a;
    protected final JSONObject b;
    protected final long c;

    public a(b.InterfaceC0096b interfaceC0096b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC0096b);
        this.f1617a = new HashSet<>(hashSet);
        this.b = jSONObject;
        this.c = j;
    }
}
