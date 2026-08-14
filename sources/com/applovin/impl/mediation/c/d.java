package com.applovin.impl.mediation.c;

import android.net.Uri;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.sdk.network.j;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class d extends com.applovin.impl.sdk.e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f997a;
    private final String b;
    private final com.applovin.impl.mediation.a.f c;
    private final Map<String, String> d;
    private final Map<String, String> e;
    private final MaxError i;

    public d(String str, Map<String, String> map, MaxError maxError, com.applovin.impl.mediation.a.f fVar, p pVar, boolean z) {
        super("TaskFireMediationPostbacks", pVar);
        this.f997a = str;
        this.b = str + "_urls";
        this.d = Utils.toUrlSafeMap(map, pVar);
        this.i = maxError != null ? maxError : new MaxErrorImpl(-1);
        this.c = fVar;
        Map<String, String> map2 = CollectionUtils.map(7);
        map2.put("AppLovin-Event-Type", str);
        if (z) {
            map2.put("AppLovin-Ad-Network-Name", fVar.Y());
        }
        if (fVar instanceof com.applovin.impl.mediation.a.a) {
            com.applovin.impl.mediation.a.a aVar = (com.applovin.impl.mediation.a.a) fVar;
            map2.put("AppLovin-Ad-Unit-Id", aVar.getAdUnitId());
            map2.put("AppLovin-Ad-Format", aVar.getFormat().getLabel());
            if (z) {
                map2.put("AppLovin-Third-Party-Ad-Placement-ID", aVar.s());
            }
        }
        if (maxError != null) {
            map2.put("AppLovin-Error-Code", String.valueOf(maxError.getCode()));
            map2.put("AppLovin-Error-Message", maxError.getMessage());
        }
        this.e = map2;
    }

    @Override // java.lang.Runnable
    public void run() {
        List<String> listG = this.c.g(this.b);
        Map<String, String> mapA = a();
        Iterator<String> it = listG.iterator();
        while (it.hasNext()) {
            Uri uri = Uri.parse(a(b(it.next(), this.d), this.i));
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            Map<String, Object> map = CollectionUtils.map(mapA.size());
            for (String str : uri.getQueryParameterNames()) {
                String queryParameter = uri.getQueryParameter(str);
                if (mapA.containsKey(queryParameter)) {
                    map.put(str, this.c.h(mapA.get(queryParameter)));
                } else {
                    builderClearQuery.appendQueryParameter(str, queryParameter);
                }
            }
            a(builderClearQuery.build().toString(), map);
        }
    }

    private void a(String str, Map<String, Object> map) {
        d().al().a(j.o().c(str).b("POST").b(this.e).a(false).c(map).b(((Boolean) this.f.a(com.applovin.impl.sdk.c.a.ab)).booleanValue()).a());
    }

    private Map<String, String> a() {
        try {
            return JsonUtils.toStringMap(new JSONObject((String) this.f.a(com.applovin.impl.sdk.c.a.i)));
        } catch (JSONException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    private String b(String str, Map<String, String> map) {
        for (String str2 : map.keySet()) {
            str = str.replace(str2, StringUtils.emptyIfNull(map.get(str2)));
        }
        return str;
    }

    private String a(String str, MaxError maxError) {
        int mediatedNetworkErrorCode;
        String mediatedNetworkErrorMessage;
        if (!(maxError instanceof MaxAdapterError)) {
            mediatedNetworkErrorCode = 0;
            mediatedNetworkErrorMessage = "";
        } else {
            MaxAdapterError maxAdapterError = (MaxAdapterError) maxError;
            mediatedNetworkErrorCode = maxAdapterError.getMediatedNetworkErrorCode();
            mediatedNetworkErrorMessage = maxAdapterError.getMediatedNetworkErrorMessage();
        }
        return str.replace("{ERROR_CODE}", String.valueOf(maxError.getCode())).replace("{ERROR_MESSAGE}", StringUtils.encodeUriString(maxError.getMessage())).replace("{THIRD_PARTY_SDK_ERROR_CODE}", String.valueOf(mediatedNetworkErrorCode)).replace("{THIRD_PARTY_SDK_ERROR_MESSAGE}", StringUtils.encodeUriString(mediatedNetworkErrorMessage));
    }
}
