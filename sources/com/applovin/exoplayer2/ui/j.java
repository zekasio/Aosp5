package com.applovin.exoplayer2.ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import com.applovin.exoplayer2.common.base.Predicate;
import com.applovin.exoplayer2.i.a;

/* JADX INFO: loaded from: classes.dex */
final class j {
    public static float a(int i, float f, int i2, int i3) {
        float f2;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f2 = i3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    return -3.4028235E38f;
                }
                return f;
            }
            f2 = i2;
        }
        return f * f2;
    }

    public static void a(a.C0033a c0033a) {
        c0033a.d();
        if (c0033a.a() instanceof Spanned) {
            if (!(c0033a.a() instanceof Spannable)) {
                c0033a.a(SpannableString.valueOf(c0033a.a()));
            }
            a((Spannable) com.applovin.exoplayer2.l.a.b(c0033a.a()), new Predicate() { // from class: com.applovin.exoplayer2.ui.j$$ExternalSyntheticLambda1
                @Override // com.applovin.exoplayer2.common.base.Predicate
                public final boolean apply(Object obj) {
                    return j.b(obj);
                }
            });
        }
        b(c0033a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean b(Object obj) {
        return !(obj instanceof com.applovin.exoplayer2.i.d.b);
    }

    public static void b(a.C0033a c0033a) {
        c0033a.b(-3.4028235E38f, Integer.MIN_VALUE);
        if (c0033a.a() instanceof Spanned) {
            if (!(c0033a.a() instanceof Spannable)) {
                c0033a.a(SpannableString.valueOf(c0033a.a()));
            }
            a((Spannable) com.applovin.exoplayer2.l.a.b(c0033a.a()), new Predicate() { // from class: com.applovin.exoplayer2.ui.j$$ExternalSyntheticLambda0
                @Override // com.applovin.exoplayer2.common.base.Predicate
                public final boolean apply(Object obj) {
                    return j.a(obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }

    private static void a(Spannable spannable, Predicate<Object> predicate) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (predicate.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }
}
