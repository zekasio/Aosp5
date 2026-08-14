package com.applovin.impl.b.a;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.b.a.c;
import com.applovin.impl.sdk.AppLovinCFErrorImpl;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinCFError;
import com.applovin.sdk.AppLovinCFService;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b implements AppLovinCommunicatorPublisher, AppLovinCommunicatorSubscriber {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f849a;
    private final i b;
    private List<d> c;
    private boolean d;

    public b(p pVar) {
        this.f849a = pVar;
        this.b = new i(pVar);
    }

    public c a() {
        return (c) this.f849a.C().getTermsFlowSettings();
    }

    public boolean b() {
        Map<String, String> extraParameters = this.f849a.C().getExtraParameters();
        return extraParameters.containsKey("consent_flow_enabled") ? Boolean.parseBoolean(extraParameters.get("consent_flow_enabled")) && (c() == c.a.TERMS || this.f849a.h()) : a().isEnabled() && (c() == c.a.TERMS || this.f849a.h());
    }

    public c.a c() {
        return a().a();
    }

    public Uri d() {
        return a().getPrivacyPolicyUri();
    }

    public Uri e() {
        return a().getTermsOfServiceUri();
    }

    public List<Uri> f() {
        List<Uri> listB = a().b();
        if (a().c()) {
            listB.addAll(a(com.applovin.impl.sdk.c.b.gd));
        }
        return listB;
    }

    public List<Uri> g() {
        List<Uri> listD = a().d();
        if (a().e()) {
            listD.addAll(a(com.applovin.impl.sdk.c.b.ge));
        }
        return listD;
    }

    private static c.a c(JSONObject jSONObject) {
        return jSONObject.has("consent_flow_settings") ? c.a.UNIFIED : c.a.TERMS;
    }

    private List<Uri> a(com.applovin.impl.sdk.c.b<String> bVar) {
        List<String> listB = this.f849a.b(bVar);
        ArrayList arrayList = new ArrayList(listB.size());
        Iterator<String> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(Uri.parse(it.next()));
        }
        return arrayList;
    }

    public static c a(Context context) {
        String rawResourceString = Utils.getRawResourceString(context.getResources().getIdentifier("applovin_settings", "raw", context.getPackageName()), context, null);
        JSONObject jSONObjectJsonObjectFromJsonString = StringUtils.isValidString(rawResourceString) ? JsonUtils.jsonObjectFromJsonString(rawResourceString, new JSONObject()) : new JSONObject();
        if (c(jSONObjectJsonObjectFromJsonString) == c.a.UNIFIED) {
            return b(JsonUtils.getJSONObject(jSONObjectJsonObjectFromJsonString, "consent_flow_settings", new JSONObject()));
        }
        return a(JsonUtils.getJSONObject(jSONObjectJsonObjectFromJsonString, "terms_flow_settings", new JSONObject()));
    }

    public static c a(JSONObject jSONObject) {
        Boolean bool = JsonUtils.getBoolean(jSONObject, "terms_flow_enabled", false);
        String string = JsonUtils.getString(jSONObject, "terms_flow_terms_of_service", null);
        Uri uri = StringUtils.isValidString(string) ? Uri.parse(string) : null;
        String string2 = JsonUtils.getString(jSONObject, "terms_flow_privacy_policy", null);
        return new c(bool.booleanValue(), StringUtils.isValidString(string2) ? Uri.parse(string2) : null, uri);
    }

    public static c b(JSONObject jSONObject) {
        Boolean bool = JsonUtils.getBoolean(jSONObject, "consent_flow_enabled", false);
        String string = JsonUtils.getString(jSONObject, "consent_flow_terms_of_service", null);
        Uri uri = StringUtils.isValidString(string) ? Uri.parse(string) : null;
        String string2 = JsonUtils.getString(jSONObject, "consent_flow_privacy_policy", null);
        Uri uri2 = StringUtils.isValidString(string2) ? Uri.parse(string2) : null;
        List<Uri> listA = a(jSONObject, "consent_flow_advertising_partners");
        Boolean bool2 = JsonUtils.getBoolean(jSONObject, "consent_flow_should_include_default_advertising_partners", true);
        return new c(bool.booleanValue(), c.a.UNIFIED, uri2, uri, listA, bool2.booleanValue(), a(jSONObject, "consent_flow_analytics_partners"), JsonUtils.getBoolean(jSONObject, "consent_flow_should_include_default_analytics_partners", true).booleanValue());
    }

    private static List<Uri> a(JSONObject jSONObject, String str) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, str, new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray, i, null);
            if (objectAtIndex instanceof String) {
                arrayList.add(Uri.parse((String) objectAtIndex));
            } else {
                y.h("AppLovinSdk", "URIs need to be of type string");
            }
        }
        return arrayList;
    }

    public void a(Activity activity, AppLovinCFService.OnCFCompletionCallback onCFCompletionCallback) {
        List<d> list = this.c;
        if (list != null && list.size() > 0 && b()) {
            a(activity, new AnonymousClass1(activity, onCFCompletionCallback));
        } else {
            onCFCompletionCallback.onFlowCompleted(new AppLovinCFErrorImpl(-100, "Failed to start consent flow. Please make sure that the consent flow is enabled."));
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.b.a.b$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f850a;
        final /* synthetic */ AppLovinCFService.OnCFCompletionCallback b;

        AnonymousClass1(Activity activity, AppLovinCFService.OnCFCompletionCallback onCFCompletionCallback) {
            this.f850a = activity;
            this.b = onCFCompletionCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            final Runnable runnable = new Runnable() { // from class: com.applovin.impl.b.a.b.1.1
                @Override // java.lang.Runnable
                public void run() {
                    b.this.b.a(b.this.c, b.this.d, AnonymousClass1.this.f850a, new AppLovinCFService.OnCFCompletionCallback() { // from class: com.applovin.impl.b.a.b.1.1.1
                        @Override // com.applovin.sdk.AppLovinCFService.OnCFCompletionCallback
                        public void onFlowCompleted(AppLovinCFError appLovinCFError) {
                            if (appLovinCFError == null) {
                                b.this.c = null;
                                b.this.d = false;
                            }
                            AnonymousClass1.this.b.onFlowCompleted(appLovinCFError);
                        }
                    });
                }
            };
            if (b.this.c() != c.a.TERMS) {
                b.this.b(this.f850a, new Runnable() { // from class: com.applovin.impl.b.a.b.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        b.this.c(AnonymousClass1.this.f850a, runnable);
                    }
                });
            } else {
                runnable.run();
            }
        }
    }

    private void a(final Activity activity, Runnable runnable) {
        if (a().getPrivacyPolicyUri() == null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.b.a.b.2
                @Override // java.lang.Runnable
                public void run() {
                    final Uri uriK = b.this.k();
                    new AlertDialog.Builder(activity).setTitle("Missing Privacy Policy URL").setMessage("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL").setNeutralButton("Go To Documentation", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.b.a.b.2.2
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            p unused = b.this.f849a;
                            Utils.openUri(p.y(), uriK, b.this.f849a);
                            throw new IllegalStateException("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL Please refer to " + uriK.toString());
                        }
                    }).setNegativeButton("DISMISS", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.b.a.b.2.1
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            throw new IllegalStateException("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL Please refer to " + uriK.toString());
                        }
                    }).create().show();
                }
            });
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final Activity activity, Runnable runnable) {
        if (f().isEmpty()) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.b.a.b.3
                @Override // java.lang.Runnable
                public void run() {
                    final Uri uriK = b.this.k();
                    new AlertDialog.Builder(activity).setTitle("Missing Advertising Partner URLs").setMessage("You cannot use the AppLovin SDK's consent flow without adding a list of advertising partner URLs").setNeutralButton("Go To Documentation", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.b.a.b.3.2
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            p unused = b.this.f849a;
                            Utils.openUri(p.y(), uriK, b.this.f849a);
                            throw new IllegalStateException("You cannot use the AppLovin SDK's consent flow without adding a list of advertising partner URLs Please refer to " + uriK.toString());
                        }
                    }).setNegativeButton("DISMISS", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.b.a.b.3.1
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            throw new IllegalStateException("You cannot use the AppLovin SDK's consent flow without adding a list of advertising partner URLs Please refer to " + uriK.toString());
                        }
                    }).create().show();
                }
            });
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final Activity activity, Runnable runnable) {
        if (g().isEmpty()) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.b.a.b.4
                @Override // java.lang.Runnable
                public void run() {
                    final Uri uriK = b.this.k();
                    new AlertDialog.Builder(activity).setTitle("Missing Analytics Partner URLs").setMessage("You cannot use the AppLovin SDK's consent flow without adding a list of analytics partner URLs").setNeutralButton("Go To Documentation", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.b.a.b.4.2
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            p unused = b.this.f849a;
                            Utils.openUri(p.y(), uriK, b.this.f849a);
                            throw new IllegalStateException("You cannot use the AppLovin SDK's consent flow without adding a list of analytics partner URLs Please refer to " + uriK.toString());
                        }
                    }).setNegativeButton("DISMISS", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.b.a.b.4.1
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            throw new IllegalStateException("You cannot use the AppLovin SDK's consent flow without adding a list of analytics partner URLs Please refer to " + uriK.toString());
                        }
                    }).create().show();
                }
            });
        } else {
            runnable.run();
        }
    }

    public boolean h() {
        p pVar = p.f1402a;
        if (!pVar.f()) {
            return false;
        }
        b bVarAe = pVar.ae();
        List<d> list = bVarAe.c;
        return bVarAe.b.a() || (list != null && list.size() > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Uri k() {
        return Uri.parse((String) this.f849a.a(this.f849a.g() ? com.applovin.impl.sdk.c.b.gb : com.applovin.impl.sdk.c.b.ga));
    }

    public void a(boolean z) {
        if (!this.f849a.e() && b()) {
            if (a().a() == c.a.UNIFIED) {
                this.f849a.L();
                if (y.a()) {
                    this.f849a.L().b("AppLovinSdk", "Generating Unified Consent Flow...");
                }
                this.c = a.a(this.f849a, z);
                this.d = z;
                this.f849a.a((com.applovin.impl.sdk.c.d<boolean>) com.applovin.impl.sdk.c.d.s, false);
            } else {
                this.f849a.L();
                if (y.a()) {
                    this.f849a.L().b("AppLovinSdk", "Generating Terms Flow...");
                }
                this.c = a.a(this.f849a);
            }
        }
        if (Utils.isTestApp(p.y())) {
            AppLovinCommunicator.getInstance(p.y()).subscribe(this, "start_sdk_consent_flow");
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        Uri uriE = e();
        if (appLovinCommunicatorMessage.getMessageData().getBoolean("gdpr_flow")) {
            this.c = j.c(this.f849a);
            this.d = true;
        } else if (uriE != null && appLovinCommunicatorMessage.getMessageData().getBoolean("include_tos")) {
            this.c = j.b(this.f849a);
        } else {
            this.c = j.a(this.f849a);
        }
        if (this.c.size() == 0) {
            Utils.showAlert("No Consent Flow Available", (String) null, this.f849a.x());
        } else {
            a(this.f849a.x(), new AppLovinCFService.OnCFCompletionCallback() { // from class: com.applovin.impl.b.a.b.5
                @Override // com.applovin.sdk.AppLovinCFService.OnCFCompletionCallback
                public void onFlowCompleted(AppLovinCFError appLovinCFError) {
                    AppLovinCommunicatorMessage appLovinCommunicatorMessage2 = new AppLovinCommunicatorMessage(new Bundle(), "sdk_consent_flow_finished", b.this);
                    p unused = b.this.f849a;
                    AppLovinCommunicator.getInstance(p.y()).getMessagingService().publish(appLovinCommunicatorMessage2);
                }
            });
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "consent_flow_manager";
    }

    public JSONObject i() {
        c cVarA = a();
        Uri privacyPolicyUri = cVarA.getPrivacyPolicyUri();
        Uri termsOfServiceUri = cVarA.getTermsOfServiceUri();
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "enabled", String.valueOf(b()));
        String string = "";
        JsonUtils.putString(jSONObject, "privacy_policy_url", privacyPolicyUri != null ? privacyPolicyUri.toString() : "");
        if (termsOfServiceUri != null) {
            string = termsOfServiceUri.toString();
        }
        JsonUtils.putString(jSONObject, "terms_of_service_url", string);
        return jSONObject;
    }

    public String j() {
        a();
        Object objD = d();
        Object objE = e();
        StringBuilder sb = new StringBuilder("\nConsent Flow Enabled - ");
        sb.append(b());
        sb.append("\nPrivacy Policy - ");
        if (objD == null) {
            objD = AdError.UNDEFINED_DOMAIN;
        }
        sb.append(objD);
        sb.append("\nTerms of Service - ");
        if (objE == null) {
            objE = AdError.UNDEFINED_DOMAIN;
        }
        sb.append(objE);
        return sb.toString();
    }
}
