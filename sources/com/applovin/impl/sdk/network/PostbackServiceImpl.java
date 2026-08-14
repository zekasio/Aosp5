package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.EventServiceImpl;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.p;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinPostbackService;

/* JADX INFO: loaded from: classes.dex */
public class PostbackServiceImpl implements AppLovinPostbackService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f1366a;

    public PostbackServiceImpl(p pVar) {
        this.f1366a = pVar;
    }

    @Override // com.applovin.sdk.AppLovinPostbackService
    public void dispatchPostbackAsync(String str, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(l.b(this.f1366a).a(str).c(false).a(), appLovinPostbackListener);
    }

    public void dispatchPostbackRequest(l lVar, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(lVar, o.a.POSTBACKS, appLovinPostbackListener);
    }

    public void dispatchPostbackRequest(l lVar, o.a aVar, AppLovinPostbackListener appLovinPostbackListener) {
        com.applovin.impl.sdk.e.g gVar = new com.applovin.impl.sdk.e.g(lVar, aVar, this.f1366a, appLovinPostbackListener);
        gVar.a(a(lVar));
        this.f1366a.M().a(gVar, aVar);
    }

    private boolean a(l lVar) {
        String str = lVar.c().get("event");
        if ("postinstall".equals(str)) {
            str = lVar.c().get("sub_event");
        }
        return EventServiceImpl.ALLOW_PRE_INIT_EVENT_TYPES.contains(str);
    }

    public String toString() {
        return "PostbackService{}";
    }
}
