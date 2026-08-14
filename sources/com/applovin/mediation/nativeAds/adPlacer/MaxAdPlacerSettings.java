package com.applovin.mediation.nativeAds.adPlacer;

import com.applovin.impl.sdk.y;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public class MaxAdPlacerSettings {
    public static final int MIN_REPEATING_INTERVAL = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1539a;
    private final Set<Integer> b = new TreeSet();
    private int c = 0;
    private int d = 256;
    private int e = 4;

    public MaxAdPlacerSettings(String str) {
        this.f1539a = str;
    }

    public String getAdUnitId() {
        return this.f1539a;
    }

    public Set<Integer> getFixedPositions() {
        return this.b;
    }

    public int getRepeatingInterval() {
        return this.c;
    }

    public int getMaxAdCount() {
        return this.d;
    }

    public void setMaxAdCount(int i) {
        this.d = i;
    }

    public int getMaxPreloadedAdCount() {
        return this.e;
    }

    public void setMaxPreloadedAdCount(int i) {
        this.e = i;
    }

    public void addFixedPosition(int i) {
        this.b.add(Integer.valueOf(i));
    }

    public void resetFixedPositions() {
        this.b.clear();
    }

    public void setRepeatingInterval(int i) {
        if (i >= 2) {
            this.c = i;
            y.f("MaxAdPlacerSettings", "Repeating interval set to " + i);
            return;
        }
        this.c = 0;
        y.h("MaxAdPlacerSettings", "Repeating interval has been disabled, since it has been set to " + i + ", which is less than minimum value of 2");
    }

    public boolean isRepeatingEnabled() {
        return this.c >= 2;
    }

    public boolean hasValidPositioning() {
        return !this.b.isEmpty() || isRepeatingEnabled();
    }

    public String toString() {
        return "MaxAdPlacerSettings{adUnitId='" + this.f1539a + "', fixedPositions=" + this.b + ", repeatingInterval=" + this.c + ", maxAdCount=" + this.d + ", maxPreloadedAdCount=" + this.e + '}';
    }
}
