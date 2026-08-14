package com.tapjoy.internal;

import com.tapjoy.internal.r3;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q3 extends r3 {
    public final HashSet<String> c;
    public final JSONObject d;
    public final long e;

    public q3(r3.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar);
        this.c = new HashSet<>(hashSet);
        this.d = jSONObject;
        this.e = j;
    }
}
