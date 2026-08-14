package com.tapjoy.internal;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class p8 implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h8 f1886a;
    public final /* synthetic */ BitmapDrawable b;
    public final /* synthetic */ h8 c;
    public final /* synthetic */ BitmapDrawable d;

    public p8(r8 r8Var, h8 h8Var, BitmapDrawable bitmapDrawable, h8 h8Var2, BitmapDrawable bitmapDrawable2) {
        this.f1886a = h8Var;
        this.b = bitmapDrawable;
        this.c = h8Var2;
        this.d = bitmapDrawable2;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        h8 h8Var;
        if (motionEvent.getAction() == 0) {
            if (this.f1886a != null || this.b != null) {
                h8 h8Var2 = this.c;
                if (h8Var2 != null) {
                    h8Var2.d();
                    this.c.setVisibility(4);
                }
                a.a(view, (Drawable) null);
            }
            BitmapDrawable bitmapDrawable = this.b;
            if (bitmapDrawable != null) {
                a.a(view, (Drawable) bitmapDrawable);
            } else {
                h8 h8Var3 = this.f1886a;
                if (h8Var3 != null) {
                    h8Var3.setVisibility(0);
                    this.f1886a.b();
                }
            }
        } else {
            boolean z = true;
            if (motionEvent.getAction() == 1) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (x >= 0.0f && x < view.getWidth() && y >= 0.0f && y < view.getHeight()) {
                    z = false;
                }
                if (z) {
                    BitmapDrawable bitmapDrawable2 = this.d;
                    if (bitmapDrawable2 != null) {
                        a.a(view, (Drawable) bitmapDrawable2);
                    } else if (this.b != null) {
                        a.a(view, (Drawable) null);
                    }
                }
                h8 h8Var4 = this.f1886a;
                if (h8Var4 != null) {
                    h8Var4.d();
                    this.f1886a.setVisibility(4);
                }
                if ((this.f1886a != null || this.b != null) && (h8Var = this.c) != null && z) {
                    h8Var.setVisibility(0);
                    this.c.b();
                }
            }
        }
        return false;
    }
}
