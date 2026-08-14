package com.vungle.warren.model.token;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.vungle.warren.model.Cookie;

/* JADX INFO: loaded from: classes3.dex */
public class Coppa {

    @SerializedName(Cookie.COPPA_STATUS_KEY)
    @Expose
    private boolean isCoppa;

    public boolean getIsCoppa() {
        return this.isCoppa;
    }

    public Coppa(boolean z) {
        this.isCoppa = z;
    }
}
