package com.applovin.exoplayer2.ui;

import android.graphics.Color;
import com.applovin.exoplayer2.l.ai;

/* JADX INFO: loaded from: classes.dex */
final class e {
    public static String a(int i) {
        Integer numValueOf = Integer.valueOf(Color.red(i));
        Integer numValueOf2 = Integer.valueOf(Color.green(i));
        Integer numValueOf3 = Integer.valueOf(Color.blue(i));
        double dAlpha = Color.alpha(i);
        Double.isNaN(dAlpha);
        return ai.a("rgba(%d,%d,%d,%.3f)", numValueOf, numValueOf2, numValueOf3, Double.valueOf(dAlpha / 255.0d));
    }

    public static String a(String str) {
        return "." + str + ",." + str + " *";
    }
}
