package com.applovin.impl.b.b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.applovin.sdk.R;

/* JADX INFO: loaded from: classes.dex */
public class f extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Button f896a;
    private final ScrollView b;
    private final FrameLayout c;

    public Button getBackButton() {
        return this.f896a;
    }

    public f(Context context, com.applovin.impl.b.a.h hVar) {
        super(context);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.applovin_consent_flow_gdpr_phase_learn_more_screen, (ViewGroup) this, true);
        ((TextView) viewInflate.findViewById(R.id.title_textview)).setText(hVar.f());
        this.f896a = (Button) viewInflate.findViewById(R.id.back_button);
        this.b = (ScrollView) viewInflate.findViewById(R.id.scroll_view);
        this.c = (FrameLayout) viewInflate.findViewById(R.id.controls_view);
    }

    @Override // com.applovin.impl.b.b.d
    protected ViewGroup getControlsView() {
        return this.c;
    }

    @Override // com.applovin.impl.b.b.d
    protected ScrollView getScrollView() {
        return this.b;
    }
}
