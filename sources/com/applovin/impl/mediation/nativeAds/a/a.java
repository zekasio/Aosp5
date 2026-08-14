package com.applovin.impl.mediation.nativeAds.a;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.m;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings;
import java.util.Collection;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m<Integer> f1160a = new m<>();
    private final TreeSet<Integer> b = new TreeSet<>();
    private final Map<Integer, MaxAd> c = CollectionUtils.map();
    private int d;
    private int e;

    public a(MaxAdPlacerSettings maxAdPlacerSettings) {
        a(maxAdPlacerSettings);
    }

    private void a(MaxAdPlacerSettings maxAdPlacerSettings) {
        if (!maxAdPlacerSettings.hasValidPositioning()) {
            y.i("MaxAdPlacerData", "No positioning info was provided with ad placer settings. You must set at least (1) one or more fixed positions or (2) a repeating interval greater than or equal to 2 for the ad placer to determine where to position ads.");
            return;
        }
        this.f1160a.addAll(maxAdPlacerSettings.getFixedPositions());
        if (!maxAdPlacerSettings.isRepeatingEnabled()) {
            return;
        }
        int repeatingInterval = maxAdPlacerSettings.getRepeatingInterval();
        if (this.f1160a.isEmpty()) {
            this.f1160a.add(Integer.valueOf(repeatingInterval - 1));
        }
        int iIntValue = ((Integer) this.f1160a.a()).intValue();
        while (true) {
            iIntValue += repeatingInterval;
            if (this.f1160a.size() >= maxAdPlacerSettings.getMaxAdCount()) {
                return;
            } else {
                this.f1160a.add(Integer.valueOf(iIntValue));
            }
        }
    }

    public boolean a(int i) {
        return this.f1160a.contains(Integer.valueOf(i));
    }

    public boolean b(int i) {
        return this.b.contains(Integer.valueOf(i));
    }

    public MaxAd c(int i) {
        return this.c.get(Integer.valueOf(i));
    }

    public int a() {
        int i = this.d;
        if (i != -1 && this.e != -1) {
            while (i <= this.e) {
                if (a(i) && !b(i)) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public Collection<Integer> b() {
        return new TreeSet((SortedSet) this.b);
    }

    public Collection<Integer> d(int i) {
        return new TreeSet((SortedSet) this.b.tailSet(Integer.valueOf(i), false));
    }

    public void a(int i, int i2) {
        this.d = i;
        this.e = i2;
    }

    public void a(MaxAd maxAd, int i) {
        this.c.put(Integer.valueOf(i), maxAd);
        this.b.add(Integer.valueOf(i));
    }

    public void c() {
        this.c.clear();
        this.b.clear();
    }

    public void a(Collection<Integer> collection) {
        for (Integer num : collection) {
            this.c.remove(num);
            this.b.remove(num);
        }
    }

    public int e(int i) {
        if (i == 0) {
            return 0;
        }
        return i + a(i - 1, false);
    }

    public int f(int i) {
        return i + a(i, false);
    }

    public int g(int i) {
        if (a(i)) {
            return -1;
        }
        return i - a(i, true);
    }

    public void h(int i) {
        int iC = this.f1160a.c(Integer.valueOf(i));
        for (int size = this.f1160a.size() - 1; size >= iC; size--) {
            Integer num = (Integer) this.f1160a.a(size);
            int iIntValue = num.intValue() + 1;
            c(num.intValue(), iIntValue);
            this.f1160a.a(size, Integer.valueOf(iIntValue));
        }
    }

    public void i(int i) {
        int iC = this.f1160a.c(Integer.valueOf(i));
        if (a(i)) {
            this.c.remove(Integer.valueOf(i));
            this.b.remove(Integer.valueOf(i));
            this.f1160a.b(iC);
        }
        while (iC < this.f1160a.size()) {
            Integer num = (Integer) this.f1160a.a(iC);
            int iIntValue = num.intValue() - 1;
            c(num.intValue(), iIntValue);
            this.f1160a.a(iC, Integer.valueOf(iIntValue));
            iC++;
        }
    }

    public void b(int i, int i2) {
        i(i);
        h(i2);
    }

    private void c(int i, int i2) {
        if (this.c.containsKey(Integer.valueOf(i))) {
            this.c.put(Integer.valueOf(i2), this.c.get(Integer.valueOf(i)));
            this.b.add(Integer.valueOf(i2));
            this.c.remove(Integer.valueOf(i));
            this.b.remove(Integer.valueOf(i));
        }
    }

    private int a(int i, boolean z) {
        int iD = this.f1160a.d(Integer.valueOf(i));
        if (!z) {
            int i2 = i + iD;
            while (iD < this.f1160a.size() && i2 >= ((Integer) this.f1160a.a(iD)).intValue()) {
                i2++;
                iD++;
            }
        }
        return iD;
    }
}
