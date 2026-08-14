package com.applovin.exoplayer2.d;

import android.os.Looper;
import com.applovin.exoplayer2.d.f;
import com.applovin.exoplayer2.d.g;
import com.applovin.exoplayer2.d.h;
import com.applovin.exoplayer2.v;

/* JADX INFO: loaded from: classes.dex */
public interface h {
    public static final h b;

    @Deprecated
    public static final h c;

    public interface a {
        public static final a b = new a() { // from class: com.applovin.exoplayer2.d.h$a$$ExternalSyntheticLambda0
            @Override // com.applovin.exoplayer2.d.h.a
            public final void release() {
                h.a.CC.a();
            }
        };

        /* JADX INFO: renamed from: com.applovin.exoplayer2.d.h$a$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            static {
                a aVar = a.b;
            }

            public static /* synthetic */ void a() {
            }
        }

        void release();
    }

    int a(v vVar);

    a a(Looper looper, g.a aVar, v vVar);

    void a();

    f b(Looper looper, g.a aVar, v vVar);

    void b();

    static {
        h hVar = new h() { // from class: com.applovin.exoplayer2.d.h.1
            @Override // com.applovin.exoplayer2.d.h
            public /* synthetic */ a a(Looper looper, g.a aVar, v vVar) {
                return CC.$default$a(this, looper, aVar, vVar);
            }

            @Override // com.applovin.exoplayer2.d.h
            public /* synthetic */ void a() {
                CC.$default$a(this);
            }

            @Override // com.applovin.exoplayer2.d.h
            public /* synthetic */ void b() {
                CC.$default$b(this);
            }

            @Override // com.applovin.exoplayer2.d.h
            public f b(Looper looper, g.a aVar, v vVar) {
                if (vVar.o == null) {
                    return null;
                }
                return new l(new f.a(new t(1), 6001));
            }

            @Override // com.applovin.exoplayer2.d.h
            public int a(v vVar) {
                return vVar.o != null ? 1 : 0;
            }
        };
        b = hVar;
        c = hVar;
    }

    /* JADX INFO: renamed from: com.applovin.exoplayer2.d.h$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$a(h _this) {
        }

        public static void $default$b(h _this) {
        }

        public static a $default$a(h _this, Looper looper, g.a aVar, v vVar) {
            return a.b;
        }
    }
}
