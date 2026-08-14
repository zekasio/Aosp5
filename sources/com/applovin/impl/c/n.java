package com.applovin.impl.c;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.t;
import com.applovin.impl.sdk.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<o> f916a;
    private List<String> b;
    private int c;
    private Uri d;
    private final Set<k> e;
    private g f;
    private final Map<String, Set<k>> g;

    public enum a {
        UNSPECIFIED,
        LOW,
        MEDIUM,
        HIGH
    }

    private n() {
        this.f916a = Collections.emptyList();
        this.b = Collections.emptyList();
        this.e = new HashSet();
        this.g = CollectionUtils.map();
    }

    private n(e eVar) {
        this.f916a = Collections.emptyList();
        this.b = Collections.emptyList();
        this.e = new HashSet();
        this.g = CollectionUtils.map();
        this.b = eVar.g();
    }

    public static n a(t tVar, n nVar, e eVar, p pVar) {
        t tVarB;
        g gVarA;
        List<t> listA;
        t tVarB2;
        List<o> listA2;
        t tVarB3;
        int iA;
        if (tVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (eVar == null) {
            throw new IllegalArgumentException("No context specified.");
        }
        if (pVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (nVar == null) {
            try {
                nVar = new n(eVar);
            } catch (Throwable th) {
                pVar.L();
                if (!y.a()) {
                    return null;
                }
                pVar.L().b("VastVideoCreative", "Error occurred while initializing", th);
                return null;
            }
        }
        if (nVar.c == 0 && (tVarB3 = tVar.b("Duration")) != null && (iA = a(tVarB3.c(), pVar)) > 0) {
            nVar.c = iA;
        }
        t tVarB4 = tVar.b("MediaFiles");
        if (tVarB4 != null && (listA2 = a(tVarB4, pVar)) != null && listA2.size() > 0) {
            List<o> list = nVar.f916a;
            if (list != null) {
                listA2.addAll(list);
            }
            nVar.f916a = listA2;
        }
        t tVarB5 = tVar.b("VideoClicks");
        if (tVarB5 != null) {
            if (nVar.d == null && (tVarB2 = tVarB5.b("ClickThrough")) != null) {
                String strC = tVarB2.c();
                if (StringUtils.isValidString(strC)) {
                    nVar.d = Uri.parse(strC);
                }
            }
            m.a(tVarB5.a("ClickTracking"), nVar.e, eVar, pVar);
        }
        t tVarB6 = tVar.b("Icons");
        if (tVarB6 != null && (gVarA = g.a((tVarB = tVarB6.b("Icon")), pVar)) != null) {
            t tVarB7 = tVarB.b("IconClicks");
            if (tVarB7 != null && (listA = tVarB7.a("IconClickTracking")) != null) {
                m.a(listA, gVarA.f908a, eVar, pVar);
            }
            List<t> listA3 = tVarB.a("IconViewTracking");
            if (listA3 != null) {
                m.a(listA3, gVarA.b, eVar, pVar);
            }
            nVar.f = gVarA;
        }
        m.a(tVar, nVar.g, eVar, pVar);
        return nVar;
    }

    private static int a(String str, p pVar) {
        try {
            List<String> listExplode = CollectionUtils.explode(str, ":");
            if (listExplode.size() == 3) {
                return (int) (TimeUnit.HOURS.toSeconds(StringUtils.parseInt(listExplode.get(0))) + TimeUnit.MINUTES.toSeconds(StringUtils.parseInt(listExplode.get(1))) + ((long) StringUtils.parseInt(listExplode.get(2))));
            }
        } catch (Throwable unused) {
            pVar.L();
            if (y.a()) {
                pVar.L().e("VastVideoCreative", "Unable to parse duration from \"" + str + "\"");
            }
        }
        return 0;
    }

    private static List<o> a(t tVar, p pVar) {
        List<t> listA = tVar.a("MediaFile");
        ArrayList arrayList = new ArrayList(listA.size());
        List<String> listExplode = CollectionUtils.explode((String) pVar.a(com.applovin.impl.sdk.c.b.eM));
        List<String> listExplode2 = CollectionUtils.explode((String) pVar.a(com.applovin.impl.sdk.c.b.eL));
        Iterator<t> it = listA.iterator();
        while (it.hasNext()) {
            o oVarA = o.a(it.next(), pVar);
            if (oVarA != null) {
                try {
                    String strC = oVarA.c();
                    if (StringUtils.isValidString(strC) && !listExplode.contains(strC)) {
                        arrayList.add(oVarA);
                    } else {
                        if (((Boolean) pVar.a(com.applovin.impl.sdk.c.b.eN)).booleanValue()) {
                            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(oVarA.b().toString());
                            if (StringUtils.isValidString(fileExtensionFromUrl) && !listExplode2.contains(fileExtensionFromUrl)) {
                                arrayList.add(oVarA);
                            }
                        }
                        pVar.L();
                        if (y.a()) {
                            pVar.L().d("VastVideoCreative", "Video file not supported: " + oVarA);
                        }
                    }
                } catch (Throwable th) {
                    pVar.L();
                    if (y.a()) {
                        pVar.L().b("VastVideoCreative", "Failed to validate video file: " + oVarA, th);
                    }
                }
            }
        }
        return arrayList;
    }

    public o a(a aVar) {
        List<o> list = this.f916a;
        if (list == null || list.size() == 0) {
            return null;
        }
        List arrayList = new ArrayList(3);
        for (String str : this.b) {
            for (o oVar : this.f916a) {
                String strC = oVar.c();
                if (StringUtils.isValidString(strC) && str.equalsIgnoreCase(strC)) {
                    arrayList.add(oVar);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = this.f916a;
        }
        if (com.applovin.impl.sdk.utils.h.c()) {
            Collections.sort(arrayList, new Comparator<o>() { // from class: com.applovin.impl.c.n.1
                @Override // java.util.Comparator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public int compare(o oVar2, o oVar3) {
                    return Integer.compare(oVar2.d(), oVar3.d());
                }
            });
        }
        if (aVar == a.LOW) {
            return (o) arrayList.get(0);
        }
        if (aVar == a.MEDIUM) {
            return (o) arrayList.get(arrayList.size() / 2);
        }
        return (o) arrayList.get(arrayList.size() - 1);
    }

    public List<o> a() {
        return this.f916a;
    }

    public int b() {
        return this.c;
    }

    public Uri c() {
        return this.d;
    }

    public Set<k> d() {
        return this.e;
    }

    public Map<String, Set<k>> e() {
        return this.g;
    }

    public g f() {
        return this.f;
    }

    public String toString() {
        return "VastVideoCreative{videoFiles=" + this.f916a + ", durationSeconds=" + this.c + ", destinationUri=" + this.d + ", clickTrackers=" + this.e + ", eventTrackers=" + this.g + ", industryIcon=" + this.f + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.c != nVar.c) {
            return false;
        }
        List<o> list = this.f916a;
        if (list == null ? nVar.f916a != null : !list.equals(nVar.f916a)) {
            return false;
        }
        Uri uri = this.d;
        if (uri == null ? nVar.d != null : !uri.equals(nVar.d)) {
            return false;
        }
        Set<k> set = this.e;
        if (set == null ? nVar.e != null : !set.equals(nVar.e)) {
            return false;
        }
        Map<String, Set<k>> map = this.g;
        Map<String, Set<k>> map2 = nVar.g;
        return map != null ? map.equals(map2) : map2 == null;
    }

    public int hashCode() {
        List<o> list = this.f916a;
        int iHashCode = (((list != null ? list.hashCode() : 0) * 31) + this.c) * 31;
        Uri uri = this.d;
        int iHashCode2 = (iHashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        Set<k> set = this.e;
        int iHashCode3 = (iHashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map<String, Set<k>> map = this.g;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }
}
