package com.tapjoy;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.drive.DriveFile;
import com.tapjoy.TJAdUnit;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.internal.c5;
import com.tapjoy.internal.e7;
import com.tapjoy.internal.f6;
import com.tapjoy.internal.g6;
import com.tapjoy.internal.g7;
import com.tapjoy.internal.h7;
import com.tapjoy.internal.i7;
import com.tapjoy.internal.j5;
import com.tapjoy.internal.k4;
import com.tapjoy.internal.k8;
import com.tapjoy.internal.o1;
import com.tapjoy.internal.p;
import com.tapjoy.internal.r6;
import com.tapjoy.internal.u6;
import com.tapjoy.internal.w1;
import com.tapjoy.internal.y5;
import com.tapjoy.internal.z5;
import com.tapjoy.internal.z6;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class TJCorePlacement {
    public Context b;
    public Map<String, String> c;
    public TJPlacementData d;
    public String e;
    public long f;
    public TJAdUnit g;
    public boolean l;
    public String q;
    public String r;
    public String s;
    public String t;
    public HashMap<String, String> u;
    public boolean v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, TJPlacement> f1664a = new HashMap();
    public boolean h = false;
    public boolean i = false;
    public k8 j = null;
    public g7 k = null;
    public volatile boolean m = false;
    public volatile boolean n = false;
    public volatile boolean o = false;
    public volatile boolean p = false;
    public TJAdUnit.TJAdUnitWebViewListener w = new a();
    public TJAdUnit.TJAdUnitVideoListener x = new b();

    public class a implements TJAdUnit.TJAdUnitWebViewListener {
        public a() {
        }

        @Override // com.tapjoy.TJAdUnit.TJAdUnitWebViewListener
        public void onClick() {
            TJCorePlacement tJCorePlacement = TJCorePlacement.this;
            TJPlacement tJPlacementA = tJCorePlacement.a("SHOW");
            StringBuilder sbA = w1.a("Handle onClick for placement ");
            sbA.append(tJCorePlacement.c());
            TapjoyLog.i("TJCorePlacement", sbA.toString());
            if (tJPlacementA == null || tJPlacementA.getListener() == null) {
                return;
            }
            tJPlacementA.getListener().onClick(tJPlacementA);
        }

        @Override // com.tapjoy.TJAdUnit.TJAdUnitWebViewListener
        public void onClosed() {
            if (TJCorePlacement.this.h) {
                TJPlacementManager.decrementPlacementCacheCount();
                TJCorePlacement.this.h = false;
            }
            if (TJCorePlacement.this.i) {
                TJPlacementManager.decrementPlacementPreRenderCount();
                TJCorePlacement.this.i = false;
            }
        }

        @Override // com.tapjoy.TJAdUnit.TJAdUnitWebViewListener
        public void onContentReady() {
            TJCorePlacement.this.e();
        }
    }

    public class b implements TJAdUnit.TJAdUnitVideoListener {
        public b() {
        }

        @Override // com.tapjoy.TJAdUnit.TJAdUnitVideoListener
        public void onVideoCompleted() {
            TJPlacement tJPlacementA = TJCorePlacement.this.a("SHOW");
            if (tJPlacementA == null || tJPlacementA.getVideoListener() == null) {
                return;
            }
            tJPlacementA.getVideoListener().onVideoComplete(tJPlacementA);
        }

        @Override // com.tapjoy.TJAdUnit.TJAdUnitVideoListener
        public void onVideoError(String str) {
            TJPlacement tJPlacementA = TJCorePlacement.this.a("SHOW");
            if (tJPlacementA == null || tJPlacementA.getVideoListener() == null) {
                return;
            }
            tJPlacementA.getVideoListener().onVideoError(tJPlacementA, str);
        }

        @Override // com.tapjoy.TJAdUnit.TJAdUnitVideoListener
        public void onVideoStart() {
            TJPlacement tJPlacementA = TJCorePlacement.this.a("SHOW");
            if (tJPlacementA == null || tJPlacementA.getVideoListener() == null) {
                return;
            }
            tJPlacementA.getVideoListener().onVideoStart(tJPlacementA);
        }
    }

    public class c extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f1667a;
        public final /* synthetic */ TJPlacement b;
        public final /* synthetic */ j5 c;
        public final /* synthetic */ f6 d;

        public c(String str, TJPlacement tJPlacement, j5 j5Var, f6 f6Var) {
            this.f1667a = str;
            this.b = tJPlacement;
            this.c = j5Var;
            this.d = f6Var;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            int i = 0;
            while (true) {
                StringBuilder sbA = w1.a("Sending content request for placement ");
                sbA.append(TJCorePlacement.this.c());
                TapjoyLog.i("TJCorePlacement", sbA.toString());
                TJCorePlacement tJCorePlacement = TJCorePlacement.this;
                z6 z6Var = z6.r;
                String strC = tJCorePlacement.c();
                Context context = TJCorePlacement.this.b;
                h7 h7Var = z6Var.f1961a;
                c5 c5VarA = h7Var.f1811a.f.a();
                tJCorePlacement.j = new k8(h7Var.f1811a, c5VarA.c, c5VarA.d, c5VarA.e, strC, false, context);
                TapjoyHttpURLResponse responseFromURL = new TapjoyURLConnection().getResponseFromURL(this.f1667a, (Map<String, String>) null, (Map<String, String>) null, TJCorePlacement.this.c);
                TJCorePlacement.this.d.setHttpStatusCode(responseFromURL.statusCode);
                TJCorePlacement.this.d.setHttpResponse(responseFromURL.response);
                if (!responseFromURL.getHeaderFieldAsString(TapjoyConstants.TAPJOY_PRERENDER_HEADER).equals("0")) {
                    TJCorePlacement.this.d.setPrerenderingRequested(true);
                }
                String headerFieldAsString = responseFromURL.getHeaderFieldAsString(TapjoyConstants.TAPJOY_DEBUG_HEADER);
                if (headerFieldAsString != null) {
                    TapjoyLog.v("TJCorePlacement", "Tapjoy-Server-Debug: " + headerFieldAsString);
                }
                if (!responseFromURL.getHeaderFieldAsString(TapjoyConstants.TAPJOY_HANDLE_DISMISS_ON_PAUSE_HEADER).equals("0")) {
                    TJCorePlacement.this.d.setHandleDismissOnPause(true);
                }
                long j = responseFromURL.expires;
                if (j > 0) {
                    long jA = responseFromURL.date;
                    if (jA <= 0) {
                        jA = p.a();
                    }
                    long j2 = j - jA;
                    if (j2 > 0) {
                        TJCorePlacement.this.f = SystemClock.elapsedRealtime() + j2;
                    }
                } else {
                    TJCorePlacement.this.f = 0L;
                }
                if (this.b.getListener() == null) {
                    break;
                }
                int i2 = responseFromURL.statusCode;
                if (i2 != 0) {
                    if (i2 != 200) {
                        TJCorePlacement.this.b(this.b);
                    } else {
                        String headerFieldAsString2 = responseFromURL.getHeaderFieldAsString("Content-Type");
                        if (TextUtils.isEmpty(headerFieldAsString2) || !headerFieldAsString2.contains("json")) {
                            TJCorePlacement.a(TJCorePlacement.this);
                            TJCorePlacement.this.a(responseFromURL, new k4(this));
                        } else if (responseFromURL.getHeaderFieldAsString(TapjoyConstants.TAPJOY_DISABLE_PRELOAD_HEADER).equals(TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE)) {
                            try {
                                TJCorePlacement.this.b(responseFromURL.response);
                                TJCorePlacement.a(TJCorePlacement.this);
                                TJCorePlacement.this.e();
                            } catch (TapjoyException e) {
                                TJCorePlacement.this.a(this.b, TapjoyErrorMessage.ErrorType.SERVER_ERROR, new TJError(responseFromURL.statusCode, e.getMessage() + " for placement " + TJCorePlacement.this.c()));
                            }
                        } else if (TJCorePlacement.this.c(responseFromURL.response)) {
                            TJCorePlacement.a(TJCorePlacement.this);
                            TJCorePlacement.this.e();
                        } else {
                            String str = responseFromURL.response;
                            if (str == null) {
                                str = TapjoyErrorMessage.ASSET_ERROR;
                            }
                            TJCorePlacement.this.a(this.b, TapjoyErrorMessage.ErrorType.SERVER_ERROR, new TJError(responseFromURL.statusCode, str));
                        }
                    }
                } else if (this.c.a(this.d.e)) {
                    String str2 = responseFromURL.response;
                    if (str2 == null) {
                        str2 = TapjoyErrorMessage.NETWORK_ERROR;
                    }
                    TJCorePlacement.this.a(this.b, TapjoyErrorMessage.ErrorType.NETWORK_ERROR, new TJError(responseFromURL.statusCode, str2));
                } else {
                    this.d.a();
                    i++;
                    TJCorePlacement.this.c.put(TapjoyConstants.TJC_RETRY, Integer.toString(i));
                }
            }
            TJCorePlacement.this.m = false;
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TJCorePlacement tJCorePlacement = TJCorePlacement.this;
            tJCorePlacement.a(tJCorePlacement.a("REQUEST"), TapjoyErrorMessage.ErrorType.SDK_ERROR, new TJError(0, "Cannot show content from a NULL placement"));
        }
    }

    public class e implements Runnable {
        public e(TJCorePlacement tJCorePlacement) {
        }

        @Override // java.lang.Runnable
        public void run() {
            TJPlacementManager.dismissContentShowing(false);
        }
    }

    public class f implements r6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f1669a;

        public f(String str) {
            this.f1669a = str;
        }

        public void a(Context context, String str, String str2) {
            if (str2 == null) {
                TJCorePlacement.this.d.setRedirectURL(str);
            } else {
                TJCorePlacement.this.d.setBaseURL(str);
                TJCorePlacement.this.d.setHttpResponse(str2);
            }
            TJCorePlacement.this.d.setHasProgressSpinner(true);
            TJCorePlacement.this.d.setContentViewId(this.f1669a);
            TJMemoryDataStorage.getInstance().put(TJCorePlacement.this.d.getPlacementName(), TJCorePlacement.this.d);
            Intent intent = new Intent(TJCorePlacement.this.b, (Class<?>) TJAdUnitActivity.class);
            intent.putExtra(TJAdUnitConstants.EXTRA_TJ_PLACEMENT_NAME, TJCorePlacement.this.d.getPlacementName());
            intent.setFlags(DriveFile.MODE_READ_ONLY);
            context.startActivity(intent);
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TJCorePlacement.this.k.a(z6.r.p);
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Intent f1671a;

        public h(Intent intent) {
            this.f1671a = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            TJCorePlacement.this.b.startActivity(this.f1671a);
        }
    }

    public class i implements TJCacheListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TJCacheListener f1672a;

        public i(TJCorePlacement tJCorePlacement, TJCacheListener tJCacheListener) {
            this.f1672a = tJCacheListener;
        }

        @Override // com.tapjoy.TJCacheListener
        public void onCachingComplete(int i) {
            this.f1672a.onCachingComplete(i);
        }
    }

    public TJCorePlacement(String str, String str2, boolean z) {
        Activity activityA = com.tapjoy.internal.b.a();
        this.b = activityA;
        if (activityA == null) {
            TapjoyLog.d("TJCorePlacement", "getVisibleActivity() is NULL. Activity can be explicitly set via `Tapjoy.setActivity(Activity)`");
        }
        this.v = z;
        TJPlacementData tJPlacementData = new TJPlacementData(str2, getPlacementContentUrl());
        this.d = tJPlacementData;
        tJPlacementData.setPlacementName(str);
        this.e = UUID.randomUUID().toString();
        TJAdUnit tJAdUnit = new TJAdUnit();
        this.g = tJAdUnit;
        tJAdUnit.setWebViewListener(this.w);
        this.g.setVideoListener(this.x);
    }

    public void d(TJPlacement tJPlacement) {
        if (tJPlacement == null) {
            TapjoyUtil.runOnMainThread(new d());
            return;
        }
        if (TapjoyConnectCore.isFullScreenViewOpen()) {
            TapjoyLog.w("TJCorePlacement", "Only one view can be presented at a time.");
            return;
        }
        if (TapjoyConnectCore.isViewOpen()) {
            TapjoyLog.w("TJCorePlacement", "Will close N2E content.");
            TapjoyUtil.runOnMainThread(new e(this));
        }
        a("SHOW", tJPlacement);
        String string = UUID.randomUUID().toString();
        g7 g7Var = this.k;
        if (g7Var != null) {
            g7Var.c = string;
            TapjoyConnectCore.viewWillOpen(string, g7Var == null ? 1 : g7Var instanceof u6 ? 3 : g7Var instanceof e7 ? 2 : 0);
            this.k.b = new f(string);
            z6.a(new g());
        } else {
            this.d.setContentViewId(string);
            TJMemoryDataStorage.getInstance().put(this.d.getPlacementName(), this.d);
            Intent intent = new Intent(this.b, (Class<?>) TJAdUnitActivity.class);
            intent.putExtra(TJAdUnitConstants.EXTRA_TJ_PLACEMENT_NAME, this.d.getPlacementName());
            intent.setFlags(DriveFile.MODE_READ_ONLY);
            TapjoyUtil.runOnMainThread(new h(intent));
        }
        this.f = 0L;
        this.o = false;
        this.p = false;
    }

    public final void e() {
        if (y5.e) {
            this.g.getTjBeacon().a("contentReady", (Map<String, String>) null);
        }
        if (this.n) {
            return;
        }
        this.p = true;
        StringBuilder sbA = w1.a("Content is ready for placement ");
        sbA.append(c());
        TapjoyLog.i("TJCorePlacement", sbA.toString());
        TJPlacement tJPlacementA = a("REQUEST");
        if (tJPlacementA == null || tJPlacementA.getListener() == null) {
            return;
        }
        tJPlacementA.getListener().onContentReady(tJPlacementA);
        this.n = true;
    }

    public void f(String str) {
        this.s = str;
        this.q = str;
        this.d.setPlacementType(str);
        String strA = a();
        if (TextUtils.isEmpty(strA)) {
            TapjoyLog.i("TJCorePlacement", "Placement mediation name can not be set for a null app ID");
            return;
        }
        this.d.setMediationURL(TapjoyConnectCore.getPlacementURL() + "v1/apps/" + strA + "/mediation_content?");
    }

    public synchronized void g() {
        String url = this.d.getUrl();
        if (TextUtils.isEmpty(url)) {
            url = getPlacementContentUrl();
            if (TextUtils.isEmpty(url)) {
                a(TapjoyErrorMessage.ErrorType.SDK_ERROR, new TJError(0, "TJPlacement is missing APP_ID"));
                return;
            }
            this.d.updateUrl(url);
        }
        TapjoyLog.d("TJCorePlacement", "sendContentRequest -- URL: " + url + " name: " + c());
        a(url, (Map<String, String>) null, true);
    }

    public TJAdUnit getAdUnit() {
        return this.g;
    }

    public Context getContext() {
        return this.b;
    }

    public String getPlacementContentUrl() {
        String strA = a();
        if (TextUtils.isEmpty(strA)) {
            TapjoyLog.i("TJCorePlacement", "Placement content URL cannot be generated for null app ID");
            return "";
        }
        return TapjoyConnectCore.getPlacementURL() + "v1/apps/" + strA + "/content?";
    }

    public TJPlacementData getPlacementData() {
        return this.d;
    }

    public boolean isContentAvailable() {
        return this.o;
    }

    public boolean isContentReady() {
        return this.p;
    }

    public boolean isLimited() {
        return this.v;
    }

    public void setContext(Context context) {
        this.b = context;
    }

    public synchronized void a(String str, Map<String, String> map, boolean z) {
        j5 j5Var;
        f6 f6Var;
        j5 j5Var2;
        f6 f6Var2;
        float fFloatValue;
        double dDoubleValue;
        if (this.m) {
            StringBuilder sbA = w1.a("Placement ");
            sbA.append(c());
            sbA.append(" is already requesting content");
            TapjoyLog.i("TJCorePlacement", sbA.toString());
            return;
        }
        this.d.resetPlacementRequestData();
        this.g.resetContentLoadState();
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        String strB = null;
        this.k = null;
        this.j = null;
        this.m = true;
        TJPlacement tJPlacementA = a("REQUEST");
        if (this.v) {
            Map<String, String> limitedGenericURLParams = TapjoyConnectCore.getLimitedGenericURLParams();
            this.c = limitedGenericURLParams;
            limitedGenericURLParams.putAll(TapjoyConnectCore.getLimitedTimeStampAndVerifierParams());
        } else {
            Map<String, String> genericURLParams = TapjoyConnectCore.getGenericURLParams();
            this.c = genericURLParams;
            genericURLParams.putAll(TapjoyConnectCore.getTimeStampAndVerifierParams());
        }
        TapjoyUtil.safePut(this.c, TJAdUnitConstants.PARAM_PLACEMENT_NAME, c(), true);
        TapjoyUtil.safePut(this.c, TJAdUnitConstants.PARAM_PLACEMENT_PRELOAD, String.valueOf(true), true);
        TapjoyUtil.safePut(this.c, TapjoyConstants.TJC_DEBUG, Boolean.toString(com.tapjoy.internal.a.b), true);
        z6 z6Var = z6.r;
        Map<String, String> map2 = this.c;
        i7 i7Var = z6Var.b;
        if (i7Var != null) {
            i7Var.a();
            strB = i7Var.c.b();
        }
        TapjoyUtil.safePut(map2, TJAdUnitConstants.PARAM_ACTION_ID_EXCLUSION, strB, true);
        TapjoyUtil.safePut(this.c, TJAdUnitConstants.PARAM_PLACEMENT_BY_SDK, String.valueOf(this.l), true);
        TapjoyUtil.safePut(this.c, TJAdUnitConstants.PARAM_PUSH_ID, tJPlacementA.pushId, true);
        TapjoyUtil.safePut(this.c, TapjoyConstants.TJC_MEDIATION_SOURCE, this.q, true);
        TapjoyUtil.safePut(this.c, TapjoyConstants.TJC_ADAPTER_VERSION, this.r, true);
        if (!TextUtils.isEmpty(TapjoyConnectCore.getCustomParameter())) {
            TapjoyUtil.safePut(this.c, TapjoyConstants.TJC_CUSTOM_PARAMETER, TapjoyConnectCore.getCustomParameter(), true);
        }
        if (map != null) {
            this.c.putAll(map);
        }
        if (y5.e) {
            TapjoyUtil.safePut(this.c, "sdk_beacon_id", this.g.getTjBeacon().f1949a, true);
        }
        if (z) {
            Iterator<g6.a> it = z5.b().f1804a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    fFloatValue = 0.0f;
                    break;
                }
                Object objA = it.next().a("placement_request_content_retry_timeout");
                if (objA != null) {
                    if (objA instanceof Number) {
                        fFloatValue = ((Number) objA).floatValue();
                        break;
                    } else if (objA instanceof String) {
                        try {
                            fFloatValue = Float.parseFloat((String) objA);
                            break;
                        } catch (IllegalArgumentException unused) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
            j5Var = new j5((long) fFloatValue);
            Iterator<g6.a> it2 = z5.b().f1804a.iterator();
            while (it2.hasNext()) {
                Object objA2 = it2.next().a("placement_request_content_retry_backoff");
                if (objA2 instanceof List) {
                    List list = (List) objA2;
                    try {
                        long jA = g6.a(list.get(0));
                        long jA2 = g6.a(list.get(1));
                        long jA3 = g6.a(list.get(2));
                        Object obj = list.get(3);
                        if (obj instanceof Number) {
                            dDoubleValue = ((Number) obj).doubleValue();
                        } else {
                            if (!(obj instanceof String)) {
                                throw new IllegalArgumentException();
                            }
                            dDoubleValue = Double.parseDouble((String) obj);
                        }
                        j5Var2 = j5Var;
                        f6Var2 = new f6(jA, jA2, jA3, dDoubleValue);
                        new c(str, tJPlacementA, j5Var2, f6Var2).start();
                    } catch (RuntimeException unused2) {
                    }
                }
            }
            f6Var = f6.f;
        } else {
            j5Var = j5.c;
            f6Var = f6.f;
        }
        j5Var2 = j5Var;
        f6Var2 = f6Var;
        new c(str, tJPlacementA, j5Var2, f6Var2).start();
    }

    public final void b(String str) throws TapjoyException {
        if (str == null) {
            throw new TapjoyException("TJPlacement request failed due to null response");
        }
        try {
            TapjoyLog.d("TJCorePlacement", "Disable preload flag is set for placement " + c());
            this.d.setRedirectURL(new JSONObject(str).getString(TapjoyConstants.TJC_REDIRECT_URL));
            this.d.setPreloadDisabled(true);
            this.d.setHasProgressSpinner(true);
            TapjoyLog.d("TJCorePlacement", "redirect_url:" + this.d.getRedirectURL());
        } catch (JSONException unused) {
            throw new TapjoyException("TJPlacement request failed, malformed server response");
        }
    }

    public void c(TJPlacement tJPlacement) {
        if (tJPlacement == null) {
            a(TapjoyErrorMessage.ErrorType.SDK_ERROR, new TJError(0, "Cannot request content from a NULL placement"));
            return;
        }
        a("REQUEST", tJPlacement);
        if (this.f - SystemClock.elapsedRealtime() > 0) {
            StringBuilder sbA = w1.a("Content has not expired yet for ");
            sbA.append(c());
            TapjoyLog.d("TJCorePlacement", sbA.toString());
            if (!this.o) {
                b(tJPlacement);
                return;
            }
            this.n = false;
            b(tJPlacement);
            e();
            return;
        }
        if (TextUtils.isEmpty(this.s)) {
            g();
            return;
        }
        HashMap map = new HashMap();
        map.put(TJAdUnitConstants.PARAM_PLACEMENT_MEDIATION_AGENT, this.s);
        map.put(TJAdUnitConstants.PARAM_PLACEMENT_MEDIATION_ID, this.t);
        HashMap<String, String> map2 = this.u;
        if (map2 == null || map2.isEmpty()) {
            a(this.d.getMediationURL(), (Map<String, String>) map, true);
            return;
        }
        for (String str : this.u.keySet()) {
            map.put(TJAdUnitConstants.AUCTION_PARAM_PREFIX + str, this.u.get(str));
        }
        a(this.d.getAuctionMediationURL(), (Map<String, String>) map, true);
    }

    public void e(String str) {
        this.t = str;
    }

    public void f() {
        StringBuilder sbA = w1.a("Content shown for placement ");
        sbA.append(c());
        TapjoyLog.i("TJCorePlacement", sbA.toString());
        TJPlacement tJPlacementA = a("SHOW");
        if (tJPlacementA == null || tJPlacementA.getListener() == null) {
            return;
        }
        tJPlacementA.getListener().onContentShow(tJPlacementA);
    }

    public String b() {
        return this.e;
    }

    public final void b(TJPlacement tJPlacement) {
        if (tJPlacement == null || tJPlacement.getListener() == null) {
            return;
        }
        StringBuilder sbA = w1.a("Content request delivered successfully for placement ");
        sbA.append(c());
        sbA.append(", contentAvailable: ");
        sbA.append(isContentAvailable());
        sbA.append(", mediationAgent: ");
        sbA.append(this.s);
        TapjoyLog.i("TJCorePlacement", sbA.toString());
        tJPlacement.getListener().onRequestSuccess(tJPlacement);
    }

    public final boolean c(String str) {
        try {
            k8.a aVarA = this.j.a(URI.create(this.d.getUrl()), new ByteArrayInputStream(str.getBytes()));
            this.k = aVarA.f1840a;
            aVarA.f1840a.b();
            if (aVarA.f1840a.a()) {
                return true;
            }
            TapjoyLog.e("TJCorePlacement", "Failed to load fiverocks placement");
            return false;
        } catch (o1 e2) {
            TapjoyLog.e("TJCorePlacement", e2.toString());
            e2.printStackTrace();
            return false;
        } catch (IOException e3) {
            TapjoyLog.e("TJCorePlacement", e3.toString());
            e3.printStackTrace();
            return false;
        }
    }

    public final String c() {
        return this.d.getPlacementName();
    }

    public void d(String str) {
        this.r = str;
    }

    public void d() {
        TJPlacement tJPlacementA = a("SHOW");
        if (tJPlacementA == null || tJPlacementA.getListener() == null) {
            return;
        }
        a(tJPlacementA);
    }

    public void a(TapjoyHttpURLResponse tapjoyHttpURLResponse, TJCacheListener tJCacheListener) {
        StringBuilder sbA = w1.a("Checking if there is content to cache for placement ");
        sbA.append(c());
        TapjoyLog.i("TJCorePlacement", sbA.toString());
        String headerFieldAsString = tapjoyHttpURLResponse.getHeaderFieldAsString(TapjoyConstants.TAPJOY_CACHE_HEADER);
        try {
            if (!TJPlacementManager.canCachePlacement()) {
                TapjoyLog.i("TJCorePlacement", "Placement caching limit reached. No content will be cached for placement " + c());
                tJCacheListener.onCachingComplete(2);
            } else {
                JSONArray jSONArray = new JSONArray(headerFieldAsString);
                if (jSONArray.length() > 0) {
                    TapjoyLog.i("TJCorePlacement", "Begin caching content for placement " + c());
                    TJPlacementManager.incrementPlacementCacheCount();
                    this.h = true;
                    TapjoyCache.getInstance().cacheAssetGroup(jSONArray, new i(this, tJCacheListener));
                } else {
                    tJCacheListener.onCachingComplete(1);
                }
            }
        } catch (Exception e2) {
            tJCacheListener.onCachingComplete(2);
            TapjoyLog.d("TJCorePlacement", "Error while handling placement cache: " + e2.getMessage());
        }
    }

    public void a(HashMap<String, String> map) {
        this.u = map;
        String strA = a();
        if (!TextUtils.isEmpty(strA)) {
            this.d.setAuctionMediationURL(TapjoyConnectCore.getPlacementURL() + "v1/apps/" + strA + "/bid_content?");
            return;
        }
        TapjoyLog.i("TJCorePlacement", "Placement auction data can not be set for a null app ID");
    }

    public void a(boolean z) {
        this.l = z;
        this.d.setPlacementType(TapjoyConstants.TJC_SDK_PLACEMENT);
    }

    public void a(String str, TJPlacement tJPlacement) {
        synchronized (this.f1664a) {
            this.f1664a.put(str, tJPlacement);
            if (tJPlacement != null) {
                TapjoyLog.d("TJCorePlacement", "Setting " + str + " placement: " + tJPlacement.getGUID());
            }
        }
    }

    public TJPlacement a(String str) {
        TJPlacement tJPlacement;
        synchronized (this.f1664a) {
            tJPlacement = this.f1664a.get(str);
            if (tJPlacement != null) {
                TapjoyLog.d("TJCorePlacement", "Returning " + str + " placement: " + tJPlacement.getGUID());
            }
        }
        return tJPlacement;
    }

    public static /* synthetic */ void a(TJCorePlacement tJCorePlacement) {
        tJCorePlacement.o = true;
        tJCorePlacement.b(tJCorePlacement.a("REQUEST"));
    }

    public final void a(TapjoyErrorMessage.ErrorType errorType, TJError tJError) {
        a(a("REQUEST"), errorType, tJError);
    }

    public void a(TJPlacement tJPlacement, TapjoyErrorMessage.ErrorType errorType, TJError tJError) {
        StringBuilder sbA = w1.a("Content request failed for placement ");
        sbA.append(c());
        sbA.append("; Reason= ");
        sbA.append(tJError.message);
        TapjoyLog.e("TJCorePlacement", new TapjoyErrorMessage(errorType, sbA.toString()));
        if (tJPlacement == null || tJPlacement.getListener() == null) {
            return;
        }
        tJPlacement.getListener().onRequestFailure(tJPlacement, tJError);
    }

    public void a(TJPlacement tJPlacement) {
        StringBuilder sbA = w1.a("Content dismissed for placement ");
        sbA.append(c());
        TapjoyLog.i("TJCorePlacement", sbA.toString());
        if (tJPlacement == null || tJPlacement.a() == null) {
            return;
        }
        tJPlacement.a().onContentDismiss(tJPlacement);
    }

    public final String a() {
        if (!this.v) {
            return TapjoyConnectCore.getAppID();
        }
        return TapjoyConnectCore.getLimitedAppID();
    }
}
