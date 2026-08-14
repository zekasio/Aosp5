package com.applovin.impl.c;

import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.t;
import com.applovin.impl.sdk.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f903a;
    private final List<h> b;
    private final String c;
    private final Set<k> d;

    private b(String str, List<h> list, String str2, Set<k> set) {
        this.f903a = str;
        this.b = list;
        this.c = str2;
        this.d = set;
    }

    public static b a(t tVar, e eVar, p pVar) {
        try {
            String str = tVar.b().get("vendor");
            t tVarC = tVar.c("VerificationParameters");
            String strC = tVarC != null ? tVarC.c() : null;
            List<t> listA = tVar.a("JavaScriptResource");
            ArrayList arrayList = new ArrayList(listA.size());
            Iterator<t> it = listA.iterator();
            while (it.hasNext()) {
                h hVarA = h.a(it.next(), pVar);
                if (hVarA != null) {
                    arrayList.add(hVarA);
                }
            }
            Map map = CollectionUtils.map();
            m.a(tVar, (Map<String, Set<k>>) map, eVar, pVar);
            return new b(str, arrayList, strC, (Set) map.get("verificationNotExecuted"));
        } catch (Throwable th) {
            pVar.L();
            if (y.a()) {
                pVar.L().b("VastAdVerification", "Error occurred while initializing", th);
            }
            return null;
        }
    }

    public String a() {
        return this.f903a;
    }

    public List<h> b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public Set<k> d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        String str = this.f903a;
        if (str == null ? bVar.f903a != null : !str.equals(bVar.f903a)) {
            return false;
        }
        List<h> list = this.b;
        if (list == null ? bVar.b != null : !list.equals(bVar.b)) {
            return false;
        }
        String str2 = this.c;
        if (str2 == null ? bVar.c != null : !str2.equals(bVar.c)) {
            return false;
        }
        Set<k> set = this.d;
        Set<k> set2 = bVar.d;
        return set != null ? set.equals(set2) : set2 == null;
    }

    public int hashCode() {
        String str = this.f903a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        List<h> list = this.b;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Set<k> set = this.d;
        return iHashCode3 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "VastAdVerification{vendorId='" + this.f903a + "'javascriptResources='" + this.b + "'verificationParameters='" + this.c + "'errorEventTrackers='" + this.d + "'}";
    }
}
