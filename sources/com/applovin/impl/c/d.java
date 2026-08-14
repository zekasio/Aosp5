package com.applovin.impl.c;

import android.net.Uri;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.t;
import com.applovin.impl.sdk.y;
import com.tapjoy.TJAdUnitConstants;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f905a;
    private int b;
    private Uri c;
    private i d;
    private final Set<k> e = new HashSet();
    private final Map<String, Set<k>> f = CollectionUtils.map();

    private d() {
    }

    public static d a(t tVar, d dVar, e eVar, p pVar) {
        t tVarB;
        if (tVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (pVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (dVar == null) {
            try {
                dVar = new d();
            } catch (Throwable th) {
                pVar.L();
                if (!y.a()) {
                    return null;
                }
                pVar.L().b("VastCompanionAd", "Error occurred while initializing", th);
                return null;
            }
        }
        if (dVar.f905a == 0 && dVar.b == 0) {
            int i = StringUtils.parseInt(tVar.b().get(TJAdUnitConstants.String.WIDTH));
            int i2 = StringUtils.parseInt(tVar.b().get(TJAdUnitConstants.String.HEIGHT));
            if (i > 0 && i2 > 0) {
                dVar.f905a = i;
                dVar.b = i2;
            }
        }
        dVar.d = i.a(tVar, dVar.d, pVar);
        if (dVar.c == null && (tVarB = tVar.b("CompanionClickThrough")) != null) {
            String strC = tVarB.c();
            if (StringUtils.isValidString(strC)) {
                dVar.c = Uri.parse(strC);
            }
        }
        m.a(tVar.a("CompanionClickTracking"), dVar.e, eVar, pVar);
        m.a(tVar, dVar.f, eVar, pVar);
        return dVar;
    }

    public Uri a() {
        return this.c;
    }

    public i b() {
        return this.d;
    }

    public Set<k> c() {
        return this.e;
    }

    public Map<String, Set<k>> d() {
        return this.f;
    }

    public String toString() {
        return "VastCompanionAd{width=" + this.f905a + ", height=" + this.b + ", destinationUri=" + this.c + ", nonVideoResource=" + this.d + ", clickTrackers=" + this.e + ", eventTrackers=" + this.f + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f905a != dVar.f905a || this.b != dVar.b) {
            return false;
        }
        Uri uri = this.c;
        if (uri == null ? dVar.c != null : !uri.equals(dVar.c)) {
            return false;
        }
        i iVar = this.d;
        if (iVar == null ? dVar.d != null : !iVar.equals(dVar.d)) {
            return false;
        }
        Set<k> set = this.e;
        if (set == null ? dVar.e != null : !set.equals(dVar.e)) {
            return false;
        }
        Map<String, Set<k>> map = this.f;
        Map<String, Set<k>> map2 = dVar.f;
        return map != null ? map.equals(map2) : map2 == null;
    }

    public int hashCode() {
        int i = ((this.f905a * 31) + this.b) * 31;
        Uri uri = this.c;
        int iHashCode = (i + (uri != null ? uri.hashCode() : 0)) * 31;
        i iVar = this.d;
        int iHashCode2 = (iHashCode + (iVar != null ? iVar.hashCode() : 0)) * 31;
        Set<k> set = this.e;
        int iHashCode3 = (iHashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map<String, Set<k>> map = this.f;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }
}
