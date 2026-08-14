package com.tapjoy;

import android.text.TextUtils;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class TJPlacementData implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f1694a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public int g;
    public String h;
    public String i;
    public int j;
    public boolean k;
    public String l;
    public boolean m;
    public String n;
    public String o;
    public boolean p = false;
    public boolean q;

    public TJPlacementData(String str, String str2) {
        setKey(str);
        updateUrl(str2);
        setPlacementType(TapjoyConstants.TJC_APP_PLACEMENT);
    }

    public String getAuctionMediationURL() {
        return this.e;
    }

    public String getBaseURL() {
        return this.c;
    }

    public String getCallbackID() {
        return this.n;
    }

    public String getContentViewId() {
        return this.o;
    }

    public String getHttpResponse() {
        return this.f;
    }

    public int getHttpStatusCode() {
        return this.g;
    }

    public String getKey() {
        return this.f1694a;
    }

    public String getMediationURL() {
        return this.d;
    }

    public String getPlacementName() {
        return this.h;
    }

    public String getPlacementType() {
        return this.i;
    }

    public String getRedirectURL() {
        return this.l;
    }

    public String getUrl() {
        return this.b;
    }

    public int getViewType() {
        return this.j;
    }

    public boolean hasProgressSpinner() {
        return this.k;
    }

    public boolean isPreloadDisabled() {
        return this.p;
    }

    public boolean isPrerenderingRequested() {
        return this.m;
    }

    public void resetPlacementRequestData() {
        setHttpResponse(null);
        setHttpStatusCode(0);
        setRedirectURL(null);
        setHasProgressSpinner(false);
        setPrerenderingRequested(false);
        setPreloadDisabled(false);
        setContentViewId(null);
        setHandleDismissOnPause(false);
    }

    public void setAuctionMediationURL(String str) {
        this.e = str;
    }

    public void setBaseURL(String str) {
        this.c = str;
    }

    public void setContentViewId(String str) {
        this.o = str;
    }

    public void setHandleDismissOnPause(boolean z) {
        this.q = z;
    }

    public void setHasProgressSpinner(boolean z) {
        this.k = z;
    }

    public void setHttpResponse(String str) {
        this.f = str;
    }

    public void setHttpStatusCode(int i) {
        this.g = i;
    }

    public void setKey(String str) {
        this.f1694a = str;
    }

    public void setMediationURL(String str) {
        this.d = str;
    }

    public void setPlacementName(String str) {
        this.h = str;
    }

    public void setPlacementType(String str) {
        this.i = str;
    }

    public void setPreloadDisabled(boolean z) {
        this.p = z;
    }

    public void setPrerenderingRequested(boolean z) {
        this.m = z;
    }

    public void setRedirectURL(String str) {
        this.l = str;
    }

    public void setViewType(int i) {
        this.j = i;
    }

    public boolean shouldHandleDismissOnPause() {
        return this.q;
    }

    public void updateUrl(String str) {
        this.b = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        setBaseURL(str.substring(0, str.indexOf(47, str.indexOf("//") + 3)));
    }

    public TJPlacementData(String str, String str2, String str3) {
        setBaseURL(str);
        setHttpResponse(str2);
        this.n = str3;
        setPlacementType(TapjoyConstants.TJC_APP_PLACEMENT);
    }
}
