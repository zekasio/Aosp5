package com.applovin.exoplayer2.e;

import android.net.Uri;
import com.applovin.exoplayer2.e.l;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f376a = new l() { // from class: com.applovin.exoplayer2.e.l$$ExternalSyntheticLambda0
        @Override // com.applovin.exoplayer2.e.l
        public /* synthetic */ h[] a(Uri uri, Map map) {
            return createExtractors();
        }

        @Override // com.applovin.exoplayer2.e.l
        public final h[] createExtractors() {
            return l.CC.a();
        }
    };

    h[] a(Uri uri, Map<String, List<String>> map);

    h[] createExtractors();

    /* JADX INFO: renamed from: com.applovin.exoplayer2.e.l$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        static {
            l lVar = l.f376a;
        }

        public static /* synthetic */ h[] a() {
            return new h[0];
        }
    }
}
