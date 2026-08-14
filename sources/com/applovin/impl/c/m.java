package com.applovin.impl.c;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.t;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final DateFormat f915a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);
    private static final Random b = new Random(System.currentTimeMillis());

    public static void a(e eVar, AppLovinAdLoadListener appLovinAdLoadListener, f fVar, int i, p pVar) {
        if (pVar == null) {
            throw new IllegalArgumentException("Unable to handle failure. No sdk specified.");
        }
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.failedToReceiveAd(i);
        }
        a(a(eVar, pVar), fVar, pVar);
    }

    public static f a(a aVar) {
        if (b(aVar) || c(aVar)) {
            return null;
        }
        return f.GENERAL_WRAPPER_ERROR;
    }

    public static boolean b(a aVar) {
        n nVarAO;
        List<o> listA;
        return (aVar == null || (nVarAO = aVar.aO()) == null || (listA = nVarAO.a()) == null || listA.isEmpty()) ? false : true;
    }

    public static boolean c(a aVar) {
        d dVarAQ;
        i iVarB;
        if (aVar == null || (dVarAQ = aVar.aQ()) == null || (iVarB = dVarAQ.b()) == null) {
            return false;
        }
        return iVarB.b() != null || StringUtils.isValidString(iVarB.c());
    }

    public static Uri a(String str, long j, Uri uri, f fVar, p pVar) {
        if (URLUtil.isValidUrl(str)) {
            try {
                String string = Integer.toString(fVar.a());
                String strReplace = str.replace("[ERRORCODE]", string).replace("[REASON]", string);
                if (j >= 0) {
                    strReplace = strReplace.replace("[CONTENTPLAYHEAD]", a(j));
                }
                if (uri != null) {
                    strReplace = strReplace.replace("[ASSETURI]", uri.toString());
                }
                return Uri.parse(strReplace.replace("[CACHEBUSTING]", a()).replace("[TIMESTAMP]", b()));
            } catch (Throwable th) {
                pVar.L();
                if (y.a()) {
                    pVar.L().b("VastUtils", "Unable to replace macros in URL string " + str, th);
                }
                return null;
            }
        }
        pVar.L();
        if (y.a()) {
            pVar.L().e("VastUtils", "Unable to replace macros in invalid URL string.");
        }
        return null;
    }

    private static String a(long j) {
        if (j > 0) {
            return String.format(Locale.US, "%02d:%02d:%02d.000", Long.valueOf(TimeUnit.SECONDS.toHours(j)), Long.valueOf(TimeUnit.SECONDS.toMinutes(j) % TimeUnit.MINUTES.toSeconds(1L)), Long.valueOf(j % TimeUnit.MINUTES.toSeconds(1L)));
        }
        return "00:00:00.000";
    }

    private static String a() {
        return Integer.toString(b.nextInt(89999999) + 10000000);
    }

    private static String b() {
        DateFormat dateFormat = f915a;
        dateFormat.setTimeZone(TimeZone.getDefault());
        return dateFormat.format(new Date());
    }

    public static void a(Set<k> set, p pVar) {
        a(set, -1L, (Uri) null, f.UNSPECIFIED, pVar);
    }

    public static void a(Set<k> set, f fVar, p pVar) {
        a(set, -1L, (Uri) null, fVar, pVar);
    }

    public static void a(Set<k> set, long j, Uri uri, f fVar, p pVar) {
        if (pVar == null) {
            throw new IllegalArgumentException("Unable to fire trackers. No sdk specified.");
        }
        if (set == null || set.isEmpty()) {
            return;
        }
        Iterator<k> it = set.iterator();
        while (it.hasNext()) {
            Uri uriA = a(it.next().b(), j, uri, fVar, pVar);
            if (uriA != null) {
                pVar.al().a(com.applovin.impl.sdk.network.j.o().c(uriA.toString()).a(false).a(), false);
            }
        }
    }

    public static void a(t tVar, Map<String, Set<k>> map, e eVar, p pVar) {
        List<t> listA;
        if (pVar == null) {
            throw new IllegalArgumentException("Unable to render event trackers. No sdk specified.");
        }
        if (tVar == null) {
            pVar.L();
            if (y.a()) {
                pVar.L().e("VastUtils", "Unable to render event trackers; null node provided");
                return;
            }
            return;
        }
        if (map == null) {
            pVar.L();
            if (y.a()) {
                pVar.L().e("VastUtils", "Unable to render event trackers; null event trackers provided");
                return;
            }
            return;
        }
        t tVarB = tVar.b("TrackingEvents");
        if (tVarB == null || (listA = tVarB.a("Tracking")) == null) {
            return;
        }
        for (t tVar2 : listA) {
            String str = tVar2.b().get("event");
            if (StringUtils.isValidString(str)) {
                k kVarA = k.a(tVar2, eVar, pVar);
                if (kVarA != null) {
                    Set<k> set = map.get(str);
                    if (set != null) {
                        set.add(kVarA);
                    } else {
                        HashSet hashSet = new HashSet();
                        hashSet.add(kVarA);
                        map.put(str, hashSet);
                    }
                }
            } else {
                pVar.L();
                if (y.a()) {
                    pVar.L().e("VastUtils", "Could not find event for tracking node = " + tVar2);
                }
            }
        }
    }

    public static void a(List<t> list, Set<k> set, e eVar, p pVar) {
        if (pVar == null) {
            throw new IllegalArgumentException("Unable to render trackers. No sdk specified.");
        }
        if (list == null) {
            pVar.L();
            if (y.a()) {
                pVar.L().e("VastUtils", "Unable to render trackers; null nodes provided");
                return;
            }
            return;
        }
        if (set == null) {
            pVar.L();
            if (y.a()) {
                pVar.L().e("VastUtils", "Unable to render trackers; null trackers provided");
                return;
            }
            return;
        }
        Iterator<t> it = list.iterator();
        while (it.hasNext()) {
            k kVarA = k.a(it.next(), eVar, pVar);
            if (kVarA != null) {
                set.add(kVarA);
            }
        }
    }

    public static boolean a(t tVar) {
        if (tVar != null) {
            return tVar.c("Wrapper") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains a wrapper response");
    }

    public static boolean b(t tVar) {
        if (tVar != null) {
            return tVar.c("InLine") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains an inline response");
    }

    public static String a(e eVar) {
        t tVarC;
        if (eVar == null) {
            throw new IllegalArgumentException("Unable to get resolution uri string for fetching the next wrapper or inline response in the chain");
        }
        List<t> listB = eVar.b();
        int size = eVar.b().size();
        if (size <= 0 || (tVarC = listB.get(size - 1).c("VASTAdTagURI")) == null) {
            return null;
        }
        return tVarC.c();
    }

    public static String a(t tVar, String str, String str2) {
        t tVarB = tVar.b(str);
        if (tVarB != null) {
            String strC = tVarB.c();
            if (StringUtils.isValidString(strC)) {
                return strC;
            }
        }
        return str2;
    }

    private static Set<k> a(e eVar, p pVar) {
        if (eVar == null) {
            return null;
        }
        List<t> listB = eVar.b();
        Set<k> hashSet = new HashSet<>(listB.size());
        for (t tVar : listB) {
            t tVarC = tVar.c("Wrapper");
            if (tVarC == null) {
                tVarC = tVar.c("InLine");
            }
            if (tVarC != null) {
                hashSet = a(hashSet, tVarC.a("Error"), eVar, pVar);
            } else {
                hashSet = a(hashSet, tVar.a("Error"), eVar, pVar);
            }
        }
        pVar.L();
        if (y.a()) {
            pVar.L().b("VastUtils", "Retrieved " + hashSet.size() + " top level error trackers: " + hashSet);
        }
        return hashSet;
    }

    private static Set<k> a(Set<k> set, List<t> list, e eVar, p pVar) {
        if (list != null) {
            Iterator<t> it = list.iterator();
            while (it.hasNext()) {
                k kVarA = k.a(it.next(), eVar, pVar);
                if (kVarA != null) {
                    set.add(kVarA);
                }
            }
        }
        return set;
    }
}
