package com.applovin.exoplayer2.i.g;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import java.util.ArrayDeque;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class f {
    public static g a(g gVar, String[] strArr, Map<String, g> map) {
        int i = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                g gVar2 = new g();
                int length = strArr.length;
                while (i < length) {
                    gVar2.a(map.get(strArr[i]));
                    i++;
                }
                return gVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return gVar.a(map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    gVar.a(map.get(strArr[i]));
                    i++;
                }
            }
        }
        return gVar;
    }

    public static void a(Spannable spannable, int i, int i2, g gVar, d dVar, Map<String, g> map, int i3) {
        d dVarA;
        g gVarA;
        int i4;
        int i5;
        if (gVar.a() != -1) {
            spannable.setSpan(new StyleSpan(gVar.a()), i, i2, 33);
        }
        if (gVar.b()) {
            spannable.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (gVar.c()) {
            spannable.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (gVar.f()) {
            com.applovin.exoplayer2.i.d.d.a(spannable, new ForegroundColorSpan(gVar.e()), i, i2, 33);
        }
        if (gVar.h()) {
            com.applovin.exoplayer2.i.d.d.a(spannable, new BackgroundColorSpan(gVar.g()), i, i2, 33);
        }
        if (gVar.d() != null) {
            com.applovin.exoplayer2.i.d.d.a(spannable, new TypefaceSpan(gVar.d()), i, i2, 33);
        }
        if (gVar.p() != null) {
            b bVar = (b) com.applovin.exoplayer2.l.a.b(gVar.p());
            if (bVar.f524a == -1) {
                i4 = (i3 == 2 || i3 == 1) ? 3 : 1;
                i5 = 1;
            } else {
                i4 = bVar.f524a;
                i5 = bVar.b;
            }
            com.applovin.exoplayer2.i.d.d.a(spannable, new com.applovin.exoplayer2.i.d.e(i4, i5, bVar.c == -2 ? 1 : bVar.c), i, i2, 33);
        }
        int iK = gVar.k();
        if (iK == 2) {
            d dVarB = b(dVar, map);
            if (dVarB != null && (dVarA = a(dVarB, map)) != null) {
                if (dVarA.a() == 1 && dVarA.a(0).b != null) {
                    String str = (String) ai.a(dVarA.a(0).b);
                    g gVarA2 = a(dVarA.f, dVarA.c(), map);
                    int iL = gVarA2 != null ? gVarA2.l() : -1;
                    if (iL == -1 && (gVarA = a(dVarB.f, dVarB.c(), map)) != null) {
                        iL = gVarA.l();
                    }
                    spannable.setSpan(new com.applovin.exoplayer2.i.d.c(str, iL), i, i2, 33);
                } else {
                    q.b("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                }
            }
        } else if (iK == 3 || iK == 4) {
            spannable.setSpan(new a(), i, i2, 33);
        }
        if (gVar.o()) {
            com.applovin.exoplayer2.i.d.d.a(spannable, new com.applovin.exoplayer2.i.d.a(), i, i2, 33);
        }
        int iQ = gVar.q();
        if (iQ == 1) {
            com.applovin.exoplayer2.i.d.d.a(spannable, new AbsoluteSizeSpan((int) gVar.r(), true), i, i2, 33);
        } else if (iQ == 2) {
            com.applovin.exoplayer2.i.d.d.a(spannable, new RelativeSizeSpan(gVar.r()), i, i2, 33);
        } else {
            if (iQ != 3) {
                return;
            }
            com.applovin.exoplayer2.i.d.d.a(spannable, new RelativeSizeSpan(gVar.r() / 100.0f), i, i2, 33);
        }
    }

    private static d a(d dVar, Map<String, g> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(dVar);
        while (!arrayDeque.isEmpty()) {
            d dVar2 = (d) arrayDeque.pop();
            g gVarA = a(dVar2.f, dVar2.c(), map);
            if (gVarA != null && gVarA.k() == 3) {
                return dVar2;
            }
            for (int iA = dVar2.a() - 1; iA >= 0; iA--) {
                arrayDeque.push(dVar2.a(iA));
            }
        }
        return null;
    }

    private static d b(d dVar, Map<String, g> map) {
        while (dVar != null) {
            g gVarA = a(dVar.f, dVar.c(), map);
            if (gVarA != null && gVarA.k() == 1) {
                return dVar;
            }
            dVar = dVar.i;
        }
        return null;
    }

    static void a(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length < 0 || spannableStringBuilder.charAt(length) == '\n') {
            return;
        }
        spannableStringBuilder.append('\n');
    }

    static String a(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }
}
