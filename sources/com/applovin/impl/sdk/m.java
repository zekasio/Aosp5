package com.applovin.impl.sdk;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.network.j;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tapjoy.TapjoyAuctionFlags;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.model.ReportDBAdapter;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class m implements AppLovinCommunicatorPublisher, AppLovinCommunicatorSubscriber {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f1344a;
    private final AppLovinCommunicator b;

    m(p pVar) {
        this.f1344a = pVar;
        AppLovinCommunicator appLovinCommunicator = AppLovinCommunicator.getInstance(p.y());
        this.b = appLovinCommunicator;
        if (pVar.e() || !((Boolean) pVar.a(com.applovin.impl.sdk.c.b.gf)).booleanValue()) {
            return;
        }
        appLovinCommunicator.a(pVar);
        appLovinCommunicator.subscribe(this, com.applovin.impl.communicator.c.f927a);
    }

    public void a(JSONObject jSONObject, boolean z) {
        if (((Boolean) this.f1344a.a(com.applovin.impl.sdk.c.b.gf)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f1344a.B());
            bundle.putString("applovin_random_token", this.f1344a.q());
            bundle.putString("compass_random_token", this.f1344a.p());
            bundle.putString(TapjoyConstants.TJC_DEVICE_TYPE_NAME, AppLovinSdkUtils.isTablet(p.y()) ? "tablet" : "phone");
            bundle.putString("init_success", String.valueOf(z));
            bundle.putParcelableArrayList("installed_mediation_adapters", JsonUtils.toBundle(com.applovin.impl.mediation.d.c.a(this.f1344a)));
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "communicator_settings", (JSONObject) null);
            Bundle bundle2 = (Bundle) bundle.clone();
            bundle2.putString(ReportDBAdapter.ReportColumns.COLUMN_USER_ID, this.f1344a.o());
            bundle2.putBundle("settings", JsonUtils.toBundle(JsonUtils.getJSONObject(jSONObject2, "safedk_settings")));
            this.f1344a.L();
            if (y.a()) {
                this.f1344a.L().b("CommunicatorService", "Sending \"safedk_init\" message: " + bundle);
            }
            a(bundle2, "safedk_init");
        }
    }

    public void a(com.applovin.impl.mediation.a.a aVar, String str) {
        if (((Boolean) this.f1344a.a(com.applovin.impl.sdk.c.b.gf)).booleanValue() && this.b.hasSubscriber("max_ad_events")) {
            Bundle bundleB = b(aVar);
            bundleB.putString(TapjoyAuctionFlags.AUCTION_TYPE, str);
            this.f1344a.L();
            if (y.a()) {
                this.f1344a.L().b("CommunicatorService", "Sending \"max_ad_events\" message: " + bundleB);
            }
            a(bundleB, "max_ad_events");
        }
    }

    public void a(com.applovin.impl.mediation.a.a aVar) {
        if (((Boolean) this.f1344a.a(com.applovin.impl.sdk.c.b.gf)).booleanValue() && this.b.hasSubscriber("max_revenue_events")) {
            Bundle bundleB = b(aVar);
            bundleB.putAll(JsonUtils.toBundle(aVar.e()));
            bundleB.putString(TapjoyConstants.TJC_DEVICE_COUNTRY_CODE, this.f1344a.ax().getCountryCode());
            BundleUtils.putStringIfValid("user_segment", this.f1344a.D().getName(), bundleB);
            a(bundleB, "max_revenue_events");
        }
    }

    public void b(com.applovin.impl.mediation.a.a aVar, String str) {
        if (((Boolean) this.f1344a.a(com.applovin.impl.sdk.c.b.gf)).booleanValue() && this.b.hasSubscriber("ad_callback_blocked_after_hidden")) {
            Bundle bundleB = b(aVar);
            bundleB.putString("callback_name", str);
            a(bundleB, "ad_callback_blocked_after_hidden");
        }
    }

    public void a(MaxAdapter.InitializationStatus initializationStatus, String str) {
        if (((Boolean) this.f1344a.a(com.applovin.impl.sdk.c.b.gf)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString("adapter_class", str);
            bundle.putInt("init_status", initializationStatus.getCode());
            a(bundle, "adapter_initialization_status");
        }
    }

    public void a() {
        if (((Boolean) this.f1344a.a(com.applovin.impl.sdk.c.b.gf)).booleanValue()) {
            a(new Bundle(), "privacy_setting_updated");
        }
    }

    public void a(String str, String str2) {
        if (((Boolean) this.f1344a.a(com.applovin.impl.sdk.c.b.gf)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString("adapter_class", str2);
            bundle.putString("sdk_version", str);
            a(bundle, "network_sdk_version_updated");
        }
    }

    public void a(String str) {
        if (((Boolean) this.f1344a.a(com.applovin.impl.sdk.c.b.gf)).booleanValue()) {
            if (TextUtils.isEmpty(str)) {
                a(Bundle.EMPTY, "live_network_updated");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("live_network", str);
            a(bundle, "live_network_updated");
        }
    }

    public void b(String str) {
        if (((Boolean) this.f1344a.a(com.applovin.impl.sdk.c.b.gf)).booleanValue()) {
            if (TextUtils.isEmpty(str)) {
                a(Bundle.EMPTY, "test_mode_network_updated");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("test_mode_network", str);
            a(bundle, "test_mode_network_updated");
        }
    }

    public void a(String str, String str2, String str3) {
        if (((Boolean) this.f1344a.a(com.applovin.impl.sdk.c.b.gf)).booleanValue()) {
            String strMaybeConvertToIndentedString = JsonUtils.maybeConvertToIndentedString(str3, 2);
            String strMaybeConvertToIndentedString2 = JsonUtils.maybeConvertToIndentedString(str, 2);
            Bundle bundle = new Bundle();
            bundle.putString("request_url", str2);
            bundle.putString("request_body", strMaybeConvertToIndentedString);
            bundle.putString("response", strMaybeConvertToIndentedString2);
            a(bundle, "responses");
        }
    }

    public void a(String str, String str2, int i, Object obj, String str3, boolean z) {
        if (((Boolean) this.f1344a.a(com.applovin.impl.sdk.c.b.gf)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString("id", str);
            bundle.putString("url", str2);
            bundle.putInt("code", i);
            bundle.putBundle("body", JsonUtils.toBundle(obj));
            bundle.putBoolean(FirebaseAnalytics.Param.SUCCESS, z);
            BundleUtils.putString("error_message", str3, bundle);
            a(bundle, "receive_http_response");
        }
    }

    public void a(Bundle bundle, String str) {
        if (((Boolean) this.f1344a.a(com.applovin.impl.sdk.c.b.gf)).booleanValue() && !this.f1344a.e()) {
            this.b.getMessagingService().publish(CommunicatorMessageImpl.create(bundle, str, this));
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        long jLongValue;
        long jLongValue2;
        Map<String, Object> map;
        long j;
        int i;
        Map<String, Object> mapH;
        Map<String, Object> mapD;
        Map<String, Object> mapA;
        if (((Boolean) this.f1344a.a(com.applovin.impl.sdk.c.b.gf)).booleanValue()) {
            if ("send_http_request".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                Bundle messageData = appLovinCommunicatorMessage.getMessageData();
                Map<String, String> stringMap = BundleUtils.toStringMap(messageData.getBundle("query_params"));
                Map<String, Object> map2 = BundleUtils.toMap(messageData.getBundle("post_body"));
                Map<String, String> stringMap2 = BundleUtils.toStringMap(messageData.getBundle("headers"));
                String string = messageData.getString("id", "");
                if (!map2.containsKey(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY)) {
                    map2.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f1344a.B());
                }
                this.f1344a.al().a(new j.a().c(messageData.getString("url")).d(messageData.getString("backup_url")).a(stringMap).c(map2).b(stringMap2).a(((Boolean) this.f1344a.a(com.applovin.impl.sdk.c.b.fb)).booleanValue()).a(string).a());
                return;
            }
            if ("send_http_request_v2".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                Bundle messageData2 = appLovinCommunicatorMessage.getMessageData();
                String string2 = messageData2.getString("http_method", "POST");
                if (messageData2.containsKey("timeout_sec")) {
                    jLongValue = TimeUnit.SECONDS.toMillis(messageData2.getLong("timeout_sec"));
                } else {
                    jLongValue = ((Long) this.f1344a.a(com.applovin.impl.sdk.c.b.dx)).longValue();
                }
                int i2 = messageData2.getInt("retry_count", ((Integer) this.f1344a.a(com.applovin.impl.sdk.c.b.dy)).intValue());
                if (messageData2.containsKey("retry_delay_sec")) {
                    jLongValue2 = TimeUnit.SECONDS.toMillis(messageData2.getLong("retry_delay_sec"));
                } else {
                    jLongValue2 = ((Long) this.f1344a.a(com.applovin.impl.sdk.c.b.dz)).longValue();
                }
                Map<String, String> stringMap3 = BundleUtils.toStringMap(messageData2.getBundle("query_params"));
                long j2 = jLongValue2;
                if ("GET".equalsIgnoreCase(string2)) {
                    if (messageData2.getBoolean("include_data_collector_info", true)) {
                        if (this.f1344a.S() != null) {
                            mapA = this.f1344a.S().a(null, false, false);
                        } else {
                            mapA = this.f1344a.R().a(null, false, false);
                        }
                        stringMap3.putAll(BundleUtils.toStringMap(CollectionUtils.toBundle(mapA)));
                    }
                    j = jLongValue;
                    i = i2;
                    map = null;
                } else {
                    map = BundleUtils.toMap(messageData2.getBundle("post_body"));
                    if (messageData2.getBoolean("include_data_collector_info", true)) {
                        if (this.f1344a.S() != null) {
                            mapH = this.f1344a.S().d();
                            mapD = this.f1344a.S().b();
                        } else {
                            mapH = this.f1344a.R().h();
                            mapD = this.f1344a.R().d();
                        }
                        if (mapD.containsKey("idfv") && mapD.containsKey("idfv_scope")) {
                            i = i2;
                            String str = (String) mapD.get("idfv");
                            j = jLongValue;
                            Integer num = (Integer) mapD.get("idfv_scope");
                            num.intValue();
                            mapD.remove("idfv");
                            mapD.remove("idfv_scope");
                            mapH.put("idfv", str);
                            mapH.put("idfv_scope", num);
                        } else {
                            j = jLongValue;
                            i = i2;
                        }
                        mapH.put("server_installed_at", this.f1344a.a(com.applovin.impl.sdk.c.b.al));
                        mapH.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f1344a.B());
                        map.put(TapjoyConstants.TJC_APP_PLACEMENT, mapH);
                        map.put("device", mapD);
                    } else {
                        j = jLongValue;
                        i = i2;
                    }
                }
                this.f1344a.M().a(new com.applovin.impl.sdk.network.a(appLovinCommunicatorMessage.getPublisherId(), com.applovin.impl.sdk.network.c.a(this.f1344a).a(messageData2.getString("url")).c(messageData2.getString("backup_url")).a(stringMap3).b(string2).b(BundleUtils.toStringMap(messageData2.getBundle("headers"))).a(map != null ? new JSONObject(map) : null).b((int) j).a(i).c((int) j2).a(new JSONObject()).c(messageData2.getBoolean("is_encoding_enabled", false)).a(), this.f1344a), o.a.MAIN);
                return;
            }
            if ("set_ad_request_query_params".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                this.f1344a.E().addCustomQueryParams(Utils.stringifyObjectMap(BundleUtils.toMap(appLovinCommunicatorMessage.getMessageData())));
            } else if ("set_ad_request_post_body".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                this.f1344a.E().setCustomPostBody(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
            } else if ("set_mediate_request_post_body_data".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                this.f1344a.ap().setCustomPostBodyData(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
            }
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "applovin_sdk";
    }

    public boolean c(String str) {
        return com.applovin.impl.communicator.c.f927a.contains(str);
    }

    private Bundle b(com.applovin.impl.mediation.a.a aVar) {
        String str;
        Bundle bundle = new Bundle();
        bundle.putString("id", aVar.h());
        bundle.putString("network_name", aVar.Y());
        bundle.putString("max_ad_unit_id", aVar.getAdUnitId());
        bundle.putString("third_party_ad_placement_id", aVar.s());
        bundle.putString(FirebaseAnalytics.Param.AD_FORMAT, aVar.getFormat().getLabel());
        if (StringUtils.isValidString(aVar.getCreativeId())) {
            bundle.putString("creative_id", aVar.getCreativeId());
        }
        if (StringUtils.isValidString(aVar.getDspName())) {
            bundle.putString("dsp_name", aVar.getDspName());
        }
        if (aVar.p() != null && StringUtils.isValidString(aVar.p().getLabel())) {
            bundle.putString("hybrid_ad_format", aVar.p().getLabel());
        }
        if (aVar.o()) {
            bundle.putString("custom_js_network_name", aVar.getNetworkName());
        } else if ("CUSTOM_NETWORK_SDK".equalsIgnoreCase(aVar.Y())) {
            bundle.putString("custom_sdk_network_name", aVar.getNetworkName());
        }
        bundle.putAll(JsonUtils.toBundle(aVar.c()));
        if (aVar instanceof com.applovin.impl.mediation.a.b) {
            View viewR = ((com.applovin.impl.mediation.a.b) aVar).r();
            if (viewR != null) {
                str = viewR.getClass().getName() + '@' + Integer.toHexString(viewR.hashCode());
            } else {
                str = "N/A";
            }
            bundle.putString("ad_view", str);
        }
        return bundle;
    }
}
