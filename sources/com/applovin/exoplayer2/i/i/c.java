package com.applovin.exoplayer2.i.i;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.y;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f538a = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern b = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final y c = new y();
    private final StringBuilder d = new StringBuilder();

    public List<d> a(y yVar) {
        this.d.setLength(0);
        int iC = yVar.c();
        c(yVar);
        this.c.a(yVar.d(), yVar.c());
        this.c.d(iC);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strB = b(this.c, this.d);
            if (strB == null || !"{".equals(a(this.c, this.d))) {
                return arrayList;
            }
            d dVar = new d();
            a(dVar, strB);
            String str = null;
            boolean z = false;
            while (!z) {
                int iC2 = this.c.c();
                String strA = a(this.c, this.d);
                boolean z2 = strA == null || "}".equals(strA);
                if (!z2) {
                    this.c.d(iC2);
                    a(this.c, dVar, this.d);
                }
                str = strA;
                z = z2;
            }
            if ("}".equals(str)) {
                arrayList.add(dVar);
            }
        }
    }

    private static String b(y yVar, StringBuilder sb) {
        b(yVar);
        if (yVar.a() < 5 || !"::cue".equals(yVar.f(5))) {
            return null;
        }
        int iC = yVar.c();
        String strA = a(yVar, sb);
        if (strA == null) {
            return null;
        }
        if ("{".equals(strA)) {
            yVar.d(iC);
            return "";
        }
        String strD = "(".equals(strA) ? d(yVar) : null;
        if (")".equals(a(yVar, sb))) {
            return strD;
        }
        return null;
    }

    private static String d(y yVar) {
        int iC = yVar.c();
        int iB = yVar.b();
        boolean z = false;
        while (iC < iB && !z) {
            int i = iC + 1;
            z = ((char) yVar.d()[iC]) == ')';
            iC = i;
        }
        return yVar.f((iC - 1) - yVar.c()).trim();
    }

    private static void a(y yVar, d dVar, StringBuilder sb) {
        b(yVar);
        String strD = d(yVar, sb);
        if (!"".equals(strD) && ":".equals(a(yVar, sb))) {
            b(yVar);
            String strC = c(yVar, sb);
            if (strC == null || "".equals(strC)) {
                return;
            }
            int iC = yVar.c();
            String strA = a(yVar, sb);
            if (!";".equals(strA)) {
                if (!"}".equals(strA)) {
                    return;
                } else {
                    yVar.d(iC);
                }
            }
            if ("color".equals(strD)) {
                dVar.a(com.applovin.exoplayer2.l.f.b(strC));
                return;
            }
            if ("background-color".equals(strD)) {
                dVar.b(com.applovin.exoplayer2.l.f.b(strC));
                return;
            }
            boolean z = true;
            if ("ruby-position".equals(strD)) {
                if ("over".equals(strC)) {
                    dVar.d(1);
                    return;
                } else {
                    if ("under".equals(strC)) {
                        dVar.d(2);
                        return;
                    }
                    return;
                }
            }
            if ("text-combine-upright".equals(strD)) {
                if (!"all".equals(strC) && !strC.startsWith("digits")) {
                    z = false;
                }
                dVar.d(z);
                return;
            }
            if ("text-decoration".equals(strD)) {
                if ("underline".equals(strC)) {
                    dVar.a(true);
                    return;
                }
                return;
            }
            if ("font-family".equals(strD)) {
                dVar.d(strC);
                return;
            }
            if ("font-weight".equals(strD)) {
                if ("bold".equals(strC)) {
                    dVar.b(true);
                }
            } else if ("font-style".equals(strD)) {
                if ("italic".equals(strC)) {
                    dVar.c(true);
                }
            } else if ("font-size".equals(strD)) {
                a(strC, dVar);
            }
        }
    }

    static void b(y yVar) {
        while (true) {
            for (boolean z = true; yVar.a() > 0 && z; z = false) {
                if (e(yVar) || f(yVar)) {
                    break;
                }
            }
            return;
        }
    }

    static String a(y yVar, StringBuilder sb) {
        b(yVar);
        if (yVar.a() == 0) {
            return null;
        }
        String strD = d(yVar, sb);
        if (!"".equals(strD)) {
            return strD;
        }
        return "" + ((char) yVar.h());
    }

    private static boolean e(y yVar) {
        char cA = a(yVar, yVar.c());
        if (cA != '\t' && cA != '\n' && cA != '\f' && cA != '\r' && cA != ' ') {
            return false;
        }
        yVar.e(1);
        return true;
    }

    static void c(y yVar) {
        while (!TextUtils.isEmpty(yVar.C())) {
        }
    }

    private static char a(y yVar, int i) {
        return (char) yVar.d()[i];
    }

    private static String c(y yVar, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int iC = yVar.c();
            String strA = a(yVar, sb);
            if (strA == null) {
                return null;
            }
            if ("}".equals(strA) || ";".equals(strA)) {
                yVar.d(iC);
                z = true;
            } else {
                sb2.append(strA);
            }
        }
        return sb2.toString();
    }

    private static boolean f(y yVar) {
        int iC = yVar.c();
        int iB = yVar.b();
        byte[] bArrD = yVar.d();
        if (iC + 2 > iB) {
            return false;
        }
        int i = iC + 1;
        if (bArrD[iC] != 47) {
            return false;
        }
        int i2 = iC + 2;
        if (bArrD[i] != 42) {
            return false;
        }
        while (true) {
            int i3 = i2 + 1;
            if (i3 < iB) {
                if (((char) bArrD[i2]) == '*' && ((char) bArrD[i3]) == '/') {
                    i2 += 2;
                    iB = i2;
                } else {
                    i2 = i3;
                }
            } else {
                yVar.e(iB - yVar.c());
                return true;
            }
        }
    }

    private static String d(y yVar, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int iC = yVar.c();
        int iB = yVar.b();
        while (iC < iB && !z) {
            char c = (char) yVar.d()[iC];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                z = true;
            } else {
                iC++;
                sb.append(c);
            }
        }
        yVar.e(iC - yVar.c());
        return sb.toString();
    }

    private static void a(String str, d dVar) {
        Matcher matcher = b.matcher(Ascii.toLowerCase(str));
        if (!matcher.matches()) {
            q.c("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) com.applovin.exoplayer2.l.a.b(matcher.group(2));
        str2.hashCode();
        switch (str2) {
            case "%":
                dVar.c(3);
                break;
            case "em":
                dVar.c(2);
                break;
            case "px":
                dVar.c(1);
                break;
            default:
                throw new IllegalStateException();
        }
        dVar.a(Float.parseFloat((String) com.applovin.exoplayer2.l.a.b(matcher.group(1))));
    }

    private void a(d dVar, String str) {
        if ("".equals(str)) {
            return;
        }
        int iIndexOf = str.indexOf(91);
        if (iIndexOf != -1) {
            Matcher matcher = f538a.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                dVar.c((String) com.applovin.exoplayer2.l.a.b(matcher.group(1)));
            }
            str = str.substring(0, iIndexOf);
        }
        String[] strArrA = ai.a(str, "\\.");
        String str2 = strArrA[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            dVar.b(str2.substring(0, iIndexOf2));
            dVar.a(str2.substring(iIndexOf2 + 1));
        } else {
            dVar.b(str2);
        }
        if (strArrA.length > 1) {
            dVar.a((String[]) ai.a(strArrA, 1, strArrA.length));
        }
    }
}
