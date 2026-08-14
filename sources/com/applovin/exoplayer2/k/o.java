package com.applovin.exoplayer2.k;

import android.content.Context;
import android.net.Uri;
import com.applovin.exoplayer2.k.i;
import com.applovin.exoplayer2.k.q;
import com.applovin.exoplayer2.l.ai;
import com.tapjoy.TJAdUnitConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class o implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f586a;
    private final List<aa> b = new ArrayList();
    private final i c;
    private i d;
    private i e;
    private i f;
    private i g;
    private i h;
    private i i;
    private i j;
    private i k;

    public static final class a implements i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f587a;
        private final i.a b;
        private aa c;

        public a(Context context) {
            this(context, new q.a());
        }

        public a(Context context, i.a aVar) {
            this.f587a = context.getApplicationContext();
            this.b = aVar;
        }

        @Override // com.applovin.exoplayer2.k.i.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public o c() {
            o oVar = new o(this.f587a, this.b.c());
            aa aaVar = this.c;
            if (aaVar != null) {
                oVar.a(aaVar);
            }
            return oVar;
        }
    }

    public o(Context context, i iVar) {
        this.f586a = context.getApplicationContext();
        this.c = (i) com.applovin.exoplayer2.l.a.b(iVar);
    }

    @Override // com.applovin.exoplayer2.k.i
    public void a(aa aaVar) {
        com.applovin.exoplayer2.l.a.b(aaVar);
        this.c.a(aaVar);
        this.b.add(aaVar);
        a(this.d, aaVar);
        a(this.e, aaVar);
        a(this.f, aaVar);
        a(this.g, aaVar);
        a(this.h, aaVar);
        a(this.i, aaVar);
        a(this.j, aaVar);
    }

    @Override // com.applovin.exoplayer2.k.i
    public long a(l lVar) throws IOException {
        com.applovin.exoplayer2.l.a.b(this.k == null);
        String scheme = lVar.f581a.getScheme();
        if (ai.a(lVar.f581a)) {
            String path = lVar.f581a.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                this.k = f();
            } else {
                this.k = e();
            }
        } else if ("asset".equals(scheme)) {
            this.k = f();
        } else if ("content".equals(scheme)) {
            this.k = g();
        } else if ("rtmp".equals(scheme)) {
            this.k = h();
        } else if ("udp".equals(scheme)) {
            this.k = d();
        } else if (TJAdUnitConstants.String.DATA.equals(scheme)) {
            this.k = i();
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            this.k = j();
        } else {
            this.k = this.c;
        }
        return this.k.a(lVar);
    }

    @Override // com.applovin.exoplayer2.k.g
    public int a(byte[] bArr, int i, int i2) throws IOException {
        return ((i) com.applovin.exoplayer2.l.a.b(this.k)).a(bArr, i, i2);
    }

    @Override // com.applovin.exoplayer2.k.i
    public Uri a() {
        i iVar = this.k;
        if (iVar == null) {
            return null;
        }
        return iVar.a();
    }

    @Override // com.applovin.exoplayer2.k.i
    public Map<String, List<String>> b() {
        i iVar = this.k;
        return iVar == null ? Collections.emptyMap() : iVar.b();
    }

    @Override // com.applovin.exoplayer2.k.i
    public void c() throws IOException {
        i iVar = this.k;
        if (iVar != null) {
            try {
                iVar.c();
            } finally {
                this.k = null;
            }
        }
    }

    private i d() {
        if (this.h == null) {
            ab abVar = new ab();
            this.h = abVar;
            a(abVar);
        }
        return this.h;
    }

    private i e() {
        if (this.d == null) {
            s sVar = new s();
            this.d = sVar;
            a(sVar);
        }
        return this.d;
    }

    private i f() {
        if (this.e == null) {
            c cVar = new c(this.f586a);
            this.e = cVar;
            a(cVar);
        }
        return this.e;
    }

    private i g() {
        if (this.f == null) {
            f fVar = new f(this.f586a);
            this.f = fVar;
            a(fVar);
        }
        return this.f;
    }

    private i h() {
        if (this.g == null) {
            try {
                i iVar = (i) Class.forName("com.applovin.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                this.g = iVar;
                a(iVar);
            } catch (ClassNotFoundException unused) {
                com.applovin.exoplayer2.l.q.c("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating RTMP extension", e);
            }
            if (this.g == null) {
                this.g = this.c;
            }
        }
        return this.g;
    }

    private i i() {
        if (this.i == null) {
            h hVar = new h();
            this.i = hVar;
            a(hVar);
        }
        return this.i;
    }

    private i j() {
        if (this.j == null) {
            x xVar = new x(this.f586a);
            this.j = xVar;
            a(xVar);
        }
        return this.j;
    }

    private void a(i iVar) {
        for (int i = 0; i < this.b.size(); i++) {
            iVar.a(this.b.get(i));
        }
    }

    private void a(i iVar, aa aaVar) {
        if (iVar != null) {
            iVar.a(aaVar);
        }
    }
}
