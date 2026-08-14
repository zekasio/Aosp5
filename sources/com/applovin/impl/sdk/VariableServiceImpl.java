package com.applovin.impl.sdk;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.impl.sdk.e.m;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinVariableService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class VariableServiceImpl implements AppLovinVariableService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f1190a;
    private AppLovinVariableService.OnVariablesUpdateListener d;
    private Bundle e;
    private final AtomicBoolean b = new AtomicBoolean();
    private final AtomicBoolean c = new AtomicBoolean();
    private final Object f = new Object();

    VariableServiceImpl(p pVar) {
        this.f1190a = pVar;
        String str = (String) pVar.a(com.applovin.impl.sdk.c.d.m);
        if (StringUtils.isValidString(str)) {
            updateVariables(JsonUtils.deserialize(str));
        }
    }

    @Override // com.applovin.sdk.AppLovinVariableService
    @Deprecated
    public void setOnVariablesUpdateListener(AppLovinVariableService.OnVariablesUpdateListener onVariablesUpdateListener) {
        this.d = onVariablesUpdateListener;
        synchronized (this.f) {
            if (onVariablesUpdateListener != null) {
                if (this.e != null && this.c.compareAndSet(false, true)) {
                    this.f1190a.L();
                    if (y.a()) {
                        this.f1190a.L().b("AppLovinVariableService", "Setting initial listener");
                    }
                    a();
                }
            }
        }
    }

    @Override // com.applovin.sdk.AppLovinVariableService
    @Deprecated
    public void loadVariables() {
        if (this.f1190a.d()) {
            if (this.b.compareAndSet(false, true)) {
                this.f1190a.M().a(new com.applovin.impl.sdk.e.m(this.f1190a, new m.a() { // from class: com.applovin.impl.sdk.VariableServiceImpl.1
                    @Override // com.applovin.impl.sdk.e.m.a
                    public void a() {
                        VariableServiceImpl.this.b.set(false);
                    }
                }), o.a.BACKGROUND);
                return;
            } else {
                y.i("AppLovinVariableService", "Ignored explicit variables load. Service is already in the process of retrieving the latest set of variables.");
                return;
            }
        }
        y.i("AppLovinVariableService", "The AppLovin SDK is waiting for the initial variables to be returned upon completing initialization.");
    }

    @Override // com.applovin.sdk.AppLovinVariableService
    public boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    @Override // com.applovin.sdk.AppLovinVariableService
    public boolean getBoolean(String str, boolean z) {
        return ((Boolean) a(str, Boolean.valueOf(z), Boolean.class)).booleanValue();
    }

    @Override // com.applovin.sdk.AppLovinVariableService
    public String getString(String str) {
        return getString(str, null);
    }

    @Override // com.applovin.sdk.AppLovinVariableService
    public String getString(String str, String str2) {
        return (String) a(str, str2, String.class);
    }

    private Object a(String str, Object obj, Class<?> cls) {
        if (TextUtils.isEmpty(str)) {
            y.i("AppLovinVariableService", "Unable to retrieve variable value for empty name");
            return obj;
        }
        if (!this.f1190a.d()) {
            y.h("AppLovinSdk", "Attempted to retrieve variable before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        synchronized (this.f) {
            if (this.e == null) {
                y.i("AppLovinVariableService", "Unable to retrieve variable value for name \"" + str + "\". No variables returned by the server.");
                return obj;
            }
            if (cls.equals(String.class)) {
                return this.e.getString(str, (String) obj);
            }
            if (cls.equals(Boolean.class)) {
                return Boolean.valueOf(this.e.getBoolean(str, ((Boolean) obj).booleanValue()));
            }
            throw new IllegalStateException("Unable to retrieve variable value for " + str);
        }
    }

    public void updateVariables(JSONObject jSONObject) {
        this.f1190a.L();
        if (y.a()) {
            this.f1190a.L().b("AppLovinVariableService", "Updating variables: " + jSONObject + "...");
        }
        synchronized (this.f) {
            this.e = JsonUtils.toBundle(jSONObject);
            a();
            this.f1190a.a(com.applovin.impl.sdk.c.d.m, jSONObject.toString());
        }
    }

    private void a() {
        Bundle bundle;
        synchronized (this.f) {
            if (this.d != null && (bundle = this.e) != null) {
                final Bundle bundle2 = (Bundle) bundle.clone();
                AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.sdk.VariableServiceImpl.2
                    @Override // java.lang.Runnable
                    public void run() {
                        VariableServiceImpl.this.d.onVariablesUpdate(bundle2);
                    }
                });
            }
        }
    }

    public String toString() {
        return "VariableService{variables=" + this.e + ", listener=" + this.d + '}';
    }
}
