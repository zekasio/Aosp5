package com.applovin.exoplayer2.g;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.applovin.exoplayer2.as;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.v;
import com.applovin.exoplayer2.w;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f extends com.applovin.exoplayer2.e implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f438a;
    private final e b;
    private final Handler c;
    private final d d;
    private b e;
    private boolean f;
    private boolean g;
    private long h;
    private long i;
    private a j;

    @Override // com.applovin.exoplayer2.ar
    public boolean z() {
        return true;
    }

    public f(e eVar, Looper looper) {
        this(eVar, looper, c.f419a);
    }

    public f(e eVar, Looper looper, c cVar) {
        super(5);
        this.b = (e) com.applovin.exoplayer2.l.a.b(eVar);
        this.c = looper == null ? null : ai.a(looper, (Handler.Callback) this);
        this.f438a = (c) com.applovin.exoplayer2.l.a.b(cVar);
        this.d = new d();
        this.i = -9223372036854775807L;
    }

    @Override // com.applovin.exoplayer2.ar, com.applovin.exoplayer2.as
    public String y() {
        return "MetadataRenderer";
    }

    @Override // com.applovin.exoplayer2.as
    public int a(v vVar) {
        if (this.f438a.a(vVar)) {
            return as.CC.b(vVar.E == 0 ? 4 : 2);
        }
        return as.CC.b(0);
    }

    @Override // com.applovin.exoplayer2.e
    protected void a(v[] vVarArr, long j, long j2) {
        this.e = this.f438a.b(vVarArr[0]);
    }

    @Override // com.applovin.exoplayer2.e
    protected void a(long j, boolean z) {
        this.j = null;
        this.i = -9223372036854775807L;
        this.f = false;
        this.g = false;
    }

    @Override // com.applovin.exoplayer2.ar
    public void a(long j, long j2) {
        boolean zC = true;
        while (zC) {
            B();
            zC = c(j);
        }
    }

    private void a(a aVar, List<a.InterfaceC0030a> list) {
        for (int i = 0; i < aVar.a(); i++) {
            v vVarA = aVar.a(i).a();
            if (vVarA != null && this.f438a.a(vVarA)) {
                b bVarB = this.f438a.b(vVarA);
                byte[] bArr = (byte[]) com.applovin.exoplayer2.l.a.b(aVar.a(i).b());
                this.d.a();
                this.d.f(bArr.length);
                ((ByteBuffer) ai.a(this.d.b)).put(bArr);
                this.d.h();
                a aVarA = bVarB.a(this.d);
                if (aVarA != null) {
                    a(aVarA, list);
                }
            } else {
                list.add(aVar.a(i));
            }
        }
    }

    @Override // com.applovin.exoplayer2.e
    protected void r() {
        this.j = null;
        this.i = -9223372036854775807L;
        this.e = null;
    }

    @Override // com.applovin.exoplayer2.ar
    public boolean A() {
        return this.g;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            b((a) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    private void B() {
        if (this.f || this.j != null) {
            return;
        }
        this.d.a();
        w wVarT = t();
        int iA = a(wVarT, this.d, 0);
        if (iA != -4) {
            if (iA == -5) {
                this.h = ((v) com.applovin.exoplayer2.l.a.b(wVarT.b)).p;
                return;
            }
            return;
        }
        if (this.d.c()) {
            this.f = true;
            return;
        }
        this.d.f = this.h;
        this.d.h();
        a aVarA = ((b) ai.a(this.e)).a(this.d);
        if (aVarA != null) {
            ArrayList arrayList = new ArrayList(aVarA.a());
            a(aVarA, arrayList);
            if (arrayList.isEmpty()) {
                return;
            }
            this.j = new a(arrayList);
            this.i = this.d.d;
        }
    }

    private boolean c(long j) {
        boolean z;
        a aVar = this.j;
        if (aVar == null || this.i > j) {
            z = false;
        } else {
            a(aVar);
            this.j = null;
            this.i = -9223372036854775807L;
            z = true;
        }
        if (this.f && this.j == null) {
            this.g = true;
        }
        return z;
    }

    private void a(a aVar) {
        Handler handler = this.c;
        if (handler != null) {
            handler.obtainMessage(0, aVar).sendToTarget();
        } else {
            b(aVar);
        }
    }

    private void b(a aVar) {
        this.b.a(aVar);
    }
}
