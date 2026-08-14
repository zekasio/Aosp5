package com.applovin.exoplayer2.e.h;

import android.net.Uri;
import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.l;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.y;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class c implements com.applovin.exoplayer2.e.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f321a = new l() { // from class: com.applovin.exoplayer2.e.h.c$$ExternalSyntheticLambda0
        @Override // com.applovin.exoplayer2.e.l
        public /* synthetic */ com.applovin.exoplayer2.e.h[] a(Uri uri, Map map) {
            return createExtractors();
        }

        @Override // com.applovin.exoplayer2.e.l
        public final com.applovin.exoplayer2.e.h[] createExtractors() {
            return c.a();
        }
    };
    private j b;
    private h c;
    private boolean d;

    @Override // com.applovin.exoplayer2.e.h
    public void c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.applovin.exoplayer2.e.h[] a() {
        return new com.applovin.exoplayer2.e.h[]{new c()};
    }

    @Override // com.applovin.exoplayer2.e.h
    public boolean a(com.applovin.exoplayer2.e.i iVar) throws IOException {
        try {
            return b(iVar);
        } catch (ai unused) {
            return false;
        }
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(j jVar) {
        this.b = jVar;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(long j, long j2) {
        h hVar = this.c;
        if (hVar != null) {
            hVar.a(j, j2);
        }
    }

    @Override // com.applovin.exoplayer2.e.h
    public int a(com.applovin.exoplayer2.e.i iVar, u uVar) throws IOException {
        com.applovin.exoplayer2.l.a.a(this.b);
        if (this.c == null) {
            if (!b(iVar)) {
                throw ai.b("Failed to determine bitstream type", null);
            }
            iVar.a();
        }
        if (!this.d) {
            x xVarA = this.b.a(0, 1);
            this.b.a();
            this.c.a(this.b, xVarA);
            this.d = true;
        }
        return this.c.a(iVar, uVar);
    }

    private boolean b(com.applovin.exoplayer2.e.i iVar) throws IOException {
        e eVar = new e();
        if (eVar.a(iVar, true) && (eVar.b & 2) == 2) {
            int iMin = Math.min(eVar.i, 8);
            y yVar = new y(iMin);
            iVar.d(yVar.d(), 0, iMin);
            if (b.a(a(yVar))) {
                this.c = new b();
            } else if (i.a(a(yVar))) {
                this.c = new i();
            } else if (g.a(a(yVar))) {
                this.c = new g();
            }
            return true;
        }
        return false;
    }

    private static y a(y yVar) {
        yVar.d(0);
        return yVar;
    }
}
