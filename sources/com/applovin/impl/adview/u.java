package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class u extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f844a;
    private boolean b;

    interface a {
        void a();

        void b();
    }

    public boolean b() {
        return this.b;
    }

    public u(o oVar, Context context) {
        super(context);
        this.f844a = oVar;
        setClickable(false);
        setFocusable(false);
    }

    public void a() {
        a(null);
    }

    public void a(a aVar) {
        if (this.b) {
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        Drawable drawableA = this.f844a.a();
        if (drawableA == null) {
            if (aVar != null) {
                aVar.b();
            }
        } else {
            setBackground(drawableA);
            this.b = true;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    public String getIdentifier() {
        return this.f844a.b();
    }
}
