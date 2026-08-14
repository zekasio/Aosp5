package com.applovin.exoplayer2.e.c;

import com.applovin.exoplayer2.e.g;
import com.applovin.exoplayer2.l.y;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class c extends d {
    private long b;
    private long[] c;
    private long[] d;

    @Override // com.applovin.exoplayer2.e.c.d
    protected boolean a(y yVar) {
        return true;
    }

    public c() {
        super(new g());
        this.b = -9223372036854775807L;
        this.c = new long[0];
        this.d = new long[0];
    }

    public long a() {
        return this.b;
    }

    public long[] b() {
        return this.c;
    }

    public long[] c() {
        return this.d;
    }

    @Override // com.applovin.exoplayer2.e.c.d
    protected boolean a(y yVar, long j) {
        if (b(yVar) != 2 || !"onMetaData".equals(e(yVar)) || b(yVar) != 8) {
            return false;
        }
        HashMap<String, Object> mapH = h(yVar);
        Object obj = mapH.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.b = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapH.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.c = new long[size];
                this.d = new long[size];
                for (int i = 0; i < size; i++) {
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                        this.c[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.d[i] = ((Double) obj5).longValue();
                    } else {
                        this.c = new long[0];
                        this.d = new long[0];
                        break;
                    }
                }
            }
        }
        return false;
    }

    private static int b(y yVar) {
        return yVar.h();
    }

    private static Boolean c(y yVar) {
        return Boolean.valueOf(yVar.h() == 1);
    }

    private static Double d(y yVar) {
        return Double.valueOf(Double.longBitsToDouble(yVar.s()));
    }

    private static String e(y yVar) {
        int i = yVar.i();
        int iC = yVar.c();
        yVar.e(i);
        return new String(yVar.d(), iC, i);
    }

    private static ArrayList<Object> f(y yVar) {
        int iW = yVar.w();
        ArrayList<Object> arrayList = new ArrayList<>(iW);
        for (int i = 0; i < iW; i++) {
            Object objA = a(yVar, b(yVar));
            if (objA != null) {
                arrayList.add(objA);
            }
        }
        return arrayList;
    }

    private static HashMap<String, Object> g(y yVar) {
        HashMap<String, Object> map = new HashMap<>();
        while (true) {
            String strE = e(yVar);
            int iB = b(yVar);
            if (iB == 9) {
                return map;
            }
            Object objA = a(yVar, iB);
            if (objA != null) {
                map.put(strE, objA);
            }
        }
    }

    private static HashMap<String, Object> h(y yVar) {
        int iW = yVar.w();
        HashMap<String, Object> map = new HashMap<>(iW);
        for (int i = 0; i < iW; i++) {
            String strE = e(yVar);
            Object objA = a(yVar, b(yVar));
            if (objA != null) {
                map.put(strE, objA);
            }
        }
        return map;
    }

    private static Date i(y yVar) {
        Date date = new Date((long) d(yVar).doubleValue());
        yVar.e(2);
        return date;
    }

    private static Object a(y yVar, int i) {
        if (i == 0) {
            return d(yVar);
        }
        if (i == 1) {
            return c(yVar);
        }
        if (i == 2) {
            return e(yVar);
        }
        if (i == 3) {
            return g(yVar);
        }
        if (i == 8) {
            return h(yVar);
        }
        if (i == 10) {
            return f(yVar);
        }
        if (i != 11) {
            return null;
        }
        return i(yVar);
    }
}
