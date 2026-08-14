package com.vungle.warren.network;

import okhttp3.Call;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes3.dex */
public class APIFactory {
    private static final String TAG = "APIFactory";
    private HttpUrl baseUrl;
    private Call.Factory okHttpClient;

    public APIFactory(Call.Factory factory, String str) {
        HttpUrl httpUrl = HttpUrl.get(str);
        this.baseUrl = httpUrl;
        this.okHttpClient = factory;
        if ("".equals(httpUrl.pathSegments().get(r3.size() - 1))) {
            return;
        }
        throw new IllegalArgumentException("baseUrl must end in /: " + str);
    }

    public VungleApi createAPI(String str) {
        VungleApiImpl vungleApiImpl = new VungleApiImpl(this.baseUrl, this.okHttpClient);
        vungleApiImpl.setAppId(str);
        return vungleApiImpl;
    }
}
