package com.applovin.impl.adview;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.applovin.impl.adview.i;

/* JADX INFO: loaded from: classes.dex */
public class m extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private i f831a;
    private int b;

    public m(i.a aVar, Activity activity) {
        super(activity);
        setBackgroundColor(0);
        i iVarA = i.a(aVar, activity);
        this.f831a = iVarA;
        addView(iVarA);
    }

    public void a(i.a aVar) {
        if (aVar == null || aVar == this.f831a.getStyle()) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f831a.getLayoutParams();
        removeView(this.f831a);
        i iVarA = i.a(aVar, getContext());
        this.f831a = iVarA;
        addView(iVarA);
        this.f831a.setLayoutParams(layoutParams);
        this.f831a.a(this.b);
    }

    public void a(int i, int i2, int i3, int i4) {
        this.b = i;
        int i5 = i2 + i + i3;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i5;
            layoutParams.width = i5;
        } else {
            setLayoutParams(new FrameLayout.LayoutParams(i5, i5));
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, i, i4);
        layoutParams2.setMargins(i3, i3, i3, 0);
        this.f831a.setLayoutParams(layoutParams2);
        this.f831a.a(i);
    }
}
