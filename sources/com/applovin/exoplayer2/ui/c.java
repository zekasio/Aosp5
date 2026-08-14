package com.applovin.exoplayer2.ui;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import androidx.core.view.ViewCompat;
import com.applovin.exoplayer2.l.ai;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f686a = new c(-1, ViewCompat.MEASURED_STATE_MASK, 0, 0, -1, null);
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final Typeface g;

    public static c a(CaptioningManager.CaptionStyle captionStyle) {
        if (ai.f611a >= 21) {
            return c(captionStyle);
        }
        return b(captionStyle);
    }

    public c(int i, int i2, int i3, int i4, int i5, Typeface typeface) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = typeface;
    }

    private static c b(CaptioningManager.CaptionStyle captionStyle) {
        return new c(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    private static c c(CaptioningManager.CaptionStyle captionStyle) {
        return new c(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f686a.b, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f686a.c, captionStyle.hasWindowColor() ? captionStyle.windowColor : f686a.d, captionStyle.hasEdgeType() ? captionStyle.edgeType : f686a.e, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f686a.f, captionStyle.getTypeface());
    }
}
