package com.applovin.exoplayer2.k;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.common.base.Predicate;
import com.applovin.exoplayer2.k.i;
import com.applovin.exoplayer2.k.t;
import com.facebook.ads.AdError;
import com.tapjoy.TJAdUnitConstants;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface t extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Predicate<String> f592a = new Predicate() { // from class: com.applovin.exoplayer2.k.t$$ExternalSyntheticLambda0
        @Override // com.applovin.exoplayer2.common.base.Predicate
        public final boolean apply(Object obj) {
            return t.CC.a((String) obj);
        }
    };

    public interface b extends i.a {
        @Override // com.applovin.exoplayer2.k.i.a
        /* synthetic */ i a();

        t c();

        /* JADX INFO: renamed from: com.applovin.exoplayer2.k.t$b$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<String, String> f593a = new HashMap();
        private Map<String, String> b;

        public synchronized Map<String, String> a() {
            if (this.b == null) {
                this.b = Collections.unmodifiableMap(new HashMap(this.f593a));
            }
            return this.b;
        }
    }

    /* JADX INFO: renamed from: com.applovin.exoplayer2.k.t$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        static {
            Predicate<String> predicate = t.f592a;
        }

        public static /* synthetic */ boolean a(String str) {
            if (str == null) {
                return false;
            }
            String lowerCase = Ascii.toLowerCase(str);
            if (TextUtils.isEmpty(lowerCase)) {
                return false;
            }
            return ((lowerCase.contains("text") && !lowerCase.contains("text/vtt")) || lowerCase.contains(TJAdUnitConstants.String.HTML) || lowerCase.contains("xml")) ? false : true;
        }
    }

    public static class c extends j {
        public final l b;
        public final int c;

        private static int a(int i, int i2) {
            if (i == 2000 && i2 == 1) {
                return 2001;
            }
            return i;
        }

        public static c a(IOException iOException, l lVar, int i) {
            int i2;
            String message = iOException.getMessage();
            if (iOException instanceof SocketTimeoutException) {
                i2 = 2002;
            } else if (iOException instanceof InterruptedIOException) {
                i2 = 1004;
            } else {
                i2 = (message == null || !Ascii.toLowerCase(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
            }
            if (i2 == 2007) {
                return new a(iOException, lVar);
            }
            return new c(iOException, lVar, i2, i);
        }

        public c(l lVar, int i, int i2) {
            super(a(i, i2));
            this.b = lVar;
            this.c = i2;
        }

        public c(String str, l lVar, int i, int i2) {
            super(str, a(i, i2));
            this.b = lVar;
            this.c = i2;
        }

        public c(IOException iOException, l lVar, int i, int i2) {
            super(iOException, a(i, i2));
            this.b = lVar;
            this.c = i2;
        }

        public c(String str, IOException iOException, l lVar, int i, int i2) {
            super(str, iOException, a(i, i2));
            this.b = lVar;
            this.c = i2;
        }
    }

    public static final class a extends c {
        public a(IOException iOException, l lVar) {
            super("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, lVar, 2007, 1);
        }
    }

    public static final class d extends c {
        public final String d;

        public d(String str, l lVar) {
            super("Invalid content type: " + str, lVar, AdError.INTERNAL_ERROR_2003, 1);
            this.d = str;
        }
    }

    public static final class e extends c {
        public final int d;
        public final String e;
        public final Map<String, List<String>> f;
        public final byte[] g;

        public e(int i, String str, IOException iOException, Map<String, List<String>> map, l lVar, byte[] bArr) {
            super("Response code: " + i, iOException, lVar, AdError.INTERNAL_ERROR_2004, 1);
            this.d = i;
            this.e = str;
            this.f = map;
            this.g = bArr;
        }
    }
}
