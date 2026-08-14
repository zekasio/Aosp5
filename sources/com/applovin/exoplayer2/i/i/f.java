package com.applovin.exoplayer2.i.i;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.applovin.exoplayer2.i.a;
import com.applovin.exoplayer2.i.i.f;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.y;
import cz.msebera.android.httpclient.message.TokenParser;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f541a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    private static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map<String, Integer> c;
    private static final Map<String, Integer> d;

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        d = Collections.unmodifiableMap(map2);
    }

    public static e a(y yVar, List<com.applovin.exoplayer2.i.i.d> list) {
        String strC = yVar.C();
        if (strC == null) {
            return null;
        }
        Pattern pattern = f541a;
        Matcher matcher = pattern.matcher(strC);
        if (matcher.matches()) {
            return a((String) null, matcher, yVar, list);
        }
        String strC2 = yVar.C();
        if (strC2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(strC2);
        if (matcher2.matches()) {
            return a(strC.trim(), matcher2, yVar, list);
        }
        return null;
    }

    static a.C0033a a(String str) {
        d dVar = new d();
        a(str, dVar);
        return dVar.b();
    }

    static com.applovin.exoplayer2.i.a a(CharSequence charSequence) {
        d dVar = new d();
        dVar.c = charSequence;
        return dVar.b().e();
    }

    static SpannedString a(String str, String str2, List<com.applovin.exoplayer2.i.i.d> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str2.length()) {
            char cCharAt = str2.charAt(i);
            if (cCharAt == '&') {
                i++;
                int iIndexOf = str2.indexOf(59, i);
                int iIndexOf2 = str2.indexOf(32, i);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    a(str2.substring(i, iIndexOf), spannableStringBuilder);
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt == '<') {
                int iA = i + 1;
                if (iA < str2.length()) {
                    boolean z = str2.charAt(iA) == '/';
                    iA = a(str2, iA);
                    int i2 = iA - 2;
                    boolean z2 = str2.charAt(i2) == '/';
                    int i3 = i + (z ? 2 : 1);
                    if (!z2) {
                        i2 = iA - 1;
                    }
                    String strSubstring = str2.substring(i3, i2);
                    if (!strSubstring.trim().isEmpty()) {
                        String strG = g(strSubstring);
                        if (f(strG)) {
                            if (z) {
                                while (!arrayDeque.isEmpty()) {
                                    b bVar = (b) arrayDeque.pop();
                                    a(str, bVar, arrayList, spannableStringBuilder, list);
                                    if (!arrayDeque.isEmpty()) {
                                        arrayList.add(new a(bVar, spannableStringBuilder.length()));
                                    } else {
                                        arrayList.clear();
                                    }
                                    if (bVar.f543a.equals(strG)) {
                                        break;
                                    }
                                }
                            } else if (!z2) {
                                arrayDeque.push(b.a(strSubstring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i = iA;
            } else {
                spannableStringBuilder.append(cCharAt);
                i++;
            }
        }
        while (!arrayDeque.isEmpty()) {
            a(str, (b) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        a(str, b.a(), (List<a>) Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    private static e a(String str, Matcher matcher, y yVar, List<com.applovin.exoplayer2.i.i.d> list) {
        d dVar = new d();
        try {
            dVar.f545a = h.a((String) com.applovin.exoplayer2.l.a.b(matcher.group(1)));
            dVar.b = h.a((String) com.applovin.exoplayer2.l.a.b(matcher.group(2)));
            a((String) com.applovin.exoplayer2.l.a.b(matcher.group(3)), dVar);
            StringBuilder sb = new StringBuilder();
            String strC = yVar.C();
            while (!TextUtils.isEmpty(strC)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strC.trim());
                strC = yVar.C();
            }
            dVar.c = a(str, sb.toString(), list);
            return dVar.a();
        } catch (NumberFormatException unused) {
            q.c("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    private static void a(String str, d dVar) {
        Matcher matcher = b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) com.applovin.exoplayer2.l.a.b(matcher.group(1));
            String str3 = (String) com.applovin.exoplayer2.l.a.b(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    b(str3, dVar);
                } else if ("align".equals(str2)) {
                    dVar.d = e(str3);
                } else if ("position".equals(str2)) {
                    c(str3, dVar);
                } else if ("size".equals(str2)) {
                    dVar.j = h.b(str3);
                } else if ("vertical".equals(str2)) {
                    dVar.k = d(str3);
                } else {
                    q.c("WebvttCueParser", "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (NumberFormatException unused) {
                q.c("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    private static void b(String str, d dVar) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            dVar.g = b(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            dVar.e = h.b(str);
            dVar.f = 0;
        } else {
            dVar.e = Integer.parseInt(str);
            dVar.f = 1;
        }
    }

    private static int b(String str) {
        str.hashCode();
        switch (str) {
            case "center":
            case "middle":
                return 1;
            case "end":
                return 2;
            case "start":
                return 0;
            default:
                q.c("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static void c(String str, d dVar) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            dVar.i = c(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        dVar.h = h.b(str);
    }

    private static int c(String str) {
        str.hashCode();
        switch (str) {
            case "line-left":
            case "start":
                return 0;
            case "center":
            case "middle":
                return 1;
            case "line-right":
            case "end":
                return 2;
            default:
                q.c("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static int d(String str) {
        str.hashCode();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        q.c("WebvttCueParser", "Invalid 'vertical' value: " + str);
        return Integer.MIN_VALUE;
    }

    private static int e(String str) {
        str.hashCode();
        switch (str) {
            case "center":
            case "middle":
                return 2;
            case "end":
                return 3;
            case "left":
                return 4;
            case "right":
                return 5;
            case "start":
                return 1;
            default:
                q.c("WebvttCueParser", "Invalid alignment value: " + str);
                return 2;
        }
    }

    private static int a(String str, int i) {
        int iIndexOf = str.indexOf(62, i);
        return iIndexOf == -1 ? str.length() : iIndexOf + 1;
    }

    private static void a(String str, SpannableStringBuilder spannableStringBuilder) {
        str.hashCode();
        switch (str) {
            case "gt":
                spannableStringBuilder.append(Typography.greater);
                break;
            case "lt":
                spannableStringBuilder.append(Typography.less);
                break;
            case "amp":
                spannableStringBuilder.append(Typography.amp);
                break;
            case "nbsp":
                spannableStringBuilder.append(TokenParser.SP);
                break;
            default:
                q.c("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                break;
        }
    }

    private static boolean f(String str) {
        str.hashCode();
        switch (str) {
            case "b":
            case "c":
            case "i":
            case "u":
            case "v":
            case "rt":
            case "lang":
            case "ruby":
                return true;
            default:
                return false;
        }
    }

    private static void a(String str, b bVar, List<a> list, SpannableStringBuilder spannableStringBuilder, List<com.applovin.exoplayer2.i.i.d> list2) {
        int i;
        int length;
        i = bVar.b;
        length = spannableStringBuilder.length();
        String str2 = bVar.f543a;
        str2.hashCode();
        switch (str2) {
            case "":
            case "v":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                break;
            case "c":
                a(spannableStringBuilder, bVar.d, i, length);
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                break;
            case "ruby":
                a(spannableStringBuilder, str, bVar, list, list2);
                break;
            default:
                return;
        }
        List<c> listB = b(list2, str, bVar);
        for (int i2 = 0; i2 < listB.size(); i2++) {
            a(spannableStringBuilder, listB.get(i2).b, i, length);
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, String str, b bVar, List<a> list, List<com.applovin.exoplayer2.i.i.d> list2) {
        int iA = a(list2, str, bVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, a.f542a);
        int i = bVar.b;
        int length = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if ("rt".equals(((a) arrayList.get(i2)).b.f543a)) {
                a aVar = (a) arrayList.get(i2);
                int iA2 = a(a(list2, str, aVar.b), iA, 1);
                int i3 = aVar.b.b - length;
                int i4 = aVar.c - length;
                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i3, i4);
                spannableStringBuilder.delete(i3, i4);
                spannableStringBuilder.setSpan(new com.applovin.exoplayer2.i.d.c(charSequenceSubSequence.toString(), iA2), i, i3, 33);
                length += charSequenceSubSequence.length();
                i = i3;
            }
        }
    }

    private static int a(List<com.applovin.exoplayer2.i.i.d> list, String str, b bVar) {
        List<c> listB = b(list, str, bVar);
        for (int i = 0; i < listB.size(); i++) {
            com.applovin.exoplayer2.i.i.d dVar = listB.get(i).b;
            if (dVar.k() != -1) {
                return dVar.k();
            }
        }
        return -1;
    }

    private static int a(int i, int i2, int i3) {
        if (i != -1) {
            return i;
        }
        if (i2 != -1) {
            return i2;
        }
        if (i3 != -1) {
            return i3;
        }
        throw new IllegalArgumentException();
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i, int i2) {
        for (String str : set) {
            Map<String, Integer> map = c;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str).intValue()), i, i2, 33);
            } else {
                Map<String, Integer> map2 = d;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str).intValue()), i, i2, 33);
                }
            }
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, com.applovin.exoplayer2.i.i.d dVar, int i, int i2) {
        if (dVar == null) {
            return;
        }
        if (dVar.a() != -1) {
            com.applovin.exoplayer2.i.d.d.a(spannableStringBuilder, new StyleSpan(dVar.a()), i, i2, 33);
        }
        if (dVar.b()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (dVar.c()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (dVar.f()) {
            com.applovin.exoplayer2.i.d.d.a(spannableStringBuilder, new ForegroundColorSpan(dVar.e()), i, i2, 33);
        }
        if (dVar.h()) {
            com.applovin.exoplayer2.i.d.d.a(spannableStringBuilder, new BackgroundColorSpan(dVar.g()), i, i2, 33);
        }
        if (dVar.d() != null) {
            com.applovin.exoplayer2.i.d.d.a(spannableStringBuilder, new TypefaceSpan(dVar.d()), i, i2, 33);
        }
        int i3 = dVar.i();
        if (i3 == 1) {
            com.applovin.exoplayer2.i.d.d.a(spannableStringBuilder, new AbsoluteSizeSpan((int) dVar.j(), true), i, i2, 33);
        } else if (i3 == 2) {
            com.applovin.exoplayer2.i.d.d.a(spannableStringBuilder, new RelativeSizeSpan(dVar.j()), i, i2, 33);
        } else if (i3 == 3) {
            com.applovin.exoplayer2.i.d.d.a(spannableStringBuilder, new RelativeSizeSpan(dVar.j() / 100.0f), i, i2, 33);
        }
        if (dVar.l()) {
            spannableStringBuilder.setSpan(new com.applovin.exoplayer2.i.d.a(), i, i2, 33);
        }
    }

    private static String g(String str) {
        String strTrim = str.trim();
        com.applovin.exoplayer2.l.a.a(!strTrim.isEmpty());
        return ai.b(strTrim, "[ \\.]")[0];
    }

    private static List<c> b(List<com.applovin.exoplayer2.i.i.d> list, String str, b bVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            com.applovin.exoplayer2.i.i.d dVar = list.get(i);
            int iA = dVar.a(str, bVar.f543a, bVar.d, bVar.c);
            if (iA > 0) {
                arrayList.add(new c(iA, dVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static final class d {
        public CharSequence c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f545a = 0;
        public long b = 0;
        public int d = 2;
        public float e = -3.4028235E38f;
        public int f = 1;
        public int g = 0;
        public float h = -3.4028235E38f;
        public int i = Integer.MIN_VALUE;
        public float j = 1.0f;
        public int k = Integer.MIN_VALUE;

        private static float a(float f, int i) {
            if (f == -3.4028235E38f || i != 0 || (f >= 0.0f && f <= 1.0f)) {
                return f != -3.4028235E38f ? f : i == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        private static float a(int i) {
            if (i != 4) {
                return i != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        private static int b(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 3) {
                return 2;
            }
            if (i != 4) {
                return i != 5 ? 1 : 2;
            }
            return 0;
        }

        public e a() {
            return new e(b().e(), this.f545a, this.b);
        }

        public a.C0033a b() {
            float fA = this.h;
            if (fA == -3.4028235E38f) {
                fA = a(this.d);
            }
            int iB = this.i;
            if (iB == Integer.MIN_VALUE) {
                iB = b(this.d);
            }
            a.C0033a c0033aD = new a.C0033a().a(c(this.d)).a(a(this.e, this.f), this.f).a(this.g).a(fA).b(iB).b(Math.min(this.j, a(iB, fA))).d(this.k);
            CharSequence charSequence = this.c;
            if (charSequence != null) {
                c0033aD.a(charSequence);
            }
            return c0033aD;
        }

        private static Layout.Alignment c(int i) {
            if (i != 1) {
                if (i == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            q.c("WebvttCueParser", "Unknown textAlignment: " + i);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        private static float a(int i, float f) {
            if (i == 0) {
                return 1.0f - f;
            }
            if (i == 1) {
                return f <= 0.5f ? f * 2.0f : (1.0f - f) * 2.0f;
            }
            if (i == 2) {
                return f;
            }
            throw new IllegalStateException(String.valueOf(i));
        }
    }

    private static final class c implements Comparable<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f544a;
        public final com.applovin.exoplayer2.i.i.d b;

        public c(int i, com.applovin.exoplayer2.i.i.d dVar) {
            this.f544a = i;
            this.b = dVar;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return Integer.compare(this.f544a, cVar.f544a);
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f543a;
        public final int b;
        public final String c;
        public final Set<String> d;

        private b(String str, int i, String str2, Set<String> set) {
            this.b = i;
            this.f543a = str;
            this.c = str2;
            this.d = set;
        }

        public static b a(String str, int i) {
            String str2;
            String strTrim = str.trim();
            com.applovin.exoplayer2.l.a.a(!strTrim.isEmpty());
            int iIndexOf = strTrim.indexOf(" ");
            if (iIndexOf == -1) {
                str2 = "";
            } else {
                String strTrim2 = strTrim.substring(iIndexOf).trim();
                strTrim = strTrim.substring(0, iIndexOf);
                str2 = strTrim2;
            }
            String[] strArrA = ai.a(strTrim, "\\.");
            String str3 = strArrA[0];
            HashSet hashSet = new HashSet();
            for (int i2 = 1; i2 < strArrA.length; i2++) {
                hashSet.add(strArrA[i2]);
            }
            return new b(str3, i, str2, hashSet);
        }

        public static b a() {
            return new b("", 0, "", Collections.emptySet());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Comparator<a> f542a = new Comparator() { // from class: com.applovin.exoplayer2.i.i.f$a$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return f.a.a((f.a) obj, (f.a) obj2);
            }
        };
        private final b b;
        private final int c;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int a(a aVar, a aVar2) {
            return Integer.compare(aVar.b.b, aVar2.b.b);
        }

        private a(b bVar, int i) {
            this.b = bVar;
            this.c = i;
        }
    }
}
