package com.applovin.exoplayer2.k;

import android.content.Context;
import com.applovin.exoplayer2.k.i;
import com.applovin.exoplayer2.k.q;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class p implements i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f588a;
    private final aa b;
    private final i.a c;

    public p(Context context, String str) {
        this(context, str, (aa) null);
    }

    public p(Context context, String str, aa aaVar) {
        this(context, aaVar, new q.a().a(str));
    }

    public p(Context context, aa aaVar, i.a aVar) {
        this.f588a = context.getApplicationContext();
        this.b = aaVar;
        this.c = aVar;
    }

    @Override // com.applovin.exoplayer2.k.i.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public o c() {
        o oVar = new o(this.f588a, this.c.c());
        aa aaVar = this.b;
        if (aaVar != null) {
            oVar.a(aaVar);
        }
        return oVar;
    }
}
