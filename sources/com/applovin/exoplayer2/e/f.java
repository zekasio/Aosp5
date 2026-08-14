package com.applovin.exoplayer2.e;

import android.net.Uri;
import com.applovin.exoplayer2.e.i.ac;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f implements l {
    private static final int[] b = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};
    private static final Constructor<? extends h> c;
    private boolean d;
    private boolean e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int n;
    private int m = 1;
    private int o = 112800;

    static {
        Constructor<? extends h> constructor = null;
        try {
            if (Boolean.TRUE.equals(Class.forName("com.applovin.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                constructor = Class.forName("com.applovin.exoplayer2.ext.flac.FlacExtractor").asSubclass(h.class).getConstructor(Integer.TYPE);
            }
        } catch (ClassNotFoundException unused) {
        } catch (Exception e) {
            throw new RuntimeException("Error instantiating FLAC extension", e);
        }
        c = constructor;
    }

    @Override // com.applovin.exoplayer2.e.l
    public synchronized h[] createExtractors() {
        return a(Uri.EMPTY, new HashMap());
    }

    @Override // com.applovin.exoplayer2.e.l
    public synchronized h[] a(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        arrayList = new ArrayList(14);
        int iA = com.applovin.exoplayer2.l.l.a(map);
        if (iA != -1) {
            a(iA, arrayList);
        }
        int iA2 = com.applovin.exoplayer2.l.l.a(uri);
        if (iA2 != -1 && iA2 != iA) {
            a(iA2, arrayList);
        }
        for (int i : b) {
            if (i != iA && i != iA2) {
                a(i, arrayList);
            }
        }
        return (h[]) arrayList.toArray(new h[arrayList.size()]);
    }

    private void a(int i, List<h> list) {
        switch (i) {
            case 0:
                list.add(new com.applovin.exoplayer2.e.i.a());
                return;
            case 1:
                list.add(new com.applovin.exoplayer2.e.i.c());
                return;
            case 2:
                list.add(new com.applovin.exoplayer2.e.i.e((this.e ? 2 : 0) | this.f | (this.d ? 1 : 0)));
                return;
            case 3:
                list.add(new com.applovin.exoplayer2.e.a.a((this.e ? 2 : 0) | this.g | (this.d ? 1 : 0)));
                return;
            case 4:
                Constructor<? extends h> constructor = c;
                if (constructor != null) {
                    try {
                        list.add(constructor.newInstance(Integer.valueOf(this.h)));
                        return;
                    } catch (Exception e) {
                        throw new IllegalStateException("Unexpected error creating FLAC extractor", e);
                    }
                }
                list.add(new com.applovin.exoplayer2.e.b.b(this.h));
                return;
            case 5:
                list.add(new com.applovin.exoplayer2.e.c.b());
                return;
            case 6:
                list.add(new com.applovin.exoplayer2.e.e.d(this.i));
                return;
            case 7:
                list.add(new com.applovin.exoplayer2.e.f.d((this.e ? 2 : 0) | this.l | (this.d ? 1 : 0)));
                return;
            case 8:
                list.add(new com.applovin.exoplayer2.e.g.e(this.k));
                list.add(new com.applovin.exoplayer2.e.g.g(this.j));
                return;
            case 9:
                list.add(new com.applovin.exoplayer2.e.h.c());
                return;
            case 10:
                list.add(new com.applovin.exoplayer2.e.i.w());
                return;
            case 11:
                list.add(new ac(this.m, this.n, this.o));
                return;
            case 12:
                list.add(new com.applovin.exoplayer2.e.j.a());
                return;
            case 13:
            default:
                return;
            case 14:
                list.add(new com.applovin.exoplayer2.e.d.a());
                return;
        }
    }
}
