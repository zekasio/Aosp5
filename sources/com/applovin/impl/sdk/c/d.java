package com.applovin.impl.sdk.c;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1266a;
    private final Class<T> b;
    public static final d<String> d = new d<>("com.applovin.sdk.impl.isFirstRun", String.class);
    public static final d<Boolean> e = new d<>("com.applovin.sdk.launched_before", Boolean.class);
    public static final d<String> f = new d<>("com.applovin.sdk.latest_installed_version", String.class);
    public static final d<Long> g = new d<>("com.applovin.sdk.install_date", Long.class);
    public static final d<String> h = new d<>("com.applovin.sdk.user_id", String.class);
    public static final d<String> i = new d<>("com.applovin.sdk.compass_id", String.class);
    public static final d<String> j = new d<>("com.applovin.sdk.compass_random_token", String.class);
    public static final d<String> k = new d<>("com.applovin.sdk.applovin_random_token", String.class);
    public static final d<String> l = new d<>("com.applovin.sdk.device_test_group", String.class);
    public static final d<String> m = new d<>("com.applovin.sdk.variables", String.class);
    public static final d<Boolean> n = new d<>("com.applovin.sdk.compliance.has_user_consent", Boolean.class);
    public static final d<Boolean> o = new d<>("com.applovin.sdk.compliance.is_age_restricted_user", Boolean.class);
    public static final d<Boolean> p = new d<>("com.applovin.sdk.compliance.is_do_not_sell", Boolean.class);
    public static final d<String> q = new d<>("IABTCF_TCString", String.class);
    public static final d<?> r = new d<>("IABTCF_gdprApplies", Object.class);
    public static final d<Boolean> s = new d<>("com.applovin.sdk.is_pending_unified_flow_generation", Boolean.class);
    public static final d<Boolean> t = new d<>("com.applovin.sdk.has_seen_but_not_accepted_privacy_policy", Boolean.class);
    public static final d<Boolean> u = new d<>("com.applovin.sdk.been_in_gdpr_region", Boolean.class);
    public static final d<Boolean> v = new d<>("com.applovin.sdk.gdpr_flow_advertising_partners_accepted", Boolean.class);
    public static final d<Boolean> w = new d<>("com.applovin.sdk.gdpr_flow_analytics_partners_accepted", Boolean.class);
    public static final d<Boolean> x = new d<>("com.applovin.sdk.gdpr_flow_privacy_policy_accepted", Boolean.class);
    public static final d<String> y = new d<>("com.applovin.sdk.stats", String.class);
    public static final d<HashSet> z = new d<>("com.applovin.sdk.task.stats", HashSet.class);
    public static final d<String> A = new d<>("com.applovin.sdk.network_response_code_mapping", String.class);
    public static final d<String> B = new d<>("com.applovin.sdk.event_tracking.super_properties", String.class);
    public static final d<HashSet> C = new d<>("com.applovin.sdk.ad.stats", HashSet.class);
    public static final d<Integer> D = new d<>("com.applovin.sdk.last_video_position", Integer.class);
    public static final d<Boolean> E = new d<>("com.applovin.sdk.should_resume_video", Boolean.class);
    public static final d<String> F = new d<>("com.applovin.sdk.mediation.signal_providers", String.class);
    public static final d<String> G = new d<>("com.applovin.sdk.mediation.auto_init_adapters", String.class);
    public static final d<String> H = new d<>("com.applovin.sdk.persisted_data", String.class);
    public static final d<String> I = new d<>("com.applovin.sdk.mediation_provider", String.class);
    public static final d<String> J = new d<>("com.applovin.sdk.mediation.test_mode_network", String.class);
    public static final d<Boolean> K = new d<>("com.applovin.sdk.mediation.test_mode_enabled", Boolean.class);
    public static final d<String> L = new d<>("com.applovin.sdk.user_agent", String.class);
    public static final d<String> M = new d<>("com.applovin.sdk.last_os_version_user_agent_collected_for", String.class);
    public static final d<String> N = new d<>("com.taboola.api.user_id", String.class);
    public static final d<Long> O = new d<>("com.taboola.api.user_id_creation_date", Long.class);

    public d(String str, Class<T> cls) {
        this.f1266a = str;
        this.b = cls;
    }

    public String a() {
        return this.f1266a;
    }

    public Class<T> b() {
        return this.b;
    }

    public String toString() {
        return "Key{name='" + this.f1266a + "', type=" + this.b + '}';
    }
}
