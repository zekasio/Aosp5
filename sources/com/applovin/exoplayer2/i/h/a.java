package com.applovin.exoplayer2.i.h;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.exoplayer2.i.a;
import com.applovin.exoplayer2.i.d;
import com.applovin.exoplayer2.i.f;
import com.applovin.exoplayer2.i.h;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.y;
import java.util.List;
import kotlin.UByte;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f533a;
    private final boolean b;
    private final int c;
    private final int d;
    private final String e;
    private final float f;
    private final int g;

    public a(List<byte[]> list) {
        super("Tx3gDecoder");
        this.f533a = new y();
        if (list.size() == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
            byte[] bArr = list.get(0);
            this.c = bArr[24];
            this.d = ((bArr[26] & UByte.MAX_VALUE) << 24) | ((bArr[27] & UByte.MAX_VALUE) << 16) | ((bArr[28] & UByte.MAX_VALUE) << 8) | (bArr[29] & UByte.MAX_VALUE);
            this.e = "Serif".equals(ai.a(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
            int i = bArr[25] * Ascii.DC4;
            this.g = i;
            boolean z = (bArr[0] & 32) != 0;
            this.b = z;
            if (z) {
                this.f = ai.a(((bArr[11] & UByte.MAX_VALUE) | ((bArr[10] & UByte.MAX_VALUE) << 8)) / i, 0.0f, 0.95f);
                return;
            } else {
                this.f = 0.85f;
                return;
            }
        }
        this.c = 0;
        this.d = -1;
        this.e = "sans-serif";
        this.b = false;
        this.f = 0.85f;
        this.g = -1;
    }

    @Override // com.applovin.exoplayer2.i.d
    protected f a(byte[] bArr, int i, boolean z) throws h {
        this.f533a.a(bArr, i);
        String strA = a(this.f533a);
        if (strA.isEmpty()) {
            return b.f534a;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strA);
        a(spannableStringBuilder, this.c, 0, 0, spannableStringBuilder.length(), 16711680);
        b(spannableStringBuilder, this.d, -1, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.e, 0, spannableStringBuilder.length());
        float fA = this.f;
        while (this.f533a.a() >= 8) {
            int iC = this.f533a.c();
            int iQ = this.f533a.q();
            int iQ2 = this.f533a.q();
            if (iQ2 == 1937013100) {
                a(this.f533a.a() >= 2);
                int i2 = this.f533a.i();
                for (int i3 = 0; i3 < i2; i3++) {
                    a(this.f533a, spannableStringBuilder);
                }
            } else if (iQ2 == 1952608120 && this.b) {
                a(this.f533a.a() >= 2);
                fA = ai.a(this.f533a.i() / this.g, 0.0f, 0.95f);
            }
            this.f533a.d(iC + iQ);
        }
        return new b(new a.C0033a().a(spannableStringBuilder).a(fA, 0).a(0).e());
    }

    private static String a(y yVar) throws h {
        char cG;
        a(yVar.a() >= 2);
        int i = yVar.i();
        if (i == 0) {
            return "";
        }
        if (yVar.a() >= 2 && ((cG = yVar.g()) == 65279 || cG == 65534)) {
            return yVar.a(i, Charsets.UTF_16);
        }
        return yVar.a(i, Charsets.UTF_8);
    }

    private void a(y yVar, SpannableStringBuilder spannableStringBuilder) throws h {
        a(yVar.a() >= 12);
        int i = yVar.i();
        int i2 = yVar.i();
        yVar.e(2);
        int iH = yVar.h();
        yVar.e(1);
        int iQ = yVar.q();
        if (i2 > spannableStringBuilder.length()) {
            q.c("Tx3gDecoder", "Truncating styl end (" + i2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            i2 = spannableStringBuilder.length();
        }
        if (i >= i2) {
            q.c("Tx3gDecoder", "Ignoring styl with start (" + i + ") >= end (" + i2 + ").");
            return;
        }
        int i3 = i2;
        a(spannableStringBuilder, iH, this.c, i, i3, 0);
        b(spannableStringBuilder, iQ, this.d, i, i3, 0);
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
        }
    }

    private static void b(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, String str, int i, int i2) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i, i2, 16711713);
        }
    }

    private static void a(boolean z) throws h {
        if (!z) {
            throw new h("Unexpected subtitle format.");
        }
    }
}
