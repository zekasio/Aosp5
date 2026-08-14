package com.vungle.warren.model.token;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.vungle.warren.model.Cookie;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class Request {

    @SerializedName(Cookie.CONFIG_EXTENSION)
    @Expose
    private String configExtension;

    @SerializedName("ordinal_view")
    @Expose
    private Integer ordinalView;

    @SerializedName("precached_tokens")
    @Expose
    private List<String> preCachedToken;

    @SerializedName("sdk_user_agent")
    @Expose
    private String sdkUserAgent;

    public Request(String str, Integer num, List<String> list, String str2) {
        this.configExtension = str;
        this.ordinalView = num;
        this.preCachedToken = list;
        this.sdkUserAgent = str2;
    }
}
