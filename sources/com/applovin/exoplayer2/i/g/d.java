package com.applovin.exoplayer2.i.g;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.applovin.exoplayer2.i.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f529a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final g f;
    public final String g;
    public final String h;
    public final d i;
    private final String[] j;
    private final HashMap<String, Integer> k;
    private final HashMap<String, Integer> l;
    private List<d> m;

    public static d a(String str) {
        return new d(null, f.a(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static d a(String str, long j, long j2, g gVar, String[] strArr, String str2, String str3, d dVar) {
        return new d(str, null, j, j2, gVar, strArr, str2, str3, dVar);
    }

    private d(String str, String str2, long j, long j2, g gVar, String[] strArr, String str3, String str4, d dVar) {
        this.f529a = str;
        this.b = str2;
        this.h = str4;
        this.f = gVar;
        this.j = strArr;
        this.c = str2 != null;
        this.d = j;
        this.e = j2;
        this.g = (String) com.applovin.exoplayer2.l.a.b(str3);
        this.i = dVar;
        this.k = new HashMap<>();
        this.l = new HashMap<>();
    }

    public boolean a(long j) {
        long j2 = this.d;
        return (j2 == -9223372036854775807L && this.e == -9223372036854775807L) || (j2 <= j && this.e == -9223372036854775807L) || ((j2 == -9223372036854775807L && j < this.e) || (j2 <= j && j < this.e));
    }

    public void a(d dVar) {
        if (this.m == null) {
            this.m = new ArrayList();
        }
        this.m.add(dVar);
    }

    public d a(int i) {
        List<d> list = this.m;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        return list.get(i);
    }

    public int a() {
        List<d> list = this.m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public long[] b() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i = 0;
        a(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        return jArr;
    }

    private void a(TreeSet<Long> treeSet, boolean z) {
        boolean zEquals = "p".equals(this.f529a);
        boolean zEquals2 = "div".equals(this.f529a);
        if (z || zEquals || (zEquals2 && this.h != null)) {
            long j = this.d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.m == null) {
            return;
        }
        for (int i = 0; i < this.m.size(); i++) {
            this.m.get(i).a(treeSet, z || zEquals);
        }
    }

    public String[] c() {
        return this.j;
    }

    public List<com.applovin.exoplayer2.i.a> a(long j, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        List<Pair<String, String>> arrayList = new ArrayList<>();
        a(j, this.g, arrayList);
        TreeMap treeMap = new TreeMap();
        a(j, false, this.g, (Map<String, a.C0033a>) treeMap);
        a(j, map, map2, this.g, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, String> pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                e eVar = (e) com.applovin.exoplayer2.l.a.b(map2.get(pair.first));
                arrayList2.add(new a.C0033a().a(bitmapDecodeByteArray).a(eVar.b).b(0).a(eVar.c, 0).a(eVar.e).b(eVar.f).c(eVar.g).d(eVar.j).e());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = (e) com.applovin.exoplayer2.l.a.b(map2.get(entry.getKey()));
            a.C0033a c0033a = (a.C0033a) entry.getValue();
            a((SpannableStringBuilder) com.applovin.exoplayer2.l.a.b(c0033a.a()));
            c0033a.a(eVar2.c, eVar2.d);
            c0033a.a(eVar2.e);
            c0033a.a(eVar2.b);
            c0033a.b(eVar2.f);
            c0033a.b(eVar2.i, eVar2.h);
            c0033a.d(eVar2.j);
            arrayList2.add(c0033a.e());
        }
        return arrayList2;
    }

    private void a(long j, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.g)) {
            str = this.g;
        }
        if (a(j) && "div".equals(this.f529a) && this.h != null) {
            list.add(new Pair<>(str, this.h));
            return;
        }
        for (int i = 0; i < a(); i++) {
            a(i).a(j, str, list);
        }
    }

    private void a(long j, boolean z, String str, Map<String, a.C0033a> map) {
        this.k.clear();
        this.l.clear();
        if ("metadata".equals(this.f529a)) {
            return;
        }
        if (!"".equals(this.g)) {
            str = this.g;
        }
        if (this.c && z) {
            a(str, map).append((CharSequence) com.applovin.exoplayer2.l.a.b(this.b));
            return;
        }
        if ("br".equals(this.f529a) && z) {
            a(str, map).append('\n');
            return;
        }
        if (a(j)) {
            for (Map.Entry<String, a.C0033a> entry : map.entrySet()) {
                this.k.put(entry.getKey(), Integer.valueOf(((CharSequence) com.applovin.exoplayer2.l.a.b(entry.getValue().a())).length()));
            }
            boolean zEquals = "p".equals(this.f529a);
            for (int i = 0; i < a(); i++) {
                a(i).a(j, z || zEquals, str, map);
            }
            if (zEquals) {
                f.a(a(str, map));
            }
            for (Map.Entry<String, a.C0033a> entry2 : map.entrySet()) {
                this.l.put(entry2.getKey(), Integer.valueOf(((CharSequence) com.applovin.exoplayer2.l.a.b(entry2.getValue().a())).length()));
            }
        }
    }

    private static SpannableStringBuilder a(String str, Map<String, a.C0033a> map) {
        if (!map.containsKey(str)) {
            a.C0033a c0033a = new a.C0033a();
            c0033a.a(new SpannableStringBuilder());
            map.put(str, c0033a);
        }
        return (SpannableStringBuilder) com.applovin.exoplayer2.l.a.b(map.get(str).a());
    }

    private void a(long j, Map<String, g> map, Map<String, e> map2, String str, Map<String, a.C0033a> map3) {
        int i;
        if (a(j)) {
            String str2 = "".equals(this.g) ? str : this.g;
            Iterator<Map.Entry<String, Integer>> it = this.l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                int iIntValue = this.k.containsKey(key) ? this.k.get(key).intValue() : 0;
                int iIntValue2 = next.getValue().intValue();
                if (iIntValue != iIntValue2) {
                    a(map, (a.C0033a) com.applovin.exoplayer2.l.a.b(map3.get(key)), iIntValue, iIntValue2, ((e) com.applovin.exoplayer2.l.a.b(map2.get(str2))).j);
                }
            }
            for (i = 0; i < a(); i++) {
                a(i).a(j, map, map2, str2, map3);
            }
        }
    }

    private void a(Map<String, g> map, a.C0033a c0033a, int i, int i2, int i3) {
        g gVarA = f.a(this.f, this.j, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c0033a.a();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            c0033a.a(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (gVarA != null) {
            f.a(spannableStringBuilder2, i, i2, gVarA, this.i, map, i3);
            if ("p".equals(this.f529a)) {
                if (gVarA.i() != Float.MAX_VALUE) {
                    c0033a.d((gVarA.i() * (-90.0f)) / 100.0f);
                }
                if (gVarA.m() != null) {
                    c0033a.a(gVarA.m());
                }
                if (gVarA.n() != null) {
                    c0033a.b(gVarA.n());
                }
            }
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder) {
        for (a aVar : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), "");
        }
        for (int i = 0; i < spannableStringBuilder.length(); i++) {
            if (spannableStringBuilder.charAt(i) == ' ') {
                int i2 = i + 1;
                int i3 = i2;
                while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                    i3++;
                }
                int i4 = i3 - i2;
                if (i4 > 0) {
                    spannableStringBuilder.delete(i, i4 + i);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
            if (spannableStringBuilder.charAt(i5) == '\n') {
                int i6 = i5 + 1;
                if (spannableStringBuilder.charAt(i6) == ' ') {
                    spannableStringBuilder.delete(i6, i5 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
            if (spannableStringBuilder.charAt(i7) == ' ') {
                int i8 = i7 + 1;
                if (spannableStringBuilder.charAt(i8) == '\n') {
                    spannableStringBuilder.delete(i7, i8);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }
}
