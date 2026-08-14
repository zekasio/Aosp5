package com.vungle.mediation;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public class AdapterParametersParser {

    public static class Config {
        private String appId;
        private String requestUniqueId;

        public String getAppId() {
            return this.appId;
        }

        public String getRequestUniqueId() {
            return this.requestUniqueId;
        }
    }

    public static Config parse(String str, Bundle bundle) {
        String string = (bundle == null || !bundle.containsKey("uniqueVungleRequestKey")) ? null : bundle.getString("uniqueVungleRequestKey");
        Config config = new Config();
        config.appId = str;
        config.requestUniqueId = string;
        return config;
    }
}
