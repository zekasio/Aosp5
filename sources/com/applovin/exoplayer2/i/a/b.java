package com.applovin.exoplayer2.i.a;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.applovin.exoplayer2.i.a;
import com.applovin.exoplayer2.i.a.b;
import com.applovin.exoplayer2.i.f;
import com.applovin.exoplayer2.i.h;
import com.applovin.exoplayer2.i.j;
import com.applovin.exoplayer2.i.k;
import com.applovin.exoplayer2.l.e;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.x;
import com.applovin.exoplayer2.l.y;
import com.google.android.gms.drive.MetadataChangeSet;
import cz.msebera.android.httpclient.message.TokenParser;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
public final class b extends com.applovin.exoplayer2.i.a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f491a = new y();
    private final x b = new x();
    private int c = -1;
    private final boolean d;
    private final int e;
    private final C0036b[] f;
    private C0036b g;
    private List<com.applovin.exoplayer2.i.a> h;
    private List<com.applovin.exoplayer2.i.a> i;
    private c j;
    private int k;

    @Override // com.applovin.exoplayer2.i.a.c, com.applovin.exoplayer2.i.g
    public /* bridge */ /* synthetic */ void a(long j) {
        super.a(j);
    }

    @Override // com.applovin.exoplayer2.i.a.c
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ void a(j jVar) throws h {
        super.a(jVar);
    }

    @Override // com.applovin.exoplayer2.i.a.c, com.applovin.exoplayer2.c.d
    public /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    @Override // com.applovin.exoplayer2.i.a.c
    /* JADX INFO: renamed from: e */
    public /* bridge */ /* synthetic */ k b() throws h {
        return super.b();
    }

    @Override // com.applovin.exoplayer2.i.a.c
    /* JADX INFO: renamed from: h */
    public /* bridge */ /* synthetic */ j a() throws h {
        return super.a();
    }

    public b(int i, List<byte[]> list) {
        this.e = i == -1 ? 1 : i;
        this.d = list != null && e.a(list);
        this.f = new C0036b[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.f[i2] = new C0036b();
        }
        this.g = this.f[0];
    }

    @Override // com.applovin.exoplayer2.i.a.c, com.applovin.exoplayer2.c.d
    public void c() {
        super.c();
        this.h = null;
        this.i = null;
        this.k = 0;
        this.g = this.f[0];
        r();
        this.j = null;
    }

    @Override // com.applovin.exoplayer2.i.a.c
    protected boolean f() {
        return this.h != this.i;
    }

    @Override // com.applovin.exoplayer2.i.a.c
    protected f g() {
        List<com.applovin.exoplayer2.i.a> list = this.h;
        this.i = list;
        return new d((List) com.applovin.exoplayer2.l.a.b(list));
    }

    @Override // com.applovin.exoplayer2.i.a.c
    protected void a(j jVar) {
        ByteBuffer byteBuffer = (ByteBuffer) com.applovin.exoplayer2.l.a.b(jVar.b);
        this.f491a.a(byteBuffer.array(), byteBuffer.limit());
        while (this.f491a.a() >= 3) {
            int iH = this.f491a.h();
            int i = iH & 3;
            boolean z = (iH & 4) == 4;
            byte bH = (byte) this.f491a.h();
            byte bH2 = (byte) this.f491a.h();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        i();
                        int i2 = (bH & 192) >> 6;
                        int i3 = this.c;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            r();
                            q.c("Cea708Decoder", "Sequence number discontinuity. previous=" + this.c + " current=" + i2);
                        }
                        this.c = i2;
                        int i4 = bH & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        c cVar = new c(i2, i4);
                        this.j = cVar;
                        byte[] bArr = cVar.c;
                        c cVar2 = this.j;
                        int i5 = cVar2.d;
                        cVar2.d = i5 + 1;
                        bArr[i5] = bH2;
                    } else {
                        com.applovin.exoplayer2.l.a.a(i == 2);
                        c cVar3 = this.j;
                        if (cVar3 == null) {
                            q.d("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = cVar3.c;
                            c cVar4 = this.j;
                            int i6 = cVar4.d;
                            cVar4.d = i6 + 1;
                            bArr2[i6] = bH;
                            byte[] bArr3 = this.j.c;
                            c cVar5 = this.j;
                            int i7 = cVar5.d;
                            cVar5.d = i7 + 1;
                            bArr3[i7] = bH2;
                        }
                    }
                    if (this.j.d == (this.j.b * 2) - 1) {
                        i();
                    }
                }
            }
        }
    }

    private void i() {
        if (this.j == null) {
            return;
        }
        l();
        this.j = null;
    }

    private void l() {
        if (this.j.d != (this.j.b * 2) - 1) {
            q.a("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.j.b * 2) - 1) + ", but current index is " + this.j.d + " (sequence number " + this.j.f494a + ");");
        }
        this.b.a(this.j.c, this.j.d);
        int iC = this.b.c(3);
        int iC2 = this.b.c(5);
        if (iC == 7) {
            this.b.b(2);
            iC = this.b.c(6);
            if (iC < 7) {
                q.c("Cea708Decoder", "Invalid extended service number: " + iC);
            }
        }
        if (iC2 == 0) {
            if (iC != 0) {
                q.c("Cea708Decoder", "serviceNumber is non-zero (" + iC + ") when blockSize is 0");
                return;
            }
            return;
        }
        if (iC != this.e) {
            return;
        }
        boolean z = false;
        while (this.b.a() > 0) {
            int iC3 = this.b.c(8);
            if (iC3 == 16) {
                int iC4 = this.b.c(8);
                if (iC4 <= 31) {
                    c(iC4);
                } else {
                    if (iC4 <= 127) {
                        g(iC4);
                    } else if (iC4 <= 159) {
                        d(iC4);
                    } else if (iC4 <= 255) {
                        h(iC4);
                    } else {
                        q.c("Cea708Decoder", "Invalid extended command: " + iC4);
                    }
                    z = true;
                }
            } else if (iC3 <= 31) {
                a(iC3);
            } else {
                if (iC3 <= 127) {
                    e(iC3);
                } else if (iC3 <= 159) {
                    b(iC3);
                } else if (iC3 <= 255) {
                    f(iC3);
                } else {
                    q.c("Cea708Decoder", "Invalid base command: " + iC3);
                }
                z = true;
            }
        }
        if (z) {
            this.h = q();
        }
    }

    private void a(int i) {
        if (i != 0) {
            if (i == 3) {
                this.h = q();
            }
            if (i == 8) {
                this.g.f();
                return;
            }
            switch (i) {
                case 12:
                    r();
                    break;
                case 13:
                    this.g.a('\n');
                    break;
                case 14:
                    break;
                default:
                    if (i >= 17 && i <= 23) {
                        q.c("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i);
                        this.b.b(8);
                    } else if (i >= 24 && i <= 31) {
                        q.c("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i);
                        this.b.b(16);
                    } else {
                        q.c("Cea708Decoder", "Invalid C0 command: " + i);
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void b(int i) {
        int i2 = 1;
        switch (i) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i3 = i - 128;
                if (this.k != i3) {
                    this.k = i3;
                    this.g = this.f[i3];
                }
                break;
            case 136:
                while (i2 <= 8) {
                    if (this.b.e()) {
                        this.f[8 - i2].c();
                    }
                    i2++;
                }
                break;
            case 137:
                for (int i4 = 1; i4 <= 8; i4++) {
                    if (this.b.e()) {
                        this.f[8 - i4].a(true);
                    }
                }
                break;
            case 138:
                while (i2 <= 8) {
                    if (this.b.e()) {
                        this.f[8 - i2].a(false);
                    }
                    i2++;
                }
                break;
            case 139:
                for (int i5 = 1; i5 <= 8; i5++) {
                    if (this.b.e()) {
                        this.f[8 - i5].a(!r0.e());
                    }
                }
                break;
            case 140:
                while (i2 <= 8) {
                    if (this.b.e()) {
                        this.f[8 - i2].b();
                    }
                    i2++;
                }
                break;
            case 141:
                this.b.b(8);
                break;
            case 142:
                break;
            case 143:
                r();
                break;
            case 144:
                if (!this.g.d()) {
                    this.b.b(16);
                } else {
                    m();
                }
                break;
            case 145:
                if (!this.g.d()) {
                    this.b.b(24);
                } else {
                    n();
                }
                break;
            case 146:
                if (!this.g.d()) {
                    this.b.b(16);
                } else {
                    o();
                }
                break;
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                q.c("Cea708Decoder", "Invalid C1 command: " + i);
                break;
            case 151:
                if (!this.g.d()) {
                    this.b.b(32);
                } else {
                    p();
                }
                break;
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
                int i6 = i - 152;
                i(i6);
                if (this.k != i6) {
                    this.k = i6;
                    this.g = this.f[i6];
                }
                break;
        }
    }

    private void c(int i) {
        if (i <= 7) {
            return;
        }
        if (i <= 15) {
            this.b.b(8);
        } else if (i <= 23) {
            this.b.b(16);
        } else if (i <= 31) {
            this.b.b(24);
        }
    }

    private void d(int i) {
        if (i <= 135) {
            this.b.b(32);
            return;
        }
        if (i <= 143) {
            this.b.b(40);
        } else if (i <= 159) {
            this.b.b(2);
            this.b.b(this.b.c(6) * 8);
        }
    }

    private void e(int i) {
        if (i == 127) {
            this.g.a((char) 9835);
        } else {
            this.g.a((char) (i & 255));
        }
    }

    private void f(int i) {
        this.g.a((char) (i & 255));
    }

    private void g(int i) {
        if (i == 32) {
            this.g.a(TokenParser.SP);
            return;
        }
        if (i == 33) {
            this.g.a(Typography.nbsp);
            return;
        }
        if (i == 37) {
            this.g.a(Typography.ellipsis);
            return;
        }
        if (i == 42) {
            this.g.a((char) 352);
            return;
        }
        if (i == 44) {
            this.g.a((char) 338);
            return;
        }
        if (i == 63) {
            this.g.a((char) 376);
            return;
        }
        if (i == 57) {
            this.g.a(Typography.tm);
            return;
        }
        if (i == 58) {
            this.g.a((char) 353);
            return;
        }
        if (i == 60) {
            this.g.a((char) 339);
            return;
        }
        if (i != 61) {
            switch (i) {
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    this.g.a((char) 9608);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    this.g.a(Typography.leftSingleQuote);
                    break;
                case 50:
                    this.g.a(Typography.rightSingleQuote);
                    break;
                case 51:
                    this.g.a(Typography.leftDoubleQuote);
                    break;
                case 52:
                    this.g.a(Typography.rightDoubleQuote);
                    break;
                case 53:
                    this.g.a(Typography.bullet);
                    break;
                default:
                    switch (i) {
                        case 118:
                            this.g.a((char) 8539);
                            break;
                        case 119:
                            this.g.a((char) 8540);
                            break;
                        case 120:
                            this.g.a((char) 8541);
                            break;
                        case 121:
                            this.g.a((char) 8542);
                            break;
                        case 122:
                            this.g.a((char) 9474);
                            break;
                        case 123:
                            this.g.a((char) 9488);
                            break;
                        case MetadataChangeSet.CUSTOM_PROPERTY_SIZE_LIMIT_BYTES /* 124 */:
                            this.g.a((char) 9492);
                            break;
                        case 125:
                            this.g.a((char) 9472);
                            break;
                        case 126:
                            this.g.a((char) 9496);
                            break;
                        case 127:
                            this.g.a((char) 9484);
                            break;
                        default:
                            q.c("Cea708Decoder", "Invalid G2 character: " + i);
                            break;
                    }
                    break;
            }
            return;
        }
        this.g.a((char) 8480);
    }

    private void h(int i) {
        if (i == 160) {
            this.g.a((char) 13252);
            return;
        }
        q.c("Cea708Decoder", "Invalid G3 character: " + i);
        this.g.a('_');
    }

    private void m() {
        this.g.a(this.b.c(4), this.b.c(2), this.b.c(2), this.b.e(), this.b.e(), this.b.c(3), this.b.c(3));
    }

    private void n() {
        int iA = C0036b.a(this.b.c(2), this.b.c(2), this.b.c(2), this.b.c(2));
        int iA2 = C0036b.a(this.b.c(2), this.b.c(2), this.b.c(2), this.b.c(2));
        this.b.b(2);
        this.g.a(iA, iA2, C0036b.b(this.b.c(2), this.b.c(2), this.b.c(2)));
    }

    private void o() {
        this.b.b(4);
        int iC = this.b.c(4);
        this.b.b(2);
        this.g.a(iC, this.b.c(6));
    }

    private void p() {
        int iA = C0036b.a(this.b.c(2), this.b.c(2), this.b.c(2), this.b.c(2));
        int iC = this.b.c(2);
        int iB = C0036b.b(this.b.c(2), this.b.c(2), this.b.c(2));
        if (this.b.e()) {
            iC |= 4;
        }
        boolean zE = this.b.e();
        int iC2 = this.b.c(2);
        int iC3 = this.b.c(2);
        int iC4 = this.b.c(2);
        this.b.b(8);
        this.g.a(iA, iB, zE, iC, iC2, iC3, iC4);
    }

    private void i(int i) {
        C0036b c0036b = this.f[i];
        this.b.b(2);
        boolean zE = this.b.e();
        boolean zE2 = this.b.e();
        boolean zE3 = this.b.e();
        int iC = this.b.c(3);
        boolean zE4 = this.b.e();
        int iC2 = this.b.c(7);
        int iC3 = this.b.c(8);
        int iC4 = this.b.c(4);
        int iC5 = this.b.c(4);
        this.b.b(2);
        int iC6 = this.b.c(6);
        this.b.b(2);
        c0036b.a(zE, zE2, zE3, iC, zE4, iC2, iC3, iC5, iC6, iC4, this.b.c(3), this.b.c(3));
    }

    private List<com.applovin.exoplayer2.i.a> q() {
        a aVarH;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            if (!this.f[i].a() && this.f[i].e() && (aVarH = this.f[i].h()) != null) {
                arrayList.add(aVarH);
            }
        }
        Collections.sort(arrayList, a.c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.add(((a) arrayList.get(i2)).f492a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    private void r() {
        for (int i = 0; i < 8; i++) {
            this.f[i].b();
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f494a;
        public final int b;
        public final byte[] c;
        int d = 0;

        public c(int i, int i2) {
            this.f494a = i;
            this.b = i2;
            this.c = new byte[(i2 * 2) - 1];
        }
    }

    /* JADX INFO: renamed from: com.applovin.exoplayer2.i.a.b$b, reason: collision with other inner class name */
    private static final class C0036b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f493a = a(2, 2, 2, 0);
        public static final int b;
        public static final int c;
        private static final int[] d;
        private static final int[] e;
        private static final int[] f;
        private static final boolean[] g;
        private static final int[] h;
        private static final int[] i;
        private static final int[] j;
        private static final int[] k;
        private int A;
        private int B;
        private int C;
        private int D;
        private int E;
        private int F;
        private int G;
        private final List<SpannableString> l = new ArrayList();
        private final SpannableStringBuilder m = new SpannableStringBuilder();
        private boolean n;
        private boolean o;
        private int p;
        private boolean q;
        private int r;
        private int s;
        private int t;
        private int u;
        private boolean v;
        private int w;
        private int x;
        private int y;
        private int z;

        static {
            int iA = a(0, 0, 0, 0);
            b = iA;
            int iA2 = a(0, 0, 0, 3);
            c = iA2;
            d = new int[]{0, 0, 0, 0, 0, 2, 0};
            e = new int[]{0, 0, 0, 0, 0, 0, 2};
            f = new int[]{3, 3, 3, 3, 3, 3, 1};
            g = new boolean[]{false, false, false, true, true, true, false};
            h = new int[]{iA, iA2, iA, iA, iA2, iA, iA};
            i = new int[]{0, 1, 2, 3, 4, 3, 4};
            j = new int[]{0, 0, 0, 0, 0, 3, 3};
            k = new int[]{iA, iA, iA, iA, iA, iA2, iA2};
        }

        public C0036b() {
            b();
        }

        public boolean a() {
            return !d() || (this.l.isEmpty() && this.m.length() == 0);
        }

        public void b() {
            c();
            this.n = false;
            this.o = false;
            this.p = 4;
            this.q = false;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = 15;
            this.v = true;
            this.w = 0;
            this.x = 0;
            this.y = 0;
            int i2 = b;
            this.z = i2;
            this.D = f493a;
            this.F = i2;
        }

        public void c() {
            this.l.clear();
            this.m.clear();
            this.A = -1;
            this.B = -1;
            this.C = -1;
            this.E = -1;
            this.G = 0;
        }

        public boolean d() {
            return this.n;
        }

        public void a(boolean z) {
            this.o = z;
        }

        public boolean e() {
            return this.o;
        }

        public void a(boolean z, boolean z2, boolean z3, int i2, boolean z4, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.n = true;
            this.o = z;
            this.v = z2;
            this.p = i2;
            this.q = z4;
            this.r = i3;
            this.s = i4;
            this.t = i7;
            int i10 = i5 + 1;
            if (this.u != i10) {
                this.u = i10;
                while (true) {
                    if ((!z2 || this.l.size() < this.u) && this.l.size() < 15) {
                        break;
                    } else {
                        this.l.remove(0);
                    }
                }
            }
            if (i8 != 0 && this.x != i8) {
                this.x = i8;
                int i11 = i8 - 1;
                a(h[i11], c, g[i11], 0, e[i11], f[i11], d[i11]);
            }
            if (i9 == 0 || this.y == i9) {
                return;
            }
            this.y = i9;
            int i12 = i9 - 1;
            a(0, 1, 1, false, false, j[i12], i[i12]);
            a(f493a, k[i12], b);
        }

        public void a(int i2, int i3, boolean z, int i4, int i5, int i6, int i7) {
            this.z = i2;
            this.w = i7;
        }

        public void a(int i2, int i3, int i4, boolean z, boolean z2, int i5, int i6) {
            if (this.A != -1) {
                if (!z) {
                    this.m.setSpan(new StyleSpan(2), this.A, this.m.length(), 33);
                    this.A = -1;
                }
            } else if (z) {
                this.A = this.m.length();
            }
            if (this.B == -1) {
                if (z2) {
                    this.B = this.m.length();
                }
            } else {
                if (z2) {
                    return;
                }
                this.m.setSpan(new UnderlineSpan(), this.B, this.m.length(), 33);
                this.B = -1;
            }
        }

        public void a(int i2, int i3, int i4) {
            if (this.C != -1 && this.D != i2) {
                this.m.setSpan(new ForegroundColorSpan(this.D), this.C, this.m.length(), 33);
            }
            if (i2 != f493a) {
                this.C = this.m.length();
                this.D = i2;
            }
            if (this.E != -1 && this.F != i3) {
                this.m.setSpan(new BackgroundColorSpan(this.F), this.E, this.m.length(), 33);
            }
            if (i3 != b) {
                this.E = this.m.length();
                this.F = i3;
            }
        }

        public void a(int i2, int i3) {
            if (this.G != i2) {
                a('\n');
            }
            this.G = i2;
        }

        public void f() {
            int length = this.m.length();
            if (length > 0) {
                this.m.delete(length - 1, length);
            }
        }

        public void a(char c2) {
            if (c2 == '\n') {
                this.l.add(g());
                this.m.clear();
                if (this.A != -1) {
                    this.A = 0;
                }
                if (this.B != -1) {
                    this.B = 0;
                }
                if (this.C != -1) {
                    this.C = 0;
                }
                if (this.E != -1) {
                    this.E = 0;
                }
                while (true) {
                    if ((!this.v || this.l.size() < this.u) && this.l.size() < 15) {
                        return;
                    } else {
                        this.l.remove(0);
                    }
                }
            } else {
                this.m.append(c2);
            }
        }

        public SpannableString g() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.m);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.A != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.A, length, 33);
                }
                if (this.B != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.B, length, 33);
                }
                if (this.C != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.D), this.C, length, 33);
                }
                if (this.E != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.F), this.E, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public a h() {
            Layout.Alignment alignment;
            float f2;
            float f3;
            int i2;
            int i3;
            if (a()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i4 = 0; i4 < this.l.size(); i4++) {
                spannableStringBuilder.append((CharSequence) this.l.get(i4));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) g());
            int i5 = this.w;
            if (i5 == 0) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i5 == 1) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i5 != 2) {
                if (i5 != 3) {
                    throw new IllegalArgumentException("Unexpected justification value: " + this.w);
                }
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            Layout.Alignment alignment2 = alignment;
            if (this.q) {
                f2 = this.s / 99.0f;
                f3 = this.r / 99.0f;
            } else {
                f2 = this.s / 209.0f;
                f3 = this.r / 74.0f;
            }
            float f4 = (f2 * 0.9f) + 0.05f;
            float f5 = (f3 * 0.9f) + 0.05f;
            int i6 = this.t;
            if (i6 / 3 == 0) {
                i2 = 0;
            } else {
                i2 = i6 / 3 == 1 ? 1 : 2;
            }
            if (i6 % 3 == 0) {
                i3 = 0;
            } else {
                i3 = i6 % 3 == 1 ? 1 : 2;
            }
            return new a(spannableStringBuilder, alignment2, f5, 0, i2, f4, i3, -3.4028235E38f, this.z != b, this.z, this.p);
        }

        public static int b(int i2, int i3, int i4) {
            return a(i2, i3, i4, 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int a(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                com.applovin.exoplayer2.l.a.a(r4, r0, r1)
                com.applovin.exoplayer2.l.a.a(r5, r0, r1)
                com.applovin.exoplayer2.l.a.a(r6, r0, r1)
                com.applovin.exoplayer2.l.a.a(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L21
                if (r7 == r1) goto L21
                r3 = 2
                if (r7 == r3) goto L1e
                r3 = 3
                if (r7 == r3) goto L1c
                goto L21
            L1c:
                r7 = 0
                goto L23
            L1e:
                r7 = 127(0x7f, float:1.78E-43)
                goto L23
            L21:
                r7 = 255(0xff, float:3.57E-43)
            L23:
                if (r4 <= r1) goto L28
                r4 = 255(0xff, float:3.57E-43)
                goto L29
            L28:
                r4 = 0
            L29:
                if (r5 <= r1) goto L2e
                r5 = 255(0xff, float:3.57E-43)
                goto L2f
            L2e:
                r5 = 0
            L2f:
                if (r6 <= r1) goto L33
                r0 = 255(0xff, float:3.57E-43)
            L33:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.i.a.b.C0036b.a(int, int, int, int):int");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {
        private static final Comparator<a> c = new Comparator() { // from class: com.applovin.exoplayer2.i.a.b$a$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return b.a.a((b.a) obj, (b.a) obj2);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.applovin.exoplayer2.i.a f492a;
        public final int b;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int a(a aVar, a aVar2) {
            return Integer.compare(aVar2.b, aVar.b);
        }

        public a(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4, int i5) {
            a.C0033a c0033aB = new a.C0033a().a(charSequence).a(alignment).a(f, i).a(i2).a(f2).b(i3).b(f3);
            if (z) {
                c0033aB.c(i4);
            }
            this.f492a = c0033aB.e();
            this.b = i5;
        }
    }
}
