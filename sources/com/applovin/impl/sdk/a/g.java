package com.applovin.impl.sdk.a;

import android.text.TextUtils;
import android.webkit.WebView;
import com.applovin.impl.c.h;
import com.applovin.impl.c.m;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.y;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.adsession.media.InteractionType;
import com.iab.omid.library.applovin.adsession.media.MediaEvents;
import com.iab.omid.library.applovin.adsession.media.Position;
import com.iab.omid.library.applovin.adsession.media.VastProperties;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class g extends b {
    static final /* synthetic */ boolean h = true;
    private final com.applovin.impl.c.a i;
    private final AtomicBoolean j;
    private MediaEvents k;
    private final VastProperties l;
    private final AtomicBoolean m;
    private final AtomicBoolean n;
    private final AtomicBoolean o;
    private final AtomicBoolean p;

    public g(com.applovin.impl.c.a aVar) {
        super(aVar);
        this.j = new AtomicBoolean();
        this.m = new AtomicBoolean();
        this.n = new AtomicBoolean();
        this.o = new AtomicBoolean();
        this.p = new AtomicBoolean();
        this.i = aVar;
        float fI = aVar.i();
        if (aVar.i() == -1) {
            this.l = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
        } else {
            this.l = VastProperties.createVastPropertiesForSkippableMedia(fI, true, Position.STANDALONE);
        }
    }

    @Override // com.applovin.impl.sdk.a.b
    protected AdSessionContext a(WebView webView) {
        VerificationScriptResource verificationScriptResourceCreateVerificationScriptResourceWithoutParameters;
        if (!h && this.i.aY() == null) {
            throw new AssertionError();
        }
        ArrayList arrayList = new ArrayList();
        for (com.applovin.impl.c.b bVar : this.i.aY().a()) {
            List<h> listB = bVar.b();
            if (listB.isEmpty()) {
                m.a(bVar.d(), com.applovin.impl.c.f.FAILED_TO_LOAD_RESOURCE, this.b);
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (h hVar : listB) {
                    if ("omid".equalsIgnoreCase(hVar.a())) {
                        arrayList2.add(hVar);
                    }
                }
                if (arrayList2.isEmpty()) {
                    m.a(bVar.d(), com.applovin.impl.c.f.API_FRAMEWORK_OR_LANGUAGE_TYPE_NOT_SUPPORTED, this.b);
                } else {
                    ArrayList<URL> arrayList3 = new ArrayList();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        try {
                            arrayList3.add(new URL(((h) it.next()).b()));
                        } catch (Throwable th) {
                            y yVar = this.c;
                            if (y.a()) {
                                this.c.b(this.d, "Failed to parse JavaScript resource url", th);
                            }
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        m.a(bVar.d(), com.applovin.impl.c.f.FAILED_TO_LOAD_RESOURCE, this.b);
                    } else {
                        String strC = bVar.c();
                        String strA = bVar.a();
                        if (StringUtils.isValidString(strC) && !StringUtils.isValidString(strA)) {
                            m.a(bVar.d(), com.applovin.impl.c.f.FAILED_TO_LOAD_RESOURCE, this.b);
                        } else {
                            for (URL url : arrayList3) {
                                if (StringUtils.isValidString(strC)) {
                                    verificationScriptResourceCreateVerificationScriptResourceWithoutParameters = VerificationScriptResource.createVerificationScriptResourceWithParameters(strA, url, strC);
                                } else {
                                    verificationScriptResourceCreateVerificationScriptResourceWithoutParameters = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url);
                                }
                                arrayList.add(verificationScriptResourceCreateVerificationScriptResourceWithoutParameters);
                            }
                        }
                    }
                }
            }
        }
        String strE = this.b.ag().e();
        if (TextUtils.isEmpty(strE)) {
            y yVar2 = this.c;
            if (y.a()) {
                this.c.e(this.d, "JavaScript SDK content not loaded successfully");
            }
            return null;
        }
        try {
            return AdSessionContext.createNativeAdSessionContext(this.b.ag().d(), strE, arrayList, this.i.getOpenMeasurementContentUrl(), this.i.getOpenMeasurementCustomReferenceData());
        } catch (Throwable th2) {
            y yVar3 = this.c;
            if (!y.a()) {
                return null;
            }
            this.c.b(this.d, "Failed to create ad session context", th2);
            return null;
        }
    }

    @Override // com.applovin.impl.sdk.a.b
    protected AdSessionConfiguration a() {
        try {
            return AdSessionConfiguration.createAdSessionConfiguration(CreativeType.VIDEO, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NATIVE, false);
        } catch (Throwable th) {
            y yVar = this.c;
            if (y.a()) {
                this.c.b(this.d, "Failed to create ad session configuration", th);
            }
            return null;
        }
    }

    @Override // com.applovin.impl.sdk.a.b
    protected void a(AdSession adSession) {
        try {
            this.k = MediaEvents.createMediaEvents(adSession);
        } catch (Throwable th) {
            y yVar = this.c;
            if (y.a()) {
                this.c.b(this.d, "Failed to create media events", th);
            }
        }
    }

    @Override // com.applovin.impl.sdk.a.b
    public void c() {
        a("track loaded", new Runnable() { // from class: com.applovin.impl.sdk.a.g.1
            @Override // java.lang.Runnable
            public void run() {
                g.this.g.loaded(g.this.l);
            }
        });
    }

    public void a(final float f, final boolean z) {
        if (this.m.compareAndSet(false, true)) {
            a("track started", new Runnable() { // from class: com.applovin.impl.sdk.a.g.6
                @Override // java.lang.Runnable
                public void run() {
                    g.this.k.start(f, z ? 0.0f : 1.0f);
                }
            });
        }
    }

    public void f() {
        if (this.n.compareAndSet(false, true)) {
            a("track first quartile", new Runnable() { // from class: com.applovin.impl.sdk.a.g.7
                @Override // java.lang.Runnable
                public void run() {
                    g.this.k.firstQuartile();
                }
            });
        }
    }

    public void g() {
        if (this.o.compareAndSet(false, true)) {
            a("track midpoint", new Runnable() { // from class: com.applovin.impl.sdk.a.g.8
                @Override // java.lang.Runnable
                public void run() {
                    g.this.k.midpoint();
                }
            });
        }
    }

    public void h() {
        if (this.p.compareAndSet(false, true)) {
            a("track third quartile", new Runnable() { // from class: com.applovin.impl.sdk.a.g.9
                @Override // java.lang.Runnable
                public void run() {
                    g.this.k.thirdQuartile();
                }
            });
        }
    }

    public void i() {
        a("track completed", new Runnable() { // from class: com.applovin.impl.sdk.a.g.10
            @Override // java.lang.Runnable
            public void run() {
                g.this.k.complete();
            }
        });
    }

    public void j() {
        a("track paused", new Runnable() { // from class: com.applovin.impl.sdk.a.g.11
            @Override // java.lang.Runnable
            public void run() {
                g.this.k.pause();
            }
        });
    }

    public void k() {
        a("track resumed", new Runnable() { // from class: com.applovin.impl.sdk.a.g.12
            @Override // java.lang.Runnable
            public void run() {
                g.this.k.resume();
            }
        });
    }

    public void l() {
        if (this.j.compareAndSet(false, true)) {
            a("buffer started", new Runnable() { // from class: com.applovin.impl.sdk.a.g.13
                @Override // java.lang.Runnable
                public void run() {
                    g.this.k.bufferStart();
                }
            });
        }
    }

    public void m() {
        if (this.j.compareAndSet(true, false)) {
            a("buffer finished", new Runnable() { // from class: com.applovin.impl.sdk.a.g.2
                @Override // java.lang.Runnable
                public void run() {
                    g.this.k.bufferFinish();
                }
            });
        }
    }

    public void a(final boolean z) {
        a("track volume changed", new Runnable() { // from class: com.applovin.impl.sdk.a.g.3
            @Override // java.lang.Runnable
            public void run() {
                g.this.k.volumeChange(z ? 0.0f : 1.0f);
            }
        });
    }

    public void n() {
        a("track skipped", new Runnable() { // from class: com.applovin.impl.sdk.a.g.4
            @Override // java.lang.Runnable
            public void run() {
                g.this.k.skipped();
            }
        });
    }

    public void o() {
        a("track clicked", new Runnable() { // from class: com.applovin.impl.sdk.a.g.5
            @Override // java.lang.Runnable
            public void run() {
                g.this.k.adUserInteraction(InteractionType.CLICK);
            }
        });
    }
}
