package com.vungle.warren.model.token;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tapjoy.TapjoyConstants;

/* JADX INFO: loaded from: classes3.dex */
public class AndroidInfo {

    @SerializedName("android_id")
    @Expose
    public String android_id;

    @SerializedName(TapjoyConstants.TJC_APP_SET_ID)
    @Expose
    public String app_set_id;
}
