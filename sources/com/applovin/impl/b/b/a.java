package com.applovin.impl.b.b;

import android.app.Activity;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.applovin.impl.sdk.p;
import com.applovin.sdk.R;

/* JADX INFO: loaded from: classes.dex */
public class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Button f880a;
    private final LinearLayout b;
    private final FrameLayout c;

    @Override // com.applovin.impl.b.b.d
    protected ScrollView getScrollView() {
        return null;
    }

    public Button getBackButton() {
        return this.f880a;
    }

    public LinearLayout getContentView() {
        return this.b;
    }

    public a(Activity activity, com.applovin.impl.b.a.h hVar, p pVar) {
        super(activity);
        View viewInflate = LayoutInflater.from(activity).inflate(R.layout.applovin_consent_flow_gdpr_phase_partners_screen, (ViewGroup) this, true);
        ((TextView) viewInflate.findViewById(R.id.title_textview)).setText(activity.getString(R.string.applovin_gdpr_advertising_partners_screen_title));
        ((TextView) viewInflate.findViewById(R.id.message_textview)).setText(activity.getString(R.string.applovin_gdpr_advertising_partners_screen_message));
        TextView textView = (TextView) viewInflate.findViewById(R.id.partner_links_textview);
        textView.setText(hVar.g());
        SpannableString spannableString = (SpannableString) textView.getText();
        for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new h(uRLSpan.getURL(), activity, pVar), spanStart, spanEnd, 33);
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.f880a = (Button) viewInflate.findViewById(R.id.back_button);
        this.b = (LinearLayout) viewInflate.findViewById(R.id.partners_content_view);
        this.c = (FrameLayout) viewInflate.findViewById(R.id.controls_view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.b.b.d
    public FrameLayout getControlsView() {
        return this.c;
    }

    @Override // com.applovin.impl.b.b.d
    protected void a() {
        super.a();
        ((FrameLayout.LayoutParams) this.b.getLayoutParams()).bottomMargin = getResources().getDimensionPixelSize(R.dimen.applovin_sdk_consentFlowGdprControlsViewHeight);
    }
}
