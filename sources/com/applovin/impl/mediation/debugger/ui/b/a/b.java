package com.applovin.impl.mediation.debugger.ui.b.a;

import android.content.Context;
import android.text.SpannedString;
import com.applovin.impl.b.a;
import com.applovin.impl.mediation.debugger.ui.d.c;

/* JADX INFO: loaded from: classes.dex */
public class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a.C0051a f1070a;
    private final Context o;
    private final boolean p;

    @Override // com.applovin.impl.mediation.debugger.ui.d.c
    public boolean c() {
        return true;
    }

    public b(a.C0051a c0051a, boolean z, Context context) {
        super(c.b.RIGHT_DETAIL);
        this.f1070a = c0051a;
        this.o = context;
        this.d = new SpannedString(c0051a.a());
        this.p = z;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.c
    public SpannedString i_() {
        return new SpannedString(this.f1070a.b(this.o));
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.c
    public boolean j_() {
        Boolean boolA = this.f1070a.a(this.o);
        if (boolA != null) {
            return boolA.equals(Boolean.valueOf(this.p));
        }
        return false;
    }
}
