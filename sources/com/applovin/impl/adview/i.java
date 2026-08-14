package com.applovin.impl.adview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected float f818a;
    protected final Context b;

    public abstract a getStyle();

    public enum a {
        WHITE_ON_BLACK(0),
        WHITE_ON_TRANSPARENT(1),
        INVISIBLE(2),
        TRANSPARENT_SKIP(3);

        private final int e;

        a(int i) {
            this.e = i;
        }

        public int a() {
            return this.e;
        }
    }

    protected i(Context context) {
        super(context);
        this.f818a = 1.0f;
        this.b = context;
    }

    public void setViewScale(float f) {
        this.f818a = f;
    }

    public float getSize() {
        return this.f818a * 30.0f;
    }

    public void a(int i) {
        setViewScale(i / 30.0f);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) getSize();
            layoutParams.height = (int) getSize();
        }
    }

    public static i a(a aVar, Context context) {
        if (aVar.equals(a.INVISIBLE)) {
            return new q(context);
        }
        if (aVar.equals(a.WHITE_ON_TRANSPARENT)) {
            return new r(context);
        }
        if (aVar.equals(a.TRANSPARENT_SKIP)) {
            return new s(context);
        }
        return new y(context);
    }
}
