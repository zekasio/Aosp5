package com.tapjoy.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class o8 extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1875a;
    public Bitmap b;
    public Rect c;
    public Rect d;
    public Rect e;
    public Rect f;

    public o8(Context context) {
        super(context);
        this.f1875a = false;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = new Rect();
    }

    public final void a() {
        if (this.f1875a) {
            this.e = this.c;
        } else {
            this.e = this.d;
        }
    }

    public void b() {
        this.f1875a = !this.f1875a;
        a();
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.e == null || this.b == null) {
            return;
        }
        getDrawingRect(this.f);
        canvas.drawBitmap(this.b, this.e, this.f, (Paint) null);
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.b = bitmap;
        int width = bitmap.getWidth();
        int height = this.b.getHeight();
        int i = width / 2;
        this.d = new Rect(0, 0, i, height);
        this.c = new Rect(i, 0, width, height);
        a();
    }
}
