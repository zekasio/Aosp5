package com.applovin.exoplayer2.i.e;

import android.text.Layout;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.work.WorkRequest;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.i.a;
import com.applovin.exoplayer2.i.e.c;
import com.applovin.exoplayer2.i.f;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.y;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class a extends com.applovin.exoplayer2.i.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f516a = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private final boolean b;
    private final b c;
    private Map<String, c> d;
    private float e;
    private float f;

    private static float e(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    public a() {
        this(null);
    }

    public a(List<byte[]> list) {
        super("SsaDecoder");
        this.e = -3.4028235E38f;
        this.f = -3.4028235E38f;
        if (list != null && !list.isEmpty()) {
            this.b = true;
            String strA = ai.a(list.get(0));
            com.applovin.exoplayer2.l.a.a(strA.startsWith("Format:"));
            this.c = (b) com.applovin.exoplayer2.l.a.b(b.a(strA));
            a(new y(list.get(1)));
            return;
        }
        this.b = false;
        this.c = null;
    }

    @Override // com.applovin.exoplayer2.i.d
    protected f a(byte[] bArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        y yVar = new y(bArr, i);
        if (!this.b) {
            a(yVar);
        }
        a(yVar, arrayList, arrayList2);
        return new d(arrayList, arrayList2);
    }

    private void a(y yVar) {
        while (true) {
            String strC = yVar.C();
            if (strC == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strC)) {
                b(yVar);
            } else if ("[V4+ Styles]".equalsIgnoreCase(strC)) {
                this.d = c(yVar);
            } else if ("[V4 Styles]".equalsIgnoreCase(strC)) {
                q.b("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strC)) {
                return;
            }
        }
    }

    private void b(y yVar) {
        while (true) {
            String strC = yVar.C();
            if (strC == null) {
                return;
            }
            if (yVar.a() != 0 && yVar.f() == 91) {
                return;
            }
            String[] strArrSplit = strC.split(":");
            if (strArrSplit.length == 2) {
                String lowerCase = Ascii.toLowerCase(strArrSplit[0].trim());
                lowerCase.hashCode();
                if (lowerCase.equals("playresx")) {
                    this.e = Float.parseFloat(strArrSplit[1].trim());
                } else if (lowerCase.equals("playresy")) {
                    try {
                        this.f = Float.parseFloat(strArrSplit[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }

    private static Map<String, c> c(y yVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c.a aVarA = null;
        while (true) {
            String strC = yVar.C();
            if (strC == null || (yVar.a() != 0 && yVar.f() == 91)) {
                break;
            }
            if (strC.startsWith("Format:")) {
                aVarA = c.a.a(strC);
            } else if (strC.startsWith("Style:")) {
                if (aVarA == null) {
                    q.c("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: " + strC);
                } else {
                    c cVarA = c.a(strC, aVarA);
                    if (cVarA != null) {
                        linkedHashMap.put(cVarA.f518a, cVarA);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private void a(y yVar, List<List<com.applovin.exoplayer2.i.a>> list, List<Long> list2) {
        b bVarA = this.b ? this.c : null;
        while (true) {
            String strC = yVar.C();
            if (strC == null) {
                return;
            }
            if (strC.startsWith("Format:")) {
                bVarA = b.a(strC);
            } else if (strC.startsWith("Dialogue:")) {
                if (bVarA == null) {
                    q.c("SsaDecoder", "Skipping dialogue line before complete format: " + strC);
                } else {
                    a(strC, bVarA, list, list2);
                }
            }
        }
    }

    private void a(String str, b bVar, List<List<com.applovin.exoplayer2.i.a>> list, List<Long> list2) {
        com.applovin.exoplayer2.l.a.a(str.startsWith("Dialogue:"));
        String[] strArrSplit = str.substring(9).split(",", bVar.e);
        if (strArrSplit.length != bVar.e) {
            q.c("SsaDecoder", "Skipping dialogue line with fewer columns than format: " + str);
            return;
        }
        long jA = a(strArrSplit[bVar.f517a]);
        if (jA == -9223372036854775807L) {
            q.c("SsaDecoder", "Skipping invalid timing: " + str);
            return;
        }
        long jA2 = a(strArrSplit[bVar.b]);
        if (jA2 == -9223372036854775807L) {
            q.c("SsaDecoder", "Skipping invalid timing: " + str);
            return;
        }
        c cVar = (this.d == null || bVar.c == -1) ? null : this.d.get(strArrSplit[bVar.c].trim());
        String str2 = strArrSplit[bVar.d];
        com.applovin.exoplayer2.i.a aVarA = a(c.b.b(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), cVar, c.b.a(str2), this.e, this.f);
        int iA = a(jA2, list2, list);
        for (int iA2 = a(jA, list2, list); iA2 < iA; iA2++) {
            list.get(iA2).add(aVarA);
        }
    }

    private static long a(String str) {
        Matcher matcher = f516a.matcher(str.trim());
        if (matcher.matches()) {
            return (Long.parseLong((String) ai.a(matcher.group(1))) * 3600000000L) + (Long.parseLong((String) ai.a(matcher.group(2))) * 60000000) + (Long.parseLong((String) ai.a(matcher.group(3))) * 1000000) + (Long.parseLong((String) ai.a(matcher.group(4))) * WorkRequest.MIN_BACKOFF_MILLIS);
        }
        return -9223372036854775807L;
    }

    private static com.applovin.exoplayer2.i.a a(String str, c cVar, c.b bVar, float f, float f2) {
        SpannableString spannableString = new SpannableString(str);
        a.C0033a c0033aA = new a.C0033a().a(spannableString);
        if (cVar != null) {
            if (cVar.c != null) {
                spannableString.setSpan(new ForegroundColorSpan(cVar.c.intValue()), 0, spannableString.length(), 33);
            }
            if (cVar.d != -3.4028235E38f && f2 != -3.4028235E38f) {
                c0033aA.b(cVar.d / f2, 1);
            }
            if (cVar.e && cVar.f) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (cVar.e) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (cVar.f) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (cVar.g) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (cVar.h) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i = -1;
        if (bVar.f520a != -1) {
            i = bVar.f520a;
        } else if (cVar != null) {
            i = cVar.b;
        }
        c0033aA.a(b(i)).b(d(i)).a(c(i));
        if (bVar.b != null && f2 != -3.4028235E38f && f != -3.4028235E38f) {
            c0033aA.a(bVar.b.x / f);
            c0033aA.a(bVar.b.y / f2, 0);
        } else {
            c0033aA.a(e(c0033aA.c()));
            c0033aA.a(e(c0033aA.b()), 0);
        }
        return c0033aA.e();
    }

    private static Layout.Alignment b(int i) {
        switch (i) {
            case -1:
                return null;
            case 0:
            default:
                q.c("SsaDecoder", "Unknown alignment: " + i);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    private static int c(int i) {
        switch (i) {
            case -1:
                break;
            case 0:
            default:
                q.c("SsaDecoder", "Unknown alignment: " + i);
                break;
            case 1:
            case 2:
            case 3:
                break;
            case 4:
            case 5:
            case 6:
                break;
            case 7:
            case 8:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    private static int d(int i) {
        switch (i) {
            case -1:
                break;
            case 0:
            default:
                q.c("SsaDecoder", "Unknown alignment: " + i);
                break;
            case 1:
            case 4:
            case 7:
                break;
            case 2:
            case 5:
            case 8:
                break;
            case 3:
            case 6:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    private static int a(long j, List<Long> list, List<List<com.applovin.exoplayer2.i.a>> list2) {
        int i;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (list.get(size).longValue() == j) {
                return size;
            }
            if (list.get(size).longValue() < j) {
                i = size + 1;
                break;
            }
            size--;
        }
        list.add(i, Long.valueOf(j));
        list2.add(i, i == 0 ? new ArrayList() : new ArrayList(list2.get(i - 1)));
        return i;
    }
}
