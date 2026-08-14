package com.applovin.exoplayer2;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.applovin.exoplayer2.b.n;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class n implements au {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f667a;
    private boolean d;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private int b = 0;
    private long c = 5000;
    private com.applovin.exoplayer2.f.k e = com.applovin.exoplayer2.f.k.f410a;

    protected void a(Context context, Handler handler, int i, ArrayList<ar> arrayList) {
    }

    public n(Context context) {
        this.f667a = context;
    }

    @Override // com.applovin.exoplayer2.au
    public ar[] a(Handler handler, com.applovin.exoplayer2.m.n nVar, com.applovin.exoplayer2.b.g gVar, com.applovin.exoplayer2.i.l lVar, com.applovin.exoplayer2.g.e eVar) {
        ArrayList<ar> arrayList = new ArrayList<>();
        a(this.f667a, this.b, this.e, this.d, handler, nVar, this.c, arrayList);
        com.applovin.exoplayer2.b.h hVarA = a(this.f667a, this.i, this.j, this.k);
        if (hVarA != null) {
            a(this.f667a, this.b, this.e, this.d, hVarA, handler, gVar, arrayList);
        }
        a(this.f667a, lVar, handler.getLooper(), this.b, arrayList);
        a(this.f667a, eVar, handler.getLooper(), this.b, arrayList);
        a(this.f667a, this.b, arrayList);
        a(this.f667a, handler, this.b, arrayList);
        return (ar[]) arrayList.toArray(new ar[0]);
    }

    protected void a(Context context, int i, com.applovin.exoplayer2.f.k kVar, boolean z, Handler handler, com.applovin.exoplayer2.m.n nVar, long j, ArrayList<ar> arrayList) {
        int i2;
        int i3;
        com.applovin.exoplayer2.m.h hVar = new com.applovin.exoplayer2.m.h(context, kVar, j, z, handler, nVar, 50);
        hVar.a(this.f);
        hVar.b(this.g);
        hVar.c(this.h);
        arrayList.add(hVar);
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            try {
                i2 = size + 1;
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating VP9 extension", e);
            }
        } catch (ClassNotFoundException unused) {
        }
        try {
            arrayList.add(size, (ar) Class.forName("com.applovin.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(Long.TYPE, Handler.class, com.applovin.exoplayer2.m.n.class, Integer.TYPE).newInstance(Long.valueOf(j), handler, nVar, 50));
            com.applovin.exoplayer2.l.q.b("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
        } catch (ClassNotFoundException unused2) {
            size = i2;
            i2 = size;
        }
        try {
            try {
                i3 = i2 + 1;
                try {
                    arrayList.add(i2, (ar) Class.forName("com.applovin.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, com.applovin.exoplayer2.m.n.class, Integer.TYPE).newInstance(Long.valueOf(j), handler, nVar, 50));
                    com.applovin.exoplayer2.l.q.b("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
                } catch (ClassNotFoundException unused3) {
                    i2 = i3;
                    i3 = i2;
                }
            } catch (ClassNotFoundException unused4) {
            }
            try {
                arrayList.add(i3, (ar) Class.forName("com.applovin.exoplayer2.ext.ffmpeg.FfmpegVideoRenderer").getConstructor(Long.TYPE, Handler.class, com.applovin.exoplayer2.m.n.class, Integer.TYPE).newInstance(Long.valueOf(j), handler, nVar, 50));
                com.applovin.exoplayer2.l.q.b("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
            } catch (ClassNotFoundException unused5) {
            } catch (Exception e2) {
                throw new RuntimeException("Error instantiating FFmpeg extension", e2);
            }
        } catch (Exception e3) {
            throw new RuntimeException("Error instantiating AV1 extension", e3);
        }
    }

    protected void a(Context context, int i, com.applovin.exoplayer2.f.k kVar, boolean z, com.applovin.exoplayer2.b.h hVar, Handler handler, com.applovin.exoplayer2.b.g gVar, ArrayList<ar> arrayList) {
        int i2;
        int i3;
        com.applovin.exoplayer2.b.q qVar = new com.applovin.exoplayer2.b.q(context, kVar, z, handler, gVar, hVar);
        qVar.a(this.f);
        qVar.b(this.g);
        qVar.c(this.h);
        arrayList.add(qVar);
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            try {
                i2 = size + 1;
                try {
                    arrayList.add(size, (ar) Class.forName("com.applovin.exoplayer2.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, com.applovin.exoplayer2.b.g.class, com.applovin.exoplayer2.b.h.class).newInstance(handler, gVar, hVar));
                    com.applovin.exoplayer2.l.q.b("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i2;
                    i2 = size;
                }
            } catch (ClassNotFoundException unused2) {
            }
            try {
                try {
                    i3 = i2 + 1;
                    try {
                        arrayList.add(i2, (ar) Class.forName("com.applovin.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, com.applovin.exoplayer2.b.g.class, com.applovin.exoplayer2.b.h.class).newInstance(handler, gVar, hVar));
                        com.applovin.exoplayer2.l.q.b("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                    } catch (ClassNotFoundException unused3) {
                        i2 = i3;
                        i3 = i2;
                    }
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating FLAC extension", e);
                }
            } catch (ClassNotFoundException unused4) {
            }
            try {
                arrayList.add(i3, (ar) Class.forName("com.applovin.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, com.applovin.exoplayer2.b.g.class, com.applovin.exoplayer2.b.h.class).newInstance(handler, gVar, hVar));
                com.applovin.exoplayer2.l.q.b("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
            } catch (ClassNotFoundException unused5) {
            } catch (Exception e2) {
                throw new RuntimeException("Error instantiating FFmpeg extension", e2);
            }
        } catch (Exception e3) {
            throw new RuntimeException("Error instantiating Opus extension", e3);
        }
    }

    protected void a(Context context, com.applovin.exoplayer2.i.l lVar, Looper looper, int i, ArrayList<ar> arrayList) {
        arrayList.add(new com.applovin.exoplayer2.i.m(lVar, looper));
    }

    protected void a(Context context, com.applovin.exoplayer2.g.e eVar, Looper looper, int i, ArrayList<ar> arrayList) {
        arrayList.add(new com.applovin.exoplayer2.g.f(eVar, looper));
    }

    protected void a(Context context, int i, ArrayList<ar> arrayList) {
        arrayList.add(new com.applovin.exoplayer2.m.a.b());
    }

    protected com.applovin.exoplayer2.b.h a(Context context, boolean z, boolean z2, boolean z3) {
        return new com.applovin.exoplayer2.b.n(com.applovin.exoplayer2.b.e.a(context), new n.c(new com.applovin.exoplayer2.b.f[0]), z, z2, z3 ? 1 : 0);
    }
}
