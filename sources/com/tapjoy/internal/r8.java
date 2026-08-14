package com.tapjoy.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class r8 extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q7 f1900a;
    public a b;
    public r c;
    public int d;
    public int e;
    public b8 f;
    public ArrayList<WeakReference<h8>> g;
    public ArrayList<WeakReference<h8>> h;

    public interface a {
    }

    public r8(Context context, q7 q7Var, a aVar) {
        super(context);
        this.c = r.UNSPECIFIED;
        this.d = 0;
        this.e = 0;
        this.f = null;
        this.g = null;
        this.h = null;
        this.f1900a = q7Var;
        this.b = aVar;
    }

    public final void a() {
        h8 h8Var;
        h8 h8Var2;
        Iterator<b8> it = this.f1900a.f1890a.iterator();
        b8 b8Var = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            b8 next = it.next();
            r rVar = next.f1763a;
            if (rVar == this.c) {
                b8Var = next;
                break;
            } else if (rVar == r.UNSPECIFIED) {
                b8Var = next;
            }
        }
        removeAllViews();
        ArrayList<WeakReference<h8>> arrayList = this.g;
        if (arrayList != null) {
            Iterator<WeakReference<h8>> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                h8 h8Var3 = it2.next().get();
                if (h8Var3 != null) {
                    h8Var3.a();
                }
            }
            this.g.clear();
        }
        ArrayList<WeakReference<h8>> arrayList2 = this.h;
        if (arrayList2 != null) {
            Iterator<WeakReference<h8>> it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                h8 h8Var4 = it3.next().get();
                if (h8Var4 != null) {
                    h8Var4.a();
                }
            }
            this.h.clear();
        }
        if (b8Var != null) {
            this.f = b8Var;
            Context context = getContext();
            for (a8 a8Var : b8Var.c) {
                RelativeLayout relativeLayout = new RelativeLayout(context);
                if (a8Var.k.c != null) {
                    h8 h8Var5 = new h8(context);
                    h8Var5.setScaleType(ImageView.ScaleType.FIT_XY);
                    h8Var5.a(a8Var.k.a(), a8Var.k.c);
                    if (this.g == null) {
                        this.g = new ArrayList<>();
                    }
                    this.g.add(new WeakReference<>(h8Var5));
                    h8Var = h8Var5;
                } else {
                    h8Var = null;
                }
                y7 y7Var = a8Var.l;
                if (y7Var == null || y7Var.c == null) {
                    h8Var2 = null;
                } else {
                    h8 h8Var6 = new h8(context);
                    h8Var6.setScaleType(ImageView.ScaleType.FIT_XY);
                    h8Var6.a(a8Var.l.a(), a8Var.l.c);
                    if (this.h == null) {
                        this.h = new ArrayList<>();
                    }
                    this.h.add(new WeakReference<>(h8Var6));
                    h8Var2 = h8Var6;
                }
                ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                Bitmap bitmap = a8Var.k.b;
                y7 y7Var2 = a8Var.l;
                Bitmap bitmap2 = y7Var2 != null ? y7Var2.b : null;
                BitmapDrawable bitmapDrawable = bitmap != null ? new BitmapDrawable((Resources) null, bitmap) : null;
                BitmapDrawable bitmapDrawable2 = bitmap2 != null ? new BitmapDrawable((Resources) null, bitmap2) : null;
                if (bitmapDrawable != null) {
                    com.tapjoy.internal.a.a((View) relativeLayout, (Drawable) bitmapDrawable);
                }
                if (h8Var != null) {
                    relativeLayout.addView(h8Var, layoutParams2);
                    h8Var.b();
                }
                if (h8Var2 != null) {
                    relativeLayout.addView(h8Var2, layoutParams2);
                    h8Var2.setVisibility(4);
                }
                h8 h8Var7 = h8Var2;
                h8 h8Var8 = h8Var;
                relativeLayout.setOnTouchListener(new p8(this, h8Var7, bitmapDrawable2, h8Var8, bitmapDrawable));
                relativeLayout.setOnClickListener(new q8(this, h8Var7, relativeLayout, h8Var8, a8Var));
                relativeLayout.setTag(a8Var);
                addView(relativeLayout, layoutParams);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u6.a(u6.this);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    @Override // android.widget.RelativeLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.r8.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            ArrayList<WeakReference<h8>> arrayList = this.g;
            if (arrayList != null) {
                Iterator<WeakReference<h8>> it = arrayList.iterator();
                while (it.hasNext()) {
                    h8 h8Var = it.next().get();
                    if (h8Var != null) {
                        h8Var.d();
                    }
                }
            }
            ArrayList<WeakReference<h8>> arrayList2 = this.h;
            if (arrayList2 != null) {
                Iterator<WeakReference<h8>> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    h8 h8Var2 = it2.next().get();
                    if (h8Var2 != null) {
                        h8Var2.d();
                    }
                }
                return;
            }
            return;
        }
        ArrayList<WeakReference<h8>> arrayList3 = this.h;
        if (arrayList3 != null) {
            Iterator<WeakReference<h8>> it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                h8 h8Var3 = it3.next().get();
                if (h8Var3 != null) {
                    h8Var3.setVisibility(4);
                    h8Var3.d();
                }
            }
        }
        ArrayList<WeakReference<h8>> arrayList4 = this.g;
        if (arrayList4 != null) {
            Iterator<WeakReference<h8>> it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                h8 h8Var4 = it4.next().get();
                if (h8Var4 != null) {
                    h8Var4.setVisibility(0);
                    h8Var4.b();
                }
            }
        }
    }
}
