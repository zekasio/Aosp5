package com.applovin.impl.b.b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Switch;
import android.widget.TextView;
import com.applovin.sdk.R;

/* JADX INFO: loaded from: classes.dex */
public class g extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f897a;
    private final TextView b;
    private final TextView c;
    private final Switch d;
    private final Switch e;
    private final Switch f;
    private final Button g;
    private final Button h;
    private final ScrollView i;
    private final LinearLayout j;

    public TextView getPersonalizedAdvertisingSwitchTextView() {
        return this.f897a;
    }

    public TextView getAnalyticsPurposesSwitchTextView() {
        return this.b;
    }

    public TextView getPrivacyPolicySwitchTextView() {
        return this.c;
    }

    public Switch getPersonalizedAdvertisingSwitch() {
        return this.d;
    }

    public Switch getAnalyticsPurposesSwitch() {
        return this.e;
    }

    public Switch getPrivacyPolicySwitch() {
        return this.f;
    }

    public Button getContinueButton() {
        return this.g;
    }

    public Button getLearnMoreButton() {
        return this.h;
    }

    public g(Context context, com.applovin.impl.b.a.h hVar) {
        super(context);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.applovin_consent_flow_gdpr_phase_main_screen, (ViewGroup) this, true);
        ((TextView) viewInflate.findViewById(R.id.title_textview)).setText(hVar.e());
        this.f897a = (TextView) viewInflate.findViewById(R.id.personalized_advertising_switch_textview);
        this.b = (TextView) viewInflate.findViewById(R.id.analytics_purposes_switch_textview);
        this.c = (TextView) viewInflate.findViewById(R.id.privacy_policy_switch_textview);
        this.d = (Switch) viewInflate.findViewById(R.id.personalized_advertising_switch);
        this.e = (Switch) viewInflate.findViewById(R.id.analytics_purposes_switch);
        this.f = (Switch) viewInflate.findViewById(R.id.privacy_policy_switch);
        this.g = (Button) viewInflate.findViewById(R.id.continue_button);
        this.h = (Button) viewInflate.findViewById(R.id.learn_more_button);
        this.i = (ScrollView) viewInflate.findViewById(R.id.scroll_view);
        this.j = (LinearLayout) viewInflate.findViewById(R.id.controls_view);
    }

    @Override // com.applovin.impl.b.b.d
    protected ViewGroup getControlsView() {
        return this.j;
    }

    @Override // com.applovin.impl.b.b.d
    protected ScrollView getScrollView() {
        return this.i;
    }
}
