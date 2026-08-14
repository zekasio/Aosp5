package com.applovin.impl.mediation.debugger.ui.testmode;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.applovin.impl.sdk.utils.g;
import com.applovin.mediation.MaxAdFormat;

/* JADX INFO: loaded from: classes.dex */
public class AdControlButton extends RelativeLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Button f1092a;
    private final com.applovin.impl.adview.a b;
    private b c;
    private MaxAdFormat d;
    private a e;

    public interface a {
        void onClick(AdControlButton adControlButton);
    }

    public enum b {
        LOAD,
        LOADING,
        SHOW
    }

    public AdControlButton(Context context) {
        this(context, null, 0);
    }

    public AdControlButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdControlButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Button button = new Button(getContext());
        this.f1092a = button;
        com.applovin.impl.adview.a aVar = new com.applovin.impl.adview.a(getContext(), 20, R.attr.progressBarStyleSmall);
        this.b = aVar;
        this.c = b.LOAD;
        setBackgroundColor(0);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1, 17));
        button.setTextColor(-1);
        button.setOnClickListener(this);
        frameLayout.addView(button, new FrameLayout.LayoutParams(-1, -1, 17));
        aVar.setColor(-1);
        addView(aVar, new FrameLayout.LayoutParams(-1, -1, 17));
        a(b.LOAD);
    }

    public b getControlState() {
        return this.c;
    }

    public void setControlState(b bVar) {
        if (this.c != bVar) {
            a(bVar);
        }
        this.c = bVar;
    }

    public MaxAdFormat getFormat() {
        return this.d;
    }

    public void setFormat(MaxAdFormat maxAdFormat) {
        this.d = maxAdFormat;
    }

    private void a(b bVar) {
        if (b.LOADING == bVar) {
            setEnabled(false);
            this.b.a();
        } else {
            setEnabled(true);
            this.b.b();
        }
        this.f1092a.setText(b(bVar));
        this.f1092a.setBackgroundColor(c(bVar));
    }

    private String b(b bVar) {
        if (b.LOAD == bVar) {
            return "Load";
        }
        if (b.LOADING == bVar) {
            return "";
        }
        return "Show";
    }

    private int c(b bVar) {
        if (b.LOAD == bVar) {
            return g.a(com.applovin.sdk.R.color.applovin_sdk_brand_color, getContext());
        }
        if (b.LOADING == bVar) {
            return g.a(com.applovin.sdk.R.color.applovin_sdk_brand_color, getContext());
        }
        return g.a(com.applovin.sdk.R.color.applovin_sdk_adControlbutton_brightBlueColor, getContext());
    }

    public void setOnClickListener(a aVar) {
        this.e = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.onClick(this);
        }
    }
}
