package com.applovin.exoplayer2.ui;

import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import com.applovin.exoplayer2.common.a.u;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.ui.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f692a = Pattern.compile("(&#13;)?&#10;");

    public static a a(CharSequence charSequence, float f) {
        if (charSequence == null) {
            return new a("", u.a());
        }
        if (!(charSequence instanceof Spanned)) {
            return new a(a(charSequence), u.a());
        }
        Spanned spanned = (Spanned) charSequence;
        HashSet hashSet = new HashSet();
        int i = 0;
        for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
            hashSet.add(Integer.valueOf(backgroundColorSpan.getBackgroundColor()));
        }
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            map.put(e.a("bg_" + iIntValue), ai.a("background-color:%s;", e.a(iIntValue)));
        }
        SparseArray<c> sparseArrayA = a(spanned, f);
        StringBuilder sb = new StringBuilder(spanned.length());
        int i2 = 0;
        while (i < sparseArrayA.size()) {
            int iKeyAt = sparseArrayA.keyAt(i);
            sb.append(a(spanned.subSequence(i2, iKeyAt)));
            c cVar = sparseArrayA.get(iKeyAt);
            Collections.sort(cVar.b, b.f);
            Iterator it2 = cVar.b.iterator();
            while (it2.hasNext()) {
                sb.append(((b) it2.next()).d);
            }
            Collections.sort(cVar.f695a, b.e);
            Iterator it3 = cVar.f695a.iterator();
            while (it3.hasNext()) {
                sb.append(((b) it3.next()).c);
            }
            i++;
            i2 = iKeyAt;
        }
        sb.append(a(spanned.subSequence(i2, spanned.length())));
        return new a(sb.toString(), map);
    }

    private static SparseArray<c> a(Spanned spanned, float f) {
        SparseArray<c> sparseArray = new SparseArray<>();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String strA = a(obj, f);
            String strA2 = a(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (strA != null) {
                com.applovin.exoplayer2.l.a.b(strA2);
                b bVar = new b(spanStart, spanEnd, strA, strA2);
                a(sparseArray, spanStart).f695a.add(bVar);
                a(sparseArray, spanEnd).b.add(bVar);
            }
        }
        return sparseArray;
    }

    private static String a(Object obj, float f) {
        float size;
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return ai.a("<span style='color:%s;'>", e.a(((ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof BackgroundColorSpan) {
            return ai.a("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof com.applovin.exoplayer2.i.d.a) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof AbsoluteSizeSpan) {
            AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj;
            if (absoluteSizeSpan.getDip()) {
                size = absoluteSizeSpan.getSize();
            } else {
                size = absoluteSizeSpan.getSize() / f;
            }
            return ai.a("<span style='font-size:%.2fpx;'>", Float.valueOf(size));
        }
        if (obj instanceof RelativeSizeSpan) {
            return ai.a("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        }
        if (obj instanceof TypefaceSpan) {
            String family = ((TypefaceSpan) obj).getFamily();
            if (family != null) {
                return ai.a("<span style='font-family:\"%s\";'>", family);
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "<b>";
            }
            if (style == 2) {
                return "<i>";
            }
            if (style != 3) {
                return null;
            }
            return "<b><i>";
        }
        if (obj instanceof com.applovin.exoplayer2.i.d.c) {
            int i = ((com.applovin.exoplayer2.i.d.c) obj).b;
            if (i == -1) {
                return "<ruby style='ruby-position:unset;'>";
            }
            if (i == 1) {
                return "<ruby style='ruby-position:over;'>";
            }
            if (i != 2) {
                return null;
            }
            return "<ruby style='ruby-position:under;'>";
        }
        if (obj instanceof UnderlineSpan) {
            return "<u>";
        }
        if (!(obj instanceof com.applovin.exoplayer2.i.d.e)) {
            return null;
        }
        com.applovin.exoplayer2.i.d.e eVar = (com.applovin.exoplayer2.i.d.e) obj;
        return ai.a("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", a(eVar.f515a, eVar.b), a(eVar.c));
    }

    private static String a(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof com.applovin.exoplayer2.i.d.a) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof com.applovin.exoplayer2.i.d.e)) {
            return "</span>";
        }
        if (obj instanceof TypefaceSpan) {
            if (((TypefaceSpan) obj).getFamily() != null) {
                return "</span>";
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "</b>";
            }
            if (style == 2) {
                return "</i>";
            }
            if (style == 3) {
                return "</i></b>";
            }
        } else {
            if (obj instanceof com.applovin.exoplayer2.i.d.c) {
                return "<rt>" + a((CharSequence) ((com.applovin.exoplayer2.i.d.c) obj).f514a) + "</rt></ruby>";
            }
            if (obj instanceof UnderlineSpan) {
                return "</u>";
            }
        }
        return null;
    }

    private static String a(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        if (i2 == 1) {
            sb.append("filled ");
        } else if (i2 == 2) {
            sb.append("open ");
        }
        if (i == 0) {
            sb.append("none");
        } else if (i == 1) {
            sb.append("circle");
        } else if (i == 2) {
            sb.append("dot");
        } else if (i == 3) {
            sb.append("sesame");
        } else {
            sb.append("unset");
        }
        return sb.toString();
    }

    private static String a(int i) {
        if (i == 2) {
            return "under left";
        }
        return "over right";
    }

    private static c a(SparseArray<c> sparseArray, int i) {
        c cVar = sparseArray.get(i);
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        sparseArray.put(i, cVar2);
        return cVar2;
    }

    private static String a(CharSequence charSequence) {
        return f692a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f693a;
        public final Map<String, String> b;

        private a(String str, Map<String, String> map) {
            this.f693a = str;
            this.b = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b {
        private static final Comparator<b> e = new Comparator() { // from class: com.applovin.exoplayer2.ui.h$b$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return h.b.b((h.b) obj, (h.b) obj2);
            }
        };
        private static final Comparator<b> f = new Comparator() { // from class: com.applovin.exoplayer2.ui.h$b$$ExternalSyntheticLambda1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return h.b.a((h.b) obj, (h.b) obj2);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f694a;
        public final int b;
        public final String c;
        public final String d;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int b(b bVar, b bVar2) {
            int iCompare = Integer.compare(bVar2.b, bVar.b);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = bVar.c.compareTo(bVar2.c);
            return iCompareTo != 0 ? iCompareTo : bVar.d.compareTo(bVar2.d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int a(b bVar, b bVar2) {
            int iCompare = Integer.compare(bVar2.f694a, bVar.f694a);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = bVar2.c.compareTo(bVar.c);
            return iCompareTo != 0 ? iCompareTo : bVar2.d.compareTo(bVar.d);
        }

        private b(int i, int i2, String str, String str2) {
            this.f694a = i;
            this.b = i2;
            this.c = str;
            this.d = str2;
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<b> f695a = new ArrayList();
        private final List<b> b = new ArrayList();
    }
}
