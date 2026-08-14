package com.applovin.impl.sdk.utils;

import android.os.Bundle;
import com.applovin.adview.AppLovinAdView;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f1493a = new StringBuilder();

    public String toString() {
        return this.f1493a.toString();
    }

    public l a(String str, Object obj) {
        return a(str, obj, "");
    }

    public l a(String str, Object obj, String str2) {
        StringBuilder sb = this.f1493a;
        sb.append("\n");
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append(str2);
        return this;
    }

    public l a(String str) {
        StringBuilder sb = this.f1493a;
        sb.append("\n");
        sb.append(str);
        return this;
    }

    public l b(String str) {
        this.f1493a.append(str);
        return this;
    }

    public l a() {
        this.f1493a.append("\n========================================");
        return this;
    }

    public l a(com.applovin.impl.sdk.ad.e eVar) {
        boolean z = eVar instanceof com.applovin.impl.c.a;
        a("Format", eVar.getAdZone().b() != null ? eVar.getAdZone().b().getLabel() : null).a("Ad ID", Long.valueOf(eVar.getAdIdNumber())).a("Zone ID", eVar.getAdZone().a()).a("Source", eVar.getSource()).a("Ad Class", z ? "VastAd" : "AdServerAd");
        String dspName = eVar.getDspName();
        if (StringUtils.isValidString(dspName)) {
            a("DSP Name", dspName);
        }
        if (z) {
            a("VAST DSP", ((com.applovin.impl.c.a) eVar).n());
        }
        return this;
    }

    public l b(com.applovin.impl.sdk.ad.e eVar) {
        a("Target", eVar.p()).a("close_style", eVar.v()).a("close_delay_graphic", Long.valueOf(eVar.t()), "s");
        if (eVar instanceof com.applovin.impl.sdk.ad.a) {
            com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) eVar;
            a("HTML", aVar.b().substring(0, Math.min(aVar.b().length(), 64)));
        }
        if (eVar.hasVideoUrl()) {
            a("close_delay", Long.valueOf(eVar.r()), "s").a("skip_style", eVar.x()).a("Streaming", Boolean.valueOf(eVar.f())).a("Video Location", eVar.d()).a("video_button_properties", eVar.D());
        }
        return this;
    }

    public l a(com.applovin.impl.mediation.a.a aVar) {
        return a("Network", aVar.Y()).a("Adapter Version", aVar.j()).a("Format", aVar.getFormat().getLabel()).a("Ad Unit ID", aVar.getAdUnitId()).a("Placement", aVar.getPlacement()).a("Network Placement", aVar.s()).a("Serve ID", aVar.h()).a("Creative ID", StringUtils.isValidString(aVar.getCreativeId()) ? aVar.getCreativeId() : "None").a("Ad Review Creative ID", StringUtils.isValidString(aVar.getAdReviewCreativeId()) ? aVar.getAdReviewCreativeId() : "None").a("DSP Name", StringUtils.isValidString(aVar.getDspName()) ? aVar.getDspName() : "None").a("DSP ID", StringUtils.isValidString(aVar.getDspId()) ? aVar.getDspId() : "None").a("Server Parameters", aVar.ah());
    }

    public l a(AppLovinAdView appLovinAdView) {
        return a("Size", appLovinAdView.getSize().getWidth() + "x" + appLovinAdView.getSize().getHeight()).a("Alpha", Float.valueOf(appLovinAdView.getAlpha())).a("Visibility", r.b(appLovinAdView.getVisibility()));
    }

    public l a(com.applovin.impl.sdk.p pVar) {
        return a("Muted", Boolean.valueOf(pVar.C().isMuted()));
    }

    public l a(Bundle bundle) {
        if (bundle == null) {
            return this;
        }
        for (String str : bundle.keySet()) {
            a(str, bundle.get(str));
        }
        return this;
    }
}
