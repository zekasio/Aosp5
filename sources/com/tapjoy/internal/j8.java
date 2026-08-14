package com.tapjoy.internal;

import com.tapjoy.TapjoyConstants;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j8<Result> extends n1<Result> {
    @Override // com.tapjoy.internal.n1
    public Result a() {
        return (Result) super.a();
    }

    @Override // com.tapjoy.internal.n1
    public Map<String, Object> b() {
        Map<String, Object> mapB = super.b();
        z6 z6Var = z6.r;
        mapB.put("sdk_ver", z6Var.m + "/Android");
        mapB.put("api_key", z6Var.l);
        if (a.b) {
            mapB.put(TapjoyConstants.TJC_DEBUG, true);
        }
        return mapB;
    }

    @Override // com.tapjoy.internal.n1
    public Result a(z0 z0Var) throws IOException {
        ((a1) z0Var).B();
        return null;
    }
}
