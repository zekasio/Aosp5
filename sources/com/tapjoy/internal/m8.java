package com.tapjoy.internal;

import android.text.TextUtils;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class m8 extends j8<Void> {
    public final b5 d;
    public final v4 e;
    public final i5 f;
    public final String g;

    public m8(c5 c5Var, String str) {
        b5 b5Var = c5Var.c;
        v4 v4Var = c5Var.d;
        i5 i5Var = c5Var.e;
        this.d = b5Var;
        this.e = v4Var;
        this.f = i5Var;
        this.g = str;
    }

    @Override // com.tapjoy.internal.j8, com.tapjoy.internal.n1
    public Map<String, Object> b() {
        Map<String, Object> mapB = super.b();
        mapB.put(TJAdUnitConstants.String.VIDEO_INFO, new y0(a.a(this.d)));
        mapB.put(TapjoyConstants.TJC_APP_PLACEMENT, new y0(a.a(this.e)));
        mapB.put("user", new y0(a.a(this.f, (w4) null)));
        if (!TextUtils.isEmpty(this.g)) {
            mapB.put("push_token", this.g);
        }
        return mapB;
    }

    @Override // com.tapjoy.internal.n1
    public String c() {
        return "api/v1/tokens";
    }
}
