package com.applovin.impl.mediation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.applovin.impl.mediation.a.g;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.f;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.w;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyAuctionFlags;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class MediationServiceImpl implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f934a;
    private final y b;
    private final AtomicReference<JSONObject> c = new AtomicReference<>();

    public MediationServiceImpl(p pVar) {
        this.f934a = pVar;
        this.b = pVar.L();
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
    }

    public void loadAd(String str, String str2, MaxAdFormat maxAdFormat, f.a aVar, Map<String, Object> map, Map<String, Object> map2, Context context, a.InterfaceC0058a interfaceC0058a) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No ad unit ID specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        if (interfaceC0058a == null) {
            throw new IllegalArgumentException("No listener specified");
        }
        if (TextUtils.isEmpty(this.f934a.s())) {
            y.i("AppLovinSdk", "Mediation provider is null. Please set AppLovin SDK mediation provider via AppLovinSdk.getInstance(context).setMediationProvider()");
        }
        if (!this.f934a.d()) {
            y.h("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        this.f934a.a();
        if (str.length() != 16 && !str.startsWith("test_mode") && !this.f934a.B().startsWith("05TMD")) {
            y.i("MediationService", "Please double-check the ad unit " + str + " for " + maxAdFormat.getLabel() + " : " + Log.getStackTraceString(new Throwable("")));
        }
        if (this.f934a.a(maxAdFormat)) {
            y.i("MediationService", "Ad load failed due to disabled ad format " + maxAdFormat.getLabel());
            com.applovin.impl.sdk.utils.k.a(interfaceC0058a, str, new MaxErrorImpl(-1, "Disabled ad format " + maxAdFormat.getLabel()));
            return;
        }
        com.applovin.impl.sdk.utils.k.a((MaxAdRequestListener) interfaceC0058a, str, true);
        this.f934a.au().a(str, str2, maxAdFormat, aVar, map, map2, context, interfaceC0058a);
    }

    public void showFullscreenAd(final com.applovin.impl.mediation.a.c cVar, final Activity activity, final a.InterfaceC0058a interfaceC0058a) {
        if (cVar == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (activity == null && MaxAdFormat.APP_OPEN != cVar.getFormat()) {
            throw new IllegalArgumentException("No activity specified");
        }
        this.f934a.Z().a(true);
        final i iVarA = a(cVar);
        long jH = cVar.H();
        if (y.a()) {
            this.b.c("MediationService", "Showing ad " + cVar.getAdUnitId() + " with delay of " + jH + "ms...");
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl.1
            @Override // java.lang.Runnable
            public void run() {
                cVar.a(true);
                MediationServiceImpl.this.b(cVar);
                iVarA.a(cVar, activity);
                MediationServiceImpl.this.a(cVar, interfaceC0058a);
            }
        }, jH);
    }

    public void showFullscreenAd(final com.applovin.impl.mediation.a.c cVar, final ViewGroup viewGroup, final Lifecycle lifecycle, final Activity activity, final a.InterfaceC0058a interfaceC0058a) {
        if (cVar == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        this.f934a.Z().a(true);
        final i iVarA = a(cVar);
        long jH = cVar.H();
        if (y.a()) {
            this.b.c("MediationService", "Showing ad " + cVar.getAdUnitId() + " with delay of " + jH + "ms...");
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl.2
            @Override // java.lang.Runnable
            public void run() {
                cVar.a(true);
                MediationServiceImpl.this.b(cVar);
                iVarA.a(cVar, viewGroup, lifecycle, activity);
                MediationServiceImpl.this.a(cVar, interfaceC0058a);
            }
        }, jH);
    }

    private i a(com.applovin.impl.mediation.a.c cVar) {
        i iVarI = cVar.i();
        if (iVarI != null) {
            return iVarI;
        }
        this.f934a.Z().a(false);
        if (y.a()) {
            this.b.d("MediationService", "Failed to show " + cVar + ": adapter not found");
        }
        y.i("MediationService", "There may be an integration problem with the adapter for ad unit id '" + cVar.getAdUnitId() + "'. Please check if you have a supported version of that SDK integrated into your project.");
        throw new IllegalStateException("Could not find adapter for provided ad");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.applovin.impl.mediation.a.c cVar) {
        if (cVar.getFormat() == MaxAdFormat.REWARDED || cVar.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) {
            this.f934a.M().a(new com.applovin.impl.mediation.c.h(cVar, this.f934a), o.a.MEDIATION_REWARD);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.c cVar, a.InterfaceC0058a interfaceC0058a) {
        this.f934a.Z().a(false);
        a(cVar, (MaxAdListener) interfaceC0058a);
        if (y.a()) {
            this.b.b("MediationService", "Scheduling impression for ad manually...");
        }
        processRawAdImpressionPostback(cVar, interfaceC0058a);
        if (cVar.p() == null || !cVar.z().get()) {
            return;
        }
        if (y.a()) {
            this.b.b("MediationService", "Running ad displayed logic");
        }
        this.f934a.ab().a(cVar, "DID_DISPLAY");
        this.f934a.Z().a(cVar);
        com.applovin.impl.sdk.utils.k.b((MaxAdListener) interfaceC0058a, (MaxAd) cVar, true);
    }

    public void destroyAd(MaxAd maxAd) {
        if (maxAd instanceof com.applovin.impl.mediation.a.a) {
            if (y.a()) {
                this.b.c("MediationService", "Destroying " + maxAd);
            }
            com.applovin.impl.mediation.a.a aVar = (com.applovin.impl.mediation.a.a) maxAd;
            i iVarI = aVar.i();
            if (iVarI != null) {
                iVarI.j();
                aVar.B();
            }
            this.f934a.am().b(aVar.h());
        }
    }

    public void loadThirdPartyMediatedAd(String str, com.applovin.impl.mediation.a.a aVar, Activity activity, a.InterfaceC0058a interfaceC0058a) {
        if (aVar == null) {
            throw new IllegalArgumentException("No mediated ad specified");
        }
        if (y.a()) {
            this.b.b("MediationService", "Loading " + aVar + "...");
        }
        this.f934a.ab().a(aVar, "WILL_LOAD");
        i iVarA = this.f934a.an().a(aVar);
        if (iVarA != null) {
            MaxAdapterParametersImpl maxAdapterParametersImplA = MaxAdapterParametersImpl.a(aVar);
            if (((Boolean) this.f934a.a(com.applovin.impl.sdk.c.a.R)).booleanValue()) {
                this.f934a.ao().a(aVar, activity);
            }
            com.applovin.impl.mediation.a.a aVarA = aVar.a(iVarA);
            iVarA.a(str, aVarA);
            aVarA.w();
            iVarA.a(str, maxAdapterParametersImplA, aVarA, activity, new a(aVarA, interfaceC0058a));
            return;
        }
        String str2 = "Failed to load " + aVar + ": adapter not loaded";
        y.i("MediationService", str2);
        a(aVar, new MaxErrorImpl(-5001, str2), interfaceC0058a);
    }

    public void collectSignal(String str, MaxAdFormat maxAdFormat, final com.applovin.impl.mediation.a.h hVar, Context context, final g.a aVar) {
        if (hVar == null) {
            throw new IllegalArgumentException("No spec specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("No callback specified");
        }
        final i iVarA = this.f934a.an().a(hVar, hVar.b());
        if (iVarA != null) {
            Activity activityX = context instanceof Activity ? (Activity) context : this.f934a.x();
            MaxAdapterParametersImpl maxAdapterParametersImplA = MaxAdapterParametersImpl.a(hVar, str, maxAdFormat);
            if (((Boolean) this.f934a.a(com.applovin.impl.sdk.c.a.Q)).booleanValue()) {
                this.f934a.ao().a(hVar, activityX);
            }
            MaxSignalCollectionListener maxSignalCollectionListener = new MaxSignalCollectionListener() { // from class: com.applovin.impl.mediation.MediationServiceImpl.3
                @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
                public void onSignalCollected(String str2) {
                    aVar.a(com.applovin.impl.mediation.a.g.a(hVar, iVarA, str2));
                    iVarA.j();
                }

                @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
                public void onSignalCollectionFailed(String str2) {
                    MediationServiceImpl.this.a(str2, hVar, iVarA);
                    aVar.a(com.applovin.impl.mediation.a.g.b(hVar, iVarA, str2));
                    iVarA.j();
                }
            };
            if (hVar.a()) {
                if (this.f934a.ao().a(hVar)) {
                    if (y.a()) {
                        this.b.b("MediationService", "Collecting signal for now-initialized adapter: " + iVarA.d());
                    }
                    iVarA.a(maxAdapterParametersImplA, hVar, activityX, maxSignalCollectionListener);
                    return;
                }
                if (y.a()) {
                    this.b.e("MediationService", "Skip collecting signal for not-initialized adapter: " + iVarA.d());
                }
                aVar.a(com.applovin.impl.mediation.a.g.a(hVar, "Adapter not initialized yet"));
                return;
            }
            if (y.a()) {
                this.b.b("MediationService", "Collecting signal for adapter: " + iVarA.d());
            }
            iVarA.a(maxAdapterParametersImplA, hVar, activityX, maxSignalCollectionListener);
            return;
        }
        aVar.a(com.applovin.impl.mediation.a.g.a(hVar, "Could not load adapter"));
    }

    private void a(final com.applovin.impl.mediation.a.c cVar, final MaxAdListener maxAdListener) {
        final long jLongValue = ((Long) this.f934a.a(com.applovin.impl.sdk.c.a.F)).longValue();
        if (jLongValue <= 0) {
            return;
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl.4
            @Override // java.lang.Runnable
            public void run() {
                if (cVar.z().get()) {
                    return;
                }
                String str = "Ad (" + cVar.Z() + ") has not been displayed after " + jLongValue + "ms. Failing ad display...";
                y.i("MediationService", str);
                MediationServiceImpl.this.b(cVar, new MaxErrorImpl(-1, str), maxAdListener);
                MediationServiceImpl.this.f934a.Z().b(cVar);
            }
        }, jLongValue);
    }

    public void setCustomPostBodyData(JSONObject jSONObject) {
        this.c.set(jSONObject);
    }

    public JSONObject getAndResetCustomPostBodyData() {
        return this.c.getAndSet(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.a aVar, MaxError maxError, MaxAdListener maxAdListener) {
        a(maxError, aVar);
        destroyAd(aVar);
        com.applovin.impl.sdk.utils.k.a(maxAdListener, aVar.getAdUnitId(), maxError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.applovin.impl.mediation.a.a aVar, MaxError maxError, MaxAdListener maxAdListener) {
        if (aVar.p() != null) {
            if (y.a()) {
                this.b.e("MediationService", "Ignoring ad display failure for hybrid ad...");
            }
        } else {
            this.f934a.ab().a(aVar, "DID_FAIL_DISPLAY");
            a(maxError, aVar, true);
            if (aVar.z().compareAndSet(false, true)) {
                com.applovin.impl.sdk.utils.k.a(maxAdListener, aVar, maxError);
            }
        }
    }

    public void processAdLossPostback(com.applovin.impl.mediation.a.a aVar, Float f) {
        String string = f != null ? f.toString() : "";
        Map<String, String> map = CollectionUtils.map(1);
        map.put("{MBR}", string);
        a("mloss", map, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.a aVar) {
        this.f934a.ab().a(aVar, "DID_LOAD");
        if (aVar.f().endsWith("load")) {
            this.f934a.ab().a(aVar);
        }
        Map<String, String> map = CollectionUtils.map(3);
        map.put("{LOAD_TIME_MS}", String.valueOf(aVar.v()));
        if (aVar.getFormat().isFullscreenAd()) {
            w.a aVarB = this.f934a.Z().b(aVar.getAdUnitId());
            map.put("{SHOW_ATTEMPT_COUNT}", String.valueOf(aVarB.b()));
            map.put("{SHOW_ATTEMPT_TIMESTAMP_MS}", String.valueOf(aVarB.a()));
        }
        a("load", map, aVar);
    }

    private void a(MaxError maxError, com.applovin.impl.mediation.a.a aVar) {
        Map<String, String> map = CollectionUtils.map(3);
        map.put("{LOAD_TIME_MS}", String.valueOf(aVar.v()));
        if (aVar.getFormat().isFullscreenAd()) {
            w.a aVarB = this.f934a.Z().b(aVar.getAdUnitId());
            map.put("{SHOW_ATTEMPT_COUNT}", String.valueOf(aVarB.b()));
            map.put("{SHOW_ATTEMPT_TIMESTAMP_MS}", String.valueOf(aVarB.a()));
        }
        a("mlerr", map, maxError, aVar);
    }

    public void processAdapterInitializationPostback(com.applovin.impl.mediation.a.f fVar, long j, MaxAdapter.InitializationStatus initializationStatus, String str) {
        Map<String, String> map = CollectionUtils.map(2);
        map.put("{INIT_STATUS}", String.valueOf(initializationStatus.getCode()));
        map.put("{INIT_TIME_MS}", String.valueOf(j));
        a("minit", map, new MaxErrorImpl(str), fVar);
    }

    public void processRawAdImpressionPostback(com.applovin.impl.mediation.a.a aVar, a.InterfaceC0058a interfaceC0058a) {
        this.f934a.ab().a(aVar, "WILL_DISPLAY");
        if (aVar.f().endsWith("mimp")) {
            this.f934a.ab().a(aVar);
            com.applovin.impl.sdk.utils.k.a((MaxAdRevenueListener) interfaceC0058a, (MaxAd) aVar);
        }
        Map<String, String> map = CollectionUtils.map(2);
        if (aVar instanceof com.applovin.impl.mediation.a.c) {
            map.put("{TIME_TO_SHOW_MS}", String.valueOf(((com.applovin.impl.mediation.a.c) aVar).G()));
        }
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f934a.o());
        if (!((Boolean) this.f934a.a(com.applovin.impl.sdk.c.b.dR)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        a("mimp", map, aVar);
    }

    public void processViewabilityAdImpressionPostback(com.applovin.impl.mediation.a.e eVar, long j, a.InterfaceC0058a interfaceC0058a) {
        if (eVar.f().endsWith("vimp")) {
            this.f934a.ab().a(eVar);
            com.applovin.impl.sdk.utils.k.a((MaxAdRevenueListener) interfaceC0058a, (MaxAd) eVar);
        }
        Map<String, String> map = CollectionUtils.map(3);
        map.put("{VIEWABILITY_FLAGS}", String.valueOf(j));
        map.put("{USED_VIEWABILITY_TIMER}", String.valueOf(eVar.T()));
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f934a.o());
        if (!((Boolean) this.f934a.a(com.applovin.impl.sdk.c.b.dR)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        a("mvimp", map, eVar);
    }

    public void processCallbackAdImpressionPostback(com.applovin.impl.mediation.a.a aVar, a.InterfaceC0058a interfaceC0058a) {
        if (aVar.f().endsWith("cimp")) {
            this.f934a.ab().a(aVar);
            com.applovin.impl.sdk.utils.k.a((MaxAdRevenueListener) interfaceC0058a, (MaxAd) aVar);
        }
        Map<String, String> map = CollectionUtils.map(1);
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f934a.o());
        if (!((Boolean) this.f934a.a(com.applovin.impl.sdk.c.b.dR)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        a("mcimp", map, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.a aVar, a.InterfaceC0058a interfaceC0058a) {
        this.f934a.ab().a(aVar, "DID_CLICKED");
        this.f934a.ab().a(aVar, "DID_CLICK");
        if (aVar.f().endsWith(TJAdUnitConstants.String.CLICK)) {
            this.f934a.ab().a(aVar);
            com.applovin.impl.sdk.utils.k.a((MaxAdRevenueListener) interfaceC0058a, (MaxAd) aVar);
        }
        Map<String, String> map = CollectionUtils.map(1);
        String strEmptyIfNull = StringUtils.emptyIfNull(this.f934a.o());
        if (!((Boolean) this.f934a.a(com.applovin.impl.sdk.c.b.dR)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        List listAsList = Arrays.asList(TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE, "12", "123", "1234");
        if (((Boolean) this.f934a.a(com.applovin.impl.sdk.c.b.fT)).booleanValue()) {
            Collections.sort(listAsList, new Comparator() { // from class: com.applovin.impl.mediation.MediationServiceImpl$$ExternalSyntheticLambda7
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return MediationServiceImpl.a((String) obj, (String) obj2);
                }
            });
        }
        if (((Boolean) this.f934a.a(com.applovin.impl.sdk.c.b.fU)).booleanValue()) {
            Collections.sort(listAsList, new Comparator() { // from class: com.applovin.impl.mediation.MediationServiceImpl$$ExternalSyntheticLambda8
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((String) obj).compareToIgnoreCase((String) obj2);
                }
            });
        }
        if (com.applovin.impl.sdk.utils.h.f()) {
            if (((Boolean) this.f934a.a(com.applovin.impl.sdk.c.b.fV)).booleanValue()) {
            }
            if (((Boolean) this.f934a.a(com.applovin.impl.sdk.c.b.fW)).booleanValue()) {
                Optional optionalOfNullable = Optional.ofNullable((String) listAsList.get(0));
                if (optionalOfNullable.isPresent()) {
                    Log.d("MediationService", "Java 8 Optional feature test: " + ((String) optionalOfNullable.get()));
                }
            }
        }
        if (((Boolean) this.f934a.a(com.applovin.impl.sdk.c.b.fX)).booleanValue()) {
            new d(3).b();
        }
        a("mclick", map, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(String str, String str2) {
        return Integer.compare(str.length(), str2.length());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(String str) {
        return str.length() >= 2;
    }

    public void processAdDisplayErrorPostbackForUserError(MaxError maxError, com.applovin.impl.mediation.a.a aVar) {
        a(maxError, aVar, false);
    }

    private void a(MaxError maxError, com.applovin.impl.mediation.a.a aVar, boolean z) {
        a("mierr", Collections.EMPTY_MAP, maxError, aVar, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, com.applovin.impl.mediation.a.h hVar, i iVar) {
        Map<String, String> map = CollectionUtils.map(2);
        CollectionUtils.putStringIfValid("{ADAPTER_VERSION}", iVar.i(), map);
        CollectionUtils.putStringIfValid("{SDK_VERSION}", iVar.h(), map);
        a("serr", map, new MaxErrorImpl(str), hVar);
    }

    private void a(String str, Map<String, String> map, com.applovin.impl.mediation.a.f fVar) {
        a(str, map, (MaxError) null, fVar);
    }

    private void a(String str, Map<String, String> map, MaxError maxError, com.applovin.impl.mediation.a.f fVar) {
        a(str, map, maxError, fVar, true);
    }

    private void a(String str, Map<String, String> map, MaxError maxError, com.applovin.impl.mediation.a.f fVar, boolean z) {
        String strEmptyIfNull;
        Map map2 = CollectionUtils.map(map);
        String strEmptyIfNull2 = "";
        map2.put("{PLACEMENT}", z ? StringUtils.emptyIfNull(fVar.getPlacement()) : "");
        if (!z) {
            strEmptyIfNull = "";
        } else {
            strEmptyIfNull = StringUtils.emptyIfNull(fVar.am());
        }
        map2.put("{CUSTOM_DATA}", strEmptyIfNull);
        if (fVar instanceof com.applovin.impl.mediation.a.a) {
            com.applovin.impl.mediation.a.a aVar = (com.applovin.impl.mediation.a.a) fVar;
            if (z) {
                strEmptyIfNull2 = StringUtils.emptyIfNull(aVar.getCreativeId());
            }
            map2.put("{CREATIVE_ID}", strEmptyIfNull2);
        }
        this.f934a.M().a(new com.applovin.impl.mediation.c.d(str, map2, maxError, fVar, this.f934a, z), o.a.MEDIATION_POSTBACKS);
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map<String, Object> map) {
        if ("com.applovin.render_process_gone".equals(intent.getAction())) {
            Object objC = this.f934a.Z().c();
            if (objC instanceof com.applovin.impl.mediation.a.a) {
                a((MaxError) MaxAdapterError.WEBVIEW_ERROR, (com.applovin.impl.mediation.a.a) objC, true);
            }
        }
    }

    public class a implements a.InterfaceC0058a, MaxAdListener, MaxAdRevenueListener, MaxAdViewAdListener, MaxRewardedAdListener {
        private final com.applovin.impl.mediation.a.a b;
        private a.InterfaceC0058a c;

        @Override // com.applovin.impl.mediation.f.b
        public void a(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        public a(com.applovin.impl.mediation.a.a aVar, a.InterfaceC0058a interfaceC0058a) {
            this.b = aVar;
            this.c = interfaceC0058a;
        }

        public void a(a.InterfaceC0058a interfaceC0058a) {
            this.c = interfaceC0058a;
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            a(maxAd, null);
        }

        public void a(MaxAd maxAd, Bundle bundle) {
            this.b.a(bundle);
            this.b.y();
            MediationServiceImpl.this.a(this.b);
            com.applovin.impl.sdk.utils.k.a((MaxAdListener) this.c, maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            this.b.y();
            MediationServiceImpl.this.a(this.b, maxError, this.c);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            b(maxAd, null);
        }

        public void b(MaxAd maxAd, Bundle bundle) {
            this.b.a(bundle);
            y unused = MediationServiceImpl.this.b;
            if (y.a()) {
                MediationServiceImpl.this.b.b("MediationService", "Scheduling impression for ad via callback...");
            }
            MediationServiceImpl.this.processCallbackAdImpressionPostback(this.b, this.c);
            MediationServiceImpl.this.f934a.P().a(com.applovin.impl.sdk.d.f.c);
            MediationServiceImpl.this.f934a.P().a(com.applovin.impl.sdk.d.f.f);
            if (!maxAd.getFormat().isFullscreenAd()) {
                MediationServiceImpl.this.f934a.ab().a(this.b, "DID_DISPLAY");
                com.applovin.impl.sdk.utils.k.b(this.c, maxAd);
                return;
            }
            com.applovin.impl.mediation.a.c cVar = (com.applovin.impl.mediation.a.c) maxAd;
            if (cVar.T()) {
                MediationServiceImpl.this.f934a.ab().a(this.b, "DID_DISPLAY");
                MediationServiceImpl.this.f934a.Z().a(this.b);
                com.applovin.impl.sdk.utils.k.b(this.c, maxAd);
            } else {
                y unused2 = MediationServiceImpl.this.b;
                if (y.a()) {
                    MediationServiceImpl.this.b.d("MediationService", "Received ad display callback before attempting show".concat(cVar.p() != null ? " for hybrid ad" : ""));
                }
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            c(maxAd, null);
        }

        public void c(final MaxAd maxAd, Bundle bundle) {
            this.b.a(bundle);
            MediationServiceImpl.this.f934a.ab().a((com.applovin.impl.mediation.a.a) maxAd, "DID_HIDE");
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl.a.1
                @Override // java.lang.Runnable
                public void run() {
                    if (maxAd.getFormat().isFullscreenAd()) {
                        MediationServiceImpl.this.f934a.Z().b(maxAd);
                    }
                    com.applovin.impl.sdk.utils.k.c(a.this.c, maxAd);
                }
            }, maxAd instanceof com.applovin.impl.mediation.a.c ? ((com.applovin.impl.mediation.a.c) maxAd).I() : 0L);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            d(maxAd, null);
        }

        public void d(MaxAd maxAd, Bundle bundle) {
            this.b.a(bundle);
            MediationServiceImpl.this.a(this.b, this.c);
            com.applovin.impl.sdk.utils.k.d(this.c, maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            a(maxAd, maxError, (Bundle) null);
        }

        public void a(MaxAd maxAd, MaxError maxError, Bundle bundle) {
            this.b.a(bundle);
            MediationServiceImpl.this.b(this.b, maxError, this.c);
            if ((maxAd.getFormat() == MaxAdFormat.REWARDED || maxAd.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) && (maxAd instanceof com.applovin.impl.mediation.a.c)) {
                ((com.applovin.impl.mediation.a.c) maxAd).N();
            }
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onRewardedVideoStarted(MaxAd maxAd) {
            com.applovin.impl.sdk.utils.k.e(this.c, maxAd);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onRewardedVideoCompleted(MaxAd maxAd) {
            com.applovin.impl.sdk.utils.k.f(this.c, maxAd);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            a(maxAd, maxReward, (Bundle) null);
        }

        public void a(MaxAd maxAd, MaxReward maxReward, Bundle bundle) {
            this.b.a(bundle);
            com.applovin.impl.sdk.utils.k.a(this.c, maxAd, maxReward);
            MediationServiceImpl.this.f934a.M().a(new com.applovin.impl.mediation.c.g((com.applovin.impl.mediation.a.c) maxAd, MediationServiceImpl.this.f934a), o.a.MEDIATION_REWARD);
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(MaxAd maxAd) {
            e(maxAd, null);
        }

        public void e(MaxAd maxAd, Bundle bundle) {
            this.b.a(bundle);
            com.applovin.impl.sdk.utils.k.g(this.c, maxAd);
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(MaxAd maxAd) {
            f(maxAd, null);
        }

        public void f(MaxAd maxAd, Bundle bundle) {
            this.b.a(bundle);
            com.applovin.impl.sdk.utils.k.h(this.c, maxAd);
        }
    }
}
