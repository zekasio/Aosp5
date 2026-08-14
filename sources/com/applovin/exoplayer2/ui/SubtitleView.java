package com.applovin.exoplayer2.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import com.applovin.exoplayer2.ab;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.ak;
import com.applovin.exoplayer2.am;
import com.applovin.exoplayer2.an;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.h.ad;
import com.applovin.exoplayer2.i.a;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.m.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SubtitleView extends FrameLayout implements an.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<com.applovin.exoplayer2.i.a> f683a;
    private c b;
    private int c;
    private float d;
    private float e;
    private boolean f;
    private boolean g;
    private int h;
    private a i;
    private View j;

    interface a {
        void a(List<com.applovin.exoplayer2.i.a> list, c cVar, float f, int i, float f2);
    }

    @Override // com.applovin.exoplayer2.an.d
    public /* synthetic */ void a() {
        an.d.CC.$default$a(this);
    }

    @Override // com.applovin.exoplayer2.an.d
    public /* synthetic */ void a(float f) {
        an.d.CC.$default$a(this, f);
    }

    @Override // com.applovin.exoplayer2.an.d
    public /* synthetic */ void a(int i, int i2) {
        an.d.CC.$default$a(this, i, i2);
    }

    @Override // com.applovin.exoplayer2.an.d
    public /* synthetic */ void a(int i, boolean z) {
        an.d.CC.$default$a(this, i, z);
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public /* synthetic */ void a(ab abVar, int i) {
        an.d.CC.$default$a(this, abVar, i);
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public /* synthetic */ void a(ac acVar) {
        an.d.CC.$default$a(this, acVar);
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public /* synthetic */ void a(ak akVar) {
        an.d.CC.$default$a(this, akVar);
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public /* synthetic */ void a(am amVar) {
        an.d.CC.$default$a(this, amVar);
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public /* synthetic */ void a(an.a aVar) {
        an.d.CC.$default$a(this, aVar);
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public /* synthetic */ void a(an.e eVar, an.e eVar2, int i) {
        an.d.CC.$default$a(this, eVar, eVar2, i);
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public /* synthetic */ void a(an anVar, an.c cVar) {
        an.d.CC.$default$a(this, anVar, cVar);
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public /* synthetic */ void a(ba baVar, int i) {
        an.d.CC.$default$a(this, baVar, i);
    }

    @Override // com.applovin.exoplayer2.an.d
    public /* synthetic */ void a(com.applovin.exoplayer2.g.a aVar) {
        an.d.CC.$default$a(this, aVar);
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public /* synthetic */ void a(ad adVar, com.applovin.exoplayer2.j.h hVar) {
        an.d.CC.$default$a(this, adVar, hVar);
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.m.n
    public /* synthetic */ void a(o oVar) {
        an.d.CC.$default$a(this, oVar);
    }

    @Override // com.applovin.exoplayer2.an.d
    public /* synthetic */ void a(com.applovin.exoplayer2.o oVar) {
        an.d.CC.$default$a(this, oVar);
    }

    @Override // com.applovin.exoplayer2.an.b
    public /* synthetic */ void a(boolean z, int i) {
        an.b.CC.$default$a(this, z, i);
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.b.g
    public /* synthetic */ void a_(boolean z) {
        an.d.CC.$default$a_(this, z);
    }

    @Override // com.applovin.exoplayer2.an.b
    public /* synthetic */ void b() {
        an.b.CC.$default$b(this);
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public /* synthetic */ void b(int i) {
        an.d.CC.$default$b(this, i);
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public /* synthetic */ void b(ak akVar) {
        an.d.CC.$default$b(this, akVar);
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public /* synthetic */ void b(boolean z, int i) {
        an.d.CC.$default$b(this, z, i);
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public /* synthetic */ void b_(boolean z) {
        an.d.CC.$default$b_(this, z);
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public /* synthetic */ void c(int i) {
        an.d.CC.$default$c(this, i);
    }

    @Override // com.applovin.exoplayer2.an.b
    public /* synthetic */ void c(boolean z) {
        an.b.CC.$default$c(this, z);
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public /* synthetic */ void d(int i) {
        an.d.CC.$default$d(this, i);
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public /* synthetic */ void d(boolean z) {
        an.d.CC.$default$d(this, z);
    }

    @Override // com.applovin.exoplayer2.an.b
    public /* synthetic */ void e(int i) {
        an.b.CC.$default$e(this, i);
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public /* synthetic */ void e(boolean z) {
        an.d.CC.$default$e(this, z);
    }

    public SubtitleView(Context context) {
        this(context, null);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f683a = Collections.emptyList();
        this.b = c.f686a;
        this.c = 0;
        this.d = 0.0533f;
        this.e = 0.08f;
        this.f = true;
        this.g = true;
        b bVar = new b(context);
        this.i = bVar;
        this.j = bVar;
        addView(bVar);
        this.h = 1;
    }

    @Override // com.applovin.exoplayer2.an.d
    public void a(List<com.applovin.exoplayer2.i.a> list) {
        setCues(list);
    }

    public void setCues(List<com.applovin.exoplayer2.i.a> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f683a = list;
        e();
    }

    public void setViewType(int i) {
        if (this.h == i) {
            return;
        }
        if (i == 1) {
            setView(new b(getContext()));
        } else if (i == 2) {
            setView(new l(getContext()));
        } else {
            throw new IllegalArgumentException();
        }
        this.h = i;
    }

    private <T extends View & a> void setView(T t) {
        removeView(this.j);
        View view = this.j;
        if (view instanceof l) {
            ((l) view).a();
        }
        this.j = t;
        this.i = t;
        addView(t);
    }

    public void c() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public void setFractionalTextSize(float f) {
        a(f, false);
    }

    public void a(float f, boolean z) {
        a(z ? 1 : 0, f);
    }

    private void a(int i, float f) {
        this.c = i;
        this.d = f;
        e();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.f = z;
        e();
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.g = z;
        e();
    }

    public void d() {
        setStyle(getUserCaptionStyle());
    }

    public void setStyle(c cVar) {
        this.b = cVar;
        e();
    }

    public void setBottomPaddingFraction(float f) {
        this.e = f;
        e();
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (ai.f611a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private c getUserCaptionStyle() {
        if (ai.f611a < 19 || isInEditMode()) {
            return c.f686a;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        if (captioningManager != null && captioningManager.isEnabled()) {
            return c.a(captioningManager.getUserStyle());
        }
        return c.f686a;
    }

    private void e() {
        this.i.a(getCuesWithStylingPreferencesApplied(), this.b, this.d, this.c, this.e);
    }

    private List<com.applovin.exoplayer2.i.a> getCuesWithStylingPreferencesApplied() {
        if (this.f && this.g) {
            return this.f683a;
        }
        ArrayList arrayList = new ArrayList(this.f683a.size());
        for (int i = 0; i < this.f683a.size(); i++) {
            arrayList.add(a(this.f683a.get(i)));
        }
        return arrayList;
    }

    private com.applovin.exoplayer2.i.a a(com.applovin.exoplayer2.i.a aVar) {
        a.C0033a c0033aA = aVar.a();
        if (!this.f) {
            j.a(c0033aA);
        } else if (!this.g) {
            j.b(c0033aA);
        }
        return c0033aA.e();
    }
}
