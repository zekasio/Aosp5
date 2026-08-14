package com.applovin.impl.b.a;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.applovin.impl.b.a.c;
import com.applovin.impl.b.a.d;
import com.applovin.impl.b.a.f;
import com.applovin.impl.b.b.e;
import com.applovin.impl.sdk.AppLovinCFErrorImpl;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinCFService;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.applovin.sdk.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f870a;
    private final int b;
    private List<d> c;
    private boolean d;
    private AppLovinCFService.OnCFCompletionCallback e;
    private d f;
    private Dialog g;
    private final com.applovin.impl.sdk.utils.a h = new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.b.a.i.1
        @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Bundle bundleA;
            super.onActivityResumed(activity);
            if ((activity instanceof AppLovinWebViewActivity) || i.this.f == null) {
                return;
            }
            if (i.this.g != null) {
                bundleA = i.this.g instanceof com.applovin.impl.b.b.e ? ((com.applovin.impl.b.b.e) i.this.g).a() : null;
                i.this.g.dismiss();
                i.this.g = null;
            } else {
                bundleA = null;
            }
            d dVar = i.this.f;
            i.this.f = null;
            i.this.a(dVar, bundleA, activity);
        }
    };

    public i(p pVar) {
        this.f870a = pVar;
        this.b = ((Integer) pVar.a(com.applovin.impl.sdk.c.b.gc)).intValue();
    }

    public void a(List<d> list, boolean z, Activity activity, AppLovinCFService.OnCFCompletionCallback onCFCompletionCallback) {
        if (this.c != null) {
            this.f870a.L();
            if (y.a()) {
                this.f870a.L().b("AppLovinSdk", "Unable to start states: " + list);
            }
            this.f870a.L();
            if (y.a()) {
                this.f870a.L().b("AppLovinSdk", "Consent flow already in progress for states: " + this.c);
            }
            onCFCompletionCallback.onFlowCompleted(new AppLovinCFErrorImpl(-200, "Consent flow is already in progress."));
            return;
        }
        this.c = list;
        this.d = z;
        this.e = onCFCompletionCallback;
        this.f870a.G().trackEvent("cf_start");
        p.a(activity).a(this.h);
        if (!z && d()) {
            this.f870a.a((com.applovin.impl.sdk.c.d<boolean>) com.applovin.impl.sdk.c.d.t, true);
        }
        a(c(), activity);
    }

    public boolean a() {
        return this.c != null;
    }

    public void a(boolean z) {
        if (this.f870a.ae().c() == c.a.TERMS) {
            return;
        }
        com.applovin.impl.b.a.b(z, p.y());
    }

    public void b(boolean z) {
        if (this.f870a.ae().c() == c.a.TERMS) {
            return;
        }
        com.applovin.impl.b.a.a(z, p.y());
    }

    public void b() {
        this.f870a.L();
        if (y.a()) {
            this.f870a.L().b("AppLovinSdk", "Reinitializing SDK and ending consent flow");
        }
        this.c = null;
        this.f870a.w().b(this.h);
        AppLovinCFService.OnCFCompletionCallback onCFCompletionCallback = this.e;
        if (onCFCompletionCallback != null) {
            onCFCompletionCallback.onFlowCompleted(null);
            this.e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(d dVar, Activity activity) {
        a(dVar, (Bundle) null, activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final d dVar, final Bundle bundle, final Activity activity) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.b.a.i.2
            @Override // java.lang.Runnable
            public void run() {
                SpannableString spannableString;
                i.this.f870a.L();
                if (y.a()) {
                    i.this.f870a.L().b("AppLovinSdk", "Transitioning to state: " + dVar);
                }
                if (dVar.b() == d.a.ALERT) {
                    if (com.applovin.impl.sdk.utils.b.a(activity)) {
                        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.b.a.i.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                i.this.a(dVar, i.this.f870a.x());
                            }
                        }, TimeUnit.SECONDS.toMillis(1L));
                        return;
                    }
                    e eVar = (e) dVar;
                    i.this.f = eVar;
                    AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                    builder.setCancelable(false);
                    for (final f fVar : eVar.g()) {
                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.applovin.impl.b.a.i.2.2
                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i) {
                                i.this.f = null;
                                i.this.g = null;
                                d dVarA = i.this.a(fVar.c());
                                if (dVarA == null) {
                                    i.this.f870a.L();
                                    if (y.a()) {
                                        i.this.f870a.L().e("AppLovinSdk", "Consent flow failed to get destination state for TOS/PP alert. Finishing flow...");
                                    }
                                    i.this.b();
                                    return;
                                }
                                if ("12".equals(dVarA.a())) {
                                    i.this.f870a.a((com.applovin.impl.sdk.c.d<boolean>) com.applovin.impl.sdk.c.d.t, false);
                                }
                                i.this.a(dVarA, activity);
                                if (dVarA.b() != d.a.ALERT) {
                                    dialogInterface.dismiss();
                                }
                            }
                        };
                        if (fVar.b() == f.a.POSITIVE) {
                            builder.setPositiveButton(fVar.a(), onClickListener);
                        } else if (fVar.b() == f.a.NEGATIVE) {
                            builder.setNegativeButton(fVar.a(), onClickListener);
                        } else {
                            builder.setNeutralButton(fVar.a(), onClickListener);
                        }
                    }
                    String strE = eVar.e();
                    if (StringUtils.isValidString(strE)) {
                        spannableString = new SpannableString(strE);
                        String strA = p.a(R.string.applovin_terms_of_service_text);
                        String strA2 = p.a(R.string.applovin_privacy_policy_text);
                        if (StringUtils.containsAtLeastOneSubstring(strE, Arrays.asList(strA, strA2))) {
                            final Uri uriE = i.this.f870a.ae().e();
                            if (uriE != null) {
                                StringUtils.addLinks(spannableString, Pattern.compile(strA), new ClickableSpan() { // from class: com.applovin.impl.b.a.i.2.3
                                    @Override // android.text.style.ClickableSpan
                                    public void onClick(View view) {
                                        Utils.showWebViewActivity(uriE, activity, i.this.f870a);
                                    }
                                }, true);
                            }
                            final Uri uriD = i.this.f870a.ae().d();
                            StringUtils.addLinks(spannableString, Pattern.compile(strA2), new ClickableSpan() { // from class: com.applovin.impl.b.a.i.2.4
                                @Override // android.text.style.ClickableSpan
                                public void onClick(View view) {
                                    Utils.showWebViewActivity(uriD, activity, i.this.f870a);
                                }
                            }, true);
                        }
                    } else {
                        spannableString = null;
                    }
                    final AlertDialog alertDialogCreate = builder.setTitle(spannableString).setMessage(eVar.f()).create();
                    alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.applovin.impl.b.a.i.2.5
                        @Override // android.content.DialogInterface.OnShowListener
                        public void onShow(DialogInterface dialogInterface) {
                            TextView textView = (TextView) alertDialogCreate.findViewById(alertDialogCreate.getContext().getResources().getIdentifier("android:id/alertTitle", null, null));
                            textView.setLinkTextColor(textView.getCurrentTextColor());
                            textView.setMovementMethod(LinkMovementMethod.getInstance());
                            textView.setMaxLines(i.this.b);
                        }
                    });
                    i.this.g = alertDialogCreate;
                    alertDialogCreate.show();
                    return;
                }
                if (dVar.b() == d.a.GDPR_ALERT) {
                    if (com.applovin.impl.sdk.utils.b.a(activity)) {
                        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.b.a.i.2.6
                            @Override // java.lang.Runnable
                            public void run() {
                                i.this.a(dVar, i.this.f870a.x());
                            }
                        }, TimeUnit.SECONDS.toMillis(1L));
                        return;
                    }
                    com.applovin.impl.b.b.e eVar2 = new com.applovin.impl.b.b.e(activity, bundle, (h) dVar, i.this.f870a, new e.a() { // from class: com.applovin.impl.b.a.i.2.7
                        @Override // com.applovin.impl.b.b.e.a
                        public void a(boolean z, boolean z2) {
                            i.this.f870a.a(com.applovin.impl.sdk.c.d.v, Boolean.valueOf(z));
                            i.this.f870a.a(com.applovin.impl.sdk.c.d.w, Boolean.valueOf(z2));
                            i.this.f870a.a((com.applovin.impl.sdk.c.d<boolean>) com.applovin.impl.sdk.c.d.x, true);
                            d dVarA = i.this.a(dVar.d());
                            if (dVarA == null) {
                                i.this.f870a.L();
                                if (y.a()) {
                                    i.this.f870a.L().e("AppLovinSdk", "Consent flow failed to get destination state for GDPR alert. Finishing flow...");
                                }
                                i.this.b();
                                return;
                            }
                            if ("13".equals(dVarA.a())) {
                                i.this.f870a.a((com.applovin.impl.sdk.c.d<boolean>) com.applovin.impl.sdk.c.d.t, false);
                                Map<String, String> map = CollectionUtils.map(3);
                                map.put("paa", String.valueOf(z));
                                map.put("apa", String.valueOf(z2));
                                map.put("ppa", String.valueOf(true));
                                ((g) dVarA).a(map);
                            }
                            i.this.a(z && z2);
                            i.this.b(false);
                            i.this.f = null;
                            i.this.g = null;
                            i.this.a(dVarA, activity);
                        }
                    });
                    i.this.f = dVar;
                    i.this.g = eVar2;
                    eVar2.show();
                    return;
                }
                if (dVar.b() == d.a.EVENT) {
                    g gVar = (g) dVar;
                    String strE2 = gVar.e();
                    Map<String, String> mapF = gVar.f();
                    if (mapF == null) {
                        mapF = CollectionUtils.map(1);
                    }
                    mapF.put("flow_type", i.this.f870a.ae().c().a());
                    i.this.f870a.G().trackEvent(strE2, mapF);
                    i.this.b(gVar, activity);
                    return;
                }
                if (dVar.b() == d.a.TERMS_OF_SERVICE) {
                    Utils.showWebViewActivity(i.this.f870a.ae().e(), activity, i.this.f870a);
                    return;
                }
                if (dVar.b() == d.a.PRIVACY_POLICY) {
                    Utils.showWebViewActivity(i.this.f870a.ae().d(), activity, i.this.f870a);
                    return;
                }
                if (dVar.b() == d.a.HAS_USER_CONSENT) {
                    i.this.a(true);
                    i.this.b(dVar, activity);
                } else {
                    if (dVar.b() != d.a.REINIT) {
                        i.this.f870a.L();
                        if (y.a()) {
                            i.this.f870a.L().e("AppLovinSdk", "No destination consent flow state found!");
                            return;
                        }
                        return;
                    }
                    i.this.b();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(d dVar, Activity activity) {
        a(a(dVar.d()), activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public d a(String str) {
        List<d> list = this.c;
        if (list == null) {
            return null;
        }
        for (d dVar : list) {
            if (str.equalsIgnoreCase(dVar.a())) {
                return dVar;
            }
        }
        return null;
    }

    private d c() {
        for (d dVar : this.c) {
            if (dVar.c()) {
                return dVar;
            }
        }
        return null;
    }

    private boolean d() {
        Iterator<d> it = this.c.iterator();
        while (it.hasNext()) {
            d.a aVarB = it.next().b();
            if (aVarB == d.a.ALERT || aVarB == d.a.GDPR_ALERT) {
                return true;
            }
        }
        return false;
    }
}
