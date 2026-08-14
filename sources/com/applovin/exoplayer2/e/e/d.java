package com.applovin.exoplayer2.e.e;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import androidx.work.WorkRequest;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.d.e;
import com.applovin.exoplayer2.e.h;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.l;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.k.g;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.r;
import com.applovin.exoplayer2.l.v;
import com.applovin.exoplayer2.l.y;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.games.GamesStatusCodes;
import com.google.firebase.FirebaseError;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f282a = new l() { // from class: com.applovin.exoplayer2.e.e.d$$ExternalSyntheticLambda0
        @Override // com.applovin.exoplayer2.e.l
        public /* synthetic */ h[] a(Uri uri, Map map) {
            return createExtractors();
        }

        @Override // com.applovin.exoplayer2.e.l
        public final h[] createExtractors() {
            return d.h();
        }
    };
    private static final byte[] b = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] c = ai.c("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] d = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final UUID e = new UUID(72057594037932032L, -9223371306706625679L);
    private static final Map<String, Integer> f;
    private b A;
    private boolean B;
    private int C;
    private long D;
    private boolean E;
    private long F;
    private long G;
    private long H;
    private r I;
    private r J;
    private boolean K;
    private boolean L;
    private int M;
    private long N;
    private long O;
    private int P;
    private int Q;
    private int[] R;
    private int S;
    private int T;
    private int U;
    private int V;
    private boolean W;
    private int X;
    private int Y;
    private int Z;
    private boolean aa;
    private boolean ab;
    private boolean ac;
    private int ad;
    private byte ae;
    private boolean af;
    private j ag;
    private final com.applovin.exoplayer2.e.e.c g;
    private final f h;
    private final SparseArray<b> i;
    private final boolean j;
    private final y k;
    private final y l;
    private final y m;
    private final y n;
    private final y o;
    private final y p;
    private final y q;
    private final y r;
    private final y s;
    private final y t;
    private ByteBuffer u;
    private long v;
    private long w;
    private long x;
    private long y;
    private long z;

    protected int a(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    protected boolean b(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    @Override // com.applovin.exoplayer2.e.h
    public final void c() {
    }

    static {
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        f = Collections.unmodifiableMap(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ h[] h() {
        return new h[]{new d()};
    }

    public d() {
        this(0);
    }

    public d(int i) {
        this(new com.applovin.exoplayer2.e.e.a(), i);
    }

    d(com.applovin.exoplayer2.e.e.c cVar, int i) {
        this.w = -1L;
        this.x = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.z = -9223372036854775807L;
        this.F = -1L;
        this.G = -1L;
        this.H = -9223372036854775807L;
        this.g = cVar;
        cVar.a(new a());
        this.j = (i & 1) == 0;
        this.h = new f();
        this.i = new SparseArray<>();
        this.m = new y(4);
        this.n = new y(ByteBuffer.allocate(4).putInt(-1).array());
        this.o = new y(4);
        this.k = new y(v.f629a);
        this.l = new y(4);
        this.p = new y();
        this.q = new y();
        this.r = new y(8);
        this.s = new y();
        this.t = new y();
        this.R = new int[1];
    }

    @Override // com.applovin.exoplayer2.e.h
    public final boolean a(i iVar) throws IOException {
        return new e().a(iVar);
    }

    @Override // com.applovin.exoplayer2.e.h
    public final void a(j jVar) {
        this.ag = jVar;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(long j, long j2) {
        this.H = -9223372036854775807L;
        this.M = 0;
        this.g.a();
        this.h.a();
        f();
        for (int i = 0; i < this.i.size(); i++) {
            this.i.valueAt(i).b();
        }
    }

    @Override // com.applovin.exoplayer2.e.h
    public final int a(i iVar, u uVar) throws IOException {
        this.L = false;
        boolean zA = true;
        while (zA && !this.L) {
            zA = this.g.a(iVar);
            if (zA && a(uVar, iVar.c())) {
                return 1;
            }
        }
        if (zA) {
            return 0;
        }
        for (int i = 0; i < this.i.size(); i++) {
            b bVarValueAt = this.i.valueAt(i);
            bVarValueAt.d();
            bVarValueAt.a();
        }
        return -1;
    }

    protected void a(int i, long j, long j2) throws com.applovin.exoplayer2.ai {
        g();
        if (i == 160) {
            this.W = false;
            return;
        }
        if (i == 174) {
            this.A = new b();
            return;
        }
        if (i == 187) {
            this.K = false;
            return;
        }
        if (i == 19899) {
            this.C = -1;
            this.D = -1L;
            return;
        }
        if (i == 20533) {
            f(i).g = true;
            return;
        }
        if (i == 21968) {
            f(i).w = true;
            return;
        }
        if (i == 408125543) {
            long j3 = this.w;
            if (j3 != -1 && j3 != j) {
                throw com.applovin.exoplayer2.ai.b("Multiple Segment elements not supported", null);
            }
            this.w = j;
            this.v = j2;
            return;
        }
        if (i == 475249515) {
            this.I = new r();
            this.J = new r();
        } else if (i == 524531317 && !this.B) {
            if (this.j && this.F != -1) {
                this.E = true;
            } else {
                this.ag.a(new v.b(this.z));
                this.B = true;
            }
        }
    }

    protected void c(int i) throws com.applovin.exoplayer2.ai {
        g();
        if (i == 160) {
            if (this.M != 2) {
                return;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.Q; i3++) {
                i2 += this.R[i3];
            }
            b bVar = this.i.get(this.S);
            bVar.d();
            for (int i4 = 0; i4 < this.Q; i4++) {
                long j = ((long) ((bVar.e * i4) / 1000)) + this.N;
                int i5 = this.U;
                if (i4 == 0 && !this.W) {
                    i5 |= 1;
                }
                int i6 = this.R[i4];
                i2 -= i6;
                a(bVar, j, i5, i6, i2);
            }
            this.M = 0;
            return;
        }
        if (i == 174) {
            b bVar2 = (b) com.applovin.exoplayer2.l.a.a(this.A);
            if (bVar2.b == null) {
                throw com.applovin.exoplayer2.ai.b("CodecId is missing in TrackEntry element", null);
            }
            if (a(bVar2.b)) {
                bVar2.a(this.ag, bVar2.c);
                this.i.put(bVar2.c, bVar2);
            }
            this.A = null;
            return;
        }
        if (i == 19899) {
            int i7 = this.C;
            if (i7 != -1) {
                long j2 = this.D;
                if (j2 != -1) {
                    if (i7 == 475249515) {
                        this.F = j2;
                        return;
                    }
                    return;
                }
            }
            throw com.applovin.exoplayer2.ai.b("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i == 25152) {
            d(i);
            if (this.A.g) {
                if (this.A.i == null) {
                    throw com.applovin.exoplayer2.ai.b("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                this.A.k = new com.applovin.exoplayer2.d.e(new e.a(com.applovin.exoplayer2.h.f452a, "video/webm", this.A.i.b));
                return;
            }
            return;
        }
        if (i == 28032) {
            d(i);
            if (this.A.g && this.A.h != null) {
                throw com.applovin.exoplayer2.ai.b("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i == 357149030) {
            if (this.x == -9223372036854775807L) {
                this.x = 1000000L;
            }
            long j3 = this.y;
            if (j3 != -9223372036854775807L) {
                this.z = a(j3);
                return;
            }
            return;
        }
        if (i != 374648427) {
            if (i != 475249515) {
                return;
            }
            if (!this.B) {
                this.ag.a(a(this.I, this.J));
                this.B = true;
            }
            this.I = null;
            this.J = null;
        } else {
            if (this.i.size() == 0) {
                throw com.applovin.exoplayer2.ai.b("No valid tracks were found", null);
            }
            this.ag.a();
        }
    }

    protected void a(int i, long j) throws com.applovin.exoplayer2.ai {
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw com.applovin.exoplayer2.ai.b("ContentEncodingOrder " + j + " not supported", null);
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw com.applovin.exoplayer2.ai.b("ContentEncodingScope " + j + " not supported", null);
        }
        switch (i) {
            case 131:
                f(i).d = (int) j;
                return;
            case 136:
                f(i).U = j == 1;
                return;
            case 155:
                this.O = a(j);
                return;
            case 159:
                f(i).N = (int) j;
                return;
            case 176:
                f(i).l = (int) j;
                return;
            case 179:
                e(i);
                this.I.a(a(j));
                return;
            case 186:
                f(i).m = (int) j;
                return;
            case 215:
                f(i).c = (int) j;
                return;
            case 231:
                this.H = a(j);
                return;
            case 238:
                this.V = (int) j;
                return;
            case 241:
                if (this.K) {
                    return;
                }
                e(i);
                this.J.a(j);
                this.K = true;
                return;
            case 251:
                this.W = true;
                return;
            case 16871:
                f(i).X = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw com.applovin.exoplayer2.ai.b("ContentCompAlgo " + j + " not supported", null);
            case 17029:
                if (j < 1 || j > 2) {
                    throw com.applovin.exoplayer2.ai.b("DocTypeReadVersion " + j + " not supported", null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw com.applovin.exoplayer2.ai.b("EBMLReadVersion " + j + " not supported", null);
            case 18401:
                if (j == 5) {
                    return;
                }
                throw com.applovin.exoplayer2.ai.b("ContentEncAlgo " + j + " not supported", null);
            case 18408:
                if (j == 1) {
                    return;
                }
                throw com.applovin.exoplayer2.ai.b("AESSettingsCipherMode " + j + " not supported", null);
            case 21420:
                this.D = j + this.w;
                return;
            case 21432:
                int i2 = (int) j;
                d(i);
                if (i2 == 0) {
                    this.A.v = 0;
                    return;
                }
                if (i2 == 1) {
                    this.A.v = 2;
                    return;
                } else if (i2 == 3) {
                    this.A.v = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    this.A.v = 3;
                    return;
                }
            case 21680:
                f(i).n = (int) j;
                return;
            case 21682:
                f(i).p = (int) j;
                return;
            case 21690:
                f(i).o = (int) j;
                return;
            case 21930:
                f(i).T = j == 1;
                return;
            case 21998:
                f(i).f = (int) j;
                return;
            case 22186:
                f(i).Q = j;
                return;
            case 22203:
                f(i).R = j;
                return;
            case 25188:
                f(i).O = (int) j;
                return;
            case 30321:
                d(i);
                int i3 = (int) j;
                if (i3 == 0) {
                    this.A.q = 0;
                    return;
                }
                if (i3 == 1) {
                    this.A.q = 1;
                    return;
                } else if (i3 == 2) {
                    this.A.q = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.A.q = 3;
                    return;
                }
            case 2352003:
                f(i).e = (int) j;
                return;
            case 2807729:
                this.x = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        d(i);
                        int i4 = (int) j;
                        if (i4 == 1) {
                            this.A.z = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            this.A.z = 1;
                            return;
                        }
                    case 21946:
                        d(i);
                        int iB = com.applovin.exoplayer2.m.b.b((int) j);
                        if (iB != -1) {
                            this.A.y = iB;
                            return;
                        }
                        return;
                    case 21947:
                        d(i);
                        this.A.w = true;
                        int iA = com.applovin.exoplayer2.m.b.a((int) j);
                        if (iA != -1) {
                            this.A.x = iA;
                            return;
                        }
                        return;
                    case 21948:
                        f(i).A = (int) j;
                        return;
                    case 21949:
                        f(i).B = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    protected void a(int i, double d2) throws com.applovin.exoplayer2.ai {
        if (i == 181) {
            f(i).P = (int) d2;
        }
        if (i == 17545) {
            this.y = (long) d2;
            return;
        }
        switch (i) {
            case 21969:
                f(i).C = (float) d2;
                break;
            case 21970:
                f(i).D = (float) d2;
                break;
            case 21971:
                f(i).E = (float) d2;
                break;
            case 21972:
                f(i).F = (float) d2;
                break;
            case 21973:
                f(i).G = (float) d2;
                break;
            case 21974:
                f(i).H = (float) d2;
                break;
            case 21975:
                f(i).I = (float) d2;
                break;
            case 21976:
                f(i).J = (float) d2;
                break;
            case 21977:
                f(i).K = (float) d2;
                break;
            case 21978:
                f(i).L = (float) d2;
                break;
            default:
                switch (i) {
                    case 30323:
                        f(i).r = (float) d2;
                        break;
                    case 30324:
                        f(i).s = (float) d2;
                        break;
                    case 30325:
                        f(i).t = (float) d2;
                        break;
                }
                break;
        }
    }

    protected void a(int i, String str) throws com.applovin.exoplayer2.ai {
        if (i == 134) {
            f(i).b = str;
            return;
        }
        if (i != 17026) {
            if (i == 21358) {
                f(i).f284a = str;
                return;
            } else {
                if (i != 2274716) {
                    return;
                }
                f(i).Y = str;
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            return;
        }
        throw com.applovin.exoplayer2.ai.b("DocType " + str + " not supported", null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0233, code lost:
    
        throw com.applovin.exoplayer2.ai.b("EBML lacing sample size out of range.", null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void a(int r21, int r22, com.applovin.exoplayer2.e.i r23) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.e.d.a(int, int, com.applovin.exoplayer2.e.i):void");
    }

    protected void a(b bVar, i iVar, int i) throws IOException {
        if (bVar.X == 1685485123 || bVar.X == 1685480259) {
            bVar.M = new byte[i];
            iVar.b(bVar.M, 0, i);
        } else {
            iVar.b(i);
        }
    }

    protected void a(b bVar, int i, i iVar, int i2) throws IOException {
        if (i == 4 && "V_VP9".equals(bVar.b)) {
            this.t.a(i2);
            iVar.b(this.t.d(), 0, i2);
        } else {
            iVar.b(i2);
        }
    }

    private void d(int i) throws com.applovin.exoplayer2.ai {
        if (this.A != null) {
            return;
        }
        throw com.applovin.exoplayer2.ai.b("Element " + i + " must be in a TrackEntry", null);
    }

    private void e(int i) throws com.applovin.exoplayer2.ai {
        if (this.I == null || this.J == null) {
            throw com.applovin.exoplayer2.ai.b("Element " + i + " must be in a Cues", null);
        }
    }

    private b f(int i) throws com.applovin.exoplayer2.ai {
        d(i);
        return this.A;
    }

    private void a(b bVar, long j, int i, int i2, int i3) {
        if (bVar.S != null) {
            bVar.S.a(bVar, j, i, i2, i3);
        } else {
            if ("S_TEXT/UTF8".equals(bVar.b) || "S_TEXT/ASS".equals(bVar.b)) {
                if (this.Q > 1) {
                    q.c("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else if (this.O == -9223372036854775807L) {
                    q.c("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                } else {
                    a(bVar.b, this.O, this.q.d());
                    int iC = this.q.c();
                    while (true) {
                        if (iC >= this.q.b()) {
                            break;
                        }
                        if (this.q.d()[iC] == 0) {
                            this.q.c(iC);
                            break;
                        }
                        iC++;
                    }
                    x xVar = bVar.V;
                    y yVar = this.q;
                    xVar.a(yVar, yVar.b());
                    i2 += this.q.b();
                }
            }
            if ((268435456 & i) != 0) {
                if (this.Q > 1) {
                    i &= -268435457;
                } else {
                    int iB = this.t.b();
                    bVar.V.a(this.t, iB, 2);
                    i2 += iB;
                }
            }
            bVar.V.a(j, i, i2, i3, bVar.i);
        }
        this.L = true;
    }

    private void a(i iVar, int i) throws IOException {
        if (this.m.b() >= i) {
            return;
        }
        if (this.m.e() < i) {
            y yVar = this.m;
            yVar.b(Math.max(yVar.e() * 2, i));
        }
        iVar.b(this.m.d(), this.m.b(), i - this.m.b());
        this.m.c(i);
    }

    private int a(i iVar, b bVar, int i) throws IOException {
        int i2;
        if ("S_TEXT/UTF8".equals(bVar.b)) {
            a(iVar, b, i);
            return e();
        }
        if ("S_TEXT/ASS".equals(bVar.b)) {
            a(iVar, d, i);
            return e();
        }
        x xVar = bVar.V;
        if (!this.aa) {
            if (bVar.g) {
                this.U &= -1073741825;
                if (!this.ab) {
                    iVar.b(this.m.d(), 0, 1);
                    this.X++;
                    if ((this.m.d()[0] & ByteCompanionObject.MIN_VALUE) == 128) {
                        throw com.applovin.exoplayer2.ai.b("Extension bit is set in signal byte", null);
                    }
                    this.ae = this.m.d()[0];
                    this.ab = true;
                }
                byte b2 = this.ae;
                if ((b2 & 1) == 1) {
                    boolean z = (b2 & 2) == 2;
                    this.U |= 1073741824;
                    if (!this.af) {
                        iVar.b(this.r.d(), 0, 8);
                        this.X += 8;
                        this.af = true;
                        this.m.d()[0] = (byte) ((z ? 128 : 0) | 8);
                        this.m.d(0);
                        xVar.a(this.m, 1, 1);
                        this.Y++;
                        this.r.d(0);
                        xVar.a(this.r, 8, 1);
                        this.Y += 8;
                    }
                    if (z) {
                        if (!this.ac) {
                            iVar.b(this.m.d(), 0, 1);
                            this.X++;
                            this.m.d(0);
                            this.ad = this.m.h();
                            this.ac = true;
                        }
                        int i3 = this.ad * 4;
                        this.m.a(i3);
                        iVar.b(this.m.d(), 0, i3);
                        this.X += i3;
                        short s = (short) ((this.ad / 2) + 1);
                        int i4 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.u;
                        if (byteBuffer == null || byteBuffer.capacity() < i4) {
                            this.u = ByteBuffer.allocate(i4);
                        }
                        this.u.position(0);
                        this.u.putShort(s);
                        int i5 = 0;
                        int i6 = 0;
                        while (true) {
                            i2 = this.ad;
                            if (i5 >= i2) {
                                break;
                            }
                            int iW = this.m.w();
                            if (i5 % 2 == 0) {
                                this.u.putShort((short) (iW - i6));
                            } else {
                                this.u.putInt(iW - i6);
                            }
                            i5++;
                            i6 = iW;
                        }
                        int i7 = (i - this.X) - i6;
                        if (i2 % 2 == 1) {
                            this.u.putInt(i7);
                        } else {
                            this.u.putShort((short) i7);
                            this.u.putInt(0);
                        }
                        this.s.a(this.u.array(), i4);
                        xVar.a(this.s, i4, 1);
                        this.Y += i4;
                    }
                }
            } else if (bVar.h != null) {
                this.p.a(bVar.h, bVar.h.length);
            }
            if (bVar.f > 0) {
                this.U |= DriveFile.MODE_READ_ONLY;
                this.t.a(0);
                this.m.a(4);
                this.m.d()[0] = (byte) ((i >> 24) & 255);
                this.m.d()[1] = (byte) ((i >> 16) & 255);
                this.m.d()[2] = (byte) ((i >> 8) & 255);
                this.m.d()[3] = (byte) (i & 255);
                xVar.a(this.m, 4, 2);
                this.Y += 4;
            }
            this.aa = true;
        }
        int iB = i + this.p.b();
        if ("V_MPEG4/ISO/AVC".equals(bVar.b) || "V_MPEGH/ISO/HEVC".equals(bVar.b)) {
            byte[] bArrD = this.l.d();
            bArrD[0] = 0;
            bArrD[1] = 0;
            bArrD[2] = 0;
            int i8 = bVar.W;
            int i9 = 4 - bVar.W;
            while (this.X < iB) {
                int i10 = this.Z;
                if (i10 == 0) {
                    a(iVar, bArrD, i9, i8);
                    this.X += i8;
                    this.l.d(0);
                    this.Z = this.l.w();
                    this.k.d(0);
                    xVar.a(this.k, 4);
                    this.Y += 4;
                } else {
                    int iA = a(iVar, xVar, i10);
                    this.X += iA;
                    this.Y += iA;
                    this.Z -= iA;
                }
            }
        } else {
            if (bVar.S != null) {
                com.applovin.exoplayer2.l.a.b(this.p.b() == 0);
                bVar.S.a(iVar);
            }
            while (true) {
                int i11 = this.X;
                if (i11 >= iB) {
                    break;
                }
                int iA2 = a(iVar, xVar, iB - i11);
                this.X += iA2;
                this.Y += iA2;
            }
        }
        if ("A_VORBIS".equals(bVar.b)) {
            this.n.d(0);
            xVar.a(this.n, 4);
            this.Y += 4;
        }
        return e();
    }

    private int e() {
        int i = this.Y;
        f();
        return i;
    }

    private void f() {
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.aa = false;
        this.ab = false;
        this.ac = false;
        this.ad = 0;
        this.ae = (byte) 0;
        this.af = false;
        this.p.a(0);
    }

    private void a(i iVar, byte[] bArr, int i) throws IOException {
        int length = bArr.length + i;
        if (this.q.e() < length) {
            this.q.a(Arrays.copyOf(bArr, length + i));
        } else {
            System.arraycopy(bArr, 0, this.q.d(), 0, bArr.length);
        }
        iVar.b(this.q.d(), bArr.length, i);
        this.q.d(0);
        this.q.c(length);
    }

    private static void a(String str, long j, byte[] bArr) {
        byte[] bArrA;
        int i;
        str.hashCode();
        if (str.equals("S_TEXT/ASS")) {
            bArrA = a(j, "%01d:%02d:%02d:%02d", WorkRequest.MIN_BACKOFF_MILLIS);
            i = 21;
        } else if (str.equals("S_TEXT/UTF8")) {
            bArrA = a(j, "%02d:%02d:%02d,%03d", 1000L);
            i = 19;
        } else {
            throw new IllegalArgumentException();
        }
        System.arraycopy(bArrA, 0, bArr, i, bArrA.length);
    }

    private static byte[] a(long j, String str, long j2) {
        com.applovin.exoplayer2.l.a.a(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) (i * 3600)) * 1000000);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) (i2 * 60)) * 1000000);
        int i3 = (int) (j4 / 1000000);
        return ai.c(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2))));
    }

    private void a(i iVar, byte[] bArr, int i, int i2) throws IOException {
        int iMin = Math.min(i2, this.p.a());
        iVar.b(bArr, i + iMin, i2 - iMin);
        if (iMin > 0) {
            this.p.a(bArr, i, iMin);
        }
    }

    private int a(i iVar, x xVar, int i) throws IOException {
        int iA = this.p.a();
        if (iA > 0) {
            int iMin = Math.min(i, iA);
            xVar.a(this.p, iMin);
            return iMin;
        }
        return xVar.a((g) iVar, i, false);
    }

    private com.applovin.exoplayer2.e.v a(r rVar, r rVar2) {
        int i;
        if (this.w == -1 || this.z == -9223372036854775807L || rVar == null || rVar.a() == 0 || rVar2 == null || rVar2.a() != rVar.a()) {
            return new v.b(this.z);
        }
        int iA = rVar.a();
        int[] iArrCopyOf = new int[iA];
        long[] jArrCopyOf = new long[iA];
        long[] jArrCopyOf2 = new long[iA];
        long[] jArrCopyOf3 = new long[iA];
        int i2 = 0;
        for (int i3 = 0; i3 < iA; i3++) {
            jArrCopyOf3[i3] = rVar.a(i3);
            jArrCopyOf[i3] = this.w + rVar2.a(i3);
        }
        while (true) {
            i = iA - 1;
            if (i2 >= i) {
                break;
            }
            int i4 = i2 + 1;
            iArrCopyOf[i2] = (int) (jArrCopyOf[i4] - jArrCopyOf[i2]);
            jArrCopyOf2[i2] = jArrCopyOf3[i4] - jArrCopyOf3[i2];
            i2 = i4;
        }
        iArrCopyOf[i] = (int) ((this.w + this.v) - jArrCopyOf[i]);
        long j = this.z - jArrCopyOf3[i];
        jArrCopyOf2[i] = j;
        if (j <= 0) {
            q.c("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j);
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i);
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i);
            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i);
            jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i);
        }
        return new com.applovin.exoplayer2.e.c(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
    }

    private boolean a(u uVar, long j) {
        if (this.E) {
            this.G = j;
            uVar.f386a = this.F;
            this.E = false;
            return true;
        }
        if (this.B) {
            long j2 = this.G;
            if (j2 != -1) {
                uVar.f386a = j2;
                this.G = -1L;
                return true;
            }
        }
        return false;
    }

    private long a(long j) throws com.applovin.exoplayer2.ai {
        long j2 = this.x;
        if (j2 == -9223372036854775807L) {
            throw com.applovin.exoplayer2.ai.b("Can't scale timecode prior to timecodeScale being set.", null);
        }
        return ai.d(j, j2, 1000L);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static boolean a(String str) {
        str.hashCode();
        byte b2 = -1;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    b2 = 0;
                }
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    b2 = 1;
                }
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    b2 = 2;
                }
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    b2 = 3;
                }
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    b2 = 4;
                }
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    b2 = 5;
                }
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    b2 = 6;
                }
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    b2 = 7;
                }
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    b2 = 8;
                }
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    b2 = 9;
                }
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    b2 = 10;
                }
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    b2 = Ascii.VT;
                }
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    b2 = Ascii.FF;
                }
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    b2 = Ascii.CR;
                }
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    b2 = Ascii.SO;
                }
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    b2 = Ascii.SI;
                }
                break;
            case 82318131:
                if (str.equals("V_AV1")) {
                    b2 = Ascii.DLE;
                }
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    b2 = 17;
                }
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    b2 = Ascii.DC2;
                }
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    b2 = 19;
                }
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    b2 = Ascii.DC4;
                }
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    b2 = Ascii.NAK;
                }
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    b2 = Ascii.SYN;
                }
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    b2 = Ascii.ETB;
                }
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    b2 = Ascii.CAN;
                }
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    b2 = Ascii.EM;
                }
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    b2 = Ascii.SUB;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    b2 = Ascii.ESC;
                }
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    b2 = Ascii.FS;
                }
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    b2 = Ascii.GS;
                }
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    b2 = Ascii.RS;
                }
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    b2 = Ascii.US;
                }
                break;
        }
        switch (b2) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
                return true;
            default:
                return false;
        }
    }

    private static int[] a(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        return iArr.length >= i ? iArr : new int[Math.max(iArr.length * 2, i)];
    }

    private void g() {
        com.applovin.exoplayer2.l.a.a(this.ag);
    }

    private final class a implements com.applovin.exoplayer2.e.e.b {
        private a() {
        }

        @Override // com.applovin.exoplayer2.e.e.b
        public int a(int i) {
            return d.this.a(i);
        }

        @Override // com.applovin.exoplayer2.e.e.b
        public boolean b(int i) {
            return d.this.b(i);
        }

        @Override // com.applovin.exoplayer2.e.e.b
        public void a(int i, long j, long j2) throws com.applovin.exoplayer2.ai {
            d.this.a(i, j, j2);
        }

        @Override // com.applovin.exoplayer2.e.e.b
        public void c(int i) throws com.applovin.exoplayer2.ai {
            d.this.c(i);
        }

        @Override // com.applovin.exoplayer2.e.e.b
        public void a(int i, long j) throws com.applovin.exoplayer2.ai {
            d.this.a(i, j);
        }

        @Override // com.applovin.exoplayer2.e.e.b
        public void a(int i, double d) throws com.applovin.exoplayer2.ai {
            d.this.a(i, d);
        }

        @Override // com.applovin.exoplayer2.e.e.b
        public void a(int i, String str) throws com.applovin.exoplayer2.ai {
            d.this.a(i, str);
        }

        @Override // com.applovin.exoplayer2.e.e.b
        public void a(int i, int i2, i iVar) throws IOException {
            d.this.a(i, i2, iVar);
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f285a = new byte[10];
        private boolean b;
        private int c;
        private long d;
        private int e;
        private int f;
        private int g;

        public void a() {
            this.b = false;
            this.c = 0;
        }

        public void a(i iVar) throws IOException {
            if (this.b) {
                return;
            }
            iVar.d(this.f285a, 0, 10);
            iVar.a();
            if (com.applovin.exoplayer2.b.b.b(this.f285a) == 0) {
                return;
            }
            this.b = true;
        }

        public void a(b bVar, long j, int i, int i2, int i3) {
            if (this.b) {
                int i4 = this.c;
                int i5 = i4 + 1;
                this.c = i5;
                if (i4 == 0) {
                    this.d = j;
                    this.e = i;
                    this.f = 0;
                }
                this.f += i2;
                this.g = i3;
                if (i5 >= 16) {
                    a(bVar);
                }
            }
        }

        public void a(b bVar) {
            if (this.c > 0) {
                bVar.V.a(this.d, this.e, this.f, this.g, bVar.i);
                this.c = 0;
            }
        }
    }

    private static final class b {
        public int A;
        public int B;
        public float C;
        public float D;
        public float E;
        public float F;
        public float G;
        public float H;
        public float I;
        public float J;
        public float K;
        public float L;
        public byte[] M;
        public int N;
        public int O;
        public int P;
        public long Q;
        public long R;
        public c S;
        public boolean T;
        public boolean U;
        public x V;
        public int W;
        private int X;
        private String Y;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f284a;
        public String b;
        public int c;
        public int d;
        public int e;
        public int f;
        public boolean g;
        public byte[] h;
        public x.a i;
        public byte[] j;
        public com.applovin.exoplayer2.d.e k;
        public int l;
        public int m;
        public int n;
        public int o;
        public int p;
        public int q;
        public float r;
        public float s;
        public float t;
        public byte[] u;
        public int v;
        public boolean w;
        public int x;
        public int y;
        public int z;

        private b() {
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = 0;
            this.q = -1;
            this.r = 0.0f;
            this.s = 0.0f;
            this.t = 0.0f;
            this.u = null;
            this.v = -1;
            this.w = false;
            this.x = -1;
            this.y = -1;
            this.z = -1;
            this.A = 1000;
            this.B = 200;
            this.C = -1.0f;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = -1.0f;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = -1.0f;
            this.K = -1.0f;
            this.L = -1.0f;
            this.N = 1;
            this.O = -1;
            this.P = GamesStatusCodes.STATUS_MILESTONE_CLAIMED_PREVIOUSLY;
            this.Q = 0L;
            this.R = 0L;
            this.U = true;
            this.Y = "eng";
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:195:0x03df  */
        /* JADX WARN: Removed duplicated region for block: B:200:0x03f6  */
        /* JADX WARN: Removed duplicated region for block: B:201:0x03f8  */
        /* JADX WARN: Removed duplicated region for block: B:204:0x0405  */
        /* JADX WARN: Removed duplicated region for block: B:205:0x0417  */
        /* JADX WARN: Removed duplicated region for block: B:251:0x04ca  */
        /* JADX WARN: Removed duplicated region for block: B:269:0x051b  */
        /* JADX WARN: Removed duplicated region for block: B:4:0x0016  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(com.applovin.exoplayer2.e.j r20, int r21) throws com.applovin.exoplayer2.ai {
            /*
                Method dump skipped, instruction units count: 1578
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.e.d.b.a(com.applovin.exoplayer2.e.j, int):void");
        }

        public void a() {
            c cVar = this.S;
            if (cVar != null) {
                cVar.a(this);
            }
        }

        public void b() {
            c cVar = this.S;
            if (cVar != null) {
                cVar.a();
            }
        }

        private byte[] c() {
            if (this.C == -1.0f || this.D == -1.0f || this.E == -1.0f || this.F == -1.0f || this.G == -1.0f || this.H == -1.0f || this.I == -1.0f || this.J == -1.0f || this.K == -1.0f || this.L == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.putShort((short) ((this.C * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.D * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.E * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.F * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.G * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.H * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.I * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.J * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) (this.K + 0.5f));
            byteBufferOrder.putShort((short) (this.L + 0.5f));
            byteBufferOrder.putShort((short) this.A);
            byteBufferOrder.putShort((short) this.B);
            return bArr;
        }

        private static Pair<String, List<byte[]>> a(y yVar) throws com.applovin.exoplayer2.ai {
            try {
                yVar.e(16);
                long jP = yVar.p();
                if (jP == 1482049860) {
                    return new Pair<>("video/divx", null);
                }
                if (jP == 859189832) {
                    return new Pair<>("video/3gpp", null);
                }
                if (jP == 826496599) {
                    byte[] bArrD = yVar.d();
                    for (int iC = yVar.c() + 20; iC < bArrD.length - 4; iC++) {
                        if (bArrD[iC] == 0 && bArrD[iC + 1] == 0 && bArrD[iC + 2] == 1 && bArrD[iC + 3] == 15) {
                            return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrD, iC, bArrD.length)));
                        }
                    }
                    throw com.applovin.exoplayer2.ai.b("Failed to find FourCC VC1 initialization data", null);
                }
                q.c("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair<>("video/x-unknown", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw com.applovin.exoplayer2.ai.b("Error parsing FourCC private data", null);
            }
        }

        private static List<byte[]> a(byte[] bArr) throws com.applovin.exoplayer2.ai {
            int i;
            int i2;
            try {
                if (bArr[0] != 2) {
                    throw com.applovin.exoplayer2.ai.b("Error parsing vorbis codec private", null);
                }
                int i3 = 1;
                int i4 = 0;
                while (true) {
                    i = bArr[i3];
                    if ((i & 255) != 255) {
                        break;
                    }
                    i4 += 255;
                    i3++;
                }
                int i5 = i3 + 1;
                int i6 = i4 + (i & 255);
                int i7 = 0;
                while (true) {
                    i2 = bArr[i5];
                    if ((i2 & 255) != 255) {
                        break;
                    }
                    i7 += 255;
                    i5++;
                }
                int i8 = i5 + 1;
                int i9 = i7 + (i2 & 255);
                if (bArr[i8] != 1) {
                    throw com.applovin.exoplayer2.ai.b("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i6];
                System.arraycopy(bArr, i8, bArr2, 0, i6);
                int i10 = i8 + i6;
                if (bArr[i10] != 3) {
                    throw com.applovin.exoplayer2.ai.b("Error parsing vorbis codec private", null);
                }
                int i11 = i10 + i9;
                if (bArr[i11] != 5) {
                    throw com.applovin.exoplayer2.ai.b("Error parsing vorbis codec private", null);
                }
                byte[] bArr3 = new byte[bArr.length - i11];
                System.arraycopy(bArr, i11, bArr3, 0, bArr.length - i11);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw com.applovin.exoplayer2.ai.b("Error parsing vorbis codec private", null);
            }
        }

        private static boolean b(y yVar) throws com.applovin.exoplayer2.ai {
            try {
                int iJ = yVar.j();
                if (iJ == 1) {
                    return true;
                }
                if (iJ != 65534) {
                    return false;
                }
                yVar.d(24);
                if (yVar.s() == d.e.getMostSignificantBits()) {
                    if (yVar.s() == d.e.getLeastSignificantBits()) {
                        return true;
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw com.applovin.exoplayer2.ai.b("Error parsing MS/ACM codec private", null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            com.applovin.exoplayer2.l.a.b(this.V);
        }

        private byte[] a(String str) throws com.applovin.exoplayer2.ai {
            byte[] bArr = this.j;
            if (bArr != null) {
                return bArr;
            }
            throw com.applovin.exoplayer2.ai.b("Missing CodecPrivate for codec " + str, null);
        }
    }
}
