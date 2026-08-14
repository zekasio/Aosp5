package com.applovin.exoplayer2.g;

import com.applovin.exoplayer2.v;

/* JADX INFO: loaded from: classes.dex */
public interface c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f419a = new c() { // from class: com.applovin.exoplayer2.g.c.1
        @Override // com.applovin.exoplayer2.g.c
        public boolean a(v vVar) {
            String str = vVar.l;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        @Override // com.applovin.exoplayer2.g.c
        public b b(v vVar) {
            String str = vVar.l;
            if (str != null) {
                str.hashCode();
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new com.applovin.exoplayer2.g.a.b();
                    case "application/x-icy":
                        return new com.applovin.exoplayer2.g.d.a();
                    case "application/id3":
                        return new com.applovin.exoplayer2.g.e.g();
                    case "application/x-emsg":
                        return new com.applovin.exoplayer2.g.b.b();
                    case "application/x-scte35":
                        return new com.applovin.exoplayer2.g.g.c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    };

    boolean a(v vVar);

    b b(v vVar);
}
