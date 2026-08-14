package com.applovin.impl.sdk.c;

import android.net.Uri;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.c.n;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import com.loopj.android.http.AsyncHttpClient;
import com.tapjoy.TapjoyConstants;
import cz.msebera.android.httpclient.protocol.HTTP;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class b<T> implements Comparable {
    private final String c;
    private final T d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<?> f1263a = Arrays.asList(Boolean.class, Float.class, Integer.class, Long.class, String.class);
    private static final Map<String, b<?>> b = CollectionUtils.map(512);
    public static final b<Boolean> ac = a("is_disabled", false);
    public static final b<String> ad = a("device_id", "");
    public static final b<Boolean> ae = a("rss", true);
    public static final b<String> af = a("device_token", "");
    public static final b<Long> ag = a("publisher_id", 0L);
    public static final b<Boolean> ah = a("is_verbose_logging", false);
    public static final b<String> ai = a("sc", "");
    public static final b<String> aj = a("sc2", "");
    public static final b<String> ak = a("sc3", "");
    public static final b<String> al = a("server_installed_at", "");
    public static final b<Boolean> am = a("track_network_response_codes", false);
    public static final b<Boolean> an = a("submit_network_response_codes", false);
    public static final b<Boolean> ao = a("clear_network_response_codes_on_request", true);
    public static final b<Boolean> ap = a("clear_completion_callback_on_failure", false);
    public static final b<Long> aq = a("sicd_ms", 0L);
    public static final b<Integer> ar = a("logcat_max_line_size", 1000);
    public static final b<Integer> as = a("stps", 16);
    public static final b<Boolean> at = a("ustp", false);
    public static final b<Boolean> au = a("exception_handler_enabled", true);
    public static final b<Integer> av = a("network_thread_count", 4);
    public static final b<Boolean> aw = a("uam", false);
    public static final b<Integer> ax = a("aei", -1);
    public static final b<Integer> ay = a("mei", -1);
    public static final b<Boolean> az = a("gwe", false);
    public static final b<Boolean> aA = a("ah_cvc", true);
    public static final b<Boolean> aB = a("ah_cdde", true);
    public static final b<Boolean> aC = a("ah_crut", true);
    public static final b<Boolean> aD = a("init_omsdk", true);
    public static final b<String> aE = a("omsdk_partner_name", "applovin");
    public static final b<Boolean> aF = a("publisher_can_show_consent_dialog", true);
    public static final b<String> aG = a("consent_dialog_url", "https://assets.applovin.com/gdpr/flow_v1/gdpr-flow-1.html");
    public static final b<Boolean> aH = a("consent_dialog_immersive_mode_on", false);
    public static final b<Long> aI = a("consent_dialog_show_from_alert_delay_ms", 450L);
    public static final b<Boolean> aJ = a("alert_consent_for_dialog_rejected", false);
    public static final b<Boolean> aK = a("alert_consent_for_dialog_closed", false);
    public static final b<Boolean> aL = a("alert_consent_for_dialog_closed_with_back_button", false);
    public static final b<Boolean> aM = a("alert_consent_after_init", false);
    public static final b<Long> aN = a("alert_consent_after_init_interval_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(5)));
    public static final b<Long> aO = a("alert_consent_after_dialog_rejection_interval_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(30)));
    public static final b<Long> aP = a("alert_consent_after_dialog_close_interval_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(5)));
    public static final b<Long> aQ = a("alert_consent_after_dialog_close_with_back_button_interval_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(5)));
    public static final b<Long> aR = a("alert_consent_after_cancel_interval_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(10)));
    public static final b<Long> aS = a("alert_consent_reschedule_interval_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(5)));
    public static final b<String> aT = a("text_alert_consent_title", "Make this App Better and Stay Free!");
    public static final b<String> aU = a("text_alert_consent_body", "If you don't give us consent to use your data, you will be making our ability to support this app harder, which may negatively affect the user experience.");
    public static final b<String> aV = a("text_alert_consent_yes_option", "I Agree");
    public static final b<String> aW = a("text_alert_consent_no_option", "Cancel");
    public static final b<Long> aX = a("ttc_max_click_duration_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(1)));
    public static final b<Integer> aY = a("ttc_max_click_distance_dp", 10);
    public static final b<Integer> aZ = a("ttc_acrsv2a", Integer.valueOf(AppLovinTouchToClickListener.ClickRecognitionState.ACTION_DOWN.ordinal()));
    public static final b<Integer> ba = a("ttc_acrsnv", Integer.valueOf(AppLovinTouchToClickListener.ClickRecognitionState.ACTION_DOWN.ordinal()));
    public static final b<Integer> bb = a("ttc_edge_buffer_dp", 0);
    public static final b<String> bc = a("whitelisted_postback_endpoints", "https://prod-a.applovin.com,https://rt.applovin.com/4.0/pix, https://rt.applvn.com/4.0/pix,https://ms.applovin.com/,https://ms.applvn.com/");
    public static final b<String> bd = a("fetch_settings_endpoint", "https://ms.applovin.com/");
    public static final b<String> be = a("fetch_settings_backup_endpoint", "https://ms.applvn.com/");
    public static final b<String> bf = a("adserver_endpoint", "https://a.applovin.com/");
    public static final b<String> bg = a("adserver_backup_endpoint", "https://a.applvn.com/");
    public static final b<String> bh = a("api_endpoint", "https://d.applovin.com/");
    public static final b<String> bi = a("api_backup_endpoint", "https://d.applvn.com/");
    public static final b<String> bj = a("event_tracking_endpoint_v2", "https://rt.applovin.com/");
    public static final b<String> bk = a("event_tracking_backup_endpoint_v2", "https://rt.applvn.com/");
    public static final b<String> bl = a("fetch_variables_endpoint", "https://ms.applovin.com/");
    public static final b<String> bm = a("fetch_variables_backup_endpoint", "https://ms.applvn.com/");
    public static final b<String> bn = a("anr_postback_endpoint", "https://ms.applovin.com/1.0/sdk/error");
    public static final b<String> bo = a("token_type_prefixes_r", "4!");
    public static final b<String> bp = a("token_type_prefixes_arj", "json_v3!");
    public static final b<String> bq = a("top_level_events", "landing,paused,resumed,cf_start,tos_ok,gdpr_ok,ref,rdf,checkout,iap");
    public static final b<String> br = a("valid_super_property_types", String.class.getName() + "," + Integer.class.getName() + "," + Long.class.getName() + "," + Double.class.getName() + "," + Float.class.getName() + "," + Date.class.getName() + "," + Uri.class.getName() + "," + List.class.getName() + "," + Map.class.getName());
    public static final b<Boolean> bs = a("persist_super_properties", true);
    public static final b<Integer> bt = a("super_property_string_max_length", 1024);
    public static final b<Integer> bu = a("super_property_url_max_length", 1024);
    public static final b<Long> bv = a("cached_advertising_info_ttl_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(10)));
    public static final b<Boolean> bw = a("use_per_format_cache_queues", true);
    public static final b<Boolean> bx = a("cache_cleanup_enabled", false);
    public static final b<Long> by = a("cache_file_ttl_seconds", Long.valueOf(TimeUnit.DAYS.toSeconds(1)));
    public static final b<Integer> bz = a("cache_max_size_mb", -1);
    public static final b<String> bA = a("precache_delimiters", ")]',");
    public static final b<Boolean> bB = a("ad_resource_caching_enabled", true);
    public static final b<Boolean> bC = a("fail_ad_load_on_failed_video_cache", true);
    public static final b<String> bD = a("resource_cache_prefix", "https://vid.applovin.com/,https://stage-vid.applovin.com/,https://pdn.applovin.com/,https://stage-pdn.applovin.com/,https://img.applovin.com/,https://stage-img.applovin.com/,https://d.applovin.com/,https://assets.applovin.com/,https://stage-assets.applovin.com/,https://cdnjs.cloudflare.com/,http://vid.applovin.com/,http://stage-vid.applovin.com/,http://pdn.applovin.com/,http://stage-pdn.applovin.com/,http://img.applovin.com/,http://stage-img.applovin.com/,http://d.applovin.com/,http://assets.applovin.com/,http://stage-assets.applovin.com/,http://cdnjs.cloudflare.com/,http://u.appl.vn/,https://u.appl.vn/,https://res.applovin.com/,https://res1.applovin.com/,https://res2.applovin.com/,https://res3.applovin.com/,http://res.applovin.com/,http://res1.applovin.com/,http://res2.applovin.com/,http://res3.applovin.com/");
    public static final b<String> bE = a("preserved_cached_assets", "sound_off.png,sound_on.png,closeOptOut.png,1381250003_28x28.png,zepto-1.1.3.min.js,jquery-2.1.1.min.js,jquery-1.9.1.min.js,jquery.knob.js");
    public static final b<Integer> bF = a("resource_max_filename_length", 255);
    public static final b<Boolean> bG = a("saewib", false);
    public static final b<Boolean> bH = a("unaem", false);
    public static final b<Integer> bI = a("vr_retry_count_v1", 1);
    public static final b<Integer> bJ = a("cr_retry_count_v1", 1);
    public static final b<Boolean> bK = a("incent_warning_enabled", false);
    public static final b<String> bL = a("text_incent_warning_title", "Attention!");
    public static final b<String> bM = a("text_incent_warning_body", "You won’t get your reward if the video hasn’t finished.");
    public static final b<String> bN = a("text_incent_warning_close_option", HTTP.CONN_CLOSE);
    public static final b<String> bO = a("text_incent_warning_continue_option", "Keep Watching");
    public static final b<Boolean> bP = a("incent_nonvideo_warning_enabled", false);
    public static final b<String> bQ = a("text_incent_nonvideo_warning_title", "Attention!");
    public static final b<String> bR = a("text_incent_nonvideo_warning_body", "You won’t get your reward if the game hasn’t finished.");
    public static final b<String> bS = a("text_incent_nonvideo_warning_close_option", HTTP.CONN_CLOSE);
    public static final b<String> bT = a("text_incent_nonvideo_warning_continue_option", "Keep Playing");
    public static final b<Integer> bU = a("close_button_touch_area", 0);
    public static final b<Integer> bV = a("close_button_outside_touch_area", 0);
    public static final b<Boolean> bW = a("creative_debugger_enabled", true);
    public static final b<Long> bX = a("viewability_adview_imp_delay_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(1)));
    public static final b<Integer> bY = a("viewability_adview_banner_min_width", 320);
    public static final b<Integer> bZ = a("viewability_adview_banner_min_height", Integer.valueOf(AppLovinAdSize.BANNER.getHeight()));
    public static final b<Integer> ca = a("viewability_adview_mrec_min_width", Integer.valueOf(MaxAdFormat.MREC.getSize().getWidth()));
    public static final b<Integer> cb = a("viewability_adview_mrec_min_height", Integer.valueOf(MaxAdFormat.MREC.getSize().getHeight()));
    public static final b<Integer> cc = a("viewability_adview_leader_min_width", 728);
    public static final b<Integer> cd = a("viewability_adview_leader_min_height", Integer.valueOf(AppLovinAdSize.LEADER.getHeight()));
    public static final b<Integer> ce = a("viewability_adview_native_min_width", 0);
    public static final b<Integer> cf = a("viewability_adview_native_min_height", 0);
    public static final b<Float> cg = a("viewability_adview_min_alpha", Float.valueOf(10.0f));
    public static final b<Long> ch = a("viewability_timer_min_visible_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(1)));
    public static final b<Long> ci = a("viewability_timer_interval_ms", 100L);
    public static final b<Integer> cj = a("expandable_close_button_size", 27);
    public static final b<Integer> ck = a("expandable_h_close_button_margin", 10);
    public static final b<Integer> cl = a("expandable_t_close_button_margin", 10);
    public static final b<Boolean> cm = a("expandable_lhs_close_button", false);
    public static final b<Integer> cn = a("expandable_close_button_touch_area", 0);
    public static final b<Boolean> co = a("iaad", false);
    public static final b<String> cp = a("js_tag_schemes", "applovin,mopub");
    public static final b<String> cq = a("js_tag_load_success_hosts", "load,load_succeeded");
    public static final b<String> cr = a("js_tag_load_failure_hosts", "failLoad,load_failed");
    public static final b<Integer> cs = a("auxiliary_operations_threads", 3);
    public static final b<Integer> ct = a("caching_operations_threads", 8);
    public static final b<Long> cu = a("fullscreen_ad_pending_display_state_timeout_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(10)));
    public static final b<Long> cv = a("fullscreen_ad_showing_state_timeout_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(2)));
    public static final b<Boolean> cw = a("lhs_close_button_video", false);
    public static final b<Integer> cx = a("close_button_right_margin_video", 4);
    public static final b<Integer> cy = a("close_button_size_video", 30);

    /* JADX INFO: renamed from: cz, reason: collision with root package name */
    public static final b<Integer> f1264cz = a("close_button_top_margin_video", 8);
    public static final b<Long> cA = a("inter_display_delay", 200L);
    public static final b<Long> cB = a("maximum_close_button_delay_seconds", 999L);
    public static final b<Boolean> cC = a("respect_close_button", true);
    public static final b<Boolean> cD = a("lhs_skip_button", true);
    public static final b<Boolean> cE = a("track_app_killed", false);
    public static final b<Boolean> cF = a("mute_controls_enabled", false);
    public static final b<Boolean> cG = a("allow_user_muting", true);
    public static final b<Boolean> cH = a("mute_videos", false);
    public static final b<Boolean> cI = a("show_mute_by_default", false);
    public static final b<Boolean> cJ = a("mute_with_user_settings", true);
    public static final b<Integer> cK = a("mute_button_size", 32);
    public static final b<Integer> cL = a("mute_button_margin", 10);
    public static final b<Integer> cM = a("mute_button_gravity", 85);
    public static final b<Long> cN = a("progress_bar_step", 25L);
    public static final b<Integer> cO = a("progress_bar_scale", Integer.valueOf(AsyncHttpClient.DEFAULT_SOCKET_TIMEOUT));
    public static final b<Integer> cP = a("progress_bar_vertical_padding", -8);
    public static final b<Integer> cQ = a("vs_buffer_indicator_size", 50);
    public static final b<Long> cR = a("set_poststitial_muted_initial_delay_ms", 500L);
    public static final b<Boolean> cS = a("fasuic", true);
    public static final b<Boolean> cT = a("ssfwif", false);
    public static final b<Boolean> cU = a("fsahrpg", true);
    public static final b<Boolean> cV = a("eaafrwsoa", true);
    public static final b<Integer> cW = a("submit_postback_timeout", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(10)));
    public static final b<Integer> cX = a("submit_postback_retries", 4);
    public static final b<Integer> cY = a("max_postback_attempts", 3);
    public static final b<Boolean> cZ = a("fppopq", false);
    public static final b<Integer> da = a("max_persisted_postbacks", 100);
    public static final b<Integer> db = a("submit_web_tracker_timeout", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(7)));
    public static final b<Boolean> dc = a("uppmv2", false);
    public static final b<Boolean> dd = a("retry_on_all_errors", false);
    public static final b<Integer> de = a("get_retry_delay_v1", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(10)));
    public static final b<Integer> df = a("http_connection_timeout", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(30)));
    public static final b<Integer> dg = a("http_socket_timeout", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(20)));
    public static final b<Boolean> dh = a("force_ssl", false);
    public static final b<Integer> di = a("fetch_ad_connection_timeout", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(30)));
    public static final b<Integer> dj = a("fetch_ad_retry_count_v1", 1);
    public static final b<Boolean> dk = a("faer", false);
    public static final b<Boolean> dl = a("faroae", false);
    public static final b<Integer> dm = a("submit_data_retry_count_v1", 1);
    public static final b<Integer> dn = a("response_buffer_size", 16000);

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public static final b<Integer> f0do = a("fetch_basic_settings_connection_timeout_ms", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(10)));
    public static final b<Integer> dp = a("fetch_basic_settings_retry_count", 3);
    public static final b<Boolean> dq = a("fetch_basic_settings_on_reconnect", false);
    public static final b<Boolean> dr = a("skip_fetch_basic_settings_if_not_connected", false);
    public static final b<Integer> ds = a("fetch_basic_settings_retry_delay_ms", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(2)));
    public static final b<Integer> dt = a("fetch_variables_connection_timeout_ms", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(5)));
    public static final b<Boolean> du = a("idflrwbe", false);
    public static final b<Boolean> dv = a("falawpr", false);
    public static final b<Boolean> dw = a("sort_query_parameters", false);
    public static final b<Long> dx = a("communicator_request_timeout_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(10)));
    public static final b<Integer> dy = a("communicator_request_retry_count", 3);
    public static final b<Long> dz = a("communicator_request_retry_delay_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(2)));
    public static final b<Long> dA = a("ehkpd_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(1)));
    public static final b<Integer> dB = a("ad_session_minutes", 60);
    public static final b<Boolean> dC = a("session_tracking_cooldown_on_event_fire", true);
    public static final b<Long> dD = a("session_tracking_resumed_cooldown_minutes", 90L);
    public static final b<Long> dE = a("session_tracking_paused_cooldown_minutes", 90L);
    public static final b<Boolean> dF = a("dc_v2", false);
    public static final b<Boolean> dG = a("dce", true);
    public static final b<Boolean> dH = a("qq", false);
    public static final b<Boolean> dI = a("qq1", true);
    public static final b<Boolean> dJ = a("qq2", true);
    public static final b<Boolean> dK = a("qq3", true);
    public static final b<Boolean> dL = a("qq4", true);
    public static final b<Boolean> dM = a("qq5", true);
    public static final b<Boolean> dN = a("qq6", true);
    public static final b<Boolean> dO = a("qq7", true);
    public static final b<Boolean> dP = a("qq8", true);
    public static final b<Boolean> dQ = a("qq9", false);
    public static final b<Boolean> dR = a("qq10", true);
    public static final b<Boolean> dS = a("qq11", true);
    public static final b<Boolean> dT = a("pui", true);
    public static final b<String> dU = a("plugin_version", "");
    public static final b<Boolean> dV = a("hgn", false);
    public static final b<Boolean> dW = a("cso", false);
    public static final b<Boolean> dX = a("cfs", false);
    public static final b<Boolean> dY = a("cmi", false);
    public static final b<Boolean> dZ = a("crat", false);
    public static final b<Boolean> ea = a("cvs", false);
    public static final b<Boolean> eb = a("caf", false);
    public static final b<Boolean> ec = a("cf", false);
    public static final b<Boolean> ed = a("cmtl", true);
    public static final b<Boolean> ee = a("cnr", false);
    public static final b<Boolean> ef = a("ccr", false);
    public static final b<Boolean> eg = a("adr", false);
    public static final b<Float> eh = a("volume_normalization_factor", Float.valueOf(6.6666665f));
    public static final b<Boolean> ei = a("system_user_agent_collection_enabled", false);
    public static final b<Boolean> ej = a(AppLovinSdkExtraParameterKey.USER_AGENT_COLLECTION_ENABLED, false);
    public static final b<Boolean> ek = a("collect_device_angle", false);
    public static final b<Boolean> el = a("collect_device_movement", false);
    public static final b<Float> em = a("movement_degradation", Float.valueOf(0.75f));
    public static final b<Integer> en = a("device_sensor_period_ms", Integer.valueOf(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION));
    public static final b<Boolean> eo = a("dte", true);
    public static final b<Boolean> ep = a("idcw", false);
    public static final b<Long> eq = a("anr_debug_thread_refresh_time_ms", -1L);
    public static final b<Integer> er = a("fetch_basic_settings_delay_ms", 1500);
    public static final b<Integer> es = a("dcttl_1_seconds", 5);
    public static final b<Integer> et = a("dcttl_2_seconds", 30);
    public static final b<Integer> eu = a("dcttl_3_seconds", Integer.valueOf((int) TimeUnit.MINUTES.toSeconds(1)));
    public static final b<Integer> ev = a("dcttl_4_seconds", Integer.valueOf((int) TimeUnit.MINUTES.toSeconds(30)));
    public static final b<Integer> ew = a("dcttl_5_seconds", Integer.valueOf((int) TimeUnit.HOURS.toSeconds(1)));
    public static final b<Integer> ex = a("dcttl_6_seconds", Integer.valueOf((int) TimeUnit.DAYS.toSeconds(1)));
    public static final b<Boolean> ey = a("cclia", true);
    public static final b<Long> ez = a("lccdm", 10L);
    public static final b<Integer> eA = a("lmfd", 2);
    public static final b<Boolean> eB = a("is_track_ad_info", true);
    public static final b<Boolean> eC = a("submit_ad_stats_enabled", false);
    public static final b<Integer> eD = a("submit_ad_stats_connection_timeout", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(30)));
    public static final b<Integer> eE = a("submit_ad_stats_retry_count", 1);
    public static final b<Integer> eF = a("submit_ad_stats_max_count", 500);
    public static final b<Boolean> eG = a("asdm", false);
    public static final b<String> eH = a("vast_image_html", "<html><head><style>html,body{height:100%;width:100%}body{background-image:url({SOURCE});background-repeat:no-repeat;background-size:contain;background-position:center;}a{position:absolute;top:0;bottom:0;left:0;right:0}</style></head><body><a href=\"applovin://com.applovin.sdk/adservice/track_click_now\"></a></body></html>");
    public static final b<String> eI = a("vast_link_html", "<html><head><style>html,body,iframe{height:100%;width:100%;}body{margin:0}iframe{border:0;overflow:hidden;position:absolute}</style></head><body><iframe src={SOURCE} frameborder=0></iframe></body></html>");
    public static final b<Integer> eJ = a("vast_max_response_length", 640000);
    public static final b<Integer> eK = a("vast_max_wrapper_depth", 5);
    public static final b<String> eL = a("vast_unsupported_video_extensions", "ogv,flv");
    public static final b<String> eM = a("vast_unsupported_video_types", "video/ogg,video/x-flv");
    public static final b<Boolean> eN = a("vast_validate_with_extension_if_no_video_type", true);
    public static final b<Integer> eO = a("vast_video_selection_policy", Integer.valueOf(n.a.MEDIUM.ordinal()));
    public static final b<Integer> eP = a("vast_wrapper_resolution_retry_count_v1", 1);
    public static final b<Integer> eQ = a("vast_wrapper_resolution_connection_timeout", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(30)));
    public static final b<Integer> eR = a("vast_industry_icon_max_size", 20);
    public static final b<Integer> eS = a("vast_industry_icon_margin", 12);
    public static final b<Integer> eT = a("vast_industry_icon_gravity", 85);
    public static final b<Integer> eU = a("vast_native_mute_button_size", 24);
    public static final b<Integer> eV = a("vast_native_play_pause_button_size", 24);
    public static final b<Integer> eW = a("vast_native_video_widget_padding", 6);
    public static final b<Float> eX = a("vast_native_video_widget_alpha", Float.valueOf(0.5f));
    public static final b<Boolean> eY = a("vast_native_video_widgets_enabled", true);
    public static final b<Boolean> eZ = a("vast_replay_video_upon_completion", true);
    public static final b<Integer> fa = a("vast_replay_icon_size", 64);
    public static final b<Boolean> fb = a("ree", true);
    public static final b<Boolean> fc = a("btee", true);
    public static final b<Long> fd = a("server_timestamp_ms", 0L);
    public static final b<Long> fe = a("device_timestamp_ms", 0L);
    public static final b<Integer> ff = a("gzip_min_length", 0);
    public static final b<Boolean> fg = a("gzip_encoding_default", false);
    public static final b<Boolean> fh = a("fetch_settings_gzip", false);
    public static final b<Boolean> fi = a("device_init_gzip", false);
    public static final b<Boolean> fj = a("fetch_ad_gzip", false);
    public static final b<Boolean> fk = a("event_tracking_gzip", false);
    public static final b<Boolean> fl = a("submit_ad_stats_gzip", false);
    public static final b<Boolean> fm = a("reward_postback_gzip", false);
    public static final b<Boolean> fn = a("force_rerender", false);
    public static final b<Boolean> fo = a("daostr", false);
    public static final b<Boolean> fp = a("tctlaa", false);
    public static final b<Boolean> fq = a("rwvdv", false);
    public static final b<Boolean> fr = a("handle_render_process_gone", true);
    public static final b<Boolean> fs = a("rworpg", true);
    public static final b<Boolean> ft = a("fdadaomr", true);
    public static final b<Boolean> fu = a("teorpc", false);
    public static final b<Boolean> fv = a("rmpibt", false);
    public static final b<Boolean> fw = a("spbcioa", false);
    public static final b<Boolean> fx = a("set_webview_render_process_client", false);
    public static final b<Boolean> fy = a("disable_webview_hardware_acceleration", false);
    public static final b<Boolean> fz = a("dsaovcf", false);
    public static final b<Boolean> fA = a("daoar", false);
    public static final b<Boolean> fB = a("anr_detection_enabled", false);
    public static final b<Long> fC = a("anr_trigger_millis", 4000L);
    public static final b<Long> fD = a("anr_touch_millis", 3000L);
    public static final b<Long> fE = a("anr_check_millis", 3000L);
    public static final b<Boolean> fF = a("uobid", true);
    public static final b<Boolean> fG = a("bvde", false);
    public static final b<Long> fH = a("bvdidm", 1000L);
    public static final b<Long> fI = a("bvdim", 4000L);
    public static final b<Integer> fJ = a("bvdrs", 10);
    public static final b<Boolean> fK = a("bvad", false);
    public static final b<Boolean> fL = a("bvebb", true);
    public static final b<Boolean> fM = a("bvscb", true);
    public static final b<Boolean> fN = a("apsobt", true);
    public static final b<Boolean> fO = a("aetobt", false);
    public static final b<Integer> fP = a("tmtp", 5);
    public static final b<Boolean> fQ = a("uwtm", false);
    public static final b<Boolean> fR = a("dwvvb", false);
    public static final b<Boolean> fS = a("paiobt", false);
    public static final b<Boolean> fT = a("ej8left", false);
    public static final b<Boolean> fU = a("ej8mrft", false);
    public static final b<Boolean> fV = a("ej8saft", false);
    public static final b<Boolean> fW = a("ej8oft", false);
    public static final b<Boolean> fX = a("ej8dmft", false);
    public static final b<String> fY = a("config_consent_dialog_state", "unknown");
    public static final b<String> fZ = a(TapjoyConstants.TJC_DEVICE_COUNTRY_CODE, "");
    public static final b<String> ga = a("consent_flow_doc_url", "https://dash.applovin.com/documentation/mediation/android/getting-started/integration#enabling-max-built-in-consent-flow");
    public static final b<String> gb = a("consent_flow_unity_doc_url", "https://dash.applovin.com/documentation/mediation/unity/getting-started/integration#max-built-in-consent-flow");
    public static final b<Integer> gc = a("cfadtml", 20);
    public static final b<String> gd = a("cfdpu_advertising", "https://corp.aarki.com/privacy,https://www.adcolony.com/consumer-privacy/,https://www.adikteev.com/privacy-policy-eng,https://advertising.amazon.com/resources/ad-policy/eu-data-protection-and-privacy,https://www.appier.com/privacy-policy/,https://www.appnexus.com/en/company/privacy-policy,https://www.beeswax.com/privacy.html,https://bidease.com/privacy-policy,https://www.bigabid.com/Legal/,https://www.pangleglobal.com/privacy,https://answers.chartboost.com/en-us/articles/200780269,https://clearpier.com/privacy-policy/,https://www.criteo.com/privacy/,https://www.criteo.com/privacy/,https://dataseat.com/privacy-policy,https://nend.net/privacy/sdkpolicy,https://www.fyber.com/services-privacy-statement/,https://privacy-policy.cyberagent.ai/,https://policies.google.com/privacy,https://www.inmobi.com/privacy-policy/,https://www.is.com/privacy-policy/,https://www.jampp.com/privacy-policy-terms-and-conditions,https://www.lifestreet.com/privacy/,https://liftoff.io/privacy-policy/,https://terms2.line.me/creators_privacy_policy,https://www.linkedin.com/legal/privacy-policy?src=or-search&veh=www.google.comLiqui,https://loopme.com/end-user-privacy-policy/,https://mediasmart.io/privacy-policy/,https://www.facebook.com/privacy/explanation/,https://www.mintegral.com/en/privacy/#privacy-Services,https://www.moloco.com/privacy-policy,https://www.motiv-i.com/en/privacy/,https://ogury.com/privacy-policy/,https://persona.ly/privacy_dsp,https://www.opera.com/privacy,https://pubmatic.com/legal/privacy/,https://kayzen.io/data-privacy-policy,https://www.remerge.io/privacy-policy.html,https://revx.io/privacy-policy,https://www.rtbhouse.com/privacy-center/services-privacy-policy/,https://simpli.fi/simpli-fi-services-privacy-policy/,https://www.smaato.com/privacy/,https://smadex.com/end-user-privacy-policy,https://snap.com/en-US/privacy/privacy-policy,https://www.stackadapt.com/privacy,https://www.start.io/policy/privacy-policy-site/,https://www.tapjoy.com/legal/general/privacy-policy/,https://taurusx.com/privacy-policy.html,https://rubiconproject.com/privacy-policy/,https://www.thetradedesk.com/general/privacy-policy,https://appreciate.mobi/page.html#!/end-user-privacy-policy,https://twitter.com/privacy,https://uni-corn.net/privacy.html,https://unity3d.com/legal/privacy-policy,https://www.valassis.com/legal/privacy-policy/,https://pubnative.net/privacy-notice/,https://vungle.com/privacy/,https://wildlifestudios.com/policy-center/privacy-policy/wildlife-studios-privacy-policy/,https://www.groundtruth.com/privacy-policy/,https://legal.yahoo.com/us/en/yahoo/privacy/index.html,https://yandex.com/legal/confidential/,https://www.youappi.com/privacy-policy");
    public static final b<String> ge = a("cfdpu_analytics", "https://www.adjust.com/terms/privacy-policy/,https://www.appsflyer.com/legal/privacy-policy/,https://branch.io/policies/privacy-policy/");
    public static final b<Boolean> gf = a("communicator_enabled", true);

    public b(String str, T t) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified");
        }
        if (t == null) {
            throw new IllegalArgumentException("No default value specified");
        }
        this.c = str;
        this.d = t;
    }

    public String a() {
        return this.c;
    }

    public T b() {
        return this.d;
    }

    public T a(Object obj) {
        return (T) this.d.getClass().cast(obj);
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (!(obj instanceof b)) {
            return 0;
        }
        return this.c.compareTo(((b) obj).a());
    }

    protected static <T> b<T> a(String str, T t) {
        if (t == null) {
            throw new IllegalArgumentException("No default value specified");
        }
        if (!f1263a.contains(t.getClass())) {
            throw new IllegalArgumentException("Unsupported value type: " + t.getClass());
        }
        b<T> bVar = new b<>(str, t);
        Map<String, b<?>> map = b;
        if (map.containsKey(str)) {
            throw new IllegalArgumentException("Setting has already been used: " + str);
        }
        map.put(str, bVar);
        return bVar;
    }

    public static Collection<b<?>> c() {
        return Collections.synchronizedCollection(b.values());
    }
}
