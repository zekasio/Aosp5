package com.applovin.exoplayer2.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import com.applovin.exoplayer2.i.a;
import com.applovin.exoplayer2.ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class b extends View implements SubtitleView.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<i> f685a;
    private List<com.applovin.exoplayer2.i.a> b;
    private int c;
    private float d;
    private c e;
    private float f;

    public b(Context context) {
        this(context, null);
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f685a = new ArrayList();
        this.b = Collections.emptyList();
        this.c = 0;
        this.d = 0.0533f;
        this.e = c.f686a;
        this.f = 0.08f;
    }

    @Override // com.applovin.exoplayer2.ui.SubtitleView.a
    public void a(List<com.applovin.exoplayer2.i.a> list, c cVar, float f, int i, float f2) {
        this.b = list;
        this.e = cVar;
        this.d = f;
        this.c = i;
        this.f = f2;
        while (this.f685a.size() < list.size()) {
            this.f685a.add(new i(getContext()));
        }
        invalidate();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List<com.applovin.exoplayer2.i.a> list = this.b;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i = paddingBottom - paddingTop;
        float fA = j.a(this.c, this.d, height, i);
        if (fA <= 0.0f) {
            return;
        }
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            com.applovin.exoplayer2.i.a aVarA = list.get(i2);
            if (aVarA.q != Integer.MIN_VALUE) {
                aVarA = a(aVarA);
            }
            com.applovin.exoplayer2.i.a aVar = aVarA;
            int i3 = paddingBottom;
            this.f685a.get(i2).a(aVar, this.e, fA, j.a(aVar.o, aVar.p, height, i), this.f, canvas, paddingLeft, paddingTop, width, i3);
            i2++;
            size = size;
            i = i;
            paddingBottom = i3;
            width = width;
        }
    }

    private static com.applovin.exoplayer2.i.a a(com.applovin.exoplayer2.i.a aVar) {
        a.C0033a c0033aA = aVar.a().a(-3.4028235E38f).b(Integer.MIN_VALUE).a((Layout.Alignment) null);
        if (aVar.g == 0) {
            c0033aA.a(1.0f - aVar.f, 0);
        } else {
            c0033aA.a((-aVar.f) - 1.0f, 1);
        }
        int i = aVar.h;
        if (i == 0) {
            c0033aA.a(2);
        } else if (i == 2) {
            c0033aA.a(0);
        }
        return c0033aA.e();
    }
}
