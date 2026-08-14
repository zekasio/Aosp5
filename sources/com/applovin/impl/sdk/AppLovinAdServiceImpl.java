package com.applovin.impl.sdk;

import android.content.Context;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.text.TextUtils;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.ad.c;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinAdServiceImpl implements AppLovinAdService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f1165a;
    private final y b;
    private final Map<com.applovin.impl.sdk.ad.d, b> d;
    private final Handler c = new Handler(Looper.getMainLooper());
    private final Object e = new Object();
    private final Map<String, String> f = CollectionUtils.map();
    private final AtomicReference<JSONObject> g = new AtomicReference<>();

    AppLovinAdServiceImpl(p pVar) {
        this.f1165a = pVar;
        this.b = pVar.L();
        Map<com.applovin.impl.sdk.ad.d, b> map = CollectionUtils.map(6);
        this.d = map;
        map.put(com.applovin.impl.sdk.ad.d.g(), new b());
        map.put(com.applovin.impl.sdk.ad.d.h(), new b());
        map.put(com.applovin.impl.sdk.ad.d.i(), new b());
        map.put(com.applovin.impl.sdk.ad.d.j(), new b());
        map.put(com.applovin.impl.sdk.ad.d.k(), new b());
        map.put(com.applovin.impl.sdk.ad.d.l(), new b());
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAd(AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        a(com.applovin.impl.sdk.ad.d.a(appLovinAdSize, AppLovinAdType.REGULAR), appLovinAdLoadListener);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForZoneId(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No zone id specified");
        }
        if (y.a()) {
            this.b.b("AppLovinAdService", "Loading next ad of zone {" + str + "}");
        }
        a(com.applovin.impl.sdk.ad.d.a(str), appLovinAdLoadListener);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public String getBidToken() {
        String strA;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (this.f1165a.S() != null) {
            strA = this.f1165a.S().a();
        } else {
            strA = this.f1165a.R().a();
        }
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        return strA;
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForAdToken(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        String strTrim = str != null ? str.trim() : null;
        if (TextUtils.isEmpty(strTrim)) {
            y.i("AppLovinAdService", "Empty ad token");
            a(new AppLovinError(-8, "Empty ad token"), appLovinAdLoadListener);
            return;
        }
        com.applovin.impl.sdk.ad.c cVar = new com.applovin.impl.sdk.ad.c(strTrim, this.f1165a);
        if (cVar.b() == c.a.REGULAR) {
            if (y.a()) {
                this.b.b("AppLovinAdService", "Loading next ad for token: " + cVar);
            }
            a(new com.applovin.impl.sdk.e.l(cVar, appLovinAdLoadListener, this.f1165a));
            return;
        }
        if (cVar.b() == c.a.AD_RESPONSE_JSON) {
            JSONObject jSONObjectD = cVar.d();
            if (jSONObjectD != null) {
                com.applovin.impl.sdk.utils.i.f(jSONObjectD, this.f1165a);
                com.applovin.impl.sdk.utils.i.d(jSONObjectD, this.f1165a);
                com.applovin.impl.sdk.utils.i.c(jSONObjectD, this.f1165a);
                com.applovin.impl.sdk.utils.i.e(jSONObjectD, this.f1165a);
                h.a(this.f1165a);
                if (JsonUtils.getJSONArray(jSONObjectD, "ads", new JSONArray()).length() > 0) {
                    if (y.a()) {
                        this.b.b("AppLovinAdService", "Rendering ad for token: " + cVar);
                    }
                    a(new com.applovin.impl.sdk.e.p(jSONObjectD, Utils.getZone(jSONObjectD, this.f1165a), com.applovin.impl.sdk.ad.b.DECODED_AD_TOKEN_JSON, appLovinAdLoadListener, this.f1165a));
                    return;
                }
                if (y.a()) {
                    this.b.e("AppLovinAdService", "No ad returned from the server for token: " + cVar);
                }
                a(AppLovinError.NO_FILL, appLovinAdLoadListener);
                return;
            }
            String str2 = "Unable to retrieve ad response JSON from token: " + cVar.a();
            AppLovinError appLovinError = new AppLovinError(-8, str2);
            y.i("AppLovinAdService", str2);
            a(appLovinError, appLovinAdLoadListener);
            return;
        }
        AppLovinError appLovinError2 = new AppLovinError(-8, "Invalid token type");
        y.i("AppLovinAdService", "Invalid token type");
        a(appLovinError2, appLovinAdLoadListener);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForZoneIds(List<String> list, AppLovinAdLoadListener appLovinAdLoadListener) {
        List<String> listRemoveTrimmedEmptyStrings = CollectionUtils.removeTrimmedEmptyStrings(list);
        if (listRemoveTrimmedEmptyStrings == null || listRemoveTrimmedEmptyStrings.isEmpty()) {
            y.i("AppLovinAdService", "No zones were provided");
            a(-7, appLovinAdLoadListener);
            return;
        }
        if (y.a()) {
            this.b.b("AppLovinAdService", "Loading next ad for zones: " + listRemoveTrimmedEmptyStrings);
        }
        a(new com.applovin.impl.sdk.e.j(listRemoveTrimmedEmptyStrings, appLovinAdLoadListener, this.f1165a));
    }

    public void loadNextIncentivizedAd(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (y.a()) {
            this.b.b("AppLovinAdService", "Loading next incentivized ad of zone {" + str + "}");
        }
        a(com.applovin.impl.sdk.ad.d.b(str), appLovinAdLoadListener);
    }

    public void loadNextAd(String str, AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (y.a()) {
            this.b.b("AppLovinAdService", "Loading next ad of zone {" + str + "} with size " + appLovinAdSize);
        }
        a(com.applovin.impl.sdk.ad.d.a(appLovinAdSize, AppLovinAdType.REGULAR, str), appLovinAdLoadListener);
    }

    private void a(com.applovin.impl.sdk.ad.d dVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (dVar == null) {
            throw new IllegalArgumentException("No zone specified");
        }
        if (appLovinAdLoadListener == null) {
            throw new IllegalArgumentException("No callback specified");
        }
        this.f1165a.L();
        if (y.a()) {
            this.f1165a.L().b("AppLovinAdService", "Loading next ad of zone {" + dVar + "}...");
        }
        b bVarA = a(dVar);
        synchronized (bVarA.f1173a) {
            bVarA.c.add(appLovinAdLoadListener);
            if (!bVarA.b) {
                bVarA.b = true;
                a(dVar, new a(bVarA));
            } else if (y.a()) {
                this.b.b("AppLovinAdService", "Already waiting on an ad load...");
            }
        }
    }

    private void a(com.applovin.impl.sdk.e.a aVar) {
        if (!this.f1165a.d()) {
            y.h("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        this.f1165a.a();
        this.f1165a.M().a(aVar, o.a.MAIN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final AppLovinAd appLovinAd, final AppLovinAdLoadListener appLovinAdLoadListener) {
        this.c.post(new Runnable() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    appLovinAdLoadListener.adReceived(appLovinAd);
                } catch (Throwable th) {
                    y.c("AppLovinAdService", "Unable to notify listener about a newly loaded ad", th);
                }
            }
        });
    }

    private void a(AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (appLovinAdLoadListener instanceof com.applovin.impl.sdk.ad.i) {
            ((com.applovin.impl.sdk.ad.i) appLovinAdLoadListener).failedToReceiveAdV2(appLovinError);
        } else {
            appLovinAdLoadListener.failedToReceiveAd(appLovinError.getCode());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i, final AppLovinAdLoadListener appLovinAdLoadListener) {
        this.c.post(new Runnable() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AppLovinAdLoadListener appLovinAdLoadListener2 = appLovinAdLoadListener;
                    if (appLovinAdLoadListener2 instanceof com.applovin.impl.sdk.ad.i) {
                        ((com.applovin.impl.sdk.ad.i) appLovinAdLoadListener2).failedToReceiveAdV2(new AppLovinError(i, ""));
                    } else {
                        appLovinAdLoadListener2.failedToReceiveAd(i);
                    }
                } catch (Throwable th) {
                    y.c("AppLovinAdService", "Unable to notify listener about ad load failure", th);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final AppLovinError appLovinError, final AppLovinAdLoadListener appLovinAdLoadListener) {
        this.c.post(new Runnable() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AppLovinAdLoadListener appLovinAdLoadListener2 = appLovinAdLoadListener;
                    if (appLovinAdLoadListener2 instanceof com.applovin.impl.sdk.ad.i) {
                        ((com.applovin.impl.sdk.ad.i) appLovinAdLoadListener2).failedToReceiveAdV2(appLovinError);
                    } else {
                        appLovinAdLoadListener2.failedToReceiveAd(appLovinError.getCode());
                    }
                } catch (Throwable th) {
                    y.c("AppLovinAdService", "Unable to notify listener about ad load failure", th);
                }
            }
        });
    }

    public AppLovinAd dequeueAd(com.applovin.impl.sdk.ad.d dVar) {
        AppLovinAdImpl appLovinAdImplB = this.f1165a.U().b(dVar);
        if (y.a()) {
            this.b.b("AppLovinAdService", "Dequeued ad: " + appLovinAdImplB + " for zone: " + dVar + "...");
        }
        return appLovinAdImplB;
    }

    public void addCustomQueryParams(Map<String, String> map) {
        synchronized (this.f) {
            this.f.putAll(map);
        }
    }

    public Map<String, String> getAndResetCustomQueryParams() {
        Map<String, String> map;
        synchronized (this.f) {
            map = CollectionUtils.map(this.f);
            this.f.clear();
        }
        return map;
    }

    public void setCustomPostBody(JSONObject jSONObject) {
        this.g.set(jSONObject);
    }

    public JSONObject getAndResetCustomPostBody() {
        return this.g.getAndSet(null);
    }

    public void trackAndLaunchVideoClick(final com.applovin.impl.sdk.ad.e eVar, final Uri uri, PointF pointF, boolean z, final com.applovin.impl.adview.activity.b.a aVar, final Context context) {
        if (eVar == null) {
            if (y.a()) {
                this.b.e("AppLovinAdService", "Unable to track video click. No ad specified");
                return;
            }
            return;
        }
        if (y.a()) {
            this.b.b("AppLovinAdService", "Tracking VIDEO click on an ad...");
        }
        maybeSubmitPersistentPostbacks(eVar.a(pointF, z));
        if (eVar.isDirectDownloadEnabled()) {
            this.f1165a.ai().startDirectInstallOrDownloadProcess(eVar, z, new ArrayService.DirectDownloadListener() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl.4
                @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
                public void onAppDetailsDisplayed() {
                    AppLovinAdServiceImpl.this.f1165a.Y().pauseForClick();
                }

                @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
                public void onAppDetailsDismissed() {
                    AppLovinAdServiceImpl.this.f1165a.Y().resumeForClick();
                }

                @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
                public void onFailure() {
                    y unused = AppLovinAdServiceImpl.this.b;
                    if (y.a()) {
                        AppLovinAdServiceImpl.this.b.b("AppLovinAdService", "Could not execute Direct Install/Direct Download - falling back to normal click logic");
                    }
                    AppLovinAdServiceImpl.this.a(eVar, uri, aVar, context);
                }
            });
        } else {
            a(eVar, uri, aVar, context);
        }
    }

    public void trackAndLaunchClick(final com.applovin.impl.sdk.ad.e eVar, final AppLovinAdView appLovinAdView, final com.applovin.impl.adview.b bVar, final Uri uri, PointF pointF, boolean z, boolean z2) {
        if (eVar == null) {
            if (y.a()) {
                this.b.e("AppLovinAdService", "Unable to track ad view click. No ad specified");
                return;
            }
            return;
        }
        if (y.a()) {
            this.b.b("AppLovinAdService", "Tracking click on an ad...");
        }
        maybeSubmitPersistentPostbacks(eVar.a(pointF, z, z2));
        if (appLovinAdView != null && uri != null) {
            if (eVar.isDirectDownloadEnabled()) {
                this.f1165a.ai().startDirectInstallOrDownloadProcess(eVar, z2, new ArrayService.DirectDownloadListener() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl.5
                    @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
                    public void onAppDetailsDisplayed() {
                        AppLovinAdServiceImpl.this.f1165a.Y().pauseForClick();
                        com.applovin.impl.adview.b bVar2 = bVar;
                        if (bVar2 != null) {
                            bVar2.o();
                            com.applovin.impl.sdk.utils.k.a(bVar.g(), eVar, appLovinAdView);
                        }
                    }

                    @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
                    public void onAppDetailsDismissed() {
                        if (bVar != null) {
                            AppLovinAdServiceImpl.this.f1165a.Y().resumeForClick();
                            com.applovin.impl.sdk.utils.k.b(bVar.g(), eVar, appLovinAdView);
                        }
                    }

                    @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
                    public void onFailure() {
                        y unused = AppLovinAdServiceImpl.this.b;
                        if (y.a()) {
                            AppLovinAdServiceImpl.this.b.b("AppLovinAdService", "Could not execute Direct Install/Direct Download - falling back to normal click logic");
                        }
                        AppLovinAdServiceImpl.this.a(eVar, appLovinAdView, bVar, uri);
                    }
                });
                return;
            } else {
                a(eVar, appLovinAdView, bVar, uri);
                return;
            }
        }
        if (y.a()) {
            this.b.e("AppLovinAdService", "Unable to launch click - adView has been prematurely destroyed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.sdk.ad.e eVar, Uri uri, com.applovin.impl.adview.activity.b.a aVar, Context context) {
        if (a(uri.getScheme())) {
            a(uri, eVar, (com.applovin.impl.adview.b) null, aVar);
        } else if (Utils.isDeepLinkPlusUrl(uri)) {
            a(uri, eVar, (AppLovinAdView) null, (com.applovin.impl.adview.b) null, context, this.f1165a);
        } else {
            Utils.openUri(context, uri, this.f1165a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.sdk.ad.e eVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.b bVar, Uri uri) {
        if (a(uri.getScheme())) {
            a(uri, eVar, bVar, (com.applovin.impl.adview.activity.b.a) null);
        } else if (Utils.isDeepLinkPlusUrl(uri)) {
            a(uri, eVar, appLovinAdView, bVar, appLovinAdView.getContext(), this.f1165a);
        } else {
            a(uri, eVar, appLovinAdView, bVar);
        }
    }

    public void trackImpression(com.applovin.impl.sdk.ad.e eVar) {
        if (eVar == null) {
            if (y.a()) {
                this.b.e("AppLovinAdService", "Unable to track impression click. No ad specified");
            }
        } else {
            if (y.a()) {
                this.b.b("AppLovinAdService", "Tracking impression on ad...");
            }
            maybeSubmitPersistentPostbacks(eVar.at());
        }
    }

    public void trackVideoEnd(com.applovin.impl.sdk.ad.e eVar, long j, int i, boolean z) {
        if (eVar == null) {
            if (y.a()) {
                this.b.e("AppLovinAdService", "Unable to track video end. No ad specified");
                return;
            }
            return;
        }
        if (y.a()) {
            this.b.b("AppLovinAdService", "Tracking video end on ad...");
        }
        List<com.applovin.impl.sdk.d.a> listAq = eVar.aq();
        if (listAq != null && !listAq.isEmpty()) {
            String string = Long.toString(System.currentTimeMillis());
            for (com.applovin.impl.sdk.d.a aVar : listAq) {
                if (StringUtils.isValidString(aVar.a())) {
                    String strA = a(aVar.a(), j, i, string, z);
                    String strA2 = a(aVar.b(), j, i, string, z);
                    if (strA != null) {
                        a(new com.applovin.impl.sdk.d.a(strA, strA2));
                    } else if (y.a()) {
                        this.b.e("AppLovinAdService", "Failed to parse url: " + aVar.a());
                    }
                } else if (y.a()) {
                    this.b.d("AppLovinAdService", "Requested a postback dispatch for an empty video end URL; nothing to do...");
                }
            }
            return;
        }
        if (y.a()) {
            this.b.d("AppLovinAdService", "Unable to submit persistent postback for AD #" + eVar.getAdIdNumber() + ". Missing video end tracking URL.");
        }
    }

    private String a(String str, long j, int i, String str2, boolean z) {
        try {
            if (!StringUtils.isValidString(str)) {
                return null;
            }
            if (i < 0 || i > 100) {
                i = 0;
            }
            return Uri.parse(str).buildUpon().appendQueryParameter("et_s", Long.toString(j)).appendQueryParameter("pv", Integer.toString(i)).appendQueryParameter("vid_ts", str2).appendQueryParameter("uvs", Boolean.toString(z)).build().toString();
        } catch (Throwable th) {
            if (y.a()) {
                this.b.b("AppLovinAdService", "Unknown error parsing the video end url: " + str, th);
            }
            return null;
        }
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.e eVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.b bVar) {
        if (Utils.openUri(appLovinAdView.getContext(), uri, this.f1165a)) {
            com.applovin.impl.sdk.utils.k.c(bVar.g(), eVar, appLovinAdView);
        }
        bVar.o();
    }

    private boolean a(String str) {
        String str2 = this.f1165a.C().getExtraParameters().get(AppLovinSdkExtraParameterKey.FORWARDING_CLICK_SCHEME);
        return StringUtils.isValidString(str2) && StringUtils.isValidString(str) && str.equalsIgnoreCase(str2);
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.e eVar, com.applovin.impl.adview.b bVar, final com.applovin.impl.adview.activity.b.a aVar) {
        if (y.a()) {
            this.b.b("AppLovinAdService", "Forwarding click " + uri);
        }
        eVar.setMaxAdValue("forwarding_clicked_url", uri.toString());
        String str = this.f1165a.C().getExtraParameters().get(AppLovinSdkExtraParameterKey.CLOSE_AD_ON_FORWARDING_CLICK_SCHEME);
        if (StringUtils.isValidString(str) && Boolean.parseBoolean(str)) {
            if (aVar != null) {
                this.c.post(new Runnable() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl.6
                    @Override // java.lang.Runnable
                    public void run() {
                        if (aVar != null) {
                            y unused = AppLovinAdServiceImpl.this.b;
                            if (y.a()) {
                                AppLovinAdServiceImpl.this.b.b("AppLovinAdService", "Dismissing ad after forwarding click");
                            }
                            aVar.h();
                        }
                    }
                });
            } else {
                if (bVar == null || Utils.isBML(eVar.getSize())) {
                    return;
                }
                if (y.a()) {
                    this.b.b("AppLovinAdService", "Closing ad after forwarding click");
                }
                bVar.l();
            }
        }
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.e eVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.b bVar, Context context, p pVar) {
        if (uri != null && StringUtils.isValidString(uri.getQuery())) {
            Uri uriA = a(uri, "primaryUrl");
            List<Uri> listB = b(uri, "primaryTrackingUrl");
            Uri uriA2 = a(uri, "fallbackUrl");
            List<Uri> listB2 = b(uri, "fallbackTrackingUrl");
            if (uriA == null && uriA2 == null) {
                pVar.L();
                if (y.a()) {
                    pVar.L().e("AppLovinAdService", "Failed to parse both primary and backup URLs for Deep Link+ command");
                    return;
                }
                return;
            }
            if (!a(uriA, "primary", listB, eVar, appLovinAdView, bVar, context, pVar)) {
                a(uriA2, "backup", listB2, eVar, appLovinAdView, bVar, context, pVar);
            }
            if (bVar != null) {
                bVar.o();
                return;
            }
            return;
        }
        pVar.L();
        if (y.a()) {
            pVar.L().e("AppLovinAdService", "Failed to execute Deep Link+ command - no query parameters found");
        }
    }

    private boolean a(Uri uri, String str, List<Uri> list, com.applovin.impl.sdk.ad.e eVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.b bVar, Context context, p pVar) {
        pVar.L();
        if (y.a()) {
            pVar.L().b("AppLovinAdService", "Opening " + str + " URL: " + uri);
        }
        boolean zOpenUri = Utils.openUri(context, uri, pVar);
        if (zOpenUri) {
            pVar.L();
            if (y.a()) {
                pVar.L().b("AppLovinAdService", "URL opened successfully, dispatching tracking URLs: " + list);
            }
            Iterator<Uri> it = list.iterator();
            while (it.hasNext()) {
                pVar.ak().dispatchPostbackAsync(it.next().toString(), null);
            }
            if (bVar != null) {
                com.applovin.impl.sdk.utils.k.c(bVar.g(), eVar, appLovinAdView);
            }
        } else {
            pVar.L();
            if (y.a()) {
                pVar.L().e("AppLovinAdService", "URL failed to open");
            }
        }
        return zOpenUri;
    }

    private Uri a(Uri uri, String str) {
        try {
            return Uri.parse(uri.getQueryParameter(str));
        } catch (Throwable unused) {
            this.f1165a.L();
            if (!y.a()) {
                return null;
            }
            this.f1165a.L().d("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
            return null;
        }
    }

    private List<Uri> b(Uri uri, String str) {
        List<String> queryParameters = uri.getQueryParameters(str);
        ArrayList arrayList = new ArrayList(queryParameters.size());
        Iterator<String> it = queryParameters.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(Uri.parse(it.next()));
            } catch (Throwable unused) {
                this.f1165a.L();
                if (y.a()) {
                    this.f1165a.L().d("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
                }
            }
        }
        return arrayList;
    }

    public void trackFullScreenAdClosed(com.applovin.impl.sdk.ad.e eVar, long j, List<Long> list, long j2, boolean z, int i) {
        if (eVar == null) {
            if (y.a()) {
                this.b.e("AppLovinAdService", "Unable to track ad closed. No ad specified.");
                return;
            }
            return;
        }
        if (y.a()) {
            this.b.b("AppLovinAdService", "Tracking ad closed...");
        }
        List<com.applovin.impl.sdk.d.a> listAr = eVar.ar();
        if (listAr != null && !listAr.isEmpty()) {
            for (com.applovin.impl.sdk.d.a aVar : listAr) {
                String strA = a(aVar.a(), j, j2, list, z, i);
                String strA2 = a(aVar.b(), j, j2, list, z, i);
                if (StringUtils.isValidString(strA)) {
                    a(new com.applovin.impl.sdk.d.a(strA, strA2));
                } else if (y.a()) {
                    this.b.e("AppLovinAdService", "Failed to parse url: " + aVar.a());
                }
            }
            return;
        }
        if (y.a()) {
            this.b.d("AppLovinAdService", "Unable to track ad closed for AD #" + eVar.getAdIdNumber() + ". Missing ad close tracking URL." + eVar.getAdIdNumber());
        }
    }

    private String a(String str, long j, long j2, List<Long> list, boolean z, int i) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        Uri.Builder builderAppendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("et_ms", Long.toString(j)).appendQueryParameter("vs_ms", Long.toString(j2));
        if (list != null && list.size() > 0) {
            builderAppendQueryParameter.appendQueryParameter("ec_ms", list.toString());
        }
        if (i != k.f1337a) {
            builderAppendQueryParameter.appendQueryParameter("musw_ch", Boolean.toString(z));
            builderAppendQueryParameter.appendQueryParameter("musw_st", Boolean.toString(k.a(i)));
        }
        return builderAppendQueryParameter.build().toString();
    }

    public void trackAppKilled(com.applovin.impl.sdk.ad.e eVar) {
        if (eVar == null) {
            if (y.a()) {
                this.b.e("AppLovinAdService", "Unable to track app killed. No ad specified");
                return;
            }
            return;
        }
        if (y.a()) {
            this.b.b("AppLovinAdService", "Tracking app killed during ad...");
        }
        List<com.applovin.impl.sdk.d.a> listAs = eVar.as();
        if (listAs != null && !listAs.isEmpty()) {
            for (com.applovin.impl.sdk.d.a aVar : listAs) {
                a(new com.applovin.impl.sdk.d.a(aVar.a(), aVar.b()));
            }
            return;
        }
        if (y.a()) {
            this.b.d("AppLovinAdService", "Unable to track app killed during AD #" + eVar.getAdIdNumber() + ". Missing app killed tracking URL.");
        }
    }

    public void maybeSubmitPersistentPostbacks(List<com.applovin.impl.sdk.d.a> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<com.applovin.impl.sdk.d.a> it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    private void a(com.applovin.impl.sdk.d.a aVar) {
        if (StringUtils.isValidString(aVar.a())) {
            this.f1165a.al().a(com.applovin.impl.sdk.network.j.o().c(aVar.a()).d(StringUtils.isValidString(aVar.b()) ? aVar.b() : null).b(aVar.c()).a(false).d(aVar.d()).a());
        } else if (y.a()) {
            this.b.d("AppLovinAdService", "Requested a postback dispatch for a null URL; nothing to do...");
        }
    }

    private void a(com.applovin.impl.sdk.ad.d dVar, a aVar) {
        AppLovinAdImpl appLovinAdImplA = this.f1165a.U().a(dVar);
        if (appLovinAdImplA != null) {
            if (y.a()) {
                this.b.b("AppLovinAdService", "Using pre-loaded ad: " + appLovinAdImplA + " for " + dVar);
            }
            aVar.adReceived(appLovinAdImplA);
            return;
        }
        a(new com.applovin.impl.sdk.e.k(dVar, aVar, this.f1165a));
    }

    private b a(com.applovin.impl.sdk.ad.d dVar) {
        b bVar;
        synchronized (this.e) {
            bVar = this.d.get(dVar);
            if (bVar == null) {
                bVar = new b();
                this.d.put(dVar, bVar);
            }
        }
        return bVar;
    }

    private class a implements com.applovin.impl.sdk.ad.i {
        private final b b;

        private a(b bVar) {
            this.b = bVar;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            HashSet hashSet;
            AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
            com.applovin.impl.sdk.ad.d adZone = appLovinAdImpl.getAdZone();
            if (!(appLovinAd instanceof com.applovin.impl.sdk.ad.f)) {
                AppLovinAdServiceImpl.this.f1165a.U().a(appLovinAdImpl);
                appLovinAd = new com.applovin.impl.sdk.ad.f(adZone, AppLovinAdServiceImpl.this.f1165a);
            }
            synchronized (this.b.f1173a) {
                hashSet = new HashSet(this.b.c);
                this.b.c.clear();
                this.b.b = false;
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AppLovinAdServiceImpl.this.a(appLovinAd, (AppLovinAdLoadListener) it.next());
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i) {
            HashSet hashSet;
            synchronized (this.b.f1173a) {
                hashSet = new HashSet(this.b.c);
                this.b.c.clear();
                this.b.b = false;
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AppLovinAdServiceImpl.this.a(i, (AppLovinAdLoadListener) it.next());
            }
        }

        @Override // com.applovin.impl.sdk.ad.i
        public void failedToReceiveAdV2(AppLovinError appLovinError) {
            HashSet<AppLovinAdLoadListener> hashSet;
            synchronized (this.b.f1173a) {
                hashSet = new HashSet(this.b.c);
                this.b.c.clear();
                this.b.b = false;
            }
            for (AppLovinAdLoadListener appLovinAdLoadListener : hashSet) {
                if (appLovinAdLoadListener instanceof com.applovin.impl.sdk.ad.i) {
                    AppLovinAdServiceImpl.this.b(appLovinError, appLovinAdLoadListener);
                } else {
                    AppLovinAdServiceImpl.this.a(appLovinError.getCode(), appLovinAdLoadListener);
                }
            }
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f1173a;
        boolean b;
        final Collection<AppLovinAdLoadListener> c;

        private b() {
            this.f1173a = new Object();
            this.c = new HashSet();
        }

        public String toString() {
            return "AdLoadState{, isWaitingForAd=" + this.b + ", pendingAdListeners=" + this.c + '}';
        }
    }

    public String toString() {
        return "AppLovinAdService{adLoadStates=" + this.d + '}';
    }
}
