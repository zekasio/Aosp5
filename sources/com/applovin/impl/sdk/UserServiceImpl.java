package com.applovin.impl.sdk;

import android.app.Activity;
import com.applovin.sdk.AppLovinUserService;

/* JADX INFO: loaded from: classes.dex */
public class UserServiceImpl implements AppLovinUserService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f1189a;

    UserServiceImpl(p pVar) {
        this.f1189a = pVar;
    }

    @Override // com.applovin.sdk.AppLovinUserService
    public void preloadConsentDialog() {
        this.f1189a.T().c();
    }

    @Override // com.applovin.sdk.AppLovinUserService
    public void showConsentDialog(Activity activity, AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener) {
        this.f1189a.T().a(activity, onConsentDialogDismissListener);
    }

    public String toString() {
        return "UserService{}";
    }
}
