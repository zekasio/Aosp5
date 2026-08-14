package com.applovin.impl.sdk.c;

import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.Utils;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class a<T> extends b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b<String> f1262a = a("afi", "");
    public static final b<Long> b = a("afi_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(5)));
    public static final b<String> c = a("mediation_endpoint", "https://ms.applovin.com/");
    public static final b<String> d = a("mediation_backup_endpoint", "https://ms.applvn.com/");
    public static final b<Long> e = a("fetch_next_ad_retry_delay_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(2)));
    public static final b<Long> f = a("fetch_next_ad_timeout_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(5)));
    public static final b<Long> g = a("fetch_mediation_debugger_info_timeout_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(7)));
    public static final b<Boolean> h = a("auto_init_mediation_debugger", true);
    public static final b<String> i = a("postback_macros", "{\"{MCODE}\":\"mcode\",\"{BCODE}\":\"bcode\",\"{ICODE}\":\"icode\",\"{SCODE}\":\"scode\"}");
    public static final b<Long> j = a("max_signal_provider_latency_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(30)));
    public static final b<Long> k = a("default_adapter_timeout_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(10)));
    public static final b<Long> l = a("ad_refresh_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(30)));
    public static final b<Long> m = a("ad_load_failure_refresh_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(30)));
    public static final b<String> n = a("ad_load_failure_refresh_ignore_error_codes", "204");
    public static final b<Long> o = a("refresh_ad_on_app_resume_elapsed_threshold_ms", 0L);
    public static final b<Boolean> p = a("refresh_ad_view_timer_responds_to_background", true);
    public static final b<Boolean> q = a("refresh_ad_view_timer_responds_to_store_kit", true);
    public static final b<Boolean> r = a("refresh_ad_view_timer_responds_to_window_visibility_changed", false);
    public static final b<Boolean> s = a("avrsponse", false);
    public static final b<Boolean> t = a(AppLovinSdkExtraParameterKey.ALLOW_IMMEDIATE_AUTO_REFRESH_PAUSE, false);
    public static final b<Long> u = a("fullscreen_display_delay_ms", 600L);
    public static final b<Boolean> v = a("susaode", false);
    public static final b<Long> w = a("ahdm", 500L);
    public static final b<Long> x = a("ad_view_refresh_precache_request_viewability_undesired_flags", 246L);
    public static final b<Boolean> y = a("ad_view_refresh_precache_request_enabled", true);
    public static final b<Boolean> z = a("fullscreen_ads_block_publisher_load_if_another_showing", true);
    public static final b<Boolean> A = a("fabsina", false);
    public static final b<Boolean> B = a("fabsiaif", false);
    public static final b<Long> C = a("ad_expiration_ms", Long.valueOf(TimeUnit.HOURS.toMillis(4)));
    public static final b<Long> D = a("native_ad_expiration_ms", Long.valueOf(TimeUnit.HOURS.toMillis(4)));
    public static final b<Boolean> E = a("rena", true);
    public static final b<Long> F = a("fullscreen_ad_displayed_timeout_ms", -1L);
    public static final b<Long> G = a("ad_hidden_timeout_ms", -1L);
    public static final b<Boolean> H = a("schedule_ad_hidden_on_ad_dismiss", false);
    public static final b<Long> I = a("ad_hidden_on_ad_dismiss_callback_delay_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(1)));
    public static final b<Boolean> J = a("proe", false);
    public static final b<Integer> K = a("mute_state", 2);
    public static final b<String> L = a("saf", "");
    public static final b<String> M = a("saui", "");
    public static final b<Integer> N = a("mra", -1);
    public static final b<String> O = a("mra_af", "INTER,REWARDED,REWARDED_INTER,BANNER,LEADER,MREC");
    public static final b<Boolean> P = a("sai", false);
    public static final b<Boolean> Q = a("init_adapter_for_sc", true);
    public static final b<Boolean> R = a("init_adapter_for_al", true);
    public static final b<Boolean> S = a("fadiafase", true);
    public static final b<Boolean> T = a("fadwvcv", true);
    public static final b<Boolean> U = a("bfarud", false);
    public static final b<Boolean> V = a("inacc", Boolean.valueOf(Utils.isMemberOfPackageNameList(Arrays.asList("com.textmeinc.textme", "com.textmeinc.freetone", "com.textmeinc.textme3", "com.jaumo", "com.jaumo.casual", "com.pinkapp", "com.jaumo.mature", "com.jaumo.prime", "com.jaumo.gay", "com.jaumo.lesbian"))));
    public static final b<Boolean> W = a("suv2tpw_v2", false);
    public static final b<String> X = a("pbatasaf", "INTER,APPOPEN,REWARDED,REWARDED_INTER");
    public static final b<Boolean> Y = a("sclawhpaia", true);
    public static final b<Boolean> Z = a("schaimn", true);
    public static final b<Boolean> aa = a("fetch_mediated_ad_gzip", false);
    public static final b<Boolean> ab = a("max_postback_gzip", false);
}
