package com.applovin.exoplayer2.i;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.v;

/* JADX INFO: loaded from: classes.dex */
public interface i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f535a = new i() { // from class: com.applovin.exoplayer2.i.i.1
        @Override // com.applovin.exoplayer2.i.i
        public boolean a(v vVar) {
            String str = vVar.l;
            return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // com.applovin.exoplayer2.i.i
        public g b(v vVar) {
            String str = vVar.l;
            if (str != null) {
                str.hashCode();
                byte b = -1;
                switch (str.hashCode()) {
                    case -1351681404:
                        if (str.equals("application/dvbsubs")) {
                            b = 0;
                        }
                        break;
                    case -1248334819:
                        if (str.equals("application/pgs")) {
                            b = 1;
                        }
                        break;
                    case -1026075066:
                        if (str.equals("application/x-mp4-vtt")) {
                            b = 2;
                        }
                        break;
                    case -1004728940:
                        if (str.equals("text/vtt")) {
                            b = 3;
                        }
                        break;
                    case 691401887:
                        if (str.equals("application/x-quicktime-tx3g")) {
                            b = 4;
                        }
                        break;
                    case 822864842:
                        if (str.equals("text/x-ssa")) {
                            b = 5;
                        }
                        break;
                    case 930165504:
                        if (str.equals("application/x-mp4-cea-608")) {
                            b = 6;
                        }
                        break;
                    case 1201784583:
                        if (str.equals("text/x-exoplayer-cues")) {
                            b = 7;
                        }
                        break;
                    case 1566015601:
                        if (str.equals("application/cea-608")) {
                            b = 8;
                        }
                        break;
                    case 1566016562:
                        if (str.equals("application/cea-708")) {
                            b = 9;
                        }
                        break;
                    case 1668750253:
                        if (str.equals("application/x-subrip")) {
                            b = 10;
                        }
                        break;
                    case 1693976202:
                        if (str.equals("application/ttml+xml")) {
                            b = Ascii.VT;
                        }
                        break;
                }
                switch (b) {
                    case 0:
                        return new com.applovin.exoplayer2.i.b.a(vVar.n);
                    case 1:
                        return new com.applovin.exoplayer2.i.c.a();
                    case 2:
                        return new com.applovin.exoplayer2.i.i.a();
                    case 3:
                        return new com.applovin.exoplayer2.i.i.g();
                    case 4:
                        return new com.applovin.exoplayer2.i.h.a(vVar.n);
                    case 5:
                        return new com.applovin.exoplayer2.i.e.a(vVar.n);
                    case 6:
                    case 8:
                        return new com.applovin.exoplayer2.i.a.a(str, vVar.D, 16000L);
                    case 7:
                        return new c();
                    case 9:
                        return new com.applovin.exoplayer2.i.a.b(vVar.D, vVar.n);
                    case 10:
                        return new com.applovin.exoplayer2.i.f.a();
                    case 11:
                        return new com.applovin.exoplayer2.i.g.c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    };

    boolean a(v vVar);

    g b(v vVar);
}
