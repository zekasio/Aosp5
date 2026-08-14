package com.applovin.impl.sdk.nativeAd;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.r;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.nativeAd.a;
import com.applovin.impl.sdk.network.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyAuctionFlags;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.model.Advertisement;
import cz.msebera.android.httpclient.cookie.ClientCookie;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class e extends com.applovin.impl.sdk.e.a implements a.InterfaceC0077a, AppLovinAdLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f1364a;
    private final JSONObject b;
    private final AppLovinNativeAdLoadListener c;
    private String d;
    private String e;
    private String i;
    private Double j;
    private String k;
    private Uri l;
    private Uri m;
    private com.applovin.impl.c.a n;
    private Uri o;
    private Uri p;
    private Uri q;
    private Uri r;
    private final List<String> s;
    private final List<String> t;
    private final List<l> u;
    private final List<l> v;
    private final List<l> w;
    private final List<l> x;

    public e(JSONObject jSONObject, JSONObject jSONObject2, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, p pVar) {
        super("TaskRenderNativeAd", pVar);
        this.d = "";
        this.e = "";
        this.i = "";
        this.j = null;
        this.k = "";
        this.l = null;
        this.m = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = new ArrayList();
        this.t = new ArrayList();
        this.u = new ArrayList();
        this.v = new ArrayList();
        this.w = new ArrayList();
        this.x = new ArrayList();
        this.f1364a = jSONObject;
        this.b = jSONObject2;
        this.c = appLovinNativeAdLoadListener;
    }

    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.String, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.String, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r2v81 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // java.lang.Runnable
    public void run() {
        ?? r2 = 0;
        String string = JsonUtils.getString(this.f1364a, "privacy_icon_url", null);
        if (URLUtil.isValidUrl(string)) {
            this.o = Uri.parse(string);
        }
        String string2 = JsonUtils.getString(this.f1364a, "privacy_url", null);
        if (URLUtil.isValidUrl(string2)) {
            this.p = Uri.parse(string2);
        }
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f1364a, "ortb_response", (JSONObject) null);
        if (jSONObject == null || jSONObject.length() == 0) {
            y yVar = this.h;
            if (y.a()) {
                this.h.e(this.g, "No oRtb response provided: " + this.f1364a);
            }
            a("No oRtb response provided");
            return;
        }
        String string3 = JsonUtils.getString(jSONObject, ClientCookie.VERSION_ATTR, null);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "value", (JSONObject) null);
        y yVar2 = this.h;
        if (y.a()) {
            this.h.b(this.g, "Rendering native ad for oRTB version: " + string3);
        }
        JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, TapjoyConstants.TJC_PLUGIN_NATIVE, jSONObject2);
        a(JsonUtils.getJSONObject(jSONObject3, "link", (JSONObject) null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject3, "assets", null);
        if (jSONArray == null || jSONArray.length() == 0) {
            y yVar3 = this.h;
            if (y.a()) {
                this.h.e(this.g, "Unable to retrieve assets - failing ad load: " + this.f1364a);
            }
            a("Unable to retrieve assets");
            return;
        }
        String string4 = "";
        int i = 0;
        while (i < jSONArray.length()) {
            JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) r2);
            if (jSONObject4.has(TJAdUnitConstants.String.TITLE)) {
                this.d = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, TJAdUnitConstants.String.TITLE, (JSONObject) r2), "text", r2);
                y yVar4 = this.h;
                if (y.a()) {
                    this.h.b(this.g, "Processed title: " + this.d);
                }
            } else if (jSONObject4.has("link")) {
                a(JsonUtils.getJSONObject(jSONObject4, "link", (JSONObject) r2));
            } else if (jSONObject4.has("img")) {
                int i2 = JsonUtils.getInt(jSONObject4, "id", -1);
                JSONObject jSONObject5 = JsonUtils.getJSONObject(jSONObject4, "img", (JSONObject) r2);
                int i3 = JsonUtils.getInt(jSONObject5, TapjoyAuctionFlags.AUCTION_TYPE, -1);
                String string5 = JsonUtils.getString(jSONObject5, "url", r2);
                if (i3 == 1 || 3 == i2) {
                    this.l = Uri.parse(string5);
                    y yVar5 = this.h;
                    if (y.a()) {
                        this.h.b(this.g, "Processed icon URL: " + this.l);
                    }
                } else if (i3 == 3 || 2 == i2) {
                    this.m = Uri.parse(string5);
                    y yVar6 = this.h;
                    if (y.a()) {
                        this.h.b(this.g, "Processed main image URL: " + this.m);
                    }
                } else {
                    y yVar7 = this.h;
                    if (y.a()) {
                        this.h.d(this.g, "Unrecognized image: " + jSONObject4);
                    }
                    int i4 = JsonUtils.getInt(jSONObject5, "w", -1);
                    int i5 = JsonUtils.getInt(jSONObject5, "h", -1);
                    if (i4 <= 0 || i5 <= 0) {
                        y yVar8 = this.h;
                        if (y.a()) {
                            this.h.d(this.g, "Skipping...");
                        }
                    } else if (i4 / i5 > 1.0d) {
                        y yVar9 = this.h;
                        if (y.a()) {
                            this.h.b(this.g, "Inferring main image from " + i4 + "x" + i5 + "...");
                        }
                        this.m = Uri.parse(string5);
                    } else {
                        y yVar10 = this.h;
                        if (y.a()) {
                            this.h.b(this.g, "Inferring icon image from " + i4 + "x" + i5 + "...");
                        }
                        this.l = Uri.parse(string5);
                    }
                }
            } else if (jSONObject4.has(Advertisement.KEY_VIDEO)) {
                string4 = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, Advertisement.KEY_VIDEO, (JSONObject) null), "vasttag", null);
                if (StringUtils.isValidString(string4)) {
                    y yVar11 = this.h;
                    if (y.a()) {
                        this.h.b(this.g, "Processed VAST video");
                    }
                } else {
                    y yVar12 = this.h;
                    if (y.a()) {
                        this.h.d(this.g, "Ignoring invalid \"vasttag\" for video: " + jSONObject4);
                    }
                }
            } else if (jSONObject4.has(TJAdUnitConstants.String.DATA)) {
                int i6 = JsonUtils.getInt(jSONObject4, "id", -1);
                JSONObject jSONObject6 = JsonUtils.getJSONObject(jSONObject4, TJAdUnitConstants.String.DATA, (JSONObject) null);
                int i7 = JsonUtils.getInt(jSONObject6, TapjoyAuctionFlags.AUCTION_TYPE, -1);
                String string6 = JsonUtils.getString(jSONObject6, "value", null);
                if (i7 == 1 || i6 == 8) {
                    this.e = string6;
                    y yVar13 = this.h;
                    if (y.a()) {
                        this.h.b(this.g, "Processed advertiser: " + this.e);
                    }
                } else if (i7 == 2 || i6 == 4) {
                    this.i = string6;
                    y yVar14 = this.h;
                    if (y.a()) {
                        this.h.b(this.g, "Processed body: " + this.i);
                    }
                } else if (i7 == 12 || i6 == 5) {
                    this.k = string6;
                    y yVar15 = this.h;
                    if (y.a()) {
                        this.h.b(this.g, "Processed cta: " + this.k);
                    }
                } else if (i7 == 3 || i6 == 6) {
                    double dTryParseDouble = Utils.tryParseDouble(string6, -1.0d);
                    if (dTryParseDouble == -1.0d) {
                        y yVar16 = this.h;
                        if (y.a()) {
                            this.h.b(this.g, "Received invalid star rating: " + string6);
                        }
                    } else {
                        this.j = Double.valueOf(dTryParseDouble);
                        y yVar17 = this.h;
                        if (y.a()) {
                            this.h.b(this.g, "Processed star rating: " + this.j);
                        }
                    }
                } else {
                    y yVar18 = this.h;
                    if (y.a()) {
                        this.h.d(this.g, "Skipping unsupported data: " + jSONObject4);
                    }
                }
            } else {
                y yVar19 = this.h;
                if (y.a()) {
                    this.h.e(this.g, "Unsupported asset object: " + jSONObject4);
                }
            }
            i++;
            r2 = 0;
        }
        String string7 = JsonUtils.getString(jSONObject3, "jstracker", null);
        if (StringUtils.isValidString(string7)) {
            this.t.add(string7);
            y yVar20 = this.h;
            if (y.a()) {
                this.h.b(this.g, "Processed jstracker: " + string7);
            }
        }
        Object obj = null;
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject3, "imptrackers", null);
        if (jSONArray2 != null) {
            int i8 = 0;
            while (i8 < jSONArray2.length()) {
                Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray2, i8, obj);
                if (objectAtIndex instanceof String) {
                    String str = (String) objectAtIndex;
                    if (!TextUtils.isEmpty(str)) {
                        this.u.add(new l.a(this.f).a(str).d(false).c(false).a());
                        y yVar21 = this.h;
                        if (y.a()) {
                            this.h.b(this.g, "Processed imptracker URL: " + str);
                        }
                    }
                }
                i8++;
                obj = null;
            }
        }
        ?? r22 = 0;
        JSONArray jSONArray3 = JsonUtils.getJSONArray(jSONObject3, "eventtrackers", null);
        if (jSONArray3 != null) {
            int i9 = 0;
            while (i9 < jSONArray3.length()) {
                JSONObject jSONObject7 = JsonUtils.getJSONObject(jSONArray3, i9, (JSONObject) r22);
                int i10 = JsonUtils.getInt(jSONObject7, "event", -1);
                int i11 = JsonUtils.getInt(jSONObject7, "method", -1);
                String string8 = JsonUtils.getString(jSONObject7, "url", r22);
                if (!TextUtils.isEmpty(string8)) {
                    if (i11 != 1 && i11 != 2) {
                        y yVar22 = this.h;
                        if (y.a()) {
                            this.h.e(this.g, "Unsupported method for event tracker: " + jSONObject7);
                        }
                    } else if (i11 == 2 && string8.startsWith("<script")) {
                        this.t.add(string8);
                    } else {
                        l lVarA = new l.a(this.f).a(string8).d(false).c(false).g(i11 == 2).a();
                        if (i10 == 1) {
                            this.u.add(lVarA);
                            y yVar23 = this.h;
                            if (y.a()) {
                                this.h.b(this.g, "Processed impression URL: " + string8);
                            }
                        } else if (i10 == 2) {
                            this.v.add(lVarA);
                            y yVar24 = this.h;
                            if (y.a()) {
                                this.h.b(this.g, "Processed viewable MRC50 URL: " + string8);
                            }
                        } else if (i10 == 3) {
                            this.w.add(lVarA);
                            y yVar25 = this.h;
                            if (y.a()) {
                                this.h.b(this.g, "Processed viewable MRC100 URL: " + string8);
                            }
                        } else if (i10 == 4) {
                            this.x.add(lVarA);
                            y yVar26 = this.h;
                            if (y.a()) {
                                this.h.b(this.g, "Processed viewable video 50 URL: " + string8);
                            }
                        } else if (i10 == 555) {
                            y yVar27 = this.h;
                            if (y.a()) {
                                this.h.b(this.g, "Ignoring processing of OMID URL: " + string8);
                            }
                        } else {
                            y yVar28 = this.h;
                            if (y.a()) {
                                this.h.e(this.g, "Unsupported event tracker: " + jSONObject7);
                            }
                        }
                    }
                }
                i9++;
                r22 = 0;
            }
        }
        if (StringUtils.isValidString(string4)) {
            y yVar29 = this.h;
            if (y.a()) {
                this.h.b(this.g, "Processing VAST video...");
            }
            this.f.M().a((com.applovin.impl.sdk.e.a) r.a(string4, JsonUtils.shallowCopy(this.f1364a), JsonUtils.shallowCopy(this.b), com.applovin.impl.sdk.ad.b.UNKNOWN, this, this.f));
            return;
        }
        a();
    }

    private void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String string = JsonUtils.getString(jSONObject, "url", null);
        if (StringUtils.isValidString(string)) {
            this.q = Uri.parse(string);
            y yVar = this.h;
            if (y.a()) {
                this.h.b(this.g, "Processed click destination URL: " + this.q);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "fallback", null);
        if (StringUtils.isValidString(string2)) {
            this.r = Uri.parse(string2);
            y yVar2 = this.h;
            if (y.a()) {
                this.h.b(this.g, "Processed click destination backup URL: " + this.r);
            }
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "clicktrackers", null);
        if (jSONArray != null) {
            try {
                this.s.addAll(JsonUtils.toList(jSONArray));
                y yVar3 = this.h;
                if (y.a()) {
                    this.h.b(this.g, "Processed click tracking URLs: " + this.s);
                }
            } catch (Throwable th) {
                y yVar4 = this.h;
                if (y.a()) {
                    this.h.b(this.g, "Failed to render click tracking URLs", th);
                }
            }
        }
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        y yVar = this.h;
        if (y.a()) {
            this.h.b(this.g, "VAST ad rendered successfully");
        }
        this.n = (com.applovin.impl.c.a) appLovinAd;
        a();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i) {
        y yVar = this.h;
        if (y.a()) {
            this.h.e(this.g, "VAST ad failed to render");
        }
        a();
    }

    private void a() {
        AppLovinNativeAdImpl appLovinNativeAdImplBuild = new AppLovinNativeAdImpl.Builder(JsonUtils.shallowCopy(this.f1364a), JsonUtils.shallowCopy(this.b), this.f).setTitle(this.d).setAdvertiser(this.e).setBody(this.i).setCallToAction(this.k).setStarRating(this.j).setIconUri(this.l).setMainImageUri(this.m).setPrivacyIconUri(this.o).setVastAd(this.n).setPrivacyDestinationUri(this.p).setClickDestinationUri(this.q).setClickDestinationBackupUri(this.r).setClickTrackingUrls(this.s).setJsTrackers(this.t).setImpressionRequests(this.u).setViewableMRC50Requests(this.v).setViewableMRC100Requests(this.w).setViewableVideo50Requests(this.x).build();
        appLovinNativeAdImplBuild.getAdEventTracker().b();
        y yVar = this.h;
        if (y.a()) {
            this.h.b(this.g, "Starting cache task for type: " + appLovinNativeAdImplBuild.getType() + "...");
        }
        this.f.M().a(new a(appLovinNativeAdImplBuild, this.f, this), o.a.MAIN);
    }

    @Override // com.applovin.impl.sdk.nativeAd.a.InterfaceC0077a
    public void a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        y yVar = this.h;
        if (y.a()) {
            this.h.b(this.g, "Successfully cached and loaded ad");
        }
        b(appLovinNativeAdImpl);
    }

    private void b(final AppLovinNativeAdImpl appLovinNativeAdImpl) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.nativeAd.e.1
            @Override // java.lang.Runnable
            public void run() {
                y unused = e.this.h;
                if (y.a()) {
                    e.this.h.b(e.this.g, "Preparing native ad view components...");
                }
                try {
                    appLovinNativeAdImpl.setUpNativeAdViewComponents();
                    y unused2 = e.this.h;
                    if (y.a()) {
                        e.this.h.b(e.this.g, "Successfully prepared native ad view components");
                    }
                    appLovinNativeAdImpl.getAdEventTracker().c();
                    e.this.c.onNativeAdLoaded(appLovinNativeAdImpl);
                } catch (Throwable th) {
                    y unused3 = e.this.h;
                    if (y.a()) {
                        e.this.h.b(e.this.g, "Failed to prepare native ad view components", th);
                    }
                    e.this.a(th.getMessage());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        this.c.onNativeAdLoadFailed(new AppLovinError(-6, str));
    }
}
