package com.applovin.impl.b.b;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class e extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RelativeLayout f883a;
    private final g b;
    private final c c;
    private final com.applovin.impl.b.b.a d;
    private final b e;
    private final f f;
    private int g;

    public interface a {
        void a(boolean z, boolean z2);
    }

    public e(final Activity activity, Bundle bundle, com.applovin.impl.b.a.h hVar, final p pVar, final a aVar) {
        super(activity, R.style.Theme.Black.NoTitleBar.Fullscreen);
        getWindow().setLayout(-1, -1);
        getWindow().setBackgroundDrawable(new ColorDrawable(getContext().getResources().getColor(R.color.transparent)));
        requestWindowFeature(1);
        setCancelable(false);
        g gVar = new g(getContext(), hVar);
        this.b = gVar;
        gVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        gVar.getPrivacyPolicySwitch().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.applovin.impl.b.b.e.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                e.this.b.getContinueButton().setEnabled(z);
            }
        });
        gVar.getContinueButton().setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.b.b.e.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                boolean zIsChecked = e.this.b.getPersonalizedAdvertisingSwitch().isChecked();
                boolean zIsChecked2 = e.this.b.getAnalyticsPurposesSwitch().isChecked();
                if (!zIsChecked || !zIsChecked2) {
                    e eVar = e.this;
                    eVar.a(eVar.c, 4);
                } else {
                    e.this.dismiss();
                    aVar.a(zIsChecked, zIsChecked2);
                }
            }
        });
        gVar.getLearnMoreButton().setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.b.b.e.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                e eVar = e.this;
                eVar.a(eVar.f, 1);
            }
        });
        String string = getContext().getString(com.applovin.sdk.R.string.applovin_gdpr_main_screen_personalized_advertising_purposes_switch_text);
        SpannableString spannableString = new SpannableString(string);
        StringUtils.addLinks(spannableString, Pattern.compile(string), new ClickableSpan() { // from class: com.applovin.impl.b.b.e.7
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                e eVar = e.this;
                eVar.a(eVar.d, 2);
            }
        }, true);
        gVar.getPersonalizedAdvertisingSwitchTextView().setText(spannableString);
        gVar.getPersonalizedAdvertisingSwitchTextView().setMovementMethod(LinkMovementMethod.getInstance());
        String string2 = getContext().getString(com.applovin.sdk.R.string.applovin_gdpr_main_screen_analytics_purposes_switch_text);
        SpannableString spannableString2 = new SpannableString(string2);
        StringUtils.addLinks(spannableString2, Pattern.compile(string2), new ClickableSpan() { // from class: com.applovin.impl.b.b.e.8
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                e eVar = e.this;
                eVar.a(eVar.e, 3);
            }
        }, true);
        gVar.getAnalyticsPurposesSwitchTextView().setText(spannableString2);
        gVar.getAnalyticsPurposesSwitchTextView().setMovementMethod(LinkMovementMethod.getInstance());
        SpannableString spannableString3 = new SpannableString(getContext().getString(com.applovin.sdk.R.string.applovin_gdpr_main_screen_privacy_policy_switch_text));
        StringUtils.addLinks(spannableString3, Pattern.compile(getContext().getString(com.applovin.sdk.R.string.applovin_privacy_policy_text)), new ClickableSpan() { // from class: com.applovin.impl.b.b.e.9
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                Utils.showWebViewActivity(pVar.ae().d(), activity, pVar);
            }
        }, true);
        gVar.getPrivacyPolicySwitchTextView().setText(spannableString3);
        gVar.getPrivacyPolicySwitchTextView().setMovementMethod(LinkMovementMethod.getInstance());
        gVar.getPersonalizedAdvertisingSwitch().setChecked(((Boolean) pVar.b((com.applovin.impl.sdk.c.d<boolean>) com.applovin.impl.sdk.c.d.v, true)).booleanValue());
        gVar.getAnalyticsPurposesSwitch().setChecked(((Boolean) pVar.b((com.applovin.impl.sdk.c.d<boolean>) com.applovin.impl.sdk.c.d.w, true)).booleanValue());
        gVar.getPrivacyPolicySwitch().setChecked(((Boolean) pVar.b((com.applovin.impl.sdk.c.d<boolean>) com.applovin.impl.sdk.c.d.x, true)).booleanValue());
        c cVar = new c(getContext(), hVar);
        this.c = cVar;
        cVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        cVar.getBackButton().setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.b.b.e.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                e eVar = e.this;
                eVar.a(eVar.c);
            }
        });
        cVar.getUnderstandAndConfirmButton().setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.b.b.e.11
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                boolean zIsChecked = e.this.b.getPersonalizedAdvertisingSwitch().isChecked();
                boolean zIsChecked2 = e.this.b.getAnalyticsPurposesSwitch().isChecked();
                e.this.dismiss();
                aVar.a(zIsChecked, zIsChecked2);
            }
        });
        com.applovin.impl.b.b.a aVar2 = new com.applovin.impl.b.b.a(activity, hVar, pVar);
        this.d = aVar2;
        aVar2.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        aVar2.getBackButton().setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.b.b.e.12
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                e eVar = e.this;
                eVar.a(eVar.d);
            }
        });
        b bVar = new b(activity, hVar, pVar);
        this.e = bVar;
        bVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        bVar.getBackButton().setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.b.b.e.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                e eVar = e.this;
                eVar.a(eVar.e);
            }
        });
        f fVar = new f(getContext(), hVar);
        this.f = fVar;
        fVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        fVar.getBackButton().setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.b.b.e.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                e eVar = e.this;
                eVar.a(eVar.f);
            }
        });
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        gVar.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        this.f883a = relativeLayout;
        relativeLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        relativeLayout.setBackgroundColor(getContext().getResources().getColor(R.color.transparent));
        relativeLayout.addView(gVar);
        this.g = 0;
        a(bundle);
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("current_showing_view_id", this.g);
        bundle.putBoolean("advertising_partners_switch_state", this.b.getPersonalizedAdvertisingSwitch().isChecked());
        bundle.putBoolean("analytics_partners_switch_state", this.b.getAnalyticsPurposesSwitch().isChecked());
        bundle.putBoolean("privacy_policy_switch_state", this.b.getPrivacyPolicySwitch().isChecked());
        return bundle;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().getDecorView().getRootView().addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.applovin.impl.b.b.e.4
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (i == i5 && i3 == i7 && i4 == i8 && i2 == i6) {
                    return;
                }
                e.this.b();
            }
        });
        b();
        setContentView(this.f883a);
    }

    private void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int i = bundle.getInt("current_showing_view_id");
        if (i != 0) {
            a(a(i), i);
        }
        this.b.getPersonalizedAdvertisingSwitch().setChecked(bundle.getBoolean("advertising_partners_switch_state"));
        this.b.getAnalyticsPurposesSwitch().setChecked(bundle.getBoolean("analytics_partners_switch_state"));
        this.b.getPrivacyPolicySwitch().setChecked(bundle.getBoolean("privacy_policy_switch_state"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        double d;
        Point pointA = com.applovin.impl.sdk.utils.h.a(getContext());
        boolean z = AppLovinSdkUtils.getOrientation(getContext()) == 1;
        double d2 = 0.2d;
        if (!AppLovinSdkUtils.isTablet(getContext())) {
            d = 0.05d;
            if (z) {
                d2 = 0.05d;
            }
        } else if (z) {
            d2 = 0.1d;
            d = 0.1d;
        } else {
            d = 0.075d;
        }
        double d3 = pointA.x;
        Double.isNaN(d3);
        int i = (int) (d3 * d2);
        double d4 = pointA.y;
        Double.isNaN(d4);
        int i2 = (int) (d4 * d);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f883a.getLayoutParams();
        layoutParams.setMargins(i, i2, i, i2);
        this.f883a.setLayoutParams(layoutParams);
        this.b.a();
        this.c.a();
        this.f.a();
        this.d.a();
        this.e.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view) {
        this.f883a.removeView(view);
        this.g = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, int i) {
        if (view.getParent() != null) {
            view.bringToFront();
        } else {
            this.f883a.addView(view);
            this.g = i;
        }
    }

    private View a(int i) {
        if (i == 0) {
            return this.b;
        }
        if (i == 1) {
            return this.f;
        }
        if (i == 2) {
            return this.d;
        }
        if (i == 3) {
            return this.e;
        }
        return this.c;
    }
}
