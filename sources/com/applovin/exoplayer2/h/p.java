package com.applovin.exoplayer2.h;

import android.os.Handler;
import com.applovin.exoplayer2.ba;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public interface p {

    /* JADX INFO: renamed from: com.applovin.exoplayer2.h.p$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static ba $default$h(p _this) {
            return null;
        }

        public static boolean $default$i(p _this) {
            return true;
        }
    }

    public interface b {
        void onSourceInfoRefreshed(p pVar, ba baVar);
    }

    void a(Handler handler, com.applovin.exoplayer2.d.g gVar);

    void a(Handler handler, q qVar);

    void a(com.applovin.exoplayer2.d.g gVar);

    void a(n nVar);

    void a(b bVar);

    void a(b bVar, com.applovin.exoplayer2.k.aa aaVar);

    void a(q qVar);

    n b(a aVar, com.applovin.exoplayer2.k.b bVar, long j);

    void b(b bVar);

    void c(b bVar);

    void e() throws IOException;

    com.applovin.exoplayer2.ab g();

    ba h();

    boolean i();

    public static final class a extends o {
        public a(Object obj) {
            super(obj);
        }

        public a(Object obj, long j, int i) {
            super(obj, j, i);
        }

        public a(Object obj, int i, int i2, long j) {
            super(obj, i, i2, j);
        }

        public a(o oVar) {
            super(oVar);
        }

        @Override // com.applovin.exoplayer2.h.o
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(Object obj) {
            return new a(super.a(obj));
        }
    }
}
