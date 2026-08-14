package com.applovin.exoplayer2.i.g;

import android.text.Layout;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.aj;
import com.applovin.exoplayer2.l.q;
import com.tapjoy.TJAdUnitConstants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes.dex */
public final class c extends com.applovin.exoplayer2.i.d {
    private final XmlPullParserFactory j;
    private static final Pattern c = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern d = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern e = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Pattern f525a = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern b = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    private static final Pattern f = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    private static final Pattern g = Pattern.compile("^(\\d+) (\\d+)$");
    private static final b h = new b(30.0f, 1, 1);
    private static final a i = new a(32, 15);

    public c() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.j = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    @Override // com.applovin.exoplayer2.i.d
    protected com.applovin.exoplayer2.i.f a(byte[] bArr, int i2, boolean z) throws com.applovin.exoplayer2.i.h {
        b bVar;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.j.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new e(""));
            C0039c c0039cB = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i2), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVarA = h;
            a aVarA = i;
            h hVar = null;
            int i3 = 0;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                d dVar = (d) arrayDeque.peek();
                if (i3 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVarA = a(xmlPullParserNewPullParser);
                            aVarA = a(xmlPullParserNewPullParser, i);
                            c0039cB = b(xmlPullParserNewPullParser);
                        }
                        C0039c c0039c = c0039cB;
                        b bVar2 = bVarA;
                        a aVar = aVarA;
                        if (c(name)) {
                            if ("head".equals(name)) {
                                bVar = bVar2;
                                a(xmlPullParserNewPullParser, map, aVar, c0039c, map2, map3);
                            } else {
                                bVar = bVar2;
                                try {
                                    d dVarA = a(xmlPullParserNewPullParser, dVar, map2, bVar);
                                    arrayDeque.push(dVarA);
                                    if (dVar != null) {
                                        dVar.a(dVarA);
                                    }
                                } catch (com.applovin.exoplayer2.i.h e2) {
                                    q.b("TtmlDecoder", "Suppressing parser error", e2);
                                    i3++;
                                }
                            }
                            bVarA = bVar;
                        } else {
                            q.b("TtmlDecoder", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            i3++;
                            bVarA = bVar2;
                        }
                        c0039cB = c0039c;
                        aVarA = aVar;
                    } else if (eventType == 4) {
                        ((d) com.applovin.exoplayer2.l.a.b(dVar)).a(d.a(xmlPullParserNewPullParser.getText()));
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            hVar = new h((d) com.applovin.exoplayer2.l.a.b((d) arrayDeque.peek()), map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i3++;
                } else if (eventType == 3) {
                    i3--;
                }
                xmlPullParserNewPullParser.next();
            }
            if (hVar != null) {
                return hVar;
            }
            throw new com.applovin.exoplayer2.i.h("No TTML subtitles found");
        } catch (IOException e3) {
            throw new IllegalStateException("Unexpected error when reading input.", e3);
        } catch (XmlPullParserException e4) {
            throw new com.applovin.exoplayer2.i.h("Unable to decode source", e4);
        }
    }

    private static b a(XmlPullParser xmlPullParser) throws com.applovin.exoplayer2.i.h {
        float f2;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i2 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            if (ai.a(attributeValue2, " ").length != 2) {
                throw new com.applovin.exoplayer2.i.h("frameRateMultiplier doesn't have 2 parts");
            }
            f2 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f2 = 1.0f;
        }
        b bVar = h;
        int i3 = bVar.b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i3 = Integer.parseInt(attributeValue3);
        }
        int i4 = bVar.c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i4 = Integer.parseInt(attributeValue4);
        }
        return new b(i2 * f2, i3, i4);
    }

    private static a a(XmlPullParser xmlPullParser, a aVar) throws com.applovin.exoplayer2.i.h {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = g.matcher(attributeValue);
        if (!matcher.matches()) {
            q.c("TtmlDecoder", "Ignoring malformed cell resolution: " + attributeValue);
            return aVar;
        }
        try {
            int i2 = Integer.parseInt((String) com.applovin.exoplayer2.l.a.b(matcher.group(1)));
            int i3 = Integer.parseInt((String) com.applovin.exoplayer2.l.a.b(matcher.group(2)));
            if (i2 == 0 || i3 == 0) {
                throw new com.applovin.exoplayer2.i.h("Invalid cell resolution " + i2 + " " + i3);
            }
            return new a(i2, i3);
        } catch (NumberFormatException unused) {
            q.c("TtmlDecoder", "Ignoring malformed cell resolution: " + attributeValue);
            return aVar;
        }
    }

    private static C0039c b(XmlPullParser xmlPullParser) {
        String strC = aj.c(xmlPullParser, "extent");
        if (strC == null) {
            return null;
        }
        Matcher matcher = f.matcher(strC);
        if (!matcher.matches()) {
            q.c("TtmlDecoder", "Ignoring non-pixel tts extent: " + strC);
            return null;
        }
        try {
            return new C0039c(Integer.parseInt((String) com.applovin.exoplayer2.l.a.b(matcher.group(1))), Integer.parseInt((String) com.applovin.exoplayer2.l.a.b(matcher.group(2))));
        } catch (NumberFormatException unused) {
            q.c("TtmlDecoder", "Ignoring malformed tts extent: " + strC);
            return null;
        }
    }

    private static Map<String, g> a(XmlPullParser xmlPullParser, Map<String, g> map, a aVar, C0039c c0039c, Map<String, e> map2, Map<String, String> map3) throws XmlPullParserException, IOException {
        do {
            xmlPullParser.next();
            if (aj.b(xmlPullParser, TJAdUnitConstants.String.STYLE)) {
                String strC = aj.c(xmlPullParser, TJAdUnitConstants.String.STYLE);
                g gVarA = a(xmlPullParser, new g());
                if (strC != null) {
                    for (String str : a(strC)) {
                        gVarA.a(map.get(str));
                    }
                }
                String strJ = gVarA.j();
                if (strJ != null) {
                    map.put(strJ, gVarA);
                }
            } else if (aj.b(xmlPullParser, "region")) {
                e eVarA = a(xmlPullParser, aVar, c0039c);
                if (eVarA != null) {
                    map2.put(eVarA.f530a, eVarA);
                }
            } else if (aj.b(xmlPullParser, "metadata")) {
                a(xmlPullParser, map3);
            }
        } while (!aj.a(xmlPullParser, "head"));
        return map;
    }

    private static void a(XmlPullParser xmlPullParser, Map<String, String> map) throws XmlPullParserException, IOException {
        String strC;
        do {
            xmlPullParser.next();
            if (aj.b(xmlPullParser, "image") && (strC = aj.c(xmlPullParser, "id")) != null) {
                map.put(strC, xmlPullParser.nextText());
            }
        } while (!aj.a(xmlPullParser, "metadata"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.applovin.exoplayer2.i.g.e a(org.xmlpull.v1.XmlPullParser r17, com.applovin.exoplayer2.i.g.c.a r18, com.applovin.exoplayer2.i.g.c.C0039c r19) {
        /*
            Method dump skipped, instruction units count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.i.g.c.a(org.xmlpull.v1.XmlPullParser, com.applovin.exoplayer2.i.g.c$a, com.applovin.exoplayer2.i.g.c$c):com.applovin.exoplayer2.i.g.e");
    }

    private static String[] a(String str) {
        String strTrim = str.trim();
        return strTrim.isEmpty() ? new String[0] : ai.a(strTrim, "\\s+");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.applovin.exoplayer2.i.g.g a(org.xmlpull.v1.XmlPullParser r12, com.applovin.exoplayer2.i.g.g r13) {
        /*
            Method dump skipped, instruction units count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.i.g.c.a(org.xmlpull.v1.XmlPullParser, com.applovin.exoplayer2.i.g.g):com.applovin.exoplayer2.i.g.g");
    }

    private static g a(g gVar) {
        return gVar == null ? new g() : gVar;
    }

    private static Layout.Alignment b(String str) {
        String lowerCase = Ascii.toLowerCase(str);
        lowerCase.hashCode();
        switch (lowerCase) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.applovin.exoplayer2.i.g.d a(org.xmlpull.v1.XmlPullParser r20, com.applovin.exoplayer2.i.g.d r21, java.util.Map<java.lang.String, com.applovin.exoplayer2.i.g.e> r22, com.applovin.exoplayer2.i.g.c.b r23) throws com.applovin.exoplayer2.i.h {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.i.g.c.a(org.xmlpull.v1.XmlPullParser, com.applovin.exoplayer2.i.g.d, java.util.Map, com.applovin.exoplayer2.i.g.c$b):com.applovin.exoplayer2.i.g.d");
    }

    private static boolean c(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals(TJAdUnitConstants.String.STYLE) || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals(TJAdUnitConstants.String.DATA) || str.equals("information");
    }

    private static void a(String str, g gVar) throws com.applovin.exoplayer2.i.h {
        Matcher matcher;
        String str2;
        String[] strArrA = ai.a(str, "\\s+");
        if (strArrA.length == 1) {
            matcher = e.matcher(str);
        } else if (strArrA.length == 2) {
            matcher = e.matcher(strArrA[1]);
            q.c("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new com.applovin.exoplayer2.i.h("Invalid number of entries for fontSize: " + strArrA.length + ".");
        }
        if (matcher.matches()) {
            str2 = (String) com.applovin.exoplayer2.l.a.b(matcher.group(3));
            str2.hashCode();
            switch (str2) {
                case "%":
                    gVar.e(3);
                    break;
                case "em":
                    gVar.e(2);
                    break;
                case "px":
                    gVar.e(1);
                    break;
                default:
                    throw new com.applovin.exoplayer2.i.h("Invalid unit for fontSize: '" + str2 + "'.");
            }
            gVar.b(Float.parseFloat((String) com.applovin.exoplayer2.l.a.b(matcher.group(1))));
            return;
        }
        throw new com.applovin.exoplayer2.i.h("Invalid expression for fontSize: '" + str + "'.");
    }

    private static float d(String str) {
        Matcher matcher = f525a.matcher(str);
        if (!matcher.matches()) {
            q.c("TtmlDecoder", "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) com.applovin.exoplayer2.l.a.b(matcher.group(1)))));
        } catch (NumberFormatException e2) {
            q.b("TtmlDecoder", "Failed to parse shear: " + str, e2);
            return Float.MAX_VALUE;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long a(java.lang.String r13, com.applovin.exoplayer2.i.g.c.b r14) throws com.applovin.exoplayer2.i.h {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.i.g.c.a(java.lang.String, com.applovin.exoplayer2.i.g.c$b):long");
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final float f527a;
        final int b;
        final int c;

        b(float f, int i, int i2) {
            this.f527a = f;
            this.b = i;
            this.c = i2;
        }
    }

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f526a;
        final int b;

        a(int i, int i2) {
            this.f526a = i;
            this.b = i2;
        }
    }

    /* JADX INFO: renamed from: com.applovin.exoplayer2.i.g.c$c, reason: collision with other inner class name */
    private static final class C0039c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f528a;
        final int b;

        C0039c(int i, int i2) {
            this.f528a = i;
            this.b = i2;
        }
    }
}
