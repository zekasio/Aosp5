package com.google.android.material.internal;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public class ManufacturerUtils {
    private ManufacturerUtils() {
    }

    public static boolean isSamsungDevice() {
        return Build.MANUFACTURER.equalsIgnoreCase("samsung");
    }
}
