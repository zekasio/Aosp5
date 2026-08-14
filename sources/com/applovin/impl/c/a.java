package com.applovin.impl.c;

import android.net.Uri;
import com.applovin.impl.c.n;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.y;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.applovin.impl.sdk.ad.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f899a;
    private final String b;
    private final j c;
    private final long d;
    private final n e;
    private final d f;
    private final String g;
    private final com.applovin.impl.c.c h;
    private final com.applovin.impl.sdk.a.g i;
    private final Set<k> j;
    private final Set<k> k;

    public enum b {
        COMPANION_AD,
        VIDEO
    }

    public enum c {
        IMPRESSION,
        VIDEO_CLICK,
        COMPANION_CLICK,
        VIDEO,
        COMPANION,
        INDUSTRY_ICON_IMPRESSION,
        INDUSTRY_ICON_CLICK,
        ERROR
    }

    @Override // com.applovin.impl.sdk.ad.e
    public void a() {
    }

    private a(C0056a c0056a) {
        super(c0056a.f900a, c0056a.b, c0056a.c, c0056a.d);
        this.f899a = c0056a.f;
        this.c = c0056a.h;
        this.b = c0056a.g;
        this.e = c0056a.i;
        this.f = c0056a.j;
        this.h = c0056a.k;
        this.j = c0056a.l;
        this.k = c0056a.m;
        this.i = new com.applovin.impl.sdk.a.g(this);
        Uri uriH = h();
        if (uriH != null) {
            this.g = uriH.toString();
        } else {
            this.g = "";
        }
        this.d = c0056a.e;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        return this.fullResponse;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean hasVideoUrl() {
        List<o> listA;
        n nVar = this.e;
        return (nVar == null || (listA = nVar.a()) == null || listA.size() <= 0) ? false : true;
    }

    @Override // com.applovin.impl.sdk.ad.e
    public boolean f() {
        return getBooleanFromAdObject("vast_is_streaming", false);
    }

    public void b() {
        synchronized (this.adObjectLock) {
            this.adObject.remove("vast_is_streaming");
        }
    }

    @Override // com.applovin.impl.sdk.ad.e
    public String d() {
        return this.g;
    }

    @Override // com.applovin.impl.sdk.ad.e, com.applovin.impl.sdk.a.a
    public boolean isOpenMeasurementEnabled() {
        return getBooleanFromAdObject("omsdk_enabled", true) && this.h != null;
    }

    public boolean c() {
        return getBooleanFromAdObject("iopms", false);
    }

    public boolean e() {
        return getBooleanFromAdObject("iopmsfsr", true);
    }

    @Override // com.applovin.impl.sdk.ad.e
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public com.applovin.impl.sdk.a.g o() {
        return this.i;
    }

    public long i() {
        return getLongFromAdObject("real_close_delay", 0L);
    }

    public b l() {
        if ("companion_ad".equalsIgnoreCase(getStringFromAdObject("vast_first_caching_operation", "companion_ad"))) {
            return b.COMPANION_AD;
        }
        return b.VIDEO;
    }

    public boolean m() {
        return getBooleanFromAdObject("vast_immediate_ad_load", true);
    }

    @Override // com.applovin.impl.sdk.ad.e
    public Uri h() {
        o oVarAP = aP();
        if (oVarAP != null) {
            return oVarAP.b();
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.e
    public Uri j() {
        n nVar = this.e;
        if (nVar != null) {
            return nVar.c();
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.e
    public Uri k() {
        return j();
    }

    @Override // com.applovin.impl.sdk.ad.e
    public boolean E() {
        return getBooleanFromAdObject("video_clickable", false) && j() != null;
    }

    @Override // com.applovin.impl.sdk.ad.e
    public List<com.applovin.impl.sdk.d.a> at() {
        List<com.applovin.impl.sdk.d.a> postbacks;
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("vimp_urls", this.adObject, getClCode(), null, aZ(), au(), z(), this.sdk);
        }
        return postbacks;
    }

    private String aZ() {
        String stringFromAdObject = getStringFromAdObject("vimp_url", null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace(Utils.MACRO_CLCODE, getClCode());
        }
        return null;
    }

    public j n() {
        return this.c;
    }

    public n aO() {
        return this.e;
    }

    public o aP() {
        n nVar = this.e;
        if (nVar != null) {
            return nVar.a(ba());
        }
        return null;
    }

    private n.a ba() {
        n.a[] aVarArrValues = n.a.values();
        int iIntValue = ((Integer) this.sdk.a(com.applovin.impl.sdk.c.b.eO)).intValue();
        if (iIntValue >= 0 && iIntValue < aVarArrValues.length) {
            return aVarArrValues[iIntValue];
        }
        return n.a.UNSPECIFIED;
    }

    public d aQ() {
        return this.f;
    }

    public g aR() {
        n nVar = this.e;
        if (nVar != null) {
            return nVar.f();
        }
        return null;
    }

    public boolean aS() {
        return aR() != null;
    }

    public boolean aT() {
        return getBooleanFromAdObject("vast_fire_click_trackers_on_html_clicks", false);
    }

    public void a(String str) {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html_template", str);
        }
    }

    public String aU() {
        return getStringFromAdObject("html_template", "");
    }

    public Uri aV() {
        String stringFromAdObject = getStringFromAdObject("html_template_url", null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public boolean aW() {
        return getBooleanFromAdObject("cache_companion_ad", true);
    }

    public boolean aX() {
        return getBooleanFromAdObject("cache_video", true);
    }

    public com.applovin.impl.c.c aY() {
        return this.h;
    }

    public Set<k> a(c cVar, String str) {
        return a(cVar, new String[]{str});
    }

    public Set<k> a(c cVar, String[] strArr) {
        this.sdk.L();
        if (y.a()) {
            this.sdk.L().b("VastAd", "Retrieving trackers of type '" + cVar + "' and events '" + strArr + "'...");
        }
        if (cVar == c.IMPRESSION) {
            return this.j;
        }
        if (cVar == c.VIDEO_CLICK) {
            return bb();
        }
        if (cVar == c.COMPANION_CLICK) {
            return bc();
        }
        if (cVar == c.VIDEO) {
            return a(b.VIDEO, strArr);
        }
        if (cVar == c.COMPANION) {
            return a(b.COMPANION_AD, strArr);
        }
        if (cVar == c.INDUSTRY_ICON_CLICK) {
            return aR().e();
        }
        if (cVar == c.INDUSTRY_ICON_IMPRESSION) {
            return aR().f();
        }
        if (cVar == c.ERROR) {
            return this.k;
        }
        this.sdk.L();
        if (y.a()) {
            this.sdk.L().e("VastAd", "Failed to retrieve trackers of invalid type '" + cVar + "' and events '" + strArr + "'");
        }
        return Collections.emptySet();
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getCreatedAtMillis() {
        return this.d;
    }

    private Set<k> bb() {
        n nVar = this.e;
        if (nVar != null) {
            return nVar.d();
        }
        return Collections.emptySet();
    }

    private Set<k> bc() {
        d dVar = this.f;
        if (dVar != null) {
            return dVar.c();
        }
        return Collections.emptySet();
    }

    private Set<k> a(b bVar, String[] strArr) {
        Map<String, Set<k>> mapD;
        d dVar;
        n nVar;
        if (strArr != null && strArr.length > 0) {
            if (bVar == b.VIDEO && (nVar = this.e) != null) {
                mapD = nVar.e();
            } else {
                mapD = (bVar != b.COMPANION_AD || (dVar = this.f) == null) ? null : dVar.d();
            }
            HashSet hashSet = new HashSet();
            if (mapD != null && !mapD.isEmpty()) {
                for (String str : strArr) {
                    if (mapD.containsKey(str)) {
                        hashSet.addAll(mapD.get(str));
                    }
                }
            }
            return Collections.unmodifiableSet(hashSet);
        }
        return Collections.emptySet();
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public String toString() {
        return "VastAd{title='" + this.f899a + "', adDescription='" + this.b + "', systemInfo=" + this.c + ", videoCreative=" + this.e + ", companionAd=" + this.f + ", adVerifications=" + this.h + ", impressionTrackers=" + this.j + ", errorTrackers=" + this.k + '}';
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a) || !super.equals(obj)) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f899a;
        if (str == null ? aVar.f899a != null : !str.equals(aVar.f899a)) {
            return false;
        }
        String str2 = this.b;
        if (str2 == null ? aVar.b != null : !str2.equals(aVar.b)) {
            return false;
        }
        j jVar = this.c;
        if (jVar == null ? aVar.c != null : !jVar.equals(aVar.c)) {
            return false;
        }
        n nVar = this.e;
        if (nVar == null ? aVar.e != null : !nVar.equals(aVar.e)) {
            return false;
        }
        d dVar = this.f;
        if (dVar == null ? aVar.f != null : !dVar.equals(aVar.f)) {
            return false;
        }
        com.applovin.impl.c.c cVar = this.h;
        if (cVar == null ? aVar.h != null : !cVar.equals(aVar.h)) {
            return false;
        }
        Set<k> set = this.j;
        if (set == null ? aVar.j != null : !set.equals(aVar.j)) {
            return false;
        }
        Set<k> set2 = this.k;
        Set<k> set3 = aVar.k;
        return set2 != null ? set2.equals(set3) : set3 == null;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f899a;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.b;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        j jVar = this.c;
        int iHashCode4 = (iHashCode3 + (jVar != null ? jVar.hashCode() : 0)) * 31;
        n nVar = this.e;
        int iHashCode5 = (iHashCode4 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        d dVar = this.f;
        int iHashCode6 = (iHashCode5 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        com.applovin.impl.c.c cVar = this.h;
        int iHashCode7 = (iHashCode6 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        Set<k> set = this.j;
        int iHashCode8 = (iHashCode7 + (set != null ? set.hashCode() : 0)) * 31;
        Set<k> set2 = this.k;
        return iHashCode8 + (set2 != null ? set2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: com.applovin.impl.c.a$a, reason: collision with other inner class name */
    public static class C0056a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private JSONObject f900a;
        private JSONObject b;
        private com.applovin.impl.sdk.ad.b c;
        private p d;
        private long e;
        private String f;
        private String g;
        private j h;
        private n i;
        private d j;
        private com.applovin.impl.c.c k;
        private Set<k> l;
        private Set<k> m;

        public C0056a a(JSONObject jSONObject) {
            if (jSONObject == null) {
                throw new IllegalArgumentException("No ad object specified.");
            }
            this.f900a = jSONObject;
            return this;
        }

        public C0056a b(JSONObject jSONObject) {
            if (jSONObject == null) {
                throw new IllegalArgumentException("No full ad response specified.");
            }
            this.b = jSONObject;
            return this;
        }

        public C0056a a(com.applovin.impl.sdk.ad.b bVar) {
            this.c = bVar;
            return this;
        }

        public C0056a a(p pVar) {
            if (pVar == null) {
                throw new IllegalArgumentException("No sdk specified.");
            }
            this.d = pVar;
            return this;
        }

        public C0056a a(String str) {
            this.f = str;
            return this;
        }

        public C0056a b(String str) {
            this.g = str;
            return this;
        }

        public C0056a a(j jVar) {
            this.h = jVar;
            return this;
        }

        public C0056a a(n nVar) {
            this.i = nVar;
            return this;
        }

        public C0056a a(d dVar) {
            this.j = dVar;
            return this;
        }

        public C0056a a(com.applovin.impl.c.c cVar) {
            this.k = cVar;
            return this;
        }

        public C0056a a(Set<k> set) {
            this.l = set;
            return this;
        }

        public C0056a b(Set<k> set) {
            this.m = set;
            return this;
        }

        public C0056a a(long j) {
            this.e = j;
            return this;
        }

        public a a() {
            return new a(this);
        }
    }
}
