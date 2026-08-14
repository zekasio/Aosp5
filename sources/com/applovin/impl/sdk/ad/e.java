package com.applovin.impl.sdk.ad;

import android.graphics.Point;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Bundle;
import com.applovin.impl.adview.i;
import com.applovin.impl.adview.t;
import com.applovin.impl.adview.x;
import com.applovin.impl.sdk.af;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends AppLovinAdImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<Uri> f1229a;
    private final AtomicBoolean b;
    private final AtomicBoolean c;
    private final AtomicReference<com.applovin.impl.sdk.b.c> d;
    private List<com.applovin.impl.sdk.d.a> e;
    private List<com.applovin.impl.sdk.d.a> f;
    private List<com.applovin.impl.sdk.d.a> g;
    private List<com.applovin.impl.sdk.d.a> h;
    private c i;

    public enum a {
        UNSPECIFIED,
        DISMISS,
        DO_NOT_DISMISS
    }

    public enum b {
        DEFAULT,
        ACTIVITY_PORTRAIT,
        ACTIVITY_LANDSCAPE
    }

    public enum d {
        RESIZE_ASPECT,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT
    }

    public abstract void a();

    public abstract String d();

    @Override // com.applovin.impl.sdk.a.a
    public abstract boolean isOpenMeasurementEnabled();

    public abstract com.applovin.impl.sdk.a.b o();

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1232a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        private c() {
            p unused = e.this.sdk;
            this.f1232a = AppLovinSdkUtils.dpToPx(p.y(), e.this.Y());
            p unused2 = e.this.sdk;
            this.b = AppLovinSdkUtils.dpToPx(p.y(), e.this.Z());
            p unused3 = e.this.sdk;
            this.c = AppLovinSdkUtils.dpToPx(p.y(), e.this.aa());
            p unused4 = e.this.sdk;
            this.d = AppLovinSdkUtils.dpToPx(p.y(), ((Integer) e.this.sdk.a(com.applovin.impl.sdk.c.b.bV)).intValue());
            p unused5 = e.this.sdk;
            this.e = AppLovinSdkUtils.dpToPx(p.y(), ((Integer) e.this.sdk.a(com.applovin.impl.sdk.c.b.bU)).intValue());
        }
    }

    public e(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.ad.b bVar, p pVar) {
        super(jSONObject, jSONObject2, bVar, pVar);
        this.f1229a = CollectionUtils.synchronizedList();
        this.b = new AtomicBoolean();
        this.c = new AtomicBoolean();
        this.d = new AtomicReference<>();
    }

    public b p() {
        String upperCase = getStringFromAdObject("ad_target", b.DEFAULT.toString()).toUpperCase(Locale.ENGLISH);
        if ("ACTIVITY_PORTRAIT".equalsIgnoreCase(upperCase)) {
            return b.ACTIVITY_PORTRAIT;
        }
        if ("ACTIVITY_LANDSCAPE".equalsIgnoreCase(upperCase)) {
            return b.ACTIVITY_LANDSCAPE;
        }
        return b.DEFAULT;
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public boolean isDirectDownloadEnabled() {
        return StringUtils.isValidString(getDirectDownloadToken());
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public String getDirectDownloadToken() {
        return getStringFromAdObject("ah_dd_token", null);
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public Bundle getDirectDownloadParameters() {
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("ah_parameters", null);
        if (jsonObjectFromAdObject != null) {
            return JsonUtils.toBundle(jsonObjectFromAdObject);
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.a.a
    public String getOpenMeasurementContentUrl() {
        return getStringFromAdObject("omid_content_url", null);
    }

    @Override // com.applovin.impl.sdk.a.a
    public String getOpenMeasurementCustomReferenceData() {
        return getStringFromAdObject("omid_custom_ref_data", "");
    }

    @Override // com.applovin.impl.sdk.a.a
    public List<VerificationScriptResource> getOpenMeasurementVerificationScriptResources() {
        return Collections.emptyList();
    }

    public boolean q() {
        return getBooleanFromAdObject("iopmsdc", false);
    }

    public long r() {
        return getLongFromAdObject("close_delay", 0L);
    }

    public long s() {
        return TimeUnit.SECONDS.toMillis(getLongFromAdObject("close_delay_max_buffering_time_seconds", 5L));
    }

    public long t() {
        List<Integer> listU = u();
        long longFromAdObject = getLongFromAdObject("close_delay_graphic", (listU == null || listU.size() <= 0) ? 0L : listU.get(0).intValue());
        if (longFromAdObject == -1 || longFromAdObject == -2) {
            return 0L;
        }
        return longFromAdObject;
    }

    public List<Integer> u() {
        return getIntegerListFromAdObject("multi_close_delay_graphic", null);
    }

    public i.a v() {
        List<Integer> listB = b();
        int intFromAdObject = getIntFromAdObject("close_style", (listB == null || listB.size() <= 0) ? -1 : listB.get(0).intValue());
        return intFromAdObject == -1 ? b(hasVideoUrl()) : a(intFromAdObject);
    }

    public List<i.a> w() {
        List<Integer> listB = b();
        if (listB == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listB.size());
        Iterator<Integer> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(a(it.next().intValue()));
        }
        return arrayList;
    }

    private List<Integer> b() {
        return getIntegerListFromAdObject("multi_close_style", null);
    }

    public i.a x() {
        int intFromAdObject = getIntFromAdObject("skip_style", -1);
        return intFromAdObject == -1 ? v() : a(intFromAdObject);
    }

    public boolean y() {
        return getBooleanFromAdObject("dismiss_on_skip", false);
    }

    public boolean z() {
        return getBooleanFromAdObject("fire_postbacks_from_webview", false);
    }

    public boolean A() {
        return getBooleanFromAdObject("html_resources_cached", false);
    }

    public void a(boolean z) {
        try {
            synchronized (this.adObjectLock) {
                this.adObject.put("html_resources_cached", z);
            }
        } catch (Throwable unused) {
        }
    }

    public void b(Uri uri) {
        this.f1229a.add(uri);
    }

    public List<Uri> B() {
        return this.f1229a;
    }

    public String C() {
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("video_button_properties", null);
        return jsonObjectFromAdObject != null ? JsonUtils.getString(jsonObjectFromAdObject, "video_button_html", "") : "";
    }

    public t D() {
        return new t(getJsonObjectFromAdObject("video_button_properties", null), this.sdk);
    }

    public boolean E() {
        return getBooleanFromAdObject("video_clickable", false);
    }

    public boolean F() {
        return getBooleanFromAdObject("lock_current_orientation", false);
    }

    public a G() {
        String stringFromAdObject = getStringFromAdObject("poststitial_dismiss_type", null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            if ("dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return a.DISMISS;
            }
            if ("no_dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return a.DO_NOT_DISMISS;
            }
        }
        return a.UNSPECIFIED;
    }

    public List<String> H() {
        String stringFromAdObject = getStringFromAdObject("required_html_resources", null);
        return stringFromAdObject != null ? CollectionUtils.explode(stringFromAdObject) : Collections.emptyList();
    }

    public List<String> I() {
        String stringFromAdObject = getStringFromAdObject("resource_cache_prefix", null);
        if (stringFromAdObject != null) {
            return CollectionUtils.explode(stringFromAdObject);
        }
        return this.sdk.b(com.applovin.impl.sdk.c.b.bD);
    }

    public boolean J() {
        return getBooleanFromAdObject("sruifwvc", false);
    }

    public boolean K() {
        return getBooleanFromAdObject("require_interaction_for_click", false);
    }

    public String L() {
        return getStringFromAdObject("cache_prefix", null);
    }

    public boolean M() {
        return getBooleanFromAdObject("sscomt", false);
    }

    public String N() {
        return getStringFromFullResponse("event_id", null);
    }

    public boolean O() {
        return getBooleanFromAdObject("progress_bar_enabled", false);
    }

    public int P() {
        return getColorFromAdObject("progress_bar_color", -922746881);
    }

    public int Q() {
        int videoCompletionPercent;
        synchronized (this.adObjectLock) {
            videoCompletionPercent = Utils.getVideoCompletionPercent(this.adObject);
        }
        return videoCompletionPercent;
    }

    public int R() {
        synchronized (this.adObjectLock) {
            int i = JsonUtils.getInt(this.adObject, "graphic_completion_percent", -1);
            if (i < 0 || i > 100) {
                return 90;
            }
            return i;
        }
    }

    public int S() {
        return getIntFromAdObject("poststitial_shown_forward_delay_millis", -1);
    }

    public int T() {
        return getIntFromAdObject("poststitial_dismiss_forward_delay_millis", -1);
    }

    public boolean U() {
        return getBooleanFromAdObject("should_apply_mute_setting_to_poststitial", false);
    }

    public boolean V() {
        return getBooleanFromAdObject("should_forward_close_button_tapped_to_poststitial", false);
    }

    public boolean W() {
        return getBooleanFromAdObject("forward_lifecycle_events_to_webview", false);
    }

    public c X() {
        if (this.i == null) {
            this.i = new c();
        }
        return this.i;
    }

    public int Y() {
        return getIntFromAdObject("close_button_size", ((Integer) this.sdk.a(com.applovin.impl.sdk.c.b.cy)).intValue());
    }

    public int Z() {
        return getIntFromAdObject("close_button_top_margin", ((Integer) this.sdk.a(com.applovin.impl.sdk.c.b.f1264cz)).intValue());
    }

    public int aa() {
        return getIntFromAdObject("close_button_horizontal_margin", ((Integer) this.sdk.a(com.applovin.impl.sdk.c.b.cx)).intValue());
    }

    public boolean ab() {
        return getBooleanFromAdObject("lhs_close_button", (Boolean) this.sdk.a(com.applovin.impl.sdk.c.b.cw));
    }

    public boolean ac() {
        return getBooleanFromAdObject("lhs_skip_button", (Boolean) this.sdk.a(com.applovin.impl.sdk.c.b.cD));
    }

    public long ad() {
        long longFromAdObject = getLongFromAdObject("report_reward_duration", -1L);
        if (longFromAdObject >= 0) {
            return TimeUnit.SECONDS.toMillis(longFromAdObject);
        }
        return -1L;
    }

    public int ae() {
        return getIntFromAdObject("report_reward_percent", -1);
    }

    public boolean af() {
        return getBooleanFromAdObject("report_reward_percent_include_close_delay", true);
    }

    public AtomicBoolean ag() {
        return this.b;
    }

    public boolean ah() {
        return getBooleanFromAdObject("show_nia", false);
    }

    public String ai() {
        return getStringFromAdObject("nia_title", "");
    }

    public String aj() {
        return getStringFromAdObject("nia_message", "");
    }

    public String ak() {
        return getStringFromAdObject("nia_button_title", "");
    }

    public boolean al() {
        return getBooleanFromAdObject("avoms", false);
    }

    public boolean am() {
        return getBooleanFromAdObject("show_rewarded_interstitial_overlay_alert", Boolean.valueOf(AppLovinAdType.AUTO_INCENTIVIZED == getType()));
    }

    public String an() {
        return getStringFromAdObject("text_rewarded_inter_alert_title", "Watch a video to earn a reward!");
    }

    public String ao() {
        return getStringFromAdObject("text_rewarded_inter_alert_body", "");
    }

    public String ap() {
        return getStringFromAdObject("text_rewarded_inter_alert_ok_action", "OK!");
    }

    public List<com.applovin.impl.sdk.d.a> aq() {
        List<com.applovin.impl.sdk.d.a> postbacks;
        List<com.applovin.impl.sdk.d.a> list = this.e;
        if (list != null) {
            return list;
        }
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("video_end_urls", this.adObject, getClCode(), c(), this.sdk);
            this.e = postbacks;
        }
        return postbacks;
    }

    public List<com.applovin.impl.sdk.d.a> ar() {
        List<com.applovin.impl.sdk.d.a> postbacks;
        List<com.applovin.impl.sdk.d.a> list = this.f;
        if (list != null) {
            return list;
        }
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("ad_closed_urls", this.adObject, getClCode(), (String) null, this.sdk);
            this.f = postbacks;
        }
        return postbacks;
    }

    public List<com.applovin.impl.sdk.d.a> as() {
        List<com.applovin.impl.sdk.d.a> postbacks;
        List<com.applovin.impl.sdk.d.a> list = this.g;
        if (list != null) {
            return list;
        }
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("app_killed_urls", this.adObject, getClCode(), (String) null, this.sdk);
            this.g = postbacks;
        }
        return postbacks;
    }

    public List<com.applovin.impl.sdk.d.a> a(PointF pointF, boolean z, boolean z2) {
        List<com.applovin.impl.sdk.d.a> postbacks;
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("click_tracking_urls", this.adObject, c(pointF, z, z2), b(pointF, z, z2), au(), z(), this.sdk);
        }
        return postbacks;
    }

    public List<com.applovin.impl.sdk.d.a> a(PointF pointF, boolean z) {
        List<com.applovin.impl.sdk.d.a> postbacks;
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("video_click_tracking_urls", this.adObject, c(pointF, true, z), null, au(), z(), this.sdk);
        }
        return postbacks.isEmpty() ? a(pointF, true, z) : postbacks;
    }

    public List<com.applovin.impl.sdk.d.a> at() {
        List<com.applovin.impl.sdk.d.a> postbacks;
        List<com.applovin.impl.sdk.d.a> list = this.h;
        if (list != null) {
            return list;
        }
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("imp_urls", this.adObject, getClCode(), null, null, au(), z(), this.sdk);
            this.h = postbacks;
        }
        return postbacks;
    }

    private String c() {
        String stringFromAdObject = getStringFromAdObject("video_end_url", null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace(Utils.MACRO_CLCODE, getClCode());
        }
        return null;
    }

    private String b(PointF pointF, boolean z, boolean z2) {
        String stringFromAdObject = getStringFromAdObject("click_tracking_url", null);
        Map<String, String> mapC = c(pointF, z, z2);
        if (stringFromAdObject != null) {
            return StringUtils.replace(stringFromAdObject, mapC);
        }
        return null;
    }

    private Map<String, String> c(PointF pointF, boolean z, boolean z2) {
        p pVar = this.sdk;
        Point pointA = com.applovin.impl.sdk.utils.h.a(p.y());
        Map<String, String> map = CollectionUtils.map(7);
        map.put(Utils.MACRO_CLCODE, getClCode());
        map.put(Utils.MACRO_CLICK_X, String.valueOf(pointF.x));
        map.put(Utils.MACRO_CLICK_Y, String.valueOf(pointF.y));
        map.put(Utils.MACRO_SCREEN_WIDTH, String.valueOf(pointA.x));
        map.put(Utils.MACRO_SCREEN_HEIGHT, String.valueOf(pointA.y));
        map.put(Utils.MACRO_IS_VIDEO_CLICK, String.valueOf(z));
        map.put(Utils.MACRO_IS_INSTALL, String.valueOf(z2));
        return map;
    }

    public Map<String, String> au() {
        Map<String, String> map = CollectionUtils.map();
        try {
            map.putAll(JsonUtils.toStringMap(getJsonObjectFromAdObject("http_headers_for_postbacks", new JSONObject())));
        } catch (JSONException e) {
            this.sdk.L();
            if (y.a()) {
                this.sdk.L().b("DirectAd", "Failed to retrieve http headers forx postbacks", e);
            }
        }
        if (getBooleanFromAdObject("use_webview_ua_for_postbacks", false)) {
            map.put("User-Agent", af.a());
        }
        return map;
    }

    public boolean av() {
        return getBooleanFromAdObject("playback_requires_user_action", true);
    }

    public String aw() {
        String stringFromAdObject = getStringFromAdObject("base_url", "/");
        if ("null".equalsIgnoreCase(stringFromAdObject)) {
            return null;
        }
        return stringFromAdObject;
    }

    public boolean ax() {
        return getBooleanFromAdObject("web_contents_debugging_enabled", false);
    }

    public x ay() {
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("web_view_settings", null);
        if (jsonObjectFromAdObject != null) {
            return new x(jsonObjectFromAdObject);
        }
        return null;
    }

    public int az() {
        int i;
        if (Utils.isBML(getSize())) {
            i = 1;
        } else {
            i = ((Boolean) this.sdk.a(com.applovin.impl.sdk.c.b.fy)).booleanValue() ? 0 : -1;
        }
        return getIntFromAdObject("whalt", i);
    }

    public List<String> aA() {
        return CollectionUtils.explode(getStringFromAdObject("wls", ""));
    }

    public List<String> aB() {
        return CollectionUtils.explode(getStringFromAdObject("wlh", null));
    }

    public Uri aC() {
        String stringFromAdObject = getStringFromAdObject("play_image", null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public void c(Uri uri) {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "play_image", uri.toString());
        }
    }

    public Uri aD() {
        String stringFromAdObject = getStringFromAdObject("pause_image", null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public void d(Uri uri) {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "pause_image", uri.toString());
        }
    }

    public Uri aE() {
        String stringFromAdObject = getStringFromAdObject("mute_image", null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public void e(Uri uri) {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "mute_image", uri.toString());
        }
    }

    public Uri aF() {
        String stringFromAdObject = getStringFromAdObject("unmute_image", "");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public void f(Uri uri) {
        synchronized (this.adObjectLock) {
            JsonUtils.putObject(this.adObject, "unmute_image", uri);
        }
    }

    public boolean aG() {
        return this.c.get();
    }

    public void aH() {
        this.c.set(true);
    }

    public void a(com.applovin.impl.sdk.b.c cVar) {
        this.d.set(cVar);
    }

    public com.applovin.impl.sdk.b.c aI() {
        return this.d.getAndSet(null);
    }

    public boolean aJ() {
        String str = this.sdk.C().getExtraParameters().get(AppLovinSdkExtraParameterKey.SHOULD_USE_EXOPLAYER);
        if (StringUtils.isValidString(str)) {
            return Boolean.parseBoolean(str);
        }
        return getBooleanFromAdObject("suep", false);
    }

    public boolean aK() {
        return getBooleanFromAdObject("rwvbv", false);
    }

    public boolean aL() {
        return getBooleanFromAdObject("upiosp", false);
    }

    public boolean aM() {
        return getBooleanFromAdObject("web_video", false);
    }

    public d aN() {
        String stringFromAdObject = getStringFromAdObject("video_gravity", null);
        if (TJAdUnitConstants.String.TOP.equals(stringFromAdObject)) {
            return d.TOP;
        }
        if (TJAdUnitConstants.String.BOTTOM.equals(stringFromAdObject)) {
            return d.BOTTOM;
        }
        if (TJAdUnitConstants.String.LEFT.equals(stringFromAdObject)) {
            return d.LEFT;
        }
        if (TJAdUnitConstants.String.RIGHT.equals(stringFromAdObject)) {
            return d.RIGHT;
        }
        return d.RESIZE_ASPECT;
    }

    public boolean f() {
        this.sdk.L();
        if (!y.a()) {
            return false;
        }
        this.sdk.L().e("DirectAd", "Attempting to invoke isVideoStream() from base ad class");
        return false;
    }

    public Uri h() {
        this.sdk.L();
        if (!y.a()) {
            return null;
        }
        this.sdk.L().e("DirectAd", "Attempting to invoke getVideoUri() from base ad class");
        return null;
    }

    public Uri j() {
        this.sdk.L();
        if (!y.a()) {
            return null;
        }
        this.sdk.L().e("DirectAd", "Attempting to invoke getClickDestinationUri() from base ad class");
        return null;
    }

    public Uri k() {
        this.sdk.L();
        if (!y.a()) {
            return null;
        }
        this.sdk.L().e("DirectAd", "Attempting to invoke getVideoClickDestinationUri() from base ad class");
        return null;
    }

    private i.a b(boolean z) {
        return z ? i.a.WHITE_ON_TRANSPARENT : i.a.WHITE_ON_BLACK;
    }

    protected i.a a(int i) {
        if (i == 1) {
            return i.a.WHITE_ON_TRANSPARENT;
        }
        if (i == 2) {
            return i.a.INVISIBLE;
        }
        if (i == 3) {
            return i.a.TRANSPARENT_SKIP;
        }
        return i.a.WHITE_ON_BLACK;
    }
}
