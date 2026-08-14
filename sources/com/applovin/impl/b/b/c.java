package com.applovin.impl.b.b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.applovin.sdk.R;

/* JADX INFO: loaded from: classes.dex */
public class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Button f882a;
    private final Button b;
    private final ScrollView c;
    private final LinearLayout d;

    public Button getBackButton() {
        return this.f882a;
    }

    public Button getUnderstandAndConfirmButton() {
        return this.b;
    }

    public c(Context context, com.applovin.impl.b.a.h hVar) {
        super(context);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.applovin_consent_flow_gdpr_are_you_sure_screen, (ViewGroup) this, true);
        this.f882a = (Button) viewInflate.findViewById(R.id.back_button);
        this.b = (Button) viewInflate.findViewById(R.id.understand_and_confirm_button);
        this.c = (ScrollView) viewInflate.findViewById(R.id.scroll_view);
        this.d = (LinearLayout) viewInflate.findViewById(R.id.controls_view);
    }

    @Override // com.applovin.impl.b.b.d
    protected ViewGroup getControlsView() {
        return this.d;
    }

    @Override // com.applovin.impl.b.b.d
    protected ScrollView getScrollView() {
        return this.c;
    }
}
