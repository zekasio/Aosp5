package com.applovin.impl.sdk;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdContentRating;
import com.applovin.sdk.AppLovinGender;
import com.applovin.sdk.AppLovinTargetingData;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinTargetingDataImpl implements AppLovinTargetingData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, String> f1180a = CollectionUtils.map();
    private final Object b = new Object();
    private Integer c = null;
    private AppLovinGender d = null;
    private AppLovinAdContentRating e = null;
    private String f = null;
    private String g = null;
    private List<String> h = null;
    private List<String> i = null;

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setYearOfBirth(Integer num) {
        a("year_of_birth", num == null ? null : Integer.toString(num.intValue()));
        this.c = num;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public Integer getYearOfBirth() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0017  */
    @Override // com.applovin.sdk.AppLovinTargetingData
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setGender(com.applovin.sdk.AppLovinGender r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L17
            com.applovin.sdk.AppLovinGender r0 = com.applovin.sdk.AppLovinGender.FEMALE
            if (r3 != r0) goto L9
            java.lang.String r0 = "F"
            goto L18
        L9:
            com.applovin.sdk.AppLovinGender r0 = com.applovin.sdk.AppLovinGender.MALE
            if (r3 != r0) goto L10
            java.lang.String r0 = "M"
            goto L18
        L10:
            com.applovin.sdk.AppLovinGender r0 = com.applovin.sdk.AppLovinGender.OTHER
            if (r3 != r0) goto L17
            java.lang.String r0 = "O"
            goto L18
        L17:
            r0 = 0
        L18:
            java.lang.String r1 = "gender"
            r2.a(r1, r0)
            r2.d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.AppLovinTargetingDataImpl.setGender(com.applovin.sdk.AppLovinGender):void");
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public AppLovinGender getGender() {
        return this.d;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setMaximumAdContentRating(AppLovinAdContentRating appLovinAdContentRating) {
        a("maximum_ad_content_rating", (appLovinAdContentRating == null || appLovinAdContentRating == AppLovinAdContentRating.NONE) ? null : Integer.toString(appLovinAdContentRating.ordinal()));
        this.e = appLovinAdContentRating;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public AppLovinAdContentRating getMaximumAdContentRating() {
        return this.e;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setEmail(String str) {
        a("email", str != null ? StringUtils.toFullSHA1Hash(str.toLowerCase().trim()) : str);
        this.f = str;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public String getEmail() {
        return this.f;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setPhoneNumber(String str) {
        a("phone_number", str != null ? StringUtils.toFullSHA1Hash(str.replaceAll("[^0-9]", "")) : str);
        this.g = str;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public String getPhoneNumber() {
        return this.g;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setKeywords(List<String> list) {
        a("keywords", list == null ? null : CollectionUtils.implode(list, list.size()));
        this.h = list;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public List<String> getKeywords() {
        return this.h;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setInterests(List<String> list) {
        a("interests", list == null ? null : CollectionUtils.implode(list, list.size()));
        this.i = list;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public List<String> getInterests() {
        return this.i;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void clearAll() {
        synchronized (this.b) {
            this.f1180a.clear();
        }
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
    }

    public Map<String, String> getAllData() {
        Map<String, String> map;
        synchronized (this.b) {
            map = CollectionUtils.map(this.f1180a);
        }
        return map;
    }

    private void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.b) {
            if (StringUtils.isValidString(str2)) {
                this.f1180a.put(str, str2);
            } else {
                this.f1180a.remove(str);
            }
        }
    }
}
