package com.applovin.impl.sdk;

import android.app.Activity;
import com.applovin.sdk.AppLovinCFError;
import com.applovin.sdk.AppLovinCFService;
import com.applovin.sdk.AppLovinSdkConfiguration;

/* JADX INFO: loaded from: classes.dex */
class i implements AppLovinCFService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p f1334a;

    public i(p pVar) {
        this.f1334a = pVar;
    }

    @Override // com.applovin.sdk.AppLovinCFService
    public void scf(Activity activity, final AppLovinCFService.OnCFCompletionCallback onCFCompletionCallback) {
        if (this.f1334a.ax().getConsentDialogState() != AppLovinSdkConfiguration.ConsentDialogState.APPLIES) {
            onCFCompletionCallback.onFlowCompleted(new AppLovinCFErrorImpl(-300, "Re-showing a consent flow is only allowed in GDPR region."));
        } else {
            this.f1334a.ae().a(true);
            this.f1334a.ae().a(activity, new AppLovinCFService.OnCFCompletionCallback() { // from class: com.applovin.impl.sdk.i.1
                @Override // com.applovin.sdk.AppLovinCFService.OnCFCompletionCallback
                public void onFlowCompleted(AppLovinCFError appLovinCFError) {
                    onCFCompletionCallback.onFlowCompleted(appLovinCFError);
                }
            });
        }
    }

    @Override // com.applovin.sdk.AppLovinCFService
    public AppLovinCFService.CFType getCFType() {
        String str = (String) this.f1334a.a(com.applovin.impl.sdk.c.b.fY);
        if ("applies".equalsIgnoreCase(str)) {
            return AppLovinCFService.CFType.DETAILED;
        }
        if ("does_not_apply".equalsIgnoreCase(str)) {
            return AppLovinCFService.CFType.STANDARD;
        }
        return AppLovinCFService.CFType.UNKNOWN;
    }
}
