package com.applovin.exoplayer2.i;

import com.applovin.exoplayer2.c.i;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends com.applovin.exoplayer2.c.j<j, k, h> implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f513a;

    protected abstract f a(byte[] bArr, int i, boolean z) throws h;

    @Override // com.applovin.exoplayer2.i.g
    public void a(long j) {
    }

    protected d(String str) {
        super(new j[2], new k[2]);
        this.f513a = str;
        a(1024);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.exoplayer2.c.j
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final j g() {
        return new j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.exoplayer2.c.j
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final k h() {
        return new e(new i.a() { // from class: com.applovin.exoplayer2.i.d$$ExternalSyntheticLambda0
            @Override // com.applovin.exoplayer2.c.i.a
            public final void releaseOutputBuffer(com.applovin.exoplayer2.c.i iVar) {
                this.f$0.a((k) iVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.exoplayer2.c.j
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final h a(Throwable th) {
        return new h("Unexpected decode error", th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.exoplayer2.c.j
    public final h a(j jVar, k kVar, boolean z) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) com.applovin.exoplayer2.l.a.b(jVar.b);
            kVar.a(jVar.d, a(byteBuffer.array(), byteBuffer.limit(), z), jVar.f);
            kVar.c(Integer.MIN_VALUE);
            return null;
        } catch (h e) {
            return e;
        }
    }
}
