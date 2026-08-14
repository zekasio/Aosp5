package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgtu extends IllegalArgumentException {
    zzgtu(int i, int i2) {
        super("Unpaired surrogate at index " + i + " of " + i2);
    }
}
