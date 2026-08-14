package com.applovin.exoplayer2.e.d;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.common.a.s;
import com.applovin.exoplayer2.e.d.b;
import com.applovin.exoplayer2.l.aj;
import com.applovin.exoplayer2.l.q;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f278a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static b a(String str) throws IOException {
        try {
            return b(str);
        } catch (ai | NumberFormatException | XmlPullParserException unused) {
            q.c("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static b b(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!aj.b(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw ai.b("Couldn't find xmp metadata", null);
        }
        s<b.a> sVarG = s.g();
        long jB = -9223372036854775807L;
        do {
            xmlPullParserNewPullParser.next();
            if (aj.b(xmlPullParserNewPullParser, "rdf:Description")) {
                if (!a(xmlPullParserNewPullParser)) {
                    return null;
                }
                jB = b(xmlPullParserNewPullParser);
                sVarG = c(xmlPullParserNewPullParser);
            } else if (aj.b(xmlPullParserNewPullParser, "Container:Directory")) {
                sVarG = a(xmlPullParserNewPullParser, "Container", "Item");
            } else if (aj.b(xmlPullParserNewPullParser, "GContainer:Directory")) {
                sVarG = a(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!aj.a(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (sVarG.isEmpty()) {
            return null;
        }
        return new b(jB, sVarG);
    }

    private static boolean a(XmlPullParser xmlPullParser) {
        for (String str : f278a) {
            String strC = aj.c(xmlPullParser, str);
            if (strC != null) {
                return Integer.parseInt(strC) == 1;
            }
        }
        return false;
    }

    private static long b(XmlPullParser xmlPullParser) {
        for (String str : b) {
            String strC = aj.c(xmlPullParser, str);
            if (strC != null) {
                long j = Long.parseLong(strC);
                if (j == -1) {
                    return -9223372036854775807L;
                }
                return j;
            }
        }
        return -9223372036854775807L;
    }

    private static s<b.a> c(XmlPullParser xmlPullParser) {
        for (String str : c) {
            String strC = aj.c(xmlPullParser, str);
            if (strC != null) {
                return s.a(new b.a("image/jpeg", "Primary", 0L, 0L), new b.a("video/mp4", "MotionPhoto", Long.parseLong(strC), 0L));
            }
        }
        return s.g();
    }

    private static s<b.a> a(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        s.a aVarI = s.i();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (aj.b(xmlPullParser, str3)) {
                String strC = aj.c(xmlPullParser, str2 + ":Mime");
                String strC2 = aj.c(xmlPullParser, str2 + ":Semantic");
                String strC3 = aj.c(xmlPullParser, str2 + ":Length");
                String strC4 = aj.c(xmlPullParser, str2 + ":Padding");
                if (strC == null || strC2 == null) {
                    return s.g();
                }
                aVarI.a(new b.a(strC, strC2, strC3 != null ? Long.parseLong(strC3) : 0L, strC4 != null ? Long.parseLong(strC4) : 0L));
            }
        } while (!aj.a(xmlPullParser, str4));
        return aVarI.a();
    }
}
