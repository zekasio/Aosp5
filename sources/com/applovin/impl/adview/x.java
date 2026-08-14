package com.applovin.impl.adview;

import android.webkit.WebSettings;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f846a;

    public x(JSONObject jSONObject) {
        this.f846a = jSONObject;
    }

    Integer a() {
        String string = JsonUtils.getString(this.f846a, "mixed_content_mode", null);
        if (StringUtils.isValidString(string)) {
            if ("always_allow".equalsIgnoreCase(string)) {
                return 0;
            }
            if ("never_allow".equalsIgnoreCase(string)) {
                return 1;
            }
            if ("compatibility_mode".equalsIgnoreCase(string)) {
                return 2;
            }
        }
        return null;
    }

    WebSettings.PluginState b() {
        String string = JsonUtils.getString(this.f846a, "plugin_state", null);
        if (StringUtils.isValidString(string)) {
            if (TJAdUnitConstants.String.SPLIT_VIEW_TRIGGER_ON.equalsIgnoreCase(string)) {
                return WebSettings.PluginState.ON;
            }
            if ("on_demand".equalsIgnoreCase(string)) {
                return WebSettings.PluginState.ON_DEMAND;
            }
            if ("off".equalsIgnoreCase(string)) {
                return WebSettings.PluginState.OFF;
            }
        }
        return null;
    }

    Boolean c() {
        return JsonUtils.getBoolean(this.f846a, "allow_file_access", null);
    }

    Boolean d() {
        return JsonUtils.getBoolean(this.f846a, "load_with_overview_mode", null);
    }

    Boolean e() {
        return JsonUtils.getBoolean(this.f846a, "use_wide_view_port", null);
    }

    Boolean f() {
        return JsonUtils.getBoolean(this.f846a, "allow_content_access", null);
    }

    Boolean g() {
        return JsonUtils.getBoolean(this.f846a, "use_built_in_zoom_controls", null);
    }

    Boolean h() {
        return JsonUtils.getBoolean(this.f846a, "display_zoom_controls", null);
    }

    Boolean i() {
        return JsonUtils.getBoolean(this.f846a, "save_form_data", null);
    }

    Boolean j() {
        return JsonUtils.getBoolean(this.f846a, "geolocation_enabled", null);
    }

    Boolean k() {
        return JsonUtils.getBoolean(this.f846a, "need_initial_focus", null);
    }

    Boolean l() {
        return JsonUtils.getBoolean(this.f846a, "allow_file_access_from_file_urls", null);
    }

    Boolean m() {
        return JsonUtils.getBoolean(this.f846a, "allow_universal_access_from_file_urls", null);
    }

    Boolean n() {
        return JsonUtils.getBoolean(this.f846a, "offscreen_pre_raster", null);
    }
}
