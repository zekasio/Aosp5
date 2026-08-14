package com.applovin.impl.mediation.ads;

import android.app.Activity;
import com.applovin.impl.mediation.f;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.l;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    protected final MaxAdFormat adFormat;
    protected MaxAdListener adListener;
    protected MaxAdReviewListener adReviewListener;
    protected final String adUnitId;
    protected final y logger;
    protected MaxAdRequestListener requestListener;
    protected MaxAdRevenueListener revenueListener;
    protected final p sdk;
    protected final String tag;
    protected final Map<String, Object> localExtraParameters = Collections.synchronizedMap(CollectionUtils.map());
    protected final Map<String, Object> extraParameters = Collections.synchronizedMap(CollectionUtils.map());

    /* JADX INFO: renamed from: com.applovin.impl.mediation.ads.a$a, reason: collision with other inner class name */
    public interface InterfaceC0058a extends f.b, MaxAdListener, MaxAdRequestListener, MaxAdRevenueListener {
    }

    protected a(String str, MaxAdFormat maxAdFormat, String str2, p pVar) {
        this.adUnitId = str;
        this.adFormat = maxAdFormat;
        this.sdk = pVar;
        this.tag = str2;
        this.logger = pVar.L();
    }

    public void setListener(MaxAdListener maxAdListener) {
        if (y.a()) {
            this.logger.b(this.tag, "Setting listener: " + maxAdListener);
        }
        this.adListener = maxAdListener;
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        if (y.a()) {
            this.logger.b(this.tag, "Setting request listener: " + maxAdRequestListener);
        }
        this.requestListener = maxAdRequestListener;
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        if (y.a()) {
            this.logger.b(this.tag, "Setting revenue listener: " + maxAdRevenueListener);
        }
        this.revenueListener = maxAdRevenueListener;
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        if (y.a()) {
            this.logger.b(this.tag, "Setting Ad Review creative id listener: " + maxAdReviewListener);
        }
        this.adReviewListener = maxAdReviewListener;
    }

    public void setExtraParameter(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("No key specified");
        }
        if (Utils.isPubInDebugMode(p.y(), this.sdk) && ("amazon_ad_response".equals(str) || "amazon_ad_error".equals(str))) {
            throw new IllegalArgumentException("`setExtraParameter()` is an incorrect method for passing `amazon_ad_response` or `amazon_ad_error`. Please use the following method: `setLocalExtraParameter()`. Also note that this exception occurs in development builds only.");
        }
        if (this.adFormat.isAdViewAd() && "ad_refresh_seconds".equals(str) && StringUtils.isValidString(str2)) {
            int i = Integer.parseInt(str2);
            if (i > TimeUnit.MINUTES.toSeconds(2L)) {
                y.i(this.tag, "Attempting to set extra parameter \"ad_refresh_seconds\" to over 2 minutes (" + i + "s) - this will be ignored");
            }
        }
        this.extraParameters.put(str, str2);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        if (str == null) {
            throw new IllegalArgumentException("No key specified");
        }
        if (obj instanceof Activity) {
            if (y.a()) {
                this.logger.e(this.tag, "Ignoring setting local extra parameter to Activity instance - please pass a WeakReference of it instead!");
            }
        } else {
            if ("amazon_ad_response".equals(str) || "amazon_ad_error".equals(str)) {
                setExtraParameter("is_amazon_integration", Boolean.toString(true));
            }
            this.localExtraParameters.put(str, obj);
        }
    }

    public String getAdUnitId() {
        return this.adUnitId;
    }

    void a(com.applovin.impl.mediation.a.a aVar) {
        l lVar = new l();
        lVar.a().a("MAX Ad").a(aVar).a();
        if (y.a()) {
            this.logger.b(this.tag, lVar.toString());
        }
    }

    public void logApiCall(String str) {
        if (y.a()) {
            this.logger.b(this.tag, str);
        }
    }

    public static void logApiCall(String str, String str2) {
        if (p.f1402a != null) {
            p.f1402a.L();
            if (y.a()) {
                p.f1402a.L().b(str, str2);
            }
        }
    }

    protected void destroy() {
        this.localExtraParameters.clear();
        this.adListener = null;
        this.revenueListener = null;
        this.requestListener = null;
        this.adReviewListener = null;
    }
}
