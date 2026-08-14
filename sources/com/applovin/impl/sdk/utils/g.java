package com.applovin.impl.sdk.utils;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class g {
    public static int a(int i, Context context) {
        if (h.e()) {
            return context.getColor(i);
        }
        return context.getResources().getColor(i);
    }
}
