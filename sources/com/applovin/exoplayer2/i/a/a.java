package com.applovin.exoplayer2.i.a;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.i.a;
import com.applovin.exoplayer2.i.f;
import com.applovin.exoplayer2.i.h;
import com.applovin.exoplayer2.i.j;
import com.applovin.exoplayer2.i.k;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.y;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.drive.MetadataChangeSet;
import cz.msebera.android.httpclient.HttpStatus;
import cz.msebera.android.httpclient.message.TokenParser;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f488a = {11, 1, 3, 12, 14, 5, 7, 9};
    private static final int[] b = {0, 4, 8, 12, 16, 20, 24, 28};
    private static final int[] c = {-1, -16711936, -16776961, -16711681, SupportMenu.CATEGORY_MASK, InputDeviceCompat.SOURCE_ANY, -65281};
    private static final int[] d = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    private static final int[] e = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    private static final int[] f = {193, HttpStatus.SC_CREATED, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, HttpStatus.SC_ACCEPTED, HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION, 235, HttpStatus.SC_PARTIAL_CONTENT, HttpStatus.SC_MULTI_STATUS, 239, 212, 217, 249, 219, 171, 187};
    private static final int[] g = {195, 227, HttpStatus.SC_RESET_CONTENT, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, MetadataChangeSet.CUSTOM_PROPERTY_SIZE_LIMIT_BYTES, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    private static final boolean[] h = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    private final int j;
    private final int k;
    private final int l;
    private final long m;
    private List<com.applovin.exoplayer2.i.a> p;
    private List<com.applovin.exoplayer2.i.a> q;
    private int r;
    private int s;
    private boolean t;
    private boolean u;
    private byte v;
    private byte w;
    private boolean y;
    private long z;
    private final y i = new y();
    private final ArrayList<C0034a> n = new ArrayList<>();
    private C0034a o = new C0034a(0, 4);
    private int x = 0;

    private static boolean c(byte b2, byte b3) {
        return (b2 & 247) == 17 && (b3 & 240) == 48;
    }

    private static boolean d(byte b2, byte b3) {
        return (b2 & 246) == 18 && (b3 & 224) == 32;
    }

    private static boolean f(byte b2, byte b3) {
        return (b2 & 247) == 17 && (b3 & 240) == 32;
    }

    private static boolean g(byte b2, byte b3) {
        return (b2 & 240) == 16 && (b3 & 192) == 64;
    }

    private static boolean h(byte b2) {
        return (b2 & 224) == 0;
    }

    private static boolean h(byte b2, byte b3) {
        return (b2 & 247) == 23 && b3 >= 33 && b3 <= 35;
    }

    private static int i(byte b2) {
        return (b2 >> 3) & 1;
    }

    private static boolean i(byte b2, byte b3) {
        return (b2 & 246) == 20 && (b3 & 240) == 32;
    }

    private static boolean j(byte b2) {
        return (b2 & 240) == 16;
    }

    private static boolean k(byte b2) {
        return 1 <= b2 && b2 <= 15;
    }

    private static boolean l(byte b2) {
        return (b2 & 247) == 20;
    }

    @Override // com.applovin.exoplayer2.i.a.c, com.applovin.exoplayer2.c.d
    public void d() {
    }

    @Override // com.applovin.exoplayer2.i.a.c, com.applovin.exoplayer2.i.g
    public /* bridge */ /* synthetic */ void a(long j) {
        super.a(j);
    }

    @Override // com.applovin.exoplayer2.i.a.c
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ void a(j jVar) throws h {
        super.a(jVar);
    }

    @Override // com.applovin.exoplayer2.i.a.c
    /* JADX INFO: renamed from: h */
    public /* bridge */ /* synthetic */ j a() throws h {
        return super.a();
    }

    public a(String str, int i, long j) {
        this.m = j > 0 ? j * 1000 : -9223372036854775807L;
        this.j = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.l = 0;
            this.k = 0;
        } else if (i == 2) {
            this.l = 1;
            this.k = 0;
        } else if (i == 3) {
            this.l = 0;
            this.k = 1;
        } else if (i == 4) {
            this.l = 1;
            this.k = 1;
        } else {
            q.c("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.l = 0;
            this.k = 0;
        }
        a(0);
        m();
        this.y = true;
        this.z = -9223372036854775807L;
    }

    @Override // com.applovin.exoplayer2.i.a.c, com.applovin.exoplayer2.c.d
    public void c() {
        super.c();
        this.p = null;
        this.q = null;
        a(0);
        b(4);
        m();
        this.t = false;
        this.u = false;
        this.v = (byte) 0;
        this.w = (byte) 0;
        this.x = 0;
        this.y = true;
        this.z = -9223372036854775807L;
    }

    @Override // com.applovin.exoplayer2.i.a.c, com.applovin.exoplayer2.c.d
    /* JADX INFO: renamed from: e */
    public k b() throws h {
        k kVarJ;
        k kVarB = super.b();
        if (kVarB != null) {
            return kVarB;
        }
        if (!n() || (kVarJ = j()) == null) {
            return null;
        }
        this.p = Collections.emptyList();
        this.z = -9223372036854775807L;
        kVarJ.a(k(), g(), Long.MAX_VALUE);
        return kVarJ;
    }

    @Override // com.applovin.exoplayer2.i.a.c
    protected boolean f() {
        return this.p != this.q;
    }

    @Override // com.applovin.exoplayer2.i.a.c
    protected f g() {
        List<com.applovin.exoplayer2.i.a> list = this.p;
        this.q = list;
        return new d((List) com.applovin.exoplayer2.l.a.b(list));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    @Override // com.applovin.exoplayer2.i.a.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void a(com.applovin.exoplayer2.i.j r10) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.i.a.a.a(com.applovin.exoplayer2.i.j):void");
    }

    private boolean a(byte b2) {
        if (h(b2)) {
            this.x = i(b2);
        }
        return this.x == this.l;
    }

    private boolean a(boolean z, byte b2, byte b3) {
        if (z && j(b2)) {
            if (this.u && this.v == b2 && this.w == b3) {
                this.u = false;
                return true;
            }
            this.u = true;
            this.v = b2;
            this.w = b3;
        } else {
            this.u = false;
        }
        return false;
    }

    private void b(byte b2) {
        this.o.a(TokenParser.SP);
        this.o.a((b2 >> 1) & 7, (b2 & 1) == 1);
    }

    private void a(byte b2, byte b3) {
        int i = f488a[b2 & 7];
        if ((b3 & 32) != 0) {
            i++;
        }
        if (i != this.o.d) {
            if (this.r != 1 && !this.o.a()) {
                C0034a c0034a = new C0034a(this.r, this.s);
                this.o = c0034a;
                this.n.add(c0034a);
            }
            this.o.d = i;
        }
        boolean z = (b3 & Ascii.DLE) == 16;
        boolean z2 = (b3 & 1) == 1;
        int i2 = (b3 >> 1) & 7;
        this.o.a(z ? 8 : i2, z2);
        if (z) {
            this.o.e = b[i2];
        }
    }

    private void c(byte b2) {
        if (b2 == 32) {
            a(2);
            return;
        }
        if (b2 != 41) {
            switch (b2) {
                case 37:
                    a(1);
                    b(2);
                    break;
                case 38:
                    a(1);
                    b(3);
                    break;
                case 39:
                    a(1);
                    b(4);
                    break;
                default:
                    int i = this.r;
                    if (i != 0) {
                        if (b2 != 33) {
                            switch (b2) {
                                case 44:
                                    this.p = Collections.emptyList();
                                    int i2 = this.r;
                                    if (i2 == 1 || i2 == 3) {
                                        m();
                                    }
                                    break;
                                case 45:
                                    if (i == 1 && !this.o.a()) {
                                        this.o.c();
                                        break;
                                    }
                                    break;
                                case 46:
                                    m();
                                    break;
                                case 47:
                                    this.p = l();
                                    m();
                                    break;
                            }
                        } else {
                            this.o.b();
                            break;
                        }
                    }
                    break;
            }
            return;
        }
        a(3);
    }

    private List<com.applovin.exoplayer2.i.a> l() {
        int size = this.n.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i = 0; i < size; i++) {
            com.applovin.exoplayer2.i.a aVarD = this.n.get(i).d(Integer.MIN_VALUE);
            arrayList.add(aVarD);
            if (aVarD != null) {
                iMin = Math.min(iMin, aVarD.j);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            com.applovin.exoplayer2.i.a aVar = (com.applovin.exoplayer2.i.a) arrayList.get(i2);
            if (aVar != null) {
                if (aVar.j != iMin) {
                    aVar = (com.applovin.exoplayer2.i.a) com.applovin.exoplayer2.l.a.b(this.n.get(i2).d(iMin));
                }
                arrayList2.add(aVar);
            }
        }
        return arrayList2;
    }

    private void a(int i) {
        int i2 = this.r;
        if (i2 == i) {
            return;
        }
        this.r = i;
        if (i == 3) {
            for (int i3 = 0; i3 < this.n.size(); i3++) {
                this.n.get(i3).b(i);
            }
            return;
        }
        m();
        if (i2 == 3 || i == 1 || i == 0) {
            this.p = Collections.emptyList();
        }
    }

    private void b(int i) {
        this.s = i;
        this.o.c(i);
    }

    private void m() {
        this.o.a(this.r);
        this.n.clear();
        this.n.add(this.o);
    }

    private void b(byte b2, byte b3) {
        if (k(b2)) {
            this.y = false;
            return;
        }
        if (l(b2)) {
            if (b3 != 32 && b3 != 47) {
                switch (b3) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b3) {
                            case 42:
                            case 43:
                                this.y = false;
                                break;
                        }
                }
            }
            this.y = true;
        }
    }

    private static char d(byte b2) {
        return (char) d[(b2 & 127) - 32];
    }

    private static char e(byte b2) {
        return (char) e[b2 & Ascii.SI];
    }

    private static char e(byte b2, byte b3) {
        if ((b2 & 1) == 0) {
            return f(b3);
        }
        return g(b3);
    }

    private static char f(byte b2) {
        return (char) f[b2 & Ascii.US];
    }

    private static char g(byte b2) {
        return (char) g[b2 & Ascii.US];
    }

    /* JADX INFO: renamed from: com.applovin.exoplayer2.i.a.a$a, reason: collision with other inner class name */
    private static final class C0034a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<C0035a> f489a = new ArrayList();
        private final List<SpannableString> b = new ArrayList();
        private final StringBuilder c = new StringBuilder();
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;

        public C0034a(int i, int i2) {
            a(i);
            this.h = i2;
        }

        public void a(int i) {
            this.g = i;
            this.f489a.clear();
            this.b.clear();
            this.c.setLength(0);
            this.d = 15;
            this.e = 0;
            this.f = 0;
        }

        public boolean a() {
            return this.f489a.isEmpty() && this.b.isEmpty() && this.c.length() == 0;
        }

        public void b(int i) {
            this.g = i;
        }

        public void c(int i) {
            this.h = i;
        }

        public void a(int i, boolean z) {
            this.f489a.add(new C0035a(i, z, this.c.length()));
        }

        public void b() {
            int length = this.c.length();
            if (length > 0) {
                this.c.delete(length - 1, length);
                for (int size = this.f489a.size() - 1; size >= 0; size--) {
                    if (this.f489a.get(size).c != length) {
                        return;
                    }
                    r2.c--;
                }
            }
        }

        public void a(char c) {
            if (this.c.length() < 32) {
                this.c.append(c);
            }
        }

        public void c() {
            this.b.add(d());
            this.c.setLength(0);
            this.f489a.clear();
            int iMin = Math.min(this.h, this.d);
            while (this.b.size() >= iMin) {
                this.b.remove(0);
            }
        }

        public com.applovin.exoplayer2.i.a d(int i) {
            float f;
            int i2 = this.e + this.f;
            int i3 = 32 - i2;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i4 = 0; i4 < this.b.size(); i4++) {
                spannableStringBuilder.append(ai.a(this.b.get(i4), i3));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(ai.a(d(), i3));
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length = i3 - spannableStringBuilder.length();
            int i5 = i2 - length;
            if (i == Integer.MIN_VALUE) {
                if (this.g != 2 || (Math.abs(i5) >= 3 && length >= 0)) {
                    i = (this.g != 2 || i5 <= 0) ? 0 : 2;
                } else {
                    i = 1;
                }
            }
            if (i != 1) {
                if (i == 2) {
                    i2 = 32 - length;
                }
                f = ((i2 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f = 0.5f;
            }
            int i6 = this.d;
            if (i6 > 7) {
                i6 -= 17;
            } else if (this.g == 1) {
                i6 -= this.h - 1;
            }
            return new a.C0033a().a(spannableStringBuilder).a(Layout.Alignment.ALIGN_NORMAL).a(i6, 1).a(f).b(i).e();
        }

        private SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.c);
            int length = spannableStringBuilder.length();
            int i = 0;
            int i2 = -1;
            int i3 = -1;
            int i4 = 0;
            int i5 = -1;
            int i6 = -1;
            boolean z = false;
            while (i < this.f489a.size()) {
                C0035a c0035a = this.f489a.get(i);
                boolean z2 = c0035a.b;
                int i7 = c0035a.f490a;
                if (i7 != 8) {
                    boolean z3 = i7 == 7;
                    if (i7 != 7) {
                        i6 = a.c[i7];
                    }
                    z = z3;
                }
                int i8 = c0035a.c;
                i++;
                if (i8 != (i < this.f489a.size() ? this.f489a.get(i).c : length)) {
                    if (i2 != -1 && !z2) {
                        a(spannableStringBuilder, i2, i8);
                        i2 = -1;
                    } else if (i2 == -1 && z2) {
                        i2 = i8;
                    }
                    if (i3 != -1 && !z) {
                        b(spannableStringBuilder, i3, i8);
                        i3 = -1;
                    } else if (i3 == -1 && z) {
                        i3 = i8;
                    }
                    if (i6 != i5) {
                        a(spannableStringBuilder, i4, i8, i5);
                        i5 = i6;
                        i4 = i8;
                    }
                }
            }
            if (i2 != -1 && i2 != length) {
                a(spannableStringBuilder, i2, length);
            }
            if (i3 != -1 && i3 != length) {
                b(spannableStringBuilder, i3, length);
            }
            if (i4 != length) {
                a(spannableStringBuilder, i4, length, i5);
            }
            return new SpannableString(spannableStringBuilder);
        }

        private static void a(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }

        private static void b(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
        }

        private static void a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
            if (i3 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
        }

        /* JADX INFO: renamed from: com.applovin.exoplayer2.i.a.a$a$a, reason: collision with other inner class name */
        private static class C0035a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f490a;
            public final boolean b;
            public int c;

            public C0035a(int i, boolean z, int i2) {
                this.f490a = i;
                this.b = z;
                this.c = i2;
            }
        }
    }

    private boolean n() {
        return (this.m == -9223372036854775807L || this.z == -9223372036854775807L || k() - this.z < this.m) ? false : true;
    }
}
