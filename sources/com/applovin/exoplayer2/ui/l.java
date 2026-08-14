package com.applovin.exoplayer2.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.ui.SubtitleView;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class l extends FrameLayout implements SubtitleView.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f697a;
    private final WebView b;
    private List<com.applovin.exoplayer2.i.a> c;
    private c d;
    private float e;
    private int f;
    private float g;

    private static int b(int i) {
        if (i != 1) {
            return i != 2 ? 0 : -100;
        }
        return -50;
    }

    public l(Context context) {
        this(context, null);
    }

    public l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = Collections.emptyList();
        this.d = c.f686a;
        this.e = 0.0533f;
        this.f = 0;
        this.g = 0.08f;
        b bVar = new b(context, attributeSet);
        this.f697a = bVar;
        WebView webView = new WebView(context, attributeSet) { // from class: com.applovin.exoplayer2.ui.l.1
            @Override // android.webkit.WebView, android.view.View
            public boolean onTouchEvent(MotionEvent motionEvent) {
                super.onTouchEvent(motionEvent);
                return false;
            }

            @Override // android.view.View
            public boolean performClick() {
                super.performClick();
                return false;
            }
        };
        this.b = webView;
        webView.setBackgroundColor(0);
        addView(bVar);
        addView(webView);
    }

    @Override // com.applovin.exoplayer2.ui.SubtitleView.a
    public void a(List<com.applovin.exoplayer2.i.a> list, c cVar, float f, int i, float f2) {
        this.d = cVar;
        this.e = f;
        this.f = i;
        this.g = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            com.applovin.exoplayer2.i.a aVar = list.get(i2);
            if (aVar.e != null) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
        }
        if (!this.c.isEmpty() || !arrayList2.isEmpty()) {
            this.c = arrayList2;
            b();
        }
        this.f697a.a(arrayList, cVar, f, i, f2);
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z || this.c.isEmpty()) {
            return;
        }
        b();
    }

    public void a() {
        this.b.destroy();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0251  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b() {
        /*
            Method dump skipped, instruction units count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.ui.l.b():void");
    }

    private static String a(com.applovin.exoplayer2.i.a aVar) {
        String str;
        if (aVar.r != 0.0f) {
            if (aVar.q == 2 || aVar.q == 1) {
                str = "skewY";
            } else {
                str = "skewX";
            }
            return ai.a("%s(%.2fdeg)", str, Float.valueOf(aVar.r));
        }
        return "";
    }

    private String a(int i, float f) {
        float fA = j.a(i, f, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return fA == -3.4028235E38f ? "unset" : ai.a("%.2fpx", Float.valueOf(fA / getContext().getResources().getDisplayMetrics().density));
    }

    private static String a(c cVar) {
        int i = cVar.e;
        if (i == 1) {
            return ai.a("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", e.a(cVar.f));
        }
        if (i == 2) {
            return ai.a("0.1em 0.12em 0.15em %s", e.a(cVar.f));
        }
        if (i == 3) {
            return ai.a("0.06em 0.08em 0.15em %s", e.a(cVar.f));
        }
        if (i == 4) {
            return ai.a("-0.05em -0.05em 0.15em %s", e.a(cVar.f));
        }
        return "unset";
    }

    private static String a(int i) {
        if (i == 1) {
            return "vertical-rl";
        }
        if (i == 2) {
            return "vertical-lr";
        }
        return "horizontal-tb";
    }

    private static String a(Layout.Alignment alignment) {
        if (alignment == null) {
            return "center";
        }
        int i = AnonymousClass2.f699a[alignment.ordinal()];
        if (i == 1) {
            return TJAdUnitConstants.String.VIDEO_START;
        }
        if (i != 2) {
            return "center";
        }
        return "end";
    }

    /* JADX INFO: renamed from: com.applovin.exoplayer2.ui.l$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f699a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f699a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f699a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f699a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}
