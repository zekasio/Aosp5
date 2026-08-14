package com.applovin.impl.sdk.utils;

import android.util.Xml;
import com.applovin.impl.sdk.y;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f1502a;
    private Stack<a> b;
    private StringBuilder c;
    private long d;
    private a e;

    u(com.applovin.impl.sdk.p pVar) {
        if (pVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f1502a = pVar.L();
    }

    public static t a(String str, com.applovin.impl.sdk.p pVar) throws SAXException {
        return new u(pVar).a(str);
    }

    public t a(String str) throws SAXException {
        if (str == null) {
            throw new IllegalArgumentException("Unable to parse. No XML specified.");
        }
        this.c = new StringBuilder();
        this.b = new Stack<>();
        this.e = null;
        Xml.parse(str, new ContentHandler() { // from class: com.applovin.impl.sdk.utils.u.1
            @Override // org.xml.sax.ContentHandler
            public void endPrefixMapping(String str2) {
            }

            @Override // org.xml.sax.ContentHandler
            public void ignorableWhitespace(char[] cArr, int i, int i2) {
            }

            @Override // org.xml.sax.ContentHandler
            public void processingInstruction(String str2, String str3) {
            }

            @Override // org.xml.sax.ContentHandler
            public void setDocumentLocator(Locator locator) {
            }

            @Override // org.xml.sax.ContentHandler
            public void skippedEntity(String str2) {
            }

            @Override // org.xml.sax.ContentHandler
            public void startPrefixMapping(String str2, String str3) {
            }

            @Override // org.xml.sax.ContentHandler
            public void startDocument() {
                y unused = u.this.f1502a;
                if (y.a()) {
                    u.this.f1502a.b("XmlParser", "Begin parsing...");
                }
                u.this.d = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
            }

            @Override // org.xml.sax.ContentHandler
            public void endDocument() {
                long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - u.this.d;
                y unused = u.this.f1502a;
                if (y.a()) {
                    u.this.f1502a.b("XmlParser", "Finished parsing in " + seconds + " seconds");
                }
            }

            @Override // org.xml.sax.ContentHandler
            public void startElement(String str2, String str3, String str4, Attributes attributes) throws SAXException {
                try {
                    a aVar = !u.this.b.isEmpty() ? (a) u.this.b.peek() : null;
                    a aVar2 = new a(str3, u.this.a(attributes), aVar);
                    if (aVar != null) {
                        aVar.a(aVar2);
                    }
                    u.this.b.push(aVar2);
                } catch (Exception e) {
                    y unused = u.this.f1502a;
                    if (y.a()) {
                        u.this.f1502a.b("XmlParser", "Unable to process element <" + str3 + ">", e);
                    }
                    throw new SAXException("Failed to start element", e);
                }
            }

            @Override // org.xml.sax.ContentHandler
            public void endElement(String str2, String str3, String str4) {
                u uVar = u.this;
                uVar.e = (a) uVar.b.pop();
                u.this.e.d(u.this.c.toString().trim());
                u.this.c.setLength(0);
            }

            @Override // org.xml.sax.ContentHandler
            public void characters(char[] cArr, int i, int i2) {
                String strTrim = new String(Arrays.copyOfRange(cArr, i, i2)).trim();
                if (StringUtils.isValidString(strTrim)) {
                    u.this.c.append(strTrim);
                }
            }
        });
        a aVar = this.e;
        if (aVar != null) {
            return aVar;
        }
        throw new SAXException("Unable to parse XML into node");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> a(Attributes attributes) {
        if (attributes != null) {
            int length = attributes.getLength();
            Map<String, String> map = CollectionUtils.map(length);
            for (int i = 0; i < length; i++) {
                map.put(attributes.getQName(i), attributes.getValue(i));
            }
            return map;
        }
        return Collections.emptyMap();
    }

    private static class a extends t {
        a(String str, Map<String, String> map, t tVar) {
            super(str, map, tVar);
        }

        void d(String str) {
            this.b = str;
        }

        void a(t tVar) {
            if (tVar == null) {
                throw new IllegalArgumentException("None specified.");
            }
            this.c.add(tVar);
        }
    }
}
