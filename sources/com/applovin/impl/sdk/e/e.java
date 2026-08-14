package com.applovin.impl.sdk.e;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.c.a;
import com.applovin.impl.c.i;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
class e extends c {
    private final com.applovin.impl.c.a b;

    public e(com.applovin.impl.c.a aVar, com.applovin.impl.sdk.p pVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheVastAd", aVar, pVar, appLovinAdLoadListener);
        this.b = aVar;
    }

    @Override // com.applovin.impl.sdk.e.c, java.lang.Runnable
    public void run() {
        super.run();
        boolean zF = this.b.f();
        com.applovin.impl.sdk.y yVar = this.h;
        if (com.applovin.impl.sdk.y.a()) {
            com.applovin.impl.sdk.y yVar2 = this.h;
            String str = this.g;
            StringBuilder sb = new StringBuilder("Begin caching for VAST ");
            sb.append(zF ? "streaming " : "");
            sb.append("ad #");
            sb.append(this.f1284a.getAdIdNumber());
            sb.append("...");
            yVar2.b(str, sb.toString());
        }
        c();
        m();
        if (zF) {
            if (this.b.m()) {
                i();
            }
            if (this.b.l() == a.b.COMPANION_AD) {
                j();
                l();
            } else {
                k();
            }
            if (!this.b.m()) {
                i();
            }
            if (this.b.l() == a.b.COMPANION_AD) {
                k();
            } else {
                j();
                l();
            }
        } else {
            j();
            k();
            l();
            i();
        }
        com.applovin.impl.sdk.y yVar3 = this.h;
        if (com.applovin.impl.sdk.y.a()) {
            this.h.b(this.g, "Finished caching VAST ad #" + this.b.getAdIdNumber());
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.b.getCreatedAtMillis();
        com.applovin.impl.sdk.d.d.a(this.b, this.f);
        com.applovin.impl.sdk.d.d.a(jCurrentTimeMillis, this.b, this.f);
        a(this.b);
        this.b.b();
        a();
    }

    private void j() {
        if (b()) {
            return;
        }
        if (this.b.aW()) {
            com.applovin.impl.c.d dVarAQ = this.b.aQ();
            if (dVarAQ != null) {
                com.applovin.impl.c.i iVarB = dVarAQ.b();
                if (iVarB != null) {
                    Uri uriB = iVarB.b();
                    String string = uriB != null ? uriB.toString() : "";
                    String strC = iVarB.c();
                    if (URLUtil.isValidUrl(string) || StringUtils.isValidString(strC)) {
                        if (iVarB.a() == i.a.STATIC) {
                            com.applovin.impl.sdk.y yVar = this.h;
                            if (com.applovin.impl.sdk.y.a()) {
                                this.h.b(this.g, "Caching static companion ad at " + string + "...");
                            }
                            Uri uriB2 = b(string, Collections.emptyList(), false);
                            if (uriB2 != null) {
                                iVarB.a(uriB2);
                                this.b.a(true);
                                return;
                            } else {
                                com.applovin.impl.sdk.y yVar2 = this.h;
                                if (com.applovin.impl.sdk.y.a()) {
                                    this.h.e(this.g, "Failed to cache static companion ad");
                                    return;
                                }
                                return;
                            }
                        }
                        if (iVarB.a() == i.a.HTML) {
                            if (StringUtils.isValidString(string)) {
                                com.applovin.impl.sdk.y yVar3 = this.h;
                                if (com.applovin.impl.sdk.y.a()) {
                                    this.h.b(this.g, "Begin caching HTML companion ad. Fetching from " + string + "...");
                                }
                                String strC2 = c(string);
                                if (StringUtils.isValidString(strC2)) {
                                    com.applovin.impl.sdk.y yVar4 = this.h;
                                    if (com.applovin.impl.sdk.y.a()) {
                                        this.h.b(this.g, "HTML fetched. Caching HTML now...");
                                    }
                                    iVarB.a(a(strC2, Collections.emptyList(), this.b));
                                    this.b.a(true);
                                    return;
                                }
                                com.applovin.impl.sdk.y yVar5 = this.h;
                                if (com.applovin.impl.sdk.y.a()) {
                                    this.h.e(this.g, "Unable to load companion ad resources from " + string);
                                    return;
                                }
                                return;
                            }
                            com.applovin.impl.sdk.y yVar6 = this.h;
                            if (com.applovin.impl.sdk.y.a()) {
                                this.h.b(this.g, "Caching provided HTML for companion ad. No fetch required. HTML: " + strC);
                            }
                            iVarB.a(a(strC, Collections.emptyList(), this.b));
                            this.b.a(true);
                            return;
                        }
                        if (iVarB.a() == i.a.IFRAME) {
                            com.applovin.impl.sdk.y yVar7 = this.h;
                            if (com.applovin.impl.sdk.y.a()) {
                                this.h.b(this.g, "Skip caching of iFrame resource...");
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    com.applovin.impl.sdk.y yVar8 = this.h;
                    if (com.applovin.impl.sdk.y.a()) {
                        this.h.d(this.g, "Companion ad does not have any resources attached. Skipping...");
                        return;
                    }
                    return;
                }
                com.applovin.impl.sdk.y yVar9 = this.h;
                if (com.applovin.impl.sdk.y.a()) {
                    this.h.e(this.g, "Failed to retrieve non-video resources from companion ad. Skipping...");
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.y yVar10 = this.h;
            if (com.applovin.impl.sdk.y.a()) {
                this.h.b(this.g, "No companion ad provided. Skipping...");
                return;
            }
            return;
        }
        com.applovin.impl.sdk.y yVar11 = this.h;
        if (com.applovin.impl.sdk.y.a()) {
            this.h.b(this.g, "Companion ad caching disabled. Skipping...");
        }
    }

    private void k() {
        com.applovin.impl.c.o oVarAP;
        Uri uriB;
        if (b()) {
            return;
        }
        if (this.b.aX()) {
            if (this.b.aO() == null || (oVarAP = this.b.aP()) == null || (uriB = oVarAP.b()) == null) {
                return;
            }
            Uri uriA = a(uriB.toString(), Collections.emptyList(), false);
            if (uriA != null) {
                com.applovin.impl.sdk.y yVar = this.h;
                if (com.applovin.impl.sdk.y.a()) {
                    this.h.b(this.g, "Video file successfully cached into: " + uriA);
                }
                oVarAP.a(uriA);
                return;
            }
            com.applovin.impl.sdk.y yVar2 = this.h;
            if (com.applovin.impl.sdk.y.a()) {
                this.h.e(this.g, "Failed to cache video file: " + oVarAP);
                return;
            }
            return;
        }
        com.applovin.impl.sdk.y yVar3 = this.h;
        if (com.applovin.impl.sdk.y.a()) {
            this.h.b(this.g, "Video caching disabled. Skipping...");
        }
    }

    private void l() {
        String strAU;
        if (b()) {
            return;
        }
        if (this.b.aV() != null) {
            com.applovin.impl.sdk.y yVar = this.h;
            if (com.applovin.impl.sdk.y.a()) {
                this.h.b(this.g, "Begin caching HTML template. Fetching from " + this.b.aV() + "...");
            }
            strAU = c(this.b.aV().toString(), this.b.I(), this.b.shouldUrlEncodeResourcePath());
        } else {
            strAU = this.b.aU();
        }
        if (StringUtils.isValidString(strAU)) {
            String strA = a(strAU, this.b.I(), this.f1284a);
            if (this.b.q() && this.b.isOpenMeasurementEnabled()) {
                strA = this.f.ag().a(strA);
            }
            this.b.a(strA);
            com.applovin.impl.sdk.y yVar2 = this.h;
            if (com.applovin.impl.sdk.y.a()) {
                this.h.b(this.g, "Finish caching HTML template " + this.b.aU() + " for ad #" + this.b.getAdIdNumber());
                return;
            }
            return;
        }
        com.applovin.impl.sdk.y yVar3 = this.h;
        if (com.applovin.impl.sdk.y.a()) {
            this.h.b(this.g, "Unable to load HTML template");
        }
    }

    private void m() {
        com.applovin.impl.sdk.y yVar = this.h;
        if (com.applovin.impl.sdk.y.a()) {
            this.h.b(this.g, "Caching play & pause images...");
        }
        Uri uriA = a(this.f1284a.aC(), "play");
        if (uriA != null) {
            this.f1284a.c(uriA);
        }
        Uri uriA2 = a(this.f1284a.aD(), "pause");
        if (uriA2 != null) {
            this.f1284a.d(uriA2);
        }
        com.applovin.impl.sdk.y yVar2 = this.h;
        if (com.applovin.impl.sdk.y.a()) {
            this.h.b(this.g, "Ad updated with playImageFilename = " + this.f1284a.aC() + ", pauseImageFilename = " + this.f1284a.aD());
        }
    }

    @Override // com.applovin.impl.sdk.e.c
    void i() {
        this.b.o().c();
        super.i();
    }

    @Override // com.applovin.impl.sdk.e.c
    void h() {
        this.b.o().e();
        super.h();
    }
}
