package com.tapjoy.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tapjoy.TJCorePlacement;
import com.tapjoy.internal.e7;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class t8 extends RelativeLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1915a;
    public float b;
    public View c;
    public View d;
    public FrameLayout e;
    public ImageView f;
    public o8 g;
    public v7 h;
    public a i;

    public interface a {
    }

    public t8(Context context, v7 v7Var, a aVar) {
        w7 w7Var;
        y7 y7Var;
        super(context);
        this.b = 1.0f;
        this.h = v7Var;
        this.i = aVar;
        Context context2 = getContext();
        View view = new View(context2);
        this.c = view;
        view.setId(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
        layoutParams.addRule(13);
        addView(this.c, layoutParams);
        this.d = new View(context2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(0, 0);
        layoutParams2.addRule(13);
        addView(this.d, layoutParams2);
        this.e = new FrameLayout(context2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(0, 0);
        layoutParams3.addRule(13);
        addView(this.e, layoutParams3);
        ImageView imageView = new ImageView(context2);
        this.f = imageView;
        imageView.setOnClickListener(this);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(0, 0);
        layoutParams4.addRule(7, this.c.getId());
        layoutParams4.addRule(6, this.c.getId());
        addView(this.f, layoutParams4);
        w7 w7Var2 = this.h.l;
        if (w7Var2 != null && w7Var2.f1937a != null && (w7Var2.b != null || w7Var2.c != null)) {
            o8 o8Var = new o8(context2);
            this.g = o8Var;
            o8Var.setOnClickListener(this);
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(0, 0);
            layoutParams5.addRule(5, this.d.getId());
            layoutParams5.addRule(8, this.d.getId());
            addView(this.g, layoutParams5);
        }
        this.f.setImageBitmap(v7Var.c.b);
        o8 o8Var2 = this.g;
        if (o8Var2 == null || (w7Var = v7Var.l) == null || (y7Var = w7Var.f1937a) == null) {
            return;
        }
        o8Var2.setImageBitmap(y7Var.b);
    }

    public final int a(int i) {
        return (int) (i * this.b);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        o8 o8Var;
        if (view == this.f) {
            e7.this.g.cancel();
            return;
        }
        if (view != null && view == (o8Var = this.g)) {
            o8Var.b();
            e7 e7Var = e7.this;
            e7Var.k = true ^ e7Var.k;
            return;
        }
        if (view.getTag() instanceof r7) {
            a aVar = this.i;
            r7 r7Var = (r7) view.getTag();
            e7.d dVar = (e7.d) aVar;
            e7 e7Var2 = e7.this;
            e7Var2.d.g.a(e7Var2.f.k, r7Var.b);
            g7.a(dVar.f1793a, r7Var.d);
            if (!TextUtils.isEmpty(r7Var.e)) {
                ((TJCorePlacement.f) e7.this.b).a(dVar.f1793a, r7Var.e, com.tapjoy.internal.a.a(r7Var.f));
                e7.this.f1806a = true;
            }
            dVar.b.a(e7.this.e, r7Var.g);
            if (r7Var.c) {
                e7.this.g.dismiss();
            }
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x015e  */
    @Override // android.widget.RelativeLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r8, int r9) {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.t8.onMeasure(int, int):void");
    }

    public void setLandscape(boolean z) {
        Bitmap bitmap;
        Bitmap bitmap2;
        ArrayList<r7> arrayList;
        this.f1915a = z;
        if (z) {
            v7 v7Var = this.h;
            bitmap = v7Var.b.b;
            bitmap2 = v7Var.f.b;
            arrayList = v7Var.j;
        } else {
            v7 v7Var2 = this.h;
            bitmap = v7Var2.f1932a.b;
            bitmap2 = v7Var2.e.b;
            arrayList = v7Var2.i;
        }
        com.tapjoy.internal.a.a(this.c, (Drawable) new BitmapDrawable((Resources) null, bitmap));
        com.tapjoy.internal.a.a(this.d, (Drawable) new BitmapDrawable((Resources) null, bitmap2));
        if (this.e.getChildCount() > 0) {
            this.e.removeAllViews();
        }
        Context context = getContext();
        for (r7 r7Var : arrayList) {
            View view = new View(context);
            view.setTag(r7Var);
            view.setOnClickListener(this);
            this.e.addView(view, new FrameLayout.LayoutParams(0, 0, 51));
        }
    }
}
