package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class aa extends ab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.e f1281a;
    private final AppLovinAdRewardListener b;

    public aa(com.applovin.impl.sdk.ad.e eVar, AppLovinAdRewardListener appLovinAdRewardListener, com.applovin.impl.sdk.p pVar) {
        super("TaskValidateAppLovinReward", pVar);
        this.f1281a = eVar;
        this.b = appLovinAdRewardListener;
    }

    @Override // com.applovin.impl.sdk.e.y
    public String a() {
        return "2.0/vr";
    }

    @Override // com.applovin.impl.sdk.e.y
    protected void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, AppLovinUtils.ServerParameterKeys.ZONE_ID, this.f1281a.getAdZone().a());
        String clCode = this.f1281a.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    @Override // com.applovin.impl.sdk.e.ab
    protected void a(com.applovin.impl.sdk.b.c cVar) {
        this.f1281a.a(cVar);
        String strB = cVar.b();
        Map<String, String> mapA = cVar.a();
        if (strB.equals("accepted")) {
            this.b.userRewardVerified(this.f1281a, mapA);
            return;
        }
        if (strB.equals("quota_exceeded")) {
            this.b.userOverQuota(this.f1281a, mapA);
        } else if (strB.equals("rejected")) {
            this.b.userRewardRejected(this.f1281a, mapA);
        } else {
            this.b.validationRequestFailed(this.f1281a, AppLovinErrorCodes.INCENTIVIZED_UNKNOWN_SERVER_ERROR);
        }
    }

    @Override // com.applovin.impl.sdk.e.y
    protected void a(int i) {
        String str;
        super.a(i);
        if (i >= 400 && i < 500) {
            this.b.userRewardRejected(this.f1281a, Collections.emptyMap());
            str = "rejected";
        } else {
            this.b.validationRequestFailed(this.f1281a, i);
            str = "network_timeout";
        }
        this.f1281a.a(com.applovin.impl.sdk.b.c.a(str));
    }

    @Override // com.applovin.impl.sdk.e.ab
    protected boolean b() {
        return this.f1281a.aG();
    }
}
