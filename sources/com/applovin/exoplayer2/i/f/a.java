package com.applovin.exoplayer2.i.f;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.applovin.exoplayer2.i.d;
import com.applovin.exoplayer2.i.f;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.r;
import com.applovin.exoplayer2.l.y;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f522a = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    private static final Pattern b = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder c;
    private final ArrayList<String> d;

    public a() {
        super("SubripDecoder");
        this.c = new StringBuilder();
        this.d = new ArrayList<>();
    }

    @Override // com.applovin.exoplayer2.i.d
    protected f a(byte[] bArr, int i, boolean z) {
        String str;
        ArrayList arrayList = new ArrayList();
        r rVar = new r();
        y yVar = new y(bArr, i);
        while (true) {
            String strC = yVar.C();
            int i2 = 0;
            if (strC == null) {
                break;
            }
            if (strC.length() != 0) {
                try {
                    Integer.parseInt(strC);
                    String strC2 = yVar.C();
                    if (strC2 == null) {
                        q.c("SubripDecoder", "Unexpected end");
                        break;
                    }
                    Matcher matcher = f522a.matcher(strC2);
                    if (!matcher.matches()) {
                        q.c("SubripDecoder", "Skipping invalid timing: " + strC2);
                    } else {
                        rVar.a(a(matcher, 1));
                        rVar.a(a(matcher, 6));
                        this.c.setLength(0);
                        this.d.clear();
                        for (String strC3 = yVar.C(); !TextUtils.isEmpty(strC3); strC3 = yVar.C()) {
                            if (this.c.length() > 0) {
                                this.c.append("<br>");
                            }
                            this.c.append(a(strC3, this.d));
                        }
                        Spanned spannedFromHtml = Html.fromHtml(this.c.toString());
                        while (true) {
                            if (i2 >= this.d.size()) {
                                str = null;
                                break;
                            }
                            str = this.d.get(i2);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            }
                            i2++;
                        }
                        arrayList.add(a(spannedFromHtml, str));
                        arrayList.add(com.applovin.exoplayer2.i.a.f486a);
                    }
                } catch (NumberFormatException unused) {
                    q.c("SubripDecoder", "Skipping invalid index: " + strC);
                }
            }
        }
        return new b((com.applovin.exoplayer2.i.a[]) arrayList.toArray(new com.applovin.exoplayer2.i.a[0]), rVar.b());
    }

    private String a(String str, ArrayList<String> arrayList) {
        String strTrim = str.trim();
        StringBuilder sb = new StringBuilder(strTrim);
        Matcher matcher = b.matcher(strTrim);
        int i = 0;
        while (matcher.find()) {
            String strGroup = matcher.group();
            arrayList.add(strGroup);
            int iStart = matcher.start() - i;
            int length = strGroup.length();
            sb.replace(iStart, iStart + length, "");
            i += length;
        }
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.applovin.exoplayer2.i.a a(android.text.Spanned r17, java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.i.f.a.a(android.text.Spanned, java.lang.String):com.applovin.exoplayer2.i.a");
    }

    private static long a(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j = (strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L) + (Long.parseLong((String) com.applovin.exoplayer2.l.a.b(matcher.group(i + 2))) * 60000) + (Long.parseLong((String) com.applovin.exoplayer2.l.a.b(matcher.group(i + 3))) * 1000);
        String strGroup2 = matcher.group(i + 4);
        if (strGroup2 != null) {
            j += Long.parseLong(strGroup2);
        }
        return j * 1000;
    }

    static float b(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i == 1) {
            return 0.5f;
        }
        if (i == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }
}
