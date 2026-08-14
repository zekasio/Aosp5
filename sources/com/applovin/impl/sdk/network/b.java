package com.applovin.impl.sdk.network;

import androidx.core.util.Consumer;
import com.applovin.impl.sdk.network.e;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.n;
import com.applovin.impl.sdk.utils.t;
import com.applovin.impl.sdk.utils.u;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinErrorCodes;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<String> f1369a = Arrays.asList("5.0/i", "4.0/ad", "1.0/mediate");
    private final p b;
    private final y c;
    private final e d;

    public interface c<T> {
        void a(int i, String str, T t);

        void a(T t, int i);
    }

    public b(p pVar) {
        this.b = pVar;
        this.c = pVar.L();
        e eVar = new e(pVar);
        this.d = eVar;
        eVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x01e0 A[Catch: all -> 0x0279, TryCatch #1 {all -> 0x0279, blocks: (B:41:0x00fc, B:43:0x010c, B:47:0x0133, B:46:0x012f, B:48:0x0142, B:51:0x0167, B:53:0x017b, B:55:0x0191, B:59:0x019c, B:68:0x01da, B:70:0x01e0, B:71:0x01fd, B:74:0x020c, B:76:0x0219, B:64:0x01be, B:66:0x01c4, B:54:0x0189, B:77:0x0220, B:79:0x0226, B:80:0x023a, B:61:0x01b0), top: B:100:0x00fc, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0219 A[Catch: all -> 0x0279, TryCatch #1 {all -> 0x0279, blocks: (B:41:0x00fc, B:43:0x010c, B:47:0x0133, B:46:0x012f, B:48:0x0142, B:51:0x0167, B:53:0x017b, B:55:0x0191, B:59:0x019c, B:68:0x01da, B:70:0x01e0, B:71:0x01fd, B:74:0x020c, B:76:0x0219, B:64:0x01be, B:66:0x01c4, B:54:0x0189, B:77:0x0220, B:79:0x0226, B:80:0x023a, B:61:0x01b0), top: B:100:0x00fc, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> void a(com.applovin.impl.sdk.network.c<T> r22, com.applovin.impl.sdk.network.b.a r23, com.applovin.impl.sdk.network.b.c<T> r24) {
        /*
            Method dump skipped, instruction units count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.network.b.a(com.applovin.impl.sdk.network.c, com.applovin.impl.sdk.network.b$a, com.applovin.impl.sdk.network.b$c):void");
    }

    /* JADX INFO: renamed from: com.applovin.impl.sdk.network.b$b, reason: collision with other inner class name */
    private class C0078b<T> implements Consumer<e.c> {
        private final String b;
        private final com.applovin.impl.sdk.network.c<T> c;
        private final String d;
        private final T e;
        private final boolean f;
        private final long g;
        private final a h;
        private final c<T> i;

        private C0078b(String str, com.applovin.impl.sdk.network.c<T> cVar, String str2, T t, boolean z, long j, a aVar, c<T> cVar2) {
            this.b = str;
            this.c = cVar;
            this.d = str2;
            this.e = t;
            this.f = z;
            this.g = j;
            this.h = aVar;
            this.i = cVar2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // androidx.core.util.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e.c cVar) {
            int i;
            int iA;
            Object objA = null;
            try {
                try {
                    iA = cVar.a();
                } catch (MalformedURLException e) {
                    e = e;
                    i = 0;
                }
                try {
                    if (iA <= 0) {
                        b.this.a(this.d, this.b, iA, this.g, (Throwable) null);
                        this.i.a(iA, null, null);
                        return;
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.g;
                    if (iA < 200 || iA >= 400) {
                        this.i.a(iA, null, null);
                        return;
                    }
                    a aVar = this.h;
                    if (aVar != null) {
                        aVar.a(jCurrentTimeMillis);
                    }
                    b.this.a(this.d, this.b, iA, this.g);
                    String strB = cVar.b();
                    p unused = b.this.b;
                    if (Utils.isDspDemoApp(p.y())) {
                        b.this.b.ab().a(strB != null ? strB : "", this.b, this.c.e() != null ? this.c.e().toString() : "");
                    }
                    if (strB == null) {
                        this.i.a(this.e, iA);
                        return;
                    }
                    b.this.c.a("ConnectionManager", strB);
                    a aVar2 = this.h;
                    if (aVar2 != null) {
                        aVar2.b(strB.length());
                    }
                    if (this.f) {
                        String strA = n.a(strB, b.this.b.B());
                        if (strA == null) {
                            Map<String, String> map = CollectionUtils.map(2);
                            map.put("request", StringUtils.getHostAndPath(this.b));
                            map.put("response", strB);
                            b.this.b.G().trackEvent("rdf", map);
                        }
                        strB = strA;
                    }
                    try {
                        this.i.a(b.this.a(strB, this.e), iA);
                    } catch (Throwable th) {
                        String str = "Unable to parse response from " + StringUtils.getHostAndPath(this.b) + " because of " + th.getClass().getName() + " : " + th.getMessage();
                        y unused2 = b.this.c;
                        if (y.a()) {
                            b.this.c.b("ConnectionManager", str, th);
                        }
                        b.this.b.P().a(com.applovin.impl.sdk.d.f.k);
                        this.i.a(AppLovinErrorCodes.INVALID_RESPONSE, str, null);
                    }
                } catch (MalformedURLException e2) {
                    e = e2;
                    i = iA;
                    if (this.e != null) {
                        b.this.a(this.d, this.b, i, this.g, e);
                        this.i.a(-901, e.getMessage(), null);
                    } else {
                        b.this.a(this.d, this.b, i, this.g);
                        this.i.a(this.e, -901);
                    }
                }
            } catch (Throwable th2) {
                int iA2 = 0 == 0 ? b.this.a(th2) : 0;
                try {
                    String strC = cVar.c();
                    if (strC != null) {
                        if (this.f) {
                            strC = n.a(strC, b.this.b.B());
                        }
                        objA = b.this.a(strC, this.e);
                    }
                } catch (Throwable unused3) {
                }
                b.this.a(this.d, this.b, iA2, this.g, th2);
                this.i.a(iA2, th2.getMessage(), objA);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public <T> T a(String str, T t) throws JSONException, SAXException, ClassCastException {
        if (t == null) {
            return str;
        }
        if (str != 0 && str.length() >= 3) {
            if (t instanceof JSONObject) {
                return (T) new JSONObject(str);
            }
            if (t instanceof t) {
                return (T) u.a(str, this.b);
            }
            if (t instanceof String) {
                return str;
            }
            if (y.a()) {
                this.c.e("ConnectionManager", "Failed to process response of type '" + t.getClass().getName() + "'");
            }
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(Throwable th) {
        if (th instanceof UnknownHostException) {
            return -1009;
        }
        if (th instanceof SocketTimeoutException) {
            return -1001;
        }
        if (th instanceof IOException) {
            return -100;
        }
        return th instanceof JSONException ? -104 : -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i, long j) {
        if (y.a()) {
            this.c.c("ConnectionManager", "Successful " + str + " returned " + i + " in " + ((System.currentTimeMillis() - j) / 1000.0f) + " s over " + com.applovin.impl.sdk.utils.i.f(this.b) + " to " + a(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i, long j, Throwable th) {
        if (y.a()) {
            this.c.b("ConnectionManager", "Failed " + str + " returned " + i + " in " + ((System.currentTimeMillis() - j) / 1000.0f) + " s over " + com.applovin.impl.sdk.utils.i.f(this.b) + " to " + a(str2), th);
        }
    }

    private String a(String str) {
        return "#" + str.hashCode() + " \"" + StringUtils.getHostAndPath(str) + "\"";
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f1370a;
        private long b;

        public long a() {
            return this.f1370a;
        }

        public long b() {
            return this.b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j) {
            this.f1370a = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(long j) {
            this.b = j;
        }
    }
}
