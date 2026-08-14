package com.applovin.impl.mediation.debugger.ui.d;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f1082a;
    public TextView b;
    public ImageView c;
    public ImageView d;
    private c e;
    private int f;

    public void a(int i) {
        this.f = i;
    }

    public int a() {
        return this.f;
    }

    public void a(c cVar) {
        this.e = cVar;
        this.f1082a.setText(cVar.k());
        this.f1082a.setTextColor(cVar.n());
        if (this.b != null) {
            if (!TextUtils.isEmpty(cVar.i_())) {
                this.b.setTypeface(null, 0);
                this.b.setVisibility(0);
                this.b.setText(cVar.i_());
                this.b.setTextColor(cVar.e());
                if (cVar.j_()) {
                    this.b.setTypeface(null, 1);
                }
            } else {
                this.b.setVisibility(8);
            }
        }
        if (this.c != null) {
            if (cVar.g() > 0) {
                this.c.setImageResource(cVar.g());
                this.c.setColorFilter(cVar.o());
                this.c.setVisibility(0);
            } else {
                this.c.setVisibility(8);
            }
        }
        if (this.d != null) {
            if (cVar.a() > 0) {
                this.d.setImageResource(cVar.a());
                this.d.setColorFilter(cVar.b());
                this.d.setVisibility(0);
                return;
            }
            this.d.setVisibility(8);
        }
    }

    public c b() {
        return this.e;
    }
}
