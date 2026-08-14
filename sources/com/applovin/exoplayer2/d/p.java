package com.applovin.exoplayer2.d;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.exoplayer2.d.m;
import com.applovin.exoplayer2.k.l;
import com.applovin.exoplayer2.k.t;
import com.applovin.exoplayer2.k.z;
import com.applovin.exoplayer2.l.ai;
import com.loopj.android.http.RequestParams;
import cz.msebera.android.httpclient.HttpHeaders;
import java.io.Closeable;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class p implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t.b f258a;
    private final String b;
    private final boolean c;
    private final Map<String, String> d;

    public p(String str, boolean z, t.b bVar) {
        com.applovin.exoplayer2.l.a.a((z && TextUtils.isEmpty(str)) ? false : true);
        this.f258a = bVar;
        this.b = str;
        this.c = z;
        this.d = new HashMap();
    }

    public void a(String str, String str2) {
        com.applovin.exoplayer2.l.a.b(str);
        com.applovin.exoplayer2.l.a.b(str2);
        synchronized (this.d) {
            this.d.put(str, str2);
        }
    }

    @Override // com.applovin.exoplayer2.d.r
    public byte[] a(UUID uuid, m.d dVar) throws s {
        return a(this.f258a, dVar.b() + "&signedRequest=" + ai.a(dVar.a()), null, Collections.emptyMap());
    }

    @Override // com.applovin.exoplayer2.d.r
    public byte[] a(UUID uuid, m.a aVar) throws s {
        String str;
        String strB = aVar.b();
        if (this.c || TextUtils.isEmpty(strB)) {
            strB = this.b;
        }
        if (TextUtils.isEmpty(strB)) {
            throw new s(new l.a().a(Uri.EMPTY).a(), Uri.EMPTY, com.applovin.exoplayer2.common.a.u.a(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        if (com.applovin.exoplayer2.h.e.equals(uuid)) {
            str = "text/xml";
        } else {
            str = com.applovin.exoplayer2.h.c.equals(uuid) ? RequestParams.APPLICATION_JSON : "application/octet-stream";
        }
        map.put("Content-Type", str);
        if (com.applovin.exoplayer2.h.e.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.d) {
            map.putAll(this.d);
        }
        return a(this.f258a, strB, aVar.a(), map);
    }

    private static byte[] a(t.b bVar, String str, byte[] bArr, Map<String, String> map) throws s {
        z zVar = new z(bVar.c());
        com.applovin.exoplayer2.k.l lVarA = new l.a().a(str).a(map).a(2).a(bArr).b(1).a();
        int i = 0;
        com.applovin.exoplayer2.k.l lVarA2 = lVarA;
        while (true) {
            try {
                com.applovin.exoplayer2.k.k kVar = new com.applovin.exoplayer2.k.k(zVar, lVarA2);
                try {
                    return ai.a((InputStream) kVar);
                } catch (t.e e) {
                    String strA = a(e, i);
                    if (strA == null) {
                        throw e;
                    }
                    i++;
                    lVarA2 = lVarA2.b().a(strA).a();
                } finally {
                    ai.a((Closeable) kVar);
                }
            } catch (Exception e2) {
                throw new s(lVarA, (Uri) com.applovin.exoplayer2.l.a.b(zVar.e()), zVar.b(), zVar.d(), e2);
            }
        }
    }

    private static String a(t.e eVar, int i) {
        Map<String, List<String>> map;
        List<String> list;
        if ((eVar.d != 307 && eVar.d != 308) || i >= 5 || (map = eVar.f) == null || (list = map.get(HttpHeaders.LOCATION)) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}
