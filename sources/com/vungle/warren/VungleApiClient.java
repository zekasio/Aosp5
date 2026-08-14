package com.vungle.warren;

import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.provider.Settings;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;
import android.webkit.URLUtil;
import androidx.core.content.PermissionChecker;
import androidx.core.util.Consumer;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.PrivacyManager;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.model.AdvertisementDBAdapter;
import com.vungle.warren.model.AdvertisingInfo;
import com.vungle.warren.model.CacheBust;
import com.vungle.warren.model.CacheBustDBAdapter;
import com.vungle.warren.model.Cookie;
import com.vungle.warren.model.JsonUtil;
import com.vungle.warren.model.SessionData;
import com.vungle.warren.model.VisionDataDBAdapter;
import com.vungle.warren.network.APIFactory;
import com.vungle.warren.network.Call;
import com.vungle.warren.network.VungleApi;
import com.vungle.warren.omsdk.OMInjector;
import com.vungle.warren.persistence.CacheManager;
import com.vungle.warren.persistence.DatabaseHelper;
import com.vungle.warren.persistence.Repository;
import com.vungle.warren.session.SessionAttribute;
import com.vungle.warren.session.SessionEvent;
import com.vungle.warren.utility.TimeoutProvider;
import com.vungle.warren.utility.platform.Platform;
import cz.msebera.android.httpclient.HttpHeaders;
import java.io.File;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSink;
import okio.GzipSink;
import okio.Okio;

/* JADX INFO: loaded from: classes3.dex */
public class VungleApiClient {
    private static final String AMAZON_ADVERTISING_ID = "amazon_advertising_id";
    public static final String ANDROID_ID = "android_id";
    private static String BASE_URL = null;
    public static final String GAID = "gaid";
    private static final String ID = "id";
    public static final String IFA = "ifa";
    private static final String TAG = "com.vungle.warren.VungleApiClient";
    protected static WrapperFramework WRAPPER_FRAMEWORK_SELECTED;
    private static String headerUa;
    private static Set<Interceptor> logInterceptors;
    private static Set<Interceptor> networkInterceptors;
    private VungleApi api;
    private JsonObject appBody;
    private JsonObject baseDeviceInfo;
    private String biLoggingEndpoint;
    private String cacheBustEndpoint;
    private CacheManager cacheManager;
    private OkHttpClient client;
    private Context context;
    private boolean enableOm;
    private VungleApi gzipApi;
    private Boolean isGooglePlayServicesAvailable;
    private String logEndpoint;
    private String newEndpoint;
    private final OMInjector omInjector;
    private final Platform platform;
    private String reportAdEndpoint;
    private Repository repository;
    private String requestAdEndpoint;
    private String riEndpoint;
    private VungleApi timeoutApi;
    private TimeoutProvider timeoutProvider;
    private boolean willPlayAdEnabled;
    private String willPlayAdEndpoint;
    private int willPlayAdTimeout;
    private Map<String, Long> retryAfterDataMap = new ConcurrentHashMap();
    private String uaString = System.getProperty("http.agent");

    /* JADX INFO: loaded from: classes.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ConnectionTypeDetail {
        public static final String CDMA_1XRTT = "cdma_1xrtt";
        public static final String CDMA_EVDO_0 = "cdma_evdo_0";
        public static final String CDMA_EVDO_A = "cdma_evdo_a";
        public static final String CDMA_EVDO_B = "cdma_evdo_b";
        public static final String EDGE = "edge";
        public static final String GPRS = "gprs";
        public static final String HRPD = "hrpd";
        public static final String HSDPA = "hsdpa";
        public static final String HSUPA = "hsupa";
        public static final String LTE = "LTE";
        public static final String UNKNOWN = "unknown";
        public static final String WCDMA = "wcdma";
    }

    public enum WrapperFramework {
        admob,
        air,
        cocos2dx,
        corona,
        dfp,
        heyzap,
        marmalade,
        mopub,
        unity,
        fyber,
        ironsource,
        upsight,
        appodeal,
        aerserv,
        adtoapp,
        tapdaq,
        vunglehbs,
        max,
        none
    }

    static {
        headerUa = (Platform.MANUFACTURER_AMAZON.equals(Build.MANUFACTURER) ? "VungleAmazon/" : "VungleDroid/").concat(BuildConfig.VERSION_NAME);
        BASE_URL = "https://ads.api.vungle.com/";
        networkInterceptors = new HashSet();
        logInterceptors = new HashSet();
    }

    VungleApiClient(Context context, CacheManager cacheManager, Repository repository, OMInjector oMInjector, Platform platform) {
        this.cacheManager = cacheManager;
        this.context = context.getApplicationContext();
        this.repository = repository;
        this.omInjector = oMInjector;
        this.platform = platform;
        OkHttpClient.Builder builderAddInterceptor = new OkHttpClient.Builder().addInterceptor(new Interceptor() { // from class: com.vungle.warren.VungleApiClient.1
            @Override // okhttp3.Interceptor
            public Response intercept(Interceptor.Chain chain) throws IOException {
                int iCode;
                Request request = chain.request();
                String strEncodedPath = request.url().encodedPath();
                Long l = (Long) VungleApiClient.this.retryAfterDataMap.get(strEncodedPath);
                if (l != null) {
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(l.longValue() - System.currentTimeMillis());
                    if (seconds <= 0) {
                        VungleApiClient.this.retryAfterDataMap.remove(strEncodedPath);
                    } else {
                        return new Response.Builder().request(request).addHeader(HttpHeaders.RETRY_AFTER, String.valueOf(seconds)).code(500).protocol(Protocol.HTTP_1_1).message("Server is busy").body(ResponseBody.create(MediaType.parse("application/json; charset=utf-8"), "{\"Error\":\"Retry-After\"}")).build();
                    }
                }
                Response responseProceed = chain.proceed(request);
                if (responseProceed != null && ((iCode = responseProceed.code()) == 429 || iCode == 500 || iCode == 502 || iCode == 503)) {
                    String str = responseProceed.headers().get(HttpHeaders.RETRY_AFTER);
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            long j = Long.parseLong(str);
                            if (j > 0) {
                                VungleApiClient.this.retryAfterDataMap.put(strEncodedPath, Long.valueOf((j * 1000) + System.currentTimeMillis()));
                            }
                        } catch (NumberFormatException unused) {
                            Log.d(VungleApiClient.TAG, "Retry-After value is not an valid value");
                        }
                    }
                }
                return responseProceed;
            }
        });
        this.client = builderAddInterceptor.build();
        OkHttpClient okHttpClientBuild = builderAddInterceptor.addInterceptor(new GzipRequestInterceptor()).build();
        this.api = new APIFactory(this.client, BASE_URL).createAPI(Vungle._instance.appID);
        this.gzipApi = new APIFactory(okHttpClientBuild, BASE_URL).createAPI(Vungle._instance.appID);
        this.timeoutProvider = (TimeoutProvider) ServiceLocator.getInstance(context).getService(TimeoutProvider.class);
    }

    public static String getHeaderUa() {
        return headerUa;
    }

    public static void setHeaderUa(String str) {
        headerUa = str;
    }

    public void init() {
        init(this.context);
    }

    static class GzipRequestInterceptor implements Interceptor {
        private static final String CONTENT_ENCODING = "Content-Encoding";
        private static final String GZIP = "gzip";

        GzipRequestInterceptor() {
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) throws IOException {
            Request request = chain.request();
            if (request.body() == null || request.header("Content-Encoding") != null) {
                return chain.proceed(request);
            }
            return chain.proceed(request.newBuilder().header("Content-Encoding", "gzip").method(request.method(), gzip(request.body())).build());
        }

        private RequestBody gzip(final RequestBody requestBody) throws IOException {
            final Buffer buffer = new Buffer();
            BufferedSink bufferedSinkBuffer = Okio.buffer(new GzipSink(buffer));
            requestBody.writeTo(bufferedSinkBuffer);
            bufferedSinkBuffer.close();
            return new RequestBody() { // from class: com.vungle.warren.VungleApiClient.GzipRequestInterceptor.1
                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return requestBody.contentType();
                }

                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return buffer.size();
                }

                @Override // okhttp3.RequestBody
                public void writeTo(BufferedSink bufferedSink) throws IOException {
                    bufferedSink.write(buffer.snapshot());
                }
            };
        }
    }

    synchronized void init(Context context) {
        String str;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(TJAdUnitConstants.String.BUNDLE, context.getPackageName());
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = null;
        }
        if (str == null) {
            str = "1.0";
        }
        jsonObject.addProperty("ver", str);
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("make", Build.MANUFACTURER);
        jsonObject2.addProperty("model", Build.MODEL);
        jsonObject2.addProperty("osv", Build.VERSION.RELEASE);
        jsonObject2.addProperty("carrier", ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName());
        jsonObject2.addProperty("os", Platform.MANUFACTURER_AMAZON.equals(Build.MANUFACTURER) ? "amazon" : TapjoyConstants.TJC_DEVICE_PLATFORM_TYPE);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        jsonObject2.addProperty("w", Integer.valueOf(displayMetrics.widthPixels));
        jsonObject2.addProperty("h", Integer.valueOf(displayMetrics.heightPixels));
        try {
            String userAgent = this.platform.getUserAgent();
            this.uaString = userAgent;
            jsonObject2.addProperty("ua", userAgent);
            initUserAgentLazy();
        } catch (Exception e) {
            Log.e(TAG, "Cannot Get UserAgent. Setting Default Device UserAgent." + e.getLocalizedMessage());
        }
        this.baseDeviceInfo = jsonObject2;
        this.appBody = jsonObject;
        this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromAPI();
    }

    void setAppId(String str) {
        setAppId(str, this.appBody);
    }

    private void setAppId(String str, JsonObject jsonObject) {
        jsonObject.addProperty("id", str);
    }

    private void initUserAgentLazy() {
        this.platform.getUserAgentLazy(new Consumer<String>() { // from class: com.vungle.warren.VungleApiClient.2
            @Override // androidx.core.util.Consumer
            public void accept(String str) {
                if (str == null) {
                    Log.e(VungleApiClient.TAG, "Cannot Get UserAgent. Setting Default Device UserAgent");
                } else {
                    VungleApiClient.this.uaString = str;
                }
            }
        });
    }

    public com.vungle.warren.network.Response config() throws IOException, VungleException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("device", getDeviceBody(true));
        jsonObject.add(TapjoyConstants.TJC_APP_PLACEMENT, this.appBody);
        jsonObject.add("user", getUserBody());
        JsonObject extBody = getExtBody();
        if (extBody != null) {
            jsonObject.add("ext", extBody);
        }
        com.vungle.warren.network.Response<JsonObject> responseExecute = this.api.config(getHeaderUa(), jsonObject).execute();
        if (!responseExecute.isSuccessful()) {
            return responseExecute;
        }
        JsonObject jsonObjectBody = responseExecute.body();
        String str = TAG;
        Log.d(str, "Config Response: " + jsonObjectBody);
        if (JsonUtil.hasNonNull(jsonObjectBody, "sleep")) {
            Log.e(str, "Error Initializing Vungle. Please try again. " + (JsonUtil.hasNonNull(jsonObjectBody, TJAdUnitConstants.String.VIDEO_INFO) ? jsonObjectBody.get(TJAdUnitConstants.String.VIDEO_INFO).getAsString() : ""));
            throw new VungleException(3);
        }
        if (!JsonUtil.hasNonNull(jsonObjectBody, "endpoints")) {
            Log.e(str, "Error Initializing Vungle. Please try again. ");
            throw new VungleException(3);
        }
        JsonObject asJsonObject = jsonObjectBody.getAsJsonObject("endpoints");
        HttpUrl httpUrl = HttpUrl.parse(asJsonObject.get("new").getAsString());
        HttpUrl httpUrl2 = HttpUrl.parse(asJsonObject.get("ads").getAsString());
        HttpUrl httpUrl3 = HttpUrl.parse(asJsonObject.get("will_play_ad").getAsString());
        HttpUrl httpUrl4 = HttpUrl.parse(asJsonObject.get("report_ad").getAsString());
        HttpUrl httpUrl5 = HttpUrl.parse(asJsonObject.get("ri").getAsString());
        HttpUrl httpUrl6 = HttpUrl.parse(asJsonObject.get("log").getAsString());
        HttpUrl httpUrl7 = HttpUrl.parse(asJsonObject.get(CacheBustDBAdapter.CacheBustColumns.TABLE_NAME).getAsString());
        HttpUrl httpUrl8 = HttpUrl.parse(asJsonObject.get("sdk_bi").getAsString());
        if (httpUrl == null || httpUrl2 == null || httpUrl3 == null || httpUrl4 == null || httpUrl5 == null || httpUrl6 == null || httpUrl7 == null || httpUrl8 == null) {
            Log.e(str, "Error Initializing Vungle. Please try again. ");
            throw new VungleException(3);
        }
        this.newEndpoint = httpUrl.toString();
        this.requestAdEndpoint = httpUrl2.toString();
        this.willPlayAdEndpoint = httpUrl3.toString();
        this.reportAdEndpoint = httpUrl4.toString();
        this.riEndpoint = httpUrl5.toString();
        this.logEndpoint = httpUrl6.toString();
        this.cacheBustEndpoint = httpUrl7.toString();
        this.biLoggingEndpoint = httpUrl8.toString();
        JsonObject asJsonObject2 = jsonObjectBody.getAsJsonObject("will_play_ad");
        this.willPlayAdTimeout = asJsonObject2.get("request_timeout").getAsInt();
        this.willPlayAdEnabled = asJsonObject2.get("enabled").getAsBoolean();
        this.enableOm = JsonUtil.getAsBoolean(jsonObjectBody.getAsJsonObject("viewability"), "om", false);
        if (this.willPlayAdEnabled) {
            Log.v(str, "willPlayAd is enabled, generating a timeout client.");
            this.timeoutApi = new APIFactory(this.client.newBuilder().readTimeout(this.willPlayAdTimeout, TimeUnit.MILLISECONDS).build(), "https://api.vungle.com/").createAPI(Vungle._instance.appID);
        }
        if (getOmEnabled()) {
            this.omInjector.init();
        } else {
            SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.OM_SDK).addData(SessionAttribute.ENABLED, false).build());
        }
        return responseExecute;
    }

    public Call<JsonObject> reportNew() throws IllegalStateException {
        if (this.newEndpoint == null) {
            throw new IllegalStateException("API Client not configured yet! Must call /config first.");
        }
        HashMap map = new HashMap(2);
        JsonElement jsonElement = this.appBody.get("id");
        String asString = "";
        map.put("app_id", jsonElement != null ? jsonElement.getAsString() : "");
        JsonObject deviceBody = getDeviceBody();
        if (PrivacyManager.getInstance().shouldSendAdIds()) {
            JsonElement jsonElement2 = deviceBody.get(IFA);
            if (jsonElement2 != null) {
                asString = jsonElement2.getAsString();
            }
            map.put(IFA, asString);
        }
        return this.api.reportNew(getHeaderUa(), this.newEndpoint, map);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public Call<JsonObject> requestAd(String str, String str2, boolean z, JsonObject jsonObject) throws IllegalStateException {
        if (this.requestAdEndpoint == null) {
            throw new IllegalStateException("API Client not configured yet! Must call /config first.");
        }
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.add("device", getDeviceBody());
        jsonObject2.add(TapjoyConstants.TJC_APP_PLACEMENT, this.appBody);
        JsonObject userBody = getUserBody();
        if (jsonObject != null) {
            userBody.add("vision", jsonObject);
        }
        jsonObject2.add("user", userBody);
        JsonObject extBody = getExtBody();
        if (extBody != null) {
            jsonObject2.add("ext", extBody);
        }
        JsonObject jsonObject3 = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        jsonArray.add(str);
        jsonObject3.add("placements", jsonArray);
        jsonObject3.addProperty("header_bidding", Boolean.valueOf(z));
        if (!TextUtils.isEmpty(str2)) {
            jsonObject3.addProperty("ad_size", str2);
        }
        jsonObject2.add("request", jsonObject3);
        return this.gzipApi.ads(getHeaderUa(), this.requestAdEndpoint, jsonObject2);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    Call<JsonObject> willPlayAd(String str, boolean z, String str2) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("device", getDeviceBody());
        jsonObject.add(TapjoyConstants.TJC_APP_PLACEMENT, this.appBody);
        jsonObject.add("user", getUserBody());
        JsonObject jsonObject2 = new JsonObject();
        JsonObject jsonObject3 = new JsonObject();
        jsonObject3.addProperty("reference_id", str);
        jsonObject3.addProperty("is_auto_cached", Boolean.valueOf(z));
        jsonObject2.add("placement", jsonObject3);
        jsonObject2.addProperty(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_AD_TOKEN, str2);
        jsonObject.add("request", jsonObject2);
        return this.timeoutApi.willPlayAd(getHeaderUa(), this.willPlayAdEndpoint, jsonObject);
    }

    boolean canCallWillPlayAd() {
        return this.willPlayAdEnabled && !TextUtils.isEmpty(this.willPlayAdEndpoint);
    }

    public Call<JsonObject> reportAd(JsonObject jsonObject) {
        if (this.reportAdEndpoint == null) {
            throw new IllegalStateException("API Client not configured yet! Must call /config first.");
        }
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.add("device", getDeviceBody());
        jsonObject2.add(TapjoyConstants.TJC_APP_PLACEMENT, this.appBody);
        jsonObject2.add("request", jsonObject);
        jsonObject2.add("user", getUserBody());
        JsonObject extBody = getExtBody();
        if (extBody != null) {
            jsonObject2.add("ext", extBody);
        }
        return this.gzipApi.reportAd(getHeaderUa(), this.reportAdEndpoint, jsonObject2);
    }

    public Call<JsonObject> sendLog(JsonObject jsonObject) {
        if (this.logEndpoint == null) {
            throw new IllegalStateException("API Client not configured yet! Must call /config first.");
        }
        return this.gzipApi.sendLog(getHeaderUa(), this.logEndpoint, jsonObject);
    }

    public Call<JsonObject> ri(JsonObject jsonObject) {
        if (this.riEndpoint == null) {
            throw new IllegalStateException("API Client not configured yet! Must call /config first.");
        }
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.add("device", getDeviceBody());
        jsonObject2.add(TapjoyConstants.TJC_APP_PLACEMENT, this.appBody);
        jsonObject2.add("request", jsonObject);
        jsonObject2.add("user", getUserBody());
        JsonObject extBody = getExtBody();
        if (extBody != null) {
            jsonObject2.add("ext", extBody);
        }
        return this.api.ri(getHeaderUa(), this.riEndpoint, jsonObject2);
    }

    public boolean pingTPAT(String str) throws MalformedURLException, ClearTextTrafficException {
        boolean zIsCleartextTrafficPermitted;
        if (!TextUtils.isEmpty(str) && HttpUrl.parse(str) != null) {
            try {
                String host = new URL(str).getHost();
                if (Build.VERSION.SDK_INT >= 24) {
                    zIsCleartextTrafficPermitted = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(host);
                } else {
                    zIsCleartextTrafficPermitted = Build.VERSION.SDK_INT >= 23 ? NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() : true;
                }
                if (!zIsCleartextTrafficPermitted && URLUtil.isHttpUrl(str)) {
                    SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.TPAT).addData(SessionAttribute.SUCCESS, false).addData(SessionAttribute.REASON, "Clear Text Traffic is blocked").addData(SessionAttribute.URL, str).build());
                    throw new ClearTextTrafficException("Clear Text Traffic is blocked");
                }
                try {
                    com.vungle.warren.network.Response<Void> responseExecute = this.api.pingTPAT(this.uaString, str).execute();
                    if (responseExecute == null) {
                        SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.TPAT).addData(SessionAttribute.SUCCESS, false).addData(SessionAttribute.REASON, "Error on pinging TPAT").addData(SessionAttribute.URL, str).build());
                    } else if (!responseExecute.isSuccessful()) {
                        SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.TPAT).addData(SessionAttribute.SUCCESS, false).addData(SessionAttribute.REASON, responseExecute.code() + ": " + responseExecute.message()).addData(SessionAttribute.URL, str).build());
                    }
                    return true;
                } catch (IOException e) {
                    SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.TPAT).addData(SessionAttribute.SUCCESS, false).addData(SessionAttribute.REASON, e.getMessage()).addData(SessionAttribute.URL, str).build());
                    Log.d(TAG, "Error on pinging TPAT");
                    return false;
                }
            } catch (MalformedURLException unused) {
                SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.TPAT).addData(SessionAttribute.SUCCESS, false).addData(SessionAttribute.REASON, "Invalid URL").addData(SessionAttribute.URL, str).build());
                throw new MalformedURLException("Invalid URL : " + str);
            }
        }
        SessionTracker.getInstance().trackEvent(new SessionData.Builder().setEvent(SessionEvent.TPAT).addData(SessionAttribute.SUCCESS, false).addData(SessionAttribute.REASON, "Invalid URL").addData(SessionAttribute.URL, str).build());
        throw new MalformedURLException("Invalid URL : " + str);
    }

    public Call<JsonObject> cacheBust(long j) {
        if (this.cacheBustEndpoint == null) {
            throw new IllegalStateException("API Client not configured yet! Must call /config first.");
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("device", getDeviceBody());
        jsonObject.add(TapjoyConstants.TJC_APP_PLACEMENT, this.appBody);
        jsonObject.add("user", getUserBody());
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty(Cookie.LAST_CACHE_BUST, Long.valueOf(j));
        jsonObject.add("request", jsonObject2);
        return this.gzipApi.cacheBust(getHeaderUa(), this.cacheBustEndpoint, jsonObject);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public Call<JsonObject> sendAnalytics(Collection<CacheBust> collection) {
        if (this.biLoggingEndpoint == null) {
            throw new IllegalStateException("API Client not configured yet! Must call /config first.");
        }
        if (collection == null || collection.isEmpty()) {
            throw new IllegalArgumentException("Cannot send analytics when bust and session data is empty");
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("device", getDeviceBody());
        jsonObject.add(TapjoyConstants.TJC_APP_PLACEMENT, this.appBody);
        JsonObject jsonObject2 = new JsonObject();
        JsonArray jsonArray = new JsonArray(collection.size());
        for (CacheBust cacheBust : collection) {
            for (int i = 0; i < cacheBust.getEventIds().length; i++) {
                JsonObject jsonObject3 = new JsonObject();
                jsonObject3.addProperty("target", cacheBust.getIdType() == 1 ? "campaign" : VisionDataDBAdapter.VisionDataColumns.COLUMN_CREATIVE);
                jsonObject3.addProperty("id", cacheBust.getId());
                jsonObject3.addProperty("event_id", cacheBust.getEventIds()[i]);
                jsonArray.add(jsonObject3);
            }
        }
        if (jsonArray.size() > 0) {
            jsonObject2.add(CacheBustDBAdapter.CacheBustColumns.TABLE_NAME, jsonArray);
        }
        jsonObject.add("request", jsonObject2);
        return this.gzipApi.sendBiAnalytics(getHeaderUa(), this.biLoggingEndpoint, jsonObject);
    }

    public Call<JsonObject> sendSessionDataAnalytics(JsonArray jsonArray) {
        if (this.biLoggingEndpoint == null) {
            throw new IllegalStateException("API Client not configured yet! Must call /config first.");
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("device", getDeviceBody());
        jsonObject.add(TapjoyConstants.TJC_APP_PLACEMENT, this.appBody);
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.add("session_events", jsonArray);
        jsonObject.add("request", jsonObject2);
        return this.gzipApi.sendBiAnalytics(getHeaderUa(), this.biLoggingEndpoint, jsonObject);
    }

    private JsonObject getDeviceBody() throws IllegalStateException {
        return getDeviceBody(false);
    }

    private synchronized JsonObject getDeviceBody(boolean z) throws IllegalStateException {
        JsonObject jsonObjectDeepCopy;
        String str;
        boolean zHasSystemFeature;
        String str2;
        NetworkInfo activeNetworkInfo;
        jsonObjectDeepCopy = this.baseDeviceInfo.deepCopy();
        JsonObject jsonObject = new JsonObject();
        AdvertisingInfo advertisingInfo = this.platform.getAdvertisingInfo();
        boolean z2 = advertisingInfo.limitAdTracking;
        String str3 = advertisingInfo.advertisingId;
        if (PrivacyManager.getInstance().shouldSendAdIds()) {
            if (str3 != null) {
                jsonObject.addProperty(Platform.MANUFACTURER_AMAZON.equals(Build.MANUFACTURER) ? AMAZON_ADVERTISING_ID : GAID, str3);
                jsonObjectDeepCopy.addProperty(IFA, str3);
            } else {
                String androidId = this.platform.getAndroidId();
                jsonObjectDeepCopy.addProperty(IFA, !TextUtils.isEmpty(androidId) ? androidId : "");
                if (!TextUtils.isEmpty(androidId)) {
                    jsonObject.addProperty("android_id", androidId);
                }
            }
        }
        if (!PrivacyManager.getInstance().shouldSendAdIds() || z) {
            jsonObjectDeepCopy.remove(IFA);
            jsonObject.remove("android_id");
            jsonObject.remove(GAID);
            jsonObject.remove(AMAZON_ADVERTISING_ID);
        }
        boolean zCanRequestPackageInstalls = false;
        jsonObjectDeepCopy.addProperty("lmt", Integer.valueOf(z2 ? 1 : 0));
        jsonObject.addProperty("is_google_play_services_available", Boolean.valueOf(Boolean.TRUE.equals(isGooglePlayServicesAvailable())));
        String appSetId = this.platform.getAppSetId();
        if (!TextUtils.isEmpty(appSetId)) {
            jsonObject.addProperty(TapjoyConstants.TJC_APP_SET_ID, appSetId);
        }
        Context context = this.context;
        Intent intentRegisterReceiver = context != null ? context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")) : null;
        if (intentRegisterReceiver != null) {
            int intExtra = intentRegisterReceiver.getIntExtra("level", -1);
            int intExtra2 = intentRegisterReceiver.getIntExtra("scale", -1);
            if (intExtra > 0 && intExtra2 > 0) {
                jsonObject.addProperty("battery_level", Float.valueOf(intExtra / intExtra2));
            }
            int intExtra3 = intentRegisterReceiver.getIntExtra("status", -1);
            if (intExtra3 == -1) {
                str = "UNKNOWN";
            } else if (intExtra3 == 2 || intExtra3 == 5) {
                int intExtra4 = intentRegisterReceiver.getIntExtra("plugged", -1);
                if (intExtra4 == 1) {
                    str = "BATTERY_PLUGGED_AC";
                } else if (intExtra4 == 2) {
                    str = "BATTERY_PLUGGED_USB";
                } else if (intExtra4 == 4) {
                    str = "BATTERY_PLUGGED_WIRELESS";
                } else {
                    str = "BATTERY_PLUGGED_OTHERS";
                }
            } else {
                str = "NOT_CHARGING";
            }
        } else {
            str = "UNKNOWN";
        }
        jsonObject.addProperty("battery_state", str);
        PowerManager powerManager = (PowerManager) this.context.getSystemService("power");
        jsonObject.addProperty("battery_saver_enabled", Integer.valueOf((powerManager == null || !powerManager.isPowerSaveMode()) ? 0 : 1));
        if (PermissionChecker.checkCallingOrSelfPermission(this.context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            String str4 = "NONE";
            String connectionTypeDetail = "unknown";
            ConnectivityManager connectivityManager = (ConnectivityManager) this.context.getSystemService("connectivity");
            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                int type = activeNetworkInfo.getType();
                if (type == 0) {
                    str4 = "MOBILE";
                    connectionTypeDetail = getConnectionTypeDetail(activeNetworkInfo.getSubtype());
                } else {
                    str4 = (type == 1 || type == 6) ? "WIFI" : type != 7 ? type != 9 ? "UNKNOWN" : "ETHERNET" : "BLUETOOTH";
                }
            }
            jsonObject.addProperty(TapjoyConstants.TJC_CONNECTION_TYPE, str4);
            jsonObject.addProperty("connection_type_detail", connectionTypeDetail);
            if (Build.VERSION.SDK_INT >= 24) {
                if (connectivityManager.isActiveNetworkMetered()) {
                    int restrictBackgroundStatus = connectivityManager.getRestrictBackgroundStatus();
                    if (restrictBackgroundStatus == 1) {
                        str2 = "DISABLED";
                    } else if (restrictBackgroundStatus == 2) {
                        str2 = "WHITELISTED";
                    } else if (restrictBackgroundStatus == 3) {
                        str2 = "ENABLED";
                    } else {
                        str2 = "UNKNOWN";
                    }
                    jsonObject.addProperty("data_saver_status", str2);
                    jsonObject.addProperty("network_metered", (Number) 1);
                } else {
                    jsonObject.addProperty("data_saver_status", "NOT_APPLICABLE");
                    jsonObject.addProperty("network_metered", (Number) 0);
                }
            }
        }
        jsonObject.addProperty("locale", Locale.getDefault().toString());
        jsonObject.addProperty("language", Locale.getDefault().getLanguage());
        jsonObject.addProperty("time_zone", TimeZone.getDefault().getID());
        AudioManager audioManager = (AudioManager) this.context.getSystemService("audio");
        if (audioManager != null) {
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            int streamVolume = audioManager.getStreamVolume(3);
            jsonObject.addProperty("volume_level", Float.valueOf(streamVolume / streamMaxVolume));
            jsonObject.addProperty("sound_enabled", Integer.valueOf(streamVolume > 0 ? 1 : 0));
        }
        File cache = this.cacheManager.getCache();
        cache.getPath();
        if (cache.exists() && cache.isDirectory()) {
            jsonObject.addProperty("storage_bytes_available", Long.valueOf(this.cacheManager.getBytesAvailable()));
        }
        if (Platform.MANUFACTURER_AMAZON.equals(Build.MANUFACTURER)) {
            zHasSystemFeature = this.context.getApplicationContext().getPackageManager().hasSystemFeature("amazon.hardware.fire_tv");
        } else {
            zHasSystemFeature = Build.VERSION.SDK_INT < 23 ? this.context.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.tv") || !this.context.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.touchscreen") : ((UiModeManager) this.context.getSystemService("uimode")).getCurrentModeType() == 4;
        }
        jsonObject.addProperty("is_tv", Boolean.valueOf(zHasSystemFeature));
        jsonObject.addProperty("os_api_level", Integer.valueOf(Build.VERSION.SDK_INT));
        jsonObject.addProperty("app_target_sdk_version", Integer.valueOf(this.context.getApplicationInfo().targetSdkVersion));
        if (Build.VERSION.SDK_INT >= 24) {
            jsonObject.addProperty("app_min_sdk_version", Integer.valueOf(this.context.getApplicationInfo().minSdkVersion));
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                if (this.context.checkCallingOrSelfPermission("android.permission.REQUEST_INSTALL_PACKAGES") == 0) {
                    zCanRequestPackageInstalls = this.context.getApplicationContext().getPackageManager().canRequestPackageInstalls();
                }
            } else if (Settings.Secure.getInt(this.context.getContentResolver(), "install_non_market_apps") == 1) {
                zCanRequestPackageInstalls = true;
            }
        } catch (Settings.SettingNotFoundException e) {
            Log.e(TAG, "isInstallNonMarketAppsEnabled Settings not found", e);
        }
        jsonObject.addProperty("is_sideload_enabled", Boolean.valueOf(zCanRequestPackageInstalls));
        jsonObject.addProperty("sd_card_available", Integer.valueOf(Environment.getExternalStorageState().equals("mounted") ? 1 : 0));
        jsonObject.addProperty("os_name", Build.FINGERPRINT);
        jsonObject.addProperty("vduid", "");
        jsonObjectDeepCopy.addProperty("ua", this.uaString);
        JsonObject jsonObject2 = new JsonObject();
        JsonObject jsonObject3 = new JsonObject();
        jsonObject2.add("vungle", jsonObject3);
        jsonObjectDeepCopy.add("ext", jsonObject2);
        jsonObject3.add(Platform.MANUFACTURER_AMAZON.equals(Build.MANUFACTURER) ? "amazon" : TapjoyConstants.TJC_DEVICE_PLATFORM_TYPE, jsonObject);
        return jsonObjectDeepCopy;
    }

    private String getConnectionTypeDetail(int i) {
        switch (i) {
            case 1:
                return ConnectionTypeDetail.GPRS;
            case 2:
                return ConnectionTypeDetail.EDGE;
            case 3:
            case 10:
            case 11:
            default:
                return "unknown";
            case 4:
                return ConnectionTypeDetail.WCDMA;
            case 5:
                return ConnectionTypeDetail.CDMA_EVDO_0;
            case 6:
                return ConnectionTypeDetail.CDMA_EVDO_A;
            case 7:
                return ConnectionTypeDetail.CDMA_1XRTT;
            case 8:
                return ConnectionTypeDetail.HSDPA;
            case 9:
                return ConnectionTypeDetail.HSUPA;
            case 12:
                return ConnectionTypeDetail.CDMA_EVDO_B;
            case 13:
                return ConnectionTypeDetail.LTE;
            case 14:
                return ConnectionTypeDetail.HRPD;
        }
    }

    private JsonObject getUserBody() {
        String string;
        String string2;
        long jLongValue;
        String string3;
        String string4;
        JsonObject jsonObject = new JsonObject();
        Cookie cookie = (Cookie) this.repository.load(Cookie.CONSENT_COOKIE, Cookie.class).get(this.timeoutProvider.getTimeout(), TimeUnit.MILLISECONDS);
        if (cookie != null) {
            string = cookie.getString("consent_status");
            string2 = cookie.getString("consent_source");
            jLongValue = cookie.getLong("timestamp").longValue();
            string3 = cookie.getString("consent_message_version");
        } else {
            string = "unknown";
            string2 = "no_interaction";
            jLongValue = 0;
            string3 = "";
        }
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("consent_status", string);
        jsonObject2.addProperty("consent_source", string2);
        jsonObject2.addProperty("consent_timestamp", Long.valueOf(jLongValue));
        jsonObject2.addProperty("consent_message_version", TextUtils.isEmpty(string3) ? "" : string3);
        jsonObject.add("gdpr", jsonObject2);
        Cookie cookie2 = (Cookie) this.repository.load(Cookie.CCPA_COOKIE, Cookie.class).get();
        if (cookie2 != null) {
            string4 = cookie2.getString(Cookie.CCPA_CONSENT_STATUS);
        } else {
            string4 = "opted_in";
        }
        JsonObject jsonObject3 = new JsonObject();
        jsonObject3.addProperty("status", string4);
        jsonObject.add("ccpa", jsonObject3);
        if (PrivacyManager.getInstance().getCoppaStatus() != PrivacyManager.COPPA.COPPA_NOTSET) {
            JsonObject jsonObject4 = new JsonObject();
            jsonObject4.addProperty(Cookie.COPPA_STATUS_KEY, Boolean.valueOf(PrivacyManager.getInstance().getCoppaStatus().getValue()));
            jsonObject.add(Cookie.COPPA_KEY, jsonObject4);
        }
        return jsonObject;
    }

    public boolean getOmEnabled() {
        return this.enableOm;
    }

    private String getUserAgentFromCookie() {
        Cookie cookie = (Cookie) this.repository.load("userAgent", Cookie.class).get();
        if (cookie == null) {
            return System.getProperty("http.agent");
        }
        String string = cookie.getString("userAgent");
        return TextUtils.isEmpty(string) ? System.getProperty("http.agent") : string;
    }

    public long getRetryAfterHeaderValue(com.vungle.warren.network.Response response) {
        try {
            return Long.parseLong(response.headers().get(HttpHeaders.RETRY_AFTER)) * 1000;
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    public static class ClearTextTrafficException extends IOException {
        ClearTextTrafficException(String str) {
            super(str);
        }
    }

    void overrideApi(VungleApi vungleApi) {
        this.api = vungleApi;
    }

    public Boolean isGooglePlayServicesAvailable() {
        if (this.isGooglePlayServicesAvailable == null) {
            this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromCookie();
        }
        if (this.isGooglePlayServicesAvailable == null) {
            this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromAPI();
        }
        return this.isGooglePlayServicesAvailable;
    }

    Boolean getPlayServicesAvailabilityFromCookie() {
        Cookie cookie = (Cookie) this.repository.load(Cookie.IS_PLAY_SERVICE_AVAILABLE, Cookie.class).get(this.timeoutProvider.getTimeout(), TimeUnit.MILLISECONDS);
        if (cookie != null) {
            return cookie.getBoolean(Cookie.IS_PLAY_SERVICE_AVAILABLE);
        }
        return null;
    }

    Boolean getPlayServicesAvailabilityFromAPI() {
        Boolean boolValueOf = null;
        try {
            GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.getInstance();
            if (googleApiAvailabilityLight == null) {
                return null;
            }
            boolean z = googleApiAvailabilityLight.isGooglePlayServicesAvailable(this.context) == 0;
            boolValueOf = Boolean.valueOf(z);
            boolValueOf.getClass();
            addPlaySvcAvailabilityInCookie(z);
            return boolValueOf;
        } catch (Exception unused) {
            Log.w(TAG, "Unexpected exception from Play services lib.");
            return boolValueOf;
        } catch (NoClassDefFoundError unused2) {
            Log.w(TAG, "Play services Not available");
            Boolean bool = false;
            try {
                bool.getClass();
                addPlaySvcAvailabilityInCookie(false);
                return bool;
            } catch (DatabaseHelper.DBException unused3) {
                Log.w(TAG, "Failure to write GPS availability to DB");
                return bool;
            }
        }
    }

    void addPlaySvcAvailabilityInCookie(boolean z) throws DatabaseHelper.DBException {
        Cookie cookie = new Cookie(Cookie.IS_PLAY_SERVICE_AVAILABLE);
        cookie.putValue(Cookie.IS_PLAY_SERVICE_AVAILABLE, Boolean.valueOf(z));
        this.repository.save(cookie);
    }

    private JsonObject getExtBody() {
        String string;
        Cookie cookie = (Cookie) this.repository.load(Cookie.CONFIG_EXTENSION, Cookie.class).get(this.timeoutProvider.getTimeout(), TimeUnit.MILLISECONDS);
        if (cookie == null) {
            string = "";
        } else {
            string = cookie.getString(Cookie.CONFIG_EXTENSION);
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(Cookie.CONFIG_EXTENSION, string);
        return jsonObject;
    }
}
